import Model.Todo;
import Service.Impl.TodoServiceImpl;
import Service.TodoService;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
         TodoService todoService =new TodoServiceImpl();
        todoService.FindAll();
    }
}
