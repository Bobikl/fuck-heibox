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

/* JADX INFO: compiled from: ItemPlayerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class us implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f116506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116512h;

    private us(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116505a = relativeLayout;
        this.f116506b = oVar;
        this.f116507c = imageView;
        this.f116508d = imageView2;
        this.f116509e = imageView3;
        this.f116510f = textView;
        this.f116511g = textView2;
        this.f116512h = linearLayout;
    }

    @androidx.annotation.n0
    public static us a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19332, new Class[]{View.class}, us.class);
        if (patchProxyResultProxy.isSupported) {
            return (us) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_avatar;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
            if (imageView != null) {
                i10 = R.id.iv_data;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_data);
                if (imageView2 != null) {
                    i10 = R.id.iv_more;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_more);
                    if (imageView3 != null) {
                        i10 = R.id.tv_data;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_data);
                        if (textView != null) {
                            i10 = R.id.tv_name;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView2 != null) {
                                i10 = R.id.vg_data;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_data);
                                if (linearLayout != null) {
                                    return new us((RelativeLayout) view, oVarA, imageView, imageView2, imageView3, textView, textView2, linearLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static us c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19330, new Class[]{LayoutInflater.class}, us.class);
        return patchProxyResultProxy.isSupported ? (us) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static us d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19331, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, us.class);
        if (patchProxyResultProxy.isSupported) {
            return (us) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_player, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116505a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19333, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
