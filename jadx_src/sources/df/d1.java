package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityLimittedVisitorMainBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f109576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109577e;

    private d1(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f109573a = relativeLayout;
        this.f109574b = imageView;
        this.f109575c = recyclerView;
        this.f109576d = smartRefreshLayout;
        this.f109577e = frameLayout;
    }

    @androidx.annotation.n0
    public static d1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16460, new Class[]{View.class}, d1.class);
        if (patchProxyResultProxy.isSupported) {
            return (d1) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_logo;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_logo);
        if (imageView != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                i10 = R.id.srl;
                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                if (smartRefreshLayout != null) {
                    i10 = R.id.vg_logo;
                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_logo);
                    if (frameLayout != null) {
                        return new d1((RelativeLayout) view, imageView, recyclerView, smartRefreshLayout, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static d1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16458, new Class[]{LayoutInflater.class}, d1.class);
        return patchProxyResultProxy.isSupported ? (d1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16459, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d1.class);
        if (patchProxyResultProxy.isSupported) {
            return (d1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_limitted_visitor_main, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109573a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16461, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
