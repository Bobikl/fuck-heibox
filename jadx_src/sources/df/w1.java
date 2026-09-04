package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivitySendToFriendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ViewPagerFixed f116977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f116978b;

    private w1(@androidx.annotation.n0 ViewPagerFixed viewPagerFixed, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed2) {
        this.f116977a = viewPagerFixed;
        this.f116978b = viewPagerFixed2;
    }

    @androidx.annotation.n0
    public static w1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16536, new Class[]{View.class}, w1.class);
        if (patchProxyResultProxy.isSupported) {
            return (w1) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ViewPagerFixed viewPagerFixed = (ViewPagerFixed) view;
        return new w1(viewPagerFixed, viewPagerFixed);
    }

    @androidx.annotation.n0
    public static w1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16534, new Class[]{LayoutInflater.class}, w1.class);
        return patchProxyResultProxy.isSupported ? (w1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16535, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w1.class);
        if (patchProxyResultProxy.isSupported) {
            return (w1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_send_to_friend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ViewPagerFixed b() {
        return this.f116977a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16537, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
