import java.util.*;

class calculatingAmount {
    protected HashMap<String, Integer> channels = new HashMap<>();
    protected HashMap<String, Integer> packages = new HashMap<>();
    protected static String[] userChannels;
    protected static String[] userPackages;
    private Integer amount = 0;

    calculatingAmount() {
        channels.put("sun tv", 10);
        channels.put("k tv", 5);
        channels.put("vijay tv", 5);
        channels.put("cartoon Network", 7);
        channels.put("vijay super", 3);
        channels.put("pothigai", 2);
        packages.put("sports", 20);
        packages.put("kids", 25);
        packages.put("music", 20);
        packages.put("movies", 25);

    }
    void calculatingAmountForChannel() {
        for (int i = 0; i < userChannels.length; i++) {
            amount += channels.get(userChannels[i]);
        }
    }

    void calculatingAmountForPackage() {
        for (int i = 0; i < userPackages.length; i++) {
            amount += packages.get(userPackages[i]);
            System.out.println("COST FOR YOUR SELECTED PACKAGES & CHANNEL : " + amount);
        }

    }

}