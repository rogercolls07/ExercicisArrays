void main() {
    Scanner llegir = new Scanner(System.in);

    int a [] = new int[5];
    System.out.println("Array a");
    System.out.println("Introdueix cinc nombres enters");
    for (int i = 0 ; i < a.length ; i++){
        System.out.println("Introdueix un nombre: ");
        a[i] = llegir.nextInt();
    }

    System.out.println("Array b");
    System.out.println("Introdueix cinc nombres enters");
    int b [] = new int[5];

    for (int i = 0 ; i < b.length ; i++){
        System.out.println("Introdueix un nombre: ");
        b[i] = llegir.nextInt();
    }

    int resultat[] = new int[5];
    for (int i = 0; i < resultat.length; i++) {
        resultat[i] = a[i] + b[i];
    }


    System.out.println("\nArray a: ");
    for (int j = 0 ; j < a.length ; j++ ){
        System.out.println(a[j]);
    }


    System.out.println("\nArray b:");
    for (int j = 0 ; j < b.length ; j++ ){
        System.out.println(b[j]);
    }


    System.out.println("\nResultat: ");
    for (int j = 0 ; j < resultat.length ; j++ ){
        System.out.println(resultat[j]);
    }
}