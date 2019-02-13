package com.example.appbarlayout;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/**
 * Created by Mr.Wang on 2018/12/18 10:25.
 */
public class AppInfoUtils {

    public static String getChanceType(Context context){
        if (chanceType(context).equals("ali")){
            return "ali";
        }
        return "";
    }
    public static String chanceType(Context context){
        String sChanceType = "";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            if (!TextUtils.isEmpty(applicationInfo.metaData.getString("UMENG_CHANNEL"))){
                sChanceType = applicationInfo.metaData.getString("UMENG_CHANNEL");
                return sChanceType;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return sChanceType;
    }
}
