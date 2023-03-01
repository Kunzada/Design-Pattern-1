package structural;

public abstract class SmartPhone {
    public abstract String getModel();

    @Override
    public String toString() {
        return "Model: " + this.getModel();
    }
}