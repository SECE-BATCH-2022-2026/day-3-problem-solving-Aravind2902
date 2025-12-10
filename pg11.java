import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		char ch=sc.nextLine().charAt(0);
		UserMainCode.splitString(input,ch);
	}
}
class UserMainCode
{
	public static void splitString(String input,char ch)
	{
		String[] arr1=input.split(""+ch);
		StringBuilder sb=new StringBuilder();
		for(String cha:arr1)
		{
			sb.append(cha);
		}
		sb.reverse();
		System.out.println(sb.toString().toLowerCase());
	}
}