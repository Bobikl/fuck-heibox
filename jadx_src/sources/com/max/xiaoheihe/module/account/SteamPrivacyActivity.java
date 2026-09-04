package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.SteamIdInfoObj;
import com.max.xiaoheihe.bean.account.UpdateObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.steaminfo.SteamPublicSettingObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class SteamPrivacyActivity extends BaseActivity {
    private static final String N = "steam_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L = "-1";
    private boolean M = true;

    @BindView(R.id.iv_img)
    ImageView iv_img;

    @BindView(R.id.tv_inventory_state)
    TextView tv_inventory_state;

    @BindView(R.id.tv_personal_state)
    TextView tv_personal_state;

    @BindView(R.id.tv_refresh)
    TextView tv_refresh;

    @BindView(R.id.vg_open_oversea)
    ViewGroup vg_open_oversea;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24302, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamPrivacyActivity.M1(SteamPrivacyActivity.this);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24303, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamPrivacyActivity.M1(SteamPrivacyActivity.this);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24304, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamPrivacyActivity.N1(SteamPrivacyActivity.this);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24305, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamPrivacyActivity.O1(SteamPrivacyActivity.this, false);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<HomeDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24307, new Class[0], Void.TYPE).isSupported && SteamPrivacyActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24306, new Class[]{Throwable.class}, Void.TYPE).isSupported && SteamPrivacyActivity.this.isActive()) {
                super.onError(th2);
                SteamPrivacyActivity.Q1(SteamPrivacyActivity.this);
            }
        }

        public void onNext(Result<HomeDataObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24308, new Class[]{Result.class}, Void.TYPE).isSupported && SteamPrivacyActivity.this.isActive()) {
                super.onNext(result);
                SteamPrivacyActivity.R1(SteamPrivacyActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24309, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HomeDataObj>) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<SteamPublicSettingObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f78463b;

        f(boolean z10) {
            this.f78463b = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24310, new Class[0], Void.TYPE).isSupported && SteamPrivacyActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24311, new Class[]{Throwable.class}, Void.TYPE).isSupported && SteamPrivacyActivity.this.isActive()) {
                super.onError(th2);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<SteamPublicSettingObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24312, new Class[]{Result.class}, Void.TYPE).isSupported && SteamPrivacyActivity.this.isActive()) {
                com.max.xiaoheihe.module.account.utils.l.z(((BaseActivity) SteamPrivacyActivity.this).f66601b, result.getResult(), this.f78463b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24313, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamPublicSettingObj>) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<UpdateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24314, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            SteamPrivacyActivity.this.M = true;
        }

        public void onNext(Result<UpdateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24315, new Class[]{Result.class}, Void.TYPE).isSupported && SteamPrivacyActivity.this.isActive()) {
                UpdateObj result2 = result.getResult();
                if (result2 == null) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(SteamPrivacyActivity.this.getString(R.string.update_fail));
                    return;
                }
                String state = result2.getState();
                if (state == null) {
                    state = "";
                }
                switch (state) {
                    case "failed":
                        SteamPrivacyActivity.this.M = true;
                        com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(SteamPrivacyActivity.this.getString(R.string.update_fail));
                        break;
                    case "ok":
                        SteamPrivacyActivity.this.n1();
                        SteamPrivacyActivity.this.M = true;
                        break;
                    case "waiting":
                    case "updating":
                        SteamPrivacyActivity.this.M = true;
                        com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f("正在更新,请稍后刷新");
                        break;
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24316, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UpdateObj>) obj);
        }
    }

    static /* synthetic */ void M1(SteamPrivacyActivity steamPrivacyActivity) {
        if (PatchProxy.proxy(new Object[]{steamPrivacyActivity}, null, changeQuickRedirect, true, 24297, new Class[]{SteamPrivacyActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamPrivacyActivity.Y1();
    }

    static /* synthetic */ void N1(SteamPrivacyActivity steamPrivacyActivity) {
        if (PatchProxy.proxy(new Object[]{steamPrivacyActivity}, null, changeQuickRedirect, true, 24298, new Class[]{SteamPrivacyActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamPrivacyActivity.b2();
    }

    static /* synthetic */ void O1(SteamPrivacyActivity steamPrivacyActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{steamPrivacyActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 24299, new Class[]{SteamPrivacyActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        steamPrivacyActivity.Z1(z10);
    }

    static /* synthetic */ void Q1(SteamPrivacyActivity steamPrivacyActivity) {
        if (PatchProxy.proxy(new Object[]{steamPrivacyActivity}, null, changeQuickRedirect, true, 24300, new Class[]{SteamPrivacyActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamPrivacyActivity.C1();
    }

    static /* synthetic */ void R1(SteamPrivacyActivity steamPrivacyActivity, HomeDataObj homeDataObj) {
        if (PatchProxy.proxy(new Object[]{steamPrivacyActivity, homeDataObj}, null, changeQuickRedirect, true, 24301, new Class[]{SteamPrivacyActivity.class, HomeDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        steamPrivacyActivity.a2(homeDataObj);
    }

    private void W1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24291, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public static Intent X1(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 24288, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) SteamPrivacyActivity.class);
        intent.putExtra("steam_id", str);
        return intent;
    }

    private void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24294, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Z1(true);
    }

    private void Z1(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24295, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().y5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(z10)));
    }

    private void a2(HomeDataObj homeDataObj) {
        if (PatchProxy.proxy(new Object[]{homeDataObj}, this, changeQuickRedirect, false, 24292, new Class[]{HomeDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (homeDataObj == null) {
            C1();
            return;
        }
        SteamIdInfoObj steam_id_info = homeDataObj.getSteam_id_info();
        User userI = com.max.xiaoheihe.utils.i0.i();
        userI.setGameAccountInfo(homeDataObj);
        com.max.xiaoheihe.utils.i0.z(userI);
        if (steam_id_info == null || !"1".equals(steam_id_info.getPersonal_infomation_open())) {
            this.tv_personal_state.setText("前去公开");
            this.tv_personal_state.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            this.tv_personal_state.setBackgroundResource(R.drawable.text_primary_2dp);
            this.tv_personal_state.setEnabled(true);
        } else {
            this.tv_personal_state.setText("已公开");
            this.tv_personal_state.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            this.tv_personal_state.setBackgroundResource(R.drawable.window_bg_2dp);
            this.tv_personal_state.setEnabled(false);
        }
        if (steam_id_info == null || !"1".equals(steam_id_info.getInventory_open())) {
            this.tv_inventory_state.setText("前去公开");
            this.tv_inventory_state.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            this.tv_inventory_state.setBackgroundResource(R.drawable.text_primary_2dp);
            this.tv_inventory_state.setEnabled(true);
        } else {
            this.tv_inventory_state.setText("已公开");
            this.tv_inventory_state.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            this.tv_inventory_state.setBackgroundResource(R.drawable.window_bg_2dp);
            this.tv_inventory_state.setEnabled(false);
        }
        com.max.hbimage.b.K(homeDataObj.getSteam_tips_img(), this.iv_img);
    }

    private void b2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24296, new Class[0], Void.TYPE).isSupported && this.M) {
            this.M = false;
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().G7("info", this.L, com.max.xiaoheihe.utils.i0.o().getAccount_detail().getUserid()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24289, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_steam_privacy);
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle("Steam隐私设置");
        this.f66617r.setVisibility(0);
        Intent intent = getIntent();
        if (intent != null) {
            this.L = intent.getStringExtra("steam_id");
        }
        E1();
        W1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24293, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        W1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24290, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tv_personal_state.setOnClickListener(new a());
        this.tv_inventory_state.setOnClickListener(new b());
        this.tv_refresh.setOnClickListener(new c());
        this.vg_open_oversea.setOnClickListener(new d());
    }
}
