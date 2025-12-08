import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String str[]=new String[n];
		
		for(int i=0;i<n;i++){
			str[i]=br.readLine();
		}
		
		String [] op=UserMainCode.removeDuplicates(str);
		for(String s:op){
			System.out.println(s);
		}
		br.close();
	}
}



class UserMainCode{
	public static String[] removeDuplicates(String [] input){
		
		Set<String> ts=new TreeSet<String>();
		for(String s:input){
			ts.add(s);
		}
		
		String[] res=new String[ts.size()];
		
		int i=0;
		
		for(String s:ts){
			res[i++]=s;
		}
		
		return res;
		
		
		
	}
}