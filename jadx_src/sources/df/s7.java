package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentConsoleGameLangBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f115492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115494j;

    private s7(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f115485a = relativeLayout;
        this.f115486b = textView;
        this.f115487c = textView2;
        this.f115488d = textView3;
        this.f115489e = textView4;
        this.f115490f = textView5;
        this.f115491g = imageView;
        this.f115492h = progressBar;
        this.f115493i = recyclerView;
        this.f115494j = linearLayout;
    }

    @androidx.annotation.n0
    public static s7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17144, new Class[]{View.class}, s7.class);
        if (patchProxyResultProxy.isSupported) {
            return (s7) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        TextView textView = (TextView) l3.d.a(view, R.id.cell0);
        if (textView != null) {
            i10 = R.id.cell1;
            TextView textView2 = (TextView) l3.d.a(view, R.id.cell1);
            if (textView2 != null) {
                i10 = R.id.cell2;
                TextView textView3 = (TextView) l3.d.a(view, R.id.cell2);
                if (textView3 != null) {
                    i10 = R.id.cell3;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.cell3);
                    if (textView4 != null) {
                        i10 = R.id.cell4;
                        TextView textView5 = (TextView) l3.d.a(view, R.id.cell4);
                        if (textView5 != null) {
                            i10 = R.id.iv_window_close;
                            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_window_close);
                            if (imageView != null) {
                                i10 = R.id.progress;
                                ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
                                if (progressBar != null) {
                                    i10 = R.id.rv_list;
                                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_list);
                                    if (recyclerView != null) {
                                        i10 = R.id.vg_content;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                                        if (linearLayout != null) {
                                            return new s7((RelativeLayout) view, textView, textView2, textView3, textView4, textView5, imageView, progressBar, recyclerView, linearLayout);
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
    public static s7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17142, new Class[]{LayoutInflater.class}, s7.class);
        return patchProxyResultProxy.isSupported ? (s7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17143, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s7.class);
        if (patchProxyResultProxy.isSupported) {
            return (s7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_console_game_lang, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115485a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17145, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
