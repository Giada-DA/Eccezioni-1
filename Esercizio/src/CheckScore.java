public class CheckScore {
    public double score;
    //Valori: 2.15 - 50 - 95.02 - 100.01
    public void checkScore(double score) throws ArithmeticException{
        if (0 < score && score <= 50.00){
            System.out.println("Average score");
        } else if (50.00 < score && score <= 100.00) {
            System.out.println("Very good score");
        }else throw new ArithmeticException();
    }
}
