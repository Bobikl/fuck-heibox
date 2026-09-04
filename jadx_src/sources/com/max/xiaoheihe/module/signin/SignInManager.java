package com.max.xiaoheihe.module.signin;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.max.hbcommon.network.d;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.w;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.accelworld.HBDialogManagerKt;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.SignInResultObj;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.viewprioritymanager.ViewPriority;
import com.max.xiaoheihe.view.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;
import java.util.Random;
import org.apache.tools.ant.taskdefs.z0;

/* JADX INFO: loaded from: classes12.dex */
public class SignInManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SignInManager f91915c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f91916a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f91917b = Boolean.FALSE;

    public static class DateChangeBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 43472, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && HeyBoxApplication.S() && i0.s() && w.I()) {
                SignInManager.f().d((new Random().nextInt(10) + 2) * 1000);
            }
        }
    }

    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.signin.SignInManager$a$a, reason: collision with other inner class name */
        public class C0864a extends d<Result<SignInResultObj>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f91919b;

            C0864a(long j10) {
                this.f91919b = j10;
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(Throwable th2) {
                if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 43465, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                super.onError(th2);
                SignInManager.this.f91917b = Boolean.FALSE;
            }

            public void onNext(Result<SignInResultObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43464, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                super.onNext(result);
                if (!z0.b.f136024i.equals(result.getResult().getState())) {
                    SignInManager.this.g(-1);
                    return;
                }
                SignInManager.this.f91917b = Boolean.FALSE;
                com.max.hbcache.c.C(i0.j() + "sign_in_time", this.f91919b + "");
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43466, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<SignInResultObj>) obj);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43463, new Class[0], Void.TYPE).isSupported && i0.s()) {
                i.a().c1().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0864a(System.currentTimeMillis()));
            }
        }
    }

    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f91921b;

        public class a extends d<Result<SignInResultObj>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f91923b;

            a(long j10) {
                this.f91923b = j10;
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(Throwable th2) {
                if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 43469, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                super.onError(th2);
                b bVar = b.this;
                SignInManager.this.g(bVar.f91921b + 1);
            }

            public void onNext(Result<SignInResultObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43468, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                super.onNext(result);
                if (result == null) {
                    b bVar = b.this;
                    SignInManager.this.g(bVar.f91921b + 1);
                } else if ("waiting".equals(result.getResult().getState())) {
                    b bVar2 = b.this;
                    SignInManager.this.g(bVar2.f91921b + 1);
                } else if (ITagManager.SUCCESS.equals(result.getResult().getState())) {
                    SignInManager.i(result.getResult(), this.f91923b);
                    SignInManager.this.f91917b = Boolean.FALSE;
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43470, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<SignInResultObj>) obj);
            }
        }

        b(int i10) {
            this.f91921b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43467, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            i.a().J6().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(System.currentTimeMillis()));
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 43471, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
        }
    }

    private SignInManager() {
    }

    public static long e(int i10) {
        if (i10 < 2) {
            return 2000L;
        }
        if (i10 < 4) {
            return 3000L;
        }
        return i10 < 6 ? 5000L : 10000L;
    }

    public static SignInManager f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 43456, new Class[0], SignInManager.class);
        if (patchProxyResultProxy.isSupported) {
            return (SignInManager) patchProxyResultProxy.result;
        }
        if (f91915c == null) {
            synchronized (SignInManager.class) {
                if (f91915c == null) {
                    f91915c = new SignInManager();
                }
            }
        }
        return f91915c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43462, new Class[0], Void.TYPE).isSupported && i0.s()) {
            this.f91917b = Boolean.TRUE;
            j();
        }
    }

    public static void i(SignInResultObj signInResultObj, long j10) {
        if (PatchProxy.proxy(new Object[]{signInResultObj, new Long(j10)}, null, changeQuickRedirect, true, 43461, new Class[]{SignInResultObj.class, Long.TYPE}, Void.TYPE).isSupported || signInResultObj == null) {
            return;
        }
        com.max.hbcache.c.C(i0.j() + "sign_in_time", j10 + "");
        Activity activityE = HeyBoxApplication.C().E();
        if (activityE == null || activityE.isFinishing()) {
            return;
        }
        if (signInResultObj.getBirthday_info() != null) {
            HBDialogManagerKt.c(activityE, signInResultObj.getBirthday_info());
            return;
        }
        com.max.xiaoheihe.utils.viewprioritymanager.a aVar = com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a;
        ViewPriority viewPriority = ViewPriority.LOW;
        if (aVar.c(viewPriority.getValue())) {
            Dialog dialogH = l.H(activityE, signInResultObj);
            aVar.a(viewPriority.getValue());
            dialogH.setOnDismissListener(new c());
        }
    }

    public void c() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43457, new Class[0], Void.TYPE).isSupported && i0.s()) {
            String strO = com.max.hbcache.c.o(i0.j() + "sign_in_time", "");
            long j10 = !TextUtils.isEmpty(strO) ? Long.parseLong(strO) : 0L;
            g.W("checkForSignIn lastsignTime: " + strO + "  isToday: " + w.O(j10) + "  isRequestingSign: " + this.f91917b);
            if (w.O(j10)) {
                g.W("[SignInManager] has sign today");
            } else {
                d(0L);
            }
        }
    }

    public void d(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 43458, new Class[]{Long.TYPE}, Void.TYPE).isSupported || this.f91917b.booleanValue()) {
            return;
        }
        this.f91916a.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.signin.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f91925b.h();
            }
        }, j10);
    }

    public void g(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43460, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 >= 20 || !i0.s()) {
            this.f91917b = Boolean.FALSE;
        } else {
            this.f91916a.postDelayed(new b(i10), i10 < 0 ? 0L : e(i10));
        }
    }

    public void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43459, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91916a.post(new a());
    }
}
