package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.AvatarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityUpdateAccountBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AvatarView f118142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f118143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f118144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f118145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118165y;

    private z2(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 AvatarView avatarView, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 EditText editText3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5, @androidx.annotation.n0 RelativeLayout relativeLayout6, @androidx.annotation.n0 RelativeLayout relativeLayout7, @androidx.annotation.n0 RelativeLayout relativeLayout8, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12) {
        this.f118141a = linearLayout;
        this.f118142b = avatarView;
        this.f118143c = editText;
        this.f118144d = editText2;
        this.f118145e = editText3;
        this.f118146f = relativeLayout;
        this.f118147g = relativeLayout2;
        this.f118148h = relativeLayout3;
        this.f118149i = relativeLayout4;
        this.f118150j = relativeLayout5;
        this.f118151k = relativeLayout6;
        this.f118152l = relativeLayout7;
        this.f118153m = relativeLayout8;
        this.f118154n = textView;
        this.f118155o = textView2;
        this.f118156p = textView3;
        this.f118157q = textView4;
        this.f118158r = textView5;
        this.f118159s = textView6;
        this.f118160t = textView7;
        this.f118161u = textView8;
        this.f118162v = textView9;
        this.f118163w = textView10;
        this.f118164x = textView11;
        this.f118165y = textView12;
    }

    @androidx.annotation.n0
    public static z2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16652, new Class[]{View.class}, z2.class);
        if (patchProxyResultProxy.isSupported) {
            return (z2) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar_view;
        AvatarView avatarView = (AvatarView) l3.d.a(view, R.id.avatar_view);
        if (avatarView != null) {
            i10 = R.id.et_email;
            EditText editText = (EditText) l3.d.a(view, R.id.et_email);
            if (editText != null) {
                i10 = R.id.et_nick;
                EditText editText2 = (EditText) l3.d.a(view, R.id.et_nick);
                if (editText2 != null) {
                    i10 = R.id.et_signature;
                    EditText editText3 = (EditText) l3.d.a(view, R.id.et_signature);
                    if (editText3 != null) {
                        i10 = R.id.rl_set_birthday;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_set_birthday);
                        if (relativeLayout != null) {
                            i10 = R.id.rl_set_career;
                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.rl_set_career);
                            if (relativeLayout2 != null) {
                                i10 = R.id.rl_set_education;
                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.rl_set_education);
                                if (relativeLayout3 != null) {
                                    i10 = R.id.rl_set_email;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.rl_set_email);
                                    if (relativeLayout4 != null) {
                                        i10 = R.id.rl_set_gender;
                                        RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, R.id.rl_set_gender);
                                        if (relativeLayout5 != null) {
                                            i10 = R.id.rl_set_icon;
                                            RelativeLayout relativeLayout6 = (RelativeLayout) l3.d.a(view, R.id.rl_set_icon);
                                            if (relativeLayout6 != null) {
                                                i10 = R.id.rl_set_nick;
                                                RelativeLayout relativeLayout7 = (RelativeLayout) l3.d.a(view, R.id.rl_set_nick);
                                                if (relativeLayout7 != null) {
                                                    i10 = R.id.rl_set_signature;
                                                    RelativeLayout relativeLayout8 = (RelativeLayout) l3.d.a(view, R.id.rl_set_signature);
                                                    if (relativeLayout8 != null) {
                                                        i10 = R.id.tv_birthday;
                                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_birthday);
                                                        if (textView != null) {
                                                            i10 = R.id.tv_career;
                                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_career);
                                                            if (textView2 != null) {
                                                                i10 = R.id.tv_education;
                                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_education);
                                                                if (textView3 != null) {
                                                                    i10 = R.id.tv_gender;
                                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_gender);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.tv_my_avatar;
                                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_my_avatar);
                                                                        if (textView5 != null) {
                                                                            i10 = R.id.tv_set_birthday;
                                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_set_birthday);
                                                                            if (textView6 != null) {
                                                                                i10 = R.id.tv_set_education;
                                                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_set_education);
                                                                                if (textView7 != null) {
                                                                                    i10 = R.id.tv_set_email;
                                                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_set_email);
                                                                                    if (textView8 != null) {
                                                                                        i10 = R.id.tv_set_gender;
                                                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_set_gender);
                                                                                        if (textView9 != null) {
                                                                                            i10 = R.id.tv_set_name;
                                                                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_set_name);
                                                                                            if (textView10 != null) {
                                                                                                i10 = R.id.tv_set_profession;
                                                                                                TextView textView11 = (TextView) l3.d.a(view, R.id.tv_set_profession);
                                                                                                if (textView11 != null) {
                                                                                                    i10 = R.id.tv_set_signature;
                                                                                                    TextView textView12 = (TextView) l3.d.a(view, R.id.tv_set_signature);
                                                                                                    if (textView12 != null) {
                                                                                                        return new z2((LinearLayout) view, avatarView, editText, editText2, editText3, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, relativeLayout8, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
    public static z2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16650, new Class[]{LayoutInflater.class}, z2.class);
        return patchProxyResultProxy.isSupported ? (z2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16651, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z2.class);
        if (patchProxyResultProxy.isSupported) {
            return (z2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_update_account, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118141a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16653, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
