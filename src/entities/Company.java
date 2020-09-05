package entities;

public class Company extends TaxPayer {
	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double Tax() {
		double sum = getAnualIncome();
		if(getNumberOfEmployees()>10) {
			sum = sum*0.14;
			return sum;
		}else {
			sum =sum*0.16;
			return sum;
		}
		
	}

}
