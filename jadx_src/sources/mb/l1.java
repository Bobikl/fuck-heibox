package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.R;
import com.max.hbcustomview.ProgressTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TabHeyboxBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class l1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ProgressTextView f131624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressTextView f131625b;

    private l1(@androidx.annotation.n0 ProgressTextView progressTextView, @androidx.annotation.n0 ProgressTextView progressTextView2) {
        this.f131624a = progressTextView;
        this.f131625b = progressTextView2;
    }

    @androidx.annotation.n0
    public static l1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31923na, new Class[]{View.class}, l1.class);
        if (patchProxyResultProxy.isSupported) {
            return (l1) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProgressTextView progressTextView = (ProgressTextView) view;
        return new l1(progressTextView, progressTextView);
    }

    @androidx.annotation.n0
    public static l1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 4105, new Class[]{LayoutInflater.class}, l1.class);
        return patchProxyResultProxy.isSupported ? (l1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 4106, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l1.class);
        if (patchProxyResultProxy.isSupported) {
            return (l1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.tab_heybox, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ProgressTextView b() {
        return this.f131624a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4108, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
