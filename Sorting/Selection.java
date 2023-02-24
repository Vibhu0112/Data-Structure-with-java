package Sorting;

public class Selection {
    void sort(int Arr[]){
        int n= Arr.length;
        for(int i=0; i<n; i++){
            int min=i;
            for(int j=i+1; j<n ; j++){
                if(Arr[j]<Arr[min]){
                    min=j;
                }
            }
                    int temp=Arr[min];
                    Arr[min]=Arr[i];
                    Arr[i]=temp;
                  
        }
    }
         void printArray(int arr[]){
            int n = arr.length;
            for (int i=0; i<n; ++i){
             System.out.print(arr[i]+" ");
            }
             System.out.println();
    }
  

    public static void main(String[] args) {

        int Arr[]={8,7,6,12,45,78,10,16};
        Selection s = new Selection();
        s.sort(Arr);
        s.printArray(Arr);
    }
}
