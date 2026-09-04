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

/* JADX INFO: compiled from: LayoutBindCardCsgoV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f113250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f113251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewAnimator f113259j;

    private m20(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 ViewAnimator viewAnimator) {
        this.f113250a = cardView;
        this.f113251b = qMUIRadiusImageView;
        this.f113252c = linearLayout;
        this.f113253d = relativeLayout;
        this.f113254e = textView;
        this.f113255f = textView2;
        this.f113256g = textView3;
        this.f113257h = textView4;
        this.f113258i = view;
        this.f113259j = viewAnimator;
    }

    @androidx.annotation.n0
    public static m20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20330, new Class[]{View.class}, m20.class);
        if (patchProxyResultProxy.isSupported) {
            return (m20) patchProxyResultProxy.result;
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
                    i10 = R.id.tv_bind_btn;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_bind_btn);
                    if (textView != null) {
                        i10 = R.id.tv_desc;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                        if (textView2 != null) {
                            i10 = R.id.tv_oversea;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_oversea);
                            if (textView3 != null) {
                                i10 = R.id.tv_replace;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_replace);
                                if (textView4 != null) {
                                    i10 = R.id.v_vertical_divider;
                                    View viewA = l3.d.a(view, R.id.v_vertical_divider);
                                    if (viewA != null) {
                                        i10 = R.id.va_desc;
                                        ViewAnimator viewAnimator = (ViewAnimator) l3.d.a(view, R.id.va_desc);
                                        if (viewAnimator != null) {
                                            return new m20((CardView) view, qMUIRadiusImageView, linearLayout, relativeLayout, textView, textView2, textView3, textView4, viewA, viewAnimator);
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
    public static m20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20328, new Class[]{LayoutInflater.class}, m20.class);
        return patchProxyResultProxy.isSupported ? (m20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20329, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m20.class);
        if (patchProxyResultProxy.isSupported) {
            return (m20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bind_card_csgo_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f113250a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20331, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
