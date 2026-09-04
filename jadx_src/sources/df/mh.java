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

/* JADX INFO: compiled from: ItemDacMatchPreviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f113464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113470k;

    private mh(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view) {
        this.f113460a = relativeLayout;
        this.f113461b = relativeLayout2;
        this.f113462c = linearLayout;
        this.f113463d = linearLayout2;
        this.f113464e = oVar;
        this.f113465f = imageView;
        this.f113466g = imageView2;
        this.f113467h = textView;
        this.f113468i = textView2;
        this.f113469j = textView3;
        this.f113470k = view;
    }

    @androidx.annotation.n0
    public static mh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18159, new Class[]{View.class}, mh.class);
        if (patchProxyResultProxy.isSupported) {
            return (mh) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.cell0);
        if (relativeLayout != null) {
            i10 = R.id.cell1;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.cell1);
            if (linearLayout != null) {
                i10 = R.id.cell2;
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.cell2);
                if (linearLayout2 != null) {
                    i10 = R.id.divider;
                    View viewA = l3.d.a(view, R.id.divider);
                    if (viewA != null) {
                        mb.o oVarA = mb.o.a(viewA);
                        i10 = R.id.iv_level_img;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_level_img);
                        if (imageView != null) {
                            i10 = R.id.iv_more;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_more);
                            if (imageView2 != null) {
                                i10 = R.id.tv_level;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_level);
                                if (textView != null) {
                                    i10 = R.id.tv_match_time;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_match_time);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_rank;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_rank);
                                        if (textView3 != null) {
                                            i10 = R.id.view_rank_highlight;
                                            View viewA2 = l3.d.a(view, R.id.view_rank_highlight);
                                            if (viewA2 != null) {
                                                return new mh((RelativeLayout) view, relativeLayout, linearLayout, linearLayout2, oVarA, imageView, imageView2, textView, textView2, textView3, viewA2);
                                            }
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
    public static mh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18157, new Class[]{LayoutInflater.class}, mh.class);
        return patchProxyResultProxy.isSupported ? (mh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18158, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mh.class);
        if (patchProxyResultProxy.isSupported) {
            return (mh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dac_match_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113460a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18160, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
