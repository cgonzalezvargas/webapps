package webapp.todo;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import webapp.login.LoginService;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SessionAttributes("username")
public class TodoController 
{
	/*
	 * Set the login service with dependency injection
	 * Use auto wiring
	 */
	@Autowired
	private TodoService service;
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	
	public String listsTodos(ModelMap model) 
	{
		
		model.addAttribute("todos", service.retrieveTodos("Chris"));
		return "list-todos";
	}
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	
	public String showTodoPage(ModelMap model) 
	{
		model.addAttribute("todo", new Todo());
		return "todo";
	}
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) 
	{
		if(result.hasErrors()) 
			return "todo";
		
		service.addTodo((String) model.get("username"),todo.getDesc(),new Date(),false);
		model.clear();
		return "redirect:list-todos";
	}
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	
	public String deleteTodo(ModelMap model, @RequestParam int id) 
	{
		service.deleteTodo(id);
		model.clear();
		return "redirect:list-todos";
	}

}
