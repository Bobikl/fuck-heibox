package com.max.hbcommon.base;

import androidx.lifecycle.i0;
import androidx.lifecycle.w0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b0;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.f0;
import kotlin.z;

/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
public class BaseViewModel extends w0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final i0<TYPE_STATE> f66627b = new i0<>(TYPE_STATE.UNLOADED);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f66628c = b0.c(new yh.a<io.reactivex.disposables.a>() { // from class: com.max.hbcommon.base.BaseViewModel$mCompositeDisposable$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final io.reactivex.disposables.a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.lw, new Class[0], io.reactivex.disposables.a.class);
            return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : new io.reactivex.disposables.a();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.disposables.a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ io.reactivex.disposables.a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.mw, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: BaseViewModel.kt */
    public enum TYPE_STATE {
        UNLOADED,
        LOADING,
        ERROR,
        EMPTY,
        NORMAL;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public static kotlin.enums.a<TYPE_STATE> getEntries() {
            return $ENTRIES;
        }

        public static TYPE_STATE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.kw, new Class[]{String.class}, TYPE_STATE.class);
            return (TYPE_STATE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(TYPE_STATE.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static TYPE_STATE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.jw, new Class[0], TYPE_STATE[].class);
            return (TYPE_STATE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    public final void c(@dl.e io.reactivex.disposables.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.hw, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.disposables.a aVarE = e();
        f0.m(bVar);
        aVarE.c(bVar);
    }

    @dl.d
    public final io.reactivex.disposables.a e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.gw, new Class[0], io.reactivex.disposables.a.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : (io.reactivex.disposables.a) this.f66628c.getValue();
    }

    @dl.d
    public final i0<TYPE_STATE> f() {
        return this.f66627b;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.iw, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e().f();
    }
}
