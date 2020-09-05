package entities;

public class Individual extends TaxPayer {
	private Double healthExpendidures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpendidures) {
		super(name, anualIncome);
		this.healthExpendidures = healthExpendidures;
	}

	public Double getHealthExpendidures() {
		return healthExpendidures;
	}

	public void setHealthExpendidures(Double healthExpendidures) {
		this.healthExpendidures = healthExpendidures;
	}

	@Override
	public Double Tax() {
		double sum = getAnualIncome();
		double health= getHealthExpendidures();
		if (sum < 20000.00) {
			sum =  (sum * 0.15) - (health /2);
			return sum;
		} else {			
			sum = (sum * 0.25) - (health /2);
			return sum;
		}

	}

	
}
