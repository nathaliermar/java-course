package Numbers;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ClassDecimalFormat {

    public static void main(String[] args) {

        String pattern = "###,###.##";
        DecimalFormat df = new DecimalFormat(pattern);
        // instantiating the pattern
        // we can instantiate the decimal format class without passing any parameters to the constructor,
        // so we use // o -> df.applyPattern(pattern);

        System.out.println(df.format(1234567890.123));

        // Format the numbers according to the desired Locale
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("en", "US"));
        dfs.setDecimalSeparator('.');
        dfs.setGroupingSeparator(',');

        String pattern2 = "###,###.##";
        df = new DecimalFormat(pattern2, dfs);
        System.out.println(df.format(1234567890.123));

        // Configure grouping size
        String pattern3 = "###,###,###.##";
        df = new DecimalFormat(pattern3, dfs);
        df.setGroupingSize(4);
        System.out.println(df.format(1234567890.123));

        // To always have decimal places
        String pattern4 = "###,###,###.00";
        df = new DecimalFormat(pattern4, dfs);
        System.out.println(df.format(1234567890.0));


    }
}
