package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentTradeOfferDetailDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ub implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f116358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f116364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116370n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f116371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116373q;

    private ub(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f116357a = relativeLayout;
        this.f116358b = oVar;
        this.f116359c = imageView;
        this.f116360d = imageView2;
        this.f116361e = progressBar;
        this.f116362f = recyclerView;
        this.f116363g = textView;
        this.f116364h = smartRefreshLayout;
        this.f116365i = textView2;
        this.f116366j = textView3;
        this.f116367k = textView4;
        this.f116368l = textView5;
        this.f116369m = linearLayout;
        this.f116370n = view;
        this.f116371o = constraintLayout;
        this.f116372p = linearLayout2;
        this.f116373q = frameLayout;
    }

    @androidx.annotation.n0
    public static ub a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17568, new Class[]{View.class}, ub.class);
        if (patchProxyResultProxy.isSupported) {
            return (ub) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.iv_steam;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_steam);
                if (imageView2 != null) {
                    i10 = R.id.progress;
                    ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
                    if (progressBar != null) {
                        i10 = R.id.rv;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                        if (recyclerView != null) {
                            i10 = R.id.rv_title;
                            TextView textView = (TextView) l3.d.a(view, R.id.rv_title);
                            if (textView != null) {
                                i10 = R.id.srl;
                                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                                if (smartRefreshLayout != null) {
                                    i10 = R.id.tv_btn;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_btn);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_join_time;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_join_time);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_time_left;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_time_left);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_title;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title);
                                                if (textView5 != null) {
                                                    i10 = R.id.vg_btn;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_btn);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.vg_close;
                                                        View viewA2 = l3.d.a(view, R.id.vg_close);
                                                        if (viewA2 != null) {
                                                            i10 = R.id.vg_content;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                                                            if (constraintLayout != null) {
                                                                i10 = R.id.vg_offer_info;
                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_offer_info);
                                                                if (linearLayout2 != null) {
                                                                    i10 = R.id.vg_progress;
                                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_progress);
                                                                    if (frameLayout != null) {
                                                                        return new ub((RelativeLayout) view, oVarA, imageView, imageView2, progressBar, recyclerView, textView, smartRefreshLayout, textView2, textView3, textView4, textView5, linearLayout, viewA2, constraintLayout, linearLayout2, frameLayout);
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
    public static ub c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17566, new Class[]{LayoutInflater.class}, ub.class);
        return patchProxyResultProxy.isSupported ? (ub) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ub d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17567, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ub.class);
        if (patchProxyResultProxy.isSupported) {
            return (ub) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_trade_offer_detail_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116357a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17569, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
