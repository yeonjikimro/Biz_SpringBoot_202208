package com.callor.todo.service.impl;


import com.callor.todo.model.TodoVO;

import java.util.List;

public interface TodoService {
    public List<TodoVO> selectAll();
    public TodoVO fineById(Long seq);
    public TodoVO insert(TodoVO todoVO);
    public TodoVO update(TodoVO todoVO);
    public TodoVO delete(Long seq);
}
