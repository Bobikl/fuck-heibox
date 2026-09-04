package com.max.xiaoheihe.module.mall.direct_purchace;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.steaminfo.SteamGameAccount;
import com.max.xiaoheihe.bean.game.GamePayCardObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.k5;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: PaymentSelectionDialog.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final C0835a f90700p = new C0835a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f90701q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final String f90702r = "arg_config";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k5 f90703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private SteamDirectPurchaseTool.PayType f90704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private PaymentSelectionConfig f90705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private String f90706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private b f90707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private ArrayList<Integer> f90708o;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.direct_purchace.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PaymentSelectionDialog.kt */
    public static final class C0835a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private C0835a() {
        }

        public /* synthetic */ C0835a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final a a(@dl.d PaymentSelectionConfig config, @dl.d b confirmAction) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{config, confirmAction}, this, changeQuickRedirect, false, 41898, new Class[]{PaymentSelectionConfig.class, b.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(config, "config");
            f0.p(confirmAction, "confirmAction");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("arg_config", config);
            aVar.setArguments(bundle);
            aVar.c4(confirmAction);
            return aVar;
        }
    }

    /* JADX INFO: compiled from: PaymentSelectionDialog.kt */
    public interface b {
        void a(@dl.d SteamDirectPurchaseTool.PayType payType);
    }

    /* JADX INFO: compiled from: PaymentSelectionDialog.kt */
    public final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90709a;

        static {
            int[] iArr = new int[SteamDirectPurchaseTool.PayType.valuesCustom().length];
            try {
                iArr[SteamDirectPurchaseTool.PayType.AliPay.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SteamDirectPurchaseTool.PayType.SteamBalance.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90709a = iArr;
        }
    }

    /* JADX INFO: compiled from: PaymentSelectionDialog.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41899, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: PaymentSelectionDialog.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41900, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.W3(a.this, SteamDirectPurchaseTool.PayType.AliPay);
        }
    }

    /* JADX INFO: compiled from: PaymentSelectionDialog.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41901, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.W3(a.this, SteamDirectPurchaseTool.PayType.AliPay);
        }
    }

    /* JADX INFO: compiled from: PaymentSelectionDialog.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41902, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.W3(a.this, SteamDirectPurchaseTool.PayType.SteamBalance);
        }
    }

    /* JADX INFO: compiled from: PaymentSelectionDialog.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41903, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.W3(a.this, SteamDirectPurchaseTool.PayType.SteamBalance);
        }
    }

    /* JADX INFO: compiled from: PaymentSelectionDialog.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41904, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b bVarX3 = a.this.X3();
            if (bVarX3 != null) {
                bVarX3.a(a.this.f90704k);
            }
            a.this.dismiss();
        }
    }

    public a() {
        SteamDirectPurchaseTool.PayType payType = SteamDirectPurchaseTool.PayType.AliPay;
        this.f90704k = payType;
        this.f90708o = CollectionsKt__CollectionsKt.r(Integer.valueOf(payType.ordinal()), Integer.valueOf(SteamDirectPurchaseTool.PayType.SteamBalance.ordinal()));
    }

    public static final /* synthetic */ void W3(a aVar, SteamDirectPurchaseTool.PayType payType) {
        if (PatchProxy.proxy(new Object[]{aVar, payType}, null, changeQuickRedirect, true, 41897, new Class[]{a.class, SteamDirectPurchaseTool.PayType.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.d4(payType);
    }

    private final void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41894, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k5 k5Var = this.f90703j;
        k5 k5Var2 = null;
        if (k5Var == null) {
            f0.S("binding");
            k5Var = null;
        }
        k5Var.f112426b.setOnClickListener(new d());
        k5 k5Var3 = this.f90703j;
        if (k5Var3 == null) {
            f0.S("binding");
            k5Var3 = null;
        }
        k5Var3.f112439o.setOnClickListener(new e());
        k5 k5Var4 = this.f90703j;
        if (k5Var4 == null) {
            f0.S("binding");
            k5Var4 = null;
        }
        k5Var4.f112429e.setOnClickListener(new f());
        if (this.f90708o.contains(Integer.valueOf(SteamDirectPurchaseTool.PayType.SteamBalance.ordinal()))) {
            k5 k5Var5 = this.f90703j;
            if (k5Var5 == null) {
                f0.S("binding");
                k5Var5 = null;
            }
            k5Var5.f112445u.setOnClickListener(new g());
            k5 k5Var6 = this.f90703j;
            if (k5Var6 == null) {
                f0.S("binding");
                k5Var6 = null;
            }
            k5Var6.f112430f.setOnClickListener(new h());
        }
        k5 k5Var7 = this.f90703j;
        if (k5Var7 == null) {
            f0.S("binding");
        } else {
            k5Var2 = k5Var7;
        }
        k5Var2.f112437m.setOnClickListener(new i());
    }

    private final void Z3() {
        SteamGameAccount steamGameAccountN;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41892, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PaymentSelectionConfig paymentSelectionConfig = this.f90705l;
        k5 k5Var = null;
        if (!TextUtils.isEmpty(paymentSelectionConfig != null ? paymentSelectionConfig.o() : null)) {
            k5 k5Var2 = this.f90703j;
            if (k5Var2 == null) {
                f0.S("binding");
                k5Var2 = null;
            }
            TextView textView = k5Var2.f112438n;
            PaymentSelectionConfig paymentSelectionConfig2 = this.f90705l;
            textView.setText(paymentSelectionConfig2 != null ? paymentSelectionConfig2.o() : null);
        }
        PaymentSelectionConfig paymentSelectionConfig3 = this.f90705l;
        if (!TextUtils.isEmpty(paymentSelectionConfig3 != null ? paymentSelectionConfig3.m() : null)) {
            k5 k5Var3 = this.f90703j;
            if (k5Var3 == null) {
                f0.S("binding");
                k5Var3 = null;
            }
            TextView textView2 = k5Var3.f112434j;
            PaymentSelectionConfig paymentSelectionConfig4 = this.f90705l;
            textView2.setText(paymentSelectionConfig4 != null ? paymentSelectionConfig4.m() : null);
        }
        PaymentSelectionConfig paymentSelectionConfig5 = this.f90705l;
        if (!TextUtils.isEmpty(paymentSelectionConfig5 != null ? paymentSelectionConfig5.l() : null)) {
            k5 k5Var4 = this.f90703j;
            if (k5Var4 == null) {
                f0.S("binding");
                k5Var4 = null;
            }
            TextView textView3 = k5Var4.f112435k;
            PaymentSelectionConfig paymentSelectionConfig6 = this.f90705l;
            textView3.setText(paymentSelectionConfig6 != null ? paymentSelectionConfig6.l() : null);
        }
        if (!this.f90708o.contains(Integer.valueOf(SteamDirectPurchaseTool.PayType.SteamBalance.ordinal()))) {
            k5 k5Var5 = this.f90703j;
            if (k5Var5 == null) {
                f0.S("binding");
                k5Var5 = null;
            }
            k5Var5.f112445u.setVisibility(8);
            this.f90704k = SteamDirectPurchaseTool.PayType.AliPay;
        } else if (!TextUtils.isEmpty(this.f90706m)) {
            String str = "Steam钱包余额（" + this.f90706m + (char) 65289;
            k5 k5Var6 = this.f90703j;
            if (k5Var6 == null) {
                f0.S("binding");
                k5Var6 = null;
            }
            k5Var6.f112431g.setText(str);
        }
        PaymentSelectionConfig paymentSelectionConfig7 = this.f90705l;
        if (paymentSelectionConfig7 != null && (steamGameAccountN = paymentSelectionConfig7.n()) != null && steamGameAccountN.getSteamId() != null) {
            k5 k5Var7 = this.f90703j;
            if (k5Var7 == null) {
                f0.S("binding");
                k5Var7 = null;
            }
            k5Var7.f112441q.b().setVisibility(0);
            String avatar = steamGameAccountN.getAvatar();
            k5 k5Var8 = this.f90703j;
            if (k5Var8 == null) {
                f0.S("binding");
                k5Var8 = null;
            }
            com.max.hbimage.b.d0(avatar, k5Var8.f112441q.f112015b, ViewUtils.f(getContext(), 3.0f));
            k5 k5Var9 = this.f90703j;
            if (k5Var9 == null) {
                f0.S("binding");
                k5Var9 = null;
            }
            k5Var9.f112441q.f112017d.setText(steamGameAccountN.getName());
            k5 k5Var10 = this.f90703j;
            if (k5Var10 == null) {
                f0.S("binding");
            } else {
                k5Var = k5Var10;
            }
            k5Var.f112441q.f112016c.setText(steamGameAccountN.getSteamId());
        }
        PaymentSelectionConfig paymentSelectionConfig8 = this.f90705l;
        if (paymentSelectionConfig8 == null || paymentSelectionConfig8.k() == null) {
            return;
        }
        b4();
    }

    @dl.d
    @m
    public static final a a4(@dl.d PaymentSelectionConfig paymentSelectionConfig, @dl.d b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{paymentSelectionConfig, bVar}, null, changeQuickRedirect, true, 41896, new Class[]{PaymentSelectionConfig.class, b.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : f90700p.a(paymentSelectionConfig, bVar);
    }

    private final void b4() {
        GamePayCardObj gamePayCardObjK;
        GamePayCardObj gamePayCardObjK2;
        GamePayCardObj gamePayCardObjK3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41893, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PaymentSelectionConfig paymentSelectionConfig = this.f90705l;
        String current_price = null;
        String image = (paymentSelectionConfig == null || (gamePayCardObjK3 = paymentSelectionConfig.k()) == null) ? null : gamePayCardObjK3.getImage();
        k5 k5Var = this.f90703j;
        if (k5Var == null) {
            f0.S("binding");
            k5Var = null;
        }
        com.max.hbimage.b.L(image, k5Var.f112427c, R.drawable.common_default_placeholder_375x210);
        k5 k5Var2 = this.f90703j;
        if (k5Var2 == null) {
            f0.S("binding");
            k5Var2 = null;
        }
        TextView textView = k5Var2.f112433i;
        PaymentSelectionConfig paymentSelectionConfig2 = this.f90705l;
        textView.setText((paymentSelectionConfig2 == null || (gamePayCardObjK2 = paymentSelectionConfig2.k()) == null) ? null : gamePayCardObjK2.getName());
        k5 k5Var3 = this.f90703j;
        if (k5Var3 == null) {
            f0.S("binding");
            k5Var3 = null;
        }
        TextView textView2 = k5Var3.f112432h;
        PaymentSelectionConfig paymentSelectionConfig3 = this.f90705l;
        if (paymentSelectionConfig3 != null && (gamePayCardObjK = paymentSelectionConfig3.k()) != null) {
            current_price = gamePayCardObjK.getCurrent_price();
        }
        textView2.setText(current_price);
    }

    private final void d4(SteamDirectPurchaseTool.PayType payType) {
        if (PatchProxy.proxy(new Object[]{payType}, this, changeQuickRedirect, false, 41895, new Class[]{SteamDirectPurchaseTool.PayType.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = c.f90709a[payType.ordinal()];
        k5 k5Var = null;
        if (i10 == 1) {
            this.f90704k = SteamDirectPurchaseTool.PayType.AliPay;
            k5 k5Var2 = this.f90703j;
            if (k5Var2 == null) {
                f0.S("binding");
                k5Var2 = null;
            }
            k5Var2.f112429e.setChecked(true);
            k5 k5Var3 = this.f90703j;
            if (k5Var3 == null) {
                f0.S("binding");
            } else {
                k5Var = k5Var3;
            }
            k5Var.f112430f.setChecked(false);
            return;
        }
        if (i10 != 2) {
            return;
        }
        this.f90704k = SteamDirectPurchaseTool.PayType.SteamBalance;
        k5 k5Var4 = this.f90703j;
        if (k5Var4 == null) {
            f0.S("binding");
            k5Var4 = null;
        }
        k5Var4.f112429e.setChecked(false);
        k5 k5Var5 = this.f90703j;
        if (k5Var5 == null) {
            f0.S("binding");
        } else {
            k5Var = k5Var5;
        }
        k5Var.f112430f.setChecked(true);
    }

    @dl.e
    public final b X3() {
        return this.f90707n;
    }

    public final void c4(@dl.e b bVar) {
        this.f90707n = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        ArrayList<Integer> arrayListP;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 41890, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        Bundle arguments = getArguments();
        k5 k5Var = null;
        if (arguments != null) {
            PaymentSelectionConfig paymentSelectionConfig = (PaymentSelectionConfig) arguments.getSerializable("arg_config");
            this.f90705l = paymentSelectionConfig;
            if (paymentSelectionConfig != null && (arrayListP = paymentSelectionConfig.p()) != null) {
                this.f90708o = arrayListP;
            }
            PaymentSelectionConfig paymentSelectionConfig2 = this.f90705l;
            this.f90706m = paymentSelectionConfig2 != null ? paymentSelectionConfig2.j() : null;
        }
        k5 k5VarC = k5.c(LayoutInflater.from(getContext()));
        f0.o(k5VarC, "inflate(LayoutInflater.from(context))");
        this.f90703j = k5VarC;
        if (k5VarC == null) {
            f0.S("binding");
            k5VarC = null;
        }
        this.f66868d = k5VarC;
        k5 k5Var2 = this.f90703j;
        if (k5Var2 == null) {
            f0.S("binding");
        } else {
            k5Var = k5Var2;
        }
        RelativeLayout relativeLayoutB = k5Var.b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 41891, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Z3();
        Y3();
    }
}
