import java.util.*;
class converter{
    public static void options(int input,int base){
        System.out.println("Enter what to convert:\n\t1.Decimal\n\t2.Binary\n\t3.Octal\n\t4.Hexadecimal\n\t5.All\n");
        Scanner s= new Scanner(System.in);
      System.out.print("Enter your choice:");
        int ch=s.nextInt();
      
        int i=converter.dec(input,base);
        
        
        switch(ch){
            case 1:
                if(base==16){
                String j=converter.hex(i);
                    System.out.print("The decimal number of "+j+ " (base "+base+")"+" is "+i);    
                }
                else{
                System.out.print("The decimal number of "+input+" (base "+base+")"+" is "+i);
                    
                }
                System.out.println();
                break;
                
                
            case 2:
                if(base==16){
                    String j=converter.hex(i);
                    System.out.print("\nBinary number of "+j+" (base "+base+")"+" is ");
                converter.binary(i);
                
                }
               else{
                   System.out.print("\nBinary number of "+input+" (base "+base+")"+" is ");
                   converter.binary(i);
                   
               }
               System.out.println();
                   break;
            case 3:
                if(base==16){
                    String j=converter.hex(i);
                    System.out.print("Octal value for "+j+" (base "+base+")"+" is ");
                converter.oct(i);
                System.out.println();
                    
                }
                else{
                    System.out.print("Octal value for "+input+" (base "+base+")"+" is ");
                converter.oct(i);
                 System.out.println();   
                }
                break;
            case 4:
                if(base==16){
                    String j=converter.hex(i);
                    System.out.println("The hexadecimal value for "+j+" (base "+base+")"+" is ");
                }else{
                System.out.println("The hexadecimal value for "+input+" (base "+base+")"+" is "+converter.hex(i));}
                break;
            case 5:
                if(base==16){
                    String j=converter.hex(i);
                    System.out.print("The decimal number of "+j+" (base "+base+")"+" is "+i);
                    System.out.print("\nBinary number of "+j+" (base "+base+")"+" is ");
                converter.binary(i);
                System.out.print("\nOctal value for "+j+" (base "+base+")"+" is ");
                converter.oct(i);
                System.out.println("\nThe hexadecimal value for "+j+" (base "+base+")"+" is "+j);
                    
                    
                }
                else{
                System.out.print("The decimal number of "+input+" (base "+base+")"+" is "+i);
                System.out.print("\nBinary number of "+input+"(base "+base+")"+" is ");
                converter.binary(i);
                System.out.print("\nOctal value for "+input+" (base "+base+")"+" is ");
                converter.oct(i);
                System.out.println("\nThe hexadecimal value for "+input+" (base "+base+")"+" is "+converter.hex(i));
             
                }
                   break;
            
            default:
               System.out.println("Invalid selection");
               break;
            
        }
              
                
                
            
        }
        
    
        
        
        
    
    public static int dec(int input,int base){
        int ans=0;
        if(base==10){
            ans=input;
        }
        else if(base==2){
        int i=input;
        int k=0;
     
        while(i>=1){
            int pow=1;
            for(int j=1;j<=k;j++){
                pow=pow*2;
            }
          
            int rem=i%10;
            if(rem==1){
                ans=ans+pow;
            }
            k++;
      
            i=i/10;
            
            
        }
        
    }
    else if(base==16){
        ans=input;
        
    }
    else if(base==8){
        int i=input;
        int k=0;
        while(i>0){
            int pow=1;
            for(int j=1;j<=k;j++){
                pow=pow*8;
            }
            int rem=i%10;
            ans=ans+(rem*pow);
            k++;
            i=i/10;
        }
      
    }
    
            
       return(ans);
        
    }
    public static void binary(int dec){
        int i=dec;
        int [] arr=new int[32];
        int j=0;
        
        while(i>=1){
           
           int rem=i%2;
           arr[j]=rem;
           j=j+1;
      
           i=i/2;
           
        }
        int k=j-1;
        
        while (k>=0){
            System.out.print(arr[k]);
            k--;
        }
    }
public static String hex(int dec){
        int i=dec;
        char[] arr=new char[32];
        int j=0;
        while (i>0){
            int rem=i%16;
            
            if(rem<=9){
                arr[j]=(char)(rem+48);
        
            }
            else{
                int ascii=rem+55;
                
     
                arr[j]=(char)ascii;
         
                
            }
            j++;
            i=i/16;

        }
        String drake="";
        for(int k=j-1;k>=0;k--){
            drake=drake+arr[k];
        }
        return(drake);
    }
    public static void oct(int dec){
        int i=dec;
        int[] arr=new int[32];
        int j=0;
        while (i>0){
            int rem=i%8;
            arr[j]=rem;
              
                j++;
                i=i/8;
            }
        
        for(int k=j-1;k>=0;k--){
            System.out.print(arr[k]);
        }
        
    }
}

