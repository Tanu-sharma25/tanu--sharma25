//Write a Program to accept users basic details

import java.util.*; //importing util package
public class Student //class declaration
{ 
  //variables to accept user input
  
private String name; 
private int age; 
private String address; 
private String email; 
private String gender;
private float percentage;

public Student()
{} 
public Student(String name, int age, String address, String email, String gender, float percentage)// declaring a student method with arguments 
{ 
this.name = name; 
this.age = age;
this.address = address; 
this.email = email; 
this.gender = gender;
this.percentage= percentage;
} 
public void setName(String newName)
{ 
name = newName; 
} 
public void setAge(int newAge)
{ 
age = newAge; 
} 
public void setAddress(String newAddress)
{ 
address = newAddress; 
} 
public void setEmail(String newEmail)
{ 
email = newEmail; 
} 
public void setGender(String newGender)
{ 
gender = newGender; 
} 
public void setPercentage(float newPercentage)
{ 
percentage = newPercentage; 
} 
public String getName()
{ 
return name; 
} 
public int getAge()
{ 
return age; 
} 
public String getAddress()
{ 
return address; 
} 
public String getEmail()
{ 
return email; 
} 
public String getGender()
{ 
return gender; 
} 
public float getPercentage()
{ 
return percentage; 
} 
public String toString() 
{ 
return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Email: " + email + ",Gender: " + gender + ",percentage: " + percentage; 
} 
public static void main(String[] args)
{ 
Scanner sc = new Scanner(System.in); //scanner class to accept user input
System.out.print("Name: ");
String name = sc.nextLine(); 
System.out.print("Age: "); 
int age = sc.nextInt(); 
System.out.print("Address: "); 
sc.nextLine(); 
String address = sc.nextLine(); 
System.out.print("Email: "); 
String email = sc.nextLine(); 
System.out.print("Gender: "); 
String gender = sc.nextLine(); 
System.out.print("Percentage: "); 
float percentage = sc.nextFloat(); 
}
}
