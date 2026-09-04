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

/* JADX INFO: compiled from: ItemDacFollowMatchesPreviewHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f111448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111450j;

    private hh(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view) {
        this.f111441a = relativeLayout;
        this.f111442b = relativeLayout2;
        this.f111443c = imageView;
        this.f111444d = textView;
        this.f111445e = textView2;
        this.f111446f = textView3;
        this.f111447g = textView4;
        this.f111448h = oVar;
        this.f111449i = textView5;
        this.f111450j = view;
    }

    @androidx.annotation.n0
    public static hh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18139, new Class[]{View.class}, hh.class);
        if (patchProxyResultProxy.isSupported) {
            return (hh) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.cell0);
        if (relativeLayout != null) {
            i10 = R.id.cell1;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.cell1);
            if (imageView != null) {
                i10 = R.id.cell2;
                TextView textView = (TextView) l3.d.a(view, R.id.cell2);
                if (textView != null) {
                    i10 = R.id.cell3;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.cell3);
                    if (textView2 != null) {
                        i10 = R.id.cell4;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.cell4);
                        if (textView3 != null) {
                            i10 = R.id.cell5;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.cell5);
                            if (textView4 != null) {
                                i10 = R.id.divider;
                                View viewA = l3.d.a(view, R.id.divider);
                                if (viewA != null) {
                                    mb.o oVarA = mb.o.a(viewA);
                                    i10 = R.id.tv_rank;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_rank);
                                    if (textView5 != null) {
                                        i10 = R.id.view_rank_highlight;
                                        View viewA2 = l3.d.a(view, R.id.view_rank_highlight);
                                        if (viewA2 != null) {
                                            return new hh((RelativeLayout) view, relativeLayout, imageView, textView, textView2, textView3, textView4, oVarA, textView5, viewA2);
                                        }
                                    }
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
    public static hh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18137, new Class[]{LayoutInflater.class}, hh.class);
        return patchProxyResultProxy.isSupported ? (hh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18138, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hh.class);
        if (patchProxyResultProxy.isSupported) {
            return (hh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dac_follow_matches_preview_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111441a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18140, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
