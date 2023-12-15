public class PA_Three_PredictTutionFee {
    public static void main(String[] args) {
        int tutionFee = 10000;
        int doubleTutionFee = tutionFee * 2;
        int year = 0;
        while(tutionFee < doubleTutionFee){
            tutionFee = tutionFee + (tutionFee*7/100);
            year++;
        }

        System.out.println("Your tution fee will be dobled in "+year+" years");
    }
}
