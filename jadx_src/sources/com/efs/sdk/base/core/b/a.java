package com.efs.sdk.base.core.b;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.efs.sdk.base.core.b.b f42429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0353a f42430d;

    /* JADX INFO: renamed from: com.efs.sdk.base.core.b.a$a, reason: collision with other inner class name */
    public static final class C0353a implements Comparator<File> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f42431a = new a(0);
    }

    private a() {
        this.f42427a = false;
        this.f42428b = true;
        this.f42429c = new com.efs.sdk.base.core.b.b();
        this.f42430d = new C0353a();
    }

    /* synthetic */ a(byte b10) {
        this();
    }

    static boolean a(String str) {
        try {
            long j10 = Long.parseLong(str.substring(str.lastIndexOf(lg.a.f131412e) + 1));
            com.efs.sdk.base.core.a.a.a();
            return Math.abs(com.efs.sdk.base.core.a.a.b() - j10) >= 604800000;
        } catch (Throwable unused) {
            return true;
        }
    }

    static void b(@n0 File file) {
        if (!file.getName().startsWith("wa_")) {
            com.efs.sdk.base.core.f.f.a.f42551a.f42549c.e();
        }
        com.efs.sdk.base.core.util.b.b(file);
    }

    static void c(File file) {
        StringBuilder sb2 = new StringBuilder("file is expire: ");
        sb2.append(file.getName());
        sb2.append(", now is ");
        com.efs.sdk.base.core.a.a.a();
        sb2.append(com.efs.sdk.base.core.a.a.b());
        Log.i("efs.cache", sb2.toString());
        if (!file.getName().startsWith("wa_")) {
            com.efs.sdk.base.core.f.f.a.f42551a.f42549c.d();
        }
        com.efs.sdk.base.core.util.b.b(file);
    }

    @p0
    public final com.efs.sdk.base.core.d.b a(File file) {
        try {
            if (!file.exists()) {
                return null;
            }
            if (a(file.getName())) {
                c(file);
                return null;
            }
            com.efs.sdk.base.core.d.b bVarB = com.efs.sdk.base.core.util.b.b(file.getName());
            if (bVarB == null) {
                b(file);
                return null;
            }
            e eVarA = this.f42429c.a(bVarB.f42520a.f42514b);
            if (eVarA == null) {
                b(file);
                return null;
            }
            if (eVarA.a(file, bVarB)) {
                return bVarB;
            }
            b(file);
            return null;
        } catch (Throwable th2) {
            Log.w("efs.cache", th2);
            b(file);
            return null;
        }
    }

    public final void a() {
        String[] list;
        File fileD = com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (!fileD.exists() || !fileD.isDirectory() || (list = fileD.list()) == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            if (!ProcessUtil.isProcessExist(ControllerCenter.getGlobalEnvStruct().mAppContext, str)) {
                File file = new File(fileD, str);
                List<File> listD = com.efs.sdk.base.core.util.b.d(file);
                if (!listD.isEmpty()) {
                    for (File file2 : listD) {
                        if (a(file2.getName())) {
                            c(file2);
                        } else {
                            com.efs.sdk.base.core.d.b bVarB = com.efs.sdk.base.core.util.b.b(file2.getName());
                            if (bVarB == null) {
                                b(file2);
                            } else {
                                e eVarA = this.f42429c.a(bVarB.f42520a.f42514b);
                                if (eVarA == null) {
                                    b(file2);
                                } else {
                                    eVarA.a(file2);
                                }
                            }
                        }
                    }
                }
                com.efs.sdk.base.core.util.b.b(file);
            }
        }
    }
}
