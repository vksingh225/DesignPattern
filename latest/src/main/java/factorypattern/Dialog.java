package factorypattern;

public abstract class Dialog {
    // This is Base creator class
    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}