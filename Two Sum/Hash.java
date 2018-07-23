import java.util.HashMap;
public class Hash {
    public static int[] twoSum(int[] numbers,int target){
    	HashMap<Integer, Integer > ht=new HashMap<Integer,Integer>();   //建立一个哈希表
    	int[] result={0,0};        //结果
    	for(int i=0;i<numbers.length;i++){
    		ht.put(numbers[i],i);
    	   }
        for(int i = 0; i < numbers.length; i++){
            int gap = target - numbers[i];
            if(ht.get(gap)!=null && ht.get(gap)>i){
                result[0] = i + 1;
                result[1] = ht.get(gap) + 1;
            }
        }
       
        return result;   	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] numbers = {2,7,11,15} ;
		    int target = 9;
		    int[] result = twoSum(numbers, target);
		    System.out.println("index1="+result[0]+", index2="+result[1]);
		    //index1=1, index2=2
	}

}
