package com.max.hbapkinstaller;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import com.max.hbcommon.utils.l;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;

/* JADX INFO: compiled from: InstallUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LoadingDialog f65795a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65796b = 9529;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: InstallUtils.java */
    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f65797b;

        a(Context context) {
            this.f65797b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.hn, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((Activity) this.f65797b).startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + this.f65797b.getPackageName())), 9529);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: InstallUtils.java */
    public class b implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f65798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f65799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f65800c;

        b(Context context, File file, AppCompatActivity appCompatActivity) {
            this.f65798a = context;
            this.f65799b = file;
            this.f65800c = appCompatActivity;
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.in, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            LoadingDialog loadingDialog = d.f65795a;
            if (loadingDialog == null || !loadingDialog.i()) {
                d.f65795a = new LoadingDialog(this.f65798a, l.e(R.string.hbapkinstaller_xapk_install_msg), false).r();
            }
            String strA = d.a();
            h.f65810a.f(new XApkFile(this.f65799b), false, this.f65800c, strA + "/heyboxdownload");
        }
    }

    public static String a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.gn, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return Build.VERSION.SDK_INT >= 30 ? BaseApplication.a().getExternalFilesDir("apk").getAbsolutePath() : Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static void b(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.b.fn, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            File file = new File(str);
            String name = file.getName();
            if (!name.contains(".apks") && !name.contains(".APKS") && !name.contains(".APKs")) {
                if (!name.contains(".apk") && !name.contains(".APK")) {
                    if (name.contains(".xapk") || name.contains(".XAPK")) {
                        Activity activityA = com.max.hbutils.utils.e.b().a();
                        if (activityA == null) {
                            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                            com.max.hbutils.utils.c.f("请重试");
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 26 && !activityA.getPackageManager().canRequestPackageInstalls()) {
                            new com.max.hbcommon.view.a.f(activityA).x(R.string.prompt).k(R.string.hbapkinstaller_allow_install_app).t(R.string.confirm, new a(activityA)).F();
                            return;
                        }
                        if (activityA instanceof AppCompatActivity) {
                            PermissionManager.f71603a.O((AppCompatActivity) activityA, new b(activityA, file, (AppCompatActivity) activityA));
                            return;
                        }
                        if (!com.max.hbpermission.d.a(activityA)) {
                            com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                            com.max.hbutils.utils.c.f(activityA.getResources().getString(R.string.rationale_storage_when_share));
                            return;
                        }
                        LoadingDialog loadingDialog = f65795a;
                        if (loadingDialog == null || !loadingDialog.i()) {
                            f65795a = new LoadingDialog(activityA, l.e(R.string.hbapkinstaller_xapk_install_msg), false).r();
                        }
                        String strA = a();
                        h.f65810a.f(new XApkFile(file), false, activityA, strA + "/heyboxdownload");
                        return;
                    }
                    return;
                }
                Log.d("name", name);
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setDataAndType(FileProvider.f(context, context.getPackageName() + ".fileprovider", file), "application/vnd.android.package-archive");
                    intent.addFlags(1);
                } else {
                    intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                }
                intent.addFlags(268435456);
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                    return;
                }
                return;
            }
            Activity activityA2 = com.max.hbutils.utils.e.b().a();
            LoadingDialog loadingDialog2 = f65795a;
            if (loadingDialog2 == null || !loadingDialog2.i()) {
                f65795a = new LoadingDialog(activityA2, l.e(R.string.hbapkinstaller_xapk_install_msg), false).r();
            }
            String strA2 = a();
            h.f65810a.h(file, activityA2, strA2 + "/heyboxaccelerator");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
