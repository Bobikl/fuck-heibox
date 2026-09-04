package com.apm.lite.k;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f40053a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f40054b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f40055c = Pattern.compile("^0-([\\d]+)$");

    public static final class a implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Pattern f40056a = Pattern.compile("^cpu[\\d]+$");

        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f40056a.matcher(str).matches();
        }
    }

    public static String a() {
        return c(r4.a.f138781a);
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = a();
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("emotionui")) {
            return d();
        }
        return true;
    }

    private static String c(String str) {
        BufferedReader bufferedReader;
        String line = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                line = bufferedReader.readLine();
                bufferedReader.close();
                k.a(bufferedReader);
                return line;
            } catch (Throwable unused) {
                k.a(bufferedReader);
                return line;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    public static boolean d() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2) || !str2.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int e(String str) {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null) {
                        int iG = g(line);
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused) {
                        }
                        return iG;
                    }
                    bufferedReader2.close();
                } catch (Throwable unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader == null) {
                        return -1;
                    }
                    bufferedReader.close();
                }
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable unused4) {
        }
        return -1;
    }

    public static boolean f() {
        if (!f40053a) {
            try {
                Class.forName("miui.os.Build");
                com.apm.lite.j.e.f40011a = true;
                f40053a = true;
                return true;
            } catch (Exception unused) {
                f40053a = true;
            }
        }
        return com.apm.lite.j.e.f40011a;
    }

    private static int g(String str) {
        Matcher matcher = f40055c.matcher(str);
        if (matcher.matches()) {
            try {
                return Integer.parseInt(matcher.group(1)) + 1;
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static boolean h() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static int i() {
        int i10 = f40054b;
        if (i10 > 0) {
            return i10;
        }
        int iE = e("/sys/devices/system/cpu/possible");
        if (iE <= 0) {
            iE = e("/sys/devices/system/cpu/present");
        }
        if (iE <= 0) {
            iE = j("/sys/devices/system/cpu/");
        }
        if (iE <= 0) {
            iE = Runtime.getRuntime().availableProcessors();
        }
        if (iE <= 0) {
            iE = 1;
        }
        f40054b = iE;
        return iE;
    }

    private static int j(String str) {
        try {
            File[] fileArrListFiles = new File(str).listFiles(new a());
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return -1;
            }
            return fileArrListFiles.length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
