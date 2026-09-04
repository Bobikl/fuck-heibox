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

/* JADX INFO: compiled from: ItemPlayerNormalHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dt implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f109873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109879h;

    private dt(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f109872a = relativeLayout;
        this.f109873b = oVar;
        this.f109874c = imageView;
        this.f109875d = imageView2;
        this.f109876e = textView;
        this.f109877f = textView2;
        this.f109878g = textView3;
        this.f109879h = textView4;
    }

    @androidx.annotation.n0
    public static dt a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19368, new Class[]{View.class}, dt.class);
        if (patchProxyResultProxy.isSupported) {
            return (dt) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_avatar;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
            if (imageView != null) {
                i10 = R.id.iv_more;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_more);
                if (imageView2 != null) {
                    i10 = R.id.tv_data_0;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_data_0);
                    if (textView != null) {
                        i10 = R.id.tv_data_1;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_data_1);
                        if (textView2 != null) {
                            i10 = R.id.tv_data_2;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_data_2);
                            if (textView3 != null) {
                                i10 = R.id.tv_name;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView4 != null) {
                                    return new dt((RelativeLayout) view, oVarA, imageView, imageView2, textView, textView2, textView3, textView4);
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
    public static dt c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19366, new Class[]{LayoutInflater.class}, dt.class);
        return patchProxyResultProxy.isSupported ? (dt) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dt d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19367, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dt.class);
        if (patchProxyResultProxy.isSupported) {
            return (dt) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_player_normal_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109872a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19369, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
