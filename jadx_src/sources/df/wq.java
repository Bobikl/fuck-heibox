package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcustomview.CProgressButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMobileRecRowBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CProgressButton f117235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FlexboxLayout f117236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117239f;

    private wq(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CProgressButton cProgressButton, @androidx.annotation.n0 FlexboxLayout flexboxLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f117234a = constraintLayout;
        this.f117235b = cProgressButton;
        this.f117236c = flexboxLayout;
        this.f117237d = imageView;
        this.f117238e = textView;
        this.f117239f = textView2;
    }

    @androidx.annotation.n0
    public static wq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19132, new Class[]{View.class}, wq.class);
        if (patchProxyResultProxy.isSupported) {
            return (wq) patchProxyResultProxy.result;
        }
        int i10 = R.id.cpb_download;
        CProgressButton cProgressButton = (CProgressButton) l3.d.a(view, R.id.cpb_download);
        if (cProgressButton != null) {
            i10 = R.id.fl_tags;
            FlexboxLayout flexboxLayout = (FlexboxLayout) l3.d.a(view, R.id.fl_tags);
            if (flexboxLayout != null) {
                i10 = R.id.iv_img;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
                if (imageView != null) {
                    i10 = R.id.tv_download;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_download);
                    if (textView != null) {
                        i10 = R.id.tv_name;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView2 != null) {
                            return new wq((ConstraintLayout) view, cProgressButton, flexboxLayout, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19130, new Class[]{LayoutInflater.class}, wq.class);
        return patchProxyResultProxy.isSupported ? (wq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19131, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wq.class);
        if (patchProxyResultProxy.isSupported) {
            return (wq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_mobile_rec_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117234a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19133, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
