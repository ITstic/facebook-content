package blog.itstic.mistake_attitude;

import java.util.Scanner;

public class MistakeAttitudeApplication {

    public static void main(String[] args) {
        System.out.println("What's the attitude when a person is doing mistakes?");

        String answer = getAnswer();
        MistakeAttitude selectedAttitude = MistakeAttitude.valueOf(answer.toUpperCase());

        Person person = new Person();
        person.doMistakeWithAttitude(selectedAttitude);
        System.out.println("Person's percent of fulfillment : " + person.getFulfillmentPercent() + "%");
    }

    private static String getAnswer() {
        String input = "";

        while(!isValidAnswer(input)) {
            System.out.println("Type healthy or unhealthy: ");
            input = getKeyboardInput();
        }
        return input;
    }

    private static boolean isValidAnswer(String input) {
        for (MistakeAttitude mistakeAttitude : MistakeAttitude.values()) {
            if (mistakeAttitude.name().equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }

    private static String getKeyboardInput() {
        Scanner scanner = new Scanner(System.in);

        return scanner.next().trim();
    }

}