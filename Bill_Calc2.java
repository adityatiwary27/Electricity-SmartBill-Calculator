import java.util.*;


public class Bill_Calc2 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Consumer Name : ");
        String name = sc.nextLine();
        System.out.println("Choose Connection Type:");
        System.out.println("1. Household");
        System.out.println("2. Commercial");
        int choice = sc.nextInt();
        System.out.println("Enter number of units consumed : ");
        double units = sc.nextDouble();
        double energy_charges = 0.0;
        double fixed_charges = 0.0;
        double duty = 0.0;
        double total = 0.0;

        //If Consumer chooses Household Connection
        if(choice == 1)
        {
            if(units >= 0 && units <=100)
            {
                energy_charges = 0.0;
            }
            else if (units > 100 && units<=300)
            {
                energy_charges = (units - 100)*3.75;
            }
            else if (units > 300 && units<=450)
            {
                energy_charges = (200*3.75) + ((units - 300)*6.20);
            }
            else
            {
                energy_charges = (150*6.20) + (200*3.75) + ((units - 450)*7.50);
            }
            fixed_charges = 50.0;
            double fuel_adj_charges = 0.50 *units;
            duty = 0.05 * energy_charges;
            total =  energy_charges + fixed_charges + fuel_adj_charges + duty;
            System.out.println("\n====================================================");
            System.out.println("                    ELECTRICITY BILL                ");
            System.out.println("====================================================");
            System.out.println("Consumer Name: " + name);
            System.out.println("Connection Type: Household");
            System.out.println("Units Consumed: " + units);
            System.out.println();
            System.out.println("----------------------------------------------------");
            System.out.println("                     BILL BREAKDOWN                 ");
            System.out.println("----------------------------------------------------");
            System.out.println("Fixed Charges: " + fixed_charges);
            System.out.println("Energy Charges: " + energy_charges);
            System.out.println("Fuel Adjustment Charges: " + fuel_adj_charges);
            System.out.println("Duty: " + duty);   

            System.out.println("----------------------------------------------------");
            System.out.println("TOTAL AMOUNT PAYABLE: ₹ " + total);
            System.out.println("====================================================");
        }

        //If Consumer chooses Commercial Connection
        else if(choice == 2)
        {
            if(units >= 0 && units <=150)
            {
                energy_charges = 0.00;
            }
            else if (units > 150 && units<=400)
            {
                energy_charges = (units - 150)*7.75;
            }
            else if (units > 400 && units<=600)
            {
                energy_charges = (250*7.75) + ((units - 400)*8.15);
            }
            else
            {
                energy_charges = (200*8.15) + (250*7.75) + ((units - 600)*12.00);
            }
            fixed_charges = 150.0;
            double fuel_adj_charges = 1.00 *units;
            duty = 0.10 * energy_charges;
            double gst = 0.18 * (energy_charges + fixed_charges);
            total =  energy_charges + fixed_charges + fuel_adj_charges + duty + gst;
            System.out.println("\n====================================================");
            System.out.println("                    ELECTRICITY BILL                ");
            System.out.println("====================================================");
            System.out.println("Consumer Name: " + name);
            System.out.println("Connection Type: Household");
            System.out.println("Units Consumed: " + units);
            System.out.println();
            System.out.println("----------------------------------------------------");
            System.out.println("                     BILL BREAKDOWN                 ");
            System.out.println("----------------------------------------------------");
            System.out.println("Fixed Charges: " + fixed_charges);
            System.out.println("Energy Charges: " + energy_charges);
            System.out.println("Fuel Adjustment Charges: " + fuel_adj_charges);
            System.out.println("Duty: " + duty);   
            System.out.println("GST: " + gst);

            System.out.println("----------------------------------------------------");
            System.out.println("TOTAL AMOUNT PAYABLE: ₹ " + total);
            System.out.println("====================================================");
        }
        else
        {
            System.out.println("Invalid Connection Type Selected.");
        }
    }    
}
