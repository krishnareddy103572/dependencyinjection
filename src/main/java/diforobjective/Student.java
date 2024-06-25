package diforobjective;

public class Student {
	
	MathCheat mc ;
	int id;
	public void setId(int id) {
		this.id = id;
	}
	
	public void setMc(MathCheat mc) {
		this.mc = mc;
	}

	public void cheating() {
		System.out.println("DI for student objective typeis::");
		mc.mathcheat();
	}

}
