package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: RuntimeCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f41124a = "GlideRuntimeCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41125b = "cpu[0-9]+";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f41126c = "/sys/devices/system/cpu/";

    /* JADX INFO: compiled from: RuntimeCompat.java */
    public class a implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Pattern f41127a;

        a(Pattern pattern) {
            this.f41127a = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f41127a.matcher(str).matches();
        }
    }

    private b() {
    }

    static int a() {
        return Runtime.getRuntime().availableProcessors();
    }

    private static int b() {
        File[] fileArrListFiles;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArrListFiles = new File(f41126c).listFiles(new a(Pattern.compile(f41125b)));
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        } catch (Throwable th2) {
            try {
                if (Log.isLoggable(f41124a, 6)) {
                    Log.e(f41124a, "Failed to calculate accurate cpu count", th2);
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                fileArrListFiles = null;
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th3;
            }
        }
        return Math.max(1, fileArrListFiles != null ? fileArrListFiles.length : 0);
    }
}
