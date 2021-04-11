package conditions;

public class CapacityBySwitch {

    public static void main(String[] args) {

        String capacity = "MB";
        String s1 = "GB";
        //float and double data types are not supported in switch
//        float f = 10.9f;
//        double d = 16.8d;

        switch (capacity){

            case "KB":
                System.out.println("its kilobyte");
                break;
            case "MB":
                System.out.println("its Megabyte");
                break;
            case "GB":
                System.out.println("its Gigabyte");
                break;
            case "TB":
                System.out.println("its Terabyte");
                break;
            default:
                System.out.println("unknown entry");
        }
    }
}
