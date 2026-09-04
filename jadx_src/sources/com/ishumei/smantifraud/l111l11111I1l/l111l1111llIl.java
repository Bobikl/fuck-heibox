package com.ishumei.smantifraud.l111l11111I1l;

import android.content.Context;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111llIl {
    public static String l1111l111111Il() {
        int i10;
        int i11;
        int i12;
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            i10 = displayMetrics.widthPixels;
            try {
                i11 = displayMetrics.heightPixels;
                try {
                    i12 = displayMetrics.densityDpi;
                } catch (Exception unused) {
                    i12 = 0;
                }
            } catch (Exception unused2) {
                i11 = 0;
            }
        } catch (Exception unused3) {
            i10 = 0;
            i11 = 0;
        }
        return String.format(Locale.US, "%d,%d,%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static int l111l11111I1l() {
        try {
            return ((PowerManager) com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getSystemService("power")).isScreenOn() ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static StatFs l111l11111Il() {
        try {
            return new StatFs(Environment.getExternalStorageDirectory().getPath());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String l111l11111lIl() {
        int i10;
        int i11;
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            i10 = displayMetrics.widthPixels;
            try {
                i11 = displayMetrics.heightPixels;
            } catch (Exception unused) {
                i11 = 0;
            }
        } catch (Exception unused2) {
            i10 = 0;
        }
        return String.format(Locale.US, "%d,%d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static int l111l1111l1Il() {
        try {
            File[] fileArrListFiles = new File("/proc").listFiles();
            if (fileArrListFiles == null) {
                return 0;
            }
            return fileArrListFiles.length;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static List<String> l111l1111llIl() {
        return new ArrayList();
    }
}
