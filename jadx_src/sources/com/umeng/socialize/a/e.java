package com.umeng.socialize.a;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.utils.ContextUtil;

/* JADX INFO: compiled from: SharedPrefs.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f106080a = "Prefs";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f106081c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f106082b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f106083d = new a("AZX");

    /* JADX INFO: compiled from: SharedPrefs.java */
    public class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f106085b;

        public a(String str) {
            if (!TextUtils.isEmpty(str)) {
                str = str + lg.a.f131412e;
            }
            this.f106085b = str;
        }

        private String b(String str) {
            return this.f106085b + str;
        }

        private String c(String str, String str2) {
            try {
                if (c.a(ContextUtil.getContext())) {
                    return b.a().b(str, str2);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return str2;
        }

        private void c(String str) {
            try {
                if (c.a(ContextUtil.getContext())) {
                    b.a().a(str);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        private void d(String str, String str2) {
            try {
                if (c.a(ContextUtil.getContext())) {
                    b.a().a(str, str2);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void a(String str) {
            c(b(str));
        }

        public void a(String str, float f10) {
            d(b(str), String.valueOf(f10));
        }

        public void a(String str, int i10) {
            d(b(str), String.valueOf(i10));
        }

        public void a(String str, long j10) {
            d(b(str), String.valueOf(j10));
        }

        public void a(String str, String str2) {
            d(b(str), String.valueOf(str2));
        }

        public void a(String str, boolean z10) {
            d(b(str), String.valueOf(z10));
        }

        public float b(String str, float f10) {
            try {
                return Float.parseFloat(c(b(str), String.valueOf(f10)));
            } catch (Exception unused) {
                return f10;
            }
        }

        public int b(String str, int i10) {
            try {
                return Integer.parseInt(c(b(str), String.valueOf(i10)));
            } catch (Exception unused) {
                return i10;
            }
        }

        public long b(String str, long j10) {
            try {
                return Long.parseLong(c(b(str), String.valueOf(j10)));
            } catch (Exception unused) {
                return j10;
            }
        }

        public String b(String str, String str2) {
            return c(b(str), str2);
        }

        public boolean b(String str, boolean z10) {
            try {
                return Boolean.parseBoolean(c(b(str), String.valueOf(z10)));
            } catch (Exception unused) {
                return z10;
            }
        }
    }

    private e(Context context) {
        this.f106082b = context.getApplicationContext();
    }

    public static e a(Context context) {
        if (f106081c == null) {
            synchronized (e.class) {
                if (f106081c == null) {
                    f106081c = new e(context);
                }
            }
        }
        return f106081c;
    }

    private void a(String str, long j10) {
        this.f106083d.a(str + ak.aT, j10);
        this.f106083d.a(str + "ts", System.currentTimeMillis());
    }

    private boolean a(String str) {
        long jB = this.f106083d.b(str + ak.aT, 0L);
        if (jB <= 0) {
            return true;
        }
        long jAbs = Math.abs(System.currentTimeMillis() - this.f106083d.b(str + "ts", 0L)) / 1000;
        boolean z10 = jAbs >= jB;
        if (!z10 && com.umeng.socialize.a.a.f106070c) {
            m.a(f106080a, "interval deny ", str, " config:", Long.valueOf(jB), " current:", Long.valueOf(jAbs));
        }
        return z10;
    }

    private void b(String str) {
        this.f106083d.a(str + ak.aT);
        this.f106083d.a(str + "ts");
    }

    public long a() {
        return this.f106083d.b("smart_ts", 0L);
    }

    public void a(int i10) {
        this.f106083d.a(com.umeng.socialize.a.a.f106073f, i10);
    }

    public void a(long j10) {
        a(com.umeng.socialize.a.a.f106072e, j10);
    }

    public boolean b() {
        return a(com.umeng.socialize.a.a.f106072e);
    }

    public int c() {
        return this.f106083d.b(com.umeng.socialize.a.a.f106073f, 0);
    }

    public long d() {
        return this.f106083d.b(com.umeng.socialize.a.a.f106071d, 0L);
    }

    public void e() {
        if (c.a(this.f106082b)) {
            this.f106083d.a(com.umeng.socialize.a.a.f106071d, d() + 1);
        }
    }
}
