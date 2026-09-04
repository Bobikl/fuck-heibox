package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.FollowListItemViewDotVer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHeyboxUserV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lo implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FollowListItemViewDotVer f113095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FollowListItemViewDotVer f113096b;

    private lo(@androidx.annotation.n0 FollowListItemViewDotVer followListItemViewDotVer, @androidx.annotation.n0 FollowListItemViewDotVer followListItemViewDotVer2) {
        this.f113095a = followListItemViewDotVer;
        this.f113096b = followListItemViewDotVer2;
    }

    @androidx.annotation.n0
    public static lo a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18880, new Class[]{View.class}, lo.class);
        if (patchProxyResultProxy.isSupported) {
            return (lo) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FollowListItemViewDotVer followListItemViewDotVer = (FollowListItemViewDotVer) view;
        return new lo(followListItemViewDotVer, followListItemViewDotVer);
    }

    @androidx.annotation.n0
    public static lo c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18878, new Class[]{LayoutInflater.class}, lo.class);
        return patchProxyResultProxy.isSupported ? (lo) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lo d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18879, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lo.class);
        if (patchProxyResultProxy.isSupported) {
            return (lo) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_heybox_user_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FollowListItemViewDotVer b() {
        return this.f113095a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18881, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
