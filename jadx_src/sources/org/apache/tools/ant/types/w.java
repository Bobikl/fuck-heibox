package org.apache.tools.ant.types;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: EnumeratedAttribute.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f136650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f136651b = -1;

    protected w() {
    }

    public static w c(Class<? extends w> cls, String str) throws BuildException {
        if (!w.class.isAssignableFrom(cls)) {
            throw new BuildException("You have to provide a subclass from EnumeratedAttribute as clazz-parameter.");
        }
        try {
            w wVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            wVarNewInstance.g(str);
            return wVarNewInstance;
        } catch (Exception e10) {
            throw new BuildException(e10);
        }
    }

    public final boolean a(String str) {
        return f(str) != -1;
    }

    public final int b() {
        return this.f136651b;
    }

    public final String d() {
        return this.f136650a;
    }

    public abstract String[] e();

    public final int f(String str) {
        String[] strArrE = e();
        if (strArrE != null && str != null) {
            for (int i10 = 0; i10 < strArrE.length; i10++) {
                if (str.equals(strArrE[i10])) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public void g(String str) throws BuildException {
        int iF = f(str);
        if (iF != -1) {
            this.f136651b = iF;
            this.f136650a = str;
        } else {
            throw new BuildException(str + " is not a legal value for this attribute");
        }
    }

    public String toString() {
        return d();
    }
}
