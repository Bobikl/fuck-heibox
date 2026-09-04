package com.max.hbmmkv;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: MMKVManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@d String mmkvId, @d l<? super b, b2> block) {
        if (PatchProxy.proxy(new Object[]{mmkvId, block}, null, changeQuickRedirect, true, bb.c.i.f33310e2, new Class[]{String.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mmkvId, "mmkvId");
        f0.p(block, "block");
        block.invoke(new b(mmkvId));
    }

    public static /* synthetic */ void b(String str, l lVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{str, lVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.i.f33316f2, new Class[]{String.class, l.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            str = "default";
        }
        a(str, lVar);
    }
}
