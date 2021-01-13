package abstractfactorypattern;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Created MacOSCheckbox.");
    }
}