public class driver {
    public static void main(String[] args) {
        coffeShop shop = new coffeShop();

        System.out.println(shop.getItem1());
        System.out.println(shop.getItem2());
        System.out.println(shop.getItem3());
        System.out.println(shop.getItem4());

        Starbucks costumer = new Starbucks();

        System.out.println(costumer.getItem5());
        System.out.println(costumer.getItem1());

    }
}
