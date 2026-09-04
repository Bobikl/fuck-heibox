package org.apache.tools.ant.util;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.launch.Locator;

/* JADX INFO: compiled from: LoaderUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j0 f136734a = j0.O();

    public static boolean a(ClassLoader classLoader, String str) {
        return classLoader.getResource(b(str)) != null;
    }

    public static String b(String str) {
        return str.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class";
    }

    public static File c(Class<?> cls) {
        return g(Locator.getClassSource(cls));
    }

    public static ClassLoader d() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static File e(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            classLoader = a1.class.getClassLoader();
        }
        return g(Locator.getResourceSource(classLoader, str));
    }

    public static boolean f() {
        return true;
    }

    private static File g(File file) {
        if (file == null) {
            return file;
        }
        try {
            return f136734a.i0(file.getAbsolutePath());
        } catch (BuildException unused) {
            return file;
        }
    }

    public static void h(ClassLoader classLoader) {
        Thread.currentThread().setContextClassLoader(classLoader);
    }
}
