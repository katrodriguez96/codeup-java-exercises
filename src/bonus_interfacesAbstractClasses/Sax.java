package bonus_interfacesAbstractClasses;

public class Sax extends Musicalnstrument implements Tuneable, VolumeAdjustable{
    private String saxType;

    public Sax(String instrumentClassification, String saxType) {
        super(instrumentClassification);
        setSaxType(saxType);
    }

    public String getSaxType() {
        return saxType;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }

    @Override
    public void startMusic() {
        System.out.println("The saxophone started playing.");
    }

    @Override
    public void stopMusic() {
        System.out.println("The saxophone stopped playing.");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("The saxophone is now tuned.");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("The saxophone is out of tune.");
    }

    @Override
    public void volumeUp() {
        System.out.println("The saxophone played louder.");
    }

    @Override
    public void volumeDown() {
        System.out.println("The saxophone played quieter.");
    }
}
