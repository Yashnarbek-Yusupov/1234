package merge_sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int left = 0;
        int right = n-1;
        Main obj = new Main();
        obj.mergeSort(arr, 0, arr.length-1);
        obj.display(arr);
    }

    public  void merge(int arr[], int left, int middle, int right) {
        int low = middle - left + 1;
        int high = right - middle;

        int L[] = new int [low];
        int R[] = new int[high];

        int i = 0;
        int j = 0;

        for ( i = 0; i < low; i++) {
            L[i] = arr[left + i];
        }

        for ( j = 0; j < high; i++) {
            R[i] = arr[middle + j +1];
        }

        int k = left;
        i = 0;
        j = 0;

        while(i < low && j < high){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < low){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(i < low){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < high){
            arr[k] = R[j];
            j++;
            k++;
        }
    }  //merge f-ya

    public  void mergeSort(int arr[], int left, int right) {
        int middle;
        if(left < right){
            middle = (left + right)/2;
            mergeSort(arr, left, right);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public  void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }



}
