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

/* JADX INFO: compiled from: ItemProfileBadgeWearBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ut implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final f20 f116514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116518f;

    private ut(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 f20 f20Var, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f116513a = relativeLayout;
        this.f116514b = f20Var;
        this.f116515c = imageView;
        this.f116516d = imageView2;
        this.f116517e = textView;
        this.f116518f = textView2;
    }

    @androidx.annotation.n0
    public static ut a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19432, new Class[]{View.class}, ut.class);
        if (patchProxyResultProxy.isSupported) {
            return (ut) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            f20 f20VarA = f20.a(viewA);
            i10 = R.id.iv_arrow;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
            if (imageView != null) {
                i10 = R.id.iv_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
                if (imageView2 != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView != null) {
                        i10 = R.id.tv_name;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView2 != null) {
                            return new ut((RelativeLayout) view, f20VarA, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ut c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19430, new Class[]{LayoutInflater.class}, ut.class);
        return patchProxyResultProxy.isSupported ? (ut) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ut d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19431, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ut.class);
        if (patchProxyResultProxy.isSupported) {
            return (ut) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_profile_badge_wear, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116513a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19433, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
