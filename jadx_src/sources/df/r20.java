package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBindCardHardwareV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f115048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f115049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewAnimator f115059l;

    private r20(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 ViewAnimator viewAnimator) {
        this.f115048a = cardView;
        this.f115049b = qMUIRadiusImageView;
        this.f115050c = linearLayout;
        this.f115051d = relativeLayout;
        this.f115052e = relativeLayout2;
        this.f115053f = textView;
        this.f115054g = textView2;
        this.f115055h = textView3;
        this.f115056i = textView4;
        this.f115057j = textView5;
        this.f115058k = view;
        this.f115059l = viewAnimator;
    }

    @androidx.annotation.n0
    public static r20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20350, new Class[]{View.class}, r20.class);
        if (patchProxyResultProxy.isSupported) {
            return (r20) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.ll_desc;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_desc);
            if (linearLayout != null) {
                i10 = R.id.rl_bg;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_bg);
                if (relativeLayout != null) {
                    i10 = R.id.rl_bind;
                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.rl_bind);
                    if (relativeLayout2 != null) {
                        i10 = R.id.tv_bind_btn;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_bind_btn);
                        if (textView != null) {
                            i10 = R.id.tv_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                            if (textView2 != null) {
                                i10 = R.id.tv_help;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_help);
                                if (textView3 != null) {
                                    i10 = R.id.tv_oversea;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_oversea);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_replace;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_replace);
                                        if (textView5 != null) {
                                            i10 = R.id.v_vertical_divider;
                                            View viewA = l3.d.a(view, R.id.v_vertical_divider);
                                            if (viewA != null) {
                                                i10 = R.id.va_desc;
                                                ViewAnimator viewAnimator = (ViewAnimator) l3.d.a(view, R.id.va_desc);
                                                if (viewAnimator != null) {
                                                    return new r20((CardView) view, qMUIRadiusImageView, linearLayout, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, viewA, viewAnimator);
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
    public static r20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20348, new Class[]{LayoutInflater.class}, r20.class);
        return patchProxyResultProxy.isSupported ? (r20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20349, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r20.class);
        if (patchProxyResultProxy.isSupported) {
            return (r20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bind_card_hardware_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f115048a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20351, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
