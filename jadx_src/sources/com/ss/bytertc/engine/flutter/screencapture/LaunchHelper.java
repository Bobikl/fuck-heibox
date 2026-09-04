package com.ss.bytertc.engine.flutter.screencapture;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.ss.bytertc.engine.data.ScreenMediaType;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class LaunchHelper {
    static final String EXTRA_STREAM_TYPE = "type";
    private static final String TAG = "LaunchHelper";

    public static boolean requestScreenCapture(Context context, ScreenMediaType screenMediaType) {
        try {
            Intent intent = new Intent(context.getPackageName() + ".action.REQUEST_SCREEN_CAPTURE");
            intent.setPackage(context.getPackageName());
            intent.putExtra("type", screenMediaType);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e10) {
            Log.d(TAG, "requestScreenCapture", e10);
            return false;
        }
    }
}
