import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int count = 0 ;
        for(int i=112; i<999; i++){
            if(checkNum(i))
                count++;
        }
       System.out.println(count);    
    }
    public static boolean checkNum(int s){
    Set<Integer> distinctNum=new HashSet<Integer>();
        
        for(int i =0; i<3; i++){
            int tmp=s%10;
            distinctNum.add(tmp);
            s = s/10;
        }
        if(distinctNum.contains(0) || distinctNum.size() !=2){
            return false;
        }else {
            return true;
        }
    }
}
