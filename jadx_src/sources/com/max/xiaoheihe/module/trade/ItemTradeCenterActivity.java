package com.max.xiaoheihe.module.trade;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeTipsStateObj;
import com.max.xiaoheihe.max.ui.MaxHomeContainerFragment;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ItemTradeCenterActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@m(path = lb.d.V2)
@o(parameters = 0)
@ig.d(interceptors = {yc.a.class}, path = {lb.d.V2})
public final class ItemTradeCenterActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener, qf.a {

    @dl.d
    public static final a U = new a(null);
    public static final int V = 8;
    private static final int W = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private RadioGroup L;
    private RadioButton M;
    private RadioButton N;
    private RadioButton O;
    private RadioButton P;
    private View Q;
    private View R;
    private View S;

    @dl.e
    private String T;

    /* JADX INFO: compiled from: ItemTradeCenterActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 44496, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return new Intent(context, (Class<?>) ItemTradeCenterActivity.class);
        }

        @dl.d
        public final Intent b(@dl.d Context context, @dl.d String page_type) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, page_type}, this, changeQuickRedirect, false, 44497, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(page_type, "page_type");
            if (f0.g("deal", page_type)) {
                return TradeDealActivity.Q.a(context, 0);
            }
            Intent intent = new Intent(context, (Class<?>) ItemTradeCenterActivity.class);
            intent.putExtra("prefer_page", page_type);
            return intent;
        }

        public final int c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44495, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ItemTradeCenterActivity.W;
        }
    }

    /* JADX INFO: compiled from: ItemTradeCenterActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeTipsStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<TradeTipsStateObj> tipsStateObjResult) {
            if (PatchProxy.proxy(new Object[]{tipsStateObjResult}, this, changeQuickRedirect, false, 44498, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tipsStateObjResult, "tipsStateObjResult");
            ItemTradeCenterActivity.N1(ItemTradeCenterActivity.this, tipsStateObjResult.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44499, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeTipsStateObj>) obj);
        }
    }

    public static final /* synthetic */ void N1(ItemTradeCenterActivity itemTradeCenterActivity, TradeTipsStateObj tradeTipsStateObj) {
        if (PatchProxy.proxy(new Object[]{itemTradeCenterActivity, tradeTipsStateObj}, null, changeQuickRedirect, true, 44494, new Class[]{ItemTradeCenterActivity.class, TradeTipsStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        itemTradeCenterActivity.V1(tradeTipsStateObj);
    }

    private final Fragment O1(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44487, new Class[]{Integer.TYPE}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        Fragment fragmentS0 = getSupportFragmentManager().s0(i10 + "");
        if (fragmentS0 == null) {
            if (i10 == 0) {
                fragmentS0 = TradeDiscoveryFragment.M.d();
            } else if (i10 == 1) {
                fragmentS0 = ItemInventoryFragment.a.f(ItemInventoryFragment.V, false, 1, null);
            } else if (i10 == 2) {
                fragmentS0 = c.f93330g.a();
            } else if (i10 == 3) {
                fragmentS0 = ItemTradeProfileFragment.S.a();
            }
        }
        f0.m(fragmentS0);
        fragmentS0.setUserVisibleHint(true);
        fragmentS0.setMenuVisibility(true);
        return fragmentS0;
    }

    private final void Q1() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44490, new Class[0], Void.TYPE).isSupported && i0.s()) {
            V((io.reactivex.disposables.b) i.a().l1().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
        }
    }

    private final void R1(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44486, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentO1 = O1(i10);
        p0 p0VarU = getSupportFragmentManager().u();
        f0.o(p0VarU, "supportFragmentManager.beginTransaction()");
        if (z10) {
            f0.m(fragmentO1);
            if (!fragmentO1.isAdded()) {
                p0VarU.c(R.id.fl_container, fragmentO1, i10 + "");
            }
            p0VarU.P(fragmentO1);
        } else {
            f0.m(fragmentO1);
            if (!fragmentO1.isAdded()) {
                return;
            } else {
                p0VarU.u(fragmentO1);
            }
        }
        p0VarU.n();
        getSupportFragmentManager().n0();
    }

    private final void V1(TradeTipsStateObj tradeTipsStateObj) {
        if (PatchProxy.proxy(new Object[]{tradeTipsStateObj}, this, changeQuickRedirect, false, 44491, new Class[]{TradeTipsStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (tradeTipsStateObj != null) {
            com.max.hbcache.c.C("trade_msg_tap_time", tradeTipsStateObj.getMessage_time());
            com.max.hbcache.c.C("trade_bot_tap_time", tradeTipsStateObj.getBot_time());
            com.max.hbcache.c.C("trade_trade_tab_time", tradeTipsStateObj.getTrade_tab_time());
            com.max.hbcache.c.C("trade_me_tab_time", tradeTipsStateObj.getMe_tab_time());
            com.max.hbcache.c.z("has_trading_report", tradeTipsStateObj.getHas_trading_report());
            com.max.hbcache.c.C("trade_wechat_push", tradeTipsStateObj.getWechat_push());
            com.max.hbcache.c.C("trade_sms_push", tradeTipsStateObj.getSms_push());
        }
        T1();
        this.f66601b.sendBroadcast(new Intent(lb.a.N));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    public final void T1() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44492, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view2 = null;
        if (n.r(com.max.hbcache.c.o("trade_trade_tab_time", "")) <= n.r(com.max.hbcache.c.o("last_trade_trade_tab_time", ""))) {
            view = this.S;
            if (view == null) {
                f0.S("iv_tips_3");
                view = null;
            }
            view.setVisibility(4);
        } else {
            RadioGroup radioGroup = this.L;
            if (radioGroup == null) {
                f0.S("rg_main");
                radioGroup = null;
            }
            if (radioGroup.getCheckedRadioButtonId() != R.id.rb_3) {
                View view3 = this.S;
                if (view3 == null) {
                    f0.S("iv_tips_3");
                    view3 = null;
                }
                view3.setVisibility(0);
            } else {
                view = this.S;
                if (view == null) {
                    f0.S("iv_tips_3");
                    view = null;
                }
                view.setVisibility(4);
            }
        }
        if (n.r(com.max.hbcache.c.o("trade_me_tab_time", "")) > n.r(com.max.hbcache.c.o("last_trade_me_tab_time", ""))) {
            RadioGroup radioGroup2 = this.L;
            if (radioGroup2 == null) {
                f0.S("rg_main");
                radioGroup2 = null;
            }
            if (radioGroup2.getCheckedRadioButtonId() != R.id.rb_4) {
                View view4 = this.R;
                if (view4 == null) {
                    f0.S("iv_tips_4");
                } else {
                    view2 = view4;
                }
                view2.setVisibility(0);
                return;
            }
        }
        View view5 = this.R;
        if (view5 == null) {
            f0.S("iv_tips_4");
        } else {
            view2 = view5;
        }
        view2.setVisibility(4);
    }

    @Override // qf.a
    public void f1(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44493, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RadioGroup radioGroup = null;
        if (i10 == 1) {
            RadioGroup radioGroup2 = this.L;
            if (radioGroup2 == null) {
                f0.S("rg_main");
            } else {
                radioGroup = radioGroup2;
            }
            radioGroup.check(R.id.rb_1);
            return;
        }
        if (i10 == 2) {
            RadioGroup radioGroup3 = this.L;
            if (radioGroup3 == null) {
                f0.S("rg_main");
            } else {
                radioGroup = radioGroup3;
            }
            radioGroup.check(R.id.rb_2);
            return;
        }
        if (i10 != 4) {
            return;
        }
        RadioGroup radioGroup4 = this.L;
        if (radioGroup4 == null) {
            f0.S("rg_main");
        } else {
            radioGroup = radioGroup4;
        }
        radioGroup.check(R.id.rb_4);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44482, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getWindow().setFormat(-3);
        setContentView(R.layout.activity_item_center);
        RadioGroup radioGroup = null;
        t.X(this.f66601b, 0, null);
        t.M(this, true);
        this.T = getIntent().getStringExtra("prefer_page");
        View viewFindViewById = findViewById(R.id.rg_main);
        f0.o(viewFindViewById, "findViewById(R.id.rg_main)");
        this.L = (RadioGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.rb_1);
        f0.o(viewFindViewById2, "findViewById(R.id.rb_1)");
        this.M = (RadioButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.rb_2);
        f0.o(viewFindViewById3, "findViewById(R.id.rb_2)");
        this.N = (RadioButton) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.rb_3);
        f0.o(viewFindViewById4, "findViewById(R.id.rb_3)");
        RadioButton radioButton = (RadioButton) viewFindViewById4;
        this.O = radioButton;
        if (radioButton == null) {
            f0.S("rb_3");
            radioButton = null;
        }
        radioButton.setVisibility(8);
        View viewFindViewById5 = findViewById(R.id.rb_4);
        f0.o(viewFindViewById5, "findViewById(R.id.rb_4)");
        this.P = (RadioButton) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.iv_tips_3);
        f0.o(viewFindViewById6, "findViewById(R.id.iv_tips_3)");
        this.S = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.iv_tips_4);
        f0.o(viewFindViewById7, "findViewById(R.id.iv_tips_4)");
        this.R = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.vg_tips_3);
        f0.o(viewFindViewById8, "findViewById(R.id.vg_tips_3)");
        this.Q = viewFindViewById8;
        if (viewFindViewById8 == null) {
            f0.S("vg_tips_3");
            viewFindViewById8 = null;
        }
        viewFindViewById8.setVisibility(8);
        RadioButton radioButton2 = this.M;
        if (radioButton2 == null) {
            f0.S("rb_1");
            radioButton2 = null;
        }
        radioButton2.setOnCheckedChangeListener(this);
        RadioButton radioButton3 = this.N;
        if (radioButton3 == null) {
            f0.S("rb_2");
            radioButton3 = null;
        }
        radioButton3.setOnCheckedChangeListener(this);
        RadioButton radioButton4 = this.O;
        if (radioButton4 == null) {
            f0.S("rb_3");
            radioButton4 = null;
        }
        radioButton4.setOnCheckedChangeListener(this);
        RadioButton radioButton5 = this.P;
        if (radioButton5 == null) {
            f0.S("rb_4");
            radioButton5 = null;
        }
        radioButton5.setOnCheckedChangeListener(this);
        String str = this.T;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2020599460) {
                if (iHashCode != 3480) {
                    if (iHashCode == 273184745 && str.equals(MaxHomeContainerFragment.f77336i)) {
                        RadioGroup radioGroup2 = this.L;
                        if (radioGroup2 == null) {
                            f0.S("rg_main");
                        } else {
                            radioGroup = radioGroup2;
                        }
                        radioGroup.check(R.id.rb_1);
                        return;
                    }
                } else if (str.equals("me")) {
                    RadioGroup radioGroup3 = this.L;
                    if (radioGroup3 == null) {
                        f0.S("rg_main");
                    } else {
                        radioGroup = radioGroup3;
                    }
                    radioGroup.check(R.id.rb_4);
                    return;
                }
            } else if (str.equals("inventory")) {
                RadioGroup radioGroup4 = this.L;
                if (radioGroup4 == null) {
                    f0.S("rg_main");
                } else {
                    radioGroup = radioGroup4;
                }
                radioGroup.check(R.id.rb_2);
                return;
            }
        }
        RadioGroup radioGroup5 = this.L;
        if (radioGroup5 == null) {
            f0.S("rg_main");
        } else {
            radioGroup = radioGroup5;
        }
        radioGroup.check(R.id.rb_1);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44488, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (W == i10 && i11 == -1) {
            t2();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(@dl.d CompoundButton buttonView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{buttonView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44485, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
        }
        f0.p(buttonView, "buttonView");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("buttonView==");
        RadioGroup radioGroup = this.L;
        if (radioGroup == null) {
            f0.S("rg_main");
            radioGroup = null;
        }
        sb2.append(radioGroup.indexOfChild(buttonView));
        sb2.append("    isChecked ==");
        sb2.append(z10);
        com.max.hbcommon.utils.d.b("zzzzitemtest", sb2.toString());
        switch (buttonView.getId()) {
            case R.id.rb_1 /* 2131363858 */:
                R1(0, z10);
                break;
            case R.id.rb_2 /* 2131363859 */:
                R1(1, z10);
                break;
            case R.id.rb_3 /* 2131363860 */:
                R1(2, z10);
                com.max.hbcache.c.C("last_trade_trade_tab_time", com.max.hbcache.c.o("trade_trade_tab_time", ""));
                T1();
                break;
            case R.id.rb_4 /* 2131363861 */:
                R1(3, z10);
                com.max.hbcache.c.C("last_trade_me_tab_time", com.max.hbcache.c.o("trade_me_tab_time", ""));
                T1();
                break;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@dl.e Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 44483, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        RadioGroup radioGroup = null;
        String stringExtra = intent != null ? intent.getStringExtra("prefer_page") : null;
        this.T = stringExtra;
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            return;
        }
        String str = this.T;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2020599460) {
                if (iHashCode != 3480) {
                    if (iHashCode == 273184745 && str.equals(MaxHomeContainerFragment.f77336i)) {
                        RadioGroup radioGroup2 = this.L;
                        if (radioGroup2 == null) {
                            f0.S("rg_main");
                        } else {
                            radioGroup = radioGroup2;
                        }
                        radioGroup.check(R.id.rb_1);
                        return;
                    }
                } else if (str.equals("me")) {
                    RadioGroup radioGroup3 = this.L;
                    if (radioGroup3 == null) {
                        f0.S("rg_main");
                    } else {
                        radioGroup = radioGroup3;
                    }
                    radioGroup.check(R.id.rb_4);
                    return;
                }
            } else if (str.equals("inventory")) {
                RadioGroup radioGroup4 = this.L;
                if (radioGroup4 == null) {
                    f0.S("rg_main");
                } else {
                    radioGroup = radioGroup4;
                }
                radioGroup.check(R.id.rb_2);
                return;
            }
        }
        RadioGroup radioGroup5 = this.L;
        if (radioGroup5 == null) {
            f0.S("rg_main");
        } else {
            radioGroup = radioGroup5;
        }
        radioGroup.check(R.id.rb_1);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44484, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        Q1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
    }

    @Override // qf.a
    public void t2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44489, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentO1 = O1(1);
        if (fragmentO1 instanceof ItemInventoryFragment) {
            ((ItemInventoryFragment) fragmentO1).I4();
        }
    }
}
