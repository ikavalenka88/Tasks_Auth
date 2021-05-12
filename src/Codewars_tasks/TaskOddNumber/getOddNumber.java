package Codewars_tasks.TaskOddNumber;

public class getOddNumber {
    static int getOdd (int arr[],int size) {
        int i;
        for (i = 0; i<arr.length; i++){
            int count =0;
            for (int u=0;u< arr.length;u++){
                if (arr[i]==arr[u])
                    count++;
            }
            if (count%2!=0){
                return arr[i];
            }
        }
        return arr[i];
    }
}
