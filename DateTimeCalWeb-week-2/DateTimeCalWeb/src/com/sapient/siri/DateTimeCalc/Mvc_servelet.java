package com.sapient.siri.DateTimeCalc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * Servlet implementation class Mvc_servelet
 */
@WebServlet("/Mvc_servelet")
public class Mvc_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mvc_servelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String query = request.getParameter("query");
		String date = request.getParameter("date");
		NaturalLangPhrases out=new NaturalLangPhrases();
		out.setDate(date);
		if(query.equals("week")) {
			String inTermsofweek = out.inTermsofWeeks(date);
			 out.setQuery(inTermsofweek);
		} else if(query.equals("month")) {
			String inTermsofMonths = out.inTermsofMonths(date);
			 out.setQuery(inTermsofMonths);
		} else if(query.equals("day")) {
			String inTermsofDays = out.inTermsofDays(date);
			 out.setQuery(inTermsofDays);
		}else if(query.equals("year")) {
			String inTermsofYears = out.inTermsofYears(date);
			 out.setQuery(inTermsofYears);
		}else {
			
		}
			
		request.setAttribute("gurubean",out);
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
		
	}

}
