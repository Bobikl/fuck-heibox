package com.max.xiaoheihe.app;

import android.content.Context;
import android.os.MessageQueue;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.xiaoheihe.module.bbs.post_edit.auto_save.LoadPostEditAutoSavedDataListener;
import com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;

/* JADX INFO: compiled from: OneShotMainActivityIdleHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nOneShotMainActivityIdleHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneShotMainActivityIdleHandler.kt\ncom/max/xiaoheihe/app/OneShotMainActivityIdleHandler\n+ 2 PostEditAutoSaveManager.kt\ncom/max/xiaoheihe/module/bbs/post_edit/auto_save/PostEditAutoSaveManager$Companion\n*L\n1#1,40:1\n149#2:41\n188#2:42\n*S KotlinDebug\n*F\n+ 1 OneShotMainActivityIdleHandler.kt\ncom/max/xiaoheihe/app/OneShotMainActivityIdleHandler\n*L\n29#1:41\n29#1:42\n*E\n"})
@o(parameters = 0)
public final class OneShotMainActivityIdleHandler implements MessageQueue.IdleHandler {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f76827f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f76828g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final String f76829h = "OneShotMainActivityIdleHandler-dbg";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final LifecycleCoroutineScope f76830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final FragmentManager f76831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Context f76832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.a<Boolean> f76833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final io.reactivex.disposables.a f76834e;

    /* JADX INFO: compiled from: OneShotMainActivityIdleHandler.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public OneShotMainActivityIdleHandler(@dl.d LifecycleCoroutineScope lifecycleScope, @dl.d FragmentManager fragmentManager, @dl.d Context context, @dl.d yh.a<Boolean> onCheckIsActive, @dl.d io.reactivex.disposables.a compositeDisposable) {
        f0.p(lifecycleScope, "lifecycleScope");
        f0.p(fragmentManager, "fragmentManager");
        f0.p(context, "context");
        f0.p(onCheckIsActive, "onCheckIsActive");
        f0.p(compositeDisposable, "compositeDisposable");
        this.f76830a = lifecycleScope;
        this.f76831b = fragmentManager;
        this.f76832c = context;
        this.f76833d = onCheckIsActive;
        this.f76834e = compositeDisposable;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.AG, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!ad.a.a(ad.a.f1218y, false)) {
            PostEditAutoSaveManager.Companion companion = PostEditAutoSaveManager.f82868h;
            k.f(this.f76830a, e1.c(), null, new OneShotMainActivityIdleHandler$queueIdle$$inlined$loadPostEditAutoSaveData$1(new LoadPostEditAutoSavedDataListener(this.f76832c, this.f76833d, this.f76834e), null), 2, null);
        }
        return false;
    }
}
