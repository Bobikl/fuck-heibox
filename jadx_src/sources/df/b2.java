package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.ClockView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivitySteamBalancePurchaseProgressBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ClockView f108733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f108738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f108739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f108743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108748q;

    private b2(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ClockView clockView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 GradientTextView gradientTextView2, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 View view, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f108732a = constraintLayout;
        this.f108733b = clockView;
        this.f108734c = imageView;
        this.f108735d = imageView2;
        this.f108736e = recyclerView;
        this.f108737f = textView;
        this.f108738g = marqueeTextView;
        this.f108739h = gradientTextView;
        this.f108740i = textView2;
        this.f108741j = textView3;
        this.f108742k = textView4;
        this.f108743l = gradientTextView2;
        this.f108744m = textView5;
        this.f108745n = textView6;
        this.f108746o = view;
        this.f108747p = frameLayout;
        this.f108748q = linearLayout;
    }

    @androidx.annotation.n0
    public static b2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16556, new Class[]{View.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_progress;
        ClockView clockView = (ClockView) l3.d.a(view, R.id.cv_progress);
        if (clockView != null) {
            i10 = R.id.iv_arrow;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
            if (imageView != null) {
                i10 = R.id.iv_state;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_state);
                if (imageView2 != null) {
                    i10 = R.id.rv_state;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_state);
                    if (recyclerView != null) {
                        i10 = R.id.tv_bottom_msg;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_bottom_msg);
                        if (textView != null) {
                            i10 = R.id.tv_message;
                            MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_message);
                            if (marqueeTextView != null) {
                                i10 = R.id.tv_progress;
                                GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_progress);
                                if (gradientTextView != null) {
                                    i10 = R.id.tv_state;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_state);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_state_tips;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_state_tips);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_state_title;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_state_title);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_symbol;
                                                GradientTextView gradientTextView2 = (GradientTextView) l3.d.a(view, R.id.tv_symbol);
                                                if (gradientTextView2 != null) {
                                                    i10 = R.id.tv_tips;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_tips);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_tips_title;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_tips_title);
                                                        if (textView6 != null) {
                                                            i10 = R.id.v_state_divider;
                                                            View viewA = l3.d.a(view, R.id.v_state_divider);
                                                            if (viewA != null) {
                                                                i10 = R.id.vg_message;
                                                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_message);
                                                                if (frameLayout != null) {
                                                                    i10 = R.id.vg_state;
                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_state);
                                                                    if (linearLayout != null) {
                                                                        return new b2((ConstraintLayout) view, clockView, imageView, imageView2, recyclerView, textView, marqueeTextView, gradientTextView, textView2, textView3, textView4, gradientTextView2, textView5, textView6, viewA, frameLayout, linearLayout);
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
    public static b2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16554, new Class[]{LayoutInflater.class}, b2.class);
        return patchProxyResultProxy.isSupported ? (b2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16555, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_steam_balance_purchase_progress, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108732a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16557, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
