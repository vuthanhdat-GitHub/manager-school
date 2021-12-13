package com.dangvandat.builder;

public class ManufacturerSearchBuilder {

    private String name;

    public ManufacturerSearchBuilder(builder builder){
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

        public ManufacturerSearchBuilder builder(){ return new ManufacturerSearchBuilder(this); }
    }
}
