package cn.cqupt.Io;

import java.io.*;
import java.security.spec.ECFieldF2m;

class Test{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader("d:/src/A.txt");
			br = new BufferedReader(fr);
			String line = null;
			while(true){
				line = br.readLine();
				if(line == null){
					break;
				}
				System.out.println(line);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				fr.close();
				br.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
