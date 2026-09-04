package xc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hblogistics.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HblogisticsActivityAddAddressBinding.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f141183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final EditText f141184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final EditText f141185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final EditText f141186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final Switch f141187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f141188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f141189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f141190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final LinearLayout f141191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final RelativeLayout f141192j;

    private a(@n0 RelativeLayout relativeLayout, @n0 EditText editText, @n0 EditText editText2, @n0 EditText editText3, @n0 Switch r10, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 LinearLayout linearLayout, @n0 RelativeLayout relativeLayout2) {
        this.f141183a = relativeLayout;
        this.f141184b = editText;
        this.f141185c = editText2;
        this.f141186d = editText3;
        this.f141187e = r10;
        this.f141188f = textView;
        this.f141189g = textView2;
        this.f141190h = textView3;
        this.f141191i = linearLayout;
        this.f141192j = relativeLayout2;
    }

    @n0
    public static a a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.Nh, new Class[]{View.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_receiver_exact_address;
        EditText editText = (EditText) l3.d.a(view, i10);
        if (editText != null) {
            i10 = R.id.et_receiver_name;
            EditText editText2 = (EditText) l3.d.a(view, i10);
            if (editText2 != null) {
                i10 = R.id.et_receiver_phone_number;
                EditText editText3 = (EditText) l3.d.a(view, i10);
                if (editText3 != null) {
                    i10 = R.id.sb_as_default_address;
                    Switch r10 = (Switch) l3.d.a(view, i10);
                    if (r10 != null) {
                        i10 = R.id.tv_as_default_address;
                        TextView textView = (TextView) l3.d.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.tv_confirm;
                            TextView textView2 = (TextView) l3.d.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.tv_receiver_region;
                                TextView textView3 = (TextView) l3.d.a(view, i10);
                                if (textView3 != null) {
                                    i10 = R.id.vg_bottom_bar;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_progress;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                        if (relativeLayout != null) {
                                            return new a((RelativeLayout) view, editText, editText2, editText3, r10, textView, textView2, textView3, linearLayout, relativeLayout);
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
    public static a c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.g.Lh, new Class[]{LayoutInflater.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static a d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.Mh, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hblogistics_activity_add_address, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f141183a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Oh, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
