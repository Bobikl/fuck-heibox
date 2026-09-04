package org.apache.tools.ant.util;

import com.max.xiaoheihe.module.webview.WebviewFragment;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ScriptFixBSFPath.java */
/* JADX INFO: loaded from: classes5.dex */
public class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f136936a = "org.apache.tools.ant.util.optional";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f136937b = "org.apache.bsf";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f136938c = "org.apache.bsf.BSFManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f136939d = "org.apache.tools.ant.util.optional.ScriptRunner";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f136940e = {WebviewFragment.f94378y4, "org.mozilla.javascript.Scriptable", "javascript", "org.mozilla.javascript.Scriptable", "jacl", "tcl.lang.Interp", "netrexx", "netrexx.lang.Rexx", "nrx", "netrexx.lang.Rexx", "jython", "org.python.core.Py", "py", "org.python.core.Py", "xslt", "org.apache.xpath.objects.XObject"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<String, String> f136941f = new HashMap();

    static {
        int i10 = 0;
        while (true) {
            String[] strArr = f136940e;
            if (i10 >= strArr.length) {
                return;
            }
            f136941f.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    private File b(ClassLoader classLoader, String str) {
        return a1.e(classLoader, a1.b(str));
    }

    private File c(String str) {
        return b(getClass().getClassLoader(), str);
    }

    public void a(ClassLoader classLoader, String str) {
        if (classLoader == getClass().getClassLoader() || !(classLoader instanceof org.apache.tools.ant.g)) {
            return;
        }
        ClassLoader classLoader2 = getClass().getClassLoader();
        org.apache.tools.ant.g gVar = (org.apache.tools.ant.g) classLoader;
        File fileC = c(f136938c);
        boolean z10 = true;
        boolean z11 = fileC == null;
        String str2 = f136941f.get(str);
        boolean z12 = (fileC == null || str2 == null || a1.a(classLoader2, str2) || !a1.a(classLoader, str2)) ? false : true;
        if (!z11 && !z12) {
            z10 = false;
        }
        if (fileC == null) {
            fileC = b(classLoader, f136938c);
        }
        if (fileC == null) {
            throw new BuildException("Unable to find BSF classes for scripting");
        }
        if (z12) {
            gVar.e(fileC);
            gVar.d(f136937b);
        }
        if (z10) {
            gVar.e(a1.e(gVar, a1.b(f136939d)));
            gVar.d(f136936a);
        }
    }
}
