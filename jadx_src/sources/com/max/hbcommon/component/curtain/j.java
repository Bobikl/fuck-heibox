package com.max.hbcommon.component.curtain;

import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGetter.java */
/* JADX INFO: loaded from: classes9.dex */
public class j {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.j
    @p0
    public static View a(AdapterView adapterView, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{adapterView, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.d.xp, new Class[]{AdapterView.class, Integer.TYPE}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : adapterView.getChildAt(i10 - adapterView.getFirstVisiblePosition());
    }

    @androidx.annotation.j
    @p0
    public static View b(RecyclerView recyclerView, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.d.yp, new Class[]{RecyclerView.class, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (recyclerView.getLayoutManager() == null) {
            return null;
        }
        return recyclerView.getLayoutManager().getChildAt(i10);
    }
}
