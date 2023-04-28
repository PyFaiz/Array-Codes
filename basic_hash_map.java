import java.util.HashMap;
import java.util.Map;
public class basic_hash_map {
    public static void main(String[] args){
    Map<Integer,Integer> map = new HashMap<>();
    int arr[] = {10,5,10,15,10,5};
    int n = arr.length;
    
    for(int i=0;i<n;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i], map.get(arr[i])+1);                 
        }
        else{
            map.put(arr[i], 1);
        }
    }
    for(Map.Entry<Integer,Integer> entry : map.entrySet())
    {
        System.out.println(entry.getKey()+" "+entry.getValue());
    }
    }
}