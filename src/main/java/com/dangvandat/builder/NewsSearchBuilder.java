package com.dangvandat.builder;

public class NewsSearchBuilder {
    private String title;
    private String content;
    private String code;
    private String type;

    public NewsSearchBuilder(builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.code = builder.code;
        this.type = builder.type;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public static class builder {
        private String title;
        private String content;
        private String code;
        private String type;

        public builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public builder setContent(String content) {
            this.content = content;
            return this;
        }

        public builder setCode(String code) {
            this.code = code;
            return this;
        }

        public builder setType(String type) {
            this.type = type;
            return this;
        }

        public NewsSearchBuilder builder() {
            return new NewsSearchBuilder(this);
        }
    }
}
