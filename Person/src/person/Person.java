
package person;

public class Person {
    private String name,address;
    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Person(String name,String address){
        this.setName(name);
        this.setAddress(address);
    }
  public String toString() {
        return name + "(" + address + ")";
    }
}
