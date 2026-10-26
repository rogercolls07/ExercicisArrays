//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner llegir = new Scanner(System.in);
    double[] dades = new double[5];
    double suma = 0;

    // 1. Llegir els 5 enters i desar-los a l'array
    System.out.println("Introdueix 5 nombres enters:");
    for (int i = 0; i < dades.length; i++) {
        System.out.print("Valor " + (i + 1) + ": ");
        dades[i] = llegir.nextDouble();
    }

    // 2. Recórrer l'array per calcular la suma (acumulador)
    for (int i = 0; i < dades.length; i++) {
        suma += dades[i];
    }

    // 3. Calcular la mitjana evitant la divisió entera
    // Multipliquem per 1.0 per convertir el resultat a double
    double mitjana = suma * 1.0 / dades.length;

    // 4. Mostrar resultats
    System.out.println("\n--- Resultats ---");
    System.out.println("Suma: " + suma);
    System.out.println("Mitjana: " + mitjana);

}