/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.ArrayList;

/**
 *
 * @author Eu
 */
public class Departamento {
    private int Codigo;
    private String Nome;
    private String Inscricao;
    private String Contato;
    ArrayList<Cadastro> LISTAFUNC;
    
    public Departamento(){
        LISTAFUNC = new ArrayList();
    }
    
    public Departamento(int Codigo, String Nome, String Inscricao, String Contato){
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Inscricao = Inscricao;
        this.Contato = Contato;
        LISTAFUNC = new ArrayList();
    }
    
    public int getCodigo(){
        return Codigo;
    }
    
    public void setCodigo(int Codigo){
        this.Codigo = Codigo;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getInscricao() {
        return Inscricao;
    }

    public void setInscricao(String Inscricao) {
        this.Inscricao = Inscricao;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String Contato) {
        this.Contato = Contato;
    }
    

    public ArrayList<Cadastro> getLISTAFUNC() {
        return LISTAFUNC;
    }

    public void setLISTAFUNC(ArrayList<Cadastro> LISTAFUNC) {
        this.LISTAFUNC = LISTAFUNC;
    }
    
    
    
    
    
    
    
    
    
    
    
}
    
