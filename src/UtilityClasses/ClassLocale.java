package UtilityClasses;

import java.text.NumberFormat;
import java.util.Locale;

public class ClassLocale {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale loc: locales) {

            System.out.println("Name: " + loc.getDisplayName());
            System.out.println("Language code: " + loc.getLanguage());
            System.out.println("Language: " + loc.getDisplayLanguage());
            System.out.println("Country Code: " + loc.getCountry());
            System.out.println("Country: " + loc.getDisplayCountry());

            System.out.println("--------------------------------------");
        }

        Locale br = new Locale("pt", "Brazil");
        System.out.println(br);

        // Setting locale br as default
        Locale.setDefault(br);
        System.out.println(Locale.getDefault());
        
        // We take any instance, to format the number. It influences dates and their formatting.

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(200000d));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println(nf1.format(200000d));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf2.format(200000d));

    }
}
