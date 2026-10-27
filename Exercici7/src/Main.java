//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner llegir = new Scanner(System.in);
    int[] dades = new int[8];

    System.out.println("Introdueix 8 nombres enters per a l'array:");
    for (int i = 0; i < dades.length; i++) {
        System.out.print("Valor " + (i + 1) + ": ");
        dades[i] = llegir.nextInt();
    }

    System.out.print("\nIntrodueix el valor que vols comptar: ");
    int valorCercat = llegir.nextInt();

    int indexTrobat = -1;
    for (int i = 0; i < dades.length; i++) {
        if (dades[i] == valorCercat) {
            indexTrobat = i;

        }
    }

    System.out.println("\n--- Resultat ---");
    if (indexTrobat != -1) {
        System.out.println("Resultat: índex " + indexTrobat + ".");
    } else {
        System.out.println("No trobat");
    }

}
