package taschenrechnerS1;

public class Rechnungen {

	private int zahl1;
	private int zahl2;
	private int erg;

	public int getZahl1() {
		return this.zahl1;
	}

	public int getZahl2() {
		return this.zahl2;
	}

	public int getErg() {
		return this.erg;
	}

	public void setZahl1(int zahl1) {
		this.zahl1 = zahl1;
	}

	public void setZahl2(int zahl2) {
		this.zahl2 = zahl2;
	}

	public void setErg(int erg) {
		this.erg = erg;
	}
	public int addition() {
		erg = this.zahl1 + this.zahl2;
		return erg;
	}

	public int subtraction() {
		erg = this.zahl1 - this.zahl2;
		return erg;
	}

	public int multiplication() {
		erg = this.zahl1 * this.zahl2;
		return erg;
	}

	public int division() {
		erg = this.zahl1 / this.zahl2;
		return erg;
	}
	public int sum() {
		int j = 0;
		for (int i = this.zahl1; i <= this.zahl2; i++) {
			j += i;
		}
		erg = j;
		return erg;
	}
	public int prod() {
		int j = 1;
		for (int i = this.zahl1; i <= this.zahl2; i++) {
			j *= i;
		}
		erg = j;
		return erg;
	}
	public int quer() {
		int i = 0;
		while (0 != this.zahl1) {
			i += (this.zahl1 % 10);
			this.zahl1 = this.zahl1 / 10;
		}
		erg = i;
		return erg;
	}
	public int prim() {
		int i = this.zahl1;
		for(int n = 2; n < i;) {
			if(i % n != 0) {
				n++;
			}
			else {
				i--;
				n = 2;
			}
		}
		erg = i;
		return erg;
	}
	
}
