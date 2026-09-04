package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFriendsTabBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114104e;

    private o50(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f114100a = relativeLayout;
        this.f114101b = imageView;
        this.f114102c = textView;
        this.f114103d = textView2;
        this.f114104e = linearLayout;
    }

    @androidx.annotation.n0
    public static o50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20648, new Class[]{View.class}, o50.class);
        if (patchProxyResultProxy.isSupported) {
            return (o50) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_red_point;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_red_point);
        if (imageView != null) {
            i10 = R.id.tv_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
            if (textView != null) {
                i10 = R.id.tv_online_num;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_online_num);
                if (textView2 != null) {
                    i10 = R.id.vg_online;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_online);
                    if (linearLayout != null) {
                        return new o50((RelativeLayout) view, imageView, textView, textView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static o50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20646, new Class[]{LayoutInflater.class}, o50.class);
        return patchProxyResultProxy.isSupported ? (o50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20647, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o50.class);
        if (patchProxyResultProxy.isSupported) {
            return (o50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_friends_tab, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114100a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20649, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
