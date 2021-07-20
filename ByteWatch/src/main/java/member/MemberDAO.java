package member;

import main.MainDAO;

import java.sql.SQLException;

public class MemberDAO extends MainDAO {

    public void insertMember(String id, String pw, String nickname, String email, int age) {
        String sql = "insert into member values(?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pw);
            ps.setString(3, nickname);
            ps.setString(4, email);
            ps.setInt(5, age);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String findIdByEmail(String email) {
    	String sql = "select id from member where email=?";
    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, email);
    		rs = ps.executeQuery();
    		if(rs.next())
    			return rs.getString("id");	
    	} catch (SQLException e) {
    		e.printStackTrace();
		}
    	return "";
    }
    
    public boolean isMember(String id, String pw) {
    	String sql = "select * from member where id=? and pw=?";
    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, id);
    		ps.setString(2, pw);
    		rs = ps.executeQuery();
    		return rs.next();
    	} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
    }

    public boolean isUnique(String query, String condition) {
        String sql = "select * from member where ";
        sql += condition + "=?";
        boolean result = false;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, query);
            rs = ps.executeQuery();
            if (rs.next())
            	result = false;
            else 
				result =  true;
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return result;
    }
}
