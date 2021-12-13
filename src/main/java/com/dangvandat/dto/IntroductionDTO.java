package com.dangvandat.dto;

import java.util.List;

public class IntroductionDTO extends AbstractDTO<IntroductionDTO> {
    private String code;
    private String title;
    private String avatar;
    private String description;
    private String content;
    private String typeFile;
    private String type;
    private String fileNameClient;
    private String file;
    private List<String> base64;
    private String listFile;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getBase64() {
        return base64;
    }

    public void setBase64(List<String> base64) {
        this.base64 = base64;
    }

    public String getListFile() {
        return listFile;
    }

    public void setListFile(String listFile) {
        this.listFile = listFile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
