package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRollRoomPostJoinedUserBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bx implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109062b;

    private bx(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView) {
        this.f109061a = constraintLayout;
        this.f109062b = qMUIRadiusImageView;
    }

    @androidx.annotation.n0
    public static bx a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19772, new Class[]{View.class}, bx.class);
        if (patchProxyResultProxy.isSupported) {
            return (bx) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avartar);
        if (qMUIRadiusImageView != null) {
            return new bx((ConstraintLayout) view, qMUIRadiusImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.iv_avartar)));
    }

    @androidx.annotation.n0
    public static bx c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19770, new Class[]{LayoutInflater.class}, bx.class);
        return patchProxyResultProxy.isSupported ? (bx) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bx d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19771, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bx.class);
        if (patchProxyResultProxy.isSupported) {
            return (bx) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_roll_room_post_joined_user, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109061a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19773, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
