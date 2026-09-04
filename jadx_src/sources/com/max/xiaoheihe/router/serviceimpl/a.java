package com.max.xiaoheihe.router.serviceimpl;

import android.app.Activity;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.router.annotation.RouterService;

/* JADX INFO: compiled from: CaptchaServiceImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {pb.a.class}, key = {ob.b.f132255g})
public class a implements pb.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.a
    public void a(String str, qb.b.InterfaceC1257b interfaceC1257b) {
        if (PatchProxy.proxy(new Object[]{str, interfaceC1257b}, this, changeQuickRedirect, false, 48320, new Class[]{String.class, qb.b.InterfaceC1257b.class}, Void.TYPE).isSupported) {
            return;
        }
        ob.a aVar = ob.a.f132240a;
        Activity activityN = ob.a.b().n();
        if (!(activityN instanceof FragmentActivity) || activityN.isFinishing()) {
            interfaceC1257b.b();
            return;
        }
        com.max.xiaoheihe.network.a aVarQ3 = com.max.xiaoheihe.network.a.Q3(str);
        aVarQ3.S3(interfaceC1257b);
        aVarQ3.M3(((FragmentActivity) activityN).getSupportFragmentManager(), "CaptchaDialogFragment");
    }

    @Override // pb.a
    public void b(@p0 String str, @p0 String str2, @n0 qb.b.a aVar) {
        if (PatchProxy.proxy(new Object[]{str, str2, aVar}, this, changeQuickRedirect, false, 48321, new Class[]{String.class, String.class, qb.b.a.class}, Void.TYPE).isSupported) {
            return;
        }
        ob.a aVar2 = ob.a.f132240a;
        Activity activityN = ob.a.b().n();
        if (!(activityN instanceof FragmentActivity) || activityN.isFinishing()) {
            aVar.onCanceled();
        } else {
            com.max.xiaoheihe.module.account.paysetting.b.f79152o.d(str, str2, aVar).M3(((FragmentActivity) activityN).getSupportFragmentManager(), "CaptchaDialogFragment");
        }
    }

    @Override // pb.a
    public void c(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 48322, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.account.paysetting.a.f79140a.a(activity);
    }
}
