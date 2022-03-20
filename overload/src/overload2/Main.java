package overload2;

class EMP {
	public int empInfo(int x, int y) {
		return (x + y);
	}

	public double empInfo(double g, double u) {
		return (g + u);
	}

	public String empInfo(String name, String fullname) {
		return (name + fullname);

	}
}

public class Main {
	public static void main(String[] args) {
		EMP ob = new EMP();

		System.out.println(ob.empInfo(20, 25));
		System.out.println(ob.empInfo(85.22, 55.25));
		System.out.println(ob.empInfo("Urmi", "Bhowar"));

	}
}