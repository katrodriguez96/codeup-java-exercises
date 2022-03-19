package bonus_interfacesAbstractClasses;

public class Piano extends Musicalnstrument implements Tuneable, VolumeAdjustable{
    private int numberOfKeys;

    public Piano(String instrumentClassification, int numberOfKeys) {
        super(instrumentClassification);
        setNumberOfKeys(numberOfKeys);
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public void startMusic() {
        System.out.println("The piano started playing.");
    }

    @Override
    public void stopMusic() {
        System.out.println("The piano stopped playing.");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("The piano is now tuned.");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("The piano is out of tune.");
    }

    @Override
    public void volumeUp() {
        System.out.println("The piano played louder.");
    }

    @Override
    public void volumeDown() {
        System.out.println("The piano played quieter.");
    }
}
