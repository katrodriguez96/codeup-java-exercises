package bonus_interfacesAbstractClasses;

public class MusicTest {
    public static void main(String[] args) {
        Piano testPiano = new Piano("Piano", 88);
        Sax testSax = new Sax("Saxophone", "Alto");

        System.out.println("testPiano.getInstrumentClassification() = " + testPiano.getInstrumentClassification());
        System.out.println("testSax.getInstrumentClassification() = " + testSax.getInstrumentClassification());
        System.out.println("testPiano.getNumberOfKeys() = " + testPiano.getNumberOfKeys());
        System.out.println("testSax.getSaxType() = " + testSax.getSaxType());
        testPiano.startMusic();
        testPiano.stopMusic();
        testSax.startMusic();
        testSax.stopMusic();

        detuneRetune(testPiano);
        detuneRetune(testSax);
        makeTwoStaccatoSounds(testPiano);
        makeTwoStaccatoSounds(testSax);
    }

    public static void detuneRetune(Tuneable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }

    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }
}
