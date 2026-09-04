package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.PinEntryEditText;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBottomFragmentInputPayPwdBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f109599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final PinEntryEditText f109601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109605h;

    private d30(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 PinEntryEditText pinEntryEditText, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f109598a = relativeLayout;
        this.f109599b = constraintLayout;
        this.f109600c = imageView;
        this.f109601d = pinEntryEditText;
        this.f109602e = textView;
        this.f109603f = textView2;
        this.f109604g = textView3;
        this.f109605h = textView4;
    }

    @androidx.annotation.n0
    public static d30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20398, new Class[]{View.class}, d30.class);
        if (patchProxyResultProxy.isSupported) {
            return (d30) patchProxyResultProxy.result;
        }
        int i10 = R.id.cl_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_content);
        if (constraintLayout != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.pet_verification_code;
                PinEntryEditText pinEntryEditText = (PinEntryEditText) l3.d.a(view, R.id.pet_verification_code);
                if (pinEntryEditText != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView != null) {
                        i10 = R.id.tv_error_message;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_error_message);
                        if (textView2 != null) {
                            i10 = R.id.tv_forget_pwd;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_forget_pwd);
                            if (textView3 != null) {
                                i10 = R.id.tv_title;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title);
                                if (textView4 != null) {
                                    return new d30((RelativeLayout) view, constraintLayout, imageView, pinEntryEditText, textView, textView2, textView3, textView4);
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
    public static d30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20396, new Class[]{LayoutInflater.class}, d30.class);
        return patchProxyResultProxy.isSupported ? (d30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20397, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d30.class);
        if (patchProxyResultProxy.isSupported) {
            return (d30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottom_fragment_input_pay_pwd, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109598a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20399, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
