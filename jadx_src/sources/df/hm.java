package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewNotifyBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final MarqueeTextView f111481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f111482b;

    private hm(@androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 MarqueeTextView marqueeTextView2) {
        this.f111481a = marqueeTextView;
        this.f111482b = marqueeTextView2;
    }

    @androidx.annotation.n0
    public static hm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18656, new Class[]{View.class}, hm.class);
        if (patchProxyResultProxy.isSupported) {
            return (hm) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MarqueeTextView marqueeTextView = (MarqueeTextView) view;
        return new hm(marqueeTextView, marqueeTextView);
    }

    @androidx.annotation.n0
    public static hm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18654, new Class[]{LayoutInflater.class}, hm.class);
        return patchProxyResultProxy.isSupported ? (hm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18655, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hm.class);
        if (patchProxyResultProxy.isSupported) {
            return (hm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_notify, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public MarqueeTextView b() {
        return this.f111481a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18657, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
