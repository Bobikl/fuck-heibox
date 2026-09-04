package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import pokercc.android.expandablerecyclerview.ExpandableRecyclerView;

/* JADX INFO: compiled from: ActivityGameAccountBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f117663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f117664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final NestedScrollView f117665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpandableRecyclerView f117667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwitchButton f117669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwitchButton f117670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f117671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117683u;

    private y(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ExpandableRecyclerView expandableRecyclerView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SwitchButton switchButton, @androidx.annotation.n0 SwitchButton switchButton2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f117663a = smartRefreshLayout;
        this.f117664b = editText;
        this.f117665c = nestedScrollView;
        this.f117666d = frameLayout;
        this.f117667e = expandableRecyclerView;
        this.f117668f = recyclerView;
        this.f117669g = switchButton;
        this.f117670h = switchButton2;
        this.f117671i = smartRefreshLayout2;
        this.f117672j = textView;
        this.f117673k = textView2;
        this.f117674l = textView3;
        this.f117675m = textView4;
        this.f117676n = textView5;
        this.f117677o = textView6;
        this.f117678p = textView7;
        this.f117679q = relativeLayout;
        this.f117680r = frameLayout2;
        this.f117681s = linearLayout;
        this.f117682t = linearLayout2;
        this.f117683u = relativeLayout2;
    }

    @androidx.annotation.n0
    public static y a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16336, new Class[]{View.class}, y.class);
        if (patchProxyResultProxy.isSupported) {
            return (y) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_qucik;
        EditText editText = (EditText) l3.d.a(view, R.id.et_qucik);
        if (editText != null) {
            i10 = R.id.ns_root;
            NestedScrollView nestedScrollView = (NestedScrollView) l3.d.a(view, R.id.ns_root);
            if (nestedScrollView != null) {
                i10 = R.id.rb_0;
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.rb_0);
                if (frameLayout != null) {
                    i10 = R.id.rv_bind_list;
                    ExpandableRecyclerView expandableRecyclerView = (ExpandableRecyclerView) l3.d.a(view, R.id.rv_bind_list);
                    if (expandableRecyclerView != null) {
                        i10 = R.id.rv_platform;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_platform);
                        if (recyclerView != null) {
                            i10 = R.id.sb_change_card_type;
                            SwitchButton switchButton = (SwitchButton) l3.d.a(view, R.id.sb_change_card_type);
                            if (switchButton != null) {
                                i10 = R.id.sb_show_top;
                                SwitchButton switchButton2 = (SwitchButton) l3.d.a(view, R.id.sb_show_top);
                                if (switchButton2 != null) {
                                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                                    i10 = R.id.tv_platform_finish;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_platform_finish);
                                    if (textView != null) {
                                        i10 = R.id.tv_platform_tip;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_platform_tip);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_platform_title;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_platform_title);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_quick_bind;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_quick_bind);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_quick_unbind;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_quick_unbind);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_type_card;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_type_card);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tv_type_list;
                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_type_list);
                                                            if (textView7 != null) {
                                                                i10 = R.id.vg_card_type;
                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_card_type);
                                                                if (relativeLayout != null) {
                                                                    i10 = R.id.vg_platform_card;
                                                                    FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_platform_card);
                                                                    if (frameLayout2 != null) {
                                                                        i10 = R.id.vg_platform_setting;
                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_platform_setting);
                                                                        if (linearLayout != null) {
                                                                            i10 = R.id.vg_quick_bind;
                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_quick_bind);
                                                                            if (linearLayout2 != null) {
                                                                                i10 = R.id.vg_show_top;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_show_top);
                                                                                if (relativeLayout2 != null) {
                                                                                    return new y(smartRefreshLayout, editText, nestedScrollView, frameLayout, expandableRecyclerView, recyclerView, switchButton, switchButton2, smartRefreshLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, relativeLayout, frameLayout2, linearLayout, linearLayout2, relativeLayout2);
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
    public static y c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16334, new Class[]{LayoutInflater.class}, y.class);
        return patchProxyResultProxy.isSupported ? (y) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16335, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y.class);
        if (patchProxyResultProxy.isSupported) {
            return (y) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_account, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f117663a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16337, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
