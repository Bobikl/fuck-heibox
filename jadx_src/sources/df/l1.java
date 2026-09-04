package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityMaxRegisterOrLoginBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f112793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f112794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageButton f112796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final vc0 f112797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final sc0 f112798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final wc0 f112799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final uc0 f112800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final tc0 f112801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112805m;

    private l1(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 Button button, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 ImageButton imageButton, @androidx.annotation.n0 vc0 vc0Var, @androidx.annotation.n0 sc0 sc0Var, @androidx.annotation.n0 wc0 wc0Var, @androidx.annotation.n0 uc0 uc0Var, @androidx.annotation.n0 tc0 tc0Var, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ImageView imageView) {
        this.f112793a = frameLayout;
        this.f112794b = button;
        this.f112795c = frameLayout2;
        this.f112796d = imageButton;
        this.f112797e = vc0Var;
        this.f112798f = sc0Var;
        this.f112799g = wc0Var;
        this.f112800h = uc0Var;
        this.f112801i = tc0Var;
        this.f112802j = linearLayout;
        this.f112803k = frameLayout3;
        this.f112804l = textView;
        this.f112805m = imageView;
    }

    @androidx.annotation.n0
    public static l1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16492, new Class[]{View.class}, l1.class);
        if (patchProxyResultProxy.isSupported) {
            return (l1) patchProxyResultProxy.result;
        }
        int i10 = R.id.bt_login;
        Button button = (Button) l3.d.a(view, R.id.bt_login);
        if (button != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i10 = R.id.ib_icon_back;
            ImageButton imageButton = (ImageButton) l3.d.a(view, R.id.ib_icon_back);
            if (imageButton != null) {
                i10 = R.id.ll_2;
                View viewA = l3.d.a(view, R.id.ll_2);
                if (viewA != null) {
                    vc0 vc0VarA = vc0.a(viewA);
                    i10 = R.id.ll_3;
                    View viewA2 = l3.d.a(view, R.id.ll_3);
                    if (viewA2 != null) {
                        sc0 sc0VarA = sc0.a(viewA2);
                        i10 = R.id.ll_4;
                        View viewA3 = l3.d.a(view, R.id.ll_4);
                        if (viewA3 != null) {
                            wc0 wc0VarA = wc0.a(viewA3);
                            i10 = R.id.ll_7;
                            View viewA4 = l3.d.a(view, R.id.ll_7);
                            if (viewA4 != null) {
                                uc0 uc0VarA = uc0.a(viewA4);
                                i10 = R.id.ll_8;
                                View viewA5 = l3.d.a(view, R.id.ll_8);
                                if (viewA5 != null) {
                                    tc0 tc0VarA = tc0.a(viewA5);
                                    i10 = R.id.ll_btn;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_btn);
                                    if (linearLayout != null) {
                                        i10 = R.id.ll_btn_and_image;
                                        FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.ll_btn_and_image);
                                        if (frameLayout2 != null) {
                                            i10 = R.id.pass_login;
                                            TextView textView = (TextView) l3.d.a(view, R.id.pass_login);
                                            if (textView != null) {
                                                i10 = R.id.welcome_img;
                                                ImageView imageView = (ImageView) l3.d.a(view, R.id.welcome_img);
                                                if (imageView != null) {
                                                    return new l1(frameLayout, button, frameLayout, imageButton, vc0VarA, sc0VarA, wc0VarA, uc0VarA, tc0VarA, linearLayout, frameLayout2, textView, imageView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static l1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16490, new Class[]{LayoutInflater.class}, l1.class);
        return patchProxyResultProxy.isSupported ? (l1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16491, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l1.class);
        if (patchProxyResultProxy.isSupported) {
            return (l1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_max_register_or_login, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f112793a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16493, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
