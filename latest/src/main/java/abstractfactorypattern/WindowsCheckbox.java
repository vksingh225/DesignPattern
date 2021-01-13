package abstractfactorypattern;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Created WindowsCheckbox.");
    }
}