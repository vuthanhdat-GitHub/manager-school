package com.dangvandat.builder;

public class CategorySearchBuilder {
    private String name;

    public CategorySearchBuilder(builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public static class builder{
        private String name;

        public builder setName(String name) {
            this.name = name;
            return this;
        }

        public CategorySearchBuilder builder(){
            return new CategorySearchBuilder(this);
        }
    }
}
