package com.max.xiaoheihe.router.serviceimpl;

import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;

/* JADX INFO: compiled from: DeviceInfoServiceImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {pb.c.class}, key = {"device"})
public class c implements pb.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.c
    @p0
    public String a() {
        return com.max.xiaoheihe.utils.h.f95395c;
    }

    @Override // pb.c
    @p0
    public String getDeviceId() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48354, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.xiaoheihe.utils.d.U();
    }
}
