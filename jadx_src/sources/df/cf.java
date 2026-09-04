package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemCheckInCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f109364f;

    private cf(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 ConstraintLayout constraintLayout2) {
        this.f109359a = constraintLayout;
        this.f109360b = imageView;
        this.f109361c = textView;
        this.f109362d = textView2;
        this.f109363e = view;
        this.f109364f = constraintLayout2;
    }

    @androidx.annotation.n0
    public static cf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17912, new Class[]{View.class}, cf.class);
        if (patchProxyResultProxy.isSupported) {
            return (cf) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_item_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_item_img);
        if (imageView != null) {
            i10 = R.id.tv_item_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_item_desc);
            if (textView != null) {
                i10 = R.id.tv_item_title;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_title);
                if (textView2 != null) {
                    i10 = R.id.v_mask;
                    View viewA = l3.d.a(view, R.id.v_mask);
                    if (viewA != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new cf(constraintLayout, imageView, textView, textView2, viewA, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static cf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17910, new Class[]{LayoutInflater.class}, cf.class);
        return patchProxyResultProxy.isSupported ? (cf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17911, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cf.class);
        if (patchProxyResultProxy.isSupported) {
            return (cf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_check_in_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109359a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17913, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
