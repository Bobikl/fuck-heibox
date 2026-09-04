package org.apache.tools.ant.types;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ArchiveScanner.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l extends org.apache.tools.ant.v0 {
    protected File L;
    private s1 M;
    private s1 N;
    private String S;
    private Map<String, s1> O = new TreeMap();
    private Map<String, s1> P = new TreeMap();
    private Map<String, s1> Q = new TreeMap();
    private Map<String, s1> R = new TreeMap();
    private boolean T = true;

    private void U0() {
        if (this.M.p2() || this.T) {
            s1 s1Var = new s1(this.M.k2(), this.M.p2(), this.M.i2());
            s1 s1Var2 = this.N;
            if (s1Var2 != null && s1Var2.k2().equals(s1Var.k2()) && this.N.i2() == s1Var.i2()) {
                return;
            }
            S0();
            this.O.clear();
            this.P.clear();
            this.Q.clear();
            this.R.clear();
            P0(this.M, this.S, this.O, this.Q, this.P, this.R);
            this.N = s1Var;
        }
    }

    protected static final String Z0(String str) {
        return str.endsWith("/") ? str.substring(0, str.length() - 1) : str;
    }

    protected abstract void P0(s1 s1Var, String str, Map<String, s1> map, Map<String, s1> map2, Map<String, s1> map3, Map<String, s1> map4);

    Iterator<s1> Q0(Project project) {
        if (this.M == null) {
            return new org.apache.tools.ant.types.resources.a0(project, f(), j());
        }
        U0();
        return this.R.values().iterator();
    }

    Iterator<s1> R0(Project project) {
        if (this.M == null) {
            return new org.apache.tools.ant.types.resources.a0(project, f(), m());
        }
        U0();
        return this.Q.values().iterator();
    }

    public void S0() {
        if (this.f137053c == null) {
            this.f137053c = new String[]{org.apache.tools.ant.types.selectors.m0.f136554a};
        }
        if (this.f137054d == null) {
            this.f137054d = new String[0];
        }
    }

    public boolean T0(String str) {
        if (!str.isEmpty()) {
            str = str.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar);
            if (str.charAt(0) == File.separatorChar) {
                str = str.substring(1);
            }
        }
        return h0(str) && !e0(str);
    }

    public void V0(String str) {
        this.S = str;
    }

    @Override // org.apache.tools.ant.v0
    public int W() {
        if (this.M == null) {
            return super.W();
        }
        U0();
        return this.R.size();
    }

    public void W0(boolean z10) {
        this.T = z10;
    }

    @Override // org.apache.tools.ant.v0
    public int X() {
        if (this.M == null) {
            return super.X();
        }
        U0();
        return this.Q.size();
    }

    public void X0(File file) {
        Y0(new org.apache.tools.ant.types.resources.z(file));
    }

    public void Y0(s1 s1Var) {
        this.M = s1Var;
        org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
        if (yVar != null) {
            this.L = yVar.l0();
        }
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public void e() {
        s1 s1Var = this.M;
        if (s1Var != null) {
            if (s1Var.p2() || this.T) {
                super.e();
            }
        }
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public String[] j() {
        if (this.M == null) {
            return super.j();
        }
        U0();
        return (String[]) this.R.keySet().toArray(new String[this.R.size()]);
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.h1
    public String[] m() {
        if (this.M == null) {
            return super.m();
        }
        U0();
        return (String[]) this.Q.keySet().toArray(new String[this.Q.size()]);
    }

    @Override // org.apache.tools.ant.v0, org.apache.tools.ant.types.v1
    public s1 o(String str) {
        if (this.M == null) {
            return super.o(str);
        }
        if (str.isEmpty()) {
            return new s1("", true, Long.MAX_VALUE, true);
        }
        U0();
        if (this.O.containsKey(str)) {
            return this.O.get(str);
        }
        String strZ0 = Z0(str);
        return this.P.containsKey(strZ0) ? this.P.get(strZ0) : new s1(strZ0);
    }
}
