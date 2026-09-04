package com.max.commentimagepainter.sharecard;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CardStackLayoutManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CardStackLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackLayoutManager(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackLayoutManager(@dl.d Context context, int i10, boolean z10) {
        super(context, i10, z10);
        f0.p(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    @dl.d
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Hh, new Class[0], RecyclerView.LayoutParams.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.LayoutParams) patchProxyResultProxy.result : new RecyclerView.LayoutParams(-2, -2);
    }
}
