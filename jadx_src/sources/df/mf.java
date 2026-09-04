package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptChannelEntryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayoutCompat f113430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.p f113432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113437h;

    private mf(@androidx.annotation.n0 LinearLayoutCompat linearLayoutCompat, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 mb.p pVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f113430a = linearLayoutCompat;
        this.f113431b = cardView;
        this.f113432c = pVar;
        this.f113433d = imageView;
        this.f113434e = imageView2;
        this.f113435f = relativeLayout;
        this.f113436g = textView;
        this.f113437h = linearLayout;
    }

    @androidx.annotation.n0
    public static mf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17952, new Class[]{View.class}, mf.class);
        if (patchProxyResultProxy.isSupported) {
            return (mf) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_root;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_root);
        if (cardView != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                mb.p pVarA = mb.p.a(viewA);
                i10 = R.id.iv_bg;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
                if (imageView != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView2 != null) {
                        i10 = R.id.rl_bg;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_bg);
                        if (relativeLayout != null) {
                            i10 = R.id.tv_title;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView != null) {
                                i10 = R.id.vg_menu;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_menu);
                                if (linearLayout != null) {
                                    return new mf((LinearLayoutCompat) view, cardView, pVarA, imageView, imageView2, relativeLayout, textView, linearLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static mf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17950, new Class[]{LayoutInflater.class}, mf.class);
        return patchProxyResultProxy.isSupported ? (mf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17951, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mf.class);
        if (patchProxyResultProxy.isSupported) {
            return (mf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_channel_entry, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayoutCompat b() {
        return this.f113430a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17953, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
