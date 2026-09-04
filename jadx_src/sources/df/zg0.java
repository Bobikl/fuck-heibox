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

/* JADX INFO: compiled from: ViewPsnGameItemTrophyBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118372f;

    private zg0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f118367a = linearLayout;
        this.f118368b = imageView;
        this.f118369c = textView;
        this.f118370d = textView2;
        this.f118371e = textView3;
        this.f118372f = textView4;
    }

    @androidx.annotation.n0
    public static zg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21822, new Class[]{View.class}, zg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_trophy_platinum;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_trophy_platinum);
        if (imageView != null) {
            i10 = R.id.tv_rank;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_rank);
            if (textView != null) {
                i10 = R.id.tv_trophy_bronze;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_trophy_bronze);
                if (textView2 != null) {
                    i10 = R.id.tv_trophy_gold;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_trophy_gold);
                    if (textView3 != null) {
                        i10 = R.id.tv_trophy_silver;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_trophy_silver);
                        if (textView4 != null) {
                            return new zg0((LinearLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static zg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21820, new Class[]{LayoutInflater.class}, zg0.class);
        return patchProxyResultProxy.isSupported ? (zg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21821, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_psn_game_item_trophy, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118367a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21823, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
