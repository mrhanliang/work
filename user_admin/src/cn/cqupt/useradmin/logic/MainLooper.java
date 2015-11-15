package cn.cqupt.useradmin.logic;

import cn.cqupt.useradmin.io.UserInputIO;

public class MainLooper {
	private boolean flag = true;
	public UserInputIO userInputIO;
	
	public MainLooper(){
		userInputIO = new UserInputIO();
	}
	public void loop(){
		while(flag){
			String input = userInputIO.getInputLine();
			System.out.println(input);
		}
	}
}
