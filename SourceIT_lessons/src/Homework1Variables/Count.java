package Homework1Variables;

/**
 * Created by А1 on 10.10.2016.
 */
public class Count {
    private float n;

    public float getN() {
        return n;
    }

    public void setN(float n) {
        this.n = n;
    }

    public int count()
    {
        int result=0;
        float temp=n;
        while(temp>1) {
            result += (int)temp%10;
            temp /= 10;
        }
        temp=n*10;
        while(temp%10!=0) {
            result += (int) temp % 10;
            temp *= 10;
        }
        return result;
    }
    public int count2(int num)
    {
        float temp = n;
        int count = 1;
        while(temp>=1) {
            temp /= 10;
            count*=10;
        }
        temp=n;
        while(num-->0)
        {
            temp += (temp%10!=0)?(temp%10):10*count;
            temp=Math.round(temp/10);
        }
        return (int)(temp);
    }
}
