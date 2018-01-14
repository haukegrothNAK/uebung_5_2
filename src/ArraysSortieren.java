
public class ArraysSortieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Zufallsarray[] = Zufall.erzeugeIntArray(10);
		System.out.println("Zufallsarray:");
		for (int x = 0; x < 10; x++) {
			System.out.println(x + ": " + Zufallsarray[x]);
		}
		
		for (int y = 0; y < Zufallsarray.length; y++) {
			kleinsteVorne(Zufallsarray, y);
		}
		System.out.println("");
		System.out.println("geordneter Zufallsarray:");
		for (int x = 0; x < 10; x++) {
			System.out.println(x + ": " + Zufallsarray[x]);
		}
	}

	public static void kleinsteVorne(int[] array, int StartPosition) {
		int kleinsteZahl = array[StartPosition];
		int kleinsteZahlPosition = StartPosition;

		for (int x = StartPosition; x < array.length; x++) {
			if (kleinsteZahl > array[x]) {
				kleinsteZahl = array[x];
				kleinsteZahlPosition = x;
			}
		}
		int bisherkleinsteZahl = array[StartPosition];
		array[StartPosition] = kleinsteZahl;
		array[kleinsteZahlPosition] = bisherkleinsteZahl;
	}
}
