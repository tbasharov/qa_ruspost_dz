package DZ_1;

public class prime_check {
    public int number;
    public boolean check = true;

    public prime_check(int num){
        number = num;
    }
    public boolean checkNum(){
        for(int i =2; i<number; i++){
            if(number%i==0){
                check = false;
                break;
            }
        } return check;
    }
}
