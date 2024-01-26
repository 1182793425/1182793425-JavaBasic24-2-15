package myStatic.a02demo1;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil(){}

    public static String printArray(int[] arr){
        StringJoiner stringJoiner=new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(arr[i]);
            stringJoiner.add(stringBuilder);
        }
        return stringJoiner.toString();
    }
    public static double getAverage(int[] arr){
        double aver=0;
        for (int i = 0; i < arr.length; i++) {
            aver+=arr[i];
        }
        return aver/arr.length;
    }
}
