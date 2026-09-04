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

/* JADX INFO: compiled from: ItemRecommendedHashtagBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111535c;

    private hw(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView) {
        this.f111533a = constraintLayout;
        this.f111534b = imageView;
        this.f111535c = textView;
    }

    @androidx.annotation.n0
    public static hw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19692, new Class[]{View.class}, hw.class);
        if (patchProxyResultProxy.isSupported) {
            return (hw) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_hashtag_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_hashtag_icon);
        if (imageView != null) {
            i10 = R.id.tv_hashtag_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_hashtag_name);
            if (textView != null) {
                return new hw((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static hw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19690, new Class[]{LayoutInflater.class}, hw.class);
        return patchProxyResultProxy.isSupported ? (hw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19691, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hw.class);
        if (patchProxyResultProxy.isSupported) {
            return (hw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommended_hashtag, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111533a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19693, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
