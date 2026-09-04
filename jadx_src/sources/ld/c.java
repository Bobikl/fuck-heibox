package ld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.component.SearchView;
import com.max.hbsearch.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbsearchFragmentNewSearchBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final TextView A;

    @n0
    public final View B;

    @n0
    public final ListSectionHeader C;

    @n0
    public final ListSectionHeader D;

    @n0
    public final View E;

    @n0
    public final LinearLayout F;

    @n0
    public final LinearLayout G;

    @n0
    public final LinearLayout H;

    @n0
    public final LinearLayout I;

    @n0
    public final LinearLayout J;

    @n0
    public final RelativeLayout K;

    @n0
    public final SearchView L;

    @n0
    public final View M;

    @n0
    public final ViewPager2 N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f131330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final CardView f131331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final CardView f131332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final CardView f131333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final CardView f131334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final FrameLayout f131335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final FrameLayout f131336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TabLayout f131337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final ImageView f131338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final ImageView f131339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final LinearLayout f131340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final LinearLayout f131341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final LinearLayout f131342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    public final LinearLayout f131343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    public final LinearLayout f131344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    public final LinearLayout f131345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @n0
    public final LinearLayout f131346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @n0
    public final LinearLayout f131347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @n0
    public final NestedScrollView f131348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @n0
    public final RelativeLayout f131349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @n0
    public final RecyclerView f131350u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @n0
    public final RecyclerView f131351v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @n0
    public final Space f131352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @n0
    public final HorizontalScrollView f131353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @n0
    public final ConsecutiveScrollerLayout f131354y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @n0
    public final TextView f131355z;

    private c(@n0 RelativeLayout relativeLayout, @n0 CardView cardView, @n0 CardView cardView2, @n0 CardView cardView3, @n0 CardView cardView4, @n0 FrameLayout frameLayout, @n0 FrameLayout frameLayout2, @n0 TabLayout tabLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2, @n0 LinearLayout linearLayout3, @n0 LinearLayout linearLayout4, @n0 LinearLayout linearLayout5, @n0 LinearLayout linearLayout6, @n0 LinearLayout linearLayout7, @n0 LinearLayout linearLayout8, @n0 NestedScrollView nestedScrollView, @n0 RelativeLayout relativeLayout2, @n0 RecyclerView recyclerView, @n0 RecyclerView recyclerView2, @n0 Space space, @n0 HorizontalScrollView horizontalScrollView, @n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @n0 TextView textView, @n0 TextView textView2, @n0 View view, @n0 ListSectionHeader listSectionHeader, @n0 ListSectionHeader listSectionHeader2, @n0 View view2, @n0 LinearLayout linearLayout9, @n0 LinearLayout linearLayout10, @n0 LinearLayout linearLayout11, @n0 LinearLayout linearLayout12, @n0 LinearLayout linearLayout13, @n0 RelativeLayout relativeLayout3, @n0 SearchView searchView, @n0 View view3, @n0 ViewPager2 viewPager2) {
        this.f131330a = relativeLayout;
        this.f131331b = cardView;
        this.f131332c = cardView2;
        this.f131333d = cardView3;
        this.f131334e = cardView4;
        this.f131335f = frameLayout;
        this.f131336g = frameLayout2;
        this.f131337h = tabLayout;
        this.f131338i = imageView;
        this.f131339j = imageView2;
        this.f131340k = linearLayout;
        this.f131341l = linearLayout2;
        this.f131342m = linearLayout3;
        this.f131343n = linearLayout4;
        this.f131344o = linearLayout5;
        this.f131345p = linearLayout6;
        this.f131346q = linearLayout7;
        this.f131347r = linearLayout8;
        this.f131348s = nestedScrollView;
        this.f131349t = relativeLayout2;
        this.f131350u = recyclerView;
        this.f131351v = recyclerView2;
        this.f131352w = space;
        this.f131353x = horizontalScrollView;
        this.f131354y = consecutiveScrollerLayout;
        this.f131355z = textView;
        this.A = textView2;
        this.B = view;
        this.C = listSectionHeader;
        this.D = listSectionHeader2;
        this.E = view2;
        this.F = linearLayout9;
        this.G = linearLayout10;
        this.H = linearLayout11;
        this.I = linearLayout12;
        this.J = linearLayout13;
        this.K = relativeLayout3;
        this.L = searchView;
        this.M = view3;
        this.N = viewPager2;
    }

    @n0
    public static c a(@n0 View view) {
        View viewA;
        View viewA2;
        View viewA3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.f33886u8, new Class[]{View.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_search_hot_hashtag;
        CardView cardView = (CardView) l3.d.a(view, i10);
        if (cardView != null) {
            i10 = R.id.cv_search_hot_hashtag_v2;
            CardView cardView2 = (CardView) l3.d.a(view, i10);
            if (cardView2 != null) {
                i10 = R.id.cv_search_hot_words;
                CardView cardView3 = (CardView) l3.d.a(view, i10);
                if (cardView3 != null) {
                    i10 = R.id.cv_search_hot_words_v2;
                    CardView cardView4 = (CardView) l3.d.a(view, i10);
                    if (cardView4 != null) {
                        i10 = R.id.fl_search;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                        if (frameLayout != null) {
                            i10 = R.id.fragment_container;
                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, i10);
                            if (frameLayout2 != null) {
                                i10 = R.id.hot_type_tab;
                                TabLayout tabLayout = (TabLayout) l3.d.a(view, i10);
                                if (tabLayout != null) {
                                    i10 = R.id.iv_hot_tag_bg_v2;
                                    ImageView imageView = (ImageView) l3.d.a(view, i10);
                                    if (imageView != null) {
                                        i10 = R.id.iv_refresh;
                                        ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                                        if (imageView2 != null) {
                                            i10 = R.id.ll_hot;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                            if (linearLayout != null) {
                                                i10 = R.id.ll_hot_search_v3;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.ll_refresh;
                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, i10);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.ll_search_history;
                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, i10);
                                                        if (linearLayout4 != null) {
                                                            i10 = R.id.ll_search_hot_hashtag;
                                                            LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, i10);
                                                            if (linearLayout5 != null) {
                                                                i10 = R.id.ll_search_hot_hashtag_v2;
                                                                LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, i10);
                                                                if (linearLayout6 != null) {
                                                                    i10 = R.id.ll_search_hot_words;
                                                                    LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, i10);
                                                                    if (linearLayout7 != null) {
                                                                        i10 = R.id.ll_search_hot_words_v2;
                                                                        LinearLayout linearLayout8 = (LinearLayout) l3.d.a(view, i10);
                                                                        if (linearLayout8 != null) {
                                                                            i10 = R.id.nsv_hot_search_v3;
                                                                            NestedScrollView nestedScrollView = (NestedScrollView) l3.d.a(view, i10);
                                                                            if (nestedScrollView != null) {
                                                                                i10 = R.id.rl_list_header_v2;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                                                                if (relativeLayout != null) {
                                                                                    i10 = R.id.rv_hot_mini_program;
                                                                                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, i10);
                                                                                    if (recyclerView != null) {
                                                                                        i10 = R.id.rv_search_recommend_v2;
                                                                                        RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, i10);
                                                                                        if (recyclerView2 != null) {
                                                                                            i10 = R.id.space_hot_search_v3;
                                                                                            Space space = (Space) l3.d.a(view, i10);
                                                                                            if (space != null) {
                                                                                                i10 = R.id.sv_hot_v2;
                                                                                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) l3.d.a(view, i10);
                                                                                                if (horizontalScrollView != null) {
                                                                                                    i10 = R.id.sv_placeholder;
                                                                                                    ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, i10);
                                                                                                    if (consecutiveScrollerLayout != null) {
                                                                                                        i10 = R.id.tv_hot_search_v2;
                                                                                                        TextView textView = (TextView) l3.d.a(view, i10);
                                                                                                        if (textView != null) {
                                                                                                            i10 = R.id.tv_hot_tag_v2;
                                                                                                            TextView textView2 = (TextView) l3.d.a(view, i10);
                                                                                                            if (textView2 != null && (viewA = l3.d.a(view, (i10 = R.id.v_default_gap))) != null) {
                                                                                                                i10 = R.id.v_list_header;
                                                                                                                ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, i10);
                                                                                                                if (listSectionHeader != null) {
                                                                                                                    i10 = R.id.v_list_header_v2;
                                                                                                                    ListSectionHeader listSectionHeader2 = (ListSectionHeader) l3.d.a(view, i10);
                                                                                                                    if (listSectionHeader2 != null && (viewA2 = l3.d.a(view, (i10 = R.id.v_top_space_hot_search_v3))) != null) {
                                                                                                                        i10 = R.id.vg_hot;
                                                                                                                        LinearLayout linearLayout9 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                        if (linearLayout9 != null) {
                                                                                                                            i10 = R.id.vg_hot_search_title;
                                                                                                                            LinearLayout linearLayout10 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                            if (linearLayout10 != null) {
                                                                                                                                i10 = R.id.vg_hot_search_title_v2;
                                                                                                                                LinearLayout linearLayout11 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                if (linearLayout11 != null) {
                                                                                                                                    i10 = R.id.vg_hot_tag_title;
                                                                                                                                    LinearLayout linearLayout12 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                    if (linearLayout12 != null) {
                                                                                                                                        i10 = R.id.vg_hot_tag_title_v2;
                                                                                                                                        LinearLayout linearLayout13 = (LinearLayout) l3.d.a(view, i10);
                                                                                                                                        if (linearLayout13 != null) {
                                                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                                                                                                            i10 = R.id.vg_search;
                                                                                                                                            SearchView searchView = (SearchView) l3.d.a(view, i10);
                                                                                                                                            if (searchView != null && (viewA3 = l3.d.a(view, (i10 = R.id.view_dap))) != null) {
                                                                                                                                                i10 = R.id.vp_hot_search;
                                                                                                                                                ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, i10);
                                                                                                                                                if (viewPager2 != null) {
                                                                                                                                                    return new c(relativeLayout2, cardView, cardView2, cardView3, cardView4, frameLayout, frameLayout2, tabLayout, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, nestedScrollView, relativeLayout, recyclerView, recyclerView2, space, horizontalScrollView, consecutiveScrollerLayout, textView, textView2, viewA, listSectionHeader, listSectionHeader2, viewA2, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, relativeLayout2, searchView, viewA3, viewPager2);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static c c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.f33842s8, new Class[]{LayoutInflater.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static c d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.f33864t8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbsearch_fragment_new_search, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f131330a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8336, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
