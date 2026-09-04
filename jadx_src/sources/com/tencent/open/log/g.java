package com.tencent.open.log;

import android.text.format.Time;
import android.util.Log;
import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f101144a = new g();

    public final String a(int i10) {
        if (i10 == 1) {
            return androidx.exifinterface.media.a.X4;
        }
        if (i10 == 2) {
            return "D";
        }
        if (i10 == 4) {
            return "I";
        }
        if (i10 == 8) {
            return androidx.exifinterface.media.a.T4;
        }
        if (i10 != 16) {
            return i10 != 32 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : androidx.exifinterface.media.a.W4;
        }
        return androidx.exifinterface.media.a.S4;
    }

    public String a(int i10, Thread thread, long j10, String str, String str2, Throwable th2) {
        long j11 = j10 % 1000;
        Time time = new Time();
        time.set(j10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(i10));
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb2.append(lg.a.f131414g);
        if (j11 < 10) {
            sb2.append(org.apache.tools.tar.c.V);
        } else if (j11 < 100) {
            sb2.append('0');
        }
        sb2.append(j11);
        sb2.append(' ');
        sb2.append('[');
        if (thread == null) {
            sb2.append("N/A");
        } else {
            sb2.append(thread.getName());
        }
        sb2.append(']');
        sb2.append('[');
        sb2.append(str);
        sb2.append(']');
        sb2.append(' ');
        sb2.append(str2);
        sb2.append('\n');
        if (th2 != null) {
            sb2.append("* Exception : \n");
            sb2.append(Log.getStackTraceString(th2));
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
