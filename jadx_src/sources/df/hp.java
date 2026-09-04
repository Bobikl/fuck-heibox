package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemInventorySpuItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f111496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f111497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f111508m;

    private hp(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f111496a = frameLayout;
        this.f111497b = constraintLayout;
        this.f111498c = imageView;
        this.f111499d = imageView2;
        this.f111500e = imageView3;
        this.f111501f = imageView4;
        this.f111502g = textView;
        this.f111503h = textView2;
        this.f111504i = textView3;
        this.f111505j = textView4;
        this.f111506k = textView5;
        this.f111507l = textView6;
        this.f111508m = frameLayout2;
    }

    @androidx.annotation.n0
    public static hp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18968, new Class[]{View.class}, hp.class);
        if (patchProxyResultProxy.isSupported) {
            return (hp) patchProxyResultProxy.result;
        }
        int i10 = R.id.cl_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_root);
        if (constraintLayout != null) {
            i10 = R.id.iv_item_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_item_bg);
            if (imageView != null) {
                i10 = R.id.iv_item_img;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_img);
                if (imageView2 != null) {
                    i10 = R.id.iv_rarity_tag;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_rarity_tag);
                    if (imageView3 != null) {
                        i10 = R.id.iv_special;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_special);
                        if (imageView4 != null) {
                            i10 = R.id.tv_count_desc;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_count_desc);
                            if (textView != null) {
                                i10 = R.id.tv_name;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView2 != null) {
                                    i10 = R.id.tv_price;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_price);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_price_min;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_price_min);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_price_symbol;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_spu_flag;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_spu_flag);
                                                if (textView6 != null) {
                                                    i10 = R.id.vg_checked;
                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_checked);
                                                    if (frameLayout != null) {
                                                        return new hp((FrameLayout) view, constraintLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, textView5, textView6, frameLayout);
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static hp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18966, new Class[]{LayoutInflater.class}, hp.class);
        return patchProxyResultProxy.isSupported ? (hp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18967, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hp.class);
        if (patchProxyResultProxy.isSupported) {
            return (hp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_inventory_spu_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f111496a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18969, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
