package org.apache.tools.ant.taskdefs.optional.native2ascii;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.taskdefs.o1;
import org.apache.tools.ant.taskdefs.optional.s;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: KaffeNative2Ascii.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f135283a = {"gnu.classpath.tools.native2ascii.Native2ASCII", "kaffe.tools.native2ascii.Native2Ascii"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f135284b = "kaffe";

    private static Class<?> e() {
        String[] strArr = f135283a;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            try {
                return Class.forName(strArr[i10]);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.native2ascii.e
    protected boolean c(o oVar, b2 b2Var) throws Throwable {
        o1 o1Var = new o1();
        Class<?> clsE = e();
        if (clsE == null) {
            throw new BuildException("Couldn't load Kaffe's Native2Ascii class");
        }
        oVar.w(clsE.getName());
        o1Var.f(oVar);
        o1Var.b(b2Var.b());
        return true;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.native2ascii.e
    protected void d(o oVar, s sVar) throws BuildException {
        if (sVar.H2()) {
            throw new BuildException("-reverse is not supported by Kaffe");
        }
        super.d(oVar, sVar);
    }
}
