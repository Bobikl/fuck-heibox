package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPostRecommendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f118254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f118255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118258e;

    private z80(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f118254a = frameLayout;
        this.f118255b = recyclerView;
        this.f118256c = textView;
        this.f118257d = textView2;
        this.f118258e = linearLayout;
    }

    @androidx.annotation.n0
    public static z80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21002, new Class[]{View.class}, z80.class);
        if (patchProxyResultProxy.isSupported) {
            return (z80) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_recommend_post;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_recommend_post);
        if (recyclerView != null) {
            i10 = R.id.tv_recommend_post_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_recommend_post_desc);
            if (textView != null) {
                i10 = R.id.tv_recommend_post_title;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_recommend_post_title);
                if (textView2 != null) {
                    i10 = R.id.vg_recommend;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_recommend);
                    if (linearLayout != null) {
                        return new z80((FrameLayout) view, recyclerView, textView, textView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static z80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21000, new Class[]{LayoutInflater.class}, z80.class);
        return patchProxyResultProxy.isSupported ? (z80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21001, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z80.class);
        if (patchProxyResultProxy.isSupported) {
            return (z80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_post_recommend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f118254a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21003, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
