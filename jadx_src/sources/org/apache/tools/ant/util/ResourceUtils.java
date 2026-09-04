package org.apache.tools.ant.util;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import org.apache.tools.ant.Project;

/* JADX INFO: loaded from: classes5.dex */
public class ResourceUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j0 f136718a = j0.O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final String f136719b = "ISO-8859-1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f136720c = 16777216;

    public static class ReadOnlyTargetFileException extends IOException {
        private static final long serialVersionUID = 1;

        public ReadOnlyTargetFileException(File file) {
            super("can't write to read-only destination file " + file);
        }
    }

    public interface a {
        org.apache.tools.ant.types.resources.selectors.n a(org.apache.tools.ant.types.s1 s1Var);
    }

    public static org.apache.tools.ant.types.s1[] A(org.apache.tools.ant.b2 b2Var, org.apache.tools.ant.types.s1[] s1VarArr, g0 g0Var, org.apache.tools.ant.types.v1 v1Var, long j10) {
        org.apache.tools.ant.types.resources.w1 w1Var = new org.apache.tools.ant.types.resources.w1();
        w1Var.g2(Arrays.asList(s1VarArr));
        org.apache.tools.ant.types.u1 u1VarY = y(b2Var, w1Var, g0Var, v1Var, j10);
        return u1VarY.size() == 0 ? new org.apache.tools.ant.types.s1[0] : ((org.apache.tools.ant.types.resources.w1) u1VarY).y2();
    }

    public static org.apache.tools.ant.types.u1 B(org.apache.tools.ant.b2 b2Var, org.apache.tools.ant.types.u1 u1Var, g0 g0Var, org.apache.tools.ant.types.v1 v1Var, a aVar) {
        if (u1Var.isEmpty()) {
            b2Var.x1("No sources found.", 3);
            return org.apache.tools.ant.types.resources.f1.f136356j;
        }
        org.apache.tools.ant.types.resources.w1 w1VarT2 = org.apache.tools.ant.types.resources.w1.t2(u1Var);
        org.apache.tools.ant.types.resources.w1 w1Var = new org.apache.tools.ant.types.resources.w1();
        for (org.apache.tools.ant.types.s1 s1Var : w1VarT2) {
            String strK2 = s1Var.k2();
            if (strK2 != null) {
                strK2 = strK2.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar);
            }
            String[] strArrY0 = null;
            try {
                strArrY0 = g0Var.y0(strK2);
            } catch (Exception e10) {
                b2Var.x1("Caught " + e10 + " mapping resource " + s1Var, 3);
            }
            if (strArrY0 == null || strArrY0.length == 0) {
                b2Var.x1(s1Var + " skipped - don't know how to handle it", 3);
            } else {
                org.apache.tools.ant.types.resources.w1 w1Var2 = new org.apache.tools.ant.types.resources.w1();
                for (String str : strArrY0) {
                    if (str == null) {
                        str = "(no name)";
                    }
                    w1Var2.f2(v1Var.o(str.replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX)));
                }
                org.apache.tools.ant.types.resources.i1 i1Var = new org.apache.tools.ant.types.resources.i1();
                i1Var.e2(aVar.a(s1Var));
                i1Var.i2(w1Var2);
                if (i1Var.size() > 0) {
                    w1Var.f2(s1Var);
                    org.apache.tools.ant.types.s1 next = i1Var.iterator().next();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(s1Var.k2());
                    sb2.append(" added as ");
                    sb2.append(next.k2());
                    sb2.append(next.p2() ? " is outdated." : " doesn't exist.");
                    b2Var.x1(sb2.toString(), 3);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(s1Var.k2());
                    sb3.append(" omitted as ");
                    sb3.append(w1Var2.toString());
                    sb3.append(w1Var2.size() == 1 ? " is" : " are ");
                    sb3.append(" up to date.");
                    b2Var.x1(sb3.toString(), 3);
                }
            }
        }
        return w1Var;
    }

    public static void C(org.apache.tools.ant.types.resources.o1 o1Var, long j10) {
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        o1Var.Z0(j10);
    }

    private static int D(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s1Var.h2()));
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(s1Var2.h2()));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    String line2 = bufferedReader2.readLine();
                    if (!line.equals(line2)) {
                        if (line2 == null) {
                            bufferedReader2.close();
                            bufferedReader.close();
                            return 1;
                        }
                        int iCompareTo = line.compareTo(line2);
                        bufferedReader2.close();
                        bufferedReader.close();
                        return iCompareTo;
                    }
                }
                int i10 = bufferedReader2.readLine() == null ? 0 : -1;
                bufferedReader2.close();
                bufferedReader.close();
                return i10;
            } catch (Throwable th2) {
                try {
                    bufferedReader2.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                bufferedReader.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private static boolean c(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2) throws IOException {
        if (s1Var == null || s1Var2 == null) {
            return false;
        }
        org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
        org.apache.tools.ant.types.resources.y yVar2 = (org.apache.tools.ant.types.resources.y) s1Var2.e2(org.apache.tools.ant.types.resources.y.class);
        return (yVar == null || yVar2 == null || !j0.O().b(yVar.l0(), yVar2.l0())) ? false : true;
    }

    public static org.apache.tools.ant.types.resources.z d(org.apache.tools.ant.types.resources.y yVar) {
        return ((yVar instanceof org.apache.tools.ant.types.resources.z) || yVar == null) ? (org.apache.tools.ant.types.resources.z) yVar : new org.apache.tools.ant.types.resources.z(Project.s0(yVar), yVar.l0());
    }

    private static int e(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2) throws IOException {
        int i10;
        int i11;
        int i12;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(s1Var.h2());
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(s1Var2.h2());
            do {
                try {
                    i10 = bufferedInputStream.read();
                    if (i10 == -1) {
                        i11 = bufferedInputStream2.read() == -1 ? 0 : -1;
                        bufferedInputStream2.close();
                        bufferedInputStream.close();
                        return i11;
                    }
                    i12 = bufferedInputStream2.read();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                try {
                    bufferedInputStream.close();
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
                throw th;
            } while (i10 == i12);
            i11 = i10 > i12 ? 1 : -1;
            bufferedInputStream2.close();
            bufferedInputStream.close();
            return i11;
        } catch (Throwable th5) {
            bufferedInputStream.close();
            throw th5;
        }
    }

    private static Charset f(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static int g(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2, boolean z10) throws IOException {
        if (s1Var.equals(s1Var2)) {
            return 0;
        }
        boolean zP2 = s1Var.p2();
        boolean zP3 = s1Var2.p2();
        if (!zP2 && !zP3) {
            return 0;
        }
        if (zP2 != zP3) {
            return zP2 ? 1 : -1;
        }
        boolean zO2 = s1Var.o2();
        boolean zO3 = s1Var2.o2();
        if (zO2 && zO3) {
            return 0;
        }
        if (zO2 || zO3) {
            return zO2 ? -1 : 1;
        }
        return z10 ? D(s1Var, s1Var2) : e(s1Var, s1Var2);
    }

    public static boolean h(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2, boolean z10) throws IOException {
        if (s1Var.p2() != s1Var2.p2()) {
            return false;
        }
        if (!s1Var.p2()) {
            return true;
        }
        if (s1Var.o2() || s1Var2.o2()) {
            return false;
        }
        if (s1Var.equals(s1Var2)) {
            return true;
        }
        if (!z10) {
            long jN2 = s1Var.n2();
            long jN3 = s1Var2.n2();
            if (jN2 != -1 && jN3 != -1 && jN2 != jN3) {
                return false;
            }
        }
        return g(s1Var, s1Var2, z10) == 0;
    }

    public static void i(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2) throws IOException {
        j(s1Var, s1Var2, null);
    }

    public static void j(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2, Project project) throws IOException {
        k(s1Var, s1Var2, null, null, false, false, null, null, project);
    }

    public static void k(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2, org.apache.tools.ant.types.h0 h0Var, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, boolean z11, String str, String str2, Project project) throws IOException {
        l(s1Var, s1Var2, h0Var, vector, z10, z11, false, str, str2, project);
    }

    public static void l(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2, org.apache.tools.ant.types.h0 h0Var, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, boolean z11, boolean z12, String str, String str2, Project project) throws IOException {
        m(s1Var, s1Var2, h0Var, vector, z10, z11, z12, str, str2, project, false);
    }

    public static void m(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2, org.apache.tools.ant.types.h0 h0Var, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, boolean z11, boolean z12, String str, String str2, Project project, boolean z13) throws IOException {
        org.apache.tools.ant.types.resources.o1 o1Var;
        if (z10 || org.apache.tools.ant.types.selectors.m0.g(s1Var, s1Var2, j0.O().M())) {
            boolean z14 = false;
            boolean z15 = h0Var != null && h0Var.b();
            boolean z16 = (vector == null || vector.isEmpty()) ? false : true;
            String strZ2 = s1Var instanceof org.apache.tools.ant.types.resources.l1 ? ((org.apache.tools.ant.types.resources.l1) s1Var).z2() : str;
            File fileL0 = s1Var2.e2(org.apache.tools.ant.types.resources.y.class) != null ? ((org.apache.tools.ant.types.resources.y) s1Var2.e2(org.apache.tools.ant.types.resources.y.class)).l0() : null;
            if (fileL0 != null && fileL0.isFile() && !fileL0.canWrite()) {
                if (!z13) {
                    throw new ReadOnlyTargetFileException(fileL0);
                }
                if (!f136718a.t0(fileL0)) {
                    throw new IOException("failed to delete read-only destination file " + fileL0);
                }
            }
            if (z15) {
                q(s1Var, s1Var2, h0Var, vector, z12, strZ2, str2, project);
            } else if (z16 || (!(strZ2 == null || strZ2.equals(str2)) || (strZ2 == null && str2 != null))) {
                p(s1Var, s1Var2, vector, z12, strZ2, str2, project);
            } else {
                if (s1Var.e2(org.apache.tools.ant.types.resources.y.class) != null && fileL0 != null && !z12) {
                    File fileL1 = ((org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class)).l0();
                    try {
                        n(fileL1, fileL0, project);
                        z14 = true;
                    } catch (IOException e10) {
                        String str3 = "Attempt to copy " + fileL1 + " to " + fileL0 + " using NIO Channels failed due to '" + e10.getMessage() + "'.  Falling back to streams.";
                        if (project != null) {
                            project.M0(str3, 1);
                        } else {
                            System.err.println(str3);
                        }
                    }
                }
                if (!z14) {
                    o(s1Var, s1Var2, z12, project);
                }
            }
            if (!z11 || (o1Var = (org.apache.tools.ant.types.resources.o1) s1Var2.e2(org.apache.tools.ant.types.resources.o1.class)) == null) {
                return;
            }
            C(o1Var, s1Var.i2());
        }
    }

    private static void n(File file, File file2, Project project) throws IOException {
        if (j0.O().b(file, file2)) {
            v(project, "Skipping (self) copy of " + file + " to " + file2);
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException("failed to create the parent directory for " + file2);
        }
        FileChannel fileChannelOpen = FileChannel.open(file.toPath(), StandardOpenOption.READ);
        try {
            FileChannel fileChannelOpen2 = FileChannel.open(file2.toPath(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
            try {
                long size = fileChannelOpen.size();
                for (long jTransferFrom = 0; jTransferFrom < size; jTransferFrom += fileChannelOpen2.transferFrom(fileChannelOpen, jTransferFrom, Math.min(f136720c, size - jTransferFrom))) {
                }
                if (fileChannelOpen2 != null) {
                    fileChannelOpen2.close();
                }
                fileChannelOpen.close();
            } catch (Throwable th2) {
                if (fileChannelOpen2 != null) {
                    try {
                        fileChannelOpen2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (fileChannelOpen != null) {
                try {
                    fileChannelOpen.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    private static void o(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2, boolean z10, Project project) throws IOException {
        if (c(s1Var, s1Var2)) {
            v(project, "Skipping (self) copy of " + s1Var + " to " + s1Var2);
            return;
        }
        InputStream inputStreamH2 = s1Var.h2();
        try {
            OutputStream outputStreamS = s(s1Var2, z10, project);
            try {
                byte[] bArr = new byte[8192];
                int i10 = 0;
                do {
                    outputStreamS.write(bArr, 0, i10);
                    i10 = inputStreamH2.read(bArr, 0, 8192);
                } while (i10 != -1);
                outputStreamS.close();
                inputStreamH2.close();
            } catch (Throwable th2) {
                if (outputStreamS != null) {
                    try {
                        outputStreamS.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (inputStreamH2 != null) {
                try {
                    inputStreamH2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static void p(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, String str, String str2, Project project) throws IOException {
        if (c(s1Var, s1Var2)) {
            v(project, "Skipping (self) copy of " + s1Var + " to " + s1Var2);
            return;
        }
        Reader readerR = r(project, str, vector, s1Var.h2());
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(s(s1Var2, z10, project), f(str2)));
            try {
                char[] cArr = new char[8192];
                while (true) {
                    int i10 = readerR.read(cArr, 0, 8192);
                    if (i10 == -1) {
                        bufferedWriter.close();
                        readerR.close();
                        return;
                    }
                    bufferedWriter.write(cArr, 0, i10);
                    if (readerR != null) {
                        try {
                            readerR.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (readerR != null) {
                readerR.close();
            }
            throw th5;
        }
    }

    private static void q(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.s1 s1Var2, org.apache.tools.ant.types.h0 h0Var, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, String str, String str2, Project project) throws IOException {
        if (c(s1Var, s1Var2)) {
            v(project, "Skipping (self) copy of " + s1Var + " to " + s1Var2);
            return;
        }
        Reader readerR = r(project, str, vector, s1Var.h2());
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(s(s1Var2, z10, project), f(str2)));
            try {
                z0 z0Var = new z0();
                z0Var.B1(true);
                for (String strH = z0Var.h(readerR); strH != null; strH = z0Var.h(readerR)) {
                    if (strH.isEmpty()) {
                        bufferedWriter.newLine();
                    } else {
                        bufferedWriter.write(h0Var.c(strH));
                    }
                }
                bufferedWriter.close();
                if (readerR != null) {
                    readerR.close();
                }
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (readerR != null) {
                try {
                    readerR.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    private static Reader r(Project project, String str, Vector<org.apache.tools.ant.types.c0> vector, InputStream inputStream) {
        Reader inputStreamReader = new InputStreamReader(inputStream, f(str));
        if (vector != null && !vector.isEmpty()) {
            org.apache.tools.ant.filters.util.i iVar = new org.apache.tools.ant.filters.util.i();
            iVar.k(8192);
            iVar.m(inputStreamReader);
            iVar.l(vector);
            iVar.n(project);
            inputStreamReader = iVar.f();
        }
        return new BufferedReader(inputStreamReader);
    }

    private static OutputStream s(org.apache.tools.ant.types.s1 s1Var, boolean z10, Project project) throws IOException {
        if (z10) {
            org.apache.tools.ant.types.resources.f fVar = (org.apache.tools.ant.types.resources.f) s1Var.e2(org.apache.tools.ant.types.resources.f.class);
            if (fVar != null) {
                return fVar.j();
            }
            String str = "Appendable OutputStream not available for non-appendable resource " + s1Var + "; using plain OutputStream";
            if (project != null) {
                project.M0(str, 3);
            } else {
                System.out.println(str);
            }
        }
        return s1Var.l2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean t(org.apache.tools.ant.types.s1 s1Var, long j10, org.apache.tools.ant.types.s1 s1Var2) {
        return org.apache.tools.ant.types.selectors.m0.g(s1Var, s1Var2, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.apache.tools.ant.types.resources.selectors.n u(final long j10, final org.apache.tools.ant.types.s1 s1Var) {
        return new org.apache.tools.ant.types.resources.selectors.n() { // from class: org.apache.tools.ant.util.p1
            @Override // org.apache.tools.ant.types.resources.selectors.n
            public final boolean a(org.apache.tools.ant.types.s1 s1Var2) {
                return ResourceUtils.t(s1Var, j10, s1Var2);
            }
        };
    }

    private static void v(Project project, String str) {
        w(project, str, 3);
    }

    private static void w(Project project, String str, int i10) {
        if (project == null) {
            System.out.println(str);
        } else {
            project.M0(str, i10);
        }
    }

    private static void x(org.apache.tools.ant.b2 b2Var, org.apache.tools.ant.types.u1 u1Var, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis() + j10;
        org.apache.tools.ant.types.resources.selectors.d dVar = new org.apache.tools.ant.types.resources.selectors.d();
        dVar.i(jCurrentTimeMillis);
        dVar.k(org.apache.tools.ant.types.a2.f136102f);
        org.apache.tools.ant.types.resources.i1 i1Var = new org.apache.tools.ant.types.resources.i1();
        i1Var.e2(dVar);
        i1Var.i2(u1Var);
        Iterator<org.apache.tools.ant.types.s1> it = i1Var.iterator();
        while (it.hasNext()) {
            b2Var.x1("Warning: " + it.next().k2() + " modified in the future.", 1);
        }
    }

    public static org.apache.tools.ant.types.u1 y(org.apache.tools.ant.b2 b2Var, org.apache.tools.ant.types.u1 u1Var, g0 g0Var, org.apache.tools.ant.types.v1 v1Var, final long j10) {
        x(b2Var, u1Var, j10);
        return B(b2Var, u1Var, g0Var, v1Var, new a() { // from class: org.apache.tools.ant.util.o1
            @Override // org.apache.tools.ant.util.ResourceUtils.a
            public final org.apache.tools.ant.types.resources.selectors.n a(org.apache.tools.ant.types.s1 s1Var) {
                return ResourceUtils.u(j10, s1Var);
            }
        });
    }

    public static org.apache.tools.ant.types.s1[] z(org.apache.tools.ant.b2 b2Var, org.apache.tools.ant.types.s1[] s1VarArr, g0 g0Var, org.apache.tools.ant.types.v1 v1Var) {
        return A(b2Var, s1VarArr, g0Var, v1Var, f136718a.M());
    }
}
