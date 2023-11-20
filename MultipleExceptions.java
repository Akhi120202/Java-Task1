import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class MultipleExceptions {

    private List<Integer> list;
    private static final int SIZE = 10;

    public MultipleExceptions() {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    public void writeList() throws IOException {
        // The FileWriter constructor throws IOException.
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        for (int i = 0; i <= SIZE; i++) {
            // The get(int) method throws IndexOutOfBoundsException.
            out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();
    }

    
}

