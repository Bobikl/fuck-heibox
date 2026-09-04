package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameDetailDataItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemExpandableGridBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xi implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final GameDetailDataItemView f117577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameDetailDataItemView f117578b;

    private xi(@androidx.annotation.n0 GameDetailDataItemView gameDetailDataItemView, @androidx.annotation.n0 GameDetailDataItemView gameDetailDataItemView2) {
        this.f117577a = gameDetailDataItemView;
        this.f117578b = gameDetailDataItemView2;
    }

    @androidx.annotation.n0
    public static xi a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18307, new Class[]{View.class}, xi.class);
        if (patchProxyResultProxy.isSupported) {
            return (xi) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GameDetailDataItemView gameDetailDataItemView = (GameDetailDataItemView) view;
        return new xi(gameDetailDataItemView, gameDetailDataItemView);
    }

    @androidx.annotation.n0
    public static xi c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18305, new Class[]{LayoutInflater.class}, xi.class);
        return patchProxyResultProxy.isSupported ? (xi) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xi d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18306, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xi.class);
        if (patchProxyResultProxy.isSupported) {
            return (xi) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_expandable_grid, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public GameDetailDataItemView b() {
        return this.f117577a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18308, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
