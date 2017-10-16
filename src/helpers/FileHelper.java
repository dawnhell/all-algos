package helpers;

import java.io.*;

public class FileHelper {
    public void writeFile(Object objectToWrite, String fileName) {
        try {
            ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(
                    new FileOutputStream(
                        new File(System.getProperty("user.dir") + "/src/input/" + fileName)));
            objectOutputStream.writeObject(objectToWrite);
            objectOutputStream.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public int[] readArrayFromFile(String fileName) {
        int []result = {};

        try {
            ObjectInputStream objectInputStream =
                new ObjectInputStream(
                    new FileInputStream(
                        new File(System.getProperty("user.dir") + "/src/input/" + fileName)
                    )
                );
            result = (int[]) objectInputStream.readObject();

        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return result;
    }
}
