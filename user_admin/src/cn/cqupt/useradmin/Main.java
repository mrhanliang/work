package cn.cqupt.useradmin;

import cn.cqupt.useradmin.logic.MainLooper;
import cn.cqupt.useradmin.ui.UserAdminUI;

public class Main {
	public static void main(String args[]){
		UserAdminUI userAdminUI = new UserAdminUI();
		userAdminUI.loadUI();
		
		MainLooper mainLooper = new MainLooper();
		mainLooper.loop();
		
		/*User u1 = new User(1,"zhangsan","F",30,5000.00f);
		userAdminUI.displayUserInfo(u1);
		
		User u2 = new User(2,"lisi","M",25,2500.00f);
		userAdminUI.displayUserInfo(u2);*/
	}
}
