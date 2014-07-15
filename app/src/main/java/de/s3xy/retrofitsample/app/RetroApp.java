package de.s3xy.retrofitsample.app;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;

import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;

@ReportsCrashes(
        formKey = "", // This is required for backward compatibility but not used
        mailTo = "robertwang.tw@gmail.com",
        mode = ReportingInteractionMode.TOAST,
        resToastText = R.string.crash_toast_text
)
public class RetroApp extends Application {

    public static String HOST = "https://api.instagram.com/v1/";
    public static String instagram_client_id = "6893ad42f6fa4f40aea2f3c584f71313";

    public static String cur_lat, cur_lng = "";
    public static String search_range = "5000";
    public static String theAddress = "";
    public static Location cur_location;

    public static boolean IS_WEARABLE_FEATURE_PURCHASED = false;

    @Override
    public void onCreate() {
        super.onCreate();
    }



}
