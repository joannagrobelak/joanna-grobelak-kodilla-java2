package com.kodilla.testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyControllerTest {


    @Mock
    MyService myService;

    @Spy
    MyApi myApi;

    @Mock
    ThridPartService thridPartService;

    @Captor
    ArgumentCaptor<String> captor;

    @InjectMocks
    MyController myController;

    @Test
    public void getValueCommunite() throws Exception {

        //Given
        Mockito.when(myService.calculateValue()).thenReturn(100);

        //When
        String output = myController.getValueCommunite();

        //Then
        Mockito.verify(myApi, Mockito.times(1)).getSuffix();
        Assert.assertEquals(output, "Value is 100 end");

    }

    @Test
    public void sendData() throws Exception {

        //Given

        //When
        String input = "some value";
        myController.sendData(input);

        //Then
        Mockito.verify(thridPartService, Mockito.times(1)).sendDataToThrdPartService(captor.capture());
        String captoredValue = captor.getValue();
        Assert.assertEquals(captoredValue, "aaa"+input+"bbb");

    }
}