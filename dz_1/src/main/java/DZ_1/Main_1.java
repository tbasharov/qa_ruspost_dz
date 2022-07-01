package DZ_1;

public class Main_1 {
    public static void main(String[] args){
        double[] arr = new double[10];
        for (int i=0;i<arr.length;i++) {
            arr[i]=Math.random();
            // System.out.println(arr[i] + "  ");
        }
        double min_num=arr[0];
        double max_num=arr[0];
        double average=0.0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < min_num) {
                min_num = arr[i];
            }
            average =average+ arr[i];
            max_num = Math.max(max_num, arr[i]); // или можно просто юзать метод
        }
        average = average/10;
        System.out.println("Min: "+ min_num + "  ");
        System.out.println("Average: "+ average + "  ");
        System.out.println("Max: "+ max_num + "  ");
    }
}
