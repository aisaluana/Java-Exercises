package entities;

public class Company extends TaxPayer{
	//Pessoa Jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto
	
	private int numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax(Double taxes) {
		if (numberOfEmployees <=10) {
			taxes = annualIncome * 0.16;
		} else {
			taxes = annualIncome * 0.14;
		}
		return taxes;
	}
	
	
}
