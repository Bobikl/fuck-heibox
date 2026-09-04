package com.max.xiaoheihe.module.chat;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.chat.GroupUserObj;
import com.max.xiaoheihe.bean.chat.StrangerMsgStateObj;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.view.l;
import com.max.xiaoheihe.view.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
@ig.d(path = {lb.d.T4})
public class IMFriendSettingActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private boolean M;

    @BindView(R.id.avatar)
    HeyBoxAvatarView avatarView;

    @BindView(R.id.rl_userinfo)
    RelativeLayout rl_userinfo;

    @BindView(R.id.siv)
    SettingItemView siv;

    @BindView(R.id.tv_name)
    TextView tv_name;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.chat.IMFriendSettingActivity$a$a, reason: collision with other inner class name */
        public class C0729a implements m {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0729a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 31385, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
                IMFriendSettingActivity.R1(IMFriendSettingActivity.this);
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 31384, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
                IMFriendSettingActivity.this.siv.setChecked(false, false);
            }
        }

        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31383, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (IMFriendSettingActivity.this.M) {
                IMFriendSettingActivity.O1(IMFriendSettingActivity.this);
            } else {
                l.D(((BaseActivity) IMFriendSettingActivity.this).f66601b, IMFriendSettingActivity.this.getString(R.string.prompt), IMFriendSettingActivity.this.getString(R.string.pull_sb_into_blacklist_tips), IMFriendSettingActivity.this.getString(R.string.pull_sb_into_blacklist), IMFriendSettingActivity.this.getString(R.string.cancel), new C0729a());
            }
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31386, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(((BaseActivity) IMFriendSettingActivity.this).f66601b, IMFriendSettingActivity.this.L).A();
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<StrangerMsgStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 31387, new Class[]{Throwable.class}, Void.TYPE).isSupported && IMFriendSettingActivity.this.isActive()) {
                super.onError(th2);
                IMFriendSettingActivity.W1(IMFriendSettingActivity.this);
            }
        }

        public void onNext(Result<StrangerMsgStateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31388, new Class[]{Result.class}, Void.TYPE).isSupported && IMFriendSettingActivity.this.isActive()) {
                IMFriendSettingActivity.this.M = "1".equals(result.getResult().getIs_black());
                IMFriendSettingActivity iMFriendSettingActivity = IMFriendSettingActivity.this;
                iMFriendSettingActivity.siv.setChecked(iMFriendSettingActivity.M, false);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31389, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StrangerMsgStateObj>) obj);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<GroupUserObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void onNext(Result<GroupUserObj> result) {
            GroupUserObj result2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31390, new Class[]{Result.class}, Void.TYPE).isSupported || !IMFriendSettingActivity.this.isActive() || (result2 = result.getResult()) == null) {
                return;
            }
            i0.x(result2);
            IMFriendSettingActivity.X1(IMFriendSettingActivity.this, result2);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31391, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GroupUserObj>) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31392, new Class[]{Result.class}, Void.TYPE).isSupported && IMFriendSettingActivity.this.isActive()) {
                IMFriendSettingActivity.this.M = false;
                IMFriendSettingActivity iMFriendSettingActivity = IMFriendSettingActivity.this;
                iMFriendSettingActivity.siv.setChecked(iMFriendSettingActivity.M, false);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(((BaseActivity) IMFriendSettingActivity.this).f66601b.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31393, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31394, new Class[]{Result.class}, Void.TYPE).isSupported && IMFriendSettingActivity.this.isActive()) {
                IMFriendSettingActivity.this.M = true;
                IMFriendSettingActivity iMFriendSettingActivity = IMFriendSettingActivity.this;
                iMFriendSettingActivity.siv.setChecked(iMFriendSettingActivity.M, false);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(((BaseActivity) IMFriendSettingActivity.this).f66601b.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31395, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ void O1(IMFriendSettingActivity iMFriendSettingActivity) {
        if (PatchProxy.proxy(new Object[]{iMFriendSettingActivity}, null, changeQuickRedirect, true, 31379, new Class[]{IMFriendSettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        iMFriendSettingActivity.a2();
    }

    static /* synthetic */ void R1(IMFriendSettingActivity iMFriendSettingActivity) {
        if (PatchProxy.proxy(new Object[]{iMFriendSettingActivity}, null, changeQuickRedirect, true, 31380, new Class[]{IMFriendSettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        iMFriendSettingActivity.f2();
    }

    static /* synthetic */ void W1(IMFriendSettingActivity iMFriendSettingActivity) {
        if (PatchProxy.proxy(new Object[]{iMFriendSettingActivity}, null, changeQuickRedirect, true, 31381, new Class[]{IMFriendSettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        iMFriendSettingActivity.C1();
    }

    static /* synthetic */ void X1(IMFriendSettingActivity iMFriendSettingActivity, GroupUserObj groupUserObj) {
        if (PatchProxy.proxy(new Object[]{iMFriendSettingActivity, groupUserObj}, null, changeQuickRedirect, true, 31382, new Class[]{IMFriendSettingActivity.class, GroupUserObj.class}, Void.TYPE).isSupported) {
            return;
        }
        iMFriendSettingActivity.h2(groupUserObj);
    }

    private void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31377, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().R(this.L, "-1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public static Intent b2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 31369, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) IMFriendSettingActivity.class);
        intent.putExtra("targetid", str);
        return intent;
    }

    private void c2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31374, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().t5(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31375, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GroupUserObj groupUserObjN = i0.n(this.L);
        if (groupUserObjN != null) {
            h2(groupUserObjN);
        } else {
            V((io.reactivex.disposables.b) i.a().F2(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
        }
    }

    private void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31378, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().L6(this.L, "-1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void h2(GroupUserObj groupUserObj) {
        if (PatchProxy.proxy(new Object[]{groupUserObj}, this, changeQuickRedirect, false, 31376, new Class[]{GroupUserObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.avatarView.setAvatar(groupUserObj.getAvartar(), groupUserObj.getAvatar_decoration());
        this.tv_name.setText(groupUserObj.getUsername());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31370, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_im_friend_setting);
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.friend_setting));
        this.f66617r.setVisibility(0);
        String stringExtra = getIntent().getStringExtra("targetid");
        this.L = stringExtra;
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            this.L = getIntent().getStringExtra("uid");
        }
        com.max.hbcommon.utils.c.u(this.L);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31373, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        c2(this.L);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31371, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        e2();
        c2(this.L);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31372, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.siv.setOnCheckedChangeListener(new a());
        this.rl_userinfo.setOnClickListener(new b());
    }
}
