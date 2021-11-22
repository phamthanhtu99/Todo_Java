package Dao.Impl;

import Dao.TodoDao;
import Model.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoDaoImpl implements TodoDao {
    @Override
    public List<Todo> FindAll() {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(1,"Làm java",true));
        todos.add(new Todo(1,"Làm php",true));
        todos.add(new Todo(1,"Làm php",true));

        return todos;
    }
}
