package mirea.prac11_12.task2;

import java.util.StringTokenizer;

public class Address {
  String country;
  String region;
  String city;
  String street;
  String house;
  String housing;
  String flat;

  Address(String addressInfo, String splitter) {
    if (splitter.equals(", ")) {
      this.bySplitter(addressInfo);
    } else {
      this.byTokenizer(addressInfo, splitter);
    }
  }

  private void assigner(String[] addressArr) {
    for (int i = 0; i < addressArr.length; i++) {
      String elem = addressArr[i];

      switch (i) {
        case 0:
          this.country = elem;
          break;
        case 1:
          this.region = elem;
          break;
        case 2:
          this.city = elem;
          break;
        case 3:
          this.street = elem;
          break;
        case 4:
          this.house = elem;
          break;
        case 5:
          this.housing = elem;
          break;
        case 6:
          this.flat = elem;
          break;
      }
    }
  }

  private void bySplitter(String addressInfo) {
    String[] addressArr = addressInfo.split(", ");

    this.assigner(addressArr);
  }

  private void byTokenizer(String addressInfo, String splitter) {
    StringTokenizer st = new StringTokenizer(addressInfo, splitter);
    String[] addressArr = new String[7];

    for (int i = 0; st.hasMoreTokens(); i++) {
      addressArr[i] = st.nextToken();
    }

    this.assigner(addressArr);
  }
}
