import java.io.FileNotFoundException;
import java.io.FileReader;

import org.python.util.PythonInterpreter;

public class UpdaterTests {
    public static void main(String[] args) throws FileNotFoundException{
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("year_end.py");
        interpreter.close();
    }
}
