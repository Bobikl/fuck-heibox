package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutHeaderBinarySwitchBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f108831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108833e;

    private b70(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f108829a = relativeLayout;
        this.f108830b = imageView;
        this.f108831c = segmentFilterView;
        this.f108832d = textView;
        this.f108833e = textView2;
    }

    @androidx.annotation.n0
    public static b70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20804, new Class[]{View.class}, b70.class);
        if (patchProxyResultProxy.isSupported) {
            return (b70) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_title_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_title_icon);
        if (imageView != null) {
            i10 = R.id.sfv;
            SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.sfv);
            if (segmentFilterView != null) {
                i10 = R.id.tv_subtitle;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_subtitle);
                if (textView != null) {
                    i10 = R.id.tv_title;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                    if (textView2 != null) {
                        return new b70((RelativeLayout) view, imageView, segmentFilterView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static b70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20802, new Class[]{LayoutInflater.class}, b70.class);
        return patchProxyResultProxy.isSupported ? (b70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20803, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b70.class);
        if (patchProxyResultProxy.isSupported) {
            return (b70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_header_binary_switch, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108829a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20805, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
