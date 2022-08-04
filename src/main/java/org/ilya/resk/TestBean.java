package org.ilya.resk;

public class TestBean {
    private String string;

    public TestBean(String s){
        this.string =s;
    }
    public void setString(String s){
        this.string = s;
    }
    public String getString(){
        return this.string;
    }
}
