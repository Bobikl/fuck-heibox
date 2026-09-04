package ff;

import android.content.Context;
import android.util.Log;
import com.max.hbutils.core.BaseApplication;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import gf.f;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DynamicSOLoader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f118841a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final String f118842b = "DynamicSOLoader";
    public static ChangeQuickRedirect changeQuickRedirect;

    private b() {
    }

    public final void a(@d Context context, @e File file) {
        if (PatchProxy.proxy(new Object[]{context, file}, this, changeQuickRedirect, false, 22055, new Class[]{Context.class, File.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        try {
            com.max.xiaoheihe.loader.tinker.b.a(context.getClassLoader(), file);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final boolean b(@d File soFIle, @d String path) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{soFIle, path}, this, changeQuickRedirect, false, 22054, new Class[]{File.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(soFIle, "soFIle");
        f0.p(path, "path");
        f fVar = null;
        try {
            try {
                f fVar2 = new f(soFIle);
                try {
                    List<String> listC = fVar2.c();
                    f0.o(listC, "parseNeededDependencies(...)");
                    fVar2.close();
                    BaseApplication baseApplicationA = BaseApplication.a();
                    for (String str : listC) {
                        try {
                            File file = new File(path + str);
                            if (file.exists()) {
                                b(file, path);
                            } else {
                                String strSubstring = str.substring(3, str.length() - 3);
                                f0.o(strSubstring, "substring(...)");
                                com.getkeepsafe.relinker.d.b(baseApplicationA, strSubstring);
                            }
                        } catch (Exception e10) {
                            g.f74531b.v("DynamicSOLoader error " + e10.getMessage());
                        }
                    }
                    try {
                        String name = soFIle.getName();
                        f0.o(name, "getName(...)");
                        String strSubstring2 = name.substring(3, soFIle.getName().length() - 3);
                        f0.o(strSubstring2, "substring(...)");
                        System.loadLibrary(strSubstring2);
                        return true;
                    } catch (Throwable th2) {
                        Log.e(f118842b, "loadLibrary error : " + th2.getMessage());
                        return false;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fVar = fVar2;
                    if (fVar != null) {
                        fVar.close();
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
