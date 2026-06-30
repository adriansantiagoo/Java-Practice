package ProgrammingLogic.SortingBelt_system;

public class Belt {
    private Package[] slots;

    public Belt(Package[] initialSlots) {
        if (initialSlots.length % 2 == 0) {
            throw new IllegalArgumentException("Belt length must be an odd number.");
        }
        if (initialSlots.length < 3){
            throw new IllegalArgumentException("Belt length cannot be less than 3.");
        }

        // I used this for copy the entire array and
        // external code cannot still modify my internal array
        // This is used so that changes don't happen
        // without my permission
        this.slots = new Package[initialSlots.length];          // 1. Build a new empty array in memory
        for (int i = 0; i < initialSlots.length; i++) {
            this.slots[i] = initialSlots[i];                    // 2. Manually copy the values over
        }
    }

    public boolean verifyWeightLimit() {
        for (int i = 0; i < this.slots.length - 1; i++){

            int currentWeight = 0;
            if (this.slots[i] != null){
                currentWeight = this.slots[i].getWeight();
            }

            int nextWeight = 0;
            if (this.slots[i + 1] != null){
                nextWeight = this.slots[i + 1].getWeight();
            }

            if (currentWeight + nextWeight > 15){
                return false;
            }
        }
        return true;
    }

    public boolean verifyBalanceDifference() {
        int pivot = this.slots.length / 2;

        int firstSum = 0;
        for (int i = 0; i < pivot; i++){
            if (this.slots[i] != null){
                firstSum += this.slots[i].getWeight();
            }
        }

        int secondSum = 0;
        for (int i = pivot + 1; i < this.slots.length; i++){
            if (this.slots[i] != null){
                secondSum += this.slots[i].getWeight();
            }
        }

        int difference = firstSum - secondSum;

        if (difference < 0){
            difference *= -1;
        }
        return difference <= 10;
    }

    public boolean verifyFragilityConstraints(){
        for (int i = 0; i < this.slots.length - 1; i++){
            if ( (this.slots[i] == null) || (this.slots[i + 1] == null) ){
                continue;
            }
            if (this.slots[i].isFragile() && this.slots[i + 1].getWeight() > 10){
                return false;
            }
            if (this.slots[i].getWeight() > 10 && this.slots[i + 1].isFragile()){
                return false;
            }
        }
        return true;
    }

    public Package[] getSlots() {
        Package[] slotsCopy = new Package[this.slots.length];       // 1. Build a new array
        for (int i = 0; i < this.slots.length; i++) {
            slotsCopy[i] = this.slots[i];       // 2. Fill it with your private data
        }
        return slotsCopy;                                   // 3. Hand over the copy
    }
}
