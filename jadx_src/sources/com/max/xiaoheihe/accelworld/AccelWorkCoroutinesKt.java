package com.max.xiaoheihe.accelworld;

import androidx.fragment.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorkCoroutines.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AccelWorkCoroutinesKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d Fragment fragment, @dl.d yh.a<b2> block) {
        if (PatchProxy.proxy(new Object[]{fragment, block}, null, changeQuickRedirect, true, bb.c.m.tv, new Class[]{Fragment.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fragment, "<this>");
        f0.p(block, "block");
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(fragment), null, null, new AccelWorkCoroutinesKt$fastRunOnMainThread$1(block, null), 3, null);
    }

    public static final void b(@dl.d yh.a<b2> block, @dl.d Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{block, fragment}, null, changeQuickRedirect, true, bb.c.m.uv, new Class[]{yh.a.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(block, "block");
        f0.p(fragment, "fragment");
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(fragment), null, null, new AccelWorkCoroutinesKt$fastRunOnMainThread$2(block, null), 3, null);
    }
}
