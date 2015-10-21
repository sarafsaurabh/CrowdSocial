package com.crowdsocial;

import android.app.Application;

import com.crowdsocial.model.Event;
import com.parse.Parse;
import com.parse.ParseObject;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        ParseObject.registerSubclass(Event.class);
        Parse.initialize(
                this,
                "v0k2DsclfjHMPQkpQWXwirzg3bvj0SA7e149wR9K",
                "05LAoJKyQjChynLjRlb9AbIZOvH7xTV0B4FyMHln");
    }
}