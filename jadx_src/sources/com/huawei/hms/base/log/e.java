package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import com.tencent.qcloud.core.util.IOUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: LogRecord.java */
/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f60442d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f60445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f60446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f60448j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f60439a = new StringBuilder();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f60443e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f60444f = 0;

    e(int i10, String str, int i11, String str2) {
        this.f60441c = "HMS";
        this.f60448j = i10;
        this.f60440b = str;
        this.f60442d = i11;
        if (str2 != null) {
            this.f60441c = str2;
        }
        b();
    }

    public static String a(int i10) {
        if (i10 == 3) {
            return "D";
        }
        if (i10 == 4) {
            return "I";
        }
        if (i10 != 5) {
            return i10 != 6 ? String.valueOf(i10) : androidx.exifinterface.media.a.S4;
        }
        return androidx.exifinterface.media.a.T4;
    }

    private StringBuilder a(StringBuilder sb2) {
        sb2.append(' ');
        sb2.append(this.f60439a.toString());
        return sb2;
    }

    private e b() {
        this.f60443e = System.currentTimeMillis();
        Thread threadCurrentThread = Thread.currentThread();
        this.f60444f = threadCurrentThread.getId();
        this.f60446h = Process.myPid();
        StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
        int length = stackTrace.length;
        int i10 = this.f60448j;
        if (length > i10) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            this.f60445g = stackTraceElement.getFileName();
            this.f60447i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    private StringBuilder b(StringBuilder sb2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb2.append('[');
        sb2.append(simpleDateFormat.format(Long.valueOf(this.f60443e)));
        String strA = a(this.f60442d);
        sb2.append(' ');
        sb2.append(strA);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(this.f60441c);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(this.f60440b);
        sb2.append(' ');
        sb2.append(this.f60446h);
        sb2.append(':');
        sb2.append(this.f60444f);
        sb2.append(' ');
        sb2.append(this.f60445g);
        sb2.append(':');
        sb2.append(this.f60447i);
        sb2.append(']');
        return sb2;
    }

    public <T> e a(T t10) {
        this.f60439a.append(t10);
        return this;
    }

    public e a(Throwable th2) {
        a('\n').a(Log.getStackTraceString(th2));
        return this;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2);
        return sb2.toString();
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2);
        return sb2.toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2);
        a(sb2);
        return sb2.toString();
    }
}
