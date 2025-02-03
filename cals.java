import java.util.*;
class cals
{
public static void main(String args[]){
System.out.println("\t\t-----Simple Cals---\n"+"\t\t1.Adition\n"+"\t\t2.Subtraction\n"+"\t\t3.Multiplication\n"+"\t\t4.division");
Scanner s =new Scanner(System.in);
int a,b,ch;

System.out.println("Enter your choice");
ch= s.nextInt();
if(ch>4){
System.out.println("Invalid choice try again");


}
else{
switch(ch){
case 1:
System.out.println("Enter first number");
a=s.nextInt();
System.out.println("Enter second number"); 
b=s.nextInt();
System.out.println("Your answer:"+(a+b));
break;

case 2:
System.out.println("Enter first number");
a=s.nextInt();
System.out.println("Enter second number"); 
b=s.nextInt();
System.out.println("Your answer:"+(a-b));
break;

case 3:
System.out.println("Enter first number");
a=s.nextInt();
System.out.println("Enter second number"); 
b=s.nextInt();
System.out.println("Your answer:"+(a*b));
break;

case 4:
System.out.println("Enter first number");
a=s.nextInt();
System.out.println("Enter second number"); 
b=s.nextInt();
System.out.println("Your answer:"+(a/b));
break;
}
}
}
}