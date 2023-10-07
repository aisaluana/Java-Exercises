package entities;

public class Individual extends TaxPayer{
	
	//Regras de cálculo do imposto para Pessoa Física: pessoas cuja renda foi abaixo de 20000,00 pagam 15% de imposto. Pessoas com renda de 20000,00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
	//Por exemplo: uma pessoa cuja renda foi 50000,00 e teve 2000,00 em gastos com saúde,o imposto fica: (50000*25%)-(2000*50%)=11500,00
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		if(annualIncome<20000) {
				return (0.15 * getAnnualIncome()) - (0.5*healthExpenditures);
			
		} else {
				return (0.25 * getAnnualIncome()) - (0.5*healthExpenditures);	
		}
	}
	
	
	
}
