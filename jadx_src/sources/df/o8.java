package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2UserTitleView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentDota2TeammateListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f114133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2UserTitleView f114134d;

    private o8(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 Dota2UserTitleView dota2UserTitleView) {
        this.f114131a = linearLayout;
        this.f114132b = recyclerView;
        this.f114133c = smartRefreshLayout;
        this.f114134d = dota2UserTitleView;
    }

    @androidx.annotation.n0
    public static o8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17232, new Class[]{View.class}, o8.class);
        if (patchProxyResultProxy.isSupported) {
            return (o8) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.srl;
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
            if (smartRefreshLayout != null) {
                i10 = R.id.v_title;
                Dota2UserTitleView dota2UserTitleView = (Dota2UserTitleView) l3.d.a(view, R.id.v_title);
                if (dota2UserTitleView != null) {
                    return new o8((LinearLayout) view, recyclerView, smartRefreshLayout, dota2UserTitleView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static o8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17230, new Class[]{LayoutInflater.class}, o8.class);
        return patchProxyResultProxy.isSupported ? (o8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17231, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o8.class);
        if (patchProxyResultProxy.isSupported) {
            return (o8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dota2_teammate_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114131a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17233, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
