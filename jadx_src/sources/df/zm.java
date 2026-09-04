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

/* JADX INFO: compiled from: ItemGameRollEarnInfoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f118399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118405h;

    private zm(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f118398a = relativeLayout;
        this.f118399b = oVar;
        this.f118400c = imageView;
        this.f118401d = linearLayout;
        this.f118402e = relativeLayout2;
        this.f118403f = textView;
        this.f118404g = textView2;
        this.f118405h = linearLayout2;
    }

    @androidx.annotation.n0
    public static zm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18728, new Class[]{View.class}, zm.class);
        if (patchProxyResultProxy.isSupported) {
            return (zm) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_avatar;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
            if (imageView != null) {
                i10 = R.id.ll_win_items;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_win_items);
                if (linearLayout != null) {
                    i10 = R.id.rl_medal_level;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
                    if (relativeLayout != null) {
                        i10 = R.id.tv_name;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView != null) {
                            i10 = R.id.tv_roll_price_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_roll_price_desc);
                            if (textView2 != null) {
                                i10 = R.id.vg_title;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_title);
                                if (linearLayout2 != null) {
                                    return new zm((RelativeLayout) view, oVarA, imageView, linearLayout, relativeLayout, textView, textView2, linearLayout2);
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
    public static zm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18726, new Class[]{LayoutInflater.class}, zm.class);
        return patchProxyResultProxy.isSupported ? (zm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18727, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zm.class);
        if (patchProxyResultProxy.isSupported) {
            return (zm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_roll_earn_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118398a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18729, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
