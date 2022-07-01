package DZ_1;

public class Main_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        boolean check_num;
        for (int i=0;i<arr.length;i++) {
            int arr_num;
            do {
                 arr_num = (int) (Math.random() * (100 - 2) + 2);
                 prime_check prime = new prime_check(arr_num);
                 check_num = prime.checkNum();
            } while (!check_num);
            arr[i]=arr_num;
            System.out.println(arr[i] + "  ");
        }
    }
}
