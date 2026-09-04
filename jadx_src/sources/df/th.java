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

/* JADX INFO: compiled from: ItemDestiny2PlayerHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class th implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116011g;

    private th(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f116005a = linearLayout;
        this.f116006b = imageView;
        this.f116007c = textView;
        this.f116008d = textView2;
        this.f116009e = textView3;
        this.f116010f = textView4;
        this.f116011g = textView5;
    }

    @androidx.annotation.n0
    public static th a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18187, new Class[]{View.class}, th.class);
        if (patchProxyResultProxy.isSupported) {
            return (th) patchProxyResultProxy.result;
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
                        i10 = R.id.cell4;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.cell4);
                        if (textView4 != null) {
                            i10 = R.id.cell5;
                            TextView textView5 = (TextView) l3.d.a(view, R.id.cell5);
                            if (textView5 != null) {
                                return new th((LinearLayout) view, imageView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static th c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18185, new Class[]{LayoutInflater.class}, th.class);
        return patchProxyResultProxy.isSupported ? (th) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static th d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18186, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, th.class);
        if (patchProxyResultProxy.isSupported) {
            return (th) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_destiny2_player_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116005a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18188, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
