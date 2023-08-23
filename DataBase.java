import java.util.ArrayList;
import java.util.List;

public class DataBase {
    //=================== Simulando banco de dados =======================

    public Bank LuminaBank = new Bank(2356, "LuminaBank");
    public Bank NovaFin = new Bank(7891, "NovaFin");
    public Bank CrestTrust = new Bank(4123, "CrestTrust");
    public Bank HorizonUnion = new Bank(6578, "HorizonUnion");

    public List<User> users = new ArrayList<>();

    //====================================================================

    public boolean containsCpfInUsers(String cpf){
        boolean existingCpf = false;
        
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getCpf().equals(cpf)){
                existingCpf = true;
                break;
            }
        }

        return existingCpf;
    }

    
}
