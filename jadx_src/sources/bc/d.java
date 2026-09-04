package bc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbcustomviewLayoutRadarLabelBinding.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f35200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final TextView f35201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f35202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final GradientTextView f35203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final GradientTextView f35204e;

    private d(@n0 LinearLayout linearLayout, @n0 TextView textView, @n0 TextView textView2, @n0 GradientTextView gradientTextView, @n0 GradientTextView gradientTextView2) {
        this.f35200a = linearLayout;
        this.f35201b = textView;
        this.f35202c = textView2;
        this.f35203d = gradientTextView;
        this.f35204e = gradientTextView2;
    }

    @n0
    public static d a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.f.Ji, new Class[]{View.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_desc;
        TextView textView = (TextView) l3.d.a(view, i10);
        if (textView != null) {
            i10 = R.id.tv_div;
            TextView textView2 = (TextView) l3.d.a(view, i10);
            if (textView2 != null) {
                i10 = R.id.tv_value;
                GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, i10);
                if (gradientTextView != null) {
                    i10 = R.id.tv_value2;
                    GradientTextView gradientTextView2 = (GradientTextView) l3.d.a(view, i10);
                    if (gradientTextView2 != null) {
                        return new d((LinearLayout) view, textView, textView2, gradientTextView, gradientTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static d c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.f.Hi, new Class[]{LayoutInflater.class}, d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static d d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.f.Ii, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbcustomview_layout_radar_label, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f35200a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ki, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
