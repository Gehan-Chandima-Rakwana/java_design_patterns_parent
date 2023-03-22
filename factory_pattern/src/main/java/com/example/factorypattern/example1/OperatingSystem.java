package com.example.factorypattern.example1;

public abstract class OperatingSystem {
    private String version;
    private String architecture;

    public OperatingSystem(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public abstract void changeDir();

    public abstract void removeDir();

    public void printVersionAndArchitecture(){
        System.out.println("Version  Architecture "+version+" And "+architecture);
    }

}
