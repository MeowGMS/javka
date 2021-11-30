package mirea.final_lab;

public final class Address {
  private String cityName;
  private String streetName;

  private int zipCode;
  private int buildingNumber;
  private int apartmentNumber;

  private char buildingLetter;

  public static final Address EMPTY_ADDRESS = new Address();

  public Address() {}

  public Address(String cityName, String streetName, int zipCode, int buildingNumber, int apartmentNumber) {
    this.cityName = cityName;
    this.streetName = streetName;
    this.zipCode = zipCode;
    this.buildingNumber = buildingNumber;
    this.apartmentNumber = apartmentNumber;
  }

  public String getCityName() {
    return this.cityName;
  }

  public int getZipCode() {
    return this.zipCode;
  }

  public String getStreetName() {
    return this.streetName;
  }

  public char getBuildingLetter() {
    return this.buildingLetter;
  }

  public int getBuildingNumber() {
    return this.buildingNumber;
  }
}
