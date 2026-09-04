package com.max.xiaoheihe.module.littleprogram.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.o;
import androidx.core.view.n3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import com.max.hbcommon.analytics.m;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbminiprogram.bean.TopicInfoObj;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.SystemWindowInsetExtensionsKt;
import com.max.hbutils.utils.n;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.trade.TradeTipsStateObj;
import com.max.xiaoheihe.max.ui.MaxHomeContainerFragment;
import com.max.xiaoheihe.module.trade.ItemInventoryFragment;
import com.max.xiaoheihe.module.trade.ItemTradeProfileFragment;
import com.max.xiaoheihe.module.trade.TradeDiscoveryFragment;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import lb.d;

/* JADX INFO: compiled from: ItemTradeCenterFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = d.V2)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class ItemTradeCenterFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d, CompoundButton.OnCheckedChangeListener, qf.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RadioGroup f88843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RadioButton f88844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RadioButton f88845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RadioButton f88846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private RadioButton f88847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f88848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f88849v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f88850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @e
    private String f88851x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @e
    private com.max.xiaoheihe.module.littleprogram.fragment.b f88852y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final a f88842z = new a(null);
    public static final int A = 8;
    private static final int B = 1;

    /* JADX INFO: compiled from: ItemTradeCenterFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final int a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38864, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ItemTradeCenterFragment.B;
        }

        @dl.d
        public final Fragment b(@e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 38865, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putString("prefer_page", (String) (map != null ? map.get("prefer_page") : null));
            Object obj = map != null ? map.get(com.max.xiaoheihe.module.littleprogram.b.f88740a.b()) : null;
            if (obj instanceof WebProtocolObj) {
                bundle.putSerializable(com.max.xiaoheihe.module.littleprogram.b.f88740a.b(), (WebProtocolObj) obj);
            }
            ItemTradeCenterFragment itemTradeCenterFragment = new ItemTradeCenterFragment();
            itemTradeCenterFragment.setArguments(bundle);
            return itemTradeCenterFragment;
        }
    }

    /* JADX INFO: compiled from: ItemTradeCenterFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeTipsStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<TradeTipsStateObj> tipsStateObjResult) {
            if (PatchProxy.proxy(new Object[]{tipsStateObjResult}, this, changeQuickRedirect, false, 38866, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tipsStateObjResult, "tipsStateObjResult");
            ItemTradeCenterFragment.J4(ItemTradeCenterFragment.this, tipsStateObjResult.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38867, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeTipsStateObj>) obj);
        }
    }

    public static final /* synthetic */ void J4(ItemTradeCenterFragment itemTradeCenterFragment, TradeTipsStateObj tradeTipsStateObj) {
        if (PatchProxy.proxy(new Object[]{itemTradeCenterFragment, tradeTipsStateObj}, null, changeQuickRedirect, true, 38863, new Class[]{ItemTradeCenterFragment.class, TradeTipsStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        itemTradeCenterFragment.O4(tradeTipsStateObj);
    }

    private final Fragment K4(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38854, new Class[]{Integer.TYPE}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        Fragment fragmentS0 = getChildFragmentManager().s0(i10 + "");
        if (fragmentS0 == null) {
            if (i10 == 0) {
                fragmentS0 = TradeDiscoveryFragment.M.d();
            } else if (i10 == 1) {
                fragmentS0 = ItemInventoryFragment.a.f(ItemInventoryFragment.V, false, 1, null);
            } else if (i10 == 2) {
                fragmentS0 = com.max.xiaoheihe.module.trade.c.f93330g.a();
            } else if (i10 == 3) {
                fragmentS0 = ItemTradeProfileFragment.S.a();
            }
        }
        f0.m(fragmentS0);
        fragmentS0.setUserVisibleHint(true);
        fragmentS0.setMenuVisibility(true);
        return fragmentS0;
    }

    private final void L4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38859, new Class[0], Void.TYPE).isSupported && i0.s()) {
            addDisposable((io.reactivex.disposables.b) i.a().l1().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
        }
    }

    private final void M4(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38852, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentK4 = K4(i10);
        p0 p0VarU = getChildFragmentManager().u();
        f0.o(p0VarU, "childFragmentManager.beginTransaction()");
        if (z10) {
            f0.m(fragmentK4);
            if (!fragmentK4.isAdded()) {
                p0VarU.c(R.id.fl_container, fragmentK4, i10 + "");
            }
            p0VarU.P(fragmentK4);
        } else {
            f0.m(fragmentK4);
            if (!fragmentK4.isAdded()) {
                return;
            } else {
                p0VarU.u(fragmentK4);
            }
        }
        p0VarU.n();
        getChildFragmentManager().n0();
        if (z10 && (fragmentK4 instanceof com.max.xiaoheihe.module.littleprogram.fragment.b)) {
            this.f88852y = (com.max.xiaoheihe.module.littleprogram.fragment.b) fragmentK4;
        }
        V3();
    }

    private final void O4(TradeTipsStateObj tradeTipsStateObj) {
        if (PatchProxy.proxy(new Object[]{tradeTipsStateObj}, this, changeQuickRedirect, false, 38860, new Class[]{TradeTipsStateObj.class}, Void.TYPE).isSupported) {
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
        N4();
        this.mContext.sendBroadcast(new Intent(lb.a.N));
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38848, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.A4();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f88851x = arguments.getString("prefer_page");
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    public final void N4() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38851, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view2 = null;
        if (n.r(com.max.hbcache.c.o("trade_trade_tab_time", "")) <= n.r(com.max.hbcache.c.o("last_trade_trade_tab_time", ""))) {
            view = this.f88850w;
            if (view == null) {
                f0.S("iv_tips_3");
                view = null;
            }
            view.setVisibility(4);
        } else {
            RadioGroup radioGroup = this.f88843p;
            if (radioGroup == null) {
                f0.S("rg_main");
                radioGroup = null;
            }
            if (radioGroup.getCheckedRadioButtonId() != R.id.rb_3) {
                View view3 = this.f88850w;
                if (view3 == null) {
                    f0.S("iv_tips_3");
                    view3 = null;
                }
                view3.setVisibility(0);
            } else {
                view = this.f88850w;
                if (view == null) {
                    f0.S("iv_tips_3");
                    view = null;
                }
                view.setVisibility(4);
            }
        }
        if (n.r(com.max.hbcache.c.o("trade_me_tab_time", "")) > n.r(com.max.hbcache.c.o("last_trade_me_tab_time", ""))) {
            RadioGroup radioGroup2 = this.f88843p;
            if (radioGroup2 == null) {
                f0.S("rg_main");
                radioGroup2 = null;
            }
            if (radioGroup2.getCheckedRadioButtonId() != R.id.rb_4) {
                View view4 = this.f88849v;
                if (view4 == null) {
                    f0.S("iv_tips_4");
                } else {
                    view2 = view4;
                }
                view2.setVisibility(0);
                return;
            }
        }
        View view5 = this.f88849v;
        if (view5 == null) {
            f0.S("iv_tips_4");
        } else {
            view2 = view5;
        }
        view2.setVisibility(4);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 38862, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : f88842z.b(map);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38847, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_item_center);
        View view2 = this.mContentView;
        if (view2 != null) {
            SystemWindowInsetExtensionsKt.c(view2, n3.m.i(), false, false, false, true, false, false, false, false, bb.c.b.A6, null);
        }
        View viewFindViewById = findViewById(R.id.rg_main);
        f0.o(viewFindViewById, "findViewById(R.id.rg_main)");
        this.f88843p = (RadioGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.rb_1);
        f0.o(viewFindViewById2, "findViewById(R.id.rb_1)");
        this.f88844q = (RadioButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.rb_2);
        f0.o(viewFindViewById3, "findViewById(R.id.rb_2)");
        this.f88845r = (RadioButton) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.rb_3);
        f0.o(viewFindViewById4, "findViewById(R.id.rb_3)");
        RadioButton radioButton = (RadioButton) viewFindViewById4;
        this.f88846s = radioButton;
        RadioGroup radioGroup = null;
        if (radioButton == null) {
            f0.S("rb_3");
            radioButton = null;
        }
        radioButton.setVisibility(8);
        View viewFindViewById5 = findViewById(R.id.rb_4);
        f0.o(viewFindViewById5, "findViewById(R.id.rb_4)");
        this.f88847t = (RadioButton) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.iv_tips_3);
        f0.o(viewFindViewById6, "findViewById(R.id.iv_tips_3)");
        this.f88850w = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.iv_tips_4);
        f0.o(viewFindViewById7, "findViewById(R.id.iv_tips_4)");
        this.f88849v = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.vg_tips_3);
        f0.o(viewFindViewById8, "findViewById(R.id.vg_tips_3)");
        this.f88848u = viewFindViewById8;
        if (viewFindViewById8 == null) {
            f0.S("vg_tips_3");
            viewFindViewById8 = null;
        }
        viewFindViewById8.setVisibility(8);
        RadioButton radioButton2 = this.f88844q;
        if (radioButton2 == null) {
            f0.S("rb_1");
            radioButton2 = null;
        }
        radioButton2.setOnCheckedChangeListener(this);
        RadioButton radioButton3 = this.f88845r;
        if (radioButton3 == null) {
            f0.S("rb_2");
            radioButton3 = null;
        }
        radioButton3.setOnCheckedChangeListener(this);
        RadioButton radioButton4 = this.f88846s;
        if (radioButton4 == null) {
            f0.S("rb_3");
            radioButton4 = null;
        }
        radioButton4.setOnCheckedChangeListener(this);
        RadioButton radioButton5 = this.f88847t;
        if (radioButton5 == null) {
            f0.S("rb_4");
            radioButton5 = null;
        }
        radioButton5.setOnCheckedChangeListener(this);
        String str = this.f88851x;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2020599460) {
                if (iHashCode != 3480) {
                    if (iHashCode == 273184745 && str.equals(MaxHomeContainerFragment.f77336i)) {
                        RadioGroup radioGroup2 = this.f88843p;
                        if (radioGroup2 == null) {
                            f0.S("rg_main");
                        } else {
                            radioGroup = radioGroup2;
                        }
                        radioGroup.check(R.id.rb_1);
                        return;
                    }
                } else if (str.equals("me")) {
                    RadioGroup radioGroup3 = this.f88843p;
                    if (radioGroup3 == null) {
                        f0.S("rg_main");
                    } else {
                        radioGroup = radioGroup3;
                    }
                    radioGroup.check(R.id.rb_4);
                    return;
                }
            } else if (str.equals("inventory")) {
                RadioGroup radioGroup4 = this.f88843p;
                if (radioGroup4 == null) {
                    f0.S("rg_main");
                } else {
                    radioGroup = radioGroup4;
                }
                radioGroup.check(R.id.rb_2);
                return;
            }
        }
        RadioGroup radioGroup5 = this.f88843p;
        if (radioGroup5 == null) {
            f0.S("rg_main");
        } else {
            radioGroup = radioGroup5;
        }
        radioGroup.check(R.id.rb_1);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return true;
    }

    @Override // qf.a
    public void f1(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38861, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RadioGroup radioGroup = null;
        if (i10 == 1) {
            RadioGroup radioGroup2 = this.f88843p;
            if (radioGroup2 == null) {
                f0.S("rg_main");
            } else {
                radioGroup = radioGroup2;
            }
            radioGroup.check(R.id.rb_1);
            return;
        }
        if (i10 == 2) {
            RadioGroup radioGroup3 = this.f88843p;
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
        RadioGroup radioGroup4 = this.f88843p;
        if (radioGroup4 == null) {
            f0.S("rg_main");
        } else {
            radioGroup = radioGroup4;
        }
        radioGroup.check(R.id.rb_4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 38857, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (B == i10 && i11 == -1) {
            t2();
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(@dl.d CompoundButton buttonView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{buttonView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38850, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
        }
        f0.p(buttonView, "buttonView");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("buttonView==");
        RadioGroup radioGroup = this.f88843p;
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
                M4(0, z10);
                break;
            case R.id.rb_2 /* 2131363859 */:
                M4(1, z10);
                break;
            case R.id.rb_3 /* 2131363860 */:
                M4(2, z10);
                com.max.hbcache.c.C("last_trade_trade_tab_time", com.max.hbcache.c.o("trade_trade_tab_time", ""));
                N4();
                break;
            case R.id.rb_4 /* 2131363861 */:
                M4(3, z10);
                com.max.hbcache.c.C("last_trade_me_tab_time", com.max.hbcache.c.o("trade_me_tab_time", ""));
                N4();
                break;
        }
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38856, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        com.max.xiaoheihe.module.littleprogram.fragment.b bVar = this.f88852y;
        if (bVar != null) {
            bVar.onRefresh();
        }
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38855, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        L4();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void r4(@e TopicInfoObj topicInfoObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{topicInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38853, new Class[]{TopicInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.q("ItemTradeCenterFragment, setTopicInfo, topicInfoObj = " + topicInfoObj);
        if (topicInfoObj != null) {
            com.max.xiaoheihe.module.littleprogram.fragment.b bVar = this.f88852y;
            l4(bVar != null ? bVar.getTitleBar() : null, topicInfoObj, z10);
        }
    }

    @Override // qf.a
    public void t2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38858, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentK4 = K4(1);
        if (fragmentK4 instanceof ItemInventoryFragment) {
            ((ItemInventoryFragment) fragmentK4).I4();
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    @dl.d
    public HBShareProtocolData y4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38849, new Class[0], HBShareProtocolData.class);
        return patchProxyResultProxy.isSupported ? (HBShareProtocolData) patchProxyResultProxy.result : new HBShareProtocolData(getString(R.string.miniprogram_trace_center), getString(R.string.miniprogram_share_desc), lb.a.A1, "", null, null, null, null, null, null, null, bb.c.d.f31173d, null);
    }
}
