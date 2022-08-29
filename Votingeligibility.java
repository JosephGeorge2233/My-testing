import java.util.Scanner;
class Votingeligibility{
static boolean flag=false;
static String name;
static int age;

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(" Enter the name ");
name=sc.next();

System.out.println(" Enter the age ");
age=sc.nextInt();

checkage();
}

static boolean checkage(){
	
	if(age>18){
		flag=true;
		System.out.println(name+" is eligible ");
	}
	else{
		System.out.println(name+" is not eligible ");
	}
	return flag;
}
}