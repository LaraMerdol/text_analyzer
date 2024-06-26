package site;

public class SampleClass {
    int x;
    int y;

    public SampleClass(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getMinimum(){
        if (x < y){
            return x;
        }
        return y;
    }

    public int getMaximum(){
        if(x < y){
            return y;
        }
        return x;
    }

    /**
     * Returns the sum of x and y
     * @return integer
     */
    public int getSum(){
        return x + y;
    }
}
