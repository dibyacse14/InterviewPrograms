package com.dibya.array;

public class PetrolPumpTour {
    static class PetrolPump
    {
        int petrol;
        int distance;

        // constructor
        public PetrolPump(int petrol, int distance)
        {
            this.petrol = petrol;
            this.distance = distance;
        }
    }
    static int tour(PetrolPump p[],int n){
        int start=0,fuelShotage=0,fuelTank=0;
        for(int i=0; i<n ; i++){
            fuelTank = fuelTank + (p[i].petrol-p[i].distance);
            if(fuelTank<0){
                fuelShotage = fuelShotage+fuelTank;
                start = i+1;
                fuelTank = 0;
            }
        }
        if(fuelTank+fuelShotage >= 0){
            return start;
        }

        return -1;
    }

    public static void main(String[] args) {
        PetrolPumpTour.PetrolPump[] arr = {new PetrolPumpTour.PetrolPump(6, 4),
                new PetrolPumpTour.PetrolPump(3, 6),
                new PetrolPumpTour.PetrolPump(7, 3)};

        int start = tour(arr, arr.length);

        System.out.println(start == -1 ? "No Solution" : "Start = " + start);
    }
}
