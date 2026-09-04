package com.apm.lite.f;

import com.apm.lite.e;
import com.apm.lite.k.i;
import com.apm.lite.k.q;
import com.apm.lite.runtime.m;
import com.apm.lite.runtime.o;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, String> f39948a;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f39949b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39950c;

        a(String str) {
            this.f39950c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            b.h();
            if (b.j(this.f39950c)) {
                return;
            }
            o.d("updateSo", this.f39950c);
            File file = new File(b.b(this.f39950c));
            file.getParentFile().mkdirs();
            if (file.exists()) {
                file.delete();
            }
            q.b("doUnpackLibrary: " + this.f39950c);
            String strA = null;
            try {
                strA = c.a(e.m(), this.f39950c, file);
            } catch (Throwable th2) {
                o.d("updateSoError", this.f39950c);
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
            if (strA == null) {
                b.f39948a.put(file.getName(), "0.0.1-rc.3");
                try {
                    i.j(new File(b.i(this.f39950c)), "0.0.1-rc.3", false);
                } catch (Throwable unused) {
                }
                str = this.f39950c;
                str2 = "updateSoSuccess";
            } else {
                if (!this.f39949b) {
                    this.f39949b = true;
                    o.d("updateSoPostRetry", this.f39950c);
                    m.b().f(this, 3000L);
                    return;
                }
                str = this.f39950c;
                str2 = "updateSoFailed";
            }
            o.d(str2, str);
        }
    }

    public static String a() {
        return e.m().getFilesDir() + "/apmlite/selflib/";
    }

    public static String b(String str) {
        return e.m().getFilesDir() + "/apmlite/selflib/lib" + str + DynamicSoManager.f77250e;
    }

    public static void d(String str) {
        m.b().e(new a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f39948a != null) {
            return;
        }
        f39948a = new HashMap<>();
        File file = new File(e.m().getFilesDir(), "/apmlite/selflib/");
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (str.endsWith(".ver")) {
                try {
                    f39948a.put(str.substring(0, str.length() - 4), i.z(file.getAbsolutePath() + "/" + str));
                } catch (Throwable th2) {
                    com.apm.lite.c.a();
                    com.apm.lite.c.b("NPTH_CATCH", th2);
                }
            } else if (!str.endsWith(DynamicSoManager.f77250e)) {
                i.r(new File(file, str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(String str) {
        return e.m().getFilesDir() + "/apmlite/selflib/" + str + ".ver";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(String str) {
        return "0.0.1-rc.3".equals(f39948a.get(str)) && new File(b(str)).exists();
    }
}
