package com.max.xiaoheihe.router.serviceimpl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;

/* JADX INFO: compiled from: MiniProgramServiceImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {pb.g.class}, key = {ob.b.f132259k})
public class h implements pb.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.g
    public boolean a(@n0 Context context, @n0 String str, @p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, bundle}, this, changeQuickRedirect, false, 48377, new Class[]{Context.class, String.class, Bundle.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : com.max.xiaoheihe.module.littleprogram.b.p(context, str, bundle);
    }
}
