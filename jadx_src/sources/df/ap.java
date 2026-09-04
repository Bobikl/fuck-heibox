package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemInterestInitTopicBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ap implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f108604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f108605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108606e;

    private ap(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f108602a = constraintLayout;
        this.f108603b = imageView;
        this.f108604c = qMUIRadiusImageView;
        this.f108605d = hBLineHeightTextView;
        this.f108606e = frameLayout;
    }

    @androidx.annotation.n0
    public static ap a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18940, new Class[]{View.class}, ap.class);
        if (patchProxyResultProxy.isSupported) {
            return (ap) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_checked;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_checked);
        if (imageView != null) {
            i10 = R.id.iv_icon;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.tv_name;
                HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_name);
                if (hBLineHeightTextView != null) {
                    i10 = R.id.vg_checked;
                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_checked);
                    if (frameLayout != null) {
                        return new ap((ConstraintLayout) view, imageView, qMUIRadiusImageView, hBLineHeightTextView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ap c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18938, new Class[]{LayoutInflater.class}, ap.class);
        return patchProxyResultProxy.isSupported ? (ap) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ap d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18939, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ap.class);
        if (patchProxyResultProxy.isSupported) {
            return (ap) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_interest_init_topic, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108602a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18941, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
