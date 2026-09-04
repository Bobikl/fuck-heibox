package org.apache.tools.ant.taskdefs.optional.ejb;

import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;
import javax.xml.parsers.SAXParser;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: GenericDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class h implements f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f134966k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f134967l = 9;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final String f134968m = "META-INF/";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final String f134969n = "META-INF/MANIFEST.MF";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final String f134970o = "ejb-jar.xml";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f134971p = "super";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f134972q = "full";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f134973r = "none";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f134974s = "super";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f134975t = "org.apache.tools.ant.util.depend.bcel.AncestorAnalyzer";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f134976u = "org.apache.tools.ant.util.depend.bcel.FullAnalyzer";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g.b f134977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f134978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o0 f134979d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u2 f134981f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Set<String> f134983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f134984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private org.apache.tools.ant.util.depend.b f134985j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f134980e = "-generic.jar";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ClassLoader f134982g = null;

    private void j() {
        String str = this.f134977b.f134961k;
        if (str == null) {
            str = "super";
        }
        if (str.equals("none")) {
            return;
        }
        if (str.equals(f134972q)) {
            str = "org.apache.tools.ant.util.depend.bcel.FullAnalyzer";
        } else if (str.equals("super")) {
            str = f134975t;
        }
        try {
            org.apache.tools.ant.util.depend.b bVar = (org.apache.tools.ant.util.depend.b) Class.forName(str).asSubclass(org.apache.tools.ant.util.depend.b.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            this.f134985j = bVar;
            bVar.g(new o0(this.f134981f.b(), this.f134977b.f134951a.getPath()));
            this.f134985j.g(this.f134977b.f134956f);
        } catch (Exception e10) {
            this.f134985j = null;
            this.f134981f.x1("Unable to load dependency analyzer: " + str + " - exception: " + e10.getMessage(), 1);
        } catch (NoClassDefFoundError e11) {
            this.f134985j = null;
            this.f134981f.x1("Unable to load dependency analyzer: " + str + " - dependent class not found: " + e11.getMessage(), 1);
        }
    }

    protected void A(e eVar) {
    }

    public void B(o0 o0Var) {
        this.f134979d = o0Var;
    }

    public void C(File file) {
        this.f134978c = file;
    }

    public void D(String str) {
        this.f134980e = str;
    }

    protected boolean E() {
        return this.f134977b.f134954d != null;
    }

    protected void F(String str, File file, Hashtable<String, File> hashtable, String str2) throws BuildException {
        InputStream resourceAsStream;
        Set<String> set = this.f134983h;
        if (set == null) {
            this.f134983h = new HashSet();
        } else {
            set.clear();
        }
        try {
            if (file.exists()) {
                file.delete();
            }
            file.getParentFile().mkdirs();
            file.createNewFile();
            InputStream inputStream = null;
            try {
                try {
                    File file2 = hashtable.get(f134969n);
                    if (file2 == null || !file2.exists()) {
                        resourceAsStream = getClass().getResourceAsStream("/org/apache/tools/ant/defaultManifest.mf");
                        if (resourceAsStream == null) {
                            throw new BuildException("Could not find default manifest: %s", "/org/apache/tools/ant/defaultManifest.mf");
                        }
                    } else {
                        resourceAsStream = Files.newInputStream(file2.toPath(), new OpenOption[0]);
                    }
                    Manifest manifest = new Manifest(resourceAsStream);
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    JarOutputStream jarOutputStream = new JarOutputStream(Files.newOutputStream(file.toPath(), new OpenOption[0]), manifest);
                    try {
                        jarOutputStream.setMethod(8);
                        for (Map.Entry<String, File> entry : hashtable.entrySet()) {
                            String key = entry.getKey();
                            if (!key.equals(f134969n)) {
                                File value = entry.getValue();
                                x("adding file '" + key + "'", 3);
                                e(jarOutputStream, value, key);
                                String[] list = value.getParentFile().list(new p(value.getName()));
                                if (list != null) {
                                    for (String str3 : list) {
                                        int iLastIndexOf = key.lastIndexOf(value.getName()) - 1;
                                        key = iLastIndexOf < 0 ? str3 : key.substring(0, iLastIndexOf) + File.separatorChar + str3;
                                        value = new File(this.f134977b.f134951a, key);
                                        x("adding innerclass file '" + key + "'", 3);
                                        e(jarOutputStream, value, key);
                                    }
                                }
                            }
                        }
                        jarOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            jarOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    throw new BuildException("Unable to read manifest", e10, r());
                }
            } catch (Throwable th4) {
                if (0 != 0) {
                    inputStream.close();
                }
                throw th4;
            }
        } catch (IOException e11) {
            throw new BuildException("IOException while processing ejb-jar file '" + file.toString() + "'. Details: " + e11.getMessage(), e11);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.f
    public void a(g.b bVar) {
        this.f134977b = bVar;
        j();
        this.f134982g = null;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.f
    public void b(String str, SAXParser sAXParser) {
        i(str, sAXParser);
        try {
            this.f134984i = o(this.f134977b.f134951a);
            Hashtable<String, File> hashtableZ = z(str, sAXParser);
            f(hashtableZ);
            String strQ = q(str);
            String strV = v(strQ, str);
            File fileS = s(strV);
            if (fileS != null) {
                hashtableZ.put(f134969n, fileS);
            }
            hashtableZ.put("META-INF/ejb-jar.xml", new File(this.f134977b.f134952b, str));
            g(hashtableZ, strV);
            h(hashtableZ);
            if (this.f134977b.f134955e && !strQ.isEmpty()) {
                int iLastIndexOf = strQ.lastIndexOf(File.separator);
                if (iLastIndexOf == -1) {
                    iLastIndexOf = 0;
                }
                strQ = strQ.substring(iLastIndexOf, strQ.length());
            }
            File fileW = w(strQ);
            if (!y(hashtableZ, fileW)) {
                x(fileW.toString() + " is up to date.", 3);
                return;
            }
            x("building " + fileW.getName() + " with " + String.valueOf(hashtableZ.size()) + " files", 2);
            F(strQ, fileW, hashtableZ, t());
        } catch (IOException e10) {
            throw new BuildException("IOException while parsing'" + str + "'.  This probably indicates that the descriptor doesn't exist. Details: " + e10.getMessage(), e10);
        } catch (SAXException e11) {
            throw new BuildException("SAXException while parsing '" + str + "'. This probably indicates badly-formed XML.  Details: " + e11.getMessage(), e11);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.f
    public void c() throws BuildException {
        File file = this.f134978c;
        if (file == null || !file.isDirectory()) {
            throw new BuildException("A valid destination directory must be specified using the \"destdir\" attribute.", r());
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.f
    public void d(u2 u2Var) {
        this.f134981f = u2Var;
    }

    protected void e(JarOutputStream jarOutputStream, File file, String str) throws BuildException {
        if (this.f134983h.contains(str)) {
            return;
        }
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
            try {
                jarOutputStream.putNextEntry(new ZipEntry(str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX)));
                byte[] bArr = new byte[2048];
                int i10 = 0;
                do {
                    jarOutputStream.write(bArr, 0, i10);
                    i10 = inputStreamNewInputStream.read(bArr, 0, 2048);
                } while (i10 != -1);
                this.f134983h.add(str);
                inputStreamNewInputStream.close();
            } catch (Throwable th2) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            x("WARNING: IOException while adding entry " + str + " to jarfile from " + file.getPath() + " " + e10.getClass().getName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + e10.getMessage(), 1);
        }
    }

    protected void f(Hashtable<String, File> hashtable) {
        Project projectB = this.f134981f.b();
        for (org.apache.tools.ant.types.b0 b0Var : this.f134977b.f134957g) {
            File fileZ2 = b0Var.z2(projectB);
            for (String str : b0Var.B2(projectB).m()) {
                hashtable.put(str, new File(fileZ2, str));
            }
        }
    }

    protected void g(Hashtable<String, File> hashtable, String str) {
    }

    protected void h(Hashtable<String, File> hashtable) throws BuildException {
        org.apache.tools.ant.util.depend.b bVar = this.f134985j;
        if (bVar == null) {
            return;
        }
        bVar.reset();
        for (String str : hashtable.keySet()) {
            if (str.endsWith(".class")) {
                this.f134985j.f(str.substring(0, str.length() - 6).replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX).replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g));
            }
        }
        for (String str2 : Collections.list(this.f134985j.e())) {
            String str3 = str2.replace(lg.a.f131414g, File.separatorChar) + ".class";
            File file = new File(this.f134977b.f134951a, str3);
            if (file.exists()) {
                hashtable.put(str3, file);
                x("dependent class: " + str2 + " - " + file, 3);
            }
        }
    }

    protected void i(String str, SAXParser sAXParser) throws BuildException {
    }

    public o0 k() {
        if (this.f134979d == null) {
            this.f134979d = new o0(this.f134981f.b());
        }
        return this.f134979d.u2();
    }

    protected ClassLoader l() {
        ClassLoader classLoader = this.f134982g;
        if (classLoader != null) {
            return classLoader;
        }
        o0 o0VarM = m();
        if (o0VarM == null) {
            this.f134982g = getClass().getClassLoader();
        } else {
            this.f134982g = u().b().z(o0VarM);
        }
        return this.f134982g;
    }

    protected o0 m() {
        o0 o0Var = this.f134979d;
        o0 o0Var2 = this.f134977b.f134956f;
        if (o0Var2 == null) {
            return o0Var;
        }
        if (o0Var == null) {
            return o0Var2;
        }
        o0Var.n2(o0Var2);
        return o0Var;
    }

    protected g.b n() {
        return this.f134977b;
    }

    protected e o(File file) {
        e eVar = new e(u(), file);
        A(eVar);
        for (g.c cVar : n().f134958h) {
            eVar.e(cVar.c(), cVar.b());
        }
        return eVar;
    }

    protected File p() {
        return this.f134978c;
    }

    protected String q(String str) {
        if (g.d.f134965f.equals(this.f134977b.f134959i.d())) {
            int iLastIndexOf = str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX).lastIndexOf(47);
            return (iLastIndexOf != -1 ? str.substring(0, iLastIndexOf + 1) : "") + this.f134977b.f134954d;
        }
        if (g.d.f134964e.equals(this.f134977b.f134959i.d())) {
            int iLastIndexOf2 = str.lastIndexOf(File.separator);
            int iIndexOf = iLastIndexOf2 != -1 ? str.indexOf(this.f134977b.f134953c, iLastIndexOf2) : str.indexOf(this.f134977b.f134953c);
            if (iIndexOf != -1) {
                return str.substring(0, iIndexOf);
            }
            throw new BuildException("Unable to determine jar name from descriptor \"%s\"", str);
        }
        if (!g.d.f134963d.equals(this.f134977b.f134959i.d())) {
            return g.d.f134962c.equals(this.f134977b.f134959i.d()) ? this.f134984i.a() : "";
        }
        String absolutePath = new File(this.f134977b.f134952b, str).getAbsolutePath();
        String str2 = File.separator;
        int iLastIndexOf3 = absolutePath.lastIndexOf(str2);
        if (iLastIndexOf3 == -1) {
            throw new BuildException("Unable to determine directory name holding descriptor");
        }
        String strSubstring = absolutePath.substring(0, iLastIndexOf3);
        int iLastIndexOf4 = strSubstring.lastIndexOf(str2);
        if (iLastIndexOf4 != -1) {
            strSubstring = strSubstring.substring(iLastIndexOf4 + 1);
        }
        return strSubstring;
    }

    protected Location r() {
        return u().w1();
    }

    protected File s(String str) {
        File file = new File(n().f134952b, str + "manifest.mf");
        if (file.exists()) {
            return file;
        }
        File file2 = this.f134977b.f134960j;
        if (file2 != null) {
            return file2;
        }
        return null;
    }

    protected String t() {
        return this.f134984i.c();
    }

    protected u2 u() {
        return this.f134981f;
    }

    public String v(String str, String str2) {
        if (this.f134977b.f134959i.d().equals(g.d.f134964e)) {
            return str + this.f134977b.f134953c;
        }
        if (!this.f134977b.f134959i.d().equals(g.d.f134965f) && !this.f134977b.f134959i.d().equals(g.d.f134962c) && !this.f134977b.f134959i.d().equals(g.d.f134963d)) {
            return null;
        }
        int iLastIndexOf = str2.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX).lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str2.substring(0, iLastIndexOf + 1);
    }

    File w(String str) {
        return new File(this.f134978c, str + this.f134980e);
    }

    protected void x(String str, int i10) {
        u().x1(str, i10);
    }

    protected boolean y(Hashtable<String, File> hashtable, File file) {
        if (!file.exists()) {
            return true;
        }
        long jLastModified = file.lastModified();
        for (File file2 : hashtable.values()) {
            if (jLastModified < file2.lastModified()) {
                x("Build needed because " + file2.getPath() + " is out of date", 3);
                return true;
            }
        }
        return false;
    }

    protected Hashtable<String, File> z(String str, SAXParser sAXParser) throws SAXException, IOException {
        InputStream inputStreamNewInputStream = Files.newInputStream(new File(this.f134977b.f134952b, str).toPath(), new OpenOption[0]);
        try {
            sAXParser.parse(new InputSource(inputStreamNewInputStream), this.f134984i);
            Hashtable<String, File> hashtableB = this.f134984i.b();
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return hashtableB;
        } catch (Throwable th2) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
