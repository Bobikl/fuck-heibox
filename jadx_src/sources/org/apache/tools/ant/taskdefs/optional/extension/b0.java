package org.apache.tools.ant.taskdefs.optional.extension;

import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.text.ParseException;
import java.util.jar.Manifest;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.y1;

/* JADX INFO: compiled from: LibraryDisplayer.java */
/* JADX INFO: loaded from: classes5.dex */
public class b0 {
    b0() {
    }

    private void c(f0 f0Var) {
        String[] strArrG = f0Var.g();
        if (strArrG != null) {
            System.out.print("Sections:  ");
            System.out.println(y1.a(" ", strArrG));
        }
        System.out.println(f0Var.toString());
    }

    private f0[] d(Manifest manifest) throws BuildException {
        try {
            return f0.l(manifest);
        } catch (ParseException e10) {
            throw new BuildException(e10.getMessage(), e10);
        }
    }

    private void e(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            System.out.print(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        }
        System.out.println();
    }

    void a(File file) throws BuildException {
        b(file, p.d(file));
    }

    void b(File file, Manifest manifest) throws BuildException {
        j[] jVarArrF = j.f(manifest);
        j[] jVarArrQ = j.q(manifest);
        j[] jVarArrP = j.p(manifest);
        f0[] f0VarArrD = d(manifest);
        if (jVarArrF.length == 0 && jVarArrQ.length == 0 && jVarArrP.length == 0 && f0VarArrD.length == 0) {
            return;
        }
        String str = "File: " + file;
        int length = str.length();
        e(length);
        System.out.println(str);
        e(length);
        if (jVarArrF.length != 0) {
            System.out.println("Extensions Supported By Library:");
            for (j jVar : jVarArrF) {
                System.out.println(jVar);
            }
        }
        if (jVarArrQ.length != 0) {
            System.out.println("Extensions Required By Library:");
            for (j jVar2 : jVarArrQ) {
                System.out.println(jVar2);
            }
        }
        if (jVarArrP.length != 0) {
            System.out.println("Extensions that will be used by Library if present:");
            for (j jVar3 : jVarArrP) {
                System.out.println(jVar3);
            }
        }
        if (f0VarArrD.length != 0) {
            System.out.println("Specifications Supported By Library:");
            for (f0 f0Var : f0VarArrD) {
                c(f0Var);
            }
        }
    }
}
