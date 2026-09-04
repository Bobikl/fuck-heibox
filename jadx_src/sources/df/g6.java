package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.ProgressBgView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogPurchaseBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBgView f110822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBgView f110823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBgView f110824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f110825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110839s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110840t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110841u;

    private g6(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ProgressBgView progressBgView, @androidx.annotation.n0 ProgressBgView progressBgView2, @androidx.annotation.n0 ProgressBgView progressBgView3, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4) {
        this.f110821a = relativeLayout;
        this.f110822b = progressBgView;
        this.f110823c = progressBgView2;
        this.f110824d = progressBgView3;
        this.f110825e = progressBar;
        this.f110826f = textView;
        this.f110827g = textView2;
        this.f110828h = textView3;
        this.f110829i = textView4;
        this.f110830j = textView5;
        this.f110831k = textView6;
        this.f110832l = textView7;
        this.f110833m = textView8;
        this.f110834n = textView9;
        this.f110835o = textView10;
        this.f110836p = textView11;
        this.f110837q = textView12;
        this.f110838r = linearLayout;
        this.f110839s = relativeLayout2;
        this.f110840t = relativeLayout3;
        this.f110841u = relativeLayout4;
    }

    @androidx.annotation.n0
    public static g6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16992, new Class[]{View.class}, g6.class);
        if (patchProxyResultProxy.isSupported) {
            return (g6) patchProxyResultProxy.result;
        }
        int i10 = R.id.pb_0;
        ProgressBgView progressBgView = (ProgressBgView) l3.d.a(view, R.id.pb_0);
        if (progressBgView != null) {
            i10 = R.id.pb_1;
            ProgressBgView progressBgView2 = (ProgressBgView) l3.d.a(view, R.id.pb_1);
            if (progressBgView2 != null) {
                i10 = R.id.pb_2;
                ProgressBgView progressBgView3 = (ProgressBgView) l3.d.a(view, R.id.pb_2);
                if (progressBgView3 != null) {
                    i10 = R.id.pb_title;
                    ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_title);
                    if (progressBar != null) {
                        i10 = R.id.tv_negative_button;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_negative_button);
                        if (textView != null) {
                            i10 = R.id.tv_positive_button;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_positive_button);
                            if (textView2 != null) {
                                i10 = R.id.tv_progress_0;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_progress_0);
                                if (textView3 != null) {
                                    i10 = R.id.tv_progress_1;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_progress_1);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_progress_2;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_progress_2);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_progress_checked_0;
                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_progress_checked_0);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_progress_checked_1;
                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_progress_checked_1);
                                                if (textView7 != null) {
                                                    i10 = R.id.tv_progress_checked_2;
                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_progress_checked_2);
                                                    if (textView8 != null) {
                                                        i10 = R.id.tv_progress_desc_0;
                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_progress_desc_0);
                                                        if (textView9 != null) {
                                                            i10 = R.id.tv_progress_desc_1;
                                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_progress_desc_1);
                                                            if (textView10 != null) {
                                                                i10 = R.id.tv_progress_desc_2;
                                                                TextView textView11 = (TextView) l3.d.a(view, R.id.tv_progress_desc_2);
                                                                if (textView11 != null) {
                                                                    i10 = R.id.tv_title;
                                                                    TextView textView12 = (TextView) l3.d.a(view, R.id.tv_title);
                                                                    if (textView12 != null) {
                                                                        i10 = R.id.vg_button_panel;
                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_button_panel);
                                                                        if (linearLayout != null) {
                                                                            i10 = R.id.vg_progress_desc_0;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_progress_desc_0);
                                                                            if (relativeLayout != null) {
                                                                                i10 = R.id.vg_progress_desc_1;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_progress_desc_1);
                                                                                if (relativeLayout2 != null) {
                                                                                    i10 = R.id.vg_progress_desc_2;
                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_progress_desc_2);
                                                                                    if (relativeLayout3 != null) {
                                                                                        return new g6((RelativeLayout) view, progressBgView, progressBgView2, progressBgView3, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, linearLayout, relativeLayout, relativeLayout2, relativeLayout3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static g6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16990, new Class[]{LayoutInflater.class}, g6.class);
        return patchProxyResultProxy.isSupported ? (g6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16991, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g6.class);
        if (patchProxyResultProxy.isSupported) {
            return (g6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_purchase, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110821a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16993, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
