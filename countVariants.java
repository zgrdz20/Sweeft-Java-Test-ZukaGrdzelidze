public class countVariants {


    public static int countVariants(int stearsCount){
        if(stearsCount < 0) return 0;
        if(stearsCount == 0) return 1;
        return countVariants(stearsCount - 1) + countVariants(stearsCount - 2);
    }


}
