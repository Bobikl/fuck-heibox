package com.ishumei.smantifraud.l111l11111I1l;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111l1Il {
    private static final int l1111l111111Il = -1;
    private static final FileFilter l111l11111lIl = new FileFilter() { // from class: com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.1
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            try {
                if (name.startsWith(ak.f104463w)) {
                    for (int i10 = 3; i10 < name.length(); i10++) {
                        if (!Character.isDigit(name.charAt(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            return false;
        }
    };

    public static final class l1111l111111Il {
        public String l1111l111111Il = "";
        public String l111l11111lIl = "";
    }

    private static int l1111l111111Il(String str) throws Throwable {
        FileInputStream fileInputStream;
        int i10 = -1;
        BufferedReader bufferedReader = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null && line.matches("0-[\\d]+$")) {
                        i10 = Integer.parseInt(line.substring(2)) + 1;
                    }
                    com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il((Closeable) bufferedReader2);
                } catch (IOException unused) {
                    bufferedReader = bufferedReader2;
                    com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il((Closeable) bufferedReader);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il((Closeable) bufferedReader);
                    com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il((Closeable) fileInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused3) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il((Closeable) fileInputStream);
        return i10;
    }

    private static int l1111l111111Il(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int i10 = fileInputStream.read(bArr);
            int i11 = 0;
            while (i11 < i10) {
                byte b10 = bArr[i11];
                if (b10 == 10 || i11 == 0) {
                    if (b10 == 10) {
                        i11++;
                    }
                    int i12 = i11;
                    while (i12 < i10) {
                        int i13 = i12 - i11;
                        if (bArr[i12] != str.charAt(i13)) {
                            break;
                        }
                        if (i13 == str.length() - 1) {
                            while (i12 < 1024) {
                                byte b11 = bArr[i12];
                                if (b11 == 10) {
                                    break;
                                }
                                if (Character.isDigit(b11)) {
                                    int i14 = i12 + 1;
                                    while (i14 < 1024 && Character.isDigit(bArr[i14])) {
                                        i14++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i12, i14 - i12));
                                }
                                i12++;
                            }
                            return -1;
                        }
                        i12++;
                    }
                }
                i11++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }

    private static int l1111l111111Il(byte[] bArr, int i10) {
        byte b10;
        while (i10 < 1024 && (b10 = bArr[i10]) != 10) {
            if (Character.isDigit(b10)) {
                int i11 = i10 + 1;
                while (i11 < 1024 && Character.isDigit(bArr[i11])) {
                    i11++;
                }
                return Integer.parseInt(new String(bArr, 0, i10, i11 - i10));
            }
            i10++;
        }
        return -1;
    }

    public static l1111l111111Il l1111l111111Il() {
        l1111l111111Il l1111l111111il = new l1111l111111Il();
        try {
            Iterator<String> it = com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l111l11111Il("/proc/cpuinfo").iterator();
            while (it.hasNext()) {
                String[] strArrSplit = it.next().split(":");
                if (2 == strArrSplit.length) {
                    String strTrim = strArrSplit[0].trim();
                    String strTrim2 = strArrSplit[1].trim();
                    if ("Hardware".equals(strTrim)) {
                        l1111l111111il.l111l11111lIl = strTrim2;
                    }
                    if (TextUtils.equals("Processor", strTrim) || TextUtils.equals("model name", strTrim)) {
                        l1111l111111il.l1111l111111Il = strTrim2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return l1111l111111il;
    }

    public static int l111l11111I1l() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            int iL111l11111lIl = l111l11111lIl();
            int iIntValue = -1;
            for (int i10 = 0; i10 < iL111l11111lIl; i10++) {
                File file = new File("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        int i11 = 0;
                        while (i11 < 128 && Character.isDigit(bArr[i11])) {
                            i11++;
                        }
                        Integer numValueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i11)));
                        if (numValueOf.intValue() > iIntValue) {
                            iIntValue = numValueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th3) {
                        com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il((Closeable) fileInputStream2);
                        throw th3;
                    }
                    com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il((Closeable) fileInputStream2);
                }
            }
            if (iIntValue == -1) {
                try {
                    fileInputStream = new FileInputStream("/proc/cpuinfo");
                    try {
                        int iL1111l111111Il = l1111l111111Il("cpu MHz", fileInputStream) * 1000;
                        if (iL1111l111111Il > iIntValue) {
                            iIntValue = iL1111l111111Il;
                        }
                        com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il((Closeable) fileInputStream);
                    } catch (Throwable th4) {
                        th2 = th4;
                        com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il((Closeable) fileInputStream);
                        throw th2;
                    }
                } catch (Throwable th5) {
                    fileInputStream = null;
                    th2 = th5;
                }
            }
            return iIntValue;
        } catch (Exception unused2) {
            return -1;
        }
    }

    @TargetApi(16)
    public static long l111l11111Il() {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return 0L;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static int l111l11111lIl() {
        try {
            int iL1111l111111Il = l1111l111111Il("/sys/devices/system/cpu/possible");
            if (iL1111l111111Il == -1) {
                iL1111l111111Il = l1111l111111Il("/sys/devices/system/cpu/present");
            }
            return iL1111l111111Il == -1 ? l111l1111l1Il() : iL1111l111111Il;
        } catch (SecurityException | Exception unused) {
            return -1;
        }
    }

    private static int l111l11111lIl(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.parseInt(str.substring(2)) + 1;
    }

    private static int l111l1111l1Il() {
        try {
            return new File("/sys/devices/system/cpu/possible").listFiles(l111l11111lIl).length;
        } catch (Exception unused) {
            return 0;
        }
    }
}
