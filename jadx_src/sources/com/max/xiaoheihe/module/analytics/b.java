package com.max.xiaoheihe.module.analytics;

import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.l;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;
import dl.e;
import java.util.ArrayList;
import pb.h;

/* JADX INFO: compiled from: IPageEventReportServiceImpl.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
@RouterService(interfaces = {h.class}, key = {ob.b.f132261m})
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f79505a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.h
    @e
    public String a() {
        ArrayList<PathSrcNode> arrayList;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25619, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        ArrayList<ArrayList<PathSrcNode>> arrayListG = l.f66572a.g();
        return k.p((arrayListG == null || (arrayList = arrayListG.get(0)) == null) ? null : arrayList.get(0));
    }

    @Override // pb.h
    public void b(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25620, new Class[]{String.class, String.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.d.e(str, str2, str3, str4, (JsonObject) k.a(str5, JsonObject.class), null, z10);
    }
}
