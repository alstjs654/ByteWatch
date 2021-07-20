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
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public String findIdByEmail(String email) {
    	String sql = "select id from member where email=?";
    	String result = "";
    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, email);
    		rs = ps.executeQuery();
    		if(rs.next())
    			result = rs.getString("id");
    	} catch (SQLException e) {
    		e.printStackTrace();
		}
    	try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return result;
    }
    
    public String findPw(String id, String email) {
    	String sql = "select pw from member where id=? and email=?";
    	String result = "";
    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, id);
    		ps.setString(2, email);
    		rs = ps.executeQuery();
    		if(rs.next())
    			result = rs.getString("pw");
    	} catch (SQLException e) {
    		e.printStackTrace();
		}
    	try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return result;
    }
    
    public boolean isMember(String id, String pw) {
    	String sql = "select id from member where id=? and pw=?";
    	Boolean result = false;
    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, id);
    		ps.setString(2, pw);
    		rs = ps.executeQuery();
    		result = rs.next();
    		
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return result;
    }
    
    public Member getMemberByNickname(String nickname) {
    	Member member = null;
    	String sql = "select id,nickname,email,age from member where nickname=?";
    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, nickname);
    		rs = ps.executeQuery();
    		if(rs.next()) {
    			member = new Member(rs.getString("id"), rs.getString("nickname"), rs.getString("email"), rs.getInt("age"));
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
		}
    	try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return member;
    }
    
    public Member getMemberById(String id) {
    	Member member = null;
    	String sql = "select id,nickname,email,age from member where id=?";
    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, id);
    		rs = ps.executeQuery();
    		if(rs.next()) {
    			member = new Member(rs.getString("id"), rs.getString("nickname"), rs.getString("email"), rs.getInt("age"));
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
		}
    	try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return member;
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
    }
	
	public void update(String column, String newValue, String condition, String conditionValue) {
		String sql = "update member set " + column + "=? where " + condition + "=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, newValue);
			ps.setString(2, conditionValue);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteMemberById(String id) {
		String sql = "delete from member where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
