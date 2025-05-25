package io.file.copy;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateCopyFile {
    private static final int FILE_SIZE = 99 * 1024 * 1024; // 99MB
    // 원래 200인데 사이즈가 커서 git에 안올라가서 99MB로 임시변경

    public static void main(String[] args) throws IOException {
        String fileName = "temp/copy.dat";
        long stratTime = System.currentTimeMillis();

        FileOutputStream fos = new FileOutputStream(fileName);
        byte[] buffer = new byte[FILE_SIZE];
        fos.write(buffer);
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File created: " + fileName);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - stratTime) + "ms");
    }
}