package decorator;

public class RegionCountry extends CountryDecorator {

    public RegionCountry(Country country) {
        super(country);
    }

    public String showRegion() {
        return "Kievskaya";
    }

    @Override
    public String show() {
        return  super.show() + " " + showRegion();
    }
}
