package factorypattern;

public class WindowsButton implements Button {

    public void render() {
        System.out.println("Rendering button");
        onClick();
    }

    public void onClick() {
        System.out.println("Windows Button clicked");
    }
}