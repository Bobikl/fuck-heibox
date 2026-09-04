package com.max.xiaoheihe.module.mall.direct_purchace;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.analytics.l;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallPrepareStateObj;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.i5;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: SteamAreaChangeDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class SteamAreaChangeDialogFragment extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final a f90619m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f90620n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f90621o = "arg_config";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i5 f90622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private MallPrepareStateObj f90623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private yh.a<b2> f90624l = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.direct_purchace.SteamAreaChangeDialogFragment$onConfirmAction$1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41988, new Class[0], Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            invoke2();
            return b2.f124493a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    };

    /* JADX INFO: compiled from: SteamAreaChangeDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final SteamAreaChangeDialogFragment a(@dl.d MallPrepareStateObj config, @dl.d yh.a<b2> confirmAction) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{config, confirmAction}, this, changeQuickRedirect, false, 41984, new Class[]{MallPrepareStateObj.class, yh.a.class}, SteamAreaChangeDialogFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (SteamAreaChangeDialogFragment) patchProxyResultProxy.result;
            }
            f0.p(config, "config");
            f0.p(confirmAction, "confirmAction");
            SteamAreaChangeDialogFragment steamAreaChangeDialogFragment = new SteamAreaChangeDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("arg_config", config);
            steamAreaChangeDialogFragment.setArguments(bundle);
            steamAreaChangeDialogFragment.b4(confirmAction);
            return steamAreaChangeDialogFragment;
        }
    }

    /* JADX INFO: compiled from: SteamAreaChangeDialogFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41985, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l.f66572a.r(SteamDirectPurchaseTool.f90640l);
            SteamAreaChangeDialogFragment.this.X3().invoke();
            SteamAreaChangeDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: SteamAreaChangeDialogFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41986, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l.f66572a.u(SteamDirectPurchaseTool.f90639k);
            SteamAreaChangeDialogFragment.V3(SteamAreaChangeDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: SteamAreaChangeDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41987, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamAreaChangeDialogFragment.this.dismiss();
        }
    }

    public static final /* synthetic */ void V3(SteamAreaChangeDialogFragment steamAreaChangeDialogFragment) {
        if (PatchProxy.proxy(new Object[]{steamAreaChangeDialogFragment}, null, changeQuickRedirect, true, 41983, new Class[]{SteamAreaChangeDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        steamAreaChangeDialogFragment.W3();
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41980, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i5 i5Var = this.f90622j;
        i5 i5Var2 = null;
        if (i5Var == null) {
            f0.S("binding");
            i5Var = null;
        }
        RichStackModelView richStackModelView = i5Var.f111632l;
        MallPrepareStateObj mallPrepareStateObj = this.f90623k;
        richStackModelView.setRichStackData(mallPrepareStateObj != null ? mallPrepareStateObj.getRegion_confirm_rich_text() : null);
        MallPrepareStateObj mallPrepareStateObj2 = this.f90623k;
        if (TextUtils.isEmpty(mallPrepareStateObj2 != null ? mallPrepareStateObj2.getRegion_notice() : null)) {
            i5 i5Var3 = this.f90622j;
            if (i5Var3 == null) {
                f0.S("binding");
                i5Var3 = null;
            }
            i5Var3.f111624d.setVisibility(8);
        } else {
            i5 i5Var4 = this.f90622j;
            if (i5Var4 == null) {
                f0.S("binding");
                i5Var4 = null;
            }
            TextView textView = i5Var4.f111624d;
            MallPrepareStateObj mallPrepareStateObj3 = this.f90623k;
            textView.setText(mallPrepareStateObj3 != null ? mallPrepareStateObj3.getRegion_notice() : null);
            i5 i5Var5 = this.f90622j;
            if (i5Var5 == null) {
                f0.S("binding");
                i5Var5 = null;
            }
            i5Var5.f111624d.setVisibility(0);
        }
        i5 i5Var6 = this.f90622j;
        if (i5Var6 == null) {
            f0.S("binding");
            i5Var6 = null;
        }
        i5Var6.f111624d.setTextColor(getResources().getColor(R.color.alert_color));
        i5 i5Var7 = this.f90622j;
        if (i5Var7 == null) {
            f0.S("binding");
            i5Var7 = null;
        }
        i5Var7.f111626f.setText("确认授权切换");
        i5 i5Var8 = this.f90622j;
        if (i5Var8 == null) {
            f0.S("binding");
        } else {
            i5Var2 = i5Var8;
        }
        i5Var2.f111626f.setOnClickListener(new b());
    }

    private final void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41981, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i5 i5Var = this.f90622j;
        if (i5Var == null) {
            f0.S("binding");
            i5Var = null;
        }
        i5Var.f111626f.setOnClickListener(new c());
    }

    private final void Z3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41979, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i5 i5Var = this.f90622j;
        i5 i5Var2 = null;
        if (i5Var == null) {
            f0.S("binding");
            i5Var = null;
        }
        RichStackModelView richStackModelView = i5Var.f111632l;
        MallPrepareStateObj mallPrepareStateObj = this.f90623k;
        richStackModelView.setRichStackData(mallPrepareStateObj != null ? mallPrepareStateObj.getRegion_rich_text() : null);
        MallPrepareStateObj mallPrepareStateObj2 = this.f90623k;
        if (TextUtils.isEmpty(mallPrepareStateObj2 != null ? mallPrepareStateObj2.getRegion_desc() : null)) {
            i5 i5Var3 = this.f90622j;
            if (i5Var3 == null) {
                f0.S("binding");
                i5Var3 = null;
            }
            i5Var3.f111624d.setVisibility(8);
        } else {
            i5 i5Var4 = this.f90622j;
            if (i5Var4 == null) {
                f0.S("binding");
                i5Var4 = null;
            }
            TextView textView = i5Var4.f111624d;
            MallPrepareStateObj mallPrepareStateObj3 = this.f90623k;
            textView.setText(mallPrepareStateObj3 != null ? mallPrepareStateObj3.getRegion_desc() : null);
            i5 i5Var5 = this.f90622j;
            if (i5Var5 == null) {
                f0.S("binding");
                i5Var5 = null;
            }
            i5Var5.f111624d.setVisibility(0);
        }
        i5 i5Var6 = this.f90622j;
        if (i5Var6 == null) {
            f0.S("binding");
            i5Var6 = null;
        }
        i5Var6.f111626f.setText("切换地区");
        i5 i5Var7 = this.f90622j;
        if (i5Var7 == null) {
            f0.S("binding");
            i5Var7 = null;
        }
        i5Var7.f111625e.setOnClickListener(new d());
        i5 i5Var8 = this.f90622j;
        if (i5Var8 == null) {
            f0.S("binding");
        } else {
            i5Var2 = i5Var8;
        }
        i5Var2.f111624d.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
    }

    @dl.d
    @m
    public static final SteamAreaChangeDialogFragment a4(@dl.d MallPrepareStateObj mallPrepareStateObj, @dl.d yh.a<b2> aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallPrepareStateObj, aVar}, null, changeQuickRedirect, true, 41982, new Class[]{MallPrepareStateObj.class, yh.a.class}, SteamAreaChangeDialogFragment.class);
        return patchProxyResultProxy.isSupported ? (SteamAreaChangeDialogFragment) patchProxyResultProxy.result : f90619m.a(mallPrepareStateObj, aVar);
    }

    @dl.d
    public final yh.a<b2> X3() {
        return this.f90624l;
    }

    public final void b4(@dl.d yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 41976, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f90624l = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 41977, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f90623k = (MallPrepareStateObj) arguments.getSerializable("arg_config");
        }
        i5 i5VarC = i5.c(LayoutInflater.from(getContext()));
        f0.o(i5VarC, "inflate(LayoutInflater.from(context))");
        this.f90622j = i5VarC;
        i5 i5Var = null;
        if (i5VarC == null) {
            f0.S("binding");
            i5VarC = null;
        }
        this.f66868d = i5VarC;
        i5 i5Var2 = this.f90622j;
        if (i5Var2 == null) {
            f0.S("binding");
        } else {
            i5Var = i5Var2;
        }
        RelativeLayout relativeLayoutB = i5Var.b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 41978, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Z3();
        Y3();
    }
}
