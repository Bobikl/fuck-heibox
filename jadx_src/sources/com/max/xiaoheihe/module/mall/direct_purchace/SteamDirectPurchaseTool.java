package com.max.xiaoheihe.module.mall.direct_purchace;

import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentManager;
import com.max.xiaoheihe.bean.mall.MallPrepareStateObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import xh.m;

/* JADX INFO: compiled from: SteamDirectPurchaseTool.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class SteamDirectPurchaseTool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final SteamDirectPurchaseTool f90629a = new SteamDirectPurchaseTool();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final String f90630b = "/steam_purchase/check";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final String f90631c = "/steam_purchase/pay_alert";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final String f90632d = "/steam_purchase/pay_method";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final String f90633e = "/steam_purchase/openalipay";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    public static final String f90634f = "/steam_purchase/need_bind";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    public static final String f90635g = "/steam_purchase/tap_bind";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    public static final String f90636h = "/steam_purchase/need_login";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    public static final String f90637i = "/steam_purchase/tap_login";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    public static final String f90638j = "/steam_purchase/region_tip";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    public static final String f90639k = "/steam_purchase/region_confirm";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    public static final String f90640l = "/steam_purchase/region_tap";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    public static final String f90641m = "/steam_purchase/not_finish";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d
    public static final String f90642n = "/steam_purchase/cancel";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d
    public static final String f90643o = "fragment_payment_select";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @d
    public static final String f90644p = "fragment_steam_area";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f90645q = 0;

    /* JADX INFO: compiled from: SteamDirectPurchaseTool.kt */
    public enum PayType {
        AliPay,
        SteamBalance;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static PayType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 41993, new Class[]{String.class}, PayType.class);
            return (PayType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(PayType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static PayType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 41992, new Class[0], PayType[].class);
            return (PayType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    private SteamDirectPurchaseTool() {
    }

    @m
    public static final boolean a(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 41989, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : u.L1("steam_purchase", str, true);
    }

    @m
    public static final void b(@d PaymentSelectionConfig config, @d FragmentManager fm, @d a.b action) {
        if (PatchProxy.proxy(new Object[]{config, fm, action}, null, changeQuickRedirect, true, 41990, new Class[]{PaymentSelectionConfig.class, FragmentManager.class, a.b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(config, "config");
        f0.p(fm, "fm");
        f0.p(action, "action");
        a.f90700p.a(config, action).show(fm, f90643o);
    }

    @m
    public static final void c(@d MallPrepareStateObj config, @d FragmentManager fm, @d yh.a<b2> action) {
        if (PatchProxy.proxy(new Object[]{config, fm, action}, null, changeQuickRedirect, true, 41991, new Class[]{MallPrepareStateObj.class, FragmentManager.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(config, "config");
        f0.p(fm, "fm");
        f0.p(action, "action");
        SteamAreaChangeDialogFragment.f90619m.a(config, action).show(fm, f90644p);
    }
}
