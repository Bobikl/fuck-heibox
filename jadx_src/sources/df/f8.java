package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentDota2GameDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f110481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final BaseBottomButton f110483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final NestedScrollView f110484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f110485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110489k;

    private f8(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 BaseBottomButton baseBottomButton, @androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f110479a = relativeLayout;
        this.f110480b = recyclerView;
        this.f110481c = smartRefreshLayout;
        this.f110482d = textView;
        this.f110483e = baseBottomButton;
        this.f110484f = nestedScrollView;
        this.f110485g = consecutiveScrollerLayout;
        this.f110486h = frameLayout;
        this.f110487i = linearLayout;
        this.f110488j = linearLayout2;
        this.f110489k = linearLayout3;
    }

    @androidx.annotation.n0
    public static f8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17196, new Class[]{View.class}, f8.class);
        if (patchProxyResultProxy.isSupported) {
            return (f8) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.srl;
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
            if (smartRefreshLayout != null) {
                i10 = R.id.tv_search;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_search);
                if (textView != null) {
                    i10 = R.id.v_bottom_button;
                    BaseBottomButton baseBottomButton = (BaseBottomButton) l3.d.a(view, R.id.v_bottom_button);
                    if (baseBottomButton != null) {
                        i10 = R.id.v_rv_scroll;
                        NestedScrollView nestedScrollView = (NestedScrollView) l3.d.a(view, R.id.v_rv_scroll);
                        if (nestedScrollView != null) {
                            i10 = R.id.v_scroll;
                            ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.v_scroll);
                            if (consecutiveScrollerLayout != null) {
                                i10 = R.id.vg_bind_card_container;
                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bind_card_container);
                                if (frameLayout != null) {
                                    i10 = R.id.vg_bottom_button;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_button);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_search;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_search);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.vg_search_container;
                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_search_container);
                                            if (linearLayout3 != null) {
                                                return new f8((RelativeLayout) view, recyclerView, smartRefreshLayout, textView, baseBottomButton, nestedScrollView, consecutiveScrollerLayout, frameLayout, linearLayout, linearLayout2, linearLayout3);
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
    public static f8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17194, new Class[]{LayoutInflater.class}, f8.class);
        return patchProxyResultProxy.isSupported ? (f8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17195, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f8.class);
        if (patchProxyResultProxy.isSupported) {
            return (f8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dota2_game_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110479a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17197, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
