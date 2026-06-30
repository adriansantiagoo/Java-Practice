package ProgrammingLogic.StockPeakDetector_system;

public class Detector {
    private int[] array;

    public Detector(int[] array){
        if (array == null){
            throw new IllegalArgumentException("The array cannot be null.");
        }
        if (array.length == 0){
            throw new IllegalArgumentException("The array cannot be empty.");
        }
        if (array.length == 1){
            throw new IllegalArgumentException("The array cannot have only 1 integer.");
        }
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int[] findPeaks(){
        int newArrayLength = 0;

        for (int i = 0; i < this.array.length; i++){
            if (isPeak(i)){
                newArrayLength++;
            }
        }

        int[] newArray = new int[newArrayLength];
        int resultIndex = 0;

        for (int i = 0; i < this.array.length; i++){
            if (isPeak(i)){
                newArray[resultIndex] = i;
                resultIndex++;
            }
        }

        return newArray;
    }

    private boolean isPeak(int index){
        if (index == 0){
            return this.array[index] > this.array[index + 1];
        }
        else if (index == this.array.length - 1){
            return this.array[index] > this.array[index - 1];
        }
        return this.array[index] > this.array[index + 1] && this.array[index] > this.array[index - 1];
    }
}
