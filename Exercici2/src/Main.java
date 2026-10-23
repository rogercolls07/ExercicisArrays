//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner llegir = new Scanner(System.in);

    int nums []  = new int[6];

    for (int i = 0 ; i < nums.length; i++){
        System.out.println("Introdueix un nombre enter: ");
        nums[i] = llegir.nextInt();
    }

    System.out.println("Recorregut invers:");

    for (int j = nums.length - 1 ; j >= 0  ; j--){
        System.out.println(nums[j]);
    }

    System.out.println("Recorregut original posterior:");

    for (int i = 0 ; i < nums.length ; i++){
        System.out.println(nums[i]);
    }
}
