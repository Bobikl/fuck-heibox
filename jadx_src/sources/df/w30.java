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

/* JADX INFO: compiled from: LayoutDota2CalendarBubbleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117021e;

    private w30(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f117017a = linearLayout;
        this.f117018b = textView;
        this.f117019c = textView2;
        this.f117020d = textView3;
        this.f117021e = textView4;
    }

    @androidx.annotation.n0
    public static w30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20474, new Class[]{View.class}, w30.class);
        if (patchProxyResultProxy.isSupported) {
            return (w30) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_date;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_date);
        if (textView != null) {
            i10 = R.id.tv_lose;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_lose);
            if (textView2 != null) {
                i10 = R.id.tv_total;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_total);
                if (textView3 != null) {
                    i10 = R.id.tv_win;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_win);
                    if (textView4 != null) {
                        return new w30((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static w30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20472, new Class[]{LayoutInflater.class}, w30.class);
        return patchProxyResultProxy.isSupported ? (w30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20473, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w30.class);
        if (patchProxyResultProxy.isSupported) {
            return (w30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_dota2_calendar_bubble, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117017a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20475, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
