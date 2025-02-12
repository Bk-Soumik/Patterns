public class bitManipulation {

    public static void oddeven(int n){
        int bitMask = n & 1;
        if(bitMask != 1){
            System.out.println(n + " is an even number");
        }else{
            System.out.println(n + " is a odd number");
        }
    } 

    public static int getithbit(int n, int i){
        int bitMast = 1<<i;
        if((n & bitMast) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setithbit(int n, int i){
        int bitMast = 1<<i;
        return n | bitMast;
    }

    public static int clearithbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updatebit(int n, int i, int currBit){
        clearithbit(n, i);
        int bitMask = currBit<<i;
        return n | bitMask;
    }

    public static int clearuptoithbit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static boolean poweroftwo(int n){
        return (n&(n-1)) == 0;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static int countBits(int n){
        int count = 0;
        while(n > 0){
            if((n&1) != 0){
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int n, int a){
        int ans = 1;

        while(n>0){
            if((n&1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(clearuptoithbit(6, 2));
    }
}
