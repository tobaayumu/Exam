package scoremanager.main;

import java.time.LocalDate;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Student;
import bean.Teacher;
import dao.StudentDao;
import tool.Action;

public class StudentListAction extends Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)throws Exception{
		// TODO 自動生成されたメソッド・スタブ
	HttpSession session = request.getSession();
	Teacher teacher = (Teacher)session.getAttribute("user");

	String entYearStr="";
	String classNum="";
	String isAttenStr="";
	int entYear = 0;
	boolean isAttend = false;
	List<Student> students = null;
	LocalDate todaysDate = LocalDate.now();
	int year = todaysDate.getYear();
	StudentDao sDao = new StudentDao();
	ClassNumDao cNumDao = new ClassNumDao();
	Map<String, String> errors = new HashMap<>();
	}
}



