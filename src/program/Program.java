package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int repeat = sc.nextInt();

		for (int i = 1; i <= repeat; i++) {
			System.out.println("\nTax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (answer == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpendidures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpendidures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		System.out.println("TAXES PAID:\n");
		double sum=0.0;
		for(TaxPayer o: list) {
			System.out.println(o.getName()+": $ "+String.format("%.2f",o.Tax()));
			sum+=o.Tax();
		}
		System.out.println("\nTOTAL TAXES : "+ String.format("%.2f",sum));

		sc.close();
	}

}
