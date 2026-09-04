package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2UserTitleView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewAuthAllBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ll implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f113085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final fl f113087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2UserTitleView f113088f;

    private ll(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 fl flVar, @androidx.annotation.n0 Dota2UserTitleView dota2UserTitleView) {
        this.f113083a = linearLayout;
        this.f113084b = recyclerView;
        this.f113085c = tabLayout;
        this.f113086d = textView;
        this.f113087e = flVar;
        this.f113088f = dota2UserTitleView;
    }

    @androidx.annotation.n0
    public static ll a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18569, new Class[]{View.class}, ll.class);
        if (patchProxyResultProxy.isSupported) {
            return (ll) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.tab;
            TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab);
            if (tabLayout != null) {
                i10 = R.id.tv_button;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_button);
                if (textView != null) {
                    i10 = R.id.vg_auth_title;
                    View viewA = l3.d.a(view, R.id.vg_auth_title);
                    if (viewA != null) {
                        fl flVarA = fl.a(viewA);
                        i10 = R.id.vg_user_title;
                        Dota2UserTitleView dota2UserTitleView = (Dota2UserTitleView) l3.d.a(view, R.id.vg_user_title);
                        if (dota2UserTitleView != null) {
                            return new ll((LinearLayout) view, recyclerView, tabLayout, textView, flVarA, dota2UserTitleView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ll c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18567, new Class[]{LayoutInflater.class}, ll.class);
        return patchProxyResultProxy.isSupported ? (ll) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ll d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18568, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ll.class);
        if (patchProxyResultProxy.isSupported) {
            return (ll) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_auth_all, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113083a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18570, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
