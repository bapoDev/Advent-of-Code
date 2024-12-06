package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2Solver {

    public static void main(String[] args) throws IllegalArgumentException
    {

        int counter = 0;
        int counter2 = 0;
        if (args.length > 1) {
            throw new IllegalArgumentException("Please provide exactly one argument that is a .txt file.");
        } else if (args.length == 0) {
            System.out.println(isSecondReportValid("7 6 4 2 1"));
            System.out.println(isSecondReportValid("1 2 7 8 9"));
            System.out.println(isSecondReportValid("9 7 6 2 1"));
            System.out.println(isSecondReportValid("1 3 2 4 5"));
            System.out.println(isSecondReportValid("8 6 4 4 1"));
            System.out.println(isSecondReportValid("1 3 6 7 9"));
            System.out.println(isSecondReportValid("77 75 76 77 80 83 85 88"));
            System.out.println(isSecondReportValid("75 76 75 73 72 71"));
        } else {
            try {
                File file = new File(args[0]);
                Scanner fileText = new Scanner(file);
                String line;
                while (fileText.hasNextLine()) {
                    line = fileText.nextLine();
                    if(isReportValid(line))
                        counter++;
                    if (isSecondReportValid(line))
                        counter2++;
                }
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException("Please provide a valid file.");
            }
            System.out.println("Result for first part : " + counter);
            System.out.println("Result for second part : " + counter2);
        }
    }

    private static boolean isReportValid (String line)
    {
        String[] numList = line.split(" ");
        int diff;
        int lastDiff = 0;
        for (int i = 1; i < numList.length; i++) {
            diff = Integer.parseInt(numList[i]) - Integer.parseInt(numList[i-1]);
            if (diff > 3 || diff < -3 || diff == 0 || lastDiff < 0 && diff > 0 || lastDiff > 0 && diff < 0) {
                return false;
            }
            lastDiff = diff;
        }
        return true;
    }

    private static boolean isSecondReportValid (String line)
    {
        String[] numList = line.split(" ");
        int diff;
        int lastDiff = 0;
        for (int i = 1; i < numList.length; i++) {
            diff = Integer.parseInt(numList[i]) - Integer.parseInt(numList[i-1]);
            if (diff > 3 || diff < -3 || diff == 0 || lastDiff < 0 && diff > 0 || lastDiff > 0 && diff < 0) {
                if (isReportValid(removeOneFromArrayByIndex(numList, i))) {
                    return true;
                } else if (isReportValid(removeOneFromArrayByIndex(numList, i - 1))) {
                    return true;
                } else return isReportValid(removeOneFromArrayByIndex(numList, i - 2));
            }
            lastDiff = diff;
        }
        return true;
    }

    public static String removeOneFromArrayByIndex (String[] arr, int index) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (!(i == index)) {
                res.append(arr[i]).append(" ");
            }
        }
        return res.toString();
    }
}