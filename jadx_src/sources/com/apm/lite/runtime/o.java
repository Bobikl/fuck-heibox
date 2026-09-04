package com.apm.lite.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static File f40203a;

    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.c();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f40204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f40205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f40206c;

        b(String str) {
            String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length != 3) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", new RuntimeException("err ProcessTrack line:" + str));
                return;
            }
            this.f40204a = strArrSplit[0];
            this.f40205b = strArrSplit[1];
            try {
                this.f40206c = Long.parseLong(strArrSplit[2]);
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", new RuntimeException("err ProcessTrack line:" + str, th2));
            }
        }
    }

    public static File a(long j10) {
        return new File(com.apm.lite.k.o.E(com.apm.lite.e.m()), "apmlite/ProcessTrack/" + ((j10 - (j10 % 86400000)) / 86400000));
    }

    public static HashMap<String, b> b(long j10, String str) throws Throwable {
        File file = new File(com.apm.lite.k.o.E(com.apm.lite.e.m()), "apmlite/ProcessTrack/" + ((j10 - (j10 % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, b> map = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray jSONArrayH = com.apm.lite.k.i.h(file2, length > 1048576 ? length - PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : 0L);
                    for (int length2 = jSONArrayH.length() - 1; length2 >= 0; length2--) {
                        String strOptString = jSONArrayH.optString(length2);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith(str)) {
                            map.put(str2.replace('_', ':').replace(".txt", ""), new b(strOptString));
                            break;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return map;
    }

    public static void c() {
        File file;
        String[] list;
        if (com.apm.lite.k.a.k(com.apm.lite.e.m()) && (list = (file = new File(com.apm.lite.k.o.E(com.apm.lite.e.m()), "apmlite/ProcessTrack/")).list()) != null && list.length > 25) {
            Arrays.sort(list);
            for (int i10 = 0; i10 < list.length - 25; i10++) {
                com.apm.lite.k.i.r(new File(file, list[i10]));
            }
        }
    }

    public static void d(String str, String str2) {
        try {
            File fileE = e();
            if (fileE != null) {
                com.apm.lite.k.i.j(fileE, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }

    private static File e() {
        if (f40203a == null) {
            String strM = com.apm.lite.k.a.m(com.apm.lite.e.m());
            if (strM == null) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            f40203a = new File(com.apm.lite.k.o.E(com.apm.lite.e.m()), "apmlite/ProcessTrack/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + IOUtils.DIR_SEPARATOR_UNIX + strM.replace(':', '_') + ".txt");
            m.b().f(new a(), 15000L);
        }
        return f40203a;
    }
}
