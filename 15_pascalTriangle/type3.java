import java.util.ArrayList;
public class type3{
    public static ArrayList<ArrayList<Integer>> pascalTriangle(int row)
    {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        int n=row;
        for(int i=1;i<=n;i++)
        {
            ArrayList<Integer> eachRow=new ArrayList<>();
            eachRow=nthRow(i);
            list.add(eachRow);
        }
        return list;
    }
    public static ArrayList<Integer> nthRow(int row)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int res=1;
        list.add(res);
        int n=row;
        for(int i=1;i<n;i++)
        {
            res*=(n-i);
            res/=(i);
            list.add(res);
        }
        return list;
    }

    public static void main(String[] args) {
        int row=5;
        ArrayList<ArrayList<Integer>> list=pascalTriangle(row);
        System.out.println(list);

    }
}