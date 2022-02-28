import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjArr = {"lacking", "bustling", "jealous", "thirsty", "plucky", "fortunate", "classy", "naive", "tasty", "fair"};
    public static String[] nounArr = {"wealth", "hate", "cough", "table", "support", "grass", "paper", "lace", "thumb", "hope"};

    public static String randomArrElem(String[] stringArr) {
        Random rand = new Random();
        int upperbound = stringArr.length;
        int randomNum = rand.nextInt(upperbound);
        return stringArr[randomNum];
    }

    public static void main(String[] args) {
        System.out.printf("Your server name is %s-%s", randomArrElem(adjArr), randomArrElem(nounArr));
    }
}
