/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.aacw_map.sdkdemo;

import android.app.Activity;
import android.content.Intent;

public class NormalUtils {

    public static void gotoSettings(Activity activity) {
        Intent it = new Intent(activity, DemoNaviSettingActivity.class);
        activity.startActivity(it);
    }

    public static String getTTSAppID() {
        return "15544389";
    }
}
