package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2FollowUserItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewAuthBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ml implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final Dota2FollowUserItemView f113492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2FollowUserItemView f113493b;

    private ml(@androidx.annotation.n0 Dota2FollowUserItemView dota2FollowUserItemView, @androidx.annotation.n0 Dota2FollowUserItemView dota2FollowUserItemView2) {
        this.f113492a = dota2FollowUserItemView;
        this.f113493b = dota2FollowUserItemView2;
    }

    @androidx.annotation.n0
    public static ml a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18573, new Class[]{View.class}, ml.class);
        if (patchProxyResultProxy.isSupported) {
            return (ml) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Dota2FollowUserItemView dota2FollowUserItemView = (Dota2FollowUserItemView) view;
        return new ml(dota2FollowUserItemView, dota2FollowUserItemView);
    }

    @androidx.annotation.n0
    public static ml c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18571, new Class[]{LayoutInflater.class}, ml.class);
        return patchProxyResultProxy.isSupported ? (ml) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ml d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18572, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ml.class);
        if (patchProxyResultProxy.isSupported) {
            return (ml) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_auth, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public Dota2FollowUserItemView b() {
        return this.f113492a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18574, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
