package com.alipay.mobile.android.verify.logger;

import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: PrettyFormatStrategy.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f39371f = 4000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f39372g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f39373h = 9484;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f39374i = 9492;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char f39375j = 9500;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char f39376k = 9474;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f39377l = "────────────────────────────────────────────────────────";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f39378m = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f39379n = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f39380o = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f39381p = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f39384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f39385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f39386e;

    /* JADX INFO: compiled from: PrettyFormatStrategy.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f39388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f39389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d f39390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f39391e;

        private a() {
            this.f39387a = 2;
            this.f39388b = 0;
            this.f39389c = true;
            this.f39391e = "LOGGER";
        }

        public g a() {
            if (this.f39390d == null) {
                this.f39390d = new e();
            }
            return new g(this);
        }

        public a b(d dVar) {
            this.f39390d = dVar;
            return this;
        }

        public a c(int i10) {
            this.f39387a = i10;
            return this;
        }

        public a d(int i10) {
            this.f39388b = i10;
            return this;
        }

        public a e(boolean z10) {
            this.f39389c = z10;
            return this;
        }

        public a f(String str) {
            this.f39391e = str;
            return this;
        }
    }

    private g(a aVar) {
        this.f39382a = aVar.f39387a;
        this.f39383b = aVar.f39388b;
        this.f39384c = aVar.f39389c;
        this.f39385d = aVar.f39390d;
        this.f39386e = aVar.f39391e;
    }

    private String b(String str) {
        if (k.c(str) || k.d(this.f39386e, str)) {
            return this.f39386e;
        }
        return this.f39386e + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str;
    }

    private String c(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }

    private int d(StackTraceElement[] stackTraceElementArr) {
        for (int i10 = 5; i10 < stackTraceElementArr.length; i10++) {
            String className = stackTraceElementArr[i10].getClassName();
            if (!className.equals(i.class.getName()) && !className.equals(f.class.getName())) {
                return i10 - 1;
            }
        }
        return -1;
    }

    private void e(int i10, String str) {
        f(i10, str, f39380o);
    }

    private void f(int i10, String str, String str2) {
        this.f39385d.a(i10, str, str2);
    }

    private void g(int i10, String str, String str2) {
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            f(i10, str, "│ " + str3);
        }
    }

    private void h(int i10, String str) {
        f(i10, str, f39381p);
    }

    private void i(int i10, String str, int i11) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (this.f39384c) {
            f(i10, str, "│ Thread: " + Thread.currentThread().getName());
            h(i10, str);
        }
        int iD = d(stackTrace) + this.f39383b;
        if (i11 + iD > stackTrace.length) {
            i11 = (stackTrace.length - iD) - 1;
        }
        String str2 = "";
        while (i11 > 0) {
            int i12 = i11 + iD;
            if (i12 < stackTrace.length) {
                str2 = str2 + "   ";
                f(i10, str, f39376k + ' ' + str2 + c(stackTrace[i12].getClassName()) + "." + stackTrace[i12].getMethodName() + "  (" + stackTrace[i12].getFileName() + ":" + stackTrace[i12].getLineNumber() + ")");
            }
            i11--;
        }
    }

    private void j(int i10, String str) {
        f(i10, str, f39379n);
    }

    public static a k() {
        return new a();
    }

    @Override // com.alipay.mobile.android.verify.logger.b
    public void a(int i10, String str, String str2) {
        String strB = b(str);
        j(i10, strB);
        i(i10, strB, this.f39382a);
        byte[] bytes = str2.getBytes();
        int length = bytes.length;
        if (length <= 4000) {
            if (this.f39382a > 0) {
                h(i10, strB);
            }
            g(i10, strB, str2);
            e(i10, strB);
            return;
        }
        if (this.f39382a > 0) {
            h(i10, strB);
        }
        for (int i11 = 0; i11 < length; i11 += 4000) {
            g(i10, strB, new String(bytes, i11, Math.min(length - i11, 4000)));
        }
        e(i10, strB);
    }
}
