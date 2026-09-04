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

/* JADX INFO: compiled from: ItemDacFavourChessPreviewHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109802g;

    private dh(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f109796a = relativeLayout;
        this.f109797b = imageView;
        this.f109798c = relativeLayout2;
        this.f109799d = textView;
        this.f109800e = textView2;
        this.f109801f = textView3;
        this.f109802g = textView4;
    }

    @androidx.annotation.n0
    public static dh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18123, new Class[]{View.class}, dh.class);
        if (patchProxyResultProxy.isSupported) {
            return (dh) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.cell0);
        if (imageView != null) {
            i10 = R.id.cell1;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.cell1);
            if (relativeLayout != null) {
                i10 = R.id.tv_sort_match_count;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_sort_match_count);
                if (textView != null) {
                    i10 = R.id.tv_sort_pick_rate;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_sort_pick_rate);
                    if (textView2 != null) {
                        i10 = R.id.tv_sort_rank;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_sort_rank);
                        if (textView3 != null) {
                            i10 = R.id.tv_sort_win_rate;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_sort_win_rate);
                            if (textView4 != null) {
                                return new dh((RelativeLayout) view, imageView, relativeLayout, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static dh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18121, new Class[]{LayoutInflater.class}, dh.class);
        return patchProxyResultProxy.isSupported ? (dh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18122, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dh.class);
        if (patchProxyResultProxy.isSupported) {
            return (dh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dac_favour_chess_preview_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109796a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18124, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
