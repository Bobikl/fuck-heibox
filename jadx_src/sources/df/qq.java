package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMenuStoreBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114957g;

    private qq(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f114951a = relativeLayout;
        this.f114952b = imageView;
        this.f114953c = imageView2;
        this.f114954d = textView;
        this.f114955e = textView2;
        this.f114956f = textView3;
        this.f114957g = relativeLayout2;
    }

    @androidx.annotation.n0
    public static qq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19108, new Class[]{View.class}, qq.class);
        if (patchProxyResultProxy.isSupported) {
            return (qq) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_button_time;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_button_time);
        if (imageView != null) {
            i10 = R.id.iv_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView2 != null) {
                i10 = R.id.tv_badge;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_badge);
                if (textView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView2 != null) {
                        i10 = R.id.tv_tipsbox;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_tipsbox);
                        if (textView3 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            return new qq(relativeLayout, imageView, imageView2, textView, textView2, textView3, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static qq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19106, new Class[]{LayoutInflater.class}, qq.class);
        return patchProxyResultProxy.isSupported ? (qq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19107, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qq.class);
        if (patchProxyResultProxy.isSupported) {
            return (qq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_menu_store, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114951a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19109, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
