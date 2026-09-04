package com.max.hbcustomview.recyclerview;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class TopSmoothLinearManager extends LinearLayoutManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    public TopSmoothLinearManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        if (PatchProxy.proxy(new Object[]{recyclerView, state, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ll, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        b bVar = new b(recyclerView.getContext());
        bVar.setTargetPosition(i10);
        startSmoothScroll(bVar);
    }
}
