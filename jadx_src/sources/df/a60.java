package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameDanDatasBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108378e;

    private a60(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f108374a = linearLayout;
        this.f108375b = textView;
        this.f108376c = textView2;
        this.f108377d = textView3;
        this.f108378e = textView4;
    }

    @androidx.annotation.n0
    public static a60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20696, new Class[]{View.class}, a60.class);
        if (patchProxyResultProxy.isSupported) {
            return (a60) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_data0;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_data0);
        if (textView != null) {
            i10 = R.id.tv_data0_desc;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_data0_desc);
            if (textView2 != null) {
                i10 = R.id.tv_data1;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_data1);
                if (textView3 != null) {
                    i10 = R.id.tv_data1_desc;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_data1_desc);
                    if (textView4 != null) {
                        return new a60((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static a60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20694, new Class[]{LayoutInflater.class}, a60.class);
        return patchProxyResultProxy.isSupported ? (a60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20695, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a60.class);
        if (patchProxyResultProxy.isSupported) {
            return (a60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_dan_datas, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108374a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20697, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
