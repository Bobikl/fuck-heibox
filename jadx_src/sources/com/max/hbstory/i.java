package com.max.hbstory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StoryViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class i {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final boolean a(@dl.d g gVar, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Bd, new Class[]{g.class, Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(gVar, "<this>");
        Integer numF = gVar.n().f();
        return numF != null && numF.intValue() == i10;
    }
}
