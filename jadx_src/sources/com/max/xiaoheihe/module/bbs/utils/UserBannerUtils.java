package com.max.xiaoheihe.module.bbs.utils;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import xh.m;
import yh.l;

/* JADX INFO: compiled from: UserBannerUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class UserBannerUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final UserBannerUtils f83390a = new UserBannerUtils();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f83391b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83392c = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private UserBannerUtils() {
    }

    @m
    public static final boolean a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31333, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        com.max.hbmmkv.c.b(null, new l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.module.bbs.utils.UserBannerUtils$isForbiddenShowUserBannerToday$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d com.max.hbmmkv.b withMMKV) {
                if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, 31335, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(withMMKV, "$this$withMMKV");
                int iD = withMMKV.d(ad.e.f1254g, 0, true);
                if (!w.J(withMMKV.e(ad.e.f1255h, System.currentTimeMillis(), true), System.currentTimeMillis())) {
                    booleanRef.f124884b = false;
                } else {
                    booleanRef.f124884b = iD >= 2;
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 31336, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                a(bVar);
                return b2.f124493a;
            }
        }, 1, null);
        return booleanRef.f124884b;
    }

    @m
    public static final void b() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31334, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbmmkv.c.b(null, new l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.module.bbs.utils.UserBannerUtils$recordCloseUserBanner$1
            public static ChangeQuickRedirect changeQuickRedirect;

            public final void a(@dl.d com.max.hbmmkv.b withMMKV) {
                if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, 31337, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(withMMKV, "$this$withMMKV");
                int iD = withMMKV.d(ad.e.f1254g, 0, true);
                long jE = withMMKV.e(ad.e.f1255h, System.currentTimeMillis(), true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!w.J(jE, jCurrentTimeMillis)) {
                    withMMKV.l(ad.e.f1255h, jCurrentTimeMillis, true);
                    withMMKV.k(ad.e.f1254g, 1, true);
                } else if (iD == 0) {
                    withMMKV.l(ad.e.f1255h, jCurrentTimeMillis, true);
                    withMMKV.k(ad.e.f1254g, 1, true);
                } else {
                    if (iD != 1) {
                        return;
                    }
                    withMMKV.k(ad.e.f1254g, 2, true);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 31338, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bVar);
                return b2.f124493a;
            }
        }, 1, null);
    }
}
