package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.commentimagepainter.sharecard.GameOrderCassetteView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBottomSheetsPictureShareBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f131692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameOrderCassetteView f131693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f131698g;

    private p0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 GameOrderCassetteView gameOrderCassetteView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f131692a = constraintLayout;
        this.f131693b = gameOrderCassetteView;
        this.f131694c = imageView;
        this.f131695d = imageView2;
        this.f131696e = textView;
        this.f131697f = view;
        this.f131698g = relativeLayout;
    }

    @androidx.annotation.n0
    public static p0 a(@androidx.annotation.n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.D8, new Class[]{View.class}, p0.class);
        if (patchProxyResultProxy.isSupported) {
            return (p0) patchProxyResultProxy.result;
        }
        int i10 = R.id.game_order_cassette_share;
        GameOrderCassetteView gameOrderCassetteView = (GameOrderCassetteView) l3.d.a(view, i10);
        if (gameOrderCassetteView != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_share_picture;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null && (viewA = l3.d.a(view, (i10 = R.id.v_background))) != null) {
                        i10 = R.id.vg_bottom_view;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                        if (relativeLayout != null) {
                            return new p0((ConstraintLayout) view, gameOrderCassetteView, imageView, imageView2, textView, viewA, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static p0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.B8, new Class[]{LayoutInflater.class}, p0.class);
        return patchProxyResultProxy.isSupported ? (p0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.C8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p0.class);
        if (patchProxyResultProxy.isSupported) {
            return (p0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottom_sheets_picture_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f131692a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.E8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
