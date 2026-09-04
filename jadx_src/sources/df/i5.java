package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.Shimmer.ShimmerLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFragmentSteamAreaChangeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f111630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShimmerLayout f111631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichStackModelView f111632l;

    private i5(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ShimmerLayout shimmerLayout, @androidx.annotation.n0 RichStackModelView richStackModelView) {
        this.f111621a = relativeLayout;
        this.f111622b = imageView;
        this.f111623c = imageView2;
        this.f111624d = textView;
        this.f111625e = textView2;
        this.f111626f = textView3;
        this.f111627g = textView4;
        this.f111628h = view;
        this.f111629i = linearLayout;
        this.f111630j = constraintLayout;
        this.f111631k = shimmerLayout;
        this.f111632l = richStackModelView;
    }

    @androidx.annotation.n0
    public static i5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16896, new Class[]{View.class}, i5.class);
        if (patchProxyResultProxy.isSupported) {
            return (i5) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.iv_small_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_small_icon);
            if (imageView2 != null) {
                i10 = R.id.tv_hint;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_hint);
                if (textView != null) {
                    i10 = R.id.tv_negative_button;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_negative_button);
                    if (textView2 != null) {
                        i10 = R.id.tv_positive_button;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_positive_button);
                        if (textView3 != null) {
                            i10 = R.id.tv_title;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView4 != null) {
                                i10 = R.id.v_btn_divider;
                                View viewA = l3.d.a(view, R.id.v_btn_divider);
                                if (viewA != null) {
                                    i10 = R.id.vg_button_panel;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_button_panel);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_content;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                                        if (constraintLayout != null) {
                                            i10 = R.id.vg_icon;
                                            ShimmerLayout shimmerLayout = (ShimmerLayout) l3.d.a(view, R.id.vg_icon);
                                            if (shimmerLayout != null) {
                                                i10 = R.id.vg_rich;
                                                RichStackModelView richStackModelView = (RichStackModelView) l3.d.a(view, R.id.vg_rich);
                                                if (richStackModelView != null) {
                                                    return new i5((RelativeLayout) view, imageView, imageView2, textView, textView2, textView3, textView4, viewA, linearLayout, constraintLayout, shimmerLayout, richStackModelView);
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
    public static i5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16894, new Class[]{LayoutInflater.class}, i5.class);
        return patchProxyResultProxy.isSupported ? (i5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16895, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i5.class);
        if (patchProxyResultProxy.isSupported) {
            return (i5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_steam_area_change, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111621a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16897, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
