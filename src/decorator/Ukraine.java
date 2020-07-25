package decorator;

public class Ukraine extends CountryDecorator {

    public Ukraine(Country country) {
        super(country);
    }

    public String showCountry(){
        return "Ukraine";
    }

    @Override
    public String show() {
        return super.show() +" " + showCountry();
    }
}
