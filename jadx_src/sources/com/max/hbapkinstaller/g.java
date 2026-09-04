package com.max.hbapkinstaller;

import android.content.Context;
import android.util.Log;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.collections.u;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import org.apache.tools.zip.t;
import org.apache.tools.zip.x;

/* JADX INFO: compiled from: XApkTool.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nXApkTool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XApkTool.kt\ncom/max/hbapkinstaller/XApkTool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g f65809a = new g();
    public static ChangeQuickRedirect changeQuickRedirect;

    private g() {
    }

    public static /* synthetic */ void d(g gVar, String str, boolean z10, Context context, String str2, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gVar, str, new Byte(z10 ? (byte) 1 : (byte) 0), context, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.b.Jn, new Class[]{g.class, String.class, Boolean.TYPE, Context.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.c(str, (i10 & 2) == 0 ? z10 ? 1 : 0 : false, context, str2);
    }

    public final boolean a(@dl.d String path) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{path}, this, changeQuickRedirect, false, bb.c.b.Gn, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(path, "path");
        File file = new File(path);
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return true;
            }
            int length = fileArrListFiles.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (fileArrListFiles[i10].isDirectory()) {
                    String absolutePath = fileArrListFiles[i10].getAbsolutePath();
                    f0.o(absolutePath, "getAbsolutePath(...)");
                    a(absolutePath);
                } else {
                    fileArrListFiles[i10].delete();
                }
            }
        }
        return file.delete();
    }

    public final boolean b(@dl.d String path) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{path}, this, changeQuickRedirect, false, bb.c.b.Hn, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(path, "path");
        return new File(path).delete();
    }

    public final void c(@dl.d String apk, boolean z10, @dl.d Context context, @dl.d String baseDirStr) {
        if (PatchProxy.proxy(new Object[]{apk, new Byte(z10 ? (byte) 1 : (byte) 0), context, baseDirStr}, this, changeQuickRedirect, false, bb.c.b.In, new Class[]{String.class, Boolean.TYPE, Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(apk, "apk");
        f0.p(context, "context");
        f0.p(baseDirStr, "baseDirStr");
        LoadingDialog loadingDialog = d.f65795a;
        if (loadingDialog != null && loadingDialog.i()) {
            d.f65795a.c();
        }
        d.b(context, apk);
        if (z10) {
            a(baseDirStr + "/Android");
            b(baseDirStr + "/manifest.json");
            b(baseDirStr + "/icon.png");
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    public final int e(@dl.d String zipFile, @dl.d String targetPath, @dl.d String basePath) {
        int i10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zipFile, targetPath, basePath}, this, changeQuickRedirect, false, bb.c.b.Fn, new Class[]{String.class, String.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(zipFile, "zipFile");
        f0.p(targetPath, "targetPath");
        f0.p(basePath, "basePath");
        if (zipFile.length() == 0) {
            return -1;
        }
        try {
            new File(targetPath).mkdir();
            System.out.println(targetPath + " created");
            x xVar = new x(zipFile);
            Enumeration<t> enumerationI = xVar.i();
            f0.o(enumerationI, "getEntries(...)");
            Iterator itC0 = u.c0(enumerationI);
            while (itC0.hasNext()) {
                t tVar = (t) itC0.next();
                File file = new File(basePath, tVar.getName());
                String name = tVar.getName();
                f0.o(name, "getName(...)");
                if (kotlin.text.u.K1(name, ".apk", false, 2, null)) {
                    file = new File(targetPath, tVar.getName());
                }
                file.getParentFile().mkdirs();
                if (!tVar.isDirectory()) {
                    String name2 = tVar.getName();
                    f0.o(name2, "getName(...)");
                    if (kotlin.text.u.K1(name2, ".obb", false, 2, null)) {
                        i10 = 0;
                    } else {
                        String name3 = tVar.getName();
                        f0.o(name3, "getName(...)");
                        if (kotlin.text.u.K1(name3, ".OBB", false, 2, null)) {
                            i10 = 0;
                        }
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(xVar.o(tVar));
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 1024);
                    kotlin.io.a.l(bufferedInputStream, bufferedOutputStream, 0, 2, null);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                }
            }
            return i10;
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message != null) {
                Log.d("unZip", message);
            }
            return -1;
        }
    }

    public final boolean f(@dl.d String zipFile, @dl.d String targetPath) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zipFile, targetPath}, this, changeQuickRedirect, false, bb.c.b.En, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(zipFile, "zipFile");
        f0.p(targetPath, "targetPath");
        if (!(zipFile.length() == 0)) {
            if (!(targetPath.length() == 0)) {
                try {
                    new File(targetPath).mkdir();
                    System.out.println(targetPath + " created");
                    new BufferedInputStream(new FileInputStream(zipFile));
                    x xVar = new x(zipFile);
                    Enumeration<t> enumerationI = xVar.i();
                    f0.o(enumerationI, "getEntries(...)");
                    Iterator itC0 = u.c0(enumerationI);
                    while (itC0.hasNext()) {
                        t tVar = (t) itC0.next();
                        File file = new File(targetPath, tVar.getName());
                        file.getParentFile().mkdirs();
                        if (!tVar.isDirectory()) {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(xVar.o(tVar));
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 1024);
                            kotlin.io.a.l(bufferedInputStream, bufferedOutputStream, 0, 2, null);
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    String message = th2.getMessage();
                    if (message != null) {
                        Log.d("unZip", message);
                    }
                }
            }
        }
        return false;
    }
}
