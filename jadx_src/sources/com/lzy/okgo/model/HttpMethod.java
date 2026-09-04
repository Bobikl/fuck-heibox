package com.lzy.okgo.model;

import com.jd.jdcache.util.UrlHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes6.dex */
public enum HttpMethod {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    HEAD("HEAD"),
    PATCH(UrlHelper.METHOD_PATCH),
    OPTIONS("OPTIONS"),
    TRACE("TRACE");

    public static ChangeQuickRedirect changeQuickRedirect;
    private final String value;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64760a;

        static {
            int[] iArr = new int[HttpMethod.valuesCustom().length];
            f64760a = iArr;
            try {
                iArr[HttpMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64760a[HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64760a[HttpMethod.PATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64760a[HttpMethod.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64760a[HttpMethod.OPTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    HttpMethod(String str) {
        this.value = str;
    }

    public static HttpMethod valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.A8, new Class[]{String.class}, HttpMethod.class);
        return patchProxyResultProxy.isSupported ? (HttpMethod) patchProxyResultProxy.result : (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static HttpMethod[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.f31080z8, new Class[0], HttpMethod[].class);
        return patchProxyResultProxy.isSupported ? (HttpMethod[]) patchProxyResultProxy.result : (HttpMethod[]) values().clone();
    }

    public boolean hasBody() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.B8, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int i10 = a.f64760a[ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
