package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDacMatchPreviewHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113845f;

    private nh(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 ImageView imageView) {
        this.f113840a = relativeLayout;
        this.f113841b = relativeLayout2;
        this.f113842c = linearLayout;
        this.f113843d = linearLayout2;
        this.f113844e = relativeLayout3;
        this.f113845f = imageView;
    }

    @androidx.annotation.n0
    public static nh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18163, new Class[]{View.class}, nh.class);
        if (patchProxyResultProxy.isSupported) {
            return (nh) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.cell0);
        if (relativeLayout != null) {
            i10 = R.id.cell1;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.cell1);
            if (linearLayout != null) {
                i10 = R.id.cell2;
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.cell2);
                if (linearLayout2 != null) {
                    i10 = R.id.cell3;
                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.cell3);
                    if (relativeLayout2 != null) {
                        i10 = R.id.iv_more;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_more);
                        if (imageView != null) {
                            return new nh((RelativeLayout) view, relativeLayout, linearLayout, linearLayout2, relativeLayout2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static nh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18161, new Class[]{LayoutInflater.class}, nh.class);
        return patchProxyResultProxy.isSupported ? (nh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18162, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nh.class);
        if (patchProxyResultProxy.isSupported) {
            return (nh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dac_match_preview_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113840a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18164, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
