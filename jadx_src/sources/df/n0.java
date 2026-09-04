package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityGameStoreSteamTradingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113580s;

    private n0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3, @androidx.annotation.n0 View view4, @androidx.annotation.n0 View view5, @androidx.annotation.n0 View view6, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f113562a = linearLayout;
        this.f113563b = frameLayout;
        this.f113564c = view;
        this.f113565d = view2;
        this.f113566e = view3;
        this.f113567f = view4;
        this.f113568g = view5;
        this.f113569h = view6;
        this.f113570i = textView;
        this.f113571j = textView2;
        this.f113572k = textView3;
        this.f113573l = textView4;
        this.f113574m = textView5;
        this.f113575n = textView6;
        this.f113576o = textView7;
        this.f113577p = relativeLayout;
        this.f113578q = relativeLayout2;
        this.f113579r = relativeLayout3;
        this.f113580s = linearLayout2;
    }

    @androidx.annotation.n0
    public static n0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16396, new Class[]{View.class}, n0.class);
        if (patchProxyResultProxy.isSupported) {
            return (n0) patchProxyResultProxy.result;
        }
        int i10 = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fragment_container);
        if (frameLayout != null) {
            i10 = R.id.progress_bar_l_0;
            View viewA = l3.d.a(view, R.id.progress_bar_l_0);
            if (viewA != null) {
                i10 = R.id.progress_bar_l_1;
                View viewA2 = l3.d.a(view, R.id.progress_bar_l_1);
                if (viewA2 != null) {
                    i10 = R.id.progress_bar_l_2;
                    View viewA3 = l3.d.a(view, R.id.progress_bar_l_2);
                    if (viewA3 != null) {
                        i10 = R.id.progress_bar_r_0;
                        View viewA4 = l3.d.a(view, R.id.progress_bar_r_0);
                        if (viewA4 != null) {
                            i10 = R.id.progress_bar_r_1;
                            View viewA5 = l3.d.a(view, R.id.progress_bar_r_1);
                            if (viewA5 != null) {
                                i10 = R.id.progress_bar_r_2;
                                View viewA6 = l3.d.a(view, R.id.progress_bar_r_2);
                                if (viewA6 != null) {
                                    i10 = R.id.progress_indicator_0;
                                    TextView textView = (TextView) l3.d.a(view, R.id.progress_indicator_0);
                                    if (textView != null) {
                                        i10 = R.id.progress_indicator_1;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.progress_indicator_1);
                                        if (textView2 != null) {
                                            i10 = R.id.progress_indicator_2;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.progress_indicator_2);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_progress_desc_0;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_progress_desc_0);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_progress_desc_1;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_progress_desc_1);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_progress_desc_2;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_progress_desc_2);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tv_status;
                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_status);
                                                            if (textView7 != null) {
                                                                i10 = R.id.vg_progress_0;
                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_progress_0);
                                                                if (relativeLayout != null) {
                                                                    i10 = R.id.vg_progress_1;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_progress_1);
                                                                    if (relativeLayout2 != null) {
                                                                        i10 = R.id.vg_progress_2;
                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_progress_2);
                                                                        if (relativeLayout3 != null) {
                                                                            i10 = R.id.vg_progress_bar;
                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_progress_bar);
                                                                            if (linearLayout != null) {
                                                                                return new n0((LinearLayout) view, frameLayout, viewA, viewA2, viewA3, viewA4, viewA5, viewA6, textView, textView2, textView3, textView4, textView5, textView6, textView7, relativeLayout, relativeLayout2, relativeLayout3, linearLayout);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16394, new Class[]{LayoutInflater.class}, n0.class);
        return patchProxyResultProxy.isSupported ? (n0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16395, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n0.class);
        if (patchProxyResultProxy.isSupported) {
            return (n0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_store_steam_trading, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113562a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16397, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
