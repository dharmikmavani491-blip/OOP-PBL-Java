import java.io.*;
import java.util.Date;

class FileDemo {
    public static void main(String[] args) throws Exception {

        File f = new File("abc.txt");

        if (!f.exists())
            f.createNewFile();

        System.out.println("Name = " + f.getName());
        System.out.println("Path = " + f.getAbsolutePath());
        System.out.println("Size = " + f.length());
        System.out.println("Readable = " + f.canRead());
        System.out.println("Writable = " + f.canWrite());
        System.out.println("Modified = " + new Date(f.lastModified()));

        File newFile = new File("xyz.txt");
        f.renameTo(newFile);

        newFile.delete();
    }
}
