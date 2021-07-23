package drama;

import java.sql.SQLException;
import java.util.ArrayList;

import main.MainDAO;

public class drama_dao extends MainDAO{
	public ArrayList<drama>index_select(){
	ArrayList<drama> list = new ArrayList<>();
	
	String sql = "select * from drama order by w_cnt desc";
	System.out.println("bbb");
	try {
		ps=conn.prepareStatement(sql);
		rs = ps.executeQuery();
		for(int i=0; i<18 && rs.next(); i++) {
			
			drama data = new drama(
		rs.getInt(1),rs.getString(2),rs.getString(5),rs.getString(6)
					);
			list.add(data);
		}
		rs.close();
		ps.close();
		conn.close();
		
	}catch(SQLException e) {
		e.printStackTrace();
		System.out.println("드라마 조회 실패");
	}
	return list;
}


	public drama select(int num) {
		String sql = "select * from drama where drama_num=?";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if(rs.next()) {
				drama data = new drama(
	rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
	rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),
	rs.getString(11)
						);
						return data;
			}
		}catch(SQLException e) {
			
		}
		
		return null;
	}
	
	public ArrayList<drama>selectAB(String s,int cnt){
		ArrayList<drama> list = new ArrayList<>();
		
		String sql = "select * from drama "+s;
		System.out.println("bbb");
		try {
			ps=conn.prepareStatement(sql);
			rs = ps.executeQuery();
			for(int i=0; i<cnt && rs.next(); i++) {
				
				drama data = new drama(
			rs.getInt(1),rs.getString(2),rs.getString(5),rs.getString(6)
						);
				list.add(data);
			}
			rs.close();
			ps.close();
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("드라마 조회 실패");
		}
		return list;
	}
	
	}

