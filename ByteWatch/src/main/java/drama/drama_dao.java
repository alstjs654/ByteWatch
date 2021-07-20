package drama;

import java.sql.SQLException;
import java.util.ArrayList;

import main.MainDAO;

public class drama_dao extends MainDAO{
	public ArrayList<drama>index_select(){
	ArrayList<drama> list = new ArrayList<>();
	
	String sql = "select * from drama order by w_cnt desc";
	
	try {
		ps=conn.prepareStatement(sql);
		rs = ps.executeQuery();
		for(int i=0; i<15 && rs.next(); i++) {
			
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