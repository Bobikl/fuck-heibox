package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPubgR20mBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113772l;

    private n90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6) {
        this.f113761a = linearLayout;
        this.f113762b = recyclerView;
        this.f113763c = textView;
        this.f113764d = textView2;
        this.f113765e = textView3;
        this.f113766f = textView4;
        this.f113767g = relativeLayout;
        this.f113768h = linearLayout2;
        this.f113769i = linearLayout3;
        this.f113770j = linearLayout4;
        this.f113771k = linearLayout5;
        this.f113772l = linearLayout6;
    }

    @androidx.annotation.n0
    public static n90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21058, new Class[]{View.class}, n90.class);
        if (patchProxyResultProxy.isSupported) {
            return (n90) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_r20m;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_r20m);
        if (recyclerView != null) {
            i10 = R.id.tv_r20m_avg;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_r20m_avg);
            if (textView != null) {
                i10 = R.id.tv_r20m_dot;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_r20m_dot);
                if (textView2 != null) {
                    i10 = R.id.tv_r20m_kd;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_r20m_kd);
                    if (textView3 != null) {
                        i10 = R.id.tv_r20m_title;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_r20m_title);
                        if (textView4 != null) {
                            i10 = R.id.vg_r20m_header;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_r20m_header);
                            if (relativeLayout != null) {
                                i10 = R.id.vg_r20m_header_avg;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_r20m_header_avg);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_r20m_header_kd;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_r20m_header_kd);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.vg_r20m_style;
                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_r20m_style);
                                        if (linearLayout3 != null) {
                                            i10 = R.id.vg_r20m_style_tags;
                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_r20m_style_tags);
                                            if (linearLayout4 != null) {
                                                LinearLayout linearLayout5 = (LinearLayout) view;
                                                return new n90(linearLayout5, recyclerView, textView, textView2, textView3, textView4, relativeLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5);
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
    public static n90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21056, new Class[]{LayoutInflater.class}, n90.class);
        return patchProxyResultProxy.isSupported ? (n90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21057, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n90.class);
        if (patchProxyResultProxy.isSupported) {
            return (n90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_pubg_r20m, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113761a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21059, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
