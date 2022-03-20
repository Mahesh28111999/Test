package overload1;

class BOM {
	float getofInt() {
		return 0;
	}
}

class SBI extends BOM {
	float getofInt() {
		return 25.22f;

	}
}

public class Main {
	public static void main(String[] args) {
		SBI bank = new SBI();
		System.out.println(bank.getofInt());

		BOM bankb = new BOM();
		System.out.println(bankb.getofInt());

	}
}






