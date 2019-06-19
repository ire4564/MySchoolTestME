package Queue6주차;

public class ExponentialRandom extends java.util.Random { //지수 분포에 대한 난수 클래스
	private double mean;
	
	public ExponentialRandom(double mean) {
		super(System.currentTimeMillis());
		this.mean = mean;
	}
	public double nextDouble() {
		return - mean*Math.log(1.0-super.nextDouble());
	}
	public int nextInt() {
		return(int)Math.ceil(nextDouble());
		
	}

}