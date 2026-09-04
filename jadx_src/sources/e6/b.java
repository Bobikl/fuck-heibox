package e6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    public static String a(String str, String str2) throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            File file = new File(str, str2);
            if (!file.exists()) {
                return null;
            }
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                } catch (IOException unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader = bufferedReader2;
                    }
                    return sb2.toString();
                } catch (Throwable th3) {
                    th2 = th3;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 == null) {
                        throw th2;
                    }
                    try {
                        bufferedReader2.close();
                        throw th2;
                    } catch (Throwable unused2) {
                        throw th2;
                    }
                }
            }
            bufferedReader.close();
            return sb2.toString();
        } catch (IOException unused3) {
        } catch (Throwable th4) {
            th2 = th4;
        }
        if (bufferedReader2 != null) {
            bufferedReader = bufferedReader2;
            try {
                bufferedReader.close();
            } catch (Throwable unused4) {
            }
        }
        return sb2.toString();
    }
}
