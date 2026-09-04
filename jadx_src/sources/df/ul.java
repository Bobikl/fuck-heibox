package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2FollowMatchItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewFollowMatchBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ul implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final Dota2FollowMatchItemView f116472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2FollowMatchItemView f116473b;

    private ul(@androidx.annotation.n0 Dota2FollowMatchItemView dota2FollowMatchItemView, @androidx.annotation.n0 Dota2FollowMatchItemView dota2FollowMatchItemView2) {
        this.f116472a = dota2FollowMatchItemView;
        this.f116473b = dota2FollowMatchItemView2;
    }

    @androidx.annotation.n0
    public static ul a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18604, new Class[]{View.class}, ul.class);
        if (patchProxyResultProxy.isSupported) {
            return (ul) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Dota2FollowMatchItemView dota2FollowMatchItemView = (Dota2FollowMatchItemView) view;
        return new ul(dota2FollowMatchItemView, dota2FollowMatchItemView);
    }

    @androidx.annotation.n0
    public static ul c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18602, new Class[]{LayoutInflater.class}, ul.class);
        return patchProxyResultProxy.isSupported ? (ul) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ul d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18603, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ul.class);
        if (patchProxyResultProxy.isSupported) {
            return (ul) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_follow_match, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public Dota2FollowMatchItemView b() {
        return this.f116472a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18605, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
