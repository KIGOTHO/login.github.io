package com.androidbegin;

        import com.parse.Parse;
        import com.parse.ParseACL;

        import com.parse.ParseInstallation;
        import com.parse.ParseUser;

        import android.app.Application;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "EhkN7fokqHdoVPx0eHUND1nea6E4HYCpXHT6EvZd", "Hfq3RYMSBjLQ5eXd9f1jQ0PIKhyxFYYnwpuD6kyD");
        ParseInstallation.getCurrentInstallation().saveInBackground();

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}