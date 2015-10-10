package com.example.anish.mrboxandroid;

import android.app.Application;

import com.parse.Parse;
import com.parse.PushService;

/**
 * Created by Anish on 6/19/2015.
 */
public class ParserApplication extends Application {
    public void onCreate(){
        Parse.initialize(this, "IOQ6ewll7QSX3biKuqBwTzVNT3GHfiCc8NMzYRPc", "YDQboEmNlAkTtW9QlYegSDlnatI8CR0bbKGS0qog");
        PushService.setDefaultPushCallback(this, Home.class);
    }
}
