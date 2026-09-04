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

/* JADX INFO: compiled from: ItemDacFavourPlayerPreviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class eh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f110202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110204h;

    private eh(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView3) {
        this.f110197a = relativeLayout;
        this.f110198b = imageView;
        this.f110199c = textView;
        this.f110200d = linearLayout;
        this.f110201e = textView2;
        this.f110202f = oVar;
        this.f110203g = imageView2;
        this.f110204h = textView3;
    }

    @androidx.annotation.n0
    public static eh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18127, new Class[]{View.class}, eh.class);
        if (patchProxyResultProxy.isSupported) {
            return (eh) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.cell0);
        if (imageView != null) {
            i10 = R.id.cell1;
            TextView textView = (TextView) l3.d.a(view, R.id.cell1);
            if (textView != null) {
                i10 = R.id.cell2;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.cell2);
                if (linearLayout != null) {
                    i10 = R.id.cell3;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.cell3);
                    if (textView2 != null) {
                        i10 = R.id.divider;
                        View viewA = l3.d.a(view, R.id.divider);
                        if (viewA != null) {
                            mb.o oVarA = mb.o.a(viewA);
                            i10 = R.id.iv_level_img;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_level_img);
                            if (imageView2 != null) {
                                i10 = R.id.tv_level_desc;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_level_desc);
                                if (textView3 != null) {
                                    return new eh((RelativeLayout) view, imageView, textView, linearLayout, textView2, oVarA, imageView2, textView3);
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
    public static eh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18125, new Class[]{LayoutInflater.class}, eh.class);
        return patchProxyResultProxy.isSupported ? (eh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static eh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18126, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, eh.class);
        if (patchProxyResultProxy.isSupported) {
            return (eh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dac_favour_player_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110197a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18128, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
