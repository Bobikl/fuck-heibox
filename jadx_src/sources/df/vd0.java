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

/* JADX INFO: compiled from: VideoActionFollowBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116824e;

    private vd0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f116820a = linearLayout;
        this.f116821b = imageView;
        this.f116822c = imageView2;
        this.f116823d = textView;
        this.f116824e = linearLayout2;
    }

    @androidx.annotation.n0
    public static vd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21500, new Class[]{View.class}, vd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vd0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_author;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_author);
        if (imageView != null) {
            i10 = R.id.iv_author_plus;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_author_plus);
            if (imageView2 != null) {
                i10 = R.id.tv_author_action;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_author_action);
                if (textView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new vd0(linearLayout, imageView, imageView2, textView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21498, new Class[]{LayoutInflater.class}, vd0.class);
        return patchProxyResultProxy.isSupported ? (vd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21499, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.video_action_follow, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116820a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21501, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
