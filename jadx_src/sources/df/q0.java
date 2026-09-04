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

/* JADX INFO: compiled from: ActivityHbalancePaySetttingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114642c;

    private q0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SettingItemView settingItemView, @androidx.annotation.n0 SettingItemView settingItemView2) {
        this.f114640a = linearLayout;
        this.f114641b = settingItemView;
        this.f114642c = settingItemView2;
    }

    @androidx.annotation.n0
    public static q0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16408, new Class[]{View.class}, q0.class);
        if (patchProxyResultProxy.isSupported) {
            return (q0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_change_pwd;
        SettingItemView settingItemView = (SettingItemView) l3.d.a(view, R.id.vg_change_pwd);
        if (settingItemView != null) {
            i10 = R.id.vg_no_pwd_pay;
            SettingItemView settingItemView2 = (SettingItemView) l3.d.a(view, R.id.vg_no_pwd_pay);
            if (settingItemView2 != null) {
                return new q0((LinearLayout) view, settingItemView, settingItemView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static q0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16406, new Class[]{LayoutInflater.class}, q0.class);
        return patchProxyResultProxy.isSupported ? (q0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16407, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q0.class);
        if (patchProxyResultProxy.isSupported) {
            return (q0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_hbalance_pay_settting, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114640a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16409, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
