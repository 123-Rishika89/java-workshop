import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime registrationEndTime = LocalTime.of(18, 59, 59);
        int hoursLeft = registrationEndTime.getHour() - currentTime.getHour();
        int minuteLeft = registrationEndTime.getMinute() - currentTime.getMinute();
        int secondsLeft = registrationEndTime.getSecond() - currentTime.getSecond();
        System.err.println("You have"+ hoursLeft + "hours,"
                            + minuteLeft + "minutes, and "
                            + secondsLeft +"second left to register.");
    }

}
