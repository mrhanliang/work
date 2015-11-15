package cn.cqupt.useradmin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//用户接受用户从键盘当中输入的数据
public class UserInputIO {
	private BufferedReader bufferedReader;
	public UserInputIO(){
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String getInputLine(){
		String inputLine = null;
		try{
			inputLine = bufferedReader.readLine();//用户输入数据之后，按下回车键，该行代码即读取到用户的输入
		}catch(IOException e){
			e.printStackTrace();
		}
		return inputLine;
	}
}
