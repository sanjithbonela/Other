
public class Calculator {
	private int number1;
	private int number2;
	private char typeofop;
	private int result;
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public char getTypeofop() {
		return typeofop;
	}
	public void setTypeofop(char typeofop) {
		this.typeofop = typeofop;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public void performCalculation(){
		if(typeofop=='+'){
			//System.out.println("val " + typeofop + " " + number1  );
			setResult(number1+number2);
		}
		
		else if(typeofop=='-') setResult(number1-number2);
		else if(typeofop=='*') setResult(number1*number2);
		else if(typeofop=='/') setResult(number1/number2);
		
		//System.out.println("val 1" + typeofop + " " + number1  );
		//setResult(number1+number2);
	}
	
}
