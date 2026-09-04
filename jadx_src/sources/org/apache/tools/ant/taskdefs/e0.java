package org.apache.tools.ant.taskdefs;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Checksum.java */
/* JADX INFO: loaded from: classes5.dex */
public class e0 extends h4 implements org.apache.tools.ant.taskdefs.condition.d {
    private static final int C = 4;
    private static final int D = 16;
    private static final int E = 8192;
    private static final int F = 255;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f134057m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f134060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f134061q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134064t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f134065u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134066v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private MessageDigest f134069y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f134070z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f134056l = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134058n = "MD5";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f134059o = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map<File, byte[]> f134062r = new HashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map<File, String> f134063s = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a f134067w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Hashtable<File, Object> f134068x = new Hashtable<>();
    private int A = 8192;
    private MessageFormat B = b.h().i();

    /* JADX INFO: compiled from: Checksum.java */
    public static class a extends org.apache.tools.ant.types.resources.i1 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private org.apache.tools.ant.types.resources.w1 f134071i;

        a() {
            org.apache.tools.ant.types.resources.w1 w1Var = new org.apache.tools.ant.types.resources.w1();
            this.f134071i = w1Var;
            super.i2(w1Var);
            super.e2(org.apache.tools.ant.types.resources.selectors.q.f136456f);
        }

