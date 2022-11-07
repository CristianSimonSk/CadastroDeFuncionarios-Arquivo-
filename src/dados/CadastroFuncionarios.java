
package dados;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static Interface.mainFuncionario.arrayFuncionarios;

public class CadastroFuncionarios {
    
    public void abrirArquivoEscrita() throws FileNotFoundException, IOException{
        
        DataOutputStream out = null;
        
        try{
            System.out.println("Abrindo o arquivo funcionario.txt");
            
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("funcionario.txt", true)));
            System.out.println("Gravando dados no arquivo funcionario.txt");
            
            arrayFuncionarios.get(0).salvar(out);
            arrayFuncionarios.get(1).salvar(out);
            
        } finally{
            System.out.println("Fechando o arquivo funcionario.txt");
            if(out != null){
                out.close();
            }
        }
    }
    
    public void salvarArquivo() throws FileNotFoundException, IOException{
        
        
    }
    
    public void abrirArquivoLeitura() throws FileNotFoundException, IOException{
        
        DataInputStream in = null;
        Funcionario funcionario = null;
        try {
            System.out.println("Abrindo o arqiovo funcionario.txt para a leitura...");
            in = new DataInputStream(new BufferedInputStream(new FileInputStream("funcionario.txt")));           
            while(true){
                funcionario.ler(in);
                funcionario.imprime();
                arrayFuncionarios.add(funcionario);
                System.out.println();
            }
        } catch (EOFException e) {
            System.out.println("Já leu todos os registros");
        } finally{
            System.out.println("Fechando arquivo funcionario.txt");
            
            if(in != null){
                in.close();
            }
        } 
    }

    private Funcionario ler(DataInputStream in) throws IOException{
        codigo = in.readInt();
        nome = in.readUTF();
        cpf = in.readUTF();
        dataNascimento = in.readUTF();
        salario = in.readDouble();  
    }
