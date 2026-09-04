package com.max.xiaoheihe.module.webview;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;

/* JADX INFO: compiled from: WebServiceImpl.java */
/* JADX INFO: loaded from: classes12.dex */
@RouterService(interfaces = {pb.p.class}, key = {"web"})
public class z implements pb.p {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.p
    public void a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, this, changeQuickRedirect, false, 47168, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.m0(context, str, str2);
    }

    @Override // pb.p
    @androidx.annotation.n0
    public Fragment b(@androidx.annotation.n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47166, new Class[]{String.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : WebviewFragment.u7(str);
    }

    @Override // pb.p
    public void c(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 47167, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.k0(context, str);
    }
}
