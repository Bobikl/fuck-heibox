package org.apache.tools.ant.taskdefs.optional.native2ascii;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.taskdefs.optional.s;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: SunNative2Ascii.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f135285a = "sun";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f135286b = "sun.tools.native2ascii.Main";

    @Override // org.apache.tools.ant.taskdefs.optional.native2ascii.e
    protected boolean c(o oVar, b2 b2Var) throws BuildException {
        try {
            Class<?> cls = Class.forName(f135286b);
            return Boolean.TRUE.equals(cls.getMethod("convert", String[].class).invoke(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), oVar.r()));
        } catch (NoSuchMethodException unused) {
            throw new BuildException("Could not find convert() method in %s", f135286b);
        } catch (BuildException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new BuildException("Error starting Sun's native2ascii: ", e11);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.native2ascii.e
    protected void d(o oVar, s sVar) throws BuildException {
        if (sVar.H2()) {
            oVar.h().O1("-reverse");
        }
        super.d(oVar, sVar);
    }
}
