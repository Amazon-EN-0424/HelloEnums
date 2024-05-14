package com.ironhack.teas;

public class Tea {
    private String name;
    private TeaType type;

// TODO: if you are bored investigate the difference between StringBuilder and String

//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Tea{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", type=").append(type);
//        sb.append('}');
//        return sb.toString();
//    }


    @Override
    public String toString() {
        return "Tea{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public Tea(String name, TeaType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeaType getType() {
        return type;
    }

    public void setType(TeaType type) {
        this.type = type;
    }


}
