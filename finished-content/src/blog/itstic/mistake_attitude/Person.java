package blog.itstic.mistake_attitude;

class Person {

    private int fulfillmentPercent = 50;

    int getFulfillmentPercent() {
        return fulfillmentPercent;
    }

    void doMistakeWithAttitude(MistakeAttitude attitude) {
        if (MistakeAttitude.HEALTHY.equals(attitude)) {
            doMistakeWithPositiveAttitude();
        }
        if (MistakeAttitude.UNHEALTHY.equals(attitude)) {
            doMistakeWithUnhealthyAttitude();
        }
    }

    private void doMistakeWithUnhealthyAttitude() {
        doMistake();
        fix();
        frustrate();
        regret();
    }

    private void doMistakeWithPositiveAttitude() {
        doMistake();
        assumeResponsibility();
        learn();
        fix();
    }

    private void doMistake() {
    }

    private void fix() {
        System.out.println("Fix problem");
    }

    private void assumeResponsibility() {
        System.out.println("Assume responsibility");
        fulfillmentPercent += 10;
    }

    private void learn() {
        System.out.println("Learn");
        fulfillmentPercent += 20;
    }

    private void regret() {
        System.out.println("Regret");
        fulfillmentPercent -= 10;
    }

    private void frustrate() {
        System.out.println("Frustrate");
        fulfillmentPercent -= 10;
    }

}
