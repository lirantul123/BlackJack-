import java.util.*;

public class BlackJack {
    public static Scanner in = new Scanner(System.in);

    // פונקציית לבדיקת *split*
    public static void split(int you, int you1){
        if (you == you1) {
            System.out.print("Do you want a split: ");
            String split = in.next();
            if (split.equals("yes") || split.equals("YES")){
                System.out.println();
            }
        }
    }

    // *פונקצייה *שמגרילה מספר רנדומלי בטווח 1-11
    public static int numbers(){
        int result = 1 + (int)(Math.random()*(11-1+1));
        return result;
    }

    // משתנים שמשומשים
    public static int diller, diller1, diller2, dillsum=0, dillsum1=0;
    public static int dillsum2=0, diller3, count2=0;
    public static int you, you1, you2, yousum=0, yousum1=0;
    public static int yousum2=0, you3, count3=0;
    public static int count=0, count1=0;
    public static String getcard;

    //static int sumOfMoney=0;

    // פונקצייה
    public static void yes() {

        diller = numbers();
        diller1 = numbers();
        dillsum=diller;
        you = numbers();
        you1 = numbers();
        yousum=you+you1;

        System.out.printf("Diller's hand: _%d_ _|_(+%d...);\n", diller, dillsum);
        System.out.printf("Your hand: _%d_ _%d_(+%d);\n\n", you, you1, yousum);
        split(you, you1);
        dillsum=diller+diller1;

        diller2 = numbers();
        you2 = numbers();

        System.out.println("Card? (write 'stop(s)' if you want to stop)");
        getcard=in.next();
        while(!(getcard.equals("s"))){
            System.out.printf("Diller's hand: _%d_ _%d_ _%d_(+%d);\n", diller, diller1, diller2, dillsum+diller2);
            System.out.printf("Your hand: _%d_ _%d_ _%d_(+%d);\n", you, you1, you2, yousum+you2);

            dillsum1 = dillsum+diller2;
            yousum1 = yousum+you2;
            checkifSECOND Y = new checkifSECOND();
            Y.checkingifFirst(dillsum1,yousum1);

            second();
        }
    }

    // פונקצייה
    public static void second1(){

        checkifSECOND B = new checkifSECOND();
        B.checkifSecond(count, count1);

        int diller4 = numbers();
        int you4  = numbers();

        //another();
        count2 = count+diller4;
        count3= count1+you4;

        B.checkifThird(count2, count3);

        while(!(getcard=="s")){
            System.out.printf("Diller's hand: (+%d);\n", count2);
            System.out.printf("Your hand: (+%d);\n\n", count3);

            B.checkifThird(count2, count3);

            // System.out.print("Card? ");
            // getcard=in.next();
        }
        checkifSECOND.checkifThird(count2, count3);
    }

    // פונקצייה
    //public static void another(){
    //    int dillernext = numbers();
    //    int younext = numbers();

    //    count+=dillernext;
    //    count1=younext;
    //}

    // פונקצייה
    public static void second(){
        checkifSECOND A = new checkifSECOND();
        while(A.checkingifFirst(dillsum1,yousum1)){
            System.out.println("Card? (write 'stop(s)' if you want to stop)");
            getcard=in.next();
            diller3 = numbers();
            you3 = numbers();
            int count = diller+diller1+diller2+diller3;
            int count1 = you+you1+you2+you3;
            while(!(getcard=="s")){
                System.out.printf("Diller's hand: _%d_ _%d_ _%d_ _%d_(+%d);\n", diller, diller1, diller2, diller3, count);
                System.out.printf("Your hand: _%d_ _%d_ _%d_ _%d_(+%d);\n\n", you, you1, you2, you3, count1);
                checkifSECOND B = new checkifSECOND();
                B.checkifSecond(count, count1);

                System.out.print("Card? ");
                getcard=in.next();
                second1();
            }
        }
    }
    // פונקצייה ראשית
    public static void main(String[] args) {
        LoginPass a = new LoginPass();
        a.fun();

    }
}