package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityFeedbackBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f116961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.q f116962e;

    private w(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 mb.q qVar) {
        this.f116958a = relativeLayout;
        this.f116959b = relativeLayout2;
        this.f116960c = recyclerView;
        this.f116961d = smartRefreshLayout;
        this.f116962e = qVar;
    }

    @androidx.annotation.n0
    public static w a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16328, new Class[]{View.class}, w.class);
        if (patchProxyResultProxy.isSupported) {
            return (w) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.srl;
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
            if (smartRefreshLayout != null) {
                i10 = R.id.view_empty;
                View viewA = l3.d.a(view, R.id.view_empty);
                if (viewA != null) {
                    return new w(relativeLayout, relativeLayout, recyclerView, smartRefreshLayout, mb.q.a(viewA));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static w c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16326, new Class[]{LayoutInflater.class}, w.class);
        return patchProxyResultProxy.isSupported ? (w) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16327, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w.class);
        if (patchProxyResultProxy.isSupported) {
            return (w) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_feedback, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116958a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16329, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
