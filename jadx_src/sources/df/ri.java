package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.EpicGameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemEpicGameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ri implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final EpicGameItemView f115264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EpicGameItemView f115265b;

    private ri(@androidx.annotation.n0 EpicGameItemView epicGameItemView, @androidx.annotation.n0 EpicGameItemView epicGameItemView2) {
        this.f115264a = epicGameItemView;
        this.f115265b = epicGameItemView2;
    }

    @androidx.annotation.n0
    public static ri a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18283, new Class[]{View.class}, ri.class);
        if (patchProxyResultProxy.isSupported) {
            return (ri) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        EpicGameItemView epicGameItemView = (EpicGameItemView) view;
        return new ri(epicGameItemView, epicGameItemView);
    }

    @androidx.annotation.n0
    public static ri c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18281, new Class[]{LayoutInflater.class}, ri.class);
        return patchProxyResultProxy.isSupported ? (ri) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ri d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18282, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ri.class);
        if (patchProxyResultProxy.isSupported) {
            return (ri) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_epic_game, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public EpicGameItemView b() {
        return this.f115264a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18284, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
