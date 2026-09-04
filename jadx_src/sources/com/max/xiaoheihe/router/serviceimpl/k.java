package com.max.xiaoheihe.router.serviceimpl;

import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import com.max.hbsearch.SearchNewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;

/* JADX INFO: compiled from: SearchServiceImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {pb.k.class}, key = {"search"})
public class k implements pb.k {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.k
    @n0
    public Fragment a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48397, new Class[0], Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : com.max.xiaoheihe.module.game.pick.c.P3();
    }

    @Override // pb.k
    @n0
    public Fragment b(@n0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 48396, new Class[]{Bundle.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : com.max.xiaoheihe.module.search.b.f91614a.q(bundle);
    }

    @Override // pb.k
    @n0
    public Fragment c(@p0 String str, @p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bundle}, this, changeQuickRedirect, false, 48398, new Class[]{String.class, Bundle.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : SearchNewFragment.f72177a4.b(str, bundle);
    }
}
