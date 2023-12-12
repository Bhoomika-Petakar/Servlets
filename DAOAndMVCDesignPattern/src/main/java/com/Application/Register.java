package com.Application;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeBOImplement;
import com.models.Employee;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String department = request.getParameter("department");
		int salary = Integer.parseInt(request.getParameter("salary"));

		Employee employee = new Employee(id, name, email, department, salary);
		
		
		EmployeeBOImplement employeeBo = new EmployeeBOImplement();
		employeeBo.save(employee);
		
		
		
		
	}

}
