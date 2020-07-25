package decorator;

public class Run {
    public static void main(String[] args) {
        Country country = new Ukraine(new RegionCountry(new Kiev()));
        System.out.println(country.show());

    }
}
