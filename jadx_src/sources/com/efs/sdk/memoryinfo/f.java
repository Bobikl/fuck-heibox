package com.efs.sdk.memoryinfo;

import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static long a() {
        BufferedReader bufferedReader;
        long j10;
        long j11 = -1;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/status")));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return j11;
                }
                String[] strArrSplit = sb2.toString().trim().split("\n");
                int length = strArrSplit.length;
                int length2 = strArrSplit.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        j10 = -1;
                        break;
                    }
                    String str = strArrSplit[i10];
                    if (str.startsWith("VmSize")) {
                        Matcher matcher = Pattern.compile("\\d+").matcher(str);
                        if (matcher.find()) {
                            j10 = Long.parseLong(matcher.group());
                            break;
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return j11;
                    }
                    i10++;
                }
                if (j10 == -1 && length > 12) {
                    try {
                        Matcher matcher2 = Pattern.compile("\\d+").matcher(strArrSplit[12]);
                        if (matcher2.find()) {
                            j10 = Long.parseLong(matcher2.group());
                        }
                    } catch (Throwable unused2) {
                        j11 = j10;
                    }
                }
                try {
                    bufferedReader.close();
                    return j10;
                } catch (Throwable unused3) {
                    return j10;
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
    }

    public static long a(Debug.MemoryInfo memoryInfo) {
        String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
        try {
            if (TextUtils.isEmpty(memoryStat)) {
                return 0L;
            }
            return Long.parseLong(memoryStat);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void a(String str, Throwable th2) {
        if (a.DEBUG) {
            Log.e("MemoryCollect", str, th2);
        }
    }
}
