import java.util.Scanner;
class prime2{

public static void main(String []args){


Scanner s= new Scanner(System.in);
System.out.print("Enter the limit:");
int lim=s.nextInt();
int total=0;
for(int i=1;i<=lim;i++){
int flag=0;
for(int j=1;j*j<=i;j++){
if(i%j==0){
flag+=1;
}
}
if(flag==1){
System.out.print(" "+i);
total+=1;
}

}
System.out.print("\nTotal:"+total);

}




}
