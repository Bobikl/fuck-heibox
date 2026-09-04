package com.tencent.mmkv;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;

/* JADX INFO: loaded from: classes4.dex */
public class MMKVContentProvider extends ContentProvider {
    protected static final String FUNCTION_NAME = "mmkvFromAshmemID";
    protected static final String KEY = "KEY";
    protected static final String KEY_CRYPT = "KEY_CRYPT";
    protected static final String KEY_MODE = "KEY_MODE";
    protected static final String KEY_SIZE = "KEY_SIZE";
    private static Uri gUri;

    @p0
    protected static Uri contentUri(Context context) {
        String strQueryAuthority;
        Uri uri = gUri;
        if (uri != null) {
            return uri;
        }
        if (context == null || (strQueryAuthority = queryAuthority(context)) == null) {
            return null;
        }
        Uri uri2 = Uri.parse("content://" + strQueryAuthority);
        gUri = uri2;
        return uri2;
    }

    protected static String getProcessNameByPID(Context context, int i10) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        if (activityManager == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == i10) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    private Bundle mmkvFromAshmemID(String str, int i10, int i11, String str2) throws RuntimeException {
        MMKV mmkvMmkvWithAshmemID = MMKV.mmkvWithAshmemID(getContext(), str, i10, i11, str2);
        ParcelableMMKV parcelableMMKV = new ParcelableMMKV(mmkvMmkvWithAshmemID);
        Log.i("MMKV", str + " fd = " + mmkvMmkvWithAshmemID.ashmemFD() + ", meta fd = " + mmkvMmkvWithAshmemID.ashmemMetaFD());
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY, parcelableMMKV);
        return bundle;
    }

    private static String queryAuthority(Context context) {
        ProviderInfo providerInfo;
        try {
            ComponentName componentName = new ComponentName(context, MMKVContentProvider.class.getName());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (providerInfo = packageManager.getProviderInfo(componentName, 0)) == null) {
                return null;
            }
            return providerInfo.authority;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // android.content.ContentProvider
    @p0
    public Bundle call(@n0 String str, @p0 String str2, @p0 Bundle bundle) {
        if (str.equals(FUNCTION_NAME) && bundle != null) {
            try {
                return mmkvFromAshmemID(str2, bundle.getInt(KEY_SIZE), bundle.getInt(KEY_MODE), bundle.getString(KEY_CRYPT));
            } catch (Exception e10) {
                Log.e("MMKV", e10.getMessage());
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(@n0 Uri uri, @p0 String str, @p0 String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    @p0
    public String getType(@n0 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @p0
    public Uri insert(@n0 Uri uri, @p0 ContentValues contentValues) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        String strQueryAuthority;
        Context context = getContext();
        if (context == null || (strQueryAuthority = queryAuthority(context)) == null) {
            return false;
        }
        if (gUri != null) {
            return true;
        }
        gUri = Uri.parse("content://" + strQueryAuthority);
        return true;
    }

    @Override // android.content.ContentProvider
    @p0
    public Cursor query(@n0 Uri uri, @p0 String[] strArr, @p0 String str, @p0 String[] strArr2, @p0 String str2) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public int update(@n0 Uri uri, @p0 ContentValues contentValues, @p0 String str, @p0 String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }
}
