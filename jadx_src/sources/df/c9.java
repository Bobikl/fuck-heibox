package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcommon.component.CollapsibleView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentGameDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f109226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CollapsibleView f109227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f109229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f109231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final j40 f109239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final x50 f109240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final q60 f109242r;

    private c9(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 CollapsibleView collapsibleView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 j40 j40Var, @androidx.annotation.n0 x50 x50Var, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 q60 q60Var) {
        this.f109225a = relativeLayout;
        this.f109226b = consecutiveScrollerLayout;
        this.f109227c = collapsibleView;
        this.f109228d = linearLayout;
        this.f109229e = progressBar;
        this.f109230f = recyclerView;
        this.f109231g = smartRefreshLayout;
        this.f109232h = textView;
        this.f109233i = textView2;
        this.f109234j = textView3;
        this.f109235k = textView4;
        this.f109236l = textView5;
        this.f109237m = relativeLayout2;
        this.f109238n = linearLayout2;
        this.f109239o = j40Var;
        this.f109240p = x50Var;
        this.f109241q = relativeLayout3;
        this.f109242r = q60Var;
    }

    @androidx.annotation.n0
    public static c9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17288, new Class[]{View.class}, c9.class);
        if (patchProxyResultProxy.isSupported) {
            return (c9) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl);
        if (consecutiveScrollerLayout != null) {
            i10 = R.id.cv_container_float;
            CollapsibleView collapsibleView = (CollapsibleView) l3.d.a(view, R.id.cv_container_float);
            if (collapsibleView != null) {
                i10 = R.id.ll_bottom_bar;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_bottom_bar);
                if (linearLayout != null) {
                    i10 = R.id.pb_download;
                    ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_download);
                    if (progressBar != null) {
                        i10 = R.id.rv;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                        if (recyclerView != null) {
                            i10 = R.id.srl;
                            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                            if (smartRefreshLayout != null) {
                                i10 = R.id.tv_download;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_download);
                                if (textView != null) {
                                    i10 = R.id.tv_progress;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_progress);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_progress_btn_left;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_progress_btn_left);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_progress_btn_right;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_progress_btn_right);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_purchase_protected;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_purchase_protected);
                                                if (textView5 != null) {
                                                    i10 = R.id.vg_content;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_content);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.vg_download_progress;
                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_download_progress);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.vg_empty_desc;
                                                            View viewA = l3.d.a(view, R.id.vg_empty_desc);
                                                            if (viewA != null) {
                                                                j40 j40VarA = j40.a(viewA);
                                                                i10 = R.id.vg_filter_header;
                                                                View viewA2 = l3.d.a(view, R.id.vg_filter_header);
                                                                if (viewA2 != null) {
                                                                    x50 x50VarA = x50.a(viewA2);
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                                    i10 = R.id.vg_rating_card;
                                                                    View viewA3 = l3.d.a(view, R.id.vg_rating_card);
                                                                    if (viewA3 != null) {
                                                                        return new c9(relativeLayout2, consecutiveScrollerLayout, collapsibleView, linearLayout, progressBar, recyclerView, smartRefreshLayout, textView, textView2, textView3, textView4, textView5, relativeLayout, linearLayout2, j40VarA, x50VarA, relativeLayout2, q60.a(viewA3));
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
    public static c9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17286, new Class[]{LayoutInflater.class}, c9.class);
        return patchProxyResultProxy.isSupported ? (c9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17287, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c9.class);
        if (patchProxyResultProxy.isSupported) {
            return (c9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109225a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17289, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
