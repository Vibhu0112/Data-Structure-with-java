package Searching;

import java.util.Scanner;

class Linear{
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int Arr[]=new int[n];
        System.out.print("Enter elements in an array : ");

        for(int i=0; i<n; i++){
            Arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element you want to search : ");
        int S=sc.nextInt();
        for(int i=0; i<Arr.length-1; i++){
          if(S==Arr[i])
           System.out.println(S+" is at index "+i+" of array.....");
        }
    }
}