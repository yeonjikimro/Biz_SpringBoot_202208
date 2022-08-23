package com.callor.todo.controller;


import com.callor.todo.model.TodoVO;
import com.callor.todo.service.impl.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Slf4j
@Controller
public class HomeController {



    private final TodoService todoService;

    public HomeController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value="",method= RequestMethod.GET)
    public String home(Model model, TodoVO todoVO) {

        List<TodoVO> todolist = todoService.selectAll();

        model.addAttribute("todo", todolist);

        return "html/home";
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public String home(TodoVO todoVO) {

        todoService.insert(todoVO);

        return "redirect:/html/home";
    }

}