        @Override // org.apache.tools.ant.types.resources.i1
        public void i2(org.apache.tools.ant.types.u1 u1Var) {
            this.f134071i.f2(u1Var);
        }
    }

    /* JADX INFO: compiled from: Checksum.java */
    public static class b extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static HashMap<String, MessageFormat> f134072c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f134073d = "CHECKSUM";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f134074e = "MD5SUM";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f134075f = "SVF";

        static {
            HashMap<String, MessageFormat> map = new HashMap<>();
            f134072c = map;
            map.put(f134073d, new MessageFormat("{0}"));
            f134072c.put(f134074e, new MessageFormat("{0} *{1}"));
            f134072c.put(f134075f, new MessageFormat("MD5 ({1}) = {0}"));
        }

        public static b h() {
            b bVar = new b();
            bVar.g(f134073d);
            return bVar;
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{f134073d, f134074e, f134075f};
        }

        public MessageFormat i() {
            return f134072c.get(d());
        }
    }

    private void B2(File file) throws BuildException {
        if (!file.exists()) {
            String str = "Could not find file " + file.getAbsolutePath() + " to generate checksum for.";
            log(str);
            throw new BuildException(str, w1());
        }
        String str2 = this.f134061q;
        if (str2 != null) {
            this.f134068x.put(file, str2);
            return;
        }
        File fileF2 = F2(file);
        if (this.f134065u || this.f134070z || file.lastModified() > fileF2.lastModified()) {
            this.f134068x.put(file, fileF2);
            return;
        }
        x1(file + " omitted as " + fileF2 + " is up to date.", 3);
        if (this.f134064t != null) {
            this.f134062r.put(file, D2(H2(fileF2).toCharArray()));
        }
    }

    private String C2(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Integer.valueOf(b10 & 255)));
        }
        return sb2.toString();
    }

    public static byte[] D2(char[] cArr) throws BuildException {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new BuildException("odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            bArr[i11] = (byte) (((Character.digit(cArr[i10], 16) << 4) | Character.digit(cArr[i12], 16)) & 255);
            i11++;
            i10 = i12 + 1;
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean E2() throws Throwable {
        OutputStream outputStreamNewOutputStream;
        boolean z10;
        int i10;
        byte[] bArr = new byte[this.A];
        InputStream inputStream = null;
        try {
            Iterator<Map.Entry<File, Object>> it = this.f134068x.entrySet().iterator();
            loop0: while (true) {
                z10 = 1;
                while (true) {
                    i10 = 0;
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Map.Entry<File, Object> next = it.next();
                    this.f134069y.reset();
                    File key = next.getKey();
                    if (!this.f134070z) {
                        x1("Calculating " + this.f134058n + " checksum for " + key, 3);
                    }
                    InputStream inputStreamNewInputStream = Files.newInputStream(key.toPath(), new OpenOption[0]);
                    try {
                        DigestInputStream digestInputStream = new DigestInputStream(inputStreamNewInputStream, this.f134069y);
                        while (digestInputStream.read(bArr, 0, this.A) != -1) {
                        }
                        digestInputStream.close();
                        inputStreamNewInputStream.close();
                        byte[] bArrDigest = this.f134069y.digest();
                        if (this.f134064t != null) {
                            this.f134062r.put(key, bArrDigest);
                        }
                        String strC2 = C2(bArrDigest);
                        Object value = next.getValue();
                        if (value instanceof String) {
                            String str = (String) value;
                            if (this.f134070z) {
                                if (z10 != 0 && strC2.equals(this.f134061q)) {
                                    break;
                                }
                                z10 = i10;
                            } else {
                                b().n1(str, strC2);
                            }
                        } else if (!(value instanceof File)) {
                            continue;
                        } else if (this.f134070z) {
                            File file = (File) value;
                            if (file.exists()) {
                                try {
                                    String strH2 = H2(file);
                                    if (z10 != 0 && strC2.equals(strH2)) {
                                        i10 = 1;
                                    }
                                } catch (BuildException unused) {
                                }
                            }
                            z10 = i10;
                        } else {
                            File file2 = (File) value;
                            outputStreamNewOutputStream = Files.newOutputStream(file2.toPath(), new OpenOption[0]);
                            try {
                                try {
                                    outputStreamNewOutputStream.write(this.B.format(new Object[]{strC2, key.getName(), org.apache.tools.ant.util.j0.T(file2.getParentFile(), key), org.apache.tools.ant.util.j0.T(b().Z(), key), key.getAbsolutePath()}).getBytes());
                                    outputStreamNewOutputStream.write(System.lineSeparator().getBytes());
                                    outputStreamNewOutputStream.close();
                                } catch (Exception e10) {
                                    e = e10;
                                    throw new BuildException(e, w1());
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                org.apache.tools.ant.util.j0.c(inputStream);
                                org.apache.tools.ant.util.j0.d(outputStreamNewOutputStream);
                                throw th;
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        outputStreamNewOutputStream = null;
                        inputStream = inputStreamNewInputStream;
                    } catch (Throwable th3) {
                        th = th3;
                        outputStreamNewOutputStream = null;
                        inputStream = inputStreamNewInputStream;
                        org.apache.tools.ant.util.j0.c(inputStream);
                        org.apache.tools.ant.util.j0.d(outputStreamNewOutputStream);
                        throw th;
                    }
                    throw new BuildException(e, w1());
                }
            }
            if (this.f134064t != null) {
                File[] fileArr = (File[]) this.f134062r.keySet().toArray(new File[this.f134062r.size()]);
                Arrays.sort(fileArr, Comparator.nullsFirst(Comparator.comparing(new Function() { // from class: org.apache.tools.ant.taskdefs.d0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f134038a.G2((File) obj);
                    }
                })));
                this.f134069y.reset();
                int length = fileArr.length;
                while (i10 < length) {
                    File file3 = fileArr[i10];
                    this.f134069y.update(this.f134062r.get(file3));
                    this.f134069y.update(G2(file3).getBytes());
                    i10++;
                }
                b().n1(this.f134064t, C2(this.f134069y.digest()));
            }
            org.apache.tools.ant.util.j0.c(null);
            org.apache.tools.ant.util.j0.d(null);
            return z10;
        } catch (Exception e12) {
            e = e12;
            outputStreamNewOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            outputStreamNewOutputStream = null;
        }
    }

    private File F2(File file) {
        File parentFile;
        if (this.f134057m != null) {
            parentFile = new File(this.f134057m, G2(file)).getParentFile();
            parentFile.mkdirs();
        } else {
            parentFile = file.getParentFile();
        }
        return new File(parentFile, file.getName() + this.f134060p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String G2(File file) {
        String str = this.f134063s.get(file);
        if (str != null) {
            return str;
        }
        throw new BuildException("Internal error: relativeFilePaths could not match file %s\nplease file a bug report on this", file);
    }

    private String H2(File file) {
        Object obj;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                Object[] objArr = this.B.parse(bufferedReader.readLine());
                if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
                    throw new BuildException("failed to find a checksum");
                }
                String str = (String) obj;
                bufferedReader.close();
                return str;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException | ParseException e10) {
            throw new BuildException("Couldn't read checksum file " + file, e10);
        }
    }

    private boolean U2() throws BuildException {
        a aVar;
        String str = this.f134060p;
        if (this.f134056l == null && ((aVar = this.f134067w) == null || aVar.size() == 0)) {
            throw new BuildException("Specify at least one source - a file or a resource collection.");
        }
        a aVar2 = this.f134067w;
        if (aVar2 != null && !aVar2.O()) {
            throw new BuildException("Can only calculate checksums for file-based resources.");
        }
        File file = this.f134056l;
        if (file != null && file.exists() && this.f134056l.isDirectory()) {
            throw new BuildException("Checksum cannot be generated for directories");
        }
        if (this.f134056l != null && this.f134064t != null) {
            throw new BuildException("File and Totalproperty cannot co-exist.");
        }
        String str2 = this.f134061q;
        if (str2 != null && this.f134060p != null) {
            throw new BuildException("Property and FileExt cannot co-exist.");
        }
        if (str2 != null) {
            if (this.f134065u) {
                throw new BuildException("ForceOverwrite cannot be used when Property is specified");
            }
            a aVar3 = this.f134067w;
            int size = aVar3 != null ? 0 + aVar3.size() : 0;
            if (this.f134056l != null) {
                size++;
            }
            if (size > 1) {
                throw new BuildException("Multiple files cannot be used when Property is specified");
            }
        }
        String str3 = this.f134066v;
        if (str3 != null) {
            this.f134070z = true;
        }
        if (str3 != null && this.f134065u) {
            throw new BuildException("VerifyProperty and ForceOverwrite cannot co-exist.");
        }
        if (this.f134070z && this.f134065u) {
            throw new BuildException("ForceOverwrite cannot be used when conditions are being used.");
        }
        this.f134069y = null;
        String str4 = this.f134059o;
        if (str4 != null) {
            try {
                this.f134069y = MessageDigest.getInstance(this.f134058n, str4);
            } catch (NoSuchAlgorithmException | NoSuchProviderException e10) {
                throw new BuildException(e10, w1());
            }
        } else {
            try {
                this.f134069y = MessageDigest.getInstance(this.f134058n);
            } catch (NoSuchAlgorithmException e11) {
                throw new BuildException(e11, w1());
            }
        }
        if (this.f134069y == null) {
            throw new BuildException("Unable to create Message Digest", w1());
        }
        String str5 = this.f134060p;
        if (str5 == null) {
            this.f134060p = "." + this.f134058n;
        } else if (str5.trim().isEmpty()) {
            throw new BuildException("File extension when specified must not be an empty string");
        }
        try {
            a aVar4 = this.f134067w;
            if (aVar4 != null) {
                for (org.apache.tools.ant.types.s1 s1Var : aVar4) {
                    File fileL0 = ((org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class)).l0();
                    if (this.f134064t != null || this.f134057m != null) {
                        this.f134063s.put(fileL0, s1Var.k2().replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX));
                    }
                    B2(fileL0);
                }
            }
            File file2 = this.f134056l;
            if (file2 != null) {
                if (this.f134064t != null || this.f134057m != null) {
                    this.f134063s.put(file2, file2.getName().replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX));
                }
                B2(this.f134056l);
            }
            return E2();
        } finally {
            this.f134060p = str;
            this.f134068x.clear();
        }
    }

    public void A2(org.apache.tools.ant.types.b0 b0Var) {
        z2(b0Var);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        this.f134070z = false;
        boolean zU2 = U2();
        if (this.f134066v != null) {
            b().n1(this.f134066v, Boolean.toString(zU2));
        }
    }

    public void I2(String str) {
        this.f134058n = str;
    }

    public void J2(File file) {
        this.f134056l = file;
    }

    public void K2(String str) {
        this.f134060p = str;
    }

    public void L2(boolean z10) {
        this.f134065u = z10;
    }

    public void M2(b bVar) {
        this.B = bVar.i();
    }

    public void N2(String str) {
        this.B = new MessageFormat(str);
    }

    public void O2(String str) {
        this.f134061q = str;
    }

    public void P2(String str) {
        this.f134059o = str;
    }

    public void Q2(int i10) {
        this.A = i10;
    }

    public void R2(File file) {
        this.f134057m = file;
    }

    public void S2(String str) {
        this.f134064t = str;
    }

    public void T2(String str) {
        this.f134066v = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        this.f134070z = true;
        return U2();
    }

    public void z2(org.apache.tools.ant.types.u1 u1Var) {
        if (u1Var == null) {
            return;
        }
        a aVar = this.f134067w;
        if (aVar == null) {
            aVar = new a();
        }
        this.f134067w = aVar;
        aVar.i2(u1Var);
    }
}
