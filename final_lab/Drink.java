package mirea.final_lab;

public final class Drink extends MenuItem implements Alcoholable {
  private final double alcoholVol;
  private final DrinkTypeEnum type;

  Drink(String name, String description, double alcoholVol, DrinkTypeEnum type) {
    super(name, description);

    this.alcoholVol = alcoholVol;
    this.type = type;
  }

  Drink(double price, String name, String description, double alcoholVol, DrinkTypeEnum type) {
    super(price, name, description);

    this.alcoholVol = alcoholVol;
    this.type = type;
  }

  public DrinkTypeEnum getType() {
    return this.type;
  }

  public boolean isAlcoholDrink() {
    return this.alcoholVol > 0;
  }

  public double getAlcoholVol() {
    return this.alcoholVol;
  }
}
