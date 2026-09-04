package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDota2HeroBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class di implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final Dota2HeroItemView f109811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2HeroItemView f109812b;

    private di(@androidx.annotation.n0 Dota2HeroItemView dota2HeroItemView, @androidx.annotation.n0 Dota2HeroItemView dota2HeroItemView2) {
        this.f109811a = dota2HeroItemView;
        this.f109812b = dota2HeroItemView2;
    }

    @androidx.annotation.n0
    public static di a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18227, new Class[]{View.class}, di.class);
        if (patchProxyResultProxy.isSupported) {
            return (di) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Dota2HeroItemView dota2HeroItemView = (Dota2HeroItemView) view;
        return new di(dota2HeroItemView, dota2HeroItemView);
    }

    @androidx.annotation.n0
    public static di c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18225, new Class[]{LayoutInflater.class}, di.class);
        return patchProxyResultProxy.isSupported ? (di) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static di d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18226, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, di.class);
        if (patchProxyResultProxy.isSupported) {
            return (di) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dota2_hero, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public Dota2HeroItemView b() {
        return this.f109811a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18228, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
