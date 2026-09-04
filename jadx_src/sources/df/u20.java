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
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBindCardSteamBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f116155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewAnimator f116167m;

    private u20(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 ViewAnimator viewAnimator) {
        this.f116155a = cardView;
        this.f116156b = imageView;
        this.f116157c = imageView2;
        this.f116158d = linearLayout;
        this.f116159e = relativeLayout;
        this.f116160f = relativeLayout2;
        this.f116161g = textView;
        this.f116162h = textView2;
        this.f116163i = textView3;
        this.f116164j = textView4;
        this.f116165k = textView5;
        this.f116166l = view;
        this.f116167m = viewAnimator;
    }

    @androidx.annotation.n0
    public static u20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20362, new Class[]{View.class}, u20.class);
        if (patchProxyResultProxy.isSupported) {
            return (u20) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_default_card;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_default_card);
        if (imageView != null) {
            i10 = R.id.iv_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView2 != null) {
                i10 = R.id.ll_desc;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_desc);
                if (linearLayout != null) {
                    i10 = R.id.rl_bg;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_bg);
                    if (relativeLayout != null) {
                        i10 = R.id.rl_steam_unbind_view_bind;
                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.rl_steam_unbind_view_bind);
                        if (relativeLayout2 != null) {
                            i10 = R.id.tv_bind_btn;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_bind_btn);
                            if (textView != null) {
                                i10 = R.id.tv_desc;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                                if (textView2 != null) {
                                    i10 = R.id.tv_dont_display;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_dont_display);
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
                                                        return new u20((CardView) view, imageView, imageView2, linearLayout, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, viewA, viewAnimator);
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
    public static u20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20360, new Class[]{LayoutInflater.class}, u20.class);
        return patchProxyResultProxy.isSupported ? (u20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20361, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u20.class);
        if (patchProxyResultProxy.isSupported) {
            return (u20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bind_card_steam, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f116155a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20363, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
