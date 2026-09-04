package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptRecGoodsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.p f110979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f110981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110982e;

    private gg(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 mb.p pVar, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 RecyclerView recyclerView) {
        this.f110978a = cardView;
        this.f110979b = pVar;
        this.f110980c = linearLayout;
        this.f110981d = listSectionHeader;
        this.f110982e = recyclerView;
    }

    @androidx.annotation.n0
    public static gg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18031, new Class[]{View.class}, gg.class);
        if (patchProxyResultProxy.isSupported) {
            return (gg) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.p pVarA = mb.p.a(viewA);
            i10 = R.id.ll_item_bg;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_item_bg);
            if (linearLayout != null) {
                i10 = R.id.lsh;
                ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.lsh);
                if (listSectionHeader != null) {
                    i10 = R.id.rv_rec_goods;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_rec_goods);
                    if (recyclerView != null) {
                        return new gg((CardView) view, pVarA, linearLayout, listSectionHeader, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static gg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18029, new Class[]{LayoutInflater.class}, gg.class);
        return patchProxyResultProxy.isSupported ? (gg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18030, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gg.class);
        if (patchProxyResultProxy.isSupported) {
            return (gg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_rec_goods, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110978a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18032, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
