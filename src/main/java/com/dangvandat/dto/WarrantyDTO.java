package com.dangvandat.dto;

public class WarrantyDTO extends AbstractDTO<WarrantyDTO> {

    private String pathFile;
    private String typeFile;
    private String fileNameClient;
    private String file;
    private String description;

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public String getFileNameClient() {
        return fileNameClient;
    }

    public void setFileNameClient(String fileNameClient) {
        this.fileNameClient = fileNameClient;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
