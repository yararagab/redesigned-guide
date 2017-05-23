package depreciation;

import java.util.Scanner;

public class Depreciation {
	
		public static void main(String[] args) {
			
			System.out.println("Enter the number of units the machine produce every year:");
			Scanner c = new Scanner(System.in); 
			int units_per_year = c.nextInt();
			
			System.out.println("Enter the rate of depreciation of the machine per unit");  
			
			// Entered number must be between 0 and 1 as its a rate else the program will give an error message
			
			Scanner b = new Scanner(System.in);
			double rate_per_unit = b.nextDouble();
			
			if (rate_per_unit <0 || rate_per_unit >1)
					System.out.println("Error");
			
			System.out.println("Enter the number of years this machine will work efficiently");
			Scanner a = new Scanner(System.in);
			int yearsWorking = a.nextInt();
			
			int currentYear=0;
			int remainingUnitsAfterDepreciation=units_per_year;
			int depreciationThisYear;
			
			while(currentYear < yearsWorking){
				
				if( currentYear <= yearsWorking && remainingUnitsAfterDepreciation<=1){
					System.out.println("The machine stopped working earlier than its supposed time");
					break;
				} 	
				
				currentYear++;
				depreciationThisYear= (int) (remainingUnitsAfterDepreciation*rate_per_unit);
				
			    remainingUnitsAfterDepreciation = remainingUnitsAfterDepreciation - depreciationThisYear ;
						
			System.out.println("Year " +currentYear+ ": the depreciation is " +depreciationThisYear+ " units & number of units produced is " +remainingUnitsAfterDepreciation);
				
				
				
				
			}
			
			
			
		

		
		}

	}

