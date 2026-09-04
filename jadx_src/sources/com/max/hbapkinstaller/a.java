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

/* JADX INFO: compiled from: ApksCore.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends AsyncTask<String, String, String> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f65784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f65785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final File f65786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Context f65787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final String f65788e;

    public a(@dl.d File xApkFile, @dl.d Context context, @dl.d String baseDirString) {
        f0.p(xApkFile, "xApkFile");
        f0.p(context, "context");
        f0.p(baseDirString, "baseDirString");
        this.f65784a = "200";
        this.f65785b = "77777";
        this.f65786c = xApkFile;
        this.f65787d = context;
        this.f65788e = baseDirString;
    }

    private final String c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Tm, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : FilesKt__FileReadWriteKt.z(new File(str), null, 1, null);
    }

    @dl.d
    public String a(@dl.d String... params) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{params}, this, changeQuickRedirect, false, bb.c.b.Rm, new Class[]{String[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(params, "params");
        g gVar = g.f65809a;
        gVar.a(this.f65788e);
        File file = new File(this.f65788e);
        if (!file.exists()) {
            file.mkdir();
        }
        String string = this.f65786c.toString();
        f0.o(string, "toString(...)");
        String string2 = file.toString();
        f0.o(string2, "toString(...)");
        return gVar.f(string, string2) ? this.f65784a : this.f65785b;
    }

    public void b(@dl.d String result) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.b.Sm, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(result, "result");
        super.onPostExecute(result);
        if (f0.g(result, this.f65784a)) {
            try {
                new b().f(new File(this.f65788e));
                z10 = true;
            } catch (Exception unused) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            g.f65809a.c("", true, this.f65787d, this.f65788e);
        } else {
            LoadingDialog loadingDialog = d.f65795a;
            if (loadingDialog != null && loadingDialog.i()) {
                d.f65795a.c();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f65787d);
            builder.setMessage(l.e(R.string.hbapkinstaller_get_name_or_apk_file_error));
            builder.setNegativeButton(l.e(android.R.string.ok), (DialogInterface.OnClickListener) null);
            builder.create().show();
        }
        h.f65810a.k(false);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.String] */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ String doInBackground(String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.b.Um, new Class[]{Object[].class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(strArr);
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Vm, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        b(str);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Qm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPreExecute();
        h.f65810a.k(true);
    }
}
