package bonus_interfacesAbstractClasses;

public abstract class Musicalnstrument implements Playable{
    private String instrumentClassification;

    public Musicalnstrument(String instrumentClassification) {
        setInstrumentClassification(instrumentClassification);
    }

    public String getInstrumentClassification() {
        return instrumentClassification;
    }

    public void setInstrumentClassification(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }
}
