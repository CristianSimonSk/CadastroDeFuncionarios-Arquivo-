package dados;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;


public class Funcionario {
    
    private int codigo;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private double salario;

    public Funcionario() {
    }
  
    public Funcionario(int codigo, String nome, String cpf, String dataNascimento, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }  
    
    public void salvar(DataOutputStream out) throws IOException{
        out.writeInt(codigo);
        out.writeUTF(nome);
        out.writeUTF(cpf);
        out.writeUTF(dataNascimento);
        out.writeDouble(salario);
        System.out.println("Gravação de funcionário " + codigo + " realizada com sucesso.");              
    }
    
    public void ler(DataInputStream in) throws IOException{
        codigo = in.readInt();
        nome = in.readUTF();
        cpf = in.readUTF();
        dataNascimento = in.readUTF();
        salario = in.readDouble();            
    }
    
    public void imprime(){
        System.out.println("---------------------------");
        System.out.println(this.codigo);
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.dataNascimento);
        System.out.println(this.salario);
    }

    void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }     
}
