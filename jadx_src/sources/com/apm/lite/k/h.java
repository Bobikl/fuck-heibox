package com.apm.lite.k;

import android.os.Process;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class h {
    public static int a() {
        try {
            return new File("/proc/" + Process.myPid() + "/fd").listFiles().length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
