package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDacFavourBuffPreviewHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108966e;

    private bh(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f108962a = relativeLayout;
        this.f108963b = textView;
        this.f108964c = textView2;
        this.f108965d = textView3;
        this.f108966e = textView4;
    }

    @androidx.annotation.n0
    public static bh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18115, new Class[]{View.class}, bh.class);
        if (patchProxyResultProxy.isSupported) {
            return (bh) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_sort_match_count;
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
                        return new bh((RelativeLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static bh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18113, new Class[]{LayoutInflater.class}, bh.class);
        return patchProxyResultProxy.isSupported ? (bh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18114, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bh.class);
        if (patchProxyResultProxy.isSupported) {
            return (bh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dac_favour_buff_preview_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108962a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18116, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
