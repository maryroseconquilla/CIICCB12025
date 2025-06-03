package animals;

import java.util.ArrayList;
import java.util.List;

public class Panda {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.removeIf((String s) -> s.isEmpty())
  }
}
