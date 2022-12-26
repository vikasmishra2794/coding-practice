import java.util.*;

public class TwoSumHash {
    public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        int index1=-1,index2=-1,n=A.size();
        ArrayList<Integer>list=new ArrayList<>();
        HashMap <Integer,Integer> map= new HashMap<Integer,Integer>();//<num,index>
        for(int i=0;i<n;i++){
            if(map.containsKey(B-A.get(i))){
                index1=map.get(B-A.get(i));
                 list.add(index1+1); // 1 based index
                index2=i;
                 list.add(index2+1); // 1 based index
                break;
            } else {
                if(map.containsKey(A.get(i))){
                    continue;
                } else {
                    //update value
                    map.put(A.get(i),i);
                }
            }
        }
       return list;
    }
    public static void main(String[] args) {
        final List<Integer> A = new ArrayList<Integer>(Arrays.asList(1,1,1));
        int B = 2;
        ArrayList<Integer> result = twoSum(A,B);
        for(int data: result) {
            System.out.println(data);
        }
    }
}
