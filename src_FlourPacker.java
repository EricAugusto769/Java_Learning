public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount *= 5;
        int sum = bigCount + smallCount;
        int remainder = 0;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (sum > goal) {
            if(bigCount > goal){
                while(bigCount > goal){
                    bigCount -= 5;
                }
                if(bigCount > 0){
                    System.out.println(smallCount);
                    System.out.println(bigCount);
                    sum = smallCount + bigCount;
                    System.out.println(sum);
                    if(sum >= goal){
                        return true;
                    } else{
                        return false;
                    }
                } else{
                    return false;
                }
            }else{
                return true;
            }
        }
        if(sum == goal){
            return true;
        }
        return false;
    }
}
