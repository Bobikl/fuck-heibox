package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityGeneralSettingsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114014h;

    private o0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SettingItemView settingItemView, @androidx.annotation.n0 SettingItemView settingItemView2, @androidx.annotation.n0 SettingItemView settingItemView3, @androidx.annotation.n0 SettingItemView settingItemView4, @androidx.annotation.n0 SettingItemView settingItemView5, @androidx.annotation.n0 SettingItemView settingItemView6, @androidx.annotation.n0 SettingItemView settingItemView7) {
        this.f114007a = linearLayout;
        this.f114008b = settingItemView;
        this.f114009c = settingItemView2;
        this.f114010d = settingItemView3;
        this.f114011e = settingItemView4;
        this.f114012f = settingItemView5;
        this.f114013g = settingItemView6;
        this.f114014h = settingItemView7;
    }

    @androidx.annotation.n0
    public static o0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16400, new Class[]{View.class}, o0.class);
        if (patchProxyResultProxy.isSupported) {
            return (o0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_clear_cache;
        SettingItemView settingItemView = (SettingItemView) l3.d.a(view, R.id.vg_clear_cache);
        if (settingItemView != null) {
            i10 = R.id.vg_dark_mode_v2;
            SettingItemView settingItemView2 = (SettingItemView) l3.d.a(view, R.id.vg_dark_mode_v2);
            if (settingItemView2 != null) {
                i10 = R.id.vg_doh;
                SettingItemView settingItemView3 = (SettingItemView) l3.d.a(view, R.id.vg_doh);
                if (settingItemView3 != null) {
                    i10 = R.id.vg_moment_content_prefer_setting;
                    SettingItemView settingItemView4 = (SettingItemView) l3.d.a(view, R.id.vg_moment_content_prefer_setting);
                    if (settingItemView4 != null) {
                        i10 = R.id.vg_optimize_save_img_path;
                        SettingItemView settingItemView5 = (SettingItemView) l3.d.a(view, R.id.vg_optimize_save_img_path);
                        if (settingItemView5 != null) {
                            i10 = R.id.vg_switch_style;
                            SettingItemView settingItemView6 = (SettingItemView) l3.d.a(view, R.id.vg_switch_style);
                            if (settingItemView6 != null) {
                                i10 = R.id.vg_use_system_font;
                                SettingItemView settingItemView7 = (SettingItemView) l3.d.a(view, R.id.vg_use_system_font);
                                if (settingItemView7 != null) {
                                    return new o0((LinearLayout) view, settingItemView, settingItemView2, settingItemView3, settingItemView4, settingItemView5, settingItemView6, settingItemView7);
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
    public static o0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16398, new Class[]{LayoutInflater.class}, o0.class);
        return patchProxyResultProxy.isSupported ? (o0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16399, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o0.class);
        if (patchProxyResultProxy.isSupported) {
            return (o0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_general_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114007a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16401, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
