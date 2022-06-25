/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcelloaco;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Marcello
 */
public class CandidatoDAO extends Conexao {
    
     public String cadastrarCandidato (Candidato candidato)

{

	try

		{

			String sentenca;
			sentenca = " INSERT INTO Candidato VALUES (NULL,'"+
			candidato.getNome() + "','" + candidato.getNumero()+ "','" 
			+ candidato.getPartido()+ "','" + candidato.getCargo()+ "')'" ;
			return this.atualizarBanco(sentenca);
			


		}

		catch (Exception e)

		{
			return e.getMessage();
			}

}
     
     public String excluirCandidato ( String idCandidato)
{

		try {
                String sentenca;
		sentenca = "DELETE FROM candidato WHERE idCandidato =" + idCandidato;
		return this.atualizarBanco (sentenca);		




}

catch (Exception e) {
		return e.getMessage();
	
}
}        
        

public ArrayList listarCandidatos()

{

try

{

		ArrayList candidatos = new ArrayList();
		String sentenca = "SELECT * FROM Candidato ORDER BY NOME";
		ResultSet rs = this.getResultSet (sentenca);
		
		while (rs.next())

		{

			Candidato candidato = new Candidato();
			candidato.setIdCandidato(rs.getInt("IDCANDIDATO"));
			candidato.setNome(rs.getString("NOME"));
			candidato.setNumero(rs.getInt("NUMERO"));
			candidato.setPartido(rs.getString("PARTIDO"));
			candidato.setCargo(rs.getString("CARGO"));
			candidatos.add(candidato);

			}

return candidatos;
}
catch (Exception e)

	{
		System.out.println(e.getMessage());
		return null;
		}
		

}		
			

}


    

