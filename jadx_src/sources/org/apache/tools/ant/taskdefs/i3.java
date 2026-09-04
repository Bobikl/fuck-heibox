package org.apache.tools.ant.taskdefs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Jikes.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class i3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f134264d = 250;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected j3 f134265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f134266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Project f134267c;

    protected i3(j3 j3Var, String str, Project project) {
        System.err.println("As of Ant 1.2 released in October 2000, the Jikes class");
        System.err.println("is considered to be dead code by the Ant developers and is unmaintained.");
        System.err.println("Don't use it!");
        this.f134265a = j3Var;
        this.f134266b = str;
        this.f134267c = project;
    }

    protected void a(String[] strArr) {
        String[] strArr2;
        File fileG = null;
        try {
            if (!org.apache.tools.ant.taskdefs.condition.z.b("windows") || strArr.length <= 250) {
                String[] strArr3 = new String[strArr.length + 1];
                strArr3[0] = this.f134266b;
                System.arraycopy(strArr, 0, strArr3, 1, strArr.length);
                strArr2 = strArr3;
            } else {
                fileG = org.apache.tools.ant.util.j0.O().G(this.f134267c, "jikes", "tmp", null, false, true);
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileG));
                    try {
                        for (String str : strArr) {
                            bufferedWriter.write(str);
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.flush();
                        strArr2 = new String[]{this.f134266b, "@" + fileG.getAbsolutePath()};
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    throw new BuildException("Error creating temporary file", e10);
                }
            }
            try {
                n1 n1Var = new n1(this.f134265a);
                n1Var.w(this.f134267c);
                n1Var.E(this.f134267c.Z());
                n1Var.x(strArr2);
                n1Var.e();
                if (fileG == null || fileG.delete()) {
                    return;
                }
                fileG.deleteOnExit();
            } catch (IOException e11) {
                throw new BuildException("Error running Jikes compiler", e11);
            }
        } catch (Throwable th4) {
            if (fileG != null && !fileG.delete()) {
                fileG.deleteOnExit();
            }
            throw th4;
        }
    }
}
