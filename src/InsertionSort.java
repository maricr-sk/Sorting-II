import java.util.List;

public class InsertionSort {

    public static void swap(List<Integer> data, int i, int j){
        int temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }

    public static void sort(List<Integer> data){
        for(int i = 0; i < data.size(); ++i){
            for(int f = 0; f < data.size()-i-1;  ++f){
                if (data.get(f) > data.get(f+1))
                    swap(data,f,f+1);
            }
        }
    }
}
