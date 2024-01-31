package Numbers;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class ClassNumberFormat {

    public static void main(String[] args) throws Exception {

        // 1.000,0 - Brazil
        // 1,000.0 - USA

        Locale en = new Locale("en", "United States");
        NumberFormat nf = NumberFormat.getInstance(en);

        String num = nf.format(100.99);
        System.out.println(num);

        Locale br = new Locale("pt", "Brazil");
        nf = NumberFormat.getInstance(br);
        num = nf.format(100.99);
        System.out.println(num);

        // Coin
        NumberFormat coin = NumberFormat.getCurrencyInstance(Locale.getDefault());

        String value = coin.format(100.99);
        System.out.println(value);

        Currency curreny = coin.getCurrency();
        System.out.println(curreny);

        // Percentage - divided by 100
        NumberFormat porcent = NumberFormat.getPercentInstance();
        String percentage = porcent.format(99.987);
        System.out.println(percentage);

        // configure currency manually, defining maximum and minimum spaces
        porcent.setMaximumIntegerDigits(4); // set the maximum fractional digits
        porcent.setMinimumIntegerDigits(3);

       // for decimal places - java always rounds
        porcent.setMaximumFractionDigits(2);
        porcent.setMinimumFractionDigits(1);

        percentage = porcent.format(99.987);
        System.out.println(percentage);

        // Rounding
        nf = NumberFormat.getInstance(Locale.getDefault());

        nf.setRoundingMode(RoundingMode.UP);
        nf.setMaximumIntegerDigits(0);
        nf.setMinimumIntegerDigits(0);
        System.out.println(nf.format(90.80));

        // parse
        Number num3 = nf.parse("100,00");
        System.out.println(num3.intValue());
    }
}
