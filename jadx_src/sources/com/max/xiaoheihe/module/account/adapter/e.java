package com.max.xiaoheihe.module.account.adapter;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ExpandableRecyclerViewContainer.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final int a(@dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 24817, new Class[]{View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return view.getResources().getDisplayMetrics().heightPixels - (iArr[1] + view.getHeight());
    }

    public static final void b(@dl.d NestedScrollView nestedScrollView, @dl.d View childView, int i10) {
        if (PatchProxy.proxy(new Object[]{nestedScrollView, childView, new Integer(i10)}, null, changeQuickRedirect, true, 24816, new Class[]{NestedScrollView.class, View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(nestedScrollView, "<this>");
        f0.p(childView, "childView");
        int iA = (a(nestedScrollView) - a(childView)) + i10;
        if (iA > 0) {
            nestedScrollView.P(0, iA);
        }
    }
}
