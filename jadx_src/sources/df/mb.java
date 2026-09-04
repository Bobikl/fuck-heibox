package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.zhpan.indicator.IndicatorView;

/* JADX INFO: compiled from: FragmentShareImageDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f113366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f113369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final IndicatorView f113373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f113375j;

    private mb(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 IndicatorView indicatorView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f113366a = frameLayout;
        this.f113367b = imageView;
        this.f113368c = frameLayout2;
        this.f113369d = oVar;
        this.f113370e = recyclerView;
        this.f113371f = recyclerView2;
        this.f113372g = textView;
        this.f113373h = indicatorView;
        this.f113374i = linearLayout;
        this.f113375j = viewPager2;
    }

    @androidx.annotation.n0
    public static mb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17536, new Class[]{View.class}, mb.class);
        if (patchProxyResultProxy.isSupported) {
            return (mb) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
        if (imageView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i10 = R.id.rv_divider;
            View viewA = l3.d.a(view, R.id.rv_divider);
            if (viewA != null) {
                mb.o oVarA = mb.o.a(viewA);
                i10 = R.id.rv_local_share;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_local_share);
                if (recyclerView != null) {
                    i10 = R.id.rv_share;
                    RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_share);
                    if (recyclerView2 != null) {
                        i10 = R.id.tv_share_desc;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_share_desc);
                        if (textView != null) {
                            i10 = R.id.v_indicator;
                            IndicatorView indicatorView = (IndicatorView) l3.d.a(view, R.id.v_indicator);
                            if (indicatorView != null) {
                                i10 = R.id.vg_share_panel;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_share_panel);
                                if (linearLayout != null) {
                                    i10 = R.id.vp_images;
                                    ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp_images);
                                    if (viewPager2 != null) {
                                        return new mb(frameLayout, imageView, frameLayout, oVarA, recyclerView, recyclerView2, textView, indicatorView, linearLayout, viewPager2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static mb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17534, new Class[]{LayoutInflater.class}, mb.class);
        return patchProxyResultProxy.isSupported ? (mb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17535, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mb.class);
        if (patchProxyResultProxy.isSupported) {
            return (mb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_share_image_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f113366a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17537, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
