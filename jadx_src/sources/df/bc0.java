package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutUserMedalShareBgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f108904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QRCodeShareView f108905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final yb0 f108906c;

    private bc0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 QRCodeShareView qRCodeShareView, @androidx.annotation.n0 yb0 yb0Var) {
        this.f108904a = cardView;
        this.f108905b = qRCodeShareView;
        this.f108906c = yb0Var;
    }

    @androidx.annotation.n0
    public static bc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21317, new Class[]{View.class}, bc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.v_qr_code;
        QRCodeShareView qRCodeShareView = (QRCodeShareView) l3.d.a(view, R.id.v_qr_code);
        if (qRCodeShareView != null) {
            i10 = R.id.vg_detail;
            View viewA = l3.d.a(view, R.id.vg_detail);
            if (viewA != null) {
                return new bc0((CardView) view, qRCodeShareView, yb0.a(viewA));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static bc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21315, new Class[]{LayoutInflater.class}, bc0.class);
        return patchProxyResultProxy.isSupported ? (bc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21316, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_user_medal_share_bg, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f108904a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21318, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
