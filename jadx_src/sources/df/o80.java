package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutNineImageViewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114147m;

    private o80(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 ImageView imageView8, @androidx.annotation.n0 ImageView imageView9, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f114135a = linearLayout;
        this.f114136b = imageView;
        this.f114137c = imageView2;
        this.f114138d = imageView3;
        this.f114139e = imageView4;
        this.f114140f = imageView5;
        this.f114141g = imageView6;
        this.f114142h = imageView7;
        this.f114143i = imageView8;
        this.f114144j = imageView9;
        this.f114145k = linearLayout2;
        this.f114146l = linearLayout3;
        this.f114147m = linearLayout4;
    }

    @androidx.annotation.n0
    public static o80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20958, new Class[]{View.class}, o80.class);
        if (patchProxyResultProxy.isSupported) {
            return (o80) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_nine_pic_1;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_nine_pic_1);
        if (imageView != null) {
            i10 = R.id.iv_nine_pic_2;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_nine_pic_2);
            if (imageView2 != null) {
                i10 = R.id.iv_nine_pic_3;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_nine_pic_3);
                if (imageView3 != null) {
                    i10 = R.id.iv_nine_pic_4;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_nine_pic_4);
                    if (imageView4 != null) {
                        i10 = R.id.iv_nine_pic_5;
                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_nine_pic_5);
                        if (imageView5 != null) {
                            i10 = R.id.iv_nine_pic_6;
                            ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_nine_pic_6);
                            if (imageView6 != null) {
                                i10 = R.id.iv_nine_pic_7;
                                ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_nine_pic_7);
                                if (imageView7 != null) {
                                    i10 = R.id.iv_nine_pic_8;
                                    ImageView imageView8 = (ImageView) l3.d.a(view, R.id.iv_nine_pic_8);
                                    if (imageView8 != null) {
                                        i10 = R.id.iv_nine_pic_9;
                                        ImageView imageView9 = (ImageView) l3.d.a(view, R.id.iv_nine_pic_9);
                                        if (imageView9 != null) {
                                            i10 = R.id.vg_pic_row_1;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_pic_row_1);
                                            if (linearLayout != null) {
                                                i10 = R.id.vg_pic_row_2;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_pic_row_2);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.vg_pic_row_3;
                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_pic_row_3);
                                                    if (linearLayout3 != null) {
                                                        return new o80((LinearLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, linearLayout, linearLayout2, linearLayout3);
                                                    }
                                                }
                                            }
                                        }
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
    public static o80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20956, new Class[]{LayoutInflater.class}, o80.class);
        return patchProxyResultProxy.isSupported ? (o80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20957, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o80.class);
        if (patchProxyResultProxy.isSupported) {
            return (o80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_nine_image_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114135a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20959, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
