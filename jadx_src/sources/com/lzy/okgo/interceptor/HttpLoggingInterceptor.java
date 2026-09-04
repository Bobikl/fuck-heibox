package com.lzy.okgo.interceptor;

import bb.c;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import la.d;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.i;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.s;
import okhttp3.u;
import okhttp3.v;
import okio.Buffer;

/* JADX INFO: loaded from: classes6.dex */
public class HttpLoggingInterceptor implements u {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f64731e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Level f64732a = Level.NONE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.logging.Level f64733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Logger f64734d;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Level valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.f30675h8, new Class[]{String.class}, Level.class);
            return patchProxyResultProxy.isSupported ? (Level) patchProxyResultProxy.result : (Level) Enum.valueOf(Level.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Level[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 578, new Class[0], Level[].class);
            return patchProxyResultProxy.isSupported ? (Level[]) patchProxyResultProxy.result : (Level[]) values().clone();
        }
    }

    public HttpLoggingInterceptor(String str) {
        this.f64734d = Logger.getLogger(str);
    }

    private void a(a0 a0Var) {
        if (PatchProxy.proxy(new Object[]{a0Var}, this, changeQuickRedirect, false, c.b.f30629f8, new Class[]{a0.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            b0 b0VarF = a0Var.n().b().f();
            if (b0VarF == null) {
                return;
            }
            Buffer buffer = new Buffer();
            b0VarF.writeTo(buffer);
            d("\tbody:" + buffer.readString(b(b0VarF.getContentType())));
        } catch (Exception e10) {
            d.i(e10);
        }
    }

    private static Charset b(v vVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{vVar}, null, changeQuickRedirect, true, c.b.f30583d8, new Class[]{v.class}, Charset.class);
        if (patchProxyResultProxy.isSupported) {
            return (Charset) patchProxyResultProxy.result;
        }
        Charset charsetF = vVar != null ? vVar.f(f64731e) : f64731e;
        return charsetF == null ? f64731e : charsetF;
    }

    private static boolean c(v vVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{vVar}, null, changeQuickRedirect, true, c.b.f30606e8, new Class[]{v.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (vVar == null) {
            return false;
        }
        if (vVar.l() != null && vVar.l().equals("text")) {
            return true;
        }
        String strK = vVar.k();
        if (strK != null) {
            String lowerCase = strK.toLowerCase();
            if (lowerCase.contains("x-www-form-urlencoded") || lowerCase.contains("json") || lowerCase.contains("xml") || lowerCase.contains(LinkDraftObj.DRAFT_TYPE_HTML)) {
                return true;
            }
        }
        return false;
    }

    private void d(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.Z7, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64734d.log(this.f64733c, str);
    }

    private void e(a0 a0Var, i iVar) throws IOException {
        StringBuilder sb2;
        if (PatchProxy.proxy(new Object[]{a0Var, iVar}, this, changeQuickRedirect, false, c.b.f30536b8, new Class[]{a0.class, i.class}, Void.TYPE).isSupported) {
            return;
        }
        Level level = this.f64732a;
        Level level2 = Level.BODY;
        boolean z10 = level == level2;
        boolean z11 = this.f64732a == level2 || this.f64732a == Level.HEADERS;
        b0 b0VarF = a0Var.f();
        boolean z12 = b0VarF != null;
        try {
            d("--> " + a0Var.m() + ' ' + a0Var.q() + ' ' + (iVar != null ? iVar.protocol() : Protocol.HTTP_1_1));
            if (z11) {
                if (z12) {
                    if (b0VarF.getContentType() != null) {
                        d("\tContent-Type: " + b0VarF.getContentType());
                    }
                    if (b0VarF.contentLength() != -1) {
                        d("\tContent-Length: " + b0VarF.contentLength());
                    }
                }
                s sVarK = a0Var.k();
                int size = sVarK.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strI = sVarK.i(i10);
                    if (!"Content-Type".equalsIgnoreCase(strI) && !"Content-Length".equalsIgnoreCase(strI)) {
                        d("\t" + strI + ": " + sVarK.v(i10));
                    }
                }
                d(" ");
                if (z10 && z12) {
                    if (c(b0VarF.getContentType())) {
                        a(a0Var);
                    } else {
                        d("\tbody: maybe [binary body], omitted!");
                    }
                }
            }
            sb2 = new StringBuilder();
        } catch (Exception e10) {
            d.i(e10);
            sb2 = new StringBuilder();
        } finally {
            d("--> END " + a0Var.m());
        }
        sb2.append("--> END ");
        sb2.append(a0Var.m());
        String string = sb2.toString();
    }

    private c0 f(c0 c0Var, long j10) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var, new Long(j10)}, this, changeQuickRedirect, false, c.b.f30559c8, new Class[]{c0.class, Long.TYPE}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        c0 c0VarC = c0Var.P().c();
        d0 d0VarQ = c0VarC.q();
        Level level = this.f64732a;
        Level level2 = Level.BODY;
        boolean z11 = level == level2;
        if (this.f64732a != level2 && this.f64732a != Level.HEADERS) {
            z10 = false;
        }
        try {
            try {
                d("<-- " + c0VarC.x() + ' ' + c0VarC.getMessage() + ' ' + c0VarC.getRequest().q() + " (" + j10 + "ms）");
                if (z10) {
                    s headers = c0VarC.getHeaders();
                    int size = headers.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        d("\t" + headers.i(i10) + ": " + headers.v(i10));
                    }
                    d(" ");
                    if (z11 && HttpHeaders.hasBody(c0VarC)) {
                        if (d0VarQ == null) {
                            return c0Var;
                        }
                        if (c(d0VarQ.getF132480d())) {
                            byte[] bArrA = la.c.A(d0VarQ.byteStream());
                            d("\tbody:" + new String(bArrA, b(d0VarQ.getF132480d())));
                            return c0Var.P().b(d0.create(d0VarQ.getF132480d(), bArrA)).c();
                        }
                        d("\tbody: maybe [binary body], omitted!");
                    }
                }
            } catch (Exception e10) {
                d.i(e10);
            }
            return c0Var;
        } finally {
            d("<-- END HTTP");
        }
    }

    public void g(java.util.logging.Level level) {
        this.f64733c = level;
    }

    public void h(Level level) {
        if (PatchProxy.proxy(new Object[]{level}, this, changeQuickRedirect, false, c.b.Y7, new Class[]{Level.class}, Void.TYPE).isSupported) {
            return;
        }
        if (level == null) {
            throw new NullPointerException("level == null. Use Level.NONE instead.");
        }
        this.f64732a = level;
    }

    @Override // okhttp3.u
    public c0 intercept(u.a aVar) throws Exception {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, c.b.f30513a8, new Class[]{u.a.class}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        a0 a0VarRequest = aVar.request();
        if (this.f64732a == Level.NONE) {
            return aVar.proceed(a0VarRequest);
        }
        e(a0VarRequest, aVar.connection());
        try {
            return f(aVar.proceed(a0VarRequest), TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - System.nanoTime()));
        } catch (Exception e10) {
            d("<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }
}
