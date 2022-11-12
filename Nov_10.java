package tanu31;
Q1:- 

 import java.util.Scanner; 

  

 public class swapping_no { 

  

         int num1,num2,temp; 

         public static void main(String[] args)  

         { 

                 swapping_no obj=new swapping_no(); 

                 obj.accept(); 

  

         } 

         public void accept()//accepting number from user 

         { 

                 Scanner sc=new Scanner(System.in); 

                 System.out.println("Enter two numbers"); 

                 num1=sc.nextInt(); 

                 num2=sc.nextInt(); 

                 Swapp_without(num1,num2); 

                 Swapp_with(num1,num2); 

         } 

         public void Swapp_without(int num1,int num2)//swapping without third variable 

         { 

  

                 System.out.println(" The no are="); 

                 System.out.println("num1="+num1+" and num2="+num2); 

                 num1=num1+num2; 

                 num2=num1-num2; 

                 num1=num1-num2; 

                  

                 System.out.println("After swapping the no are="); 

                 System.out.println("num1="+num1+" and num2="+num2); 

                  

         } 

         public void Swapp_with(int num1,int num2)//swapping with third variable 

         { 

                 System.out.println(" The no are="); 

                 System.out.println("num1="+num1+" and num2="+num2); 

                  

                 temp=num1; 

                 num1=num2; 

                 num2=temp; 

                  

                 System.out.println("After swapping the no are="); 

                 System.out.println("num1="+num1+" and num2="+num2); 

                  

         } 

  

 } 

 -------------------------------- 

 Q2:- 

 import java.util.Scanner; 

  

 public class student_record { 

  

         String name; 

         int roll,i,sum,per; 

         int marks[]=new int[5]; 

         Scanner sc=new Scanner(System.in); 

          

         public static void main(String[] args)  

         { 

                 student_record[] obj=new student_record[5]; 

                 for(int i=0;i<5;i++) 

                 { 

                         obj[i]=new student_record(); 

                         obj[i].accept(); 

                 } 

                 System.out.println("All the data is :"); 

                 for(int i=0;i<5;i++) 

                 { 

                         obj[i].calc_per(); 

                         obj[i].grade(); 

                 } 

         } 

         public void accept() 

         { 

                  

                  

                 System.out.println("Enter your name"); 

                 name=sc.next(); 

                 System.out.println("Enter your roll no"); 

                 roll=sc.nextInt(); 

                 System.out.println("Enter marks of 5 Subject"); 

                 for(i=0;i<5;i++) 

                 { 

                         marks[i]=sc.nextInt(); 

                 } 

                  

         } 

         public void calc_per() 

         { 

                 for(i=0;i<5;i++) 

                 { 

                         sum=sum+marks[i]; 

                 } 

                  

                 per=(sum*100)/500; 

                  

         } 

         public void grade() 

         { 

                 System.out.println("name="+name); 

                 System.out.println("Roll number="+roll); 

                 System.out.println("The percentage is ="+per); 

                 if(per>=90 && per<=100) 

                 { 

                         System.out.println("O Grade"); 

                 } 

                 else if(per>=70 && per<90) 

                 { 

                         System.out.println("A Grade"); 

                 } 

                 else if(per>=50 && per<70) 

                 { 

                         System.out.println("B Grade"); 

                 } 

                 else if(per>=35 && per<50) 

                 { 

                         System.out.println("c Grade"); 

                 } 

                 else 

                 { 

                         System.out.println("Fail"); 

                 } 

         } 

  

 } 

 ------------------------------------------ 

 Q3:- 

 import java.util.Scanner; 

  

 public class abc { 

  

         int i,j,temp,size; 

         Scanner sc=new Scanner(System.in); 

         public static void main(String[] args)  

         { 

                 // TODO Auto-generated method stub 

                 abc obj=new abc (); 

                 obj.accept(); 

         } 

         public void accept()//accepting size from user 

         { 

                 System.out.println("Enter the size"); 

                 size=sc.nextInt(); 

                 int arr[]=new int[size]; 

                 System.out.println("Enter "+size+" numbers:"); 

                 for(i=0;i<size;i++) 

                 { 

                         arr[i]=sc.nextInt(); 

                 } 

                 GRT(arr); 

                 SML(arr); 

                 ASC(arr); 

                 DESC(arr); 

         } 

         public void GRT(int[] arr)//displaying greater number 

         { 

                 temp=arr[0]; 

                 for(i=0;i<arr.length;i++) 

                 { 

                         if(temp<arr[i]) 

                         { 

                                 temp=arr[i]; 

                         } 

                 } 

                 System.out.println("The Greater No is ="+temp); 

         } 

         public void SML(int[] arr)//displaying smallest number 

         { 

                 temp=arr[0]; 

                 for(i=0;i<arr.length;i++) 

                 { 

                         if(temp>arr[i]) 

                         { 

                                 temp=arr[i]; 

                         } 

                 } 

                 System.out.println("The Smaller No is ="+temp); 

                  

         } 

         public void ASC(int[] arr)//displaying no in ascending order 

         { 

          

                 for(i=0;i<arr.length;i++) 

                 { 

                         for(j=0;j<arr.length;j++) 

                         { 

                                 if(arr[i]<arr[j]) 

                                 { 

                                         temp=arr[i]; 

                                         arr[i]=arr[j]; 

                                         arr[j]=temp; 

                                 } 

                         } 

                 } 

                 System.out.println("The No in ascending order is ="); 

                 for(i=0;i<arr.length;i++) 

                 { 

                         System.out.println(arr[i]); 

                 } 

         } 

         public void DESC(int[] arr)//displaying no in descending order 

         { 

                 for(i=0;i<arr.length;i++) 

                 { 

                         for(j=0;j<arr.length;j++) 

                         { 

                                 if(arr[i]>arr[j]) 

                                 { 

                                         temp=arr[i]; 

                                         arr[i]=arr[j]; 

                                         arr[j]=temp; 

                                 } 

                         } 

                 } 

                 System.out.println("The No in descending order is ="); 

                 for(i=0;i<arr.length;i++) 

                 { 

                         System.out.println(arr[i]); 

                 } 

         } 

 }
