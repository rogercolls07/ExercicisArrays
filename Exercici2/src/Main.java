//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner llegir = new Scanner(System.in);

    int nums []  = new int[6];

    for (int i = 0 ; i < nums.length; i++){
        System.out.println("Introdueix un nombre enter: ");
        nums[i] = llegir.nextInt();
    }
    for (int j = nums.length - 1 ; j > -1 ; j--){
        System.out.println(nums[j]);
    }


}
