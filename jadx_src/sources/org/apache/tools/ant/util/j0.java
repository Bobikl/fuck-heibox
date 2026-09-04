package org.apache.tools.ant.util;

import com.meituan.robust.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.launch.Locator;

/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f136828d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f136829e = 50;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f136836l = 8192;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f136837m = 2000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f136838n = 1000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f136839o = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f136843s = "null";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f136844a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136845b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f136846c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j0 f136830f = new j0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Random f136831g = new Random(System.currentTimeMillis() + Runtime.getRuntime().freeMemory());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f136832h = org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133972n);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f136833i = org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133973o);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f136834j = org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133969k);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f136835k = org.apache.tools.ant.taskdefs.condition.z.b("windows");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final FileAttribute[] f136840p = {PosixFilePermissions.asFileAttribute(EnumSet.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE))};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final FileAttribute[] f136841q = {PosixFilePermissions.asFileAttribute(EnumSet.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE))};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final FileAttribute[] f136842r = new FileAttribute[0];

    /* JADX INFO: compiled from: FileUtils.java */
    public class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int read() {
            return -1;
        }
    }

    protected j0() {
    }

    public static void H(File file) {
        if (file != null) {
            file.delete();
        }
    }

    public static j0 O() {
        return f136830f;
    }

    public static String Q(List<String> list) {
        return R(list, IOUtils.DIR_SEPARATOR_UNIX);
    }

    public static String R(List<String> list, char c10) {
        return (String) list.stream().collect(Collectors.joining(Character.toString(c10)));
    }

    public static String[] S(String str) {
        return str.replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX).split("/");
    }

    public static String T(File file, File file2) throws Exception {
        String canonicalPath = file.getCanonicalPath();
        String canonicalPath2 = file2.getCanonicalPath();
        String[] strArrS = S(canonicalPath);
        String[] strArrS2 = S(canonicalPath2);
        if (strArrS2.length <= 0 || strArrS.length <= 0) {
            return Q(Arrays.asList(strArrS2));
        }
        if (!strArrS[0].equals(strArrS2[0])) {
            return Q(Arrays.asList(strArrS2));
        }
        int iMin = Math.min(strArrS.length, strArrS2.length);
        int i10 = 1;
        while (i10 < iMin && strArrS[i10].equals(strArrS2[i10])) {
            i10++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = i10; i11 < strArrS.length; i11++) {
            arrayList.add("..");
        }
        arrayList.addAll(Arrays.asList(strArrS2).subList(i10, strArrS2.length));
        return Q(arrayList);
    }

    public static boolean V(String str) {
        int iIndexOf;
        if (str.isEmpty()) {
            return false;
        }
        int length = str.length();
        char c10 = File.separatorChar;
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, c10).replace(IOUtils.DIR_SEPARATOR_WINDOWS, c10);
        char cCharAt = strReplace.charAt(0);
        boolean z10 = f136833i;
        if (!z10 && !f136832h) {
            return cCharAt == c10;
        }
        if (cCharAt == c10) {
            return z10 && length > 4 && strReplace.charAt(1) == c10 && (iIndexOf = strReplace.indexOf(c10, 2)) > 2 && iIndexOf + 1 < length;
        }
        int iIndexOf2 = strReplace.indexOf(58);
        return (Character.isLetter(cCharAt) && iIndexOf2 == 1 && strReplace.length() > 2 && strReplace.charAt(2) == c10) || (f136832h && iIndexOf2 > 0);
    }

    public static Optional<Boolean> W(Path path) {
        Path pathCreateTempFile;
        if (path == null) {
            throw new IllegalArgumentException("Path cannot be null");
        }
        Path path2 = null;
        try {
            try {
                if (Files.isRegularFile(path, new LinkOption[0])) {
                    pathCreateTempFile = Files.createTempFile(path.getParent(), "aNt", null, new FileAttribute[0]);
                } else {
                    if (!Files.isDirectory(path, new LinkOption[0])) {
                        return Optional.empty();
                    }
                    pathCreateTempFile = Files.createTempFile(path, "aNt", null, new FileAttribute[0]);
                }
                boolean zIsSameFile = true;
                try {
                    zIsSameFile = true ^ Files.isSameFile(pathCreateTempFile, Paths.get(pathCreateTempFile.toString().toLowerCase(Locale.US), new String[0]));
                } catch (NoSuchFileException unused) {
                }
                H(pathCreateTempFile.toFile());
                return Optional.of(Boolean.valueOf(zIsSameFile));
            } catch (Throwable th2) {
                if (0 != 0) {
                    H(path2.toFile());
                }
                throw th2;
            }
        } catch (IOException e10) {
            System.err.println("Could not determine the case sensitivity of the filesystem for path " + path + " due to " + e10);
            Optional<Boolean> optionalEmpty = Optional.empty();
            if (0 != 0) {
                H(path2.toFile());
            }
            return optionalEmpty;
        }
    }

    public static boolean X(String str) {
        if ((!f136833i && !f136832h) || str.isEmpty()) {
            return false;
        }
        char c10 = File.separatorChar;
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, c10).replace(IOUtils.DIR_SEPARATOR_WINDOWS, c10);
        char cCharAt = strReplace.charAt(0);
        int length = strReplace.length();
        if (cCharAt != c10 || (length != 1 && strReplace.charAt(1) == c10)) {
            if (!Character.isLetter(cCharAt) || length <= 1 || strReplace.charAt(1) != ':') {
                return false;
            }
            if (length != 2 && strReplace.charAt(2) == c10) {
                return false;
            }
        }
        return true;
    }

    public static void c(InputStream inputStream) {
        g(inputStream);
    }

    public static void d(OutputStream outputStream) {
        g(outputStream);
    }

    public static void e(Reader reader) {
        g(reader);
    }

    public static void f(Writer writer) {
        g(writer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean f0(String str, File file, String str2) {
        return str2.equalsIgnoreCase(str) && !str2.equals(str);
    }

    public static void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception unused) {
            }
        }
    }

    @Deprecated
    public static j0 g0() {
        return new j0();
    }

    public static void h(URLConnection uRLConnection) {
        if (uRLConnection != null) {
            try {
                if (uRLConnection instanceof JarURLConnection) {
                    ((JarURLConnection) uRLConnection).getJarFile().close();
                } else if (uRLConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnection).disconnect();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static OutputStream h0(Path path, boolean z10) throws IOException {
        return z10 ? Files.newOutputStream(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND, StandardOpenOption.WRITE) : Files.newOutputStream(path, new OpenOption[0]);
    }

    public static void i(Channel channel) {
        g(channel);
    }

    public static String j0(Reader reader) throws IOException {
        return k0(reader, 8192);
    }

    public static String k0(Reader reader, int i10) throws IOException {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Buffer size must be greater than 0");
        }
        char[] cArr = new char[i10];
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 != -1) {
            i11 = reader.read(cArr);
            if (i11 > 0) {
                sb2.append(cArr, 0, i11);
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public static String o0(Reader reader) throws IOException {
        String strJ0 = j0(reader);
        return strJ0 == null ? "" : strJ0;
    }

    public static String s0(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 50);
        org.apache.tools.ant.x1 x1Var = new org.apache.tools.ant.x1(str);
        while (x1Var.a()) {
            String strReplace = x1Var.b().replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar);
            if (sb2.length() > 0) {
                sb2.append(File.pathSeparatorChar);
            }
            sb2.append(strReplace);
        }
        return sb2.toString();
    }

    public void A(String str, String str2, org.apache.tools.ant.types.h0 h0Var, boolean z10, boolean z11, String str3) throws IOException {
        t(new File(str), new File(str2), h0Var, z10, z11, str3);
    }

    public boolean B(File file) throws IOException {
        return file.createNewFile();
    }

    public boolean C(File file, boolean z10) throws IOException {
        File parentFile = file.getParentFile();
        if (z10 && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        return file.createNewFile();
    }

    @Deprecated
    public File D(String str, String str2, File file) {
        return F(str, str2, file, false, false);
    }

    @Deprecated
    public File E(String str, String str2, File file, boolean z10) {
        return F(str, str2, file, z10, false);
    }

    @Deprecated
    public File F(String str, String str2, File file, boolean z10, boolean z11) {
        return G(null, str, str2, file, z10, z11);
    }

    public File G(Project project, String str, String str2, File file, boolean z10, boolean z11) {
        File file2;
        File file3;
        String absolutePath = null;
        if (file != null) {
            absolutePath = file.getPath();
        } else if (project != null && project.u0(org.apache.tools.ant.j1.O) != null) {
            absolutePath = project.u0(org.apache.tools.ant.j1.O);
        } else if (project != null && z10) {
            if (project.u0(org.apache.tools.ant.j1.P) != null) {
                absolutePath = project.u0(org.apache.tools.ant.j1.P);
            } else {
                Path path = new File(System.getProperty("java.io.tmpdir")).toPath();
                if (((PosixFileAttributeView) Files.getFileAttributeView(path, PosixFileAttributeView.class, new LinkOption[0])) != null) {
                    try {
                        File file4 = Files.createTempDirectory(path, "ant", f136841q).toFile();
                        file4.deleteOnExit();
                        absolutePath = file4.getAbsolutePath();
                        project.p1(org.apache.tools.ant.j1.P, absolutePath);
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (absolutePath == null) {
            absolutePath = System.getProperty("java.io.tmpdir");
        }
        if (str == null) {
            str = f136843s;
        }
        if (str2 == null) {
            str2 = f136843s;
        }
        if (z11) {
            try {
                Path path2 = new File(absolutePath).toPath();
                file2 = Files.createTempFile(path2, str, str2, ((PosixFileAttributeView) Files.getFileAttributeView(path2, PosixFileAttributeView.class, new LinkOption[0])) != null ? f136840p : f136842r).toFile();
            } catch (IOException e10) {
                throw new BuildException("Could not create tempfile in " + absolutePath, e10);
            }
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("#####");
            synchronized (f136831g) {
                do {
                    file3 = new File(absolutePath, str + decimalFormat.format(f136831g.nextInt(Integer.MAX_VALUE)) + str2);
                } while (file3.exists());
            }
            file2 = file3;
        }
        if (z10) {
            file2.deleteOnExit();
        }
        return file2;
    }

    public String[] I(String str) {
        String strSubstring;
        String strSubstring2;
        char c10 = File.separatorChar;
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, c10).replace(IOUtils.DIR_SEPARATOR_WINDOWS, c10);
        if (!V(strReplace)) {
            throw new BuildException(strReplace + " is not an absolute path");
        }
        int iIndexOf = strReplace.indexOf(58);
        if (iIndexOf > 0 && (f136833i || f136832h)) {
            int i10 = iIndexOf + 1;
            String strSubstring3 = strReplace.substring(0, i10);
            char[] charArray = strReplace.toCharArray();
            strSubstring = strSubstring3 + c10;
            if (charArray[i10] == c10) {
                i10++;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (i10 < charArray.length) {
                char c11 = charArray[i10];
                if (c11 != c10 || charArray[i10 - 1] != c10) {
                    stringBuffer.append(c11);
                }
                i10++;
            }
            strSubstring2 = stringBuffer.toString();
        } else if (strReplace.length() <= 1 || strReplace.charAt(1) != c10) {
            strSubstring = File.separator;
            strSubstring2 = strReplace.substring(1);
        } else {
            int iIndexOf2 = strReplace.indexOf(c10, strReplace.indexOf(c10, 2) + 1);
            strSubstring = iIndexOf2 > 2 ? strReplace.substring(0, iIndexOf2 + 1) : strReplace;
            strSubstring2 = strReplace.substring(strSubstring.length());
        }
        return new String[]{strSubstring, strSubstring2};
    }

    public boolean J(File file, File file2) {
        return i0(file.getAbsolutePath()).getAbsolutePath().equals(i0(file2.getAbsolutePath()).getAbsolutePath());
    }

    public String K(String str) {
        synchronized (this.f136844a) {
            if (str.equals(this.f136845b)) {
                return this.f136846c;
            }
            String strFromURI = Locator.fromURI(str);
            if (V(strFromURI)) {
                strFromURI = i0(strFromURI).getAbsolutePath();
            }
            this.f136845b = str;
            this.f136846c = strFromURI;
            return strFromURI;
        }
    }

    public String L() {
        InputStreamReader inputStreamReader = new InputStreamReader(new a());
        try {
            return inputStreamReader.getEncoding();
        } finally {
            e(inputStreamReader);
        }
    }

    public long M() {
        if (f136834j) {
            return 2000L;
        }
        if (f136835k) {
            return 1L;
        }
        return f136833i ? 2000L : 1000L;
    }

    public URL N(File file) throws MalformedURLException {
        return new URL(file.toURI().toASCIIString());
    }

    @Deprecated
    public File P(File file) {
        if (file == null) {
            return null;
        }
        return file.getParentFile();
    }

    public boolean U(File file) {
        File fileI0 = i0(file.getAbsolutePath());
        if (!fileI0.exists()) {
            return false;
        }
        final String name = fileI0.getName();
        String[] list = fileI0.getParentFile().list(new FilenameFilter() { // from class: org.apache.tools.ant.util.i0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return j0.f0(name, file2, str);
            }
        });
        return list != null && list.length == 1;
    }

    public boolean Y(File file, File file2) {
        String absolutePath = i0(file.getAbsolutePath()).getAbsolutePath();
        String absolutePath2 = i0(file2.getAbsolutePath()).getAbsolutePath();
        if (absolutePath.equals(absolutePath2)) {
            return true;
        }
        String str = File.separator;
        if (!absolutePath.endsWith(str)) {
            absolutePath = absolutePath + str;
        }
        String str2 = str + ".." + str;
        if (absolutePath.contains(str2) || absolutePath2.contains(str2)) {
            return false;
        }
        if ((absolutePath2 + str).contains(str2)) {
            return false;
        }
        return absolutePath2.startsWith(absolutePath);
    }

    public boolean Z(File file, File file2, boolean z10) throws IOException {
        if (!z10) {
            return Y(file, file2);
        }
        File canonicalFile = file.getCanonicalFile();
        File canonicalFile2 = file2.getCanonicalFile();
        while (!canonicalFile.equals(canonicalFile2)) {
            canonicalFile2 = canonicalFile2.getParentFile();
            if (canonicalFile2 == null) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public boolean a0(File file, String str) throws IOException {
        return file == null ? Files.isSymbolicLink(Paths.get(str, new String[0])) : Files.isSymbolicLink(Paths.get(file.toPath().toString(), str));
    }

    public boolean b(File file, File file2) throws IOException {
        if (file == null && file2 == null) {
            return true;
        }
        if (file == null || file2 == null) {
            return false;
        }
        File fileI0 = i0(file.getAbsolutePath());
        File fileI1 = i0(file2.getAbsolutePath());
        return fileI0.equals(fileI1) || fileI0.getCanonicalFile().equals(fileI1.getCanonicalFile());
    }

    public boolean b0(long j10, long j11) {
        return c0(j10, j11, M());
    }

    public boolean c0(long j10, long j11, long j12) {
        return j11 != -1 && j11 >= j10 + j12;
    }

    public boolean d0(File file, File file2) {
        return e0(file, file2, M());
    }

    public boolean e0(File file, File file2, long j10) {
        if (file2.exists()) {
            return c0(file.lastModified(), file2.lastModified(), j10);
        }
        return false;
    }

    public File i0(String str) {
        Stack stack = new Stack();
        String[] strArrI = I(str);
        stack.push(strArrI[0]);
        StringTokenizer stringTokenizer = new StringTokenizer(strArrI[1], File.separator);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!".".equals(strNextToken)) {
                if (!"..".equals(strNextToken)) {
                    stack.push(strNextToken);
                } else {
                    if (stack.size() < 2) {
                        return new File(str);
                    }
                    stack.pop();
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int size = stack.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 1) {
                sb2.append(File.separatorChar);
            }
            sb2.append((String) stack.elementAt(i10));
        }
        return new File(sb2.toString());
    }

    public boolean j(File file, File file2) throws IOException {
        return k(file, file2, false);
    }

    public boolean k(File file, File file2, boolean z10) throws IOException {
        return ResourceUtils.h(new org.apache.tools.ant.types.resources.z(file), new org.apache.tools.ant.types.resources.z(file2), z10);
    }

    public void l(File file, File file2) throws IOException {
        s(file, file2, null, false, false);
    }

    public String l0(File file, File file2) {
        String absolutePath = i0(file.getAbsolutePath()).getAbsolutePath();
        String absolutePath2 = i0(file2.getAbsolutePath()).getAbsolutePath();
        if (absolutePath.equals(absolutePath2)) {
            return "";
        }
        String str = File.separator;
        if (!absolutePath.endsWith(str)) {
            absolutePath = absolutePath + str;
        }
        return absolutePath2.startsWith(absolutePath) ? absolutePath2.substring(absolutePath.length()) : absolutePath2;
    }

    public void m(File file, File file2, org.apache.tools.ant.types.h0 h0Var) throws IOException {
        s(file, file2, h0Var, false, false);
    }

    public void m0(File file, File file2) throws IOException {
        File canonicalFile = i0(file.getAbsolutePath()).getCanonicalFile();
        File fileI0 = i0(file2.getAbsolutePath());
        if (!canonicalFile.exists()) {
            System.err.println("Cannot rename nonexistent file " + canonicalFile);
            return;
        }
        if (canonicalFile.getAbsolutePath().equals(fileI0.getAbsolutePath())) {
            System.err.println("Rename of " + canonicalFile + " to " + fileI0 + " is a no-op.");
            return;
        }
        if (fileI0.exists() && !b(canonicalFile, fileI0) && !t0(fileI0)) {
            throw new IOException("Failed to delete " + fileI0 + " while trying to rename " + canonicalFile);
        }
        File parentFile = fileI0.getParentFile();
        if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException("Failed to create directory " + parentFile + " while trying to rename " + canonicalFile);
        }
        if (canonicalFile.renameTo(fileI0)) {
            return;
        }
        l(canonicalFile, fileI0);
        if (t0(canonicalFile)) {
            return;
        }
        throw new IOException("Failed to delete " + canonicalFile + " while trying to rename it.");
    }

    public void n(File file, File file2, org.apache.tools.ant.types.h0 h0Var, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, boolean z11, String str, String str2, Project project) throws IOException {
        p(file, file2, h0Var, vector, z10, z11, false, str, str2, project);
    }

    public File n0(File file, String str) {
        if (!V(str)) {
            char c10 = File.separatorChar;
            String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, c10).replace(IOUtils.DIR_SEPARATOR_WINDOWS, c10);
            if (X(strReplace)) {
                file = null;
                String property = System.getProperty("user.dir");
                if (strReplace.charAt(0) == c10 && property.charAt(0) == c10) {
                    strReplace = I(property)[0] + strReplace.substring(1);
                }
            }
            str = new File(file, strReplace).getAbsolutePath();
        }
        return i0(str);
    }

    public void o(File file, File file2, org.apache.tools.ant.types.h0 h0Var, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, boolean z11, String str, Project project) throws IOException {
        n(file, file2, h0Var, vector, z10, z11, str, str, project);
    }

    public void p(File file, File file2, org.apache.tools.ant.types.h0 h0Var, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, boolean z11, boolean z12, String str, String str2, Project project) throws IOException {
        q(file, file2, h0Var, vector, z10, z11, z12, str, str2, project, false);
    }

    public void p0(File file, long j10) {
        ResourceUtils.C(new org.apache.tools.ant.types.resources.z(file), j10);
    }

    public void q(File file, File file2, org.apache.tools.ant.types.h0 h0Var, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, boolean z11, boolean z12, String str, String str2, Project project, boolean z13) throws IOException {
        ResourceUtils.m(new org.apache.tools.ant.types.resources.z(file), new org.apache.tools.ant.types.resources.z(file2), h0Var, vector, z10, z11, z12, str, str2, project, z13);
    }

    public String q0(String str) {
        return new File(str).toURI().toASCIIString();
    }

    public void r(File file, File file2, org.apache.tools.ant.types.h0 h0Var, boolean z10) throws IOException {
        s(file, file2, h0Var, z10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String r0(File file) {
        String strSubstring;
        int i10;
        String strSubstring2;
        String str;
        String str2;
        String path = i0(file.getAbsolutePath()).getPath();
        String name = file.getName();
        Object[] objArr = path.charAt(0) == File.separatorChar;
        Object[] objArr2 = file.isDirectory() && !name.regionMatches(true, name.length() + (-4), ".DIR", 0, 4);
        StringBuilder sb2 = null;
        if (objArr == true) {
            int iIndexOf = path.indexOf(File.separatorChar, 1);
            if (iIndexOf == -1) {
                return path.substring(1) + ":[000000]";
            }
            i10 = iIndexOf + 1;
            strSubstring = path.substring(1, iIndexOf);
        } else {
            strSubstring = null;
            i10 = 0;
        }
        if (objArr2 == true) {
            sb2 = new StringBuilder(path.substring(i10).replace(File.separatorChar, lg.a.f131414g));
            strSubstring2 = null;
        } else {
            int iLastIndexOf = path.lastIndexOf(File.separatorChar);
            if (iLastIndexOf == -1 || iLastIndexOf < i10) {
                strSubstring2 = path.substring(i10);
            } else {
                StringBuilder sb3 = new StringBuilder(path.substring(i10, iLastIndexOf).replace(File.separatorChar, lg.a.f131414g));
                int i11 = iLastIndexOf + 1;
                strSubstring2 = path.length() > i11 ? path.substring(i11) : null;
                sb2 = sb3;
            }
        }
        if (objArr == false && sb2 != null) {
            sb2.insert(0, lg.a.f131414g);
        }
        StringBuilder sb4 = new StringBuilder();
        if (strSubstring != null) {
            str = strSubstring + ":";
        } else {
            str = "";
        }
        sb4.append(str);
        if (sb2 != null) {
            str2 = Constants.ARRAY_TYPE + ((Object) sb2) + "]";
        } else {
            str2 = "";
        }
        sb4.append(str2);
        if (strSubstring2 == null) {
            strSubstring2 = "";
        }
        sb4.append(strSubstring2);
        return sb4.toString();
    }

    public void s(File file, File file2, org.apache.tools.ant.types.h0 h0Var, boolean z10, boolean z11) throws IOException {
        t(file, file2, h0Var, z10, z11, null);
    }

    public void t(File file, File file2, org.apache.tools.ant.types.h0 h0Var, boolean z10, boolean z11, String str) throws IOException {
        o(file, file2, h0Var, null, z10, z11, str, null);
    }

    public boolean t0(File file) {
        return u0(file, f136835k);
    }

    public void u(String str, String str2) throws IOException {
        s(new File(str), new File(str2), null, false, false);
    }

    public boolean u0(File file, boolean z10) {
        if (file.delete()) {
            return true;
        }
        if (z10) {
            System.gc();
        }
        try {
            Thread.sleep(10L);
        } catch (InterruptedException unused) {
        }
        return file.delete();
    }

    public void v(String str, String str2, org.apache.tools.ant.types.h0 h0Var) throws IOException {
        s(new File(str), new File(str2), h0Var, false, false);
    }

    public void w(String str, String str2, org.apache.tools.ant.types.h0 h0Var, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, boolean z11, String str3, String str4, Project project) throws IOException {
        n(new File(str), new File(str2), h0Var, vector, z10, z11, str3, str4, project);
    }

    public void x(String str, String str2, org.apache.tools.ant.types.h0 h0Var, Vector<org.apache.tools.ant.types.c0> vector, boolean z10, boolean z11, String str3, Project project) throws IOException {
        o(new File(str), new File(str2), h0Var, vector, z10, z11, str3, project);
    }

    public void y(String str, String str2, org.apache.tools.ant.types.h0 h0Var, boolean z10) throws IOException {
        s(new File(str), new File(str2), h0Var, z10, false);
    }

    public void z(String str, String str2, org.apache.tools.ant.types.h0 h0Var, boolean z10, boolean z11) throws IOException {
        s(new File(str), new File(str2), h0Var, z10, z11);
    }
}
