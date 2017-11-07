package by.epam.mentoring.dao;



import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

import by.epam.mentoring.entity.User;

@Repository
public class UserDao extends EntityDaoImp<User, String> {
	
    public void setSqlMapClient(SqlMapClient sqlMap) {
        this.sqlMap = sqlMap;
    }

	public boolean create(User entity) {
		try
        {       
			System.out.println(sqlMap);
            sqlMap.insert("user.addUser", entity);
            return true;
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
	}

	public boolean update(User entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public User findById(String id) {
		try
        {
            User user = (User)sqlMap.queryForObject("user.getUserById", id);
            return user;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
	}
	

}
