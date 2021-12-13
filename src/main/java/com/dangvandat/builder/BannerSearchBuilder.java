package com.dangvandat.builder;

public class BannerSearchBuilder {
    private String name;
    private String status;

    public String getName() {
        return name;
    }
    public String getStatus() {
        return status;
    }

    public BannerSearchBuilder(builder builder) {
        this.name = builder.name;
        this.status = builder.status;
    }

    public static class builder{
        private String name;
        private String status;

        public builder setName(String name) {
            this.name = name;
            return this;
        }
        public builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public BannerSearchBuilder builder(){
            return new BannerSearchBuilder(this);
        }
    }
}