class base_converter {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner s= new Scanner(System.in);
        int l=0,ch;
        while(l==0){
            System.out.println("\t\t\t----Base Convertor----\nEnter your input time\n\t\t\t\t1.Decimal\n\t\t\t\t2.Binary\n\t\t\t\t3.Octal\n\t\t\t\t4.Hexadecimal\n\t\t\t\t5.Exit");
            System.out.print("Enter your choice:");
            ch=s.nextInt();
            s.nextLine();
            switch(ch){
                case 1:
                    System.out.print("Enter your number:");
                    int dec=s.nextInt();
                    int base=10;
                    converter.options(dec,base);
                    System.out.print("Do you want to continue 0 to yes or else to no:");
                    l=s.nextInt();
                    break;
                case 2:
                    int rep=2;
                    do{
                        base=2;
                        System.out.print("Enter your number:");
                    int bin =s.nextInt();
                    if(bin%10>1){
                        
                       System.out.print("Its not binary, try again\n");}
                       else{
                           converter.options(bin,base);
                           rep++;
                       }
                        
                    }
                       while(rep==2);
                       
                       
                    System.out.print("Do you want to continue 0 to yes or else to no:");
                    l=s.nextInt();
                       break;
                       
                    
                    
                    
                case 3:
                    rep=3;
                    do{
                        base=8;
                        System.out.print("Enter your number:");
                  
                    int oct =s.nextInt();
                    
                    if(oct%10>7){
                        
                       System.out.print("Its not in base octal , try again\n");}
                       else{
                             
                       converter.options(oct,base);
                           rep++;
                       }
                        
                    }
                       while(rep==3);
                     
                       System.out.print("Do you want to continue 0 to yes or else to no:");
                    l=s.nextInt();
                       break;
                case 4:
                    rep=4;
                    do{
                        int wrong=0;
                    System.out.print("Enter your number:");
                    String in=s.nextLine();
                    int answer=0;
                    int k=0;
                    for(int i=in.length()-1;i>=0;i--){
                        int pow=1;
                        for(int j=1;j<=k;j++){
                            pow=pow*16;
                        }
                        int rem=(int)in.charAt(i);
                        rem=rem-'0';
                        if((rem>9&&rem<17)||rem>22){
                            wrong=1;
                            System.out.println("This number is not hexadecimal, please try again");
                            break;
                        }
                        else if(rem>16&&rem<23){
                            rem=rem-7;
                            answer=answer+(pow*rem);
                            k++;
                        }
                        else{
                            answer=answer+(pow*rem);
                            k++;
                        }
                       
                    }
                    if (wrong==0){
                      
                    
                        rep++;
                    }
                    base=16;
                    converter.options(answer,base);
                    }while(rep==4);
                    
                    
                    System.out.print("Do you want to continue 0 to yes or else to no:");
                    l=s.nextInt();
                    
                    break;
                case 5:
                    l=1;
                    break;
                default:
                   System.out.println("Invalid selection");
                   break;
               
                
                
                    
            }
            
            
        }
        System.out.print("Thanks for using");
        
        
        
    }
    
    
    
}