package com.yubaraj.ocrsample;

/**
 * Created by yubraj on 2/2/17.
 */

import android.app.Activity;
import android.content.Context;

/**
 * Created by iuliia on 10/15/16.
 */

public interface RequestPermissionTool {
    void requestPermissions(Activity context, String[] permissions);

    boolean isPermissionsGranted(Context context, String[] permissions);

    void onPermissionDenied();
}