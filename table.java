# table
import java.io.*;
import java.util.*;
public class table{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,j,k=1;
System.out.println("Enter the number");
i=sc.nextInt();
for(k=1;k<=10;k++){
j=i*k;
System.out.println(j);
}
}
}
