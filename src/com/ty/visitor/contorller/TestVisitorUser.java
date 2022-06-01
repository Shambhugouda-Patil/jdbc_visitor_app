package com.ty.visitor.contorller;


	import java.util.ArrayList;
	import java.util.List;

import com.ty.visitor.dao.VisitorDao;
import com.ty.visitor.dto.Visitor;

	public class TestVisitorUser {

		public static void main(String[] args) {
			VisitorDao dao = new VisitorDao();
			Visitor visitor = new Visitor();
			List<Visitor> l = new ArrayList<>();
			
			visitor.setAge(45);
			visitor.setDob("2012-03-27");
			visitor.setEmail("abc");
			visitor.setGender("m");
			visitor.setId(6);
			visitor.setName("bunny");
			visitor.setPhone("1234567778");
			visitor.setVisitdatetime("2022-07-12");
			dao.saveVisitor(visitor);
			
//			Visitor v = dao.getVisitorById(3);
//			System.out.println(v);
			
//			l= dao.getVisitorByDate("2022-04-29");
//			System.out.println(l);
			
//			l = dao.getVisitorByAgeRange(20, 25);
//			System.out.println(l);
		}
	}




