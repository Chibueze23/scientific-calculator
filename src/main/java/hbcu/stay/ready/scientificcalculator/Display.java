package hbcu.stay.ready.scientificcalculator;

public class Display {

    private String [] displayModeList = { "binary" , "octal" , "decimal" , "hexdecimal"};

    private String setDisplayMode = "binary";

    int i = 0;

    public String switchDisplayMode(){
        i++;
        if(i==4){
            i = 0;
        }

        return displayModeList[i];
    }

    private String[] switchRadians = {"Dedrees", "Radians"};

    private String setRadians = "Degrees";

    int x = 0;

    public String switchRadiansMode(){

        x++;
        if(x==2){
            x=0;
        }
        return switchRadians[x];
    }
}