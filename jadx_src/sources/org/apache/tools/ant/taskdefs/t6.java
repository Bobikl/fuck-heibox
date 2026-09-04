package org.apache.tools.ant.taskdefs;

import com.umeng.analytics.pro.ak;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Sync.java */
/* JADX INFO: loaded from: classes5.dex */
public class t6 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f135801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f135802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.f1 f135803m = null;

    /* JADX INFO: compiled from: Sync.java */
    public static class a extends q0 {
        private Set<String> N = new HashSet();

        @Override // org.apache.tools.ant.taskdefs.q0
        protected Map<org.apache.tools.ant.types.s1, String[]> M2(org.apache.tools.ant.types.s1[] s1VarArr, File file) {
            t6.m2("No mapper", this.A == null);
            Stream map = Stream.of((Object[]) s1VarArr).map(new r6());
            Set<String> set = this.N;
            Objects.requireNonNull(set);
            map.forEach(new s6(set));
            return super.M2(s1VarArr, file);
        }

        @Override // org.apache.tools.ant.taskdefs.q0
        protected void N2(File file, File file2, String[] strArr, String[] strArr2) {
            t6.m2("No mapper", this.A == null);
            super.N2(file, file2, strArr, strArr2);
            Collections.addAll(this.N, strArr);
            Collections.addAll(this.N, strArr2);
        }

        @Override // org.apache.tools.ant.taskdefs.q0
        protected boolean f3() {
            return true;
        }

        public boolean i3() {
            return this.f135586v;
        }

        public File j3() {
            return this.f135577m;
        }
    }

    /* JADX INFO: compiled from: Sync.java */
    public static class b extends org.apache.tools.ant.types.i {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Boolean f135804r;

        /* JADX INFO: Access modifiers changed from: private */
        public org.apache.tools.ant.types.b0 f3(boolean z10) {
            org.apache.tools.ant.types.b0 b0Var = new org.apache.tools.ant.types.b0();
            b0Var.P2(G2());
            b0Var.W2(H2());
            b0Var.Z2(D2());
            b0Var.J(b());
            if (z10) {
                org.apache.tools.ant.types.w0 w0VarO2 = O2(b());
                b0Var.q2(w0VarO2.s2(b()));
                b0Var.p2(w0VarO2.r2(b()));
                for (org.apache.tools.ant.types.selectors.v vVar : N0(b())) {
                    b0Var.d0(vVar);
                }
                b0Var.Q2(x2());
            }
            return b0Var;
        }

        @Override // org.apache.tools.ant.types.i
        public void R2(File file) throws BuildException {
            throw new BuildException("preserveintarget doesn't support the dir attribute");
        }

        public Boolean d3() {
            return this.f135804r;
        }

        public void e3(boolean z10) {
            this.f135804r = Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m2(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new BuildException("Assertion Error: " + str);
    }

    private void n2(org.apache.tools.ant.u2 u2Var) {
        u2Var.J(b());
        u2Var.g2(K1());
        u2Var.e2(G1());
        u2Var.V1();
    }

    private Boolean o2() {
        b bVar = this.f135802l;
        if (bVar == null) {
            return null;
        }
        return bVar.d3();
    }

    private void p2(int i10, String str, String str2, String str3) {
        File fileJ3 = this.f135801k.j3();
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (i10 >= 2) {
            str2 = str3;
        }
        sb2.append(str2);
        String string = sb2.toString();
        if (i10 <= 0) {
            x1("NO " + string + " to remove from " + fileJ3, 3);
            return;
        }
        x1("Removed " + i10 + " " + string + " from " + fileJ3, 2);
    }

    private int q2(File file, boolean z10, Set<File> set) {
        if (!file.isDirectory()) {
            return 0;
        }
        File[] fileArrListFiles = file.listFiles();
        int iQ2 = 0;
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                iQ2 += q2(file2, true, set);
            }
        }
        if (fileArrListFiles.length > 0) {
            fileArrListFiles = file.listFiles();
        }
        if (fileArrListFiles.length >= 1 || !z10 || set.contains(file)) {
            return iQ2;
        }
        x1("Removing empty directory: " + file, 4);
        file.delete();
        return iQ2 + 1;
    }

    private int r2(Set<File> set) {
        int i10 = 0;
        for (File file : set) {
            String[] list = file.list();
            if (list == null || list.length == 0) {
                x1("Removing empty directory: " + file, 4);
                file.delete();
                i10++;
            }
        }
        return i10;
    }

    private int[] s2(Set<String> set, File file, Set<File> set2) {
        final org.apache.tools.ant.v0 v0Var;
        int[] iArr = {0, 0};
        String[] strArr = (String[]) set.toArray(new String[set.size() + 1]);
        strArr[set.size()] = "";
        b bVar = this.f135802l;
        if (bVar != null) {
            org.apache.tools.ant.types.b0 b0VarF3 = bVar.f3(false);
            b0VarF3.R2(file);
            org.apache.tools.ant.types.w0 w0VarO2 = this.f135802l.O2(b());
            b0VarF3.p2(w0VarO2.s2(b()));
            b0VarF3.q2(w0VarO2.r2(b()));
            b0VarF3.Q2(!this.f135802l.x2());
            org.apache.tools.ant.types.selectors.v[] vVarArrN0 = this.f135802l.N0(b());
            if (vVarArrN0.length > 0) {
                org.apache.tools.ant.types.selectors.a0 a0Var = new org.apache.tools.ant.types.selectors.a0();
                for (org.apache.tools.ant.types.selectors.v vVar : vVarArrN0) {
                    a0Var.d0(vVar);
                }
                b0VarF3.d0(a0Var);
            }
            v0Var = b0VarF3.B2(b());
        } else {
            v0Var = new org.apache.tools.ant.v0();
            v0Var.p(file);
            org.apache.tools.ant.util.j0.W(file.toPath()).ifPresent(new Consumer() { // from class: org.apache.tools.ant.taskdefs.q6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    v0Var.l(((Boolean) obj).booleanValue());
                }
            });
        }
        v0Var.K(strArr);
        v0Var.e();
        for (String str : v0Var.m()) {
            File file2 = new File(file, str);
            x1("Removing orphan file: " + file2, 4);
            file2.delete();
            iArr[1] = iArr[1] + 1;
        }
        String[] strArrJ = v0Var.j();
        for (int length = strArrJ.length - 1; length >= 0; length--) {
            File file3 = new File(file, strArrJ[length]);
            String[] list = file3.list();
            if (list == null || list.length < 1) {
                x1("Removing orphan directory: " + file3, 4);
                file3.delete();
                iArr[0] = iArr[0] + 1;
            }
        }
        Boolean boolO2 = o2();
        if (boolO2 != null && boolO2.booleanValue() != this.f135801k.i3()) {
            org.apache.tools.ant.types.b0 b0VarF4 = this.f135802l.f3(true);
            b0VarF4.R2(file);
            String[] strArrJ2 = b0VarF4.B2(b()).j();
            for (int length2 = strArrJ2.length - 1; length2 >= 0; length2--) {
                set2.add(new File(file, strArrJ2[length2]));
            }
        }
        return iArr;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File fileJ3 = this.f135801k.j3();
        Set<String> set = this.f135801k.N;
        boolean z10 = !fileJ3.exists() || fileJ3.list().length < 1;
        x1("PASS#1: Copying files to " + fileJ3, 4);
        this.f135801k.D1();
        if (z10) {
            x1("NO removing necessary in " + fileJ3, 4);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        x1("PASS#2: Removing orphan files from " + fileJ3, 4);
        int[] iArrS2 = s2(set, fileJ3, linkedHashSet);
        p2(iArrS2[0], "dangling director", "y", "ies");
        p2(iArrS2[1], "dangling file", "", ak.aB);
        if (!this.f135801k.i3() || o2() == Boolean.FALSE) {
            x1("PASS#3: Removing empty directories from " + fileJ3, 4);
            p2(!this.f135801k.i3() ? q2(fileJ3, false, linkedHashSet) : r2(linkedHashSet), "empty director", "y", "ies");
        }
    }

    @Override // org.apache.tools.ant.u2
    public void V1() throws BuildException {
        a aVar = new a();
        this.f135801k = aVar;
        n2(aVar);
        this.f135801k.S2(false);
        this.f135801k.W2(false);
        this.f135801k.a3(true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void j2(org.apache.tools.ant.types.u1 u1Var) {
        if ((u1Var instanceof org.apache.tools.ant.types.b0) && u1Var.O()) {
            this.f135801k.m2(u1Var);
            return;
        }
        if (this.f135803m == null) {
            org.apache.tools.ant.types.resources.i1 i1Var = new org.apache.tools.ant.types.resources.i1();
            i1Var.e2(new org.apache.tools.ant.types.resources.selectors.e());
            org.apache.tools.ant.types.resources.f1 f1Var = new org.apache.tools.ant.types.resources.f1();
            this.f135803m = f1Var;
            i1Var.i2(f1Var);
            this.f135801k.m2(i1Var);
        }
        this.f135803m.g2(u1Var);
    }

    public void k2(org.apache.tools.ant.types.b0 b0Var) {
        j2(b0Var);
    }

    public void l2(b bVar) {
        if (this.f135802l != null) {
            throw new BuildException("you must not specify multiple preserveintarget elements.");
        }
        this.f135802l = bVar;
    }

    public void t2(boolean z10) {
        this.f135801k.Q2(z10);
    }

    public void u2(long j10) {
        this.f135801k.V2(j10);
    }

    public void v2(boolean z10) {
        this.f135801k.W2(z10);
    }

    public void w2(boolean z10) {
        this.f135801k.Y2(z10);
    }

    public void x2(File file) {
        this.f135801k.c3(file);
    }

    public void y2(boolean z10) {
        this.f135801k.e3(z10);
    }
}
