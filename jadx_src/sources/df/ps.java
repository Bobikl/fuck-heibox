package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.FriendItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPlatformFriendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ps implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FriendItemView f114605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FriendItemView f114606b;

    private ps(@androidx.annotation.n0 FriendItemView friendItemView, @androidx.annotation.n0 FriendItemView friendItemView2) {
        this.f114605a = friendItemView;
        this.f114606b = friendItemView2;
    }

    @androidx.annotation.n0
    public static ps a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19312, new Class[]{View.class}, ps.class);
        if (patchProxyResultProxy.isSupported) {
            return (ps) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FriendItemView friendItemView = (FriendItemView) view;
        return new ps(friendItemView, friendItemView);
    }

    @androidx.annotation.n0
    public static ps c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19310, new Class[]{LayoutInflater.class}, ps.class);
        return patchProxyResultProxy.isSupported ? (ps) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ps d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19311, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ps.class);
        if (patchProxyResultProxy.isSupported) {
            return (ps) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_platform_friend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FriendItemView b() {
        return this.f114605a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19313, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
