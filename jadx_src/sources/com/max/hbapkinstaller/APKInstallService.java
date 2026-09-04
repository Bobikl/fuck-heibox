package com.max.hbapkinstaller;

import android.app.Service;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.p0;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes8.dex */
public class APKInstallService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f65631b = "APKInstallService";
    public static ChangeQuickRedirect changeQuickRedirect;

    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Nm, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.e.b().a().startActivity(new Intent("android.settings.SETTINGS"));
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Om, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Pm, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    @Override // android.app.Service
    @p0
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        Object[] objArr = {intent, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Mm, new Class[]{Intent.class, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", -999);
        if (intExtra == -1) {
            Log.d(f65631b, "Requesting user confirmation for installation");
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            intent2.addFlags(268435456);
            try {
                LoadingDialog loadingDialog = d.f65795a;
                if (loadingDialog == null || !loadingDialog.i()) {
                    d.f65795a = new LoadingDialog(com.max.hbutils.utils.e.b().a(), "正在安装，请勿离开", false).r();
                }
                startActivity(intent2);
            } catch (Exception unused) {
            }
        } else if (intExtra != 0) {
            LoadingDialog loadingDialog2 = d.f65795a;
            if (loadingDialog2 != null && loadingDialog2.i()) {
                d.f65795a.c();
            }
            if ("Xiaomi".equals(o.c())) {
                new com.max.hbcommon.view.a.f(com.max.hbutils.utils.e.b().a()).y("安装失败").l("安装该应用请前往设置>开发者选项，下拉到底部关闭“MIUI优化”").u("确认", new b()).i(LayoutInflater.from(com.max.hbutils.utils.e.b().a()).inflate(R.layout.hbapkinstaller_dialog_install_failed, (ViewGroup) null)).o("去设置", new a()).F();
            } else {
                new com.max.hbcommon.view.a.f(com.max.hbutils.utils.e.b().a()).x(R.string.prompt).l("安装失败").u("确认", new c()).F();
            }
            Log.d(f65631b, "Installation failed");
        } else {
            LoadingDialog loadingDialog3 = d.f65795a;
            if (loadingDialog3 != null && loadingDialog3.i()) {
                d.f65795a.c();
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("安装成功!");
            Log.d(f65631b, "Installation succeed");
        }
        stopSelf();
        return 2;
    }
}
