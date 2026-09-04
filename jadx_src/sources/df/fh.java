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

/* JADX INFO: compiled from: ItemDacFavourPlayerPreviewHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f110582f;

    private fh(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 mb.o oVar) {
        this.f110577a = relativeLayout;
        this.f110578b = imageView;
        this.f110579c = textView;
        this.f110580d = textView2;
        this.f110581e = textView3;
        this.f110582f = oVar;
    }

    @androidx.annotation.n0
    public static fh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18131, new Class[]{View.class}, fh.class);
        if (patchProxyResultProxy.isSupported) {
            return (fh) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.cell0);
        if (imageView != null) {
            i10 = R.id.cell1;
            TextView textView = (TextView) l3.d.a(view, R.id.cell1);
            if (textView != null) {
                i10 = R.id.cell2;
                TextView textView2 = (TextView) l3.d.a(view, R.id.cell2);
                if (textView2 != null) {
                    i10 = R.id.cell3;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.cell3);
                    if (textView3 != null) {
                        i10 = R.id.divider;
                        View viewA = l3.d.a(view, R.id.divider);
                        if (viewA != null) {
                            return new fh((RelativeLayout) view, imageView, textView, textView2, textView3, mb.o.a(viewA));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18129, new Class[]{LayoutInflater.class}, fh.class);
        return patchProxyResultProxy.isSupported ? (fh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18130, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fh.class);
        if (patchProxyResultProxy.isSupported) {
            return (fh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dac_favour_player_preview_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110577a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18132, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
