import java.util.ArrayList;
import java.util.List;

public class PathCrossing {
    public static boolean isPathCrossing(String path){

        List<List<Integer>> out = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        temp.add(0);
        List<Integer> copyTemp = new ArrayList<>(temp);
        out.add(copyTemp);
        
        for (int i=0; i<path.length(); i++){
            
            if (path.charAt(i) == 'N'){
                temp.set(1, temp.get(1)+1);
            } else if (path.charAt(i) == 'S') {
                temp.set(1, temp.get(1)-1);
            } else if (path.charAt(i) == 'E') {
                temp.set(0, temp.get(0)+1);
            }else {
                temp.set(0, temp.get(0)-1);
            }

            if (out.contains(temp)){
                return true;
            }else {
                List<Integer> newList = new ArrayList<>(temp);
                out.add(newList);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPathCrossing("NES"));
    }
}
