package com.max.xiaoheihe.module.upload;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.cos.xml.CosXmlService;
import com.tencent.cos.xml.CosXmlServiceConfig;

/* JADX INFO: compiled from: CosServiceFactory.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f93470a = "ap-shanghai";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CosXmlService f93471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static CosXmlService f93472c;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static CosXmlService a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 46090, new Class[]{Context.class}, CosXmlService.class);
        if (patchProxyResultProxy.isSupported) {
            return (CosXmlService) patchProxyResultProxy.result;
        }
        if (f93471b == null) {
            f93471b = new CosXmlService(context, b(Boolean.FALSE), new b());
        }
        return f93471b;
    }

    private static CosXmlServiceConfig b(Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, null, changeQuickRedirect, true, 46092, new Class[]{Boolean.class}, CosXmlServiceConfig.class);
        return patchProxyResultProxy.isSupported ? (CosXmlServiceConfig) patchProxyResultProxy.result : new CosXmlServiceConfig.Builder().setRegion(f93470a).setDebuggable(false).isHttps(true).setAccelerate(bool.booleanValue()).builder();
    }

    public static CosXmlService c(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 46091, new Class[]{Context.class}, CosXmlService.class);
        if (patchProxyResultProxy.isSupported) {
            return (CosXmlService) patchProxyResultProxy.result;
        }
        if (f93472c == null) {
            f93472c = new CosXmlService(context, b(Boolean.TRUE), new b());
        }
        return f93472c;
    }
}
