
package visitortablet;

public abstract class Tablet {
    private String  model,Brand;

    public Tablet(String model, String Brand) {
        this.model = model;
        this.Brand = Brand;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
    public abstract void Accept(Ivisitor visitor);
}
