package OOPs.compositions;

public class RestAddress {
    int streetNo;
    String streetName;
    String city;
    String postalCode;
    String province;

    public RestAddress(int streetNo, String streetName, String city, String postalCode, String province) {
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
    }

    @Override
    public String toString() {
        return  streetNo +
                " " + streetName +
                ", " + city +
                ", " + postalCode +
                ", " + province;
    }
}
