import java.util.ArrayList;//Create the Stable class here.

public class Stable {
  String address;
  ArrayList<Horse> arrayList = new ArrayList<Horse>();

  public Stable(String address) {
    this.address = address;
  }

  public Stable() {
  }

  public void listHorses() {
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println("Horse #" + (i + 1) + " Name: " + arrayList.get(i).name + " Weight: "
          + arrayList.get(i).weight + " Tame: " + arrayList.get(i).tame);
    }
  }
}