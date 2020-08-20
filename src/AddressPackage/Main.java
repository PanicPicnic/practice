package AddressPackage;

public class Main {
    public static void main(String[] args) {
    Address one = new Address(03015,12,226,"Ukraine","Konotop", "Shevchenka" );
        System.out.println(one.getIndex());
        System.out.println(one.getCountry());
        System.out.println(one.getCity());
        System.out.println(one.getStreet());
        System.out.println(one.getHouse());
        System.out.println(one.getApartment());
    }
}
