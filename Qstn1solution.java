public class Qstn1 {
    public static void main(String[] args) {
        double answer = solve();
        System.out.println("Answer : " + Math.round(answer));
    }

    public static double solve() {
        double x = 0;
        for(int i = 1 ; i <= 89 ; i++){
            x += Math.log10(Math.tan(Math.toRadians(i)));
        }
        return x;
    }
}
