package com.max.xiaoheihe.utils.viewprioritymanager;

import androidx.compose.runtime.internal.o;
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.account.AppClientStaticObj;
import com.max.xiaoheihe.bean.account.ImageConfigObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import io.reactivex.g0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: ClientStaticUtils.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f95780a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95781b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ClientStaticUtils.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<AppClientStaticObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<AppClientStaticObj, b2> f95782b;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super AppClientStaticObj, b2> lVar) {
            this.f95782b = lVar;
        }

        public void onNext(@dl.d Result<AppClientStaticObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 49363, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            AppClientStaticObj result2 = result.getResult();
            if (result2 == null) {
                g.f74531b.v("[MainActivity#tryGetAppClientStaticData] appClientStaticObj is null");
                return;
            }
            l<AppClientStaticObj, b2> lVar = this.f95782b;
            if (lVar != null) {
                lVar.invoke(result2);
            }
            b.a(b.f95780a, result2.getImage_config());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49364, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AppClientStaticObj>) obj);
        }
    }

    private b() {
    }

    public static final /* synthetic */ void a(b bVar, ImageConfigObj imageConfigObj) {
        if (PatchProxy.proxy(new Object[]{bVar, imageConfigObj}, null, changeQuickRedirect, true, 49362, new Class[]{b.class, ImageConfigObj.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.d(imageConfigObj);
    }

    public static /* synthetic */ io.reactivex.disposables.b c(b bVar, l lVar, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, lVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 49360, new Class[]{b.class, l.class, Integer.TYPE, Object.class}, io.reactivex.disposables.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.b) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return bVar.b(lVar);
    }

    private final void d(ImageConfigObj imageConfigObj) {
        if (PatchProxy.proxy(new Object[]{imageConfigObj}, this, changeQuickRedirect, false, 49361, new Class[]{ImageConfigObj.class}, Void.TYPE).isSupported) {
            return;
        }
        MMKVManager mMKVManager = MMKVManager.f71329a;
        mMKVManager.n(ad.c.f1235o, ad.c.f1236p, System.currentTimeMillis(), false);
        if (imageConfigObj == null) {
            g.f74531b.v("[MainActivity#onGetImageConfig] invalid param, imageConfigMap is null");
        } else {
            mMKVManager.o(ad.c.f1235o, ad.c.f1237q, k.p(imageConfigObj), false);
        }
    }

    @dl.d
    public final io.reactivex.disposables.b b(@e l<? super AppClientStaticObj, b2> lVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 49359, new Class[]{l.class}, io.reactivex.disposables.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.b) patchProxyResultProxy.result;
        }
        g0 g0VarJ5 = i.a().c6().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(lVar));
        f0.o(g0VarJ5, "onInterceptStaticObj: ((…         }\n            })");
        return (io.reactivex.disposables.b) g0VarJ5;
    }

    @e
    public final io.reactivex.disposables.b e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49358, new Class[0], io.reactivex.disposables.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.b) patchProxyResultProxy.result;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - MMKVManager.f71329a.g(ad.c.f1235o, ad.c.f1236p, 0L, false);
        if (Math.abs(jCurrentTimeMillis) >= 8.64E7d) {
            return c(this, null, 1, null);
        }
        g.f74531b.q("[tryGetAppClientStaticData] skip getAppClientStatic, elapsedTimeMs: " + jCurrentTimeMillis);
        return null;
    }
}
