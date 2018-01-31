/*package com.adarsh;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

public class EmpServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		EmployeeCRUD ecrud = new EmployeeCRUD();
		String val = req.getParameter("action");
		if("insert".equalsIgnoreCase(val)) {
			int eno = Integer.parseInt(req.getParameter("eno"));
			String ename = req.getParameter("ename");
			String uname = req.getParameter("uname");
			String pwd = req.getParameter("pwd");
			String email = req.getParameter("email");
			int pno = Integer.parseInt(req.getParameter("eno"));
			Employee e1 = new Employee();
			e1.setEno(eno);
			e1.setEname(ename);
			e1.setUsername(uname);
			e1.setPassword(pwd);
			e1.setEmail(email);
			e1.setPhoneno(pno);
			int x;
			try {
				x= ecrud.addEmployee(e1);
				if(x != 0) {
					RequestDispatcher rd = req.getRequestDispatcher("/success.jsp");
					rd.forward(req, res);
				}
				else {
					RequestDispatcher rd = req.getRequestDispatcher("/failure.jsp");
					rd.forward(req, res);
					
				}
			}catch(SQLException e){
				
			}
			
			
		}
		else if("empAll".equalsIgnoreCase(val)) {
			try {
				req.setAttribute("empCRUD", ecrud.getAllEmployee());
				RequestDispatcher rd = req.getRequestDispatcher("/view.jsp");
				rd.forward(req, res);
			}catch(SQLException s) {}
		}else if("delete".equalsIgnoreCase(val)) {
			try {
				int eno=Integer.parseInt(req.getParameter("eno"));
				ecrud.deleteEmp(eno);
				req.setAttribute("empCRUD", ecrud.getAllEmployee());
				RequestDispatcher rd = req.getRequestDispatcher("/view.jsp");
				rd.forward(req, res);
			}catch(SQLException s) {}
		}
		else if("edit".equalsIgnoreCase(val)) {
			int eno=Integer.parseInt(req.getParameter("eno"));
			Employee eupdate = new Employee();
			eupdate.setEno(Integer.parseInt((req.getParameter("eno")));
			eupdate.setEname(req.getParameter("ename"));
			eupdate.setUsername(req.getParameter("uname"));
			eupdate.setPassword(req.getParameter("pwd"));
			eupdate.setEmail(req.getParameter("email"));
			eupdate.setPhoneno(Integer.parseInt((req.getParameter("pno")));
			try {			
				
				req.setAttribute("empCRUD", ecrud.getAllEmployee());
				RequestDispatcher rd = req.getRequestDispatcher("/view.jsp");
				rd.forward(req, res);
			}catch(SQLException s) {}
			
		}
	}

}
*/