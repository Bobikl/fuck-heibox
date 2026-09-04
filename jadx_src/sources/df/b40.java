package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutDota2MatchDetailShareBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f108786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final d40 f108790e;

    private b40(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 d40 d40Var) {
        this.f108786a = nestedScrollView;
        this.f108787b = imageView;
        this.f108788c = imageView2;
        this.f108789d = relativeLayout;
        this.f108790e = d40Var;
    }

    @androidx.annotation.n0
    public static b40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20494, new Class[]{View.class}, b40.class);
        if (patchProxyResultProxy.isSupported) {
            return (b40) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bg;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
        if (imageView != null) {
            i10 = R.id.iv_header;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_header);
            if (imageView2 != null) {
                i10 = R.id.vg_content;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_content);
                if (relativeLayout != null) {
                    i10 = R.id.vg_top;
                    View viewA = l3.d.a(view, R.id.vg_top);
                    if (viewA != null) {
                        return new b40((NestedScrollView) view, imageView, imageView2, relativeLayout, d40.a(viewA));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static b40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20492, new Class[]{LayoutInflater.class}, b40.class);
        return patchProxyResultProxy.isSupported ? (b40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20493, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b40.class);
        if (patchProxyResultProxy.isSupported) {
            return (b40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_dota2_match_detail_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f108786a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20495, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
