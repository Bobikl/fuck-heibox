package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.cardview.widget.CardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBindCardEpicV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f114404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewAnimator f114414l;

    private p20(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 ViewAnimator viewAnimator) {
        this.f114403a = cardView;
        this.f114404b = circularProgressIndicator;
        this.f114405c = imageView;
        this.f114406d = linearLayout;
        this.f114407e = relativeLayout;
        this.f114408f = relativeLayout2;
        this.f114409g = textView;
        this.f114410h = textView2;
        this.f114411i = textView3;
        this.f114412j = textView4;
        this.f114413k = view;
        this.f114414l = viewAnimator;
    }

    @androidx.annotation.n0
    public static p20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20342, new Class[]{View.class}, p20.class);
        if (patchProxyResultProxy.isSupported) {
            return (p20) patchProxyResultProxy.result;
        }
        int i10 = R.id.cp_loading;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, R.id.cp_loading);
        if (circularProgressIndicator != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.ll_desc;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_desc);
                if (linearLayout != null) {
                    i10 = R.id.rl_bg;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_bg);
                    if (relativeLayout != null) {
                        i10 = R.id.rl_bind;
                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.rl_bind);
                        if (relativeLayout2 != null) {
                            i10 = R.id.tv_desc;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                            if (textView != null) {
                                i10 = R.id.tv_help;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_help);
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
                                                    return new p20((CardView) view, circularProgressIndicator, imageView, linearLayout, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, viewA, viewAnimator);
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
    public static p20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20340, new Class[]{LayoutInflater.class}, p20.class);
        return patchProxyResultProxy.isSupported ? (p20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20341, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p20.class);
        if (patchProxyResultProxy.isSupported) {
            return (p20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bind_card_epic_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114403a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20343, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
