//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner llegir = new Scanner(System.in);
    int[] dades = new int[8];

    // Comptadors per a cada categoria
    int positius = 0;
    int negatius = 0;
    int zeros = 0;

    // 1. Llegir els 8 enters i desar-los a l'array
    System.out.println("Introdueix 8 nombres enters:");
    for (int i = 0; i < dades.length; i++) {
        System.out.println("Valor " + (i + 1) + ": ");
        dades[i] = llegir.nextInt();
    }

    // 2. Recórrer l'array per comptar positius, negatius i zeros
    for (int i = 0; i < dades.length; i++) {
        if (dades[i] > 0) {
            positius++;
        } else if (dades[i] < 0) {
            negatius++;
        } else {
            zeros++;
        }
    }

    // 3. Mostrar els resultats
    System.out.println("\n--- Resultats ---");
    System.out.println("Positius: " + positius);
    System.out.println("Negatius: " + negatius);
    System.out.println("Zeros: " + zeros);

    // Verificació opcional (la suma ha de ser 8)
    System.out.println("Total elements comptats: " + (positius + negatius + zeros));


}

