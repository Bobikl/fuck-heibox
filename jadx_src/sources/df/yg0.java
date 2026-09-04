package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewPsnGameItemPbBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ProgressBar f117971a;

    private yg0(@androidx.annotation.n0 ProgressBar progressBar) {
        this.f117971a = progressBar;
    }

    @androidx.annotation.n0
    public static yg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21818, new Class[]{View.class}, yg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (yg0) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new yg0((ProgressBar) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static yg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21816, new Class[]{LayoutInflater.class}, yg0.class);
        return patchProxyResultProxy.isSupported ? (yg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21817, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (yg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_psn_game_item_pb, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ProgressBar b() {
        return this.f117971a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21819, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
