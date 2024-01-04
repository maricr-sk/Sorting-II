public class MergeSort implements Sort{

    private int [] data;

    public MergeSort(int [] data){
        this.data = data;
    }

    @Override public void sort(){
        sort(0, data.length-1);
    }

    private void sort(int leftIndex, int rightIndex){

    }

}
