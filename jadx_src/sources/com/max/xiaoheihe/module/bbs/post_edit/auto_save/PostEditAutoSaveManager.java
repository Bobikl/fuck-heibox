package com.max.xiaoheihe.module.bbs.post_edit.auto_save;

import android.util.Log;
import androidx.annotation.k1;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveDataWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.l;

/* JADX INFO: compiled from: PostEditAutoSaveManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class PostEditAutoSaveManager<T extends PostEditAutoSaveData> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final Companion f82868h = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f82869i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f82870j = "PostEditAutoSaveManager-dbg";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f82871k = 5000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final String f82872l = "auto_save";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private static Map<String, String> f82873m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final q0 f82874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.a<Boolean> f82875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f82876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private volatile c<T> f82877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private T f82878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.e<Long> f82879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private d2 f82880g;

    /* JADX INFO: compiled from: PostEditAutoSaveManager.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30892, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            try {
                Result.a aVar = Result.f124476c;
                com.max.hbmmkv.c.b(null, new l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$Companion$discardPostEditAutoSaveData$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public final void a(@dl.d com.max.hbmmkv.b withMMKV) {
                        if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, 30893, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(withMMKV, "$this$withMMKV");
                        withMMKV.m(PostEditAutoSaveManager.f82872l, "", true);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 30894, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        a(bVar);
                        return b2.f124493a;
                    }
                }, 1, null);
                PostEditAutoSaveManager.f82873m = null;
                Result.b(b2.f124493a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                Result.b(t0.a(th2));
            }
        }

        @dl.e
        public final String b(@dl.e String str) {
            Map map;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30889, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            if (str == null || (map = PostEditAutoSaveManager.f82873m) == null) {
                return null;
            }
            return (String) map.get(str);
        }

        public final /* synthetic */ <T extends PostEditAutoSaveData> void c(LifecycleCoroutineScope lifecycleCoroutineScope, b<T> onLoadFinishListener) {
            if (PatchProxy.proxy(new Object[]{lifecycleCoroutineScope, onLoadFinishListener}, this, changeQuickRedirect, false, 30890, new Class[]{LifecycleCoroutineScope.class, b.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(lifecycleCoroutineScope, "lifecycleCoroutineScope");
            f0.p(onLoadFinishListener, "onLoadFinishListener");
            CoroutineDispatcher coroutineDispatcherC = e1.c();
            f0.w();
            k.f(lifecycleCoroutineScope, coroutineDispatcherC, null, new PostEditAutoSaveManager$Companion$loadPostEditAutoSaveData$1(onLoadFinishListener, null), 2, null);
        }

        public final void d(@dl.e String str, @dl.e String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 30888, new Class[]{String.class, String.class}, Void.TYPE).isSupported || str == null || str2 == null) {
                return;
            }
            if (PostEditAutoSaveManager.f82873m == null) {
                PostEditAutoSaveManager.f82873m = new HashMap();
            }
            Map map = PostEditAutoSaveManager.f82873m;
            if (map != null) {
            }
        }

        @k1
        public final <T extends PostEditAutoSaveData> void e(@dl.d PostEditAutoSaveDataWrapper<T> postEditAutoSaveDataWrapper) {
            Object objB;
            if (PatchProxy.proxy(new Object[]{postEditAutoSaveDataWrapper}, this, changeQuickRedirect, false, 30891, new Class[]{PostEditAutoSaveDataWrapper.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(postEditAutoSaveDataWrapper, "postEditAutoSaveDataWrapper");
            try {
                Result.a aVar = Result.f124476c;
                final String strP = com.max.hbutils.utils.k.p(postEditAutoSaveDataWrapper);
                com.max.hbmmkv.c.b(null, new l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$Companion$savePostEditAutoSaveData$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d com.max.hbmmkv.b withMMKV) {
                        if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, 30905, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(withMMKV, "$this$withMMKV");
                        withMMKV.m(PostEditAutoSaveManager.f82872l, strP, true);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 30906, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        a(bVar);
                        return b2.f124493a;
                    }
                }, 1, null);
                objB = Result.b(b2.f124493a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(t0.a(th2));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                Log.e(PostEditAutoSaveManager.f82870j, "[savePostEditAutoSaveData] error: " + thE);
            }
        }
    }

    /* JADX INFO: compiled from: PostEditAutoSaveManager.kt */
    @o(parameters = 0)
    public static final class DiscardDataCancelSignal extends CancellationException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f82893b = 0;
    }

    public PostEditAutoSaveManager(@dl.d q0 coroutineScope, @dl.d yh.a<Boolean> onCheckHasResumed, long j10) {
        f0.p(coroutineScope, "coroutineScope");
        f0.p(onCheckHasResumed, "onCheckHasResumed");
        this.f82874a = coroutineScope;
        this.f82875b = onCheckHasResumed;
        this.f82876c = j10;
        this.f82879f = g.I0(new PostEditAutoSaveManager$tickerEventFlow$1(this, null));
    }

    public /* synthetic */ PostEditAutoSaveManager(q0 q0Var, yh.a aVar, long j10, int i10, u uVar) {
        this(q0Var, aVar, (i10 & 4) != 0 ? 5000L : j10);
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30885, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82880g = g.U0(g.u(g.N0(g.d1(g.e1(this.f82879f, new PostEditAutoSaveManager$collectPostEditSaveData$1(this, null)), new PostEditAutoSaveManager$collectPostEditSaveData$2(null)), e1.c()), new PostEditAutoSaveManager$collectPostEditSaveData$3(null)), this.f82874a);
    }

    public final void i() {
        d2 d2Var;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30887, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d2 d2Var2 = this.f82880g;
        if (d2Var2 != null && d2Var2.isActive()) {
            z10 = true;
        }
        if (!z10 || (d2Var = this.f82880g) == null) {
            return;
        }
        d2Var.e(new DiscardDataCancelSignal());
    }

    public final void j(@dl.d c<T> provider) {
        if (PatchProxy.proxy(new Object[]{provider}, this, changeQuickRedirect, false, 30886, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(provider, "provider");
        Log.d(f82870j, "[setPostEditSaveDataProvider] provider: " + provider);
        this.f82877d = provider;
        i();
        h();
    }
}
