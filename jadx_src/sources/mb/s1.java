package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewQuestionBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class s1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f131752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131757i;

    private s1(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f131749a = linearLayout;
        this.f131750b = imageView;
        this.f131751c = imageView2;
        this.f131752d = radioGroup;
        this.f131753e = textView;
        this.f131754f = textView2;
        this.f131755g = textView3;
        this.f131756h = linearLayout2;
        this.f131757i = linearLayout3;
    }

    @androidx.annotation.n0
    public static s1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.Pa, new Class[]{View.class}, s1.class);
        if (patchProxyResultProxy.isSupported) {
            return (s1) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_next;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_static_question;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.rg_options;
                RadioGroup radioGroup = (RadioGroup) l3.d.a(view, i10);
                if (radioGroup != null) {
                    i10 = R.id.tv_next_question;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.tv_question_progress;
                        TextView textView2 = (TextView) l3.d.a(view, i10);
                        if (textView2 != null) {
                            i10 = R.id.tv_question_title;
                            TextView textView3 = (TextView) l3.d.a(view, i10);
                            if (textView3 != null) {
                                i10 = R.id.vg_next_question;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_pre_question;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                    if (linearLayout2 != null) {
                                        return new s1((LinearLayout) view, imageView, imageView2, radioGroup, textView, textView2, textView3, linearLayout, linearLayout2);
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
    public static s1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.Na, new Class[]{LayoutInflater.class}, s1.class);
        return patchProxyResultProxy.isSupported ? (s1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.Oa, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s1.class);
        if (patchProxyResultProxy.isSupported) {
            return (s1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_question, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131749a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Qa, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
