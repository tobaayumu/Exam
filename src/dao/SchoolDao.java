package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Student;

public class SchoolDao extends Dao{
	private String baseSql;

	public School get(String cd) throws Exception {

		Student student = new Student();
		Connection connection = getConnection();
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement("select * from student where cd=?");
			statement.setString(1,  cd);
			ResultSet rSet = statement.executeQuery();
			StudentDao studentlDao = new StudentDao();

			if (rSet.next()){

				school.setCd(rSet.getString("cd"));
				school.setName(rSet.getString("name"));

				school.setStudet(studentDao.get(rSet.getString("student_no")));

	}else{
		school = null;
	}
}catch (Exception e){
	throw e;
}finally{
	if(statement != null){
		try{
			statement.close();
		}catch(SQLException sqle){
			throw sqle;
		}
	}
}
return school;
	}

	private List<School> postFilter(ResultSet rSet, Student student) throws Exception {
		List<School> list = new ArrayList<>();
		try{
			while(rSet.next()){
				School school = new School();

				school.setCd(rSet.getString("cd"));
				school.setName(rSet.getString("name"));


				list.add(school);
			}
		} catch (SQLException | NullPointerException e){
			e.printStackTrace();
		}
		return list;

	}






