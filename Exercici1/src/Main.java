//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner llegir = new Scanner(System.in);

    int [] nums = new int[5];

    for (int i = 0 ; i < nums.length ; i++ ){
        System.out.println("Introdueix cinc nombres enters");
        nums[i] = llegir.nextInt();
    }
    for (int i = 0 ; i < nums.length ; i++ ){
        System.out.println( i + nums[i]);
    }
    System.out.println(nums.length + ". Primer valor: " + nums[0] + ". Últim valor: " + nums[nums.length - 1] );

}
