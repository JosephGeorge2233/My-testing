class Testemployee{
String name;
int id;
String designation;


public static void main(String args[]){
Testemployee s1=new Testemployee();
s1.getData(01,"Joseph","Tester");
s1.display();

Testemployee s2=new Testemployee();
s2.getData(02,"Feba","Manager");
s2.display();

Testemployee s3=new Testemployee();
s3.getData(03,"Paul","director");
s3.display();
	
	
}
void getData(int id1,String name1,String designation1){
	
id=id1;
name=name1;
designation=designation1;

}

void display(){
	
	System.out.println(id);
	System.out.println(name);
	System.out.println(designation);
	System.out.println("   ");
	
}
	
}