package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewCalendarItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pl implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f114576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114577b;

    private pl(@androidx.annotation.n0 View view, @androidx.annotation.n0 View view2) {
        this.f114576a = view;
        this.f114577b = view2;
    }

    @androidx.annotation.n0
    public static pl a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18585, new Class[]{View.class}, pl.class);
        if (patchProxyResultProxy.isSupported) {
            return (pl) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new pl(view, view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static pl b(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18583, new Class[]{LayoutInflater.class}, pl.class);
        return patchProxyResultProxy.isSupported ? (pl) patchProxyResultProxy.result : c(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pl c(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18584, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pl.class);
        if (patchProxyResultProxy.isSupported) {
            return (pl) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_calendar_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f114576a;
    }
}
