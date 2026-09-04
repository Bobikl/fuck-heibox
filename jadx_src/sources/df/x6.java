package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogTradeWechatBindBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117400g;

    private x6(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f117394a = linearLayout;
        this.f117395b = textView;
        this.f117396c = textView2;
        this.f117397d = textView3;
        this.f117398e = textView4;
        this.f117399f = relativeLayout;
        this.f117400g = relativeLayout2;
    }

    @androidx.annotation.n0
    public static x6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17060, new Class[]{View.class}, x6.class);
        if (patchProxyResultProxy.isSupported) {
            return (x6) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_code_copy;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_code_copy);
        if (textView != null) {
            i10 = R.id.tv_dynamic_code;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_dynamic_code);
            if (textView2 != null) {
                i10 = R.id.tv_id_copy;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_id_copy);
                if (textView3 != null) {
                    i10 = R.id.tv_number_id;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_number_id);
                    if (textView4 != null) {
                        i10 = R.id.vg_code;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_code);
                        if (relativeLayout != null) {
                            i10 = R.id.vg_id;
                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_id);
                            if (relativeLayout2 != null) {
                                return new x6((LinearLayout) view, textView, textView2, textView3, textView4, relativeLayout, relativeLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static x6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17058, new Class[]{LayoutInflater.class}, x6.class);
        return patchProxyResultProxy.isSupported ? (x6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17059, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x6.class);
        if (patchProxyResultProxy.isSupported) {
            return (x6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_trade_wechat_bind, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117394a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17061, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
