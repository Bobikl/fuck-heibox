package com.max.hbcommon.base;

import androidx.lifecycle.j0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Event.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class m<T> implements j0<l<? extends T>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.l<T, b2> f66921a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@dl.d yh.l<? super T, b2> onEventUnhandledContent) {
        f0.p(onEventUnhandledContent, "onEventUnhandledContent");
        this.f66921a = onEventUnhandledContent;
    }

    @Override // androidx.lifecycle.j0
    public /* bridge */ /* synthetic */ void a(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.yw, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        b((l) obj);
    }

    public void b(@dl.e l<? extends T> lVar) {
        T tA;
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, bb.c.b.xw, new Class[]{l.class}, Void.TYPE).isSupported || lVar == null || (tA = lVar.a()) == null) {
            return;
        }
        this.f66921a.invoke(tA);
    }
}
