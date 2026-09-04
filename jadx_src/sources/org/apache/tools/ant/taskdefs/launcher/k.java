package org.apache.tools.ant.taskdefs.launcher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: VmsCommandLauncher.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends e {
    private File n(Project project, String[] strArr, String[] strArr2) throws IOException {
        File fileG = c.f134467a.G(project, "ANT", ".COM", null, true, true);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileG));
        if (strArr2 != null) {
            try {
                for (String str : strArr2) {
                    int iIndexOf = str.indexOf(61);
                    if (iIndexOf != -1) {
                        bufferedWriter.write("$ DEFINE/NOLOG ");
                        bufferedWriter.write(str.substring(0, iIndexOf));
                        bufferedWriter.write(" \"");
                        bufferedWriter.write(str.substring(iIndexOf + 1));
                        bufferedWriter.write(34);
                        bufferedWriter.newLine();
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        bufferedWriter.write("$ " + strArr[0]);
        for (int i10 = 1; i10 < strArr.length; i10++) {
            bufferedWriter.write(" -");
            bufferedWriter.newLine();
            bufferedWriter.write(strArr[i10]);
        }
        bufferedWriter.close();
        return fileG;
    }

    private void o(final File file, final Process process) {
        new Thread(new Runnable() { // from class: org.apache.tools.ant.taskdefs.launcher.j
            @Override // java.lang.Runnable
            public final void run() {
                k.p(process, file);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Process process, File file) {
        try {
            process.waitFor();
        } catch (InterruptedException unused) {
        }
        j0.H(file);
    }

    @Override // org.apache.tools.ant.taskdefs.launcher.c
    public Process c(Project project, String[] strArr, String[] strArr2) throws IOException {
        File fileN = n(project, strArr, strArr2);
        Process processC = super.c(project, new String[]{fileN.getPath()}, strArr2);
        o(fileN, processC);
        return processC;
    }

    @Override // org.apache.tools.ant.taskdefs.launcher.e, org.apache.tools.ant.taskdefs.launcher.c
    public Process d(Project project, String[] strArr, String[] strArr2, File file) throws IOException {
        File fileN = n(project, strArr, strArr2);
        Process processD = super.d(project, new String[]{fileN.getPath()}, strArr2, file);
        o(fileN, processD);
        return processD;
    }
}
