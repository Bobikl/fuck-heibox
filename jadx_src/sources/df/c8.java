package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentDialogMobLoginBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BaseBottomButton f109207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f109208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109218m;

    private c8(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 BaseBottomButton baseBottomButton, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f109206a = constraintLayout;
        this.f109207b = baseBottomButton;
        this.f109208c = checkBox;
        this.f109209d = imageView;
        this.f109210e = imageView2;
        this.f109211f = textView;
        this.f109212g = textView2;
        this.f109213h = textView3;
        this.f109214i = textView4;
        this.f109215j = textView5;
        this.f109216k = frameLayout;
        this.f109217l = linearLayout;
        this.f109218m = frameLayout2;
    }

    @androidx.annotation.n0
    public static c8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17184, new Class[]{View.class}, c8.class);
        if (patchProxyResultProxy.isSupported) {
            return (c8) patchProxyResultProxy.result;
        }
        int i10 = R.id.button_login;
        BaseBottomButton baseBottomButton = (BaseBottomButton) l3.d.a(view, R.id.button_login);
        if (baseBottomButton != null) {
            i10 = R.id.cb_privacy;
            CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_privacy);
            if (checkBox != null) {
                i10 = R.id.iv_bottom_logo;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bottom_logo);
                if (imageView != null) {
                    i10 = R.id.iv_close;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_close);
                    if (imageView2 != null) {
                        i10 = R.id.tv_login_by_other_phone;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_login_by_other_phone);
                        if (textView != null) {
                            i10 = R.id.tv_number;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_number);
                            if (textView2 != null) {
                                i10 = R.id.tv_operator;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_operator);
                                if (textView3 != null) {
                                    i10 = R.id.tv_privacy;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_privacy);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_wechat_login;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_wechat_login);
                                        if (textView5 != null) {
                                            i10 = R.id.vg_bg;
                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg);
                                            if (frameLayout != null) {
                                                i10 = R.id.vg_privacy;
                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_privacy);
                                                if (linearLayout != null) {
                                                    i10 = R.id.vg_privacy_check;
                                                    FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_privacy_check);
                                                    if (frameLayout2 != null) {
                                                        return new c8((ConstraintLayout) view, baseBottomButton, checkBox, imageView, imageView2, textView, textView2, textView3, textView4, textView5, frameLayout, linearLayout, frameLayout2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static c8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17182, new Class[]{LayoutInflater.class}, c8.class);
        return patchProxyResultProxy.isSupported ? (c8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17183, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c8.class);
        if (patchProxyResultProxy.isSupported) {
            return (c8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_mob_login, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109206a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17185, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
