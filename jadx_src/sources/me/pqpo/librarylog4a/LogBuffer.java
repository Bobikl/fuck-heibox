package me.pqpo.librarylog4a;

import android.util.Log;
import hj.c;

/* JADX INFO: loaded from: classes5.dex */
public class LogBuffer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f131851f = "LogBuffer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f131852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f131853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f131854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f131855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f131856e;

    static {
        System.loadLibrary("log4a-lib");
    }

    public LogBuffer(String str, int i10, String str2, boolean z10) {
        this.f131852a = 0L;
        this.f131854c = str;
        this.f131855d = i10;
        this.f131853b = str2;
        this.f131856e = z10;
        try {
            this.f131852a = initNative(str, i10, str2, z10);
        } catch (Exception e10) {
            Log.e(f131851f, c.g(e10));
        }
    }

    private native void changeLogPathNative(long j10, String str);

    private native void flushAsyncNative(long j10);

    private static native long initNative(String str, int i10, String str2, boolean z10);

    private native void releaseNative(long j10);

    private native void writeNative(long j10, String str);

    public void a(String str) {
        long j10 = this.f131852a;
        if (j10 != 0) {
            try {
                changeLogPathNative(j10, str);
                this.f131853b = str;
            } catch (Exception e10) {
                Log.e(f131851f, c.g(e10));
            }
        }
    }

    public void b() {
        long j10 = this.f131852a;
        if (j10 != 0) {
            try {
                flushAsyncNative(j10);
            } catch (Exception e10) {
                Log.e(f131851f, c.g(e10));
            }
        }
    }

    public String c() {
        return this.f131854c;
    }

    public int d() {
        return this.f131855d;
    }

    public String e() {
        return this.f131853b;
    }

    public boolean f() {
        return this.f131856e;
    }

    public void g() {
        long j10 = this.f131852a;
        if (j10 != 0) {
            try {
                releaseNative(j10);
            } catch (Exception e10) {
                Log.e(f131851f, c.g(e10));
            }
            this.f131852a = 0L;
        }
    }

    public void h(String str) {
        long j10 = this.f131852a;
        if (j10 != 0) {
            try {
                writeNative(j10, str);
            } catch (Exception e10) {
                Log.e(f131851f, c.g(e10));
            }
        }
    }
}
