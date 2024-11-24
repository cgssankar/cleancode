
package cleancode;

//Java implementation of the given C++ program
//Interface definitions
interface IFileReader {

  void read();
}

interface IFileWriter {

  void write();
}

//Class implementing both interfaces
class FileProcessor implements IFileReader, IFileWriter {

  @Override
  public void read() {
    // Implementation of read
  }

  @Override
  public void write() {
    // Implementation of write
  }
}

//Functions as static methods
class FileOperations {

  public static void reader(final IFileReader processor) {
    processor.read();
    // processor.write(); // Not accessible here due to interface segregation
  }

  public static void writer(final IFileWriter processor) {
    processor.write();
    // processor.read(); // Not accessible here due to interface segregation
  }

  public static void readWrite(final FileProcessor processor) {
    processor.read();
    processor.write();
  }
}

//Main class
public class ISP {

  public static void main(final String[] args) {
    FileProcessor processor = new FileProcessor();
    FileOperations.reader(processor);
    FileOperations.writer(processor);
    FileOperations.readWrite(processor);
  }
}
