package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentDebugLottieBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ScrollView f118234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LottieAnimationView f118235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f118236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118238e;

    private z7(@androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 LottieAnimationView lottieAnimationView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f118234a = scrollView;
        this.f118235b = lottieAnimationView;
        this.f118236c = recyclerView;
        this.f118237d = textView;
        this.f118238e = textView2;
    }

    @androidx.annotation.n0
    public static z7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17172, new Class[]{View.class}, z7.class);
        if (patchProxyResultProxy.isSupported) {
            return (z7) patchProxyResultProxy.result;
        }
        int i10 = R.id.lottie_preview;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) l3.d.a(view, R.id.lottie_preview);
        if (lottieAnimationView != null) {
            i10 = R.id.rv_cached_lottie;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_cached_lottie);
            if (recyclerView != null) {
                i10 = R.id.tv_preview_path;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_preview_path);
                if (textView != null) {
                    i10 = R.id.tv_preview_type;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_preview_type);
                    if (textView2 != null) {
                        return new z7((ScrollView) view, lottieAnimationView, recyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static z7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17170, new Class[]{LayoutInflater.class}, z7.class);
        return patchProxyResultProxy.isSupported ? (z7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17171, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z7.class);
        if (patchProxyResultProxy.isSupported) {
            return (z7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_debug_lottie, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ScrollView b() {
        return this.f118234a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17173, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
