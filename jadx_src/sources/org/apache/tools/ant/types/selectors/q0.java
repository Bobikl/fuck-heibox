package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: TokenizedPath.java */
/* JADX INFO: loaded from: classes5.dex */
public class q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f136612c = new q0("", new String[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136613d = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean[] f136614e = {true};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean[] f136615f = {true, false};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f136616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f136617b;

    public q0(String str) {
        this(str, m0.t(str));
    }

    q0(String str, String[] strArr) {
        this.f136616a = str;
        this.f136617b = strArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    /* JADX WARN: Instruction removed from duplicated block: B:7:0x0034, please report this as an issue */
    public q0(q0 q0Var, String str) {
        if (q0Var.f136616a.isEmpty()) {
            this.f136616a = q0Var.f136616a + str;
        } else {
            String str2 = q0Var.f136616a;
            if (str2.charAt(str2.length() - 1) != File.separatorChar) {
                this.f136616a = q0Var.f136616a + File.separatorChar + str;
            } else {
                this.f136616a = q0Var.f136616a + str;
            }
        }
        String[] strArr = new String[q0Var.f136617b.length + 1];
        this.f136617b = strArr;
        String[] strArr2 = q0Var.f136617b;
        System.arraycopy(strArr2, 0, strArr, 0, strArr2.length);
        strArr[q0Var.f136617b.length] = str;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x003f  */
    private static File c(File file, String[] strArr, boolean z10) {
        for (String str : strArr) {
            if (!file.isDirectory()) {
                return null;
            }
            String[] list = file.list();
            if (list == null) {
                throw new BuildException("IO error scanning directory %s", file.getAbsolutePath());
            }
            boolean[] zArr = z10 ? f136614e : f136615f;
            boolean z11 = false;
            for (int i10 = 0; !z11 && i10 < zArr.length; i10++) {
                for (int i11 = 0; !z11 && i11 < list.length; i11++) {
                    if (zArr[i10]) {
                        if (list[i11].equals(str)) {
                            file = new File(file, list[i11]);
                            z11 = true;
                        }
                    } else if (list[i11].equalsIgnoreCase(str)) {
                        file = new File(file, list[i11]);
                        z11 = true;
                    }
                }
            }
            if (!z11) {
                return null;
            }
        }
        if (strArr.length != 0 || file.isDirectory()) {
            return file;
        }
        return null;
    }

    public int a() {
        return this.f136617b.length;
    }

    public File b(File file, boolean z10) {
        String[] strArrT = this.f136617b;
        if (org.apache.tools.ant.util.j0.V(this.f136616a)) {
            if (file == null) {
                String[] strArrI = f136613d.I(this.f136616a);
                File file2 = new File(strArrI[0]);
                strArrT = m0.t(strArrI[1]);
                file = file2;
            } else {
                org.apache.tools.ant.util.j0 j0Var = f136613d;
                File fileI0 = j0Var.i0(this.f136616a);
                String strL0 = j0Var.l0(file, fileI0);
                if (strL0.equals(fileI0.getAbsolutePath())) {
                    return null;
                }
                strArrT = m0.t(strL0);
            }
        }
        return c(file, strArrT, z10);
    }

    String[] d() {
        return this.f136617b;
    }

    public boolean e(File file) {
        String[] strArr = this.f136617b;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            if (Files.isSymbolicLink(file == null ? Paths.get(str, new String[0]) : Paths.get(file.toPath().toString(), str))) {
                return true;
            }
            i10++;
            file = new File(file, str);
        }
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q0) && this.f136616a.equals(((q0) obj).f136616a);
    }

    public r0 f() {
        return new r0(this.f136616a, this.f136617b);
    }

    public int hashCode() {
        return this.f136616a.hashCode();
    }

    public String toString() {
        return this.f136616a;
    }
}
