package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDestiny2MatchPreviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115261o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115262p;

    private rh(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f115247a = constraintLayout;
        this.f115248b = imageView;
        this.f115249c = imageView2;
        this.f115250d = textView;
        this.f115251e = textView2;
        this.f115252f = textView3;
        this.f115253g = textView4;
        this.f115254h = textView5;
        this.f115255i = textView6;
        this.f115256j = textView7;
        this.f115257k = textView8;
        this.f115258l = view;
        this.f115259m = relativeLayout;
        this.f115260n = relativeLayout2;
        this.f115261o = frameLayout;
        this.f115262p = relativeLayout3;
    }

    @androidx.annotation.n0
    public static rh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18179, new Class[]{View.class}, rh.class);
        if (patchProxyResultProxy.isSupported) {
            return (rh) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.iv_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView2 != null) {
                i10 = R.id.tv_k_1;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_k_1);
                if (textView != null) {
                    i10 = R.id.tv_k_2;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_k_2);
                    if (textView2 != null) {
                        i10 = R.id.tv_map;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_map);
                        if (textView3 != null) {
                            i10 = R.id.tv_mode;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_mode);
                            if (textView4 != null) {
                                i10 = R.id.tv_result;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_result);
                                if (textView5 != null) {
                                    i10 = R.id.tv_v_1;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_v_1);
                                    if (textView6 != null) {
                                        i10 = R.id.tv_v_2;
                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_v_2);
                                        if (textView7 != null) {
                                            i10 = R.id.tv_v_delta;
                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_v_delta);
                                            if (textView8 != null) {
                                                i10 = R.id.v_divider;
                                                View viewA = l3.d.a(view, R.id.v_divider);
                                                if (viewA != null) {
                                                    i10 = R.id.vg_1;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_1);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.vg_2;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_2);
                                                        if (relativeLayout2 != null) {
                                                            i10 = R.id.vg_icon;
                                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_icon);
                                                            if (frameLayout != null) {
                                                                i10 = R.id.vg_name;
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_name);
                                                                if (relativeLayout3 != null) {
                                                                    return new rh((ConstraintLayout) view, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewA, relativeLayout, relativeLayout2, frameLayout, relativeLayout3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static rh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18177, new Class[]{LayoutInflater.class}, rh.class);
        return patchProxyResultProxy.isSupported ? (rh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18178, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rh.class);
        if (patchProxyResultProxy.isSupported) {
            return (rh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_destiny2_match_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115247a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18180, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
