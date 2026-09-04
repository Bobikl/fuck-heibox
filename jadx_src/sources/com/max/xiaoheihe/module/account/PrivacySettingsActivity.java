package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.OnlineStateSettingResultObj;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.max.xiaoheihe.module.bbs.UserRelationsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131174h4})
public class PrivacySettingsActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L = "1";

    @BindView(R.id.online_settings_card)
    CardView onlineSettingCard;

    @BindView(R.id.siv_online_state)
    SettingItemView siv_online_state;

    @BindView(R.id.siv_recommend)
    SettingItemView siv_recommend;

    @BindView(R.id.siv_show_game)
    SettingItemView siv_show_game;

    @BindView(R.id.siv_show_music)
    SettingItemView siv_show_music;

    @BindView(R.id.vg_bans)
    RelativeLayout vgBans;

    @BindView(R.id.vg_moments_privacy)
    SettingItemView vgMomentsPrivacy;

    @BindView(R.id.vg_user_relations)
    RelativeLayout vgUserRelations;

    @BindView(R.id.vg_online_settings)
    ViewGroup vg_online_settings;

    public class a extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23822, new Class[]{Throwable.class}, Void.TYPE).isSupported && PrivacySettingsActivity.this.isActive()) {
                super.onError(th2);
                PrivacySettingsActivity privacySettingsActivity = PrivacySettingsActivity.this;
                privacySettingsActivity.L = com.max.hbcommon.utils.c.x(privacySettingsActivity.L) ? "0" : "1";
                PrivacySettingsActivity privacySettingsActivity2 = PrivacySettingsActivity.this;
                PrivacySettingsActivity.e2(privacySettingsActivity2, privacySettingsActivity2.L);
            }
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23821, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) PrivacySettingsActivity.this).f66601b.startActivity(UserRelationsActivity.m2(((BaseActivity) PrivacySettingsActivity.this).f66601b));
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23823, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) PrivacySettingsActivity.this).f66601b.startActivity(MomentsPrivacyActivity.M1(((BaseActivity) PrivacySettingsActivity.this).f66601b, false));
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23824, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) PrivacySettingsActivity.this).f66601b.startActivity(BansSettingsActivity.h2(((BaseActivity) PrivacySettingsActivity.this).f66601b));
        }
    }

    public class e implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23826, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                com.max.xiaoheihe.utils.d.n1(((BaseActivity) PrivacySettingsActivity.this).f66601b);
            }
        }

        e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23825, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                com.max.hbcache.c.J(((BaseActivity) PrivacySettingsActivity.this).f66601b, Boolean.TRUE);
                PrivacySettingsActivity.l2(PrivacySettingsActivity.this, "1");
            } else {
                com.max.hbcache.c.J(((BaseActivity) PrivacySettingsActivity.this).f66601b, Boolean.FALSE);
                PrivacySettingsActivity.l2(PrivacySettingsActivity.this, "0");
            }
            new com.max.hbcommon.view.a.f(((BaseActivity) PrivacySettingsActivity.this).f66601b).l("切换智能推荐后," + com.max.xiaoheihe.utils.d.A() + "将重新启动").u("确定", new a()).g(false).F();
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public void a(View view, KeyDescObj keyDescObj) {
                if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 23828, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported || keyDescObj.getKey().equals(PrivacySettingsActivity.this.L)) {
                    return;
                }
                PrivacySettingsActivity.V1(PrivacySettingsActivity.this);
            }
        }

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23827, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setKey("1");
            keyDescObj.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.on_line));
            keyDescObj.setChecked(com.max.hbcommon.utils.c.x(PrivacySettingsActivity.this.L));
            arrayList.add(keyDescObj);
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setKey("0");
            keyDescObj2.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.off_line));
            keyDescObj2.setChecked(!com.max.hbcommon.utils.c.x(PrivacySettingsActivity.this.L));
            arrayList.add(keyDescObj2);
            HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(((BaseActivity) PrivacySettingsActivity.this).f66601b, arrayList, true);
            heyBoxPopupMenu.R(new a());
            heyBoxPopupMenu.show();
        }
    }

    public class g implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23829, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!z10) {
                PrivacySettingsActivity.W1(PrivacySettingsActivity.this, "display_current_playing_game", "0");
            } else {
                com.max.hbcache.c.J(((BaseActivity) PrivacySettingsActivity.this).f66601b, Boolean.TRUE);
                PrivacySettingsActivity.W1(PrivacySettingsActivity.this, "display_current_playing_game", "1");
            }
        }
    }

    public class h implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23830, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!z10) {
                PrivacySettingsActivity.W1(PrivacySettingsActivity.this, "display_current_music", "0");
            } else {
                com.max.hbcache.c.J(((BaseActivity) PrivacySettingsActivity.this).f66601b, Boolean.TRUE);
                PrivacySettingsActivity.W1(PrivacySettingsActivity.this, "display_current_music", "1");
            }
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<JsonObject>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        public void onNext(Result<JsonObject> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23831, new Class[]{Result.class}, Void.TYPE).isSupported || !PrivacySettingsActivity.this.isActive() || result == null) {
                return;
            }
            if (com.max.hbcommon.utils.c.x(result.getResult().get("state").getAsString())) {
                com.max.hbcache.c.J(((BaseActivity) PrivacySettingsActivity.this).f66601b, Boolean.TRUE);
                PrivacySettingsActivity.this.siv_recommend.setChecked(true, false);
            } else {
                com.max.hbcache.c.J(((BaseActivity) PrivacySettingsActivity.this).f66601b, Boolean.FALSE);
                PrivacySettingsActivity.this.siv_recommend.setChecked(false, false);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23832, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<JsonObject>) obj);
        }
    }

    public class j extends com.max.hbcommon.network.d<Result<OnlineStateSettingResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23833, new Class[]{Throwable.class}, Void.TYPE).isSupported && PrivacySettingsActivity.this.isActive()) {
                super.onError(th2);
                PrivacySettingsActivity.b2(PrivacySettingsActivity.this);
            }
        }

        public void onNext(Result<OnlineStateSettingResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23834, new Class[]{Result.class}, Void.TYPE).isSupported && PrivacySettingsActivity.this.isActive()) {
                if (result.getResult().getSettings() != null) {
                    PrivacySettingsActivity.e2(PrivacySettingsActivity.this, result.getResult().getSettings().getOnline_state());
                    PrivacySettingsActivity.this.siv_show_game.setChecked(com.max.hbcommon.utils.c.x(result.getResult().getSettings().getDisplay_current_playing_game()), false);
                    PrivacySettingsActivity.this.siv_show_music.setChecked(com.max.hbcommon.utils.c.x(result.getResult().getSettings().getDisplay_current_music()), false);
                }
                PrivacySettingsActivity.f2(PrivacySettingsActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23835, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<OnlineStateSettingResultObj>) obj);
        }
    }

    static /* synthetic */ void V1(PrivacySettingsActivity privacySettingsActivity) {
        if (PatchProxy.proxy(new Object[]{privacySettingsActivity}, null, changeQuickRedirect, true, 23816, new Class[]{PrivacySettingsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        privacySettingsActivity.u2();
    }

    static /* synthetic */ void W1(PrivacySettingsActivity privacySettingsActivity, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{privacySettingsActivity, str, str2}, null, changeQuickRedirect, true, 23817, new Class[]{PrivacySettingsActivity.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        privacySettingsActivity.x2(str, str2);
    }

    static /* synthetic */ void b2(PrivacySettingsActivity privacySettingsActivity) {
        if (PatchProxy.proxy(new Object[]{privacySettingsActivity}, null, changeQuickRedirect, true, 23818, new Class[]{PrivacySettingsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        privacySettingsActivity.C1();
    }

    static /* synthetic */ void e2(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (PatchProxy.proxy(new Object[]{privacySettingsActivity, str}, null, changeQuickRedirect, true, 23819, new Class[]{PrivacySettingsActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        privacySettingsActivity.r2(str);
    }

    static /* synthetic */ void f2(PrivacySettingsActivity privacySettingsActivity) {
        if (PatchProxy.proxy(new Object[]{privacySettingsActivity}, null, changeQuickRedirect, true, 23820, new Class[]{PrivacySettingsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        privacySettingsActivity.x1();
    }

    static /* synthetic */ void l2(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (PatchProxy.proxy(new Object[]{privacySettingsActivity, str}, null, changeQuickRedirect, true, 23815, new Class[]{PrivacySettingsActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        privacySettingsActivity.v2(str);
    }

    public static Intent o2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 23804, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) PrivacySettingsActivity.class);
    }

    private void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23809, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().gb().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    private void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23808, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P9().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private void r2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23813, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.L = str;
        this.siv_online_state.setRightDesc(com.max.xiaoheihe.utils.d.n0(com.max.hbcommon.utils.c.x(str) ? R.string.on_line : R.string.off_line));
    }

    private void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23811, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = com.max.hbcommon.utils.c.x(this.L) ? "0" : "1";
        this.L = str;
        r2(str);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Y5("online_state", this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private void v2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23814, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().k4(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.p());
    }

    private void x2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 23812, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Y5(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.p()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23805, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_privacy_settings);
        ButterKnife.a(this);
        this.f66616q.setTitle(R.string.privacy_setting);
        if (com.max.hbcache.c.e(this.f66601b).booleanValue()) {
            this.siv_recommend.setChecked(true, false);
        } else {
            this.siv_recommend.setChecked(false, false);
        }
        if (MeHomeFragmentx.f77985a4 > 0) {
            E1();
            p2();
            this.vg_online_settings.setVisibility(0);
            this.onlineSettingCard.setVisibility(0);
        } else {
            this.vg_online_settings.setVisibility(8);
            this.onlineSettingCard.setVisibility(8);
        }
        q2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23810, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        E1();
        p2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23807, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (!com.max.xiaoheihe.utils.i0.s()) {
            this.vgUserRelations.setVisibility(8);
            this.vgMomentsPrivacy.setVisibility(8);
            return;
        }
        this.vgUserRelations.setVisibility(0);
        if (ad.a.a(ad.a.C, false)) {
            this.vgMomentsPrivacy.setVisibility(8);
        } else {
            this.vgMomentsPrivacy.setVisibility(0);
        }
        this.vgBans.setVisibility(0);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23806, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.vgUserRelations.setOnClickListener(new b());
        this.vgMomentsPrivacy.setOnClickListener(new c());
        this.vgBans.setOnClickListener(new d());
        this.siv_recommend.setOnCheckedChangeListener(new e());
        this.siv_online_state.setOnClickListener(new f());
        this.siv_show_game.setOnCheckedChangeListener(new g());
        this.siv_show_music.setOnCheckedChangeListener(new h());
    }
}
