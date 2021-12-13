package com.dangvandat.util;

import com.dangvandat.util.error.FileStorageException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

@Component
public class FilesUtils {

    //private final static String root = "/var/www/upload/fire-protection";
    //private final static String root = "F:/usr/var";
    //private final static String root = "/home/images";

    private final static String root = "/home/images";

    /**
     * writeOrUpdate
     *
     * @param bytes
     * @param path
     */
    public void writeOrUpdate(byte[] bytes, String path) {
        //check folder for exist
        File file = new File(StringUtils.substringBeforeLast(root + path, "/"));
        if (!file.exists()) {
            file.mkdir();
        }
        //write file to folder
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(root + path))) {
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * getImagePath
     *
     * @param path
     * @return String
     */
    public String getImagePath(String path) {
        String result = root + "/" + path;
        return result;
    }

    /**
     * generateFileName
     *
     * @param fileNameClient
     * @return
     */
    public String generateFileName(String fileNameClient) {
        String dateTimeNow = KUtils.getDateTimeNow("yyyyMMddHHmmssSSS");
        String[] splitString = fileNameClient.split("\\.");
        return StringUtils.substringBeforeLast(fileNameClient, ".") + "_" + dateTimeNow + "." + splitString[splitString.length - 1];
    }

    /**
     * getTypeFile
     *
     * @param fileNameClient
     * @return
     */
    public String getTypeFile(String fileNameClient) {
        String[] splitString = fileNameClient.split("\\.");
        return splitString[splitString.length - 1].trim();
    }

    /**
     * delete from dir
     *
     * @param path : path file for delete
     * @return Boolean {java.lang.Boolean}
     */
    public Boolean delete(String path) {
        try {
            File file = new File(root + path);
            if (file.delete()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            throw new FileStorageException("Could not store file " + path + ". Please try again!", e);
        }
    }

    /**
     * genFilePath
     *
     * @param urlFile
     * @return
     */
    public String genFilePath(String urlFile) {
        return "image" + urlFile;
    }

    /**
     * getBase64ForFile
     *
     * @param pathFile
     * @return
     * @throws IOException
     */
    public String getBase64ForFile(String pathFile) throws IOException {
        String result = "";
        try {
            byte[] fileContent = FileUtils.readFileToByteArray(new File(root + pathFile));
            result = Base64.getEncoder().encodeToString(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
