package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDacFavourBuffPreviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ah implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f108567g;

    private ah(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 mb.o oVar) {
        this.f108561a = relativeLayout;
        this.f108562b = linearLayout;
        this.f108563c = textView;
        this.f108564d = textView2;
        this.f108565e = textView3;
        this.f108566f = textView4;
        this.f108567g = oVar;
    }

    @androidx.annotation.n0
    public static ah a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18111, new Class[]{View.class}, ah.class);
        if (patchProxyResultProxy.isSupported) {
            return (ah) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.cell0);
        if (linearLayout != null) {
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
                            i10 = R.id.divider;
                            View viewA = l3.d.a(view, R.id.divider);
                            if (viewA != null) {
                                return new ah((RelativeLayout) view, linearLayout, textView, textView2, textView3, textView4, mb.o.a(viewA));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ah c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18109, new Class[]{LayoutInflater.class}, ah.class);
        return patchProxyResultProxy.isSupported ? (ah) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ah d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18110, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ah.class);
        if (patchProxyResultProxy.isSupported) {
            return (ah) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dac_favour_buff_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108561a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18112, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
