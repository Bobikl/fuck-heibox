package com.max.xiaoheihe.module.analytics;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.accelworld.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;
import dl.e;
import kotlin.jvm.internal.f0;
import pb.m;

/* JADX INFO: compiled from: IToastServiceImpl.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
@RouterService(interfaces = {m.class}, key = {ob.b.f132262n})
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f79506a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.m
    public void a(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25621, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c.f(str);
    }

    @Override // pb.m
    public void b(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25622, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c.d(str);
    }

    @Override // pb.m
    public int c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25623, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (!(com.max.hbutils.utils.e.b().a() instanceof MainActivity)) {
            return -1;
        }
        BaseApplication baseApplicationA = BaseApplication.a();
        f0.o(baseApplicationA, "getInstance()");
        return l.c(76.0f, baseApplicationA);
    }
}
