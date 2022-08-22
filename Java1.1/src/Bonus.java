public class Bonus {
    public static void main (String[] args) {
      int balance = 350;
      int refil = 2700;
        if (refil<= 0){
            System.out.println(balance);}
        if (refil < 1000){
            System.out.println(balance + refil);}
        else {
            int bonus = (balance + refil)/100;
            int user_balanse = balance+refil+bonus;
            System.out.println("Your balance: "+ user_balanse);
            System.out.println("Of these bonuses: "+ bonus);}
    }
}