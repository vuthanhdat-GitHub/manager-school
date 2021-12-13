package com.dangvandat.dto.request;

import com.dangvandat.dto.AbstractDTO;
import org.springframework.web.multipart.MultipartFile;

public class BannerCreateRequest extends AbstractDTO<BannerCreateRequest> {
    private String name;
    private String file;
    private String fileNameClient;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFileNameClient() {
        return fileNameClient;
    }

    public void setFileNameClient(String fileNameClient) {
        this.fileNameClient = fileNameClient;
    }
}
