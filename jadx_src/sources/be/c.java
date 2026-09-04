package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletActivityMyHcashBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f35243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final EditText f35244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f35245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f35246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final RecyclerView f35247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f35248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f35249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f35250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final TextView f35251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final TextView f35252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final RelativeLayout f35253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final mb.f f35254l;

    private c(@n0 LinearLayout linearLayout, @n0 EditText editText, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 RecyclerView recyclerView, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 TextView textView5, @n0 RelativeLayout relativeLayout, @n0 mb.f fVar) {
        this.f35243a = linearLayout;
        this.f35244b = editText;
        this.f35245c = imageView;
        this.f35246d = imageView2;
        this.f35247e = recyclerView;
        this.f35248f = textView;
        this.f35249g = textView2;
        this.f35250h = textView3;
        this.f35251i = textView4;
        this.f35252j = textView5;
        this.f35253k = relativeLayout;
        this.f35254l = fVar;
    }

    @n0
    public static c a(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.f34358p4, new Class[]{View.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_hcash;
        EditText editText = (EditText) l3.d.a(view, i10);
        if (editText != null) {
            i10 = R.id.iv_avatar;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_h_rice;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.rv_price;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, i10);
                    if (recyclerView != null) {
                        i10 = R.id.tv_agreement;
                        TextView textView = (TextView) l3.d.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.tv_balance;
                            TextView textView2 = (TextView) l3.d.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.tv_confirm;
                                TextView textView3 = (TextView) l3.d.a(view, i10);
                                if (textView3 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView4 = (TextView) l3.d.a(view, i10);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_tips;
                                        TextView textView5 = (TextView) l3.d.a(view, i10);
                                        if (textView5 != null) {
                                            i10 = R.id.vg_custom_price;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                            if (relativeLayout != null && (viewA = l3.d.a(view, (i10 = R.id.vg_subtitle))) != null) {
                                                return new c((LinearLayout) view, editText, imageView, imageView2, recyclerView, textView, textView2, textView3, textView4, textView5, relativeLayout, mb.f.a(viewA));
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

    @n0
    public static c c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34312n4, new Class[]{LayoutInflater.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static c d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34335o4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_activity_my_hcash, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f35243a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34381q4, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
