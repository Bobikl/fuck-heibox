package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPubgStatsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ju implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112292f;

    private ju(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f112287a = linearLayout;
        this.f112288b = imageView;
        this.f112289c = recyclerView;
        this.f112290d = textView;
        this.f112291e = textView2;
        this.f112292f = textView3;
    }

    @androidx.annotation.n0
    public static ju a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19492, new Class[]{View.class}, ju.class);
        if (patchProxyResultProxy.isSupported) {
            return (ju) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.rv_data;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_data);
            if (recyclerView != null) {
                i10 = R.id.tv_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                if (textView != null) {
                    i10 = R.id.tv_score;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_score);
                    if (textView2 != null) {
                        i10 = R.id.tv_score_desc;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_score_desc);
                        if (textView3 != null) {
                            return new ju((LinearLayout) view, imageView, recyclerView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ju c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19490, new Class[]{LayoutInflater.class}, ju.class);
        return patchProxyResultProxy.isSupported ? (ju) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ju d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19491, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ju.class);
        if (patchProxyResultProxy.isSupported) {
            return (ju) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_pubg_stats, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112287a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19493, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
