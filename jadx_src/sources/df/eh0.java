package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewR6MapsCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class eh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final qu f110207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110208d;

    private eh0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 qu quVar, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f110205a = cardView;
        this.f110206b = linearLayout;
        this.f110207c = quVar;
        this.f110208d = linearLayout2;
    }

    @androidx.annotation.n0
    public static eh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21842, new Class[]{View.class}, eh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (eh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_all_maps;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_all_maps);
        if (linearLayout != null) {
            i10 = R.id.vg_card_title;
            View viewA = l3.d.a(view, R.id.vg_card_title);
            if (viewA != null) {
                qu quVarA = qu.a(viewA);
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_maps_list);
                if (linearLayout2 != null) {
                    return new eh0((CardView) view, linearLayout, quVarA, linearLayout2);
                }
                i10 = R.id.vg_maps_list;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static eh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21840, new Class[]{LayoutInflater.class}, eh0.class);
        return patchProxyResultProxy.isSupported ? (eh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static eh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21841, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, eh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (eh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_r6_maps_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110205a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21843, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
