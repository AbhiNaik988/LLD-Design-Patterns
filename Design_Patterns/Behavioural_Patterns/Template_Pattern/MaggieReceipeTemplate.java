package Design_Patterns.Behavioural_Patterns.Template_Pattern;

public abstract class MaggieReceipeTemplate {
    public void cookMaggie(){
        this.getWater();
        this.boilWater();
        this.putMaggieInWater();
        this.sprinkleMaggieMasala();
        this.waitForTwoMinutes();
    }
    public abstract  void waitForTwoMinutes();
    public abstract void boilWater();
    public abstract void putMaggieInWater();
    public abstract void getWater();
    public abstract void sprinkleMaggieMasala();

}
