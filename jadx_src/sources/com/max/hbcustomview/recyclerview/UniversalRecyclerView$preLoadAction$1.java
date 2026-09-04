package com.max.hbcustomview.recyclerview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: UniversalRecyclerView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class UniversalRecyclerView$preLoadAction$1 extends Lambda implements yh.a<b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UniversalRecyclerView$preLoadAction$1 f69220b = new UniversalRecyclerView$preLoadAction$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    UniversalRecyclerView$preLoadAction$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
    @Override // yh.a
    public /* bridge */ /* synthetic */ b2 invoke() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Zl, new Class[0], Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        invoke2();
        return b2.f124493a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
    }
}
