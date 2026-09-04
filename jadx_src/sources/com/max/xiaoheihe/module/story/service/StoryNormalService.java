package com.max.xiaoheihe.module.story.service;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import com.max.hbcommon.network.ApiException;
import com.max.hbstory.bean.StoryPageItemInfoObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.ComboObj;
import com.max.xiaoheihe.bean.story.StoryModeListObj;
import com.max.xiaoheihe.module.bbs.utils.BBSKtUtils;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.util.HashMap;
import java.util.Map;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: StoryNormalService.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StoryNormalService implements com.max.hbstory.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f92043d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private y f92045b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final io.reactivex.disposables.a f92044a = new io.reactivex.disposables.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final v f92046c = new v() { // from class: com.max.xiaoheihe.module.story.service.StoryNormalService$observer$1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: StoryNormalService.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f92061a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f92061a = iArr;
            }
        }

        @Override // androidx.lifecycle.v
        public final void d(@d y yVar, @d Lifecycle.Event event) {
            if (PatchProxy.proxy(new Object[]{yVar, event}, this, changeQuickRedirect, false, 43717, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(yVar, "<anonymous parameter 0>");
            f0.p(event, "event");
            if (a.f92061a[event.ordinal()] == 1) {
                this.f92060b.a().f();
                StoryNormalService.k(this.f92060b);
            }
        }
    };

    /* JADX INFO: compiled from: StoryNormalService.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<ComboObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Throwable, b2> f92047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92048c;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super Throwable, b2> lVar, yh.a<b2> aVar) {
            this.f92047b = lVar;
            this.f92048c = aVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43701, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            this.f92047b.invoke(e10);
            super.onError(e10);
        }

        public void onNext(@dl.d Result<ComboObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43702, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            this.f92048c.invoke();
            if (!com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c.f(result.getMsg());
            }
            ComboObj result2 = result.getResult();
            if (result2 == null || !com.max.hbcommon.utils.c.x(result2.is_max_charge())) {
                return;
            }
            com.max.hbutils.utils.c.f(result2.getMsg());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43703, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ComboObj>) obj);
        }
    }

    /* JADX INFO: compiled from: StoryNormalService.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f92049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Throwable, b2> f92050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92051d;

        /* JADX WARN: Multi-variable type inference failed */
        b(String str, l<? super Throwable, b2> lVar, yh.a<b2> aVar) {
            this.f92049b = str;
            this.f92050c = lVar;
            this.f92051d = aVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43704, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (f0.g("1", this.f92049b)) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.collect_success));
            } else {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.cancel_collect_success));
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43705, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            this.f92050c.invoke(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43706, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            this.f92051d.invoke();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43707, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: StoryNormalService.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Throwable, b2> f92052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92053c;

        /* JADX WARN: Multi-variable type inference failed */
        c(l<? super Throwable, b2> lVar, yh.a<b2> aVar) {
            this.f92052b = lVar;
            this.f92053c = aVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43708, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (!(e10 instanceof ApiException) || com.max.hbcommon.utils.c.u(e10.getMessage())) {
                super.onError(e10);
            } else {
                com.max.xiaoheihe.module.bbs.utils.b.X(e10.getMessage());
            }
            this.f92052b.invoke(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43709, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
            } else {
                com.max.hbutils.utils.c.f(result.getMsg());
            }
            this.f92053c.invoke();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43710, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: StoryNormalService.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<StoryModeListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Throwable, b2> f92054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<StoryPageItemInfoObj, b2> f92055c;

        /* JADX WARN: Multi-variable type inference failed */
        d(l<? super Throwable, b2> lVar, l<? super StoryPageItemInfoObj, b2> lVar2) {
            this.f92054b = lVar;
            this.f92055c = lVar2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43711, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            this.f92054b.invoke(e10);
        }

        public void onNext(@dl.d Result<StoryModeListObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 43712, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            l<StoryPageItemInfoObj, b2> lVar = this.f92055c;
            Object objA = k.a(k.p(t10.getResult()), StoryPageItemInfoObj.class);
            f0.o(objA, "deserialize(JsonUtils.se…eItemInfoObj::class.java)");
            lVar.invoke((StoryPageItemInfoObj) objA);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43713, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StoryModeListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: StoryNormalService.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Throwable, b2> f92056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92057c;

        /* JADX WARN: Multi-variable type inference failed */
        e(l<? super Throwable, b2> lVar, yh.a<b2> aVar) {
            this.f92056b = lVar;
            this.f92057c = aVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43714, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            this.f92056b.invoke(e10);
            super.onError(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43715, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            this.f92057c.invoke();
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                return;
            }
            com.max.hbutils.utils.c.f(result.getMsg());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43716, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: StoryNormalService.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Throwable, b2> f92058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f92059c;

        /* JADX WARN: Multi-variable type inference failed */
        f(l<? super Throwable, b2> lVar, yh.a<b2> aVar) {
            this.f92058b = lVar;
            this.f92059c = aVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43720, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            this.f92058b.invoke(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43721, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
            } else {
                com.max.hbutils.utils.c.f(result.getMsg());
            }
            this.f92059c.invoke();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43722, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    public static final /* synthetic */ void k(StoryNormalService storyNormalService) {
        if (PatchProxy.proxy(new Object[]{storyNormalService}, null, changeQuickRedirect, true, 43700, new Class[]{StoryNormalService.class}, Void.TYPE).isSupported) {
            return;
        }
        storyNormalService.m();
    }

    private final void l(String str, String str2, String str3, String str4, yh.a<b2> aVar, l<? super Throwable, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, aVar, lVar}, this, changeQuickRedirect, false, 43697, new Class[]{String.class, String.class, String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        a().c((b) i.a().J(str, str2, null, str4, str3, s0.z()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str4, lVar, aVar)));
    }

    private final void m() {
        y yVar;
        Lifecycle lifecycle;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43690, new Class[0], Void.TYPE).isSupported || (yVar = this.f92045b) == null || (lifecycle = yVar.getLifecycle()) == null) {
            return;
        }
        lifecycle.d(this.f92046c);
    }

    @Override // com.max.hbstory.c
    @dl.d
    public io.reactivex.disposables.a a() {
        return this.f92044a;
    }

    @Override // com.max.hbstory.c
    public void b(@dl.d Context context, @dl.e String str, @dl.e String str2, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, 43695, new Class[]{Context.class, String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(onSuccessFoo, "onSuccessFoo");
        f0.p(onErrorFoo, "onErrorFoo");
        if (i0.e(context)) {
            l(str, str2, null, "2", onSuccessFoo, onErrorFoo);
        } else {
            onErrorFoo.invoke(new Throwable("没有登陆"));
        }
    }

    @Override // com.max.hbstory.c
    public void c(@dl.e String str, @dl.e String str2, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
        if (PatchProxy.proxy(new Object[]{str, str2, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, 43698, new Class[]{String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onSuccessFoo, "onSuccessFoo");
        f0.p(onErrorFoo, "onErrorFoo");
        a().c((a) i.a().M8(str, str2).a4(io.reactivex.android.schedulers.a.c()).I5(io.reactivex.schedulers.b.d()).J5(new a(onErrorFoo, onSuccessFoo)));
    }

    @Override // com.max.hbstory.c
    public void d(@dl.e String str, @dl.e String str2, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
        if (PatchProxy.proxy(new Object[]{str, str2, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, 43692, new Class[]{String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onSuccessFoo, "onSuccessFoo");
        f0.p(onErrorFoo, "onErrorFoo");
        a().c((f) i.a().m5(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(onErrorFoo, onSuccessFoo)));
    }

    @Override // com.max.hbstory.c
    public void e(@dl.d Context context, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, 43694, new Class[]{Context.class, String.class, String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(onSuccessFoo, "onSuccessFoo");
        f0.p(onErrorFoo, "onErrorFoo");
        if (i0.e(context)) {
            l(str, str2, str3, "1", onSuccessFoo, onErrorFoo);
        } else {
            onErrorFoo.invoke(new Throwable("没有登陆"));
        }
    }

    @Override // com.max.hbstory.c
    public void f(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e Map<String, String> map, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, map, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, 43693, new Class[]{String.class, String.class, String.class, Map.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onSuccessFoo, "onSuccessFoo");
        f0.p(onErrorFoo, "onErrorFoo");
        a().c((e) i.a().z2(str2, str, str3, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(onErrorFoo, onSuccessFoo)));
    }

    @Override // com.max.hbstory.c
    public void g(@dl.e String str, @dl.e String str2, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
        if (PatchProxy.proxy(new Object[]{str, str2, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, 43691, new Class[]{String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onSuccessFoo, "onSuccessFoo");
        f0.p(onErrorFoo, "onErrorFoo");
        a().c((c) i.a().V6(str, null, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(onErrorFoo, onSuccessFoo)));
    }

    @Override // com.max.hbstory.c
    public void h(@dl.e com.max.hbstory.e eVar, @dl.d l<? super StoryPageItemInfoObj, b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
        Map<String, String> map;
        if (PatchProxy.proxy(new Object[]{eVar, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, 43699, new Class[]{com.max.hbstory.e.class, l.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onSuccessFoo, "onSuccessFoo");
        f0.p(onErrorFoo, "onErrorFoo");
        com.max.xiaoheihe.network.e eVarA = i.a();
        String strA = eVar != null ? eVar.a() : null;
        if (eVar == null || (map = eVar.b()) == null) {
            map = new HashMap<>();
        }
        a().c((d) eVarA.B6(strA, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(onErrorFoo, onSuccessFoo)));
    }

    @Override // com.max.hbstory.c
    public void i(@dl.d y lifecycleOwner) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner}, this, changeQuickRedirect, false, 43689, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lifecycleOwner, "lifecycleOwner");
        this.f92045b = lifecycleOwner;
    }

    @Override // com.max.hbstory.c
    public void j(@dl.d Context context, @dl.e String str, @dl.e String str2, @dl.d final yh.a<b2> onSuccessFoo, @dl.d final l<? super Throwable, b2> onErrorFoo) {
        y yVar;
        if (PatchProxy.proxy(new Object[]{context, str, str2, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, 43696, new Class[]{Context.class, String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(onSuccessFoo, "onSuccessFoo");
        f0.p(onErrorFoo, "onErrorFoo");
        HashMap map = new HashMap(16);
        if (str != null) {
            map.put("h_src", str);
        }
        if (str2 == null || (yVar = this.f92045b) == null) {
            return;
        }
        BBSKtUtils.f83254a.h(context, str2, map, yVar, new l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.story.service.StoryNormalService$showCollectionFoldersVertical$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(boolean z10) {
                if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43718, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (z10) {
                    onSuccessFoo.invoke();
                } else {
                    onErrorFoo.invoke(new Throwable());
                }
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 43719, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool.booleanValue());
                return b2.f124493a;
            }
        });
    }
}
