package com.kodilla.testing;


public class MyController {

    private MyService myService;
    private MyApi myApi;
    private ThridPartService thridPartService;

    public MyController(MyService myService, MyApi myApi, ThridPartService thridPartService) {
        this.myService = myService;
        this.myApi = myApi;
        this.thridPartService = thridPartService;
    }

    public String getValueCommunite() {

        return "Value is " + myService.calculateValue() + myApi.getSuffix();
    }

    public void sendData(String value){

        thridPartService.sendDataToThrdPartService("aaa"+value+"bbb");

    }

}
