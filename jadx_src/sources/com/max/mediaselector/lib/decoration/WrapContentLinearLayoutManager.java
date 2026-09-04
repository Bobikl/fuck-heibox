package com.max.mediaselector.lib.decoration;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes2.dex */
public class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    public WrapContentLinearLayoutManager(Context context) {
        super(context);
    }

    public WrapContentLinearLayoutManager(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    public WrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{recycler, state}, this, changeQuickRedirect, false, c.l.Vl, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e10) {
            e10.printStackTrace();
        }
    }
}
