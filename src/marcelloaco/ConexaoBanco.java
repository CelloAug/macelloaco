/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcelloaco;

import java.sql.Connection;
import java.sql.Statement;

public class ConexaoBanco {

    private static void getInstanceConn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public ConexaoBanco(){
        }

			private static Connection conn = null;
			private static Statement db_statement = null;


public static Connection getInstanceConn (Statement db_Statement)

		{ 


			try
			{   		

				if (conn == null ||conn.isClosed())
					{

					conn = null;
					Conexao conexao = new Conexao ();
					conn = conexao.getConexao();
					conn.setAutoCommit(true);
					db_Statement= conn.createStatement();
					}
			}

			catch (Exception e)
			{

				System.out.println("0. Erro ao conectar com o banco. Erro: "+ e.getMessage());

			}

		return conn;
                }

public static statement getInstanceStatement(statement db_stetement) throws Exception

{

	if (db_statement== null)

		{
			getInstanceConn();
			}


		return db_stetement;
}
public static void closeInstanceConn() throws Exception

{
			if (conn !=null)
			if (!conn.isClosed())
			conn.close();

			conn = null;
			db_statement = null;
}

    Statement getInstanceStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private static class statement {

        public statement() {
        }
    }

}
