package design.pattern.templateMethod;

public class TestTemplateMethod {
	
	static Beverage beverage = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Beverage tea = new Tea();
		tea.prepareRecepie();
		Beverage coffie = new Coffie();
		coffie.prepareRecepie();
	}

}
