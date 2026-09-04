package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogMallCartOrderPurchaseCodeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f116634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f116635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116638f;

    private v5(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116633a = relativeLayout;
        this.f116634b = bottomButtonLeftItemView;
        this.f116635c = editText;
        this.f116636d = imageView;
        this.f116637e = frameLayout;
        this.f116638f = linearLayout;
    }

    @androidx.annotation.n0
    public static v5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16948, new Class[]{View.class}, v5.class);
        if (patchProxyResultProxy.isSupported) {
            return (v5) patchProxyResultProxy.result;
        }
        int i10 = R.id.bb_confirm;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bb_confirm);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.et_purchase_code;
            EditText editText = (EditText) l3.d.a(view, R.id.et_purchase_code);
            if (editText != null) {
                i10 = R.id.iv_close;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
                if (imageView != null) {
                    i10 = R.id.vg_bg;
                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg);
                    if (frameLayout != null) {
                        i10 = R.id.vg_bottom_bar;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                        if (linearLayout != null) {
                            return new v5((RelativeLayout) view, bottomButtonLeftItemView, editText, imageView, frameLayout, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static v5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16946, new Class[]{LayoutInflater.class}, v5.class);
        return patchProxyResultProxy.isSupported ? (v5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16947, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v5.class);
        if (patchProxyResultProxy.isSupported) {
            return (v5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_mall_cart_order_purchase_code, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116633a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16949, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
