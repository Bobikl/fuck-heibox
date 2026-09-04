package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutMallOrderShareBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f117433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117440h;

    private x70(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7) {
        this.f117433a = frameLayout;
        this.f117434b = linearLayout;
        this.f117435c = linearLayout2;
        this.f117436d = linearLayout3;
        this.f117437e = linearLayout4;
        this.f117438f = linearLayout5;
        this.f117439g = linearLayout6;
        this.f117440h = linearLayout7;
    }

    @androidx.annotation.n0
    public static x70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20890, new Class[]{View.class}, x70.class);
        if (patchProxyResultProxy.isSupported) {
            return (x70) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_copy_link;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_copy_link);
        if (linearLayout != null) {
            i10 = R.id.vg_create_post;
            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_create_post);
            if (linearLayout2 != null) {
                i10 = R.id.vg_post;
                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_post);
                if (linearLayout3 != null) {
                    i10 = R.id.vg_qq;
                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_qq);
                    if (linearLayout4 != null) {
                        i10 = R.id.vg_save;
                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_save);
                        if (linearLayout5 != null) {
                            i10 = R.id.vg_wechat_friends;
                            LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_wechat_friends);
                            if (linearLayout6 != null) {
                                i10 = R.id.vg_wechat_timeline;
                                LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_wechat_timeline);
                                if (linearLayout7 != null) {
                                    return new x70((FrameLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7);
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
    public static x70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20888, new Class[]{LayoutInflater.class}, x70.class);
        return patchProxyResultProxy.isSupported ? (x70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20889, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x70.class);
        if (patchProxyResultProxy.isSupported) {
            return (x70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_mall_order_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f117433a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20891, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
