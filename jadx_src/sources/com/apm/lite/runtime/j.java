package com.apm.lite.runtime;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class j {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:25:0x004b */
    public static JSONArray a(String str) throws Throwable {
        Closeable closeable;
        BufferedReader bufferedReader;
        Closeable closeable2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                bufferedReader = new BufferedReader(new FileReader(str));
                try {
                    File file = new File(str);
                    if (file.length() > 512000) {
                        bufferedReader.skip(file.length() - 512000);
                    }
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            com.apm.lite.k.k.a(bufferedReader);
                            return jSONArray;
                        }
                        jSONArray.put(line);
                    }
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    com.apm.lite.k.k.a(bufferedReader);
                    return null;
                }
            } catch (IOException e11) {
                e = e11;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                com.apm.lite.k.k.a(closeable2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }

    public static JSONArray b(String str) {
        try {
            return a(com.apm.lite.k.f.a(str, com.apm.lite.e.o().getLogcatDumpCount(), com.apm.lite.e.o().getLogcatLevel()).getAbsolutePath());
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
            return null;
        }
    }
}
