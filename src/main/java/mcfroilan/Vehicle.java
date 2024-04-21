package mcfroilan;

public abstract class Vehicle implements Rideable, NoiseMaker{
    private boolean isMounted;

    public boolean getIsMounted() {
        return isMounted;
    }

    public void setIsMounted(boolean mounted) {
        isMounted = mounted;
    }
}