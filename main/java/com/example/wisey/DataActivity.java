package com.example.wisey;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

import android.app.Application;

    public class DataActivity extends Application {
        @Override
        public void onCreate()
        {
            super.onCreate();

            Parse.enableLocalDatastore(this);

            Parse.initialize(new Parse.Configuration.Builder(this)
                    .applicationId("26b6e70431ead97342ddb7856dfaab50e287015e")
                    .clientKey("3dc8fcdbe5a69ff3b8482be528afd3a7d6221358")
                    .server("http://15.206.28.127:80/parse/")
                    .build()
            );
            ParseUser.enableAutomaticUser();
            ParseACL defaultACL= new ParseACL();
            defaultACL.setPublicReadAccess(true);
            defaultACL.setPublicWriteAccess(true);
            ParseACL.setDefaultACL(defaultACL,true);
        }
    }