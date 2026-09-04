package com.max.hbcommon.network;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.JsonSyntaxException;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.mall.SteamStoreLoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.umcrash.UMCrash;
import java.io.IOException;
import org.apache.tools.ant.taskdefs.z0;
import retrofit2.HttpException;

/* JADX INFO: compiled from: ApiErrorHelper.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.hbcommon.network.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ApiErrorHelper.java */
    public class RunnableC0547a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        RunnableC0547a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31738cb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.b().q(BaseApplication.a());
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("您的账号在别处登录,请重新登录");
        }
    }

    /* JADX INFO: compiled from: ApiErrorHelper.java */
    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.e.f31755db, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.b().z();
            dialogInterface.dismiss();
        }
    }

    public static void a(Throwable th2, boolean z10) {
        if (PatchProxy.proxy(new Object[]{th2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.Za, new Class[]{Throwable.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g gVarR = com.max.heybox.hblog.g.R();
        if (gVarR != null) {
            gVarR.a0("ApiErrorHelper : handleCommonError , message: " + th2.toString() + " " + Log.getStackTraceString(new Throwable()));
        }
        if (th2 instanceof HttpException) {
            com.max.hbcommon.utils.d.a("服务暂不可用");
            return;
        }
        if (th2 instanceof IOException) {
            com.max.hbcommon.utils.d.a("连接失败");
            return;
        }
        if (!(th2 instanceof ApiException)) {
            if (!(th2 instanceof JsonSyntaxException)) {
                com.max.hbcommon.utils.d.a("未知错误");
                return;
            } else {
                com.max.hbcommon.utils.d.a("解析错误");
                UMCrash.generateCustomLog(th2, "request JsonSyntaxException");
                return;
            }
        }
        ApiException apiException = (ApiException) th2;
        if ("relogin".equals(apiException.d())) {
            ob.a aVar = ob.a.f132240a;
            if (ob.a.o().b()) {
                if (!b()) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0547a());
                    return;
                }
                ob.a.b().q(BaseApplication.a());
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("您的账号在别处登录,请重新登录");
                return;
            }
            return;
        }
        if (SteamStoreLoginActivity.f89907b0.equals(apiException.d())) {
            ob.a aVar2 = ob.a.f132240a;
            ob.a.o().h();
            return;
        }
        if ("name_verify".equals(apiException.d())) {
            ob.a aVar3 = ob.a.f132240a;
            ob.a.o().g(apiException.a());
            return;
        }
        if ("need_phone_code".equals(apiException.d())) {
            ob.a aVar4 = ob.a.f132240a;
            ob.a.o().e();
            return;
        }
        if ("need_alipay_verify".equals(apiException.d())) {
            String strE = null;
            Result resultC = apiException.c();
            if (resultC != null && resultC.getResult() != null) {
                strE = com.max.hbutils.utils.k.e(com.max.hbutils.utils.k.p(resultC.getResult()), "query_param");
            }
            ob.a aVar5 = ob.a.f132240a;
            ob.a.o().j(strE);
            return;
        }
        if ("pay_password".equals(apiException.d())) {
            ob.a aVar6 = ob.a.f132240a;
            ob.a.o().i();
            return;
        }
        if ("expired".equals(apiException.d())) {
            c(!TextUtils.isEmpty(th2.getMessage()) ? th2.getMessage() : "版本过低请先升级！");
            return;
        }
        if (z0.b.f136024i.equals(apiException.d())) {
            return;
        }
        if ("lack_token".equals(apiException.d())) {
            ob.a aVar7 = ob.a.f132240a;
            ob.a.b().w();
            return;
        }
        if (!SwitchDetailActivity.P.equals(apiException.d())) {
            if (z10 && !TextUtils.isEmpty(th2.getMessage())) {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(th2.getMessage());
            }
            "hkey".equals(apiException.d());
            return;
        }
        Activity activityA = com.max.hbutils.utils.e.b().a();
        if (apiException.b() == null || activityA == null) {
            return;
        }
        ob.a aVar8 = ob.a.f132240a;
        ob.a.p().c(activityA, apiException.b());
    }

    private static boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.f31721bb, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static void c(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.e.f31704ab, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ob.a aVar = ob.a.f132240a;
        Activity activityN = ob.a.b().n();
        if (activityN == null || activityN.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(activityN).y(str).u("确定", new b()).F();
    }
}
