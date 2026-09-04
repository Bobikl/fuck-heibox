package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityAccountManagerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108673o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f108675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108676r;

    private b(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 SettingItemView settingItemView, @androidx.annotation.n0 SettingItemView settingItemView2, @androidx.annotation.n0 SettingItemView settingItemView3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 SettingItemView settingItemView4, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 SettingItemView settingItemView5, @androidx.annotation.n0 CardView cardView2) {
        this.f108659a = relativeLayout;
        this.f108660b = cardView;
        this.f108661c = textView;
        this.f108662d = textView2;
        this.f108663e = textView3;
        this.f108664f = textView4;
        this.f108665g = textView5;
        this.f108666h = textView6;
        this.f108667i = textView7;
        this.f108668j = settingItemView;
        this.f108669k = settingItemView2;
        this.f108670l = settingItemView3;
        this.f108671m = relativeLayout2;
        this.f108672n = settingItemView4;
        this.f108673o = relativeLayout3;
        this.f108674p = relativeLayout4;
        this.f108675q = settingItemView5;
        this.f108676r = cardView2;
    }

    @androidx.annotation.n0
    public static b a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16244, new Class[]{View.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        int i10 = R.id.account_manage_setting_card;
        CardView cardView = (CardView) l3.d.a(view, R.id.account_manage_setting_card);
        if (cardView != null) {
            i10 = R.id.tv_max_src_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_max_src_desc);
            if (textView != null) {
                i10 = R.id.tv_phone_btn;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_phone_btn);
                if (textView2 != null) {
                    i10 = R.id.tv_phonenum;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_phonenum);
                    if (textView3 != null) {
                        i10 = R.id.tv_phonenum_title;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_phonenum_title);
                        if (textView4 != null) {
                            i10 = R.id.tv_wechat;
                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_wechat);
                            if (textView5 != null) {
                                i10 = R.id.tv_wechat_btn;
                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_wechat_btn);
                                if (textView6 != null) {
                                    i10 = R.id.tv_wechat_title;
                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_wechat_title);
                                    if (textView7 != null) {
                                        i10 = R.id.vg_auth;
                                        SettingItemView settingItemView = (SettingItemView) l3.d.a(view, R.id.vg_auth);
                                        if (settingItemView != null) {
                                            i10 = R.id.vg_change_pwd;
                                            SettingItemView settingItemView2 = (SettingItemView) l3.d.a(view, R.id.vg_change_pwd);
                                            if (settingItemView2 != null) {
                                                i10 = R.id.vg_login_device_manage;
                                                SettingItemView settingItemView3 = (SettingItemView) l3.d.a(view, R.id.vg_login_device_manage);
                                                if (settingItemView3 != null) {
                                                    i10 = R.id.vg_max_src;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_max_src);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.vg_pay_setting;
                                                        SettingItemView settingItemView4 = (SettingItemView) l3.d.a(view, R.id.vg_pay_setting);
                                                        if (settingItemView4 != null) {
                                                            i10 = R.id.vg_phone;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_phone);
                                                            if (relativeLayout2 != null) {
                                                                i10 = R.id.vg_wechat;
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_wechat);
                                                                if (relativeLayout3 != null) {
                                                                    i10 = R.id.vg_written_off;
                                                                    SettingItemView settingItemView5 = (SettingItemView) l3.d.a(view, R.id.vg_written_off);
                                                                    if (settingItemView5 != null) {
                                                                        i10 = R.id.written_off_card;
                                                                        CardView cardView2 = (CardView) l3.d.a(view, R.id.written_off_card);
                                                                        if (cardView2 != null) {
                                                                            return new b((RelativeLayout) view, cardView, textView, textView2, textView3, textView4, textView5, textView6, textView7, settingItemView, settingItemView2, settingItemView3, relativeLayout, settingItemView4, relativeLayout2, relativeLayout3, settingItemView5, cardView2);
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
    public static b c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16242, new Class[]{LayoutInflater.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16243, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_account_manager, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108659a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16245, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
