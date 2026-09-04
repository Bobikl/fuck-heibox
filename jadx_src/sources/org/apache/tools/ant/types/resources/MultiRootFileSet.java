package org.apache.tools.ant.types.resources;

import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: loaded from: classes5.dex */
public class MultiRootFileSet extends org.apache.tools.ant.types.i implements org.apache.tools.ant.types.u1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private SetType f136312r = SetType.file;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f136313s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<File> f136314t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private w1 f136315u;

    public enum SetType {
        file,
        dir,
        both
    }

    public static class b extends org.apache.tools.ant.types.i implements org.apache.tools.ant.types.u1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final SetType f136316r;

        private b(MultiRootFileSet multiRootFileSet, SetType setType, File file) {
            super(multiRootFileSet);
            this.f136316r = setType;
            R2(file);
        }

        @Override // org.apache.tools.ant.types.u1
        public boolean O() {
            return true;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ boolean isEmpty() {
            return org.apache.tools.ant.types.t1.a(this);
        }

        @Override // java.lang.Iterable
        public Iterator<org.apache.tools.ant.types.s1> iterator() {
            org.apache.tools.ant.v0 v0VarA2 = A2();
            String[] strArrM = this.f136316r == SetType.file ? v0VarA2.m() : v0VarA2.j();
            if (this.f136316r == SetType.both) {
                String[] strArrM2 = v0VarA2.m();
                String[] strArr = new String[strArrM.length + strArrM2.length];
                System.arraycopy(strArrM, 0, strArr, 0, strArrM.length);
                System.arraycopy(strArrM2, 0, strArr, strArrM.length, strArrM2.length);
                strArrM = strArr;
            }
            return new a0(b(), z2(b()), strArrM);
        }

        @Override // org.apache.tools.ant.types.u1
        public int size() {
            org.apache.tools.ant.v0 v0VarA2 = A2();
            int iX = this.f136316r == SetType.file ? v0VarA2.X() : v0VarA2.W();
            return this.f136316r == SetType.both ? iX + v0VarA2.X() : iX;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ Stream stream() {
            return org.apache.tools.ant.types.t1.b(this);
        }
    }

    private MultiRootFileSet d3() {
        return (MultiRootFileSet) O1(MultiRootFileSet.class);
    }

    private synchronized w1 e3() {
        w1 w1Var;
        if (this.f136313s && (w1Var = this.f136315u) != null) {
            return w1Var;
        }
        w1 w1Var2 = new w1();
        i3(w1Var2);
        if (this.f136313s) {
            this.f136315u = w1Var2;
        }
        return w1Var2;
    }

    private void i3(w1 w1Var) {
        Iterator<File> it = this.f136314t.iterator();
        while (it.hasNext()) {
            w1Var.f2(new b(this.f136312r, it.next()));
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public boolean O() {
        return true;
    }

    @Override // org.apache.tools.ant.types.i
    public void R2(File file) {
        throw new BuildException(U1() + " doesn't support the dir attribute");
    }

    @Override // org.apache.tools.ant.types.i, org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (!this.f136314t.isEmpty()) {
            throw d2();
        }
        super.c2(q1Var);
    }

    public void c3(z zVar) {
        if (Y1()) {
            throw Z1();
        }
        this.f136314t.add(zVar.l0());
    }

    @Override // org.apache.tools.ant.types.i, org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        if (Y1()) {
            return d3().clone();
        }
        MultiRootFileSet multiRootFileSet = (MultiRootFileSet) super.clone();
        multiRootFileSet.f136314t = new ArrayList(this.f136314t);
        multiRootFileSet.f136315u = null;
        return multiRootFileSet;
    }

    public void f3(String str) {
        if (Y1()) {
            throw d2();
        }
        if (str == null || str.isEmpty()) {
            return;
        }
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            this.f136314t.add(b().W0(str2));
        }
    }

    public synchronized void g3(boolean z10) {
        if (Y1()) {
            throw d2();
        }
        this.f136313s = z10;
    }

    public void h3(SetType setType) {
        if (Y1()) {
            throw d2();
        }
        this.f136312r = setType;
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return org.apache.tools.ant.types.t1.a(this);
    }

    @Override // java.lang.Iterable
    public Iterator<org.apache.tools.ant.types.s1> iterator() {
        return Y1() ? d3().iterator() : e3().iterator();
    }

    @Override // org.apache.tools.ant.types.u1
    public int size() {
        return Y1() ? d3().size() : e3().size();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return org.apache.tools.ant.types.t1.b(this);
    }

    @Override // org.apache.tools.ant.types.i, org.apache.tools.ant.types.s
    public String toString() {
        return Y1() ? d3().toString() : e3().toString();
    }
}
