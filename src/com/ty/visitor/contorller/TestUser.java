package com.ty.visitor.contorller;

	import com.ty.visitor.dao.UserDao;
	import com.ty.visitor.dto.User;

	public class TestUser {
		public static void main(String[] args) {
			User u = new User();
			u.setId(1);
			u.setName("Ramu");
			u.setEmail("ramu@gmail.com");
			u.setPassword("ramu123");
			u.setPhone(95342456);
			u.setRole("---------");
			UserDao dao = new UserDao();
//			int res = dao.saveUser(u);
//			if(res>0)
//			{
//				System.out.println("Added Successfully..!");
//			}
//			else
//				System.out.println("No data is Exist");
//			
			User user1 = dao.getUserById(1);
			if(user1 != null)
			{
				System.out.println("User Id  :"+user1.getId());
				System.out.println("User email  :"+user1.getEmail());
				System.out.println(("User name :"+user1.getName()));
				System.out.println("User role :"+user1.getRole());
				System.out.println(("User mobile :-"+user1.getPhone()));
			}
			else
				System.out.println("no data is Exist");
				
			}
		}
	




