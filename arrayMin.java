import java.util.Arrays;

public class arrayMin {


    public static int notContains(int[] array){
        Arrays.sort(array);
        int ans = 1;
        for(int i = 0; i < array.length; i++){
            if(array[i] > ans) {
                return ans;
            }
            if(array[i] > 0) ans++;
        }

        return ans;
    }
}
