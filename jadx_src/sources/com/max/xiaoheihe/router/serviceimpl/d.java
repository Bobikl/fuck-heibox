package com.max.xiaoheihe.router.serviceimpl;

import androidx.annotation.n0;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;

/* JADX INFO: compiled from: DynamicSOServiceImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {pb.d.class}, key = {ob.b.f132264p})
public class d implements pb.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.d
    public void a(@n0 String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48356, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.dynamic_so.a.a(str);
    }

    @Override // pb.d
    public boolean b(@n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48355, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : DynamicSoManager.k(str);
    }
}
