package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFilterListBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class l implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f131616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f131617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScrollView f131618c;

    private l(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ScrollView scrollView) {
        this.f131616a = constraintLayout;
        this.f131617b = frameLayout;
        this.f131618c = scrollView;
    }

    @androidx.annotation.n0
    public static l a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31953p6, new Class[]{View.class}, l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        int i10 = R.id.v_blank;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.vg_scroll;
            ScrollView scrollView = (ScrollView) l3.d.a(view, i10);
            if (scrollView != null) {
                return new l((ConstraintLayout) view, frameLayout, scrollView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static l c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f31919n6, new Class[]{LayoutInflater.class}, l.class);
        return patchProxyResultProxy.isSupported ? (l) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31936o6, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_filter_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f131616a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31970q6, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
