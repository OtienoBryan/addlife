package com.topline.hub.services;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.topline.hub.SharedPrefManager;

/**
 * Created by Richard Mubalama on 19 March 2019.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    private static final String TAG = "MyFirebaseIdService";
    private static final String TOPIC_GLOBAL = "global";

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // now subscribe to `global` topic to receive app wide notifications
        FirebaseMessaging.getInstance().subscribeToTopic(TOPIC_GLOBAL);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.

        storeToken(refreshedToken);
    }

    /**
     * Persist token to third-party servers.
     * <p>
     * Modify this method to associate the user's FCM InstanceID token with any server-side account
     * maintained by your application.
     *
     * @param token The new token.
     */
    private void storeToken(String token) {
        //saving the token on shared preferences
        SharedPrefManager.getInstance(getApplicationContext()).saveDeviceToken(token);
    }
}