import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int count=user.countoccurence(s1,s2);
		System.out.println(count);
		
	}
}

class user{
	public static int countoccurence(String s1,String s2){
		int count=0;
		
		/*while(s1.contains(s2)){
			count++;
			s1=s1.replaceFirst(s2, "");
		}
		return count;*/
		
		if(s1.length()==0&&s2.length()==0){
			return 0;
		}
		
		for(int i=0;i<=s1.length()-s2.length();i++){
			String sub=s1.substring(i,i+s2.length());
			if(sub.equals(s2))
			{
				count++;
				
			}
		}
		return count;
		
	}
}
