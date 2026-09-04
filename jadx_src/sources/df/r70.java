package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutLittleProgramBarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115124g;

    private r70(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f115118a = linearLayout;
        this.f115119b = imageView;
        this.f115120c = imageView2;
        this.f115121d = view;
        this.f115122e = linearLayout2;
        this.f115123f = frameLayout;
        this.f115124g = frameLayout2;
    }

    @androidx.annotation.n0
    public static r70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20866, new Class[]{View.class}, r70.class);
        if (patchProxyResultProxy.isSupported) {
            return (r70) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_little_program_exit;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_little_program_exit);
        if (imageView != null) {
            i10 = R.id.iv_little_program_more;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_little_program_more);
            if (imageView2 != null) {
                i10 = R.id.v_little_program_div;
                View viewA = l3.d.a(view, R.id.v_little_program_div);
                if (viewA != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i10 = R.id.vg_little_program_exit;
                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_little_program_exit);
                    if (frameLayout != null) {
                        i10 = R.id.vg_little_program_more;
                        FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_little_program_more);
                        if (frameLayout2 != null) {
                            return new r70(linearLayout, imageView, imageView2, viewA, linearLayout, frameLayout, frameLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20864, new Class[]{LayoutInflater.class}, r70.class);
        return patchProxyResultProxy.isSupported ? (r70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20865, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r70.class);
        if (patchProxyResultProxy.isSupported) {
            return (r70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_little_program_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115118a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20867, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
