package com.callor.todo.service.impl;

import com.callor.todo.model.TodoVO;
import com.callor.todo.persistance.TodoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImplV1 implements TodoService{


    private final TodoDao todoDao;

    public TodoServiceImplV1(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    @Override
    public List<TodoVO> selectAll() {

        List<TodoVO> todoList = todoDao.findAll();

        return todoList;
    }

    @Override
    public TodoVO fineById(Long seq) {

        Optional<TodoVO> toBookVO = todoDao.findById(seq);

        TodoVO todoVO = toBookVO.orElse(new TodoVO());

        return todoVO;
    }

    @Override
    public TodoVO insert(TodoVO todoVO) {

        TodoVO result = todoDao.save(todoVO);
        return result;
    }

    @Override
    public TodoVO update(TodoVO todoVO) {

        return null;
    }

    @Override
    public TodoVO delete(Long seq) {

        return null;
    }
}
