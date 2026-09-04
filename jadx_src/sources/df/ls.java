package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.component.MoreButton;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPictureEventEntryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ls implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f113135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f113136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final MoreButton f113137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f113139e;

    private ls(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 MoreButton moreButton, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ConstraintLayout constraintLayout) {
        this.f113135a = frameLayout;
        this.f113136b = qMUIRadiusImageView;
        this.f113137c = moreButton;
        this.f113138d = textView;
        this.f113139e = constraintLayout;
    }

    @androidx.annotation.n0
    public static ls a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19296, new Class[]{View.class}, ls.class);
        if (patchProxyResultProxy.isSupported) {
            return (ls) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.f76247mb;
            MoreButton moreButton = (MoreButton) l3.d.a(view, R.id.f76247mb);
            if (moreButton != null) {
                i10 = R.id.tv_title;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
                if (textView != null) {
                    i10 = R.id.vg_content;
                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                    if (constraintLayout != null) {
                        return new ls((FrameLayout) view, qMUIRadiusImageView, moreButton, textView, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ls c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19294, new Class[]{LayoutInflater.class}, ls.class);
        return patchProxyResultProxy.isSupported ? (ls) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ls d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19295, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ls.class);
        if (patchProxyResultProxy.isSupported) {
            return (ls) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_picture_event_entry, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f113135a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19297, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
