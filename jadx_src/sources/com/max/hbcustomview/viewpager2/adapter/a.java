package com.max.hbcustomview.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.core.view.j1;
import androidx.recyclerview.widget.RecyclerView;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HBFragmentViewHolder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;

    private a(@n0 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @n0
    static a a(@n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup}, null, changeQuickRedirect, true, c.f.Vw, new Class[]{ViewGroup.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(j1.D());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    @n0
    FrameLayout b() {
        return (FrameLayout) this.itemView;
    }
}
