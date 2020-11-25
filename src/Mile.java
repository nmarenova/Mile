public class Mile {
    public static void main(String[] args) {
        float ticketPrice = 540;
        float mile = 0;
        if (ticketPrice >= 20) {
            mile = ticketPrice / 20;
        } else {
            mile = 0;
        }
        System.out.println(mile);
    }
}
