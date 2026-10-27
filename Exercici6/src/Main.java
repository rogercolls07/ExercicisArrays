//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner llegir = new Scanner(System.in);
    int[] dades = new int[8];

    // 1. Llegir els 8 enters i desar-los a l'array
    System.out.println("Introdueix 8 nombres enters per a l'array:");
    for (int i = 0; i < dades.length; i++) {
        System.out.print("Valor " + (i + 1) + ": ");
        dades[i] = llegir.nextInt();
    }

    // 2. Llegir el valor que es vol cercar
    System.out.print("\nIntrodueix el valor que vols cercar: ");
    int valorCercat = llegir.nextInt();

    // 3. Realitzar la cerca lineal
    int indexTrobat = -1; // Usem -1 per representar inicialment que no s'ha trobat
    for (int i = 0; i < dades.length; i++) {
        if (dades[i] == valorCercat) {
            indexTrobat = i; // Guardem l'índex de la coincidència
            break;           // Sortim del bucle per quedar-nos amb la *primera* aparició
        }
    }

    // 4. Mostrar el resultat
    System.out.println("\n--- Resultat ---");
    if (indexTrobat != -1) {
        System.out.println("Resultat: índex " + indexTrobat + ".");
    } else {
        System.out.println("No trobat");
    }

}
