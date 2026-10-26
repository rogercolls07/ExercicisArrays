//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner llegir = new Scanner(System.in);
    int[] dades = new int[7];

    // 1. Llegir els 7 enters i desar-los a l'array
    System.out.println("Introdueix 7 nombres enters:");
    for (int i = 0; i < dades.length; i++) {
        System.out.print("Valor " + (i + 1) + ": ");
        dades[i] = llegir.nextInt();
    }

    // 2. Inicialitzar els valors extrems i els seus índexs amb el primer element (posició 0)
    int maxim = dades[0];
    int indexMaxim = 0;

    int minim = 10000;
    int indexMinim = 0;

    // 3. Recórrer l'array per trobar els extrems
    for (int i = 0; i < dades.length; i++) {
        // Fem servir '>' estricte per mantenir el Primer índex on apareix el màxim
        if (dades[i] > maxim) {
            maxim = dades[i];
            indexMaxim = i;
        }

        // Fem servir '<' estricte per mantenir el Primer índex on apareix el mínim
        if (dades[i] < minim) {
            minim = dades[i];
            indexMinim = i;
        }
    }

    // 4. Mostrar els resultats
    System.out.println("\n--- Resultats ---");
    System.out.println("Màxim: " + maxim + ", a l'índex " + indexMaxim + ".");
    System.out.println("Mínim: " + minim + ", a l'índex " + indexMinim + ".");

}
