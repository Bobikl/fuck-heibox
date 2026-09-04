package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFirstOrderRebateBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f117373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f117374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117378g;

    private x4(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f117372a = relativeLayout;
        this.f117373b = bottomButtonLeftItemView;
        this.f117374c = constraintLayout;
        this.f117375d = imageView;
        this.f117376e = textView;
        this.f117377f = textView2;
        this.f117378g = relativeLayout2;
    }

    @androidx.annotation.n0
    public static x4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16852, new Class[]{View.class}, x4.class);
        if (patchProxyResultProxy.isSupported) {
            return (x4) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.cl_content;
            ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_content);
            if (constraintLayout != null) {
                i10 = R.id.iv_icon;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
                if (imageView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView != null) {
                        i10 = R.id.tv_title;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView2 != null) {
                            i10 = R.id.vg_icon;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_icon);
                            if (relativeLayout != null) {
                                return new x4((RelativeLayout) view, bottomButtonLeftItemView, constraintLayout, imageView, textView, textView2, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static x4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16850, new Class[]{LayoutInflater.class}, x4.class);
        return patchProxyResultProxy.isSupported ? (x4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16851, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x4.class);
        if (patchProxyResultProxy.isSupported) {
            return (x4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_first_order_rebate, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117372a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16853, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
