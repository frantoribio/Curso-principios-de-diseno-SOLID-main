package SolucionJava.Shop.Notifier;

public class ShopSlackNotifier implements NotifierInterface {
    //SlackNotifier notifier;

    public ShopSlackNotifier() {
        //this.notifier = new SlackNotifier();
    }

    public void send(MiniShop shop) throws Exception {
        try {
            //String text = String.format("Your shop %s has been created", shop.getName());
            //this.notifier.send(text, shop.getPhone());
        } catch (Exception e) {
            // Log this fail
            throw new Exception("Something like wrong when trying to send notification");
        }
    }
}
