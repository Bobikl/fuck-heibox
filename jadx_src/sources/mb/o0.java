package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.R;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.Shimmer.ShimmerLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBottomSheetsDefaultBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class o0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f131676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f131677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f131678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f131679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f131685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShimmerLayout f131686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131687l;

    private o0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ShimmerLayout shimmerLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f131676a = constraintLayout;
        this.f131677b = barrier;
        this.f131678c = bottomButtonLeftItemView;
        this.f131679d = constraintLayout2;
        this.f131680e = imageView;
        this.f131681f = imageView2;
        this.f131682g = imageView3;
        this.f131683h = textView;
        this.f131684i = textView2;
        this.f131685j = relativeLayout;
        this.f131686k = shimmerLayout;
        this.f131687l = linearLayout;
    }

    @androidx.annotation.n0
    public static o0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f32125z8, new Class[]{View.class}, o0.class);
        if (patchProxyResultProxy.isSupported) {
            return (o0) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, i10);
        if (barrier != null) {
            i10 = R.id.bottom_button;
            BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, i10);
            if (bottomButtonLeftItemView != null) {
                i10 = R.id.cl_content;
                ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, i10);
                if (constraintLayout != null) {
                    i10 = R.id.iv_close;
                    ImageView imageView = (ImageView) l3.d.a(view, i10);
                    if (imageView != null) {
                        i10 = R.id.iv_icon;
                        ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                        if (imageView2 != null) {
                            i10 = R.id.iv_small_icon;
                            ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                            if (imageView3 != null) {
                                i10 = R.id.tv_desc;
                                TextView textView = (TextView) l3.d.a(view, i10);
                                if (textView != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView2 = (TextView) l3.d.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = R.id.vg_bottom_view;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_icon;
                                            ShimmerLayout shimmerLayout = (ShimmerLayout) l3.d.a(view, i10);
                                            if (shimmerLayout != null) {
                                                i10 = R.id.vg_title;
                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                                if (linearLayout != null) {
                                                    return new o0((ConstraintLayout) view, barrier, bottomButtonLeftItemView, constraintLayout, imageView, imageView2, imageView3, textView, textView2, relativeLayout, shimmerLayout, linearLayout);
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
    public static o0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f32091x8, new Class[]{LayoutInflater.class}, o0.class);
        return patchProxyResultProxy.isSupported ? (o0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f32108y8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o0.class);
        if (patchProxyResultProxy.isSupported) {
            return (o0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottom_sheets_default, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f131676a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.A8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
