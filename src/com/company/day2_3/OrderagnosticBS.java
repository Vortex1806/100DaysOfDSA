package com.company.day2_3;

public class OrderagnosticBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(orderAgnosticBS(arr,target));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

//        find whether arr is sorted in ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while (start<=end){
//            int mid = (start + end) /2;
//            start and end might overflow
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(isAscending){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else {
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
