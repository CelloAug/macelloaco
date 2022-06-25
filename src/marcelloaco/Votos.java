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
public class Votos {
    
    /**
     * @return the idVotos
     */
    public int getIdVotos() {
        return idVotos;
    }

    /**
     * @param idVotos the idVotos to set
     */
    public void setIdVotos(int idVotos) {
        this.idVotos = idVotos;
    }

    /**
     * @return the id_candidato
     */
    public int getId_candidato() {
        return id_candidato;
    }

    /**
     * @param id_candidato the id_candidato to set
     */
    public void setId_candidato(int id_candidato) {
        this.id_candidato = id_candidato;
    }

    /**
     * @return the id_eleitor
     */
    public int getId_eleitor() {
        return id_eleitor;
    }

    /**
     * @param id_eleitor the id_eleitor to set
     */
    public void setId_eleitor(int id_eleitor) {
        this.id_eleitor = id_eleitor;
    }
    private int idVotos;
    private int id_candidato;
    private int id_eleitor;
}
