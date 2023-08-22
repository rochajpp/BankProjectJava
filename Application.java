import javax.swing.JOptionPane;

public class Application{
    // Instanciando BD
    public static DataBase bd = new DataBase();

    public static void registerUser(String name, String cpf, int age){
        
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
                }
            } else{
                break;
            }
        } 
    }
    public static void main(String[] args){
        
        start();
        
    }

}