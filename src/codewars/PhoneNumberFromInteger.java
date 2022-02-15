package codewars;

public class PhoneNumberFromInteger {
    public static void main(String[] args) {
        int[] array = new int[]{5,4,8,7,9,6,2,1,3,0};

        System.out.println(getPhoneNumber(array));
    }

    public static String getPhoneNumber(int[] numbers){
        StringBuilder sb = new StringBuilder();

        sb.append("(" + numbers[0] + numbers[1] + numbers[2] + ")" + " " + numbers[3] + numbers[4] + numbers[5] + "-"
                + numbers[6] + numbers[7] + numbers[8] + numbers[9]);

        return sb.toString();
    }
}
