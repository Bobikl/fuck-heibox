package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.component.FilterButtonView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentPostCommentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class la implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final yg A;

    @androidx.annotation.n0
    public final zg B;

    @androidx.annotation.n0
    public final RelativeLayout C;

    @androidx.annotation.n0
    public final RelativeLayout D;

    @androidx.annotation.n0
    public final RelativeLayout E;

    @androidx.annotation.n0
    public final FrameLayout F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.v f112941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f112942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f112943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f112948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f112953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final ToggleButton f112954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f112961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112965z;

    private la(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.v vVar, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 FilterButtonView filterButtonView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 ToggleButton toggleButton, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view2, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 View view3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 FrameLayout frameLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 yg ygVar, @androidx.annotation.n0 zg zgVar, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5, @androidx.annotation.n0 RelativeLayout relativeLayout6, @androidx.annotation.n0 FrameLayout frameLayout4) {
        this.f112940a = relativeLayout;
        this.f112941b = vVar;
        this.f112942c = consecutiveScrollerLayout;
        this.f112943d = filterButtonView;
        this.f112944e = frameLayout;
        this.f112945f = frameLayout2;
        this.f112946g = imageView;
        this.f112947h = imageView2;
        this.f112948i = circularProgressIndicator;
        this.f112949j = linearLayout;
        this.f112950k = recyclerView;
        this.f112951l = recyclerView2;
        this.f112952m = view;
        this.f112953n = smartRefreshLayout;
        this.f112954o = toggleButton;
        this.f112955p = textView;
        this.f112956q = textView2;
        this.f112957r = textView3;
        this.f112958s = textView4;
        this.f112959t = textView5;
        this.f112960u = view2;
        this.f112961v = id0Var;
        this.f112962w = view3;
        this.f112963x = relativeLayout2;
        this.f112964y = frameLayout3;
        this.f112965z = relativeLayout3;
        this.A = ygVar;
        this.B = zgVar;
        this.C = relativeLayout4;
        this.D = relativeLayout5;
        this.E = relativeLayout6;
        this.F = frameLayout4;
    }

    @androidx.annotation.n0
    public static la a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17428, new Class[]{View.class}, la.class);
        if (patchProxyResultProxy.isSupported) {
            return (la) patchProxyResultProxy.result;
        }
        int i10 = R.id.banner;
        View viewA = l3.d.a(view, R.id.banner);
        if (viewA != null) {
            mb.v vVarA = mb.v.a(viewA);
            i10 = R.id.csl;
            ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl);
            if (consecutiveScrollerLayout != null) {
                i10 = R.id.fbv_sort;
                FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, R.id.fbv_sort);
                if (filterButtonView != null) {
                    i10 = R.id.fl_no_commit_tip_btn_container;
                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_no_commit_tip_btn_container);
                    if (frameLayout != null) {
                        i10 = R.id.insert_fragment_container;
                        FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.insert_fragment_container);
                        if (frameLayout2 != null) {
                            i10 = R.id.iv_no_comment_tip_btn;
                            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_no_comment_tip_btn);
                            if (imageView != null) {
                                i10 = R.id.iv_no_comment_tip_icon;
                                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_no_comment_tip_icon);
                                if (imageView2 != null) {
                                    i10 = R.id.iv_pb;
                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, R.id.iv_pb);
                                    if (circularProgressIndicator != null) {
                                        i10 = R.id.ll_no_comment_tip;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_no_comment_tip);
                                        if (linearLayout != null) {
                                            i10 = R.id.rv;
                                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                                            if (recyclerView != null) {
                                                i10 = R.id.rv_morelike;
                                                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_morelike);
                                                if (recyclerView2 != null) {
                                                    i10 = R.id.sort_divider;
                                                    View viewA2 = l3.d.a(view, R.id.sort_divider);
                                                    if (viewA2 != null) {
                                                        i10 = R.id.srl;
                                                        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                                                        if (smartRefreshLayout != null) {
                                                            i10 = R.id.tb_cy_filter;
                                                            ToggleButton toggleButton = (ToggleButton) l3.d.a(view, R.id.tb_cy_filter);
                                                            if (toggleButton != null) {
                                                                i10 = R.id.tv_all_comment;
                                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_all_comment);
                                                                if (textView != null) {
                                                                    i10 = R.id.tv_footer_desc;
                                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_footer_desc);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.tv_no_comment_tip_btn;
                                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_no_comment_tip_btn);
                                                                        if (textView3 != null) {
                                                                            i10 = R.id.tv_no_comment_tip_title;
                                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_no_comment_tip_title);
                                                                            if (textView4 != null) {
                                                                                i10 = R.id.tv_owner_only;
                                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_owner_only);
                                                                                if (textView5 != null) {
                                                                                    i10 = R.id.v_comment_line;
                                                                                    View viewA3 = l3.d.a(view, R.id.v_comment_line);
                                                                                    if (viewA3 != null) {
                                                                                        i10 = R.id.v_div_top;
                                                                                        View viewA4 = l3.d.a(view, R.id.v_div_top);
                                                                                        if (viewA4 != null) {
                                                                                            id0 id0VarA = id0.a(viewA4);
                                                                                            i10 = R.id.v_owner_only_line;
                                                                                            View viewA5 = l3.d.a(view, R.id.v_owner_only_line);
                                                                                            if (viewA5 != null) {
                                                                                                i10 = R.id.vg_all_comment;
                                                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_all_comment);
                                                                                                if (relativeLayout != null) {
                                                                                                    i10 = R.id.vg_bottom_container;
                                                                                                    FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, R.id.vg_bottom_container);
                                                                                                    if (frameLayout3 != null) {
                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                                                                        i10 = R.id.vg_current_comment_container;
                                                                                                        View viewA6 = l3.d.a(view, R.id.vg_current_comment_container);
                                                                                                        if (viewA6 != null) {
                                                                                                            yg ygVarA = yg.a(viewA6);
                                                                                                            i10 = R.id.vg_current_comment_container_v2;
                                                                                                            View viewA7 = l3.d.a(view, R.id.vg_current_comment_container_v2);
                                                                                                            if (viewA7 != null) {
                                                                                                                zg zgVarA = zg.a(viewA7);
                                                                                                                i10 = R.id.vg_floor_options;
                                                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_floor_options);
                                                                                                                if (relativeLayout3 != null) {
                                                                                                                    i10 = R.id.vg_owner_only;
                                                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_owner_only);
                                                                                                                    if (relativeLayout4 != null) {
                                                                                                                        i10 = R.id.vg_pb;
                                                                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, R.id.vg_pb);
                                                                                                                        if (relativeLayout5 != null) {
                                                                                                                            i10 = R.id.vg_sort_container;
                                                                                                                            FrameLayout frameLayout4 = (FrameLayout) l3.d.a(view, R.id.vg_sort_container);
                                                                                                                            if (frameLayout4 != null) {
                                                                                                                                return new la(relativeLayout2, vVarA, consecutiveScrollerLayout, filterButtonView, frameLayout, frameLayout2, imageView, imageView2, circularProgressIndicator, linearLayout, recyclerView, recyclerView2, viewA2, smartRefreshLayout, toggleButton, textView, textView2, textView3, textView4, textView5, viewA3, id0VarA, viewA5, relativeLayout, frameLayout3, relativeLayout2, ygVarA, zgVarA, relativeLayout3, relativeLayout4, relativeLayout5, frameLayout4);
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
    public static la c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17426, new Class[]{LayoutInflater.class}, la.class);
        return patchProxyResultProxy.isSupported ? (la) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static la d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17427, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, la.class);
        if (patchProxyResultProxy.isSupported) {
            return (la) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_post_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112940a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17429, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
