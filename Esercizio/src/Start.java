public class Start {
    public static void main(String[] args) {
        //Valori: 2.15 - 50 - 95.02 - 100.01
        CheckScore prova = new CheckScore();
        try{
            prova.checkScore(101.01);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Score is out of scale!");
        }
    }
}
