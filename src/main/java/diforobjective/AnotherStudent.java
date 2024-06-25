package diforobjective;

public class AnotherStudent {
	int id;
	public void setId(int id) {
		this.id = id;
	}

	public void setMcheat(MathCheat mcheat) {
		this.mcheat = mcheat;
	}

	MathCheat mcheat;
	
	public void cheating() {
		System.out.println("DI for another student objective typeis::");
		mcheat.mathcheat();
	}
}
