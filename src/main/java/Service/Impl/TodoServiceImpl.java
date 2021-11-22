package Service.Impl;

import Dao.Impl.TodoDaoImpl;
import Dao.TodoDao;
import Model.Todo;
import Service.TodoService;

import java.util.List;

public class TodoServiceImpl implements TodoService {
    private TodoDao todoDao =new TodoDaoImpl();
    @Override
    public List<Todo> FindAll() {
        return todoDao.FindAll();
    }
}
