package com.max.xiaoheihe.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;

/* JADX INFO: compiled from: RxPartMapUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class y {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static okhttp3.b0 a(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, 48827, new Class[]{File.class}, okhttp3.b0.class);
        return patchProxyResultProxy.isSupported ? (okhttp3.b0) patchProxyResultProxy.result : okhttp3.b0.create(okhttp3.v.j("multipart/form-data"), file);
    }

    public static okhttp3.b0 b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48826, new Class[]{String.class}, okhttp3.b0.class);
        return patchProxyResultProxy.isSupported ? (okhttp3.b0) patchProxyResultProxy.result : okhttp3.b0.create(okhttp3.v.j("multipart/form-data"), str);
    }
}
