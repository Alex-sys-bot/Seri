package ru.sapteh;

import java.util.stream.Stream;

public class Birds extends Animals{
    private String view = "";

    public String getView() {
        return view;
    }
    public void setView(String view) {
        this.view = view;
    }

    public Birds(int age, int weight, String name, String view){
        super(name, age, weight);
        this.view = view;
    }

    @Override
    public String drive(){
        return "Летит";
    }
    @Override
    public String eat(){
        return "Семечки";
    }
    @Override
    public String voice(){
        return "Чирикает";
    }
}
