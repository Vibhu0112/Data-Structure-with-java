package Searching;


public class Binary {
        public static void binarySearch(int arr[], int min, int max, int S){  
            int mid = (min + max)/2;  
            while( min <= max ){  
               if ( arr[mid] < S ){  
                 min = mid + 1;     
               }else if ( arr[mid] == S ){  
                 System.out.println("Element is found at index: " + mid);  
                 break;  
               }else{  
                  max = mid - 1;  
               }  
               mid = (min + max)/2;  
            }  
            if ( min > max ){  
               System.out.println("Element is not found!");  
            }  
          }  
          public static void main(String args[]){  
                 int arr[] = {15,75,48,66,23,45};  
                 int S = 66;  
                 int max=arr.length-1;  
                 binarySearch(arr,0,max,S);     
          }  
         }

