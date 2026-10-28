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

    // 2. Llegir el valor que es vol comptar
    System.out.print("\nIntrodueix el valor que vols comptar: ");
    int valorCercat = llegir.nextInt();

    // 3. Recórrer l'array per processar totes les coincidències
    int comptador = 0;
    StringBuilder indexsStr = new StringBuilder(); // Només per formatar la sortida en text

    for (int i = 0; i < dades.length; i++) {
        if (dades[i] == valorCercat) {
            // Si no és el primer índex que trobem, afegim una coma i un espai abans
            if (comptador > 0) {
                indexsStr.append(", ");
            }
            indexsStr.append(i);
            comptador++;
        }
    }

    // 4. Mostrar el resultat segons si s'ha trobat o no
    System.out.println("\n--- Resultat ---");
    if (comptador > 0) {
        System.out.println("Índexs: " + indexsStr.toString() + ". Total: " + comptador + ".");
    } else {
        System.out.println("Cap coincidència. Total: 0.");
    }

}
