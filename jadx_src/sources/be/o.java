package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletItemHCoinHistoryBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f35374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final mb.o f35375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f35376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f35377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f35378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f35379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f35380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f35381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final LinearLayout f35382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final LinearLayout f35383j;

    private o(@n0 RelativeLayout relativeLayout, @n0 mb.o oVar, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2) {
        this.f35374a = relativeLayout;
        this.f35375b = oVar;
        this.f35376c = imageView;
        this.f35377d = imageView2;
        this.f35378e = textView;
        this.f35379f = textView2;
        this.f35380g = textView3;
        this.f35381h = textView4;
        this.f35382i = linearLayout;
        this.f35383j = linearLayout2;
    }

    @n0
    public static o a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.f34267l5, new Class[]{View.class}, o.class);
        if (patchProxyResultProxy.isSupported) {
            return (o) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, i10);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_refund_arrow;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_refund_way;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.tv_event_desc;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.tv_go_refund;
                        TextView textView2 = (TextView) l3.d.a(view, i10);
                        if (textView2 != null) {
                            i10 = R.id.tv_timestamp;
                            TextView textView3 = (TextView) l3.d.a(view, i10);
                            if (textView3 != null) {
                                i10 = R.id.tv_value;
                                TextView textView4 = (TextView) l3.d.a(view, i10);
                                if (textView4 != null) {
                                    i10 = R.id.vg_refund_info;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_value_detail;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                        if (linearLayout2 != null) {
                                            return new o((RelativeLayout) view, oVarA, imageView, imageView2, textView, textView2, textView3, textView4, linearLayout, linearLayout2);
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

    @n0
    public static o c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34221j5, new Class[]{LayoutInflater.class}, o.class);
        return patchProxyResultProxy.isSupported ? (o) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static o d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34244k5, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o.class);
        if (patchProxyResultProxy.isSupported) {
            return (o) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_item_h_coin_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f35374a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34290m5, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
