import java.util.ArrayList;
// Given the row no. n, print the nth row of pascal's triangle
ublic class type2 {

  p  public static ArrayList<Integer> nthRow(int row)
    {
        ArrayList<Integer> list= new ArrayList<>();
        int ans=1;
        list.add(ans);
        int n=row;
        for(int i=1;i<n;i++)
        {
            ans=ans*(n-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
    }

    public static void main(String[] args) {
        int row=5;
        ArrayList<Integer> list=nthRow(row);
        System.out.println(list);

    }
    
}
