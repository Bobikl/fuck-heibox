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

/* JADX INFO: compiled from: ItemInventoryItemFormat3Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f110633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f110634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ub0 f110643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f110647o;

    private fp(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 ub0 ub0Var, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 View view, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 ConstraintLayout constraintLayout2) {
        this.f110633a = frameLayout;
        this.f110634b = constraintLayout;
        this.f110635c = imageView;
        this.f110636d = imageView2;
        this.f110637e = imageView3;
        this.f110638f = imageView4;
        this.f110639g = imageView5;
        this.f110640h = textView;
        this.f110641i = textView2;
        this.f110642j = textView3;
        this.f110643k = ub0Var;
        this.f110644l = imageView6;
        this.f110645m = view;
        this.f110646n = frameLayout2;
        this.f110647o = constraintLayout2;
    }

    @androidx.annotation.n0
    public static fp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18960, new Class[]{View.class}, fp.class);
        if (patchProxyResultProxy.isSupported) {
            return (fp) patchProxyResultProxy.result;
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
                            i10 = R.id.iv_state;
                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_state);
                            if (imageView5 != null) {
                                i10 = R.id.tv_float_value;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_float_value);
                                if (textView != null) {
                                    i10 = R.id.tv_price;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_price);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_price_symbol;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                                        if (textView3 != null) {
                                            i10 = R.id.v_float_bar;
                                            View viewA = l3.d.a(view, R.id.v_float_bar);
                                            if (viewA != null) {
                                                ub0 ub0VarA = ub0.a(viewA);
                                                i10 = R.id.v_float_cursor;
                                                ImageView imageView6 = (ImageView) l3.d.a(view, R.id.v_float_cursor);
                                                if (imageView6 != null) {
                                                    i10 = R.id.v_progress;
                                                    View viewA2 = l3.d.a(view, R.id.v_progress);
                                                    if (viewA2 != null) {
                                                        i10 = R.id.vg_checked;
                                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_checked);
                                                        if (frameLayout != null) {
                                                            i10 = R.id.vg_price;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) l3.d.a(view, R.id.vg_price);
                                                            if (constraintLayout2 != null) {
                                                                return new fp((FrameLayout) view, constraintLayout, imageView, imageView2, imageView3, imageView4, imageView5, textView, textView2, textView3, ub0VarA, imageView6, viewA2, frameLayout, constraintLayout2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18958, new Class[]{LayoutInflater.class}, fp.class);
        return patchProxyResultProxy.isSupported ? (fp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18959, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fp.class);
        if (patchProxyResultProxy.isSupported) {
            return (fp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_inventory_item_format_3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f110633a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18961, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
