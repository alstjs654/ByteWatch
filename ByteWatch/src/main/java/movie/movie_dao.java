package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import drama.drama;

public class movie_dao {
	
	protected Connection conn=null;
	protected PreparedStatement pt=null;
	protected ResultSet rs=null;
	
	
	public ArrayList<movie> selectAB(String s){
		
		try {
			conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:watch");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패 또는 DB 연결 실패");
		}		
		ArrayList<movie> list = new ArrayList<>();
		String sql = "select * from movie "+s;
		try {
			pt=conn.prepareStatement(sql);
			rs = pt.executeQuery();
			for(int i=0; i<6 && rs.next(); i++) {
				
				
				
				movie data = new movie(
			rs.getInt(1),rs.getString(5),rs.getString(8)
						);
				list.add(data);
			}
			rs.close();
			pt.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("영화 조회 실패");
		}
		return list;	
	}

	public ArrayList<movie> selectA(){
		
		try {
			conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:watch");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패 또는 DB 연결 실패");
		}		
		ArrayList<movie> list = new ArrayList<>();
		String sql = "select * from movie ";
		try {
			pt=conn.prepareStatement(sql);
			rs = pt.executeQuery();
			for(int i=0; i<18 && rs.next(); i++) {
				
				movie data = new movie(
			rs.getInt(1),rs.getString(5),rs.getString(8)
						);
				list.add(data);
			}
			rs.close();
			pt.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("영화 조회 실패");
		}
		return list;	
	}
	public movie select(int num) {
		// --------------------------------------------------------------------------
		try {
			conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:watch");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패 또는 DB 연결 실패");
		}		
		
		
		String sql="select * from movie where movie_num=?";
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setInt(1, num);
			rs = pt.executeQuery();
			if(rs.next()) {
				movie data = new movie(
rs.getInt(1), rs.getString(2),rs.getString(3),
rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),
rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)
			);
				rs.close();
				pt.close();
				conn.close();
				return data;
			}
		}catch(SQLException e) {
			
		}
		return null;

	}

}
