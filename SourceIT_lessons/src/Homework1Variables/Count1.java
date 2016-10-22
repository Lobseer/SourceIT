package Homework1Variables;

/**
 * Created by А1 on 10.10.2016.
 */
public class Count1 {
    private float n;
    public float getN() {
        return n;
    }
    public void setN(float n) {
        this.n = n;
    }


    public int min()
    {
        int result=9;
        float temp=n;
        while(temp>1) {
            if(temp%10<result)
                result = (int)temp%10;
            temp /= 10;
        }
        temp=n*10;
        while(temp%10!=0) {
            if(temp%10<result)
                result = (int)temp%10;
            temp *= 10;
        }
        return result;
    }
    public int max()
    {
        int result=0;
        float temp=n;
        while(temp>1) {
            if(temp%10>result)
                result = (int)temp%10;
            temp /= 10;
        }
        temp=n*10;
        while(temp%10!=0) {
            if(temp%10>result)
                result = (int)temp%10;
            temp *= 10;
        }
        return result;
    }
}
