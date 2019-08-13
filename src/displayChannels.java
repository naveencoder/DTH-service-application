import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class displayChannels extends calculatingAmount {
    void displayChannels() {
        Scanner inputs = new Scanner(System.in);
        System.out.println("ENTER CHANNEL NAMES YOU WANT : \n");
//        System.out.println(Arrays.asList(channels));          //for diplay the channels in single row
        channels.forEach((key, value) -> System.out.println(key + "--" + value));
        String userInputC = inputs.nextLine();
        userChannels = userInputC.split(",");
        for (int i = 0; i < userChannels.length; i++) {  //user input can have  any case of letters so covert into lower case for checking
            userChannels[i] = userChannels[i].toLowerCase();
        }
        if (userChannels.length < 2) {
            System.out.println("YOU MUST SELECT 2 CHANNELS ");
            return;

        }

        System.out.println("ENTER PACKAGES YOU WANT :\n");
//        System.out.println(Arrays.asList(channels));           //for diplay the packages in single row
        packages.forEach((key, value) -> System.out.println(key + "--" + value));
        String userInputP = inputs.nextLine();
        userPackages = userInputP.split(",");
        for (int i = 0; i < userPackages.length; i++) {  //user input can have  any case of letters so covert into lower case for checking
            userPackages[i] = userPackages[i].toLowerCase();
        }
    }
}
