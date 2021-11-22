package Model;

public class Todo {
    private int id;
    private String conten ;
    private boolean status;

    public Todo(int id, String conten, boolean status) {
        this.id = id;
        this.conten = conten;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
