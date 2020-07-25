package decorator;

public class CountryDecorator implements Country {

    Country country;

    public CountryDecorator(Country country) {
        this.country = country;
    }

    @Override
    public String show() {
       return country.show();
    }
}
