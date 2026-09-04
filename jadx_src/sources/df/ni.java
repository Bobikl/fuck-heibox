package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2UserItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDota2UserBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ni implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final Dota2UserItemView f113854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2UserItemView f113855b;

    private ni(@androidx.annotation.n0 Dota2UserItemView dota2UserItemView, @androidx.annotation.n0 Dota2UserItemView dota2UserItemView2) {
        this.f113854a = dota2UserItemView;
        this.f113855b = dota2UserItemView2;
    }

    @androidx.annotation.n0
    public static ni a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18267, new Class[]{View.class}, ni.class);
        if (patchProxyResultProxy.isSupported) {
            return (ni) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Dota2UserItemView dota2UserItemView = (Dota2UserItemView) view;
        return new ni(dota2UserItemView, dota2UserItemView);
    }

    @androidx.annotation.n0
    public static ni c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18265, new Class[]{LayoutInflater.class}, ni.class);
        return patchProxyResultProxy.isSupported ? (ni) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ni d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18266, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ni.class);
        if (patchProxyResultProxy.isSupported) {
            return (ni) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dota2_user, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public Dota2UserItemView b() {
        return this.f113854a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18268, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
