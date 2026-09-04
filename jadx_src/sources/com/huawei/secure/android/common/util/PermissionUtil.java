package com.huawei.secure.android.common.util;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.core.content.t0;
import com.huawei.secure.android.common.exception.NoPermissionCheckerException;

/* JADX INFO: loaded from: classes7.dex */
public class PermissionUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63082a = "PermissionUtil";

    public static boolean checkCallingPermission(Context context, String str, String str2) throws NoPermissionCheckerException {
        if (Binder.getCallingPid() == Process.myPid()) {
            return false;
        }
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static boolean checkPermission(Context context, String str, int i10, int i11, String str2) throws NoPermissionCheckerException {
        try {
            if (context.getApplicationInfo().targetSdkVersion > 23) {
                return context.checkPermission(str, i10, i11) == 0;
            }
            return t0.c(context, str, i10, i11, str2) == 0;
        } catch (Throwable th2) {
            Log.e(f63082a, "checkPermission: " + th2.getMessage() + " , you should implementation support library or androidx library");
            throw new NoPermissionCheckerException("you should implementation support library or androidx library");
        }
    }

    public static boolean checkSelfPermission(Context context, String str) throws NoPermissionCheckerException {
        return checkPermission(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
