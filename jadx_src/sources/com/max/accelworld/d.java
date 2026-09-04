package com.max.accelworld;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldLayoutParams.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(int i10, int i11, @dl.d View view) {
        Object[] objArr = {new Integer(i10), new Integer(i11), view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.Af, new Class[]{cls, cls, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (layoutParams.width == i10 && layoutParams.height == i11) {
            return;
        }
        layoutParams.width = i10;
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }

    public static final void b(@dl.d View view, int i10, int i11) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.Bf, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (layoutParams.width == i10 && layoutParams.height == i11) {
            return;
        }
        layoutParams.width = i10;
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }
}
