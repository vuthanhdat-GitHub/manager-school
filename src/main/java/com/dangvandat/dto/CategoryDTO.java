package com.dangvandat.dto;

public class CategoryDTO extends AbstractDTO<CategoryDTO> {
    private String name;
    private String code;
    private String pathFile;
    private String fileNameClient;
    private String file;
    private String typeFile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }
}
