import java.util.Scanner;

class OxygenProduction {
    private double length;
    private double breadth;
    private int plantArea;

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void setPlantArea(int plantArea) {
        this.plantArea = plantArea;
    }

    public double calculatePlants() {
        if (length <= 0) {
            System.out.println("Invalid length");
            return -1;
        }
        if (breadth <= 0) {
            System.out.println("Invalid breadth");
            return -1;
        }
        if (plantArea <= 0) {
            System.out.println("Invalid plant area");
            return -1;
        }

        double roomArea = length * breadth;
        double plantAreaInMeters = plantArea / (100.0 * 100.0);
        int totalPlants = (int) (roomArea / plantAreaInMeters);
        totalPlants = totalPlants - (totalPlants % 10); // Round down to nearest multiple of 10
        return totalPlants;
    }

    public double calculateOxygenProduction(int totalPlants) {
        return totalPlants * 0.9; // 0.9 litres of oxygen per plant per day
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the room(in m)");
        double length = scanner.nextDouble();

        if (length <= 0) {
            System.out.println("Invalid length");
            return;
        }

        System.out.println("Enter the breadth of the room(in m)");
        double breadth = scanner.nextDouble();

        if (breadth <= 0) {
            System.out.println("Invalid breadth");
            return;
        }

        System.out.println("Enter the plant area of a single plant(in cm2)");
        int plantArea = scanner.nextInt();

        if (plantArea <= 0) {
            System.out.println("Invalid plant area");
            return;
        }

        OxygenProduction oxygenProduction = new OxygenProduction();
        oxygenProduction.setLength(length);
        oxygenProduction.setBreadth(breadth);
        oxygenProduction.setPlantArea(plantArea);

        double totalPlants = oxygenProduction.calculatePlants();
        if (totalPlants != -1) {
            System.out.println("Total number of plants is " + (int) totalPlants);

            double totalOxygen = oxygenProduction.calculateOxygenProduction((int) totalPlants);
            System.out.printf("Total oxygen production is %.2f litres", totalOxygen);
        }
    }
}
