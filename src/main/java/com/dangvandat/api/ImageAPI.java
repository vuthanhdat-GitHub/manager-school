package com.dangvandat.api;

import com.dangvandat.util.FilesUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(urlPatterns = {"/web/warranty/list/image" ,
                            "/web/projects/list/image",
                            "/web/home/image",
                            "/image"})
public class ImageAPI extends HttpServlet {

    //private final static String root = "/var/www/upload/fire-protection";
    //private final static String root = "F:/usr/var";
    //private final static String root = "/home/images";

    private final static String root = "/home/images";

    @Autowired
    private FilesUtils filesUtils;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        ServletContext cntx= req.getServletContext();
        // Get the absolute path of the image
        String filename = getImagePath(req.getParameter("path"));
        // retrieve mimeType dynamically
        String mime = cntx.getMimeType(filename);
        if (mime == null) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            return;
        }

        resp.setContentType(mime);
        File file = new File(filename);
        resp.setContentLength((int)file.length());

        FileInputStream in = new FileInputStream(file);
        OutputStream out = resp.getOutputStream();

        // Copy the contents of the file to the output stream
        byte[] buf = new byte[1024];
        int count = 0;
        while ((count = in.read(buf)) >= 0) {
            out.write(buf, 0, count);
        }
        out.close();
        in.close();

    }

    private String getImagePath(String path) {
        String result = root + path;
        return result;
    }
}
