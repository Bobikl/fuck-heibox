package com.max.commentimagepainter.sharecard;

import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.h;
import com.max.commentimagepainter.R;
import com.max.commentimagepainter.sharecard.bean.AccountInfoObj;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.ColorInfoObj;
import com.max.commentimagepainter.sharecard.bean.DescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.k;

/* JADX INFO: compiled from: CardAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CardAdapter extends RecyclerView.Adapter<d> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f65250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f65251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Resources f65252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final List<CardObj> f65253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final y f65254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f65255g;

    public CardAdapter(int i10, int i11, @dl.d Resources resources, @dl.d List<CardObj> list, @dl.d y lifecycleOwner) {
        f0.p(resources, "resources");
        f0.p(list, "list");
        f0.p(lifecycleOwner, "lifecycleOwner");
        this.f65250b = i10;
        this.f65251c = i11;
        this.f65252d = resources;
        this.f65253e = list;
        this.f65254f = lifecycleOwner;
    }

    public static final /* synthetic */ void m(CardAdapter cardAdapter, ImageView imageView, float f10, float f11) {
        Object[] objArr = {cardAdapter, imageView, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1047, new Class[]{CardAdapter.class, ImageView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        cardAdapter.u(imageView, f10, f11);
    }

    private final void n(String str, d dVar) {
        if (PatchProxy.proxy(new Object[]{str, dVar}, this, changeQuickRedirect, false, bb.c.b.f30522ah, new Class[]{String.class, d.class}, Void.TYPE).isSupported) {
            return;
        }
        k.f(z.a(this.f65254f), null, null, new CardAdapter$bind$1$1(dVar, str, this, null), 3, null);
    }

    private final void u(ImageView imageView, float f10, float f11) {
        Object[] objArr = {imageView, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 1044, new Class[]{ImageView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        float f12 = -f10;
        colorMatrix.set(new float[]{f11, 0.0f, 0.0f, 0.0f, f12, 0.0f, f11, 0.0f, 0.0f, f12, 0.0f, 0.0f, f11, 0.0f, f12, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1043, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f65253e.size();
    }

    public final int o() {
        return this.f65251c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 1046, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        s((d) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 1045, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : t(viewGroup, i10);
    }

    @dl.d
    public final Resources p() {
        return this.f65252d;
    }

    public final int q() {
        return this.f65250b;
    }

    public final boolean r() {
        return this.f65255g;
    }

    public void s(@dl.d d holder, int i10) {
        String top;
        String bottom;
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, 1042, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        if (i10 >= this.f65253e.size()) {
            return;
        }
        CardObj cardObj = this.f65253e.get(i10);
        ImageView imageViewH = holder.h();
        Resources resources = this.f65252d;
        ColorInfoObj color_v2 = cardObj.getColor_v2();
        String str = "#693FD5";
        if (color_v2 == null || (top = color_v2.getTop()) == null) {
            top = "#693FD5";
        }
        int iD = com.max.hbutils.utils.a.d(top);
        ColorInfoObj color_v3 = cardObj.getColor_v2();
        if (color_v3 != null && (bottom = color_v3.getBottom()) != null) {
            str = bottom;
        }
        imageViewH.setBackground(new BitmapDrawable(resources, ShareCardDrawUtilsKt.k(iD, com.max.hbutils.utils.a.d(str), this.f65250b, this.f65251c, this.f65252d)));
        holder.m().setText(cardObj.getName());
        TextView textViewJ = holder.j();
        String card_id = cardObj.getCard_id();
        if (card_id == null) {
            card_id = "";
        }
        textViewJ.setText(card_id);
        List<DescObj> descs = cardObj.getDescs();
        if (descs != null) {
            if (!descs.isEmpty()) {
                holder.k().setText(descs.get(0).getDesc());
                holder.n().setText(descs.get(0).getValue());
            }
            if (descs.size() > 1) {
                holder.l().setText(descs.get(1).getDesc());
                holder.o().setText(descs.get(1).getValue());
            }
        }
        AccountInfoObj account_info = cardObj.getAccount_info();
        if (account_info != null) {
            TextView textViewQ = holder.q();
            String username = account_info.getUsername();
            textViewQ.setText(username != null ? username : "");
            Glide.G(holder.p()).m().i(h.j1()).B0(ShareCardDrawUtilsKt.e(16, this.f65252d), ShareCardDrawUtilsKt.e(16, this.f65252d)).load(account_info.getAvatar()).C1(holder.p());
            String img = cardObj.getImg();
            if (img != null) {
                n(img, holder);
                k.f(z.a(this.f65254f), null, null, new CardAdapter$onBindViewHolder$1$1$2$1$1(holder, img, cardObj, this, null), 3, null);
            }
        }
    }

    @dl.d
    public d t(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 1041, new Class[]{ViewGroup.class, Integer.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout, parent, false);
        f0.m(viewInflate);
        return new d(viewInflate);
    }

    public final void v(boolean z10) {
        this.f65255g = z10;
    }
}
