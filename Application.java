import javax.swing.JOptionPane;

public class Application{
    // Instanciando BD
    public static DataBase bd = new DataBase();

    public static boolean registerUser(String name, String cpf, int age){
    
        if(bd.containsCpfInUsers(cpf)){
            return false;
        }   

        User newUser = new User(name, cpf, age);

        bd.users.add(newUser);
        return true;
    }

    public static void start(){
        while(true){
            Object[] options = {"Entrar", "Registrar"};
            int enterOrRegister = JOptionPane.showOptionDialog(
                null, 
                "Bem vindo so seu gerenciador de contas bancárias",
                "Selecione uma das opções abaixo",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]); 

            //Entrar = 0
            //Registrar = 1;

            if(enterOrRegister == 0 ){
                System.out.println("Entrar");


            } else if(enterOrRegister == 1){
                String nameUser;
                String cpfUser = "";
                String ageUser = "";
                int age = 0;

                while(true){
                    nameUser = JOptionPane.showInputDialog(null, "Informe seu nome:");      
                    if(nameUser == null){  
                        cpfUser = null;
                        break;
                    }
                    if(nameUser.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Preencha o campo com o seu nome");
                        continue;
                    }
                    try{
                        Integer.parseInt(nameUser);
                        JOptionPane.showMessageDialog(null, "Nome inválido");
                    } catch(Exception e){
                        break;
                    }
                }

                while(true){
                    if(cpfUser == null){
                        ageUser = null;
                        break;
                    }
                    cpfUser = JOptionPane.showInputDialog(null, "Informe o seu CPF:");
                    if(cpfUser == null){
                        ageUser = null;
                        break;
                    }
                    if(cpfUser.length() != 11){
                        JOptionPane.showMessageDialog(null, "CPF inválido");
                        continue;
                    }
                    
                    try{
                        Long.parseLong(cpfUser);
                        cpfUser.toString();
                        break;
                        
                    } catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                        continue;
                    }
                }

                while(true){
                    if(ageUser == null){
                        break;
                    }
                    ageUser = JOptionPane.showInputDialog(null, "Insira sua idade:");
                    if(ageUser == null){
                        break;
                    }
                    if(ageUser.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Preencha o campo com sua idade");
                    }
                    try{
                        age = Integer.parseInt(ageUser);
                        if(age < 18){
                            JOptionPane.showMessageDialog(null, "Idade mínima: 18 anos");
                            continue;
                        }
                        break;
                       
                    } catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Idade inválida");
                        continue;
                    }                
                }

                if(nameUser == null || cpfUser == null || ageUser == null){
                    continue;
                }
            
                if(!registerUser(nameUser, cpfUser, age)){                                  
                    JOptionPane.showMessageDialog(null, "CPF já cadastrado");
                }

                continue;

            } else{
                break;
            }
        } 
    }
    public static void main(String[] args){
        for(int i = 0; i < bd.users.size(); i++){
            System.out.println(bd.users.toString());
        }

        start();
        for(int i = 0; i < bd.users.size(); i++){
            System.out.println(bd.users.toString());
        }
           
    }

}