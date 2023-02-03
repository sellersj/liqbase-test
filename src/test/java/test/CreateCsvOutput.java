package test;

public class CreateCsvOutput {

    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("id");

        int numberOfCols = 10;
        int numberOfRows = 10000;

        // create the header
        for (int i = 1; i <= numberOfCols; i++) {
            b.append(",col");
            b.append(i);
        }
        b.append("\n");

        for (int row = 1; row <= numberOfRows; row++) {
            b.append(row);
            for (int col = 1; col <= numberOfCols; col++) {
                b.append(",value ");
                b.append(col);
            }
            b.append("\n");
        }

        // print it all
        System.out.println(b.toString());
    }
}