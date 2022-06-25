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
public class EleitorDAO extends Conexao {
    
    public String cadastrarCandidato (Eleitor eleitor)

{

	try

		{

			String sentenca;
			sentenca = " INSERT INTO Eleitor VALUES (NULL,'"+
			eleitor.getNomeEleitor() + "','" + eleitor.getTitulo_eleitor()+ "','" 
			+ eleitor.getCpf()+  "')'" ;
			return this.atualizarBanco(sentenca);
			


		}

		catch (Exception e)

		{
			return e.getMessage();
			}
}

        public String excluirEleitor ( String idEleitor)
{

		try {
                String sentenca;
		sentenca = "DELETE FROM eleitor WHERE idEleitor =" + idEleitor;
		return this.atualizarBanco (sentenca);		




}

catch (Exception e) {
		return e.getMessage();
	
}

}

public ArrayList listarEleitores()

{

try

{

		ArrayList eleitores = new ArrayList();
		String sentenca = "SELECT * FROM ELEITOR ORDER BY NOME";
		ResultSet rs = this.getResultSet (sentenca);
		
		while (rs.next())

		{

			Eleitor eleitor = new Eleitor();
			eleitor.setIdEleitor(rs.getInt("IDELEITOR"));
			eleitor.setNomeEleitor(rs.getString("NOME"));
			eleitor.setTitulo_eleitor(rs.getInt("TITULO_ELEITOR"));
			eleitor.setCpf(rs.getString("CPF"));
			
			eleitores.add(eleitor);

			}

return eleitores;
}
catch (Exception e)

	{
		System.out.println(e.getMessage());
		return null;
		}
		

}

}





