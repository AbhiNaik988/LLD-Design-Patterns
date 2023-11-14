package Design_Patterns.Behavioural_Patterns.Template_Pattern;

public class MaggieReciepe extends MaggieReceipeTemplate{
    @Override
    public void waitForTwoMinutes() {
        System.out.println("Waiting for two minutes");
    }

    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void putMaggieInWater() {
        System.out.println("Putting maggie in water");
    }

    @Override
    public void getWater() {
        System.out.println("Getting water");
    }

    @Override
    public void sprinkleMaggieMasala() {
        System.out.println("Sprinkle Maggie Masala");
    }
}
