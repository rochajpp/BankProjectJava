import java.util.List;
import java.util.ArrayList;

public class User {

    private String name;
    private String cpf;
    private int age;
    private List<Account> accounts = new ArrayList<>();
    private List<Bank> banks = new ArrayList<>();


    public User(String name, String cpf, int age){
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

    public User(){

    }


    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }


    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String newCpf){
        this.cpf = newCpf;
    }


    public int getAge(){
        return this.age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }


    public List<Account> getAccounts(){
        return this.accounts;
    }


    public List<Bank> getBanks(){
        return this.banks;
    }
    
}
