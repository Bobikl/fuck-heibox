package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUserAwardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113583c;

    private n00(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView) {
        this.f113581a = linearLayout;
        this.f113582b = imageView;
        this.f113583c = textView;
    }

    @androidx.annotation.n0
    public static n00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20128, new Class[]{View.class}, n00.class);
        if (patchProxyResultProxy.isSupported) {
            return (n00) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
        if (imageView != null) {
            i10 = R.id.tv_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
            if (textView != null) {
                return new n00((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20126, new Class[]{LayoutInflater.class}, n00.class);
        return patchProxyResultProxy.isSupported ? (n00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20127, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n00.class);
        if (patchProxyResultProxy.isSupported) {
            return (n00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_award, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113581a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20129, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
