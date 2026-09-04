package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemChannelListRecommendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ve implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f116825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f116826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116832h;

    private ve(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f116825a = constraintLayout;
        this.f116826b = barrier;
        this.f116827c = imageView;
        this.f116828d = qMUIRadiusImageView;
        this.f116829e = textView;
        this.f116830f = textView2;
        this.f116831g = imageView2;
        this.f116832h = frameLayout;
    }

    @androidx.annotation.n0
    public static ve a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17884, new Class[]{View.class}, ve.class);
        if (patchProxyResultProxy.isSupported) {
            return (ve) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier);
        if (barrier != null) {
            i10 = R.id.iv_checked;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_checked);
            if (imageView != null) {
                i10 = R.id.iv_icon;
                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon);
                if (qMUIRadiusImageView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView != null) {
                        i10 = R.id.tv_title;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView2 != null) {
                            i10 = R.id.v_bg;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.v_bg);
                            if (imageView2 != null) {
                                i10 = R.id.vg_checked;
                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_checked);
                                if (frameLayout != null) {
                                    return new ve((ConstraintLayout) view, barrier, imageView, qMUIRadiusImageView, textView, textView2, imageView2, frameLayout);
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
    public static ve c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17882, new Class[]{LayoutInflater.class}, ve.class);
        return patchProxyResultProxy.isSupported ? (ve) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ve d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17883, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ve.class);
        if (patchProxyResultProxy.isSupported) {
            return (ve) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_channel_list_recommend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f116825a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17885, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
