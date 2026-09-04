package com.alipay.deviceid.module.x;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: FileUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:21:0x003f A[Catch: all -> 0x0042, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:11:0x002d, B:21:0x003f), top: B:28:0x0006 }] */
    public static String a(String str, String str2) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                File file = new File(str, str2);
                if (!file.exists()) {
                    return null;
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return sb2.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                return sb2.toString();
            } catch (Throwable unused3) {
            }
        } catch (IOException unused4) {
        } catch (Throwable th3) {
            th = th3;
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        return sb2.toString();
    }
}
