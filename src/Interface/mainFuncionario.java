package Interface;

import dados.Funcionario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class mainFuncionario {
    
    public static List<Funcionario> arrayFuncionarios = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        
        Funcionario funcionario;
        
        funcionario = new Funcionario(1,"Yurizao","123.456.789-10","01/01/2001",58862);
        arrayFuncionarios.add(funcionario);
        
        funcionario = new Funcionario(3,"Yurizao2","123.456.789-10","01/01/2001",58862);
        arrayFuncionarios.add(funcionario);        
    }
}

