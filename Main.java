//
// Created by Ha on 16. 1. 4..
//

/*
    page 207 - 재귀적 이진 검색
    정렬된 정수 배열에 대해 이진 검색을 수행하여 주어진 정수의 인덱스를 찾아내는 함수를 구현하라.
 */

public class Main {

    public static void main(String[] args) {

        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int lookfor = 9;

        int foundIndex = binarySearch(arr, lookfor);

        System.out.println("index of " + lookfor + " : " + foundIndex);
    }

    // 이진 탐색 wrapper
    public static int binarySearch(int []arr, int v){
        return binarySerachInternal(arr, v, 0, arr.length - 1);
    }

    // binarySearch 내부적으로 arr의 start ~ end 범위에서 v를 찾는 함수
    private static int binarySerachInternal(int []arr, int v, int start, int end){
        // within arr
        while(start <= end){
            int index = (start + end) / 2; // 중간 인덱스

            // 찾았다면 index 반환
            if(arr[index] == v)
                return index;
            else if(arr[index] > v) // v가 더 작다면 왼쪽 반에서 찾음
                return binarySerachInternal(arr, v, start, index - 1);
            else // v가 더 크다면 오른쪽 반에서 찾음
                return binarySerachInternal(arr, v, index + 1, end);
        }

        // not found
        return -1;
    }
}
