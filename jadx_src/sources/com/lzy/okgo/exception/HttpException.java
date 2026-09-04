package com.lzy.okgo.exception;

import bb.c;
import com.lzy.okgo.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes6.dex */
public class HttpException extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8773734741709178425L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f64724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f64725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient b<?> f64726d;

    public HttpException(b<?> bVar) {
        super(d(bVar));
        this.f64724b = bVar.b();
        this.f64725c = bVar.j();
        this.f64726d = bVar;
    }

    public HttpException(String str) {
        super(str);
    }

    public static HttpException a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.b.K7, new Class[]{String.class}, HttpException.class);
        return patchProxyResultProxy.isSupported ? (HttpException) patchProxyResultProxy.result : new HttpException(str);
    }

    public static HttpException b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.b.J7, new Class[0], HttpException.class);
        return patchProxyResultProxy.isSupported ? (HttpException) patchProxyResultProxy.result : new HttpException("network error! http response code is 404 or 5xx!");
    }

    private static String d(b<?> bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 554, new Class[]{b.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        la.b.b(bVar, "response == null");
        return "HTTP " + bVar.b() + " " + bVar.j();
    }

    public int c() {
        return this.f64724b;
    }

    public String e() {
        return this.f64725c;
    }

    public b<?> f() {
        return this.f64726d;
    }
}
