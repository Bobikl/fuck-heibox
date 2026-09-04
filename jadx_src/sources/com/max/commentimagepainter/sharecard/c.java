package com.max.commentimagepainter.sharecard;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CardV2Adapter.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends RecyclerView.Adapter<a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Resources f65359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<CardObjV2> f65360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final y f65361d;

    /* JADX INFO: compiled from: CardV2Adapter.kt */
    public static final class a extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final GameOrderCassetteView f65362b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d View containerView, @dl.d GameOrderCassetteView cardV2View) {
            super(containerView);
            f0.p(containerView, "containerView");
            f0.p(cardV2View, "cardV2View");
            this.f65362b = cardV2View;
        }

        @dl.d
        public final GameOrderCassetteView a() {
            return this.f65362b;
        }
    }

    public c(@dl.d Resources resources, @dl.d List<CardObjV2> list, @dl.d y lifecycleOwner) {
        f0.p(resources, "resources");
        f0.p(list, "list");
        f0.p(lifecycleOwner, "lifecycleOwner");
        this.f65359b = resources;
        this.f65360c = list;
        this.f65361d = lifecycleOwner;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Kh, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f65360c.size();
    }

    @dl.d
    public final Resources m() {
        return this.f65359b;
    }

    public void n(@dl.d a holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Jh, new Class[]{a.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        CardObjV2 cardObjV2 = (CardObjV2) CollectionsKt___CollectionsKt.R2(this.f65360c, i10);
        if (cardObjV2 != null) {
            GameOrderCassetteView.h(holder.a(), cardObjV2, z.a(this.f65361d), false, null, 8, null);
        }
    }

    @dl.d
    public a o(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Ih, new Class[]{ViewGroup.class, Integer.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        Context context = parent.getContext();
        f0.o(context, "getContext(...)");
        GameOrderCassetteView gameOrderCassetteView = new GameOrderCassetteView(context, null, 0, 6, null);
        frameLayout.addView(gameOrderCassetteView, layoutParams);
        return new a(frameLayout, gameOrderCassetteView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Mh, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        n((a) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Lh, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : o(viewGroup, i10);
    }
}
