package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MaxIncludeFindpwdTwoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class uc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f116379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f116380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f116381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116385i;

    private uc0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 Button button, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f116377a = relativeLayout;
        this.f116378b = linearLayout;
        this.f116379c = editText;
        this.f116380d = button;
        this.f116381e = editText2;
        this.f116382f = imageView;
        this.f116383g = relativeLayout2;
        this.f116384h = textView;
        this.f116385i = textView2;
    }

    @androidx.annotation.n0
    public static uc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21393, new Class[]{View.class}, uc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (uc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.activePart;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.activePart);
        if (linearLayout != null) {
            i10 = R.id.bt_achieve_code;
            EditText editText = (EditText) l3.d.a(view, R.id.bt_achieve_code);
            if (editText != null) {
                i10 = R.id.bt_check_code;
                Button button = (Button) l3.d.a(view, R.id.bt_check_code);
                if (button != null) {
                    i10 = R.id.et_code;
                    EditText editText2 = (EditText) l3.d.a(view, R.id.et_code);
                    if (editText2 != null) {
                        i10 = R.id.remove_code;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.remove_code);
                        if (imageView != null) {
                            i10 = R.id.rl_code;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_code);
                            if (relativeLayout != null) {
                                i10 = R.id.tv_no_code;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_no_code);
                                if (textView != null) {
                                    i10 = R.id.tv_send_number;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_send_number);
                                    if (textView2 != null) {
                                        return new uc0((RelativeLayout) view, linearLayout, editText, button, editText2, imageView, relativeLayout, textView, textView2);
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
    public static uc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21391, new Class[]{LayoutInflater.class}, uc0.class);
        return patchProxyResultProxy.isSupported ? (uc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static uc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21392, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, uc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (uc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.max_include_findpwd_two, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116377a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21394, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
