package com.max.hbapkinstaller;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import com.max.hbcommon.utils.l;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.f0;
import kotlin.text.u;

/* JADX INFO: compiled from: XApkCore.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class f extends AsyncTask<String, String, String> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f65802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f65803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f65804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final XApkFile f65805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final File f65806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final Context f65807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final String f65808g;

    public f(@dl.d XApkFile xApkFile, @dl.d Context context, @dl.d String baseDirString) {
        f0.p(xApkFile, "xApkFile");
        f0.p(context, "context");
        f0.p(baseDirString, "baseDirString");
        this.f65802a = "200";
        this.f65803b = "77777";
        this.f65804c = "4306";
        this.f65805d = xApkFile;
        this.f65806e = xApkFile.b();
        this.f65807f = context;
        this.f65808g = baseDirString;
    }

    private final String c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.qn, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : FilesKt__FileReadWriteKt.z(new File(str), null, 1, null);
    }

    @dl.d
    public String a(@dl.d String... params) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{params}, this, changeQuickRedirect, false, bb.c.b.on, new Class[]{String[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(params, "params");
        g gVar = g.f65809a;
        gVar.a(this.f65808g);
        File file = new File(this.f65808g);
        if (!file.exists()) {
            file.mkdir();
        }
        String string = this.f65806e.toString();
        f0.o(string, "toString(...)");
        String string2 = file.toString();
        f0.o(string2, "toString(...)");
        String strA = d.a();
        f0.o(strA, "getDownloadFilePath(...)");
        int iE = gVar.e(string, string2, strA);
        if (iE != 0) {
            return iE != 1 ? this.f65803b : this.f65804c;
        }
        return this.f65802a;
    }

    public void b(@dl.d String result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.b.pn, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(result, "result");
        super.onPostExecute(result);
        String str = "";
        byte b10 = -1;
        if (f0.g(result, this.f65802a)) {
            try {
                File[] fileArrListFiles = new File(this.f65808g).listFiles();
                f0.o(fileArrListFiles, "listFiles(...)");
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    f0.o(name, "getName(...)");
                    String lowerCase = name.toLowerCase();
                    f0.o(lowerCase, "toLowerCase(...)");
                    if (u.K1(lowerCase, ".apk", false, 2, null)) {
                        String string = file.toString();
                        f0.o(string, "toString(...)");
                        str = string;
                        break;
                    }
                }
                b10 = 0;
            } catch (Exception unused) {
            }
        } else if (f0.g(result, this.f65804c)) {
            b10 = 1;
        }
        if (b10 == 0) {
            g.f65809a.c(str, true, this.f65807f, this.f65808g);
        } else if (b10 != 1) {
            LoadingDialog loadingDialog = d.f65795a;
            if (loadingDialog != null && loadingDialog.i()) {
                d.f65795a.c();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f65807f);
            builder.setMessage(l.e(R.string.hbapkinstaller_get_name_or_apk_file_error));
            builder.setNegativeButton(l.e(android.R.string.ok), (DialogInterface.OnClickListener) null);
            builder.create().show();
        } else {
            h.f65810a.h(this.f65805d.b(), this.f65807f, this.f65808g);
        }
        h.f65810a.k(false);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.String] */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ String doInBackground(String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.b.rn, new Class[]{Object[].class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(strArr);
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.sn, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        b(str);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.nn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPreExecute();
        h.f65810a.k(true);
    }
}
