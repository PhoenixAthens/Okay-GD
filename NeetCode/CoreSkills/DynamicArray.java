package NeetCode.CoreSkills;

public class DynamicArray {
    private int[] mainArray;
    int tail = 0;
    public DynamicArray(int capacity) {
        mainArray = new int[capacity];
    }

    public int get(int i) {
        return mainArray[i];
    }

    public void set(int i, int n) {
        mainArray[i]=n;
    }

    public void pushback(int n) {
        if(tail==mainArray.length){
            int[] arr = new int[mainArray.length*2];
            int addAt = 0;
            for(int i: mainArray){
                arr[addAt++] = i;
            }
            mainArray = arr;
        }
        mainArray[tail++]=n;
    }

    public int popback() {
        int val =  mainArray[tail-1];
        tail--;
        return val;
    }

    private void resize() {
        int[] arr = new int[mainArray.length*2];
        int addAt = 0;
        for(int i: mainArray){
            arr[addAt++] = i;
        }
        mainArray = arr;
    }

    public int getSize() {
        return tail;
    }

    public int getCapacity() {
        return mainArray.length;
    }
}
