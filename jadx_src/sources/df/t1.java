package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityPrivacySettingsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f115762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f115763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f115764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f115765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f115766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f115767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f115768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f115770j;

    private t1(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 SettingItemView settingItemView, @androidx.annotation.n0 SettingItemView settingItemView2, @androidx.annotation.n0 SettingItemView settingItemView3, @androidx.annotation.n0 SettingItemView settingItemView4, @androidx.annotation.n0 SettingItemView settingItemView5, @androidx.annotation.n0 SettingItemView settingItemView6, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 SettingItemView settingItemView7) {
        this.f115761a = linearLayout;
        this.f115762b = cardView;
        this.f115763c = settingItemView;
        this.f115764d = settingItemView2;
        this.f115765e = settingItemView3;
        this.f115766f = settingItemView4;
        this.f115767g = settingItemView5;
        this.f115768h = settingItemView6;
        this.f115769i = linearLayout2;
        this.f115770j = settingItemView7;
    }

    @androidx.annotation.n0
    public static t1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16524, new Class[]{View.class}, t1.class);
        if (patchProxyResultProxy.isSupported) {
            return (t1) patchProxyResultProxy.result;
        }
        int i10 = R.id.online_settings_card;
        CardView cardView = (CardView) l3.d.a(view, R.id.online_settings_card);
        if (cardView != null) {
            i10 = R.id.siv_online_state;
            SettingItemView settingItemView = (SettingItemView) l3.d.a(view, R.id.siv_online_state);
            if (settingItemView != null) {
                i10 = R.id.siv_recommend;
                SettingItemView settingItemView2 = (SettingItemView) l3.d.a(view, R.id.siv_recommend);
                if (settingItemView2 != null) {
                    i10 = R.id.siv_show_game;
                    SettingItemView settingItemView3 = (SettingItemView) l3.d.a(view, R.id.siv_show_game);
                    if (settingItemView3 != null) {
                        i10 = R.id.siv_show_music;
                        SettingItemView settingItemView4 = (SettingItemView) l3.d.a(view, R.id.siv_show_music);
                        if (settingItemView4 != null) {
                            i10 = R.id.vg_bans;
                            SettingItemView settingItemView5 = (SettingItemView) l3.d.a(view, R.id.vg_bans);
                            if (settingItemView5 != null) {
                                i10 = R.id.vg_moments_privacy;
                                SettingItemView settingItemView6 = (SettingItemView) l3.d.a(view, R.id.vg_moments_privacy);
                                if (settingItemView6 != null) {
                                    i10 = R.id.vg_online_settings;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_online_settings);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_user_relations;
                                        SettingItemView settingItemView7 = (SettingItemView) l3.d.a(view, R.id.vg_user_relations);
                                        if (settingItemView7 != null) {
                                            return new t1((LinearLayout) view, cardView, settingItemView, settingItemView2, settingItemView3, settingItemView4, settingItemView5, settingItemView6, linearLayout, settingItemView7);
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
    public static t1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16522, new Class[]{LayoutInflater.class}, t1.class);
        return patchProxyResultProxy.isSupported ? (t1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16523, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t1.class);
        if (patchProxyResultProxy.isSupported) {
            return (t1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_privacy_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115761a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16525, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
