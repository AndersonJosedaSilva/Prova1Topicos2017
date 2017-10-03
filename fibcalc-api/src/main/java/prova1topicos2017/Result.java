package prova1topicos2017;


public class Result {

	private int number=6;
	private int fibonacci=8;
	private int value;

	public int getNumber() {
		return number;
	}

	public void setNumber(int lo) {
		this.number = number;
	}

	public Result withLo(int number) {
		this.number = number;
		return this;
	}

	public int getFibonacci() {
		return fibonacci;
	}

	public void setFibonacci(int fibonacci) {
		this.fibonacci = fibonacci;
		
	}

	public Result withFibonacci(int fibonacci) {
		this.fibonacci = fibonacci;
		return this;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Result withValue(int value) {
		this.value = value;
		return this;
	}

}

