public class checkifSECOND extends BlackJack{

    public static boolean checkingifFirst(int dillsum1, int yousum1) {
        while (dillsum1>0 && yousum1>0){
            if (dillsum1>=21 && yousum1>=21){
                System.out.println("Tie");
                return false;
            } if (dillsum1>21 && yousum1<=21){
                System.out.println("You have won");
                return false;
            } if (dillsum1<=21 && yousum1>21) {
                System.out.println("The diller has won");
                return false;
            } if (dillsum1<21 && yousum1<21) {
                //sumOfMoney+=money%10+money;
                return true;
            }
        }
        return false;
    }

    public static boolean checkifSecond(int count, int count1){
        while (count>0 && count1>0){
            if (count>=21 && count1>=21){
                System.out.println("Tie");
                return false;
            } if (count>21 && count1<=21){
                System.out.println("You have won");
                return false;
            } if (count<=21 && count1>21) {
                System.out.println("The diller has won");
                return false;
            } if  (count<21 && count1<21) {
                //sumOfMoney+=money%10+money;
                return true;
            }
        }
        return false;
    }

    public static boolean checkifThird(int count2, int count3){
        while (count2>0 && count3>0){
            if (count2>=21 && count3>=21){
                System.out.println("Tie");
                return false;
            } if (count2>21 && count3<=21){
                System.out.println("You have won");
                return false;
            } if (count2<=21 && count3>21) {
                System.out.println("The diller has won");
                return false;
            } if (count2<21 && count3<21){
                //sumOfMoney+=money%10+money;
                return true;
            }
        }
        return false;
    }
    /**
    public static boolean checkifFour(int count2, int count3){
        while (count2>0 && count3>0){
            if (count2>=21 && count3>=21){
                System.out.println("Tie");
                return false;
            } else if (count2>21 && count3<=21){
                System.out.println("You have won");
                return false;
            } else if (count2<=21 && count3>21) {
                System.out.println("The diller has won");
                return false;
            } else{
                //sumOfMoney+=money%10+money;
                return true;
            }
        }
        return false;
    }
    **/
}
