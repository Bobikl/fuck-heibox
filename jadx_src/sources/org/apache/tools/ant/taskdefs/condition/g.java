package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Equals.java */
/* JADX INFO: loaded from: classes5.dex */
public class g implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f133890h = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f133891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f133892c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f133895f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f133893d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f133894e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133896g = false;

    private void c(Object obj) {
        this.f133891b = obj;
        this.f133895f |= 1;
    }

    private void g(Object obj) {
        this.f133892c = obj;
        this.f133895f |= 2;
    }

    public void a(Object obj) {
        if (obj instanceof String) {
            b((String) obj);
        } else {
            c(obj);
        }
    }

    public void b(String str) {
        c(str);
    }

    public void d(Object obj) {
        if (obj instanceof String) {
            f((String) obj);
        } else {
            g(obj);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        if ((this.f133895f & 3) != 3) {
            throw new BuildException("both arg1 and arg2 are required in equals");
        }
        Object obj = this.f133891b;
        Object obj2 = this.f133892c;
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        if (this.f133896g) {
            Object string = this.f133891b;
            if (string != null && !(string instanceof String)) {
                string = string.toString();
            }
            this.f133891b = string;
            Object string2 = this.f133892c;
            if (string2 != null && !(string2 instanceof String)) {
                string2 = string2.toString();
            }
            this.f133892c = string2;
        }
        Object obj3 = this.f133891b;
        if ((obj3 instanceof String) && this.f133893d) {
            this.f133891b = ((String) obj3).trim();
        }
        Object obj4 = this.f133892c;
        if ((obj4 instanceof String) && this.f133893d) {
            this.f133892c = ((String) obj4).trim();
        }
        Object obj5 = this.f133891b;
        if (!(obj5 instanceof String)) {
            return false;
        }
        Object obj6 = this.f133892c;
        if (!(obj6 instanceof String)) {
            return false;
        }
        String str = (String) obj5;
        String str2 = (String) obj6;
        return this.f133894e ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public void f(String str) {
        g(str);
    }

    public void h(boolean z10) {
        this.f133894e = z10;
    }

    public void i(boolean z10) {
        this.f133896g = z10;
    }

    public void j(boolean z10) {
        this.f133893d = z10;
    }
}
