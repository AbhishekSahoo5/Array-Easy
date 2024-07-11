
// Given row no. and col no. find out the element at position(r,c).
public class type1 {

    public static int pascalTriangle(int row, int col)
    {
        return ncr(row-1,col-1);
    }
    public static int ncr(int n, int r)
    {
        int res=1;
        for(int i=0;i<r;i++)
        {
            res*=(n-i);
            res/=(i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int row=5;
        int col=3;
        System.out.println(pascalTriangle(row, col));

    }
    
}
