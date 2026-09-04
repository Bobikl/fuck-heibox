package com.google.android.play.core.splitinstall.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f56317a;

    public p1(String str) {
        this.f56317a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    private static String f(String str, String str2, @androidx.annotation.p0 Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, @androidx.annotation.p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", f(this.f56317a, str, objArr));
        }
        return 0;
    }

    public final int b(String str, @androidx.annotation.p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f56317a, str, objArr));
        }
        return 0;
    }

    public final int c(Throwable th2, String str, @androidx.annotation.p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f56317a, str, objArr), th2);
        }
        return 0;
    }

    public final int d(String str, @androidx.annotation.p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", f(this.f56317a, str, objArr));
        }
        return 0;
    }

    public final int e(String str, @androidx.annotation.p0 Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", f(this.f56317a, str, objArr));
        }
        return 0;
    }
}
