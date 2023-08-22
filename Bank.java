import java.util.List;
import java.util.ArrayList;

public class Bank {
    private int code;
    private String name;
    private List<User> users = new ArrayList<>();


    public Bank(int code, String name){
        this.code = code;
        this.name = name;
    }


    public int getCode(){
        return this.code;
    }
    public void setCode(int newCode){
        this.code = newCode;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public List<User> getUsers(){
        return this.users;
    }

}
