/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcelloaco;

/**
 *
 * @author Marcello
 */
public class Eleitor {
    
    /**
     * @return the idEleitor
     */
    public int getIdEleitor() {
        return idEleitor;
    }

    /**
     * @param idEleitor the idEleitor to set
     */
    public void setIdEleitor(int idEleitor) {
        this.idEleitor = idEleitor;
    }

    /**
     * @return the titulo_eleitor
     */
    public int getTitulo_eleitor() {
        return titulo_eleitor;
    }

    /**
     * @param titulo_eleitor the titulo_eleitor to set
     */
    public void setTitulo_eleitor(int titulo_eleitor) {
        this.titulo_eleitor = titulo_eleitor;
    }

    /**
     * @return the nomeEleitor
     */
    public String getNomeEleitor() {
        return nomeEleitor;
    }

    /**
     * @param nomeEleitor the nomeEleitor to set
     */
    public void setNomeEleitor(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    private int idEleitor;
    private int titulo_eleitor;
    private String nomeEleitor;
    private String cpf;
    
}
