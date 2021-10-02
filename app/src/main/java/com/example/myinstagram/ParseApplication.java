package com.example.myinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        // Register parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("76cjuPxQCKyDTpHh6Sn0Wa1daInd7Lys1fs0E4Wf")
                .clientKey("dLHoa8IJm5vFIERV1HkcaTXTdjxqrzXFHRAN4Jhq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
