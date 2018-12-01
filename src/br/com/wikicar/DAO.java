package br.com.wikicar;

import java.sql.*;

public class DAO {		
	private String url; 
	private String user;
	private String pwd;
	public DAO(String url, String user, String pwd) {
		this.url = url;
		this.user = user;
		this.pwd = pwd;
		conn(); 
	}
	public void conn(){
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Conexão estabelecida!");
			PreparedStatement pstm = conn.prepareStatement("select * from teste");
			ResultSet rs = pstm.executeQuery();
			
			while (rs.next()){
				System.out.println(rs.getString("idteste")+" "+rs.getString("nometeste"));
			}
		}catch(Exception ex){
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		DAO dao = new DAO("jdbc:postgresql://127.0.0.1/wikicar","postgres","met1234");
	}
	
}
