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

/* JADX INFO: compiled from: ItemSearchPlayer2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sx implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f115720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115724f;

    private sx(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f115719a = relativeLayout;
        this.f115720b = oVar;
        this.f115721c = imageView;
        this.f115722d = textView;
        this.f115723e = textView2;
        this.f115724f = textView3;
    }

    @androidx.annotation.n0
    public static sx a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19840, new Class[]{View.class}, sx.class);
        if (patchProxyResultProxy.isSupported) {
            return (sx) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_more;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_more);
            if (imageView != null) {
                i10 = R.id.tv_data_0;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_data_0);
                if (textView != null) {
                    i10 = R.id.tv_data_1;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_data_1);
                    if (textView2 != null) {
                        i10 = R.id.tv_name;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView3 != null) {
                            return new sx((RelativeLayout) view, oVarA, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static sx c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19838, new Class[]{LayoutInflater.class}, sx.class);
        return patchProxyResultProxy.isSupported ? (sx) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sx d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19839, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sx.class);
        if (patchProxyResultProxy.isSupported) {
            return (sx) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_player_2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115719a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19841, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
