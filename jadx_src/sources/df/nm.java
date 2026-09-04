package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2UserTitleView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewTeammateTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final Dota2UserTitleView f113912a;

    private nm(@androidx.annotation.n0 Dota2UserTitleView dota2UserTitleView) {
        this.f113912a = dota2UserTitleView;
    }

    @androidx.annotation.n0
    public static nm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18680, new Class[]{View.class}, nm.class);
        if (patchProxyResultProxy.isSupported) {
            return (nm) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new nm((Dota2UserTitleView) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static nm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18678, new Class[]{LayoutInflater.class}, nm.class);
        return patchProxyResultProxy.isSupported ? (nm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18679, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nm.class);
        if (patchProxyResultProxy.isSupported) {
            return (nm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_teammate_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public Dota2UserTitleView b() {
        return this.f113912a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18681, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
