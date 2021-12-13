package com.dangvandat.dto;

import java.util.List;

public class NewsDTO extends AbstractDTO<NewsDTO> {
    private String title;
    private String listFile;
    private String thumbnail;
    private String description;
    private String content;
    private String typeFile;
    private String code;
    private String type;
    private String fileNameClient;
    private String file;
    private List<String> base64;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getListFile() {
        return listFile;
    }

    public void setListFile(String listFile) {
        this.listFile = listFile;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public List<String> getBase64() {
        return base64;
    }

    public void setBase64(List<String> base64) {
        this.base64 = base64;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
