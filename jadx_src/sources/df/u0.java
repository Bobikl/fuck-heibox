package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityImageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116106e;

    private u0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f116102a = relativeLayout;
        this.f116103b = imageView;
        this.f116104c = recyclerView;
        this.f116105d = textView;
        this.f116106e = textView2;
    }

    @androidx.annotation.n0
    public static u0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16424, new Class[]{View.class}, u0.class);
        if (patchProxyResultProxy.isSupported) {
            return (u0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_save;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_save);
        if (imageView != null) {
            i10 = R.id.rv_images;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_images);
            if (recyclerView != null) {
                i10 = R.id.tv_index;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_index);
                if (textView != null) {
                    i10 = R.id.tv_show_original;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_show_original);
                    if (textView2 != null) {
                        return new u0((RelativeLayout) view, imageView, recyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static u0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16422, new Class[]{LayoutInflater.class}, u0.class);
        return patchProxyResultProxy.isSupported ? (u0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16423, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u0.class);
        if (patchProxyResultProxy.isSupported) {
            return (u0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_image, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116102a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16425, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
