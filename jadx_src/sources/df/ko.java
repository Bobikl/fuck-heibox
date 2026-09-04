package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.FollowListItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHeyboxUserBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ko implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FollowListItemView f112672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FollowListItemView f112673b;

    private ko(@androidx.annotation.n0 FollowListItemView followListItemView, @androidx.annotation.n0 FollowListItemView followListItemView2) {
        this.f112672a = followListItemView;
        this.f112673b = followListItemView2;
    }

    @androidx.annotation.n0
    public static ko a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18876, new Class[]{View.class}, ko.class);
        if (patchProxyResultProxy.isSupported) {
            return (ko) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FollowListItemView followListItemView = (FollowListItemView) view;
        return new ko(followListItemView, followListItemView);
    }

    @androidx.annotation.n0
    public static ko c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18874, new Class[]{LayoutInflater.class}, ko.class);
        return patchProxyResultProxy.isSupported ? (ko) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ko d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18875, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ko.class);
        if (patchProxyResultProxy.isSupported) {
            return (ko) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_heybox_user, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FollowListItemView b() {
        return this.f112672a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18877, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
