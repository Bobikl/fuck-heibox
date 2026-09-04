package com.max.xiaoheihe.module.account.viewholderbinder;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.PushStateObj;
import com.max.xiaoheihe.module.account.SetPushStateActivity;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PushStateItemVHB.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class b extends cb.c<PushStateObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f79438b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private c f79439a;

    /* JADX INFO: compiled from: PushStateItemVHB.kt */
    public static final class a implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PushStateObj f79441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SettingItemView f79443e;

        a(PushStateObj pushStateObj, String str, SettingItemView settingItemView) {
            this.f79441c = pushStateObj;
            this.f79442d = str;
            this.f79443e = settingItemView;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25550, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            b bVar = b.this;
            PushStateObj pushStateObj = this.f79441c;
            String str = this.f79442d;
            f0.m(str);
            String str2 = z10 ? "1" : "0";
            SettingItemView siv = this.f79443e;
            f0.o(siv, "siv");
            b.f(bVar, pushStateObj, str, str2, siv);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.viewholderbinder.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PushStateItemVHB.kt */
    public static final class C0663b extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SetPushStateActivity f79444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SettingItemView f79445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PushStateObj f79446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f79447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f79448f;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.viewholderbinder.b$b$a */
        /* JADX INFO: compiled from: PushStateItemVHB.kt */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f79449b = new a();
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25555, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        C0663b(SetPushStateActivity setPushStateActivity, SettingItemView settingItemView, PushStateObj pushStateObj, String str, b bVar) {
            this.f79444b = setPushStateActivity;
            this.f79445c = settingItemView;
            this.f79446d = pushStateObj;
            this.f79447e = str;
            this.f79448f = bVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25552, new Class[0], Void.TYPE).isSupported && this.f79444b.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25551, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (this.f79444b.isActive()) {
                super.onError(e10);
                SettingItemView settingItemView = this.f79445c;
                settingItemView.setChecked(settingItemView.c(), false);
            }
        }

        public void onNext(@d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25553, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (this.f79444b.isActive()) {
                super.onNext(result);
                this.f79446d.setPush_state(this.f79447e);
                String str = result.getKeyMap().get("notify_msg");
                if (com.max.hbcommon.utils.c.u(str) || !(this.f79448f.i().f() instanceof Activity)) {
                    return;
                }
                Context contextF = this.f79448f.i().f();
                f0.n(contextF, "null cannot be cast to non-null type com.max.xiaoheihe.module.account.SetPushStateActivity");
                if (((SetPushStateActivity) contextF).isFinishing()) {
                    return;
                }
                new com.max.hbcommon.view.a.f(this.f79448f.i().f()).y("订阅成功").l(str).u("我知道了", a.f79449b).g(false).F();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25554, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    public b(@d c param) {
        f0.p(param, "param");
        this.f79439a = param;
    }

    public static final /* synthetic */ void f(b bVar, PushStateObj pushStateObj, String str, String str2, SettingItemView settingItemView) {
        if (PatchProxy.proxy(new Object[]{bVar, pushStateObj, str, str2, settingItemView}, null, changeQuickRedirect, true, 25549, new Class[]{b.class, PushStateObj.class, String.class, String.class, SettingItemView.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.k(pushStateObj, str, str2, settingItemView);
    }

    private final void k(PushStateObj pushStateObj, String str, String str2, SettingItemView settingItemView) {
        if (PatchProxy.proxy(new Object[]{pushStateObj, str, str2, settingItemView}, this, changeQuickRedirect, false, 25547, new Class[]{PushStateObj.class, String.class, String.class, SettingItemView.class}, Void.TYPE).isSupported || !f0.g(str, pushStateObj.getPush_type()) || f0.g(str2, pushStateObj.getPush_state())) {
            return;
        }
        Context contextF = this.f79439a.f();
        f0.n(contextF, "null cannot be cast to non-null type com.max.xiaoheihe.module.account.SetPushStateActivity");
        SetPushStateActivity setPushStateActivity = (SetPushStateActivity) contextF;
        setPushStateActivity.V((io.reactivex.disposables.b) i.a().l2(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0663b(setPushStateActivity, settingItemView, pushStateObj, str2, this)));
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, PushStateObj pushStateObj) {
        if (PatchProxy.proxy(new Object[]{eVar, pushStateObj}, this, changeQuickRedirect, false, 25548, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        g(eVar, pushStateObj);
    }

    public void g(@d s.e viewHolder, @d PushStateObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 25545, new Class[]{s.e.class, PushStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        h(viewHolder, data);
    }

    public final void h(@d s.e viewHolder, @d PushStateObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 25546, new Class[]{s.e.class, PushStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        String push_state = data.getPush_state();
        String push_type = data.getPush_type();
        SettingItemView settingItemView = (SettingItemView) viewHolder.i(R.id.siv);
        settingItemView.setTitle(data.getPush_type_desc());
        settingItemView.setChecked(f0.g("1", push_state), false);
        settingItemView.setOnCheckedChangeListener(new a(data, push_type, settingItemView));
    }

    @d
    public final c i() {
        return this.f79439a;
    }

    public final void j(@d c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 25544, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cVar, "<set-?>");
        this.f79439a = cVar;
    }
}
