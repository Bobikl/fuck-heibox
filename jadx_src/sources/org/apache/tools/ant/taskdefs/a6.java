package org.apache.tools.ant.taskdefs;

import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.Vector;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: SQLExec.java */
/* JADX INFO: loaded from: classes5.dex */
public class a6 extends k2 {
    private org.apache.tools.ant.types.resources.w1 B;
    private boolean T;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f133722y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f133723z = 0;
    private Connection A = null;
    private Statement C = null;
    private File D = null;
    private String E = "";
    private List<c> F = new Vector();
    private String G = ";";
    private String H = "normal";
    private boolean I = false;
    private boolean J = true;
    private boolean K = true;
    private org.apache.tools.ant.types.s1 L = null;
    private String M = null;
    private String N = "abort";
    private String O = null;
    private boolean P = false;
    private boolean Q = false;
    private boolean R = true;
    private boolean S = true;
    private boolean U = true;
    private boolean V = false;
    private String W = Constants.ACCEPT_TIME_SEPARATOR_SP;
    private String X = null;
    private boolean Y = false;
    private String Z = null;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f133719a0 = null;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f133720b0 = null;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f133721c0 = false;

    /* JADX INFO: compiled from: SQLExec.java */
    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f133724c = "normal";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f133725d = "row";

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"normal", f133725d};
        }
    }

    /* JADX INFO: compiled from: SQLExec.java */
    public static class b extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"continue", "stop", "abort"};
        }
    }

    /* JADX INFO: compiled from: SQLExec.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private org.apache.tools.ant.types.s1 f133726a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f133727b = "";

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(PrintStream printStream) throws SQLException, IOException {
            if (!this.f133727b.isEmpty()) {
                a6.this.x1("Executing commands", 2);
                a6.this.X2(new StringReader(this.f133727b), printStream);
            }
            if (this.f133726a != null) {
                a6.this.x1("Executing resource: " + this.f133726a.toString(), 2);
                InputStreamReader inputStreamReader = new InputStreamReader(this.f133726a.h2(), a6.this.O == null ? Charset.defaultCharset() : Charset.forName(a6.this.O));
                try {
                    a6.this.X2(inputStreamReader, printStream);
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }

        public void b(org.apache.tools.ant.types.u1 u1Var) {
            if (u1Var.size() != 1) {
                throw new BuildException("only single argument resource collections are supported.");
            }
            f(u1Var.iterator().next());
        }

        public void c(String str) {
            if (str != null) {
                this.f133727b += str;
            }
        }

        public void e(File file) {
            if (file != null) {
                f(new org.apache.tools.ant.types.resources.z(file));
            }
        }

        public void f(org.apache.tools.ant.types.s1 s1Var) {
            if (this.f133726a != null) {
                throw new BuildException("only one resource per transaction");
            }
            this.f133726a = s1Var;
        }
    }

    private void M2() {
        if (u2() || l2() == null || !"abort".equals(this.N)) {
            return;
        }
        try {
            l2().rollback();
        } catch (SQLException unused) {
        }
    }

    private String S2(String str) {
        if (this.X == null || str == null) {
            return str;
        }
        if (!this.f133721c0 && !str.contains(this.W) && !str.contains(this.X)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(this.X);
        char cCharAt = this.X.charAt(0);
        for (char c10 : str.toCharArray()) {
            if (c10 == cCharAt) {
                sb2.append(cCharAt);
            }
            sb2.append(c10);
        }
        sb2.append(this.X);
        return sb2.toString();
    }

    private void V2(ResultSet resultSet, int i10, PrintStream printStream) throws SQLException {
        if (!this.T || resultSet.getMetaData().getColumnType(i10) != 2004) {
            printStream.print(S2(resultSet.getString(i10)));
        } else if (resultSet.getBlob(i10) != null) {
            new k6(resultSet.getBlob(i10).getBinaryStream(), printStream).run();
        }
    }

    private void W2(SQLWarning sQLWarning, boolean z10) throws SQLException {
        if (this.V || z10) {
            for (SQLWarning nextWarning = sQLWarning; nextWarning != null; nextWarning = nextWarning.getNextWarning()) {
                x1(nextWarning + " sql warning", this.V ? 1 : 3);
            }
        }
        if (sQLWarning != null) {
            z3();
        }
        if (this.Y && sQLWarning != null) {
            throw sQLWarning;
        }
    }

    private void p3(String str, String str2) {
        if (str != null) {
            b().n1(str, str2);
        }
    }

    public void A3(String str) {
        this.f133719a0 = str;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        Connection connectionL2;
        org.apache.tools.ant.types.resources.f fVar;
        Vector vector = new Vector(this.F);
        String str = this.E;
        String strTrim = str.trim();
        this.E = strTrim;
        try {
            if (this.D == null && strTrim.isEmpty() && this.B == null && this.F.isEmpty()) {
                throw new BuildException("Source file or resource collection, transactions or sql statement must be set!", w1());
            }
            File file = this.D;
            if (file != null && !file.isFile()) {
                throw new BuildException("Source file " + this.D + " is not a file!", w1());
            }
            org.apache.tools.ant.types.resources.w1 w1Var = this.B;
            if (w1Var != null) {
                Iterator<org.apache.tools.ant.types.s1> it = w1Var.iterator();
                while (it.hasNext()) {
                    N2().f(it.next());
                }
            }
            c cVarN2 = N2();
            cVarN2.e(this.D);
            cVarN2.c(this.E);
            try {
                if (l2() == null) {
                    this.F = vector;
                    this.E = str;
                    return;
                }
                try {
                    PrintStream printStreamC = org.apache.tools.ant.util.u0.c();
                    try {
                        if (this.L != null) {
                            x1("Opening PrintStream to output Resource " + this.L, 3);
                            OutputStream outputStreamL2 = null;
                            org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) this.L.e2(org.apache.tools.ant.types.resources.y.class);
                            if (yVar != null) {
                                outputStreamL2 = org.apache.tools.ant.util.j0.h0(yVar.l0().toPath(), this.P);
                            } else {
                                if (this.P && (fVar = (org.apache.tools.ant.types.resources.f) this.L.e2(org.apache.tools.ant.types.resources.f.class)) != null) {
                                    outputStreamL2 = fVar.j();
                                }
                                if (outputStreamL2 == null) {
                                    outputStreamL2 = this.L.l2();
                                    if (this.P) {
                                        x1("Ignoring append=true for non-appendable resource " + this.L, 1);
                                    }
                                }
                            }
                            printStreamC = this.M != null ? new PrintStream((OutputStream) new BufferedOutputStream(outputStreamL2), false, this.M) : new PrintStream(new BufferedOutputStream(outputStreamL2));
                        }
                        Iterator<c> it2 = this.F.iterator();
                        while (it2.hasNext()) {
                            it2.next().d(printStreamC);
                            if (!u2()) {
                                x1("Committing transaction", 3);
                                l2().commit();
                            }
                        }
                        org.apache.tools.ant.util.j0.d(printStreamC);
                        try {
                            org.apache.tools.ant.util.j0.g(Q2());
                        } catch (SQLException unused) {
                        }
                        connectionL2 = l2();
                    } catch (Throwable th2) {
                        org.apache.tools.ant.util.j0.d(printStreamC);
                        throw th2;
                    }
                } catch (IOException | SQLException e10) {
                    M2();
                    e3();
                    if ("abort".equals(this.N)) {
                        throw new BuildException(e10, w1());
                    }
                    try {
                        org.apache.tools.ant.util.j0.g(Q2());
                    } catch (SQLException unused2) {
                    }
                    connectionL2 = l2();
                }
                org.apache.tools.ant.util.j0.g(connectionL2);
                log(this.f133722y + " of " + this.f133723z + " SQL statements executed successfully");
                this.F = vector;
                this.E = str;
            } catch (Throwable th3) {
                try {
                    org.apache.tools.ant.util.j0.g(Q2());
                } catch (SQLException unused3) {
                }
                org.apache.tools.ant.util.j0.g(l2());
                throw th3;
            }
        } catch (Throwable th4) {
            this.F = vector;
            this.E = str;
            throw th4;
        }
    }

    public void J2(org.apache.tools.ant.types.u1 u1Var) {
        if (u1Var == null) {
            throw new BuildException("Cannot add null ResourceCollection");
        }
        synchronized (this) {
            if (this.B == null) {
                this.B = new org.apache.tools.ant.types.resources.w1();
            }
        }
        this.B.f2(u1Var);
    }

    public void K2(org.apache.tools.ant.types.b0 b0Var) {
        J2(b0Var);
    }

    public void L2(String str) {
        this.E += str;
    }

    public c N2() {
        c cVar = new c();
        this.F.add(cVar);
        return cVar;
    }

    protected void O2(String str, PrintStream printStream) throws SQLException {
        if (str.trim().isEmpty()) {
            return;
        }
        ResultSet resultSet = null;
        try {
            try {
                this.f133723z++;
                x1("SQL: " + str, 3);
                boolean zExecute = Q2().execute(str);
                int updateCount = Q2().getUpdateCount();
                int i10 = 0;
                while (true) {
                    if (updateCount != -1) {
                        i10 += updateCount;
                    }
                    if (zExecute) {
                        resultSet = Q2().getResultSet();
                        W2(resultSet.getWarnings(), false);
                        resultSet.clearWarnings();
                        if (this.I) {
                            U2(resultSet, printStream);
                        }
                    }
                    zExecute = Q2().getMoreResults();
                    updateCount = Q2().getUpdateCount();
                    if (!zExecute && updateCount == -1) {
                        break;
                    }
                }
                W2(Q2().getWarnings(), false);
                Q2().clearWarnings();
                x1(i10 + " rows affected", 3);
                if (i10 != -1) {
                    r3(i10);
                }
                if (this.I && this.K) {
                    printStream.println(i10 + " rows affected");
                }
                W2(l2().getWarnings(), true);
                l2().clearWarnings();
                this.f133722y++;
            } catch (SQLException e10) {
                x1("Failed to execute: " + str, 0);
                e3();
                if (!"abort".equals(this.N)) {
                    x1(e10.toString(), 0);
                }
                if (!"continue".equals(this.N)) {
                    throw e10;
                }
            }
            org.apache.tools.ant.util.j0.g(resultSet);
        } catch (Throwable th2) {
            org.apache.tools.ant.util.j0.g(resultSet);
            throw th2;
        }
    }

    public boolean P2() {
        return this.S;
    }

    protected Statement Q2() throws SQLException {
        if (this.C == null) {
            Statement statementCreateStatement = l2().createStatement();
            this.C = statementCreateStatement;
            statementCreateStatement.setEscapeProcessing(this.R);
        }
        return this.C;
    }

    public int R2(StringBuffer stringBuffer, String str) {
        if (this.U) {
            if ((this.H.equals("normal") && org.apache.tools.ant.util.j2.a(stringBuffer, this.G)) || (this.H.equals(a.f133725d) && str.equals(this.G))) {
                return stringBuffer.length() - this.G.length();
            }
            return -1;
        }
        String strTrim = this.G.trim();
        Locale locale = Locale.ENGLISH;
        String lowerCase = strTrim.toLowerCase(locale);
        if (!"normal".equals(this.H)) {
            if (str.trim().toLowerCase(locale).equals(lowerCase)) {
                return stringBuffer.length() - str.length();
            }
            return -1;
        }
        int length = this.G.length() - 1;
        int length2 = stringBuffer.length() - 1;
        while (length2 >= 0 && Character.isWhitespace(stringBuffer.charAt(length2))) {
            length2--;
        }
        if (length2 < length) {
            return -1;
        }
        while (length >= 0) {
            if (stringBuffer.substring(length2, length2 + 1).toLowerCase(Locale.ENGLISH).charAt(0) != lowerCase.charAt(length)) {
                return -1;
            }
            length2--;
            length--;
        }
        return length2 + 1;
    }

    @Deprecated
    protected void T2(PrintStream printStream) throws SQLException {
        ResultSet resultSet = Q2().getResultSet();
        try {
            U2(resultSet, printStream);
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (Throwable th2) {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    protected void U2(ResultSet resultSet, PrintStream printStream) throws SQLException {
        if (resultSet != null) {
            x1("Processing new result set.", 3);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            if (columnCount > 0) {
                if (this.J) {
                    printStream.print(S2(metaData.getColumnName(1)));
                    for (int i10 = 2; i10 <= columnCount; i10++) {
                        printStream.print(this.W);
                        printStream.print(S2(metaData.getColumnName(i10)));
                    }
                    printStream.println();
                }
                while (resultSet.next()) {
                    V2(resultSet, 1, printStream);
                    for (int i11 = 2; i11 <= columnCount; i11++) {
                        printStream.print(this.W);
                        V2(resultSet, i11, printStream);
                    }
                    printStream.println();
                    W2(resultSet.getWarnings(), false);
                }
            }
        }
        printStream.println();
    }

    protected void X2(Reader reader, PrintStream printStream) throws SQLException, IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            if (!this.Q) {
                line = line.trim();
            }
            if (this.S) {
                line = b().V0(line);
            }
            if (!this.Q) {
                if (!line.startsWith("//") && !line.startsWith("--")) {
                    StringTokenizer stringTokenizer = new StringTokenizer(line);
                    if (!stringTokenizer.hasMoreTokens() || !"REM".equalsIgnoreCase(stringTokenizer.nextToken())) {
                    }
                }
            }
            stringBuffer.append(this.Q ? "\n" : " ");
            stringBuffer.append(line);
            if (!this.Q && line.contains("--")) {
                stringBuffer.append("\n");
            }
            int iR2 = R2(stringBuffer, line);
            if (iR2 > -1) {
                O2(stringBuffer.substring(0, iR2), printStream);
                stringBuffer.replace(0, stringBuffer.length(), "");
            }
        }
        if (stringBuffer.length() > 0) {
            O2(stringBuffer.toString(), printStream);
        }
    }

    public void Y2(boolean z10) {
        this.P = z10;
    }

    public void Z2(String str) {
        this.W = str;
    }

    public void a3(String str) {
        if (str != null && str.length() > 1) {
            throw new BuildException("The quote character must be a single character.");
        }
        this.X = str;
    }

    public void b3(String str) {
        this.G = str;
    }

    public void c3(a aVar) {
        this.H = aVar.d();
    }

    public void d3(String str) {
        this.O = str;
    }

    protected final void e3() {
        p3(this.Z, "true");
    }

    public void f3(String str) {
        this.Z = str;
    }

    public void g3(boolean z10) {
        this.R = z10;
    }

    public void h3(boolean z10) {
        this.S = z10;
    }

    public void i3(boolean z10) {
        this.f133721c0 = z10;
    }

    public void j3(boolean z10) {
        this.Q = z10;
    }

    public void k3(b bVar) {
        this.N = bVar.d();
    }

    @Override // org.apache.tools.ant.taskdefs.k2
    protected Connection l2() {
        if (this.A == null) {
            Connection connectionL2 = super.l2();
            this.A = connectionL2;
            if (!w2(connectionL2)) {
                this.A = null;
            }
        }
        return this.A;
    }

    public void l3(File file) {
        m3(new org.apache.tools.ant.types.resources.z(b(), file));
    }

    public void m3(org.apache.tools.ant.types.s1 s1Var) {
        this.L = s1Var;
    }

    public void n3(String str) {
        this.M = str;
    }

    public void o3(boolean z10) {
        this.I = z10;
    }

    public void q3(boolean z10) {
        this.T = z10;
    }

    protected final void r3(int i10) {
        p3(this.f133720b0, Integer.toString(i10));
    }

    public void s3(String str) {
        this.f133720b0 = str;
    }

    public void t3(boolean z10) {
        this.V = z10;
    }

    public void u3(boolean z10) {
        this.J = z10;
    }

    public void v3(boolean z10) {
        this.K = z10;
    }

    public void w3(File file) {
        this.D = file;
    }

    public void x3(boolean z10) {
        this.U = z10;
    }

    public void y3(boolean z10) {
        this.Y = z10;
    }

    protected final void z3() {
        p3(this.f133719a0, "true");
    }
}
