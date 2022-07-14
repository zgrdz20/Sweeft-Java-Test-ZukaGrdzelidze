public class minSplitMoney {



    public static int minSplit(int amount){
        int ans = 0;
        if(amount / 50 > 0){
            ans += amount / 50;
            amount = amount % 50;
        }
        if(amount / 20 > 0){
            ans += amount / 20;
            amount = amount % 20;
        }
        if(amount / 10 > 0){
            ans += amount / 10;
            amount = amount % 10;
        }
        if(amount / 5 > 0){
            ans += amount / 5;
            amount = amount % 5;
        }
        if(amount / 1 > 0){
            ans += amount / 1;
            amount = amount % 1;
        }
        return ans;
    }
}
