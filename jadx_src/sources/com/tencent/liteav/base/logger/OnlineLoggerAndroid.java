package com.tencent.liteav.base.logger;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class OnlineLoggerAndroid {
    private static final int INVALID_INSTANCE = -1;
    private long mNativeOnlineLoggerAndroid;

    public enum a {
        kTRTC(0),
        kLive(1),
        kVod(2);

        int value;

        a(int i10) {
            this.value = i10;
        }
    }

    public enum b {
        kApi(1),
        kInfo(2),
        kWarning(3),
        kError(4);

        int level;

        b(int i10) {
            this.level = i10;
        }
    }

    public OnlineLoggerAndroid(a aVar, int i10, String str, String str2) {
        this.mNativeOnlineLoggerAndroid = -1L;
        this.mNativeOnlineLoggerAndroid = nativeCreate(aVar.value, i10, str, str2);
    }

    private static native long nativeCreate(int i10, int i11, String str, String str2);

    private static native void nativeDestroy(long j10);

    private static native void nativeLog(long j10, int i10, String str);

    public synchronized void destroy() {
        long j10 = this.mNativeOnlineLoggerAndroid;
        if (j10 == -1) {
            return;
        }
        nativeDestroy(j10);
        this.mNativeOnlineLoggerAndroid = -1L;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    public synchronized void log(b bVar, String str) {
        long j10 = this.mNativeOnlineLoggerAndroid;
        if (j10 == -1) {
            return;
        }
        nativeLog(j10, bVar.level, str);
    }
}
