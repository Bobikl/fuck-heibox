package com.max.xiaoheihe.router.serviceimpl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.app.AppCompatActivity;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.module.account.BindPhoneActivity;
import com.max.xiaoheihe.module.account.BottomBindPhoneDialogFragment;
import com.max.xiaoheihe.module.account.paysetting.InputPayPwdActivity;
import com.max.xiaoheihe.module.account.verify.AliVerifyManager;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;
import kotlin.b2;
import pb.o;

/* JADX INFO: compiled from: UserInfoImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {o.class}, key = {"user"})
public class m implements o {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: UserInfoImpl.java */
    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f95191b;

        a(Activity activity) {
            this.f95191b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48413, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = this.f95191b;
            activity.startActivity(BindPhoneActivity.l2(activity));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserInfoImpl.java */
    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48414, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserInfoImpl.java */
    public class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f95194b;

        c(Activity activity) {
            this.f95194b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48415, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(this.f95194b, lb.d.f131237q4);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserInfoImpl.java */
    public class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48416, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserInfoImpl.java */
    public class e implements yh.a<b2> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f95197b;

        e(Activity activity) {
            this.f95197b = activity;
        }

        public b2 a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48417, new Class[0], b2.class);
            if (patchProxyResultProxy.isSupported) {
                return (b2) patchProxyResultProxy.result;
            }
            Activity activity = this.f95197b;
            activity.startActivity(InputPayPwdActivity.W1(activity));
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48418, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    }

    @Override // pb.o
    public void a() {
        Activity activityE;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48405, new Class[0], Void.TYPE).isSupported || (activityE = HeyBoxApplication.C().E()) == null) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(activityE);
        fVar.y("该功能需要绑定手机号");
        com.max.hbcommon.view.a aVarD = fVar.d();
        aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new a(activityE));
        aVarD.r(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new b());
        aVarD.show();
    }

    @Override // pb.o
    public boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48402, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : i0.s();
    }

    @Override // pb.o
    public void c(@n0 Activity activity) {
        if (!PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 48409, new Class[]{Activity.class}, Void.TYPE).isSupported && (activity instanceof BaseActivity)) {
            i0.f((BaseActivity) activity);
        }
    }

    @Override // pb.o
    public void d(@p0 String str, @n0 yh.a<b2> aVar, @n0 yh.a<b2> aVar2) {
        if (PatchProxy.proxy(new Object[]{str, aVar, aVar2}, this, changeQuickRedirect, false, 48406, new Class[]{String.class, yh.a.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activityE = HeyBoxApplication.C().E();
        if (activityE instanceof AppCompatActivity) {
            BottomBindPhoneDialogFragment.f77531v.a(str, aVar, aVar2).M3(((AppCompatActivity) activityE).getSupportFragmentManager(), "");
        } else {
            aVar2.invoke();
        }
    }

    @Override // pb.o
    public void e() {
        Activity activityE;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48408, new Class[0], Void.TYPE).isSupported || (activityE = HeyBoxApplication.C().E()) == null) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(activityE);
        fVar.y("该功能需要验证手机号");
        com.max.hbcommon.view.a aVarD = fVar.d();
        aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new c(activityE));
        aVarD.r(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new d());
        aVarD.show();
    }

    @Override // pb.o
    public boolean f(@n0 Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48410, new Class[]{Context.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : i0.e(context);
    }

    @Override // pb.o
    public void g(@p0 String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48404, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        i0.B(str, null);
    }

    @Override // pb.o
    @p0
    public String getUserId() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48412, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : i0.j();
    }

    @Override // pb.o
    public void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48403, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i0.A();
    }

    @Override // pb.o
    public void i() {
        Activity activityE;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48411, new Class[0], Void.TYPE).isSupported || (activityE = HeyBoxApplication.C().E()) == null) {
            return;
        }
        com.max.xiaoheihe.module.account.paysetting.a.f79140a.f(activityE, new e(activityE));
    }

    @Override // pb.o
    public void j(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48407, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        AliVerifyManager.a(str);
    }
}
