package com.adarsh;
import java.sql.*;
import java.util.*;

import javax.naming.NamingException;

public class EmployeeCRUD {
	private Connection con;
	
	public EmployeeCRUD() throws NamingException {
		con=DataSourceConnection.getConnection2();}
		
		public int addEmployee(Employee emp) throws SQLException {
			int x=0;
			
			PreparedStatement ps = con.prepareStatement("insert into emp_curd(eno,ename,username,password,email,phoneno) values(?,?,?,?,?,?)");
			
			ps.setInt(1, emp.getEno());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getUsername());
			ps.setString(4, emp.getUsername());
			ps.setString(5, emp.getUsername());
			ps.setInt(6, emp.getPhoneno());
			x=ps.executeUpdate();
				
			return x;
		}
		
		public List getAllEmployee() throws SQLException{
			List<Employee> list = new ArrayList<>();
			PreparedStatement pst = con.prepareStatement("select * from emp_crud");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setUsername(rs.getString(3));
				emp.setPassword(rs.getString(1));
				emp.setEmail(rs.getString(1));
				emp.setPhoneno(rs.getInt(1));
				list.add(emp);
			}
			return list;
		}
		
		public void deleteEmp(int EmpNo) throws SQLException {
			PreparedStatement pst = con.prepareStatement("delete from emp_crud where eno=?");
			pst.setInt(1, EmpNo);
			pst.executeUpdate();
			
		}
		
		public void editEmployee(Employee emp) throws SQLException {
			
			int x=0;
			PreparedStatement pst = con.prepareStatement("update emp_crud set ename?, username=?,password=?,email=?,phoneno=?"
					+"where eno=?");
			pst.setString(1, emp.getEname());
			pst.setString(2, emp.getUsername());
			pst.setString(3, emp.getPassword());
			pst.setString(4, emp.getEmail());
			pst.setInt(5, emp.getPhoneno());
			pst.setInt(6, emp.getEno());
			pst.executeUpdate();
		}
		
		public Employee getAllEmployeeById(int empId) throws SQLException{
			Employee emp = new Employee();
			PreparedStatement pst = con.prepareStatement("select * from emp_crud where eno=?");
			pst.setInt(1, empId);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setUsername(rs.getString(3));
				emp.setPassword(rs.getString(4));
				emp.setEmail(rs.getString(5));
				emp.setPhoneno(rs.getInt(6));
			}
			return emp;
		}
		
		
		
	}


