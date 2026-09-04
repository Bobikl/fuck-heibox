package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentCreateHashtagBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f115871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115877g;

    private t7(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f115871a = frameLayout;
        this.f115872b = editText;
        this.f115873c = textView;
        this.f115874d = textView2;
        this.f115875e = textView3;
        this.f115876f = linearLayout;
        this.f115877g = relativeLayout;
    }

    @androidx.annotation.n0
    public static t7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17148, new Class[]{View.class}, t7.class);
        if (patchProxyResultProxy.isSupported) {
            return (t7) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_hashtag;
        EditText editText = (EditText) l3.d.a(view, R.id.et_hashtag);
        if (editText != null) {
            i10 = R.id.tv_cancel;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_cancel);
            if (textView != null) {
                i10 = R.id.tv_confirm;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_confirm);
                if (textView2 != null) {
                    i10 = R.id.tv_count;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_count);
                    if (textView3 != null) {
                        i10 = R.id.vg_content;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                        if (linearLayout != null) {
                            i10 = R.id.vg_edit;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_edit);
                            if (relativeLayout != null) {
                                return new t7((FrameLayout) view, editText, textView, textView2, textView3, linearLayout, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static t7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17146, new Class[]{LayoutInflater.class}, t7.class);
        return patchProxyResultProxy.isSupported ? (t7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17147, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t7.class);
        if (patchProxyResultProxy.isSupported) {
            return (t7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_create_hashtag, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f115871a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17149, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
