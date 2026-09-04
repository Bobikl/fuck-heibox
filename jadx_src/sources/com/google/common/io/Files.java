package com.google.common.io;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.graph.Traverser;
import com.google.common.graph.c1;
import com.google.common.hash.HashCode;
import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public final class Files {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f58638a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c1<File> f58639b = new b();

    public enum FilePredicate implements com.google.common.base.x<File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // com.google.common.base.x
            public boolean apply(File file) {
                return file.isDirectory();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // com.google.common.base.x
            public boolean apply(File file) {
                return file.isFile();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }
        };

        /* synthetic */ FilePredicate(a aVar) {
            this();
        }
    }

    public class a implements u<List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<String> f58640a = Lists.q();

        a() {
        }

        @Override // com.google.common.io.u
        public boolean a(String str) {
            this.f58640a.add(str);
            return true;
        }

        @Override // com.google.common.io.u
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<String> getResult() {
            return this.f58640a;
        }
    }

    public class b implements c1<File> {
        b() {
        }

        @Override // com.google.common.graph.c1, com.google.common.graph.a0
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public Iterable<File> a(File file) {
            File[] fileArrListFiles;
            return (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) ? ImmutableList.B() : Collections.unmodifiableList(Arrays.asList(fileArrListFiles));
        }
    }

    public static final class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f58641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableSet<FileWriteMode> f58642b;

        private c(File file, FileWriteMode... fileWriteModeArr) {
            this.f58641a = (File) com.google.common.base.w.E(file);
            this.f58642b = ImmutableSet.y(fileWriteModeArr);
        }

        /* synthetic */ c(File file, FileWriteMode[] fileWriteModeArr, a aVar) {
            this(file, fileWriteModeArr);
        }

        @Override // com.google.common.io.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public FileOutputStream c() throws IOException {
            return new FileOutputStream(this.f58641a, this.f58642b.contains(FileWriteMode.APPEND));
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f58641a);
            String strValueOf2 = String.valueOf(this.f58642b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20 + strValueOf2.length());
            sb2.append("Files.asByteSink(");
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static final class d extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f58643a;

        private d(File file) {
            this.f58643a = (File) com.google.common.base.w.E(file);
        }

        /* synthetic */ d(File file, a aVar) {
            this(file);
        }

        @Override // com.google.common.io.f
        public byte[] o() throws Throwable {
            m mVarA = m.a();
            try {
                FileInputStream fileInputStream = (FileInputStream) mVarA.b(m());
                byte[] bArrV = g.v(fileInputStream, fileInputStream.getChannel().size());
                mVarA.close();
                return bArrV;
            } catch (Throwable th2) {
                try {
                    throw mVarA.c(th2);
                } catch (Throwable th3) {
                    mVarA.close();
                    throw th3;
                }
            }
        }

        @Override // com.google.common.io.f
        public long p() throws IOException {
            if (this.f58643a.isFile()) {
                return this.f58643a.length();
            }
            throw new FileNotFoundException(this.f58643a.toString());
        }

        @Override // com.google.common.io.f
        public Optional<Long> q() {
            return this.f58643a.isFile() ? Optional.f(Long.valueOf(this.f58643a.length())) : Optional.a();
        }

        @Override // com.google.common.io.f
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public FileInputStream m() throws IOException {
            return new FileInputStream(this.f58643a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f58643a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append("Files.asByteSource(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private Files() {
    }

    @a0
    @s9.a
    @Deprecated
    @s9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readLines(callback)")
    public static <T> T A(File file, Charset charset, u<T> uVar) throws IOException {
        return (T) e(file, charset).q(uVar);
    }

    public static List<String> B(File file, Charset charset) throws IOException {
        return (List) e(file, charset).q(new a());
    }

    public static String C(String str) {
        com.google.common.base.w.E(str);
        if (str.length() == 0) {
            return ".";
        }
        Iterable<String> iterableN = com.google.common.base.z.h(IOUtils.DIR_SEPARATOR_UNIX).g().n(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : iterableN) {
            str2.hashCode();
            if (!str2.equals(".")) {
                if (!str2.equals("..")) {
                    arrayList.add(str2);
                } else if (arrayList.size() <= 0 || ((String) arrayList.get(arrayList.size() - 1)).equals("..")) {
                    arrayList.add("..");
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        String strK = com.google.common.base.p.o(IOUtils.DIR_SEPARATOR_UNIX).k(arrayList);
        if (str.charAt(0) == '/') {
            String strValueOf = String.valueOf(strK);
            strK = strValueOf.length() != 0 ? "/".concat(strValueOf) : new String("/");
        }
        while (strK.startsWith("/../")) {
            strK = strK.substring(3);
        }
        if (strK.equals("/..")) {
            return "/";
        }
        return "".equals(strK) ? "." : strK;
    }

    public static byte[] D(File file) throws IOException {
        return c(file).o();
    }

    @Deprecated
    @s9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).read()")
    public static String E(File file, Charset charset) throws IOException {
        return e(file, charset).n();
    }

    public static void F(File file) throws IOException {
        com.google.common.base.w.E(file);
        if (file.createNewFile() || file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
        sb2.append("Unable to update modification time of ");
        sb2.append(strValueOf);
        throw new IOException(sb2.toString());
    }

    @Deprecated
    @s9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset).write(from)")
    public static void G(CharSequence charSequence, File file, Charset charset) throws Throwable {
        d(file, charset, new FileWriteMode[0]).c(charSequence);
    }

    public static void H(byte[] bArr, File file) throws Throwable {
        b(file, new FileWriteMode[0]).d(bArr);
    }

    @Deprecated
    @s9.l(imports = {"com.google.common.io.FileWriteMode", "com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset, FileWriteMode.APPEND).write(from)")
    public static void a(CharSequence charSequence, File file, Charset charset) throws Throwable {
        d(file, charset, FileWriteMode.APPEND).c(charSequence);
    }

    public static e b(File file, FileWriteMode... fileWriteModeArr) {
        return new c(file, fileWriteModeArr, null);
    }

    public static f c(File file) {
        return new d(file, null);
    }

    public static i d(File file, Charset charset, FileWriteMode... fileWriteModeArr) {
        return b(file, fileWriteModeArr).a(charset);
    }

    public static j e(File file, Charset charset) {
        return c(file).a(charset);
    }

    public static void f(File file, File file2) throws Throwable {
        com.google.common.base.w.y(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        c(file).f(b(file2, new FileWriteMode[0]));
    }

    public static void g(File file, OutputStream outputStream) throws Throwable {
        c(file).g(outputStream);
    }

    @Deprecated
    @s9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(from, charset).copyTo(to)")
    public static void h(File file, Charset charset, Appendable appendable) throws Throwable {
        e(file, charset).f(appendable);
    }

    public static void i(File file) throws IOException {
        com.google.common.base.w.E(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39);
        sb2.append("Unable to create parent directories of ");
        sb2.append(strValueOf);
        throw new IOException(sb2.toString());
    }

    @o9.a
    @Deprecated
    public static File j() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append(jCurrentTimeMillis);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        String string = sb2.toString();
        for (int i10 = 0; i10 < 10000; i10++) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 11);
            sb3.append(string);
            sb3.append(i10);
            File file2 = new File(file, sb3.toString());
            if (file2.mkdir()) {
                return file2;
            }
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 66 + String.valueOf(string).length());
        sb4.append("Failed to create directory within 10000 attempts (tried ");
        sb4.append(string);
        sb4.append("0 to ");
        sb4.append(string);
        sb4.append(bb.c.l.V0);
        sb4.append(')');
        throw new IllegalStateException(sb4.toString());
    }

    public static boolean k(File file, File file2) throws IOException {
        com.google.common.base.w.E(file);
        com.google.common.base.w.E(file2);
        if (file == file2 || file.equals(file2)) {
            return true;
        }
        long length = file.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return c(file).e(c(file2));
        }
        return false;
    }

    @o9.a
    public static Traverser<File> l() {
        return Traverser.h(f58639b);
    }

    public static String m(String str) {
        com.google.common.base.w.E(str);
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }

    public static String n(String str) {
        com.google.common.base.w.E(str);
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    @Deprecated
    @s9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).hash(hashFunction)")
    public static HashCode o(File file, com.google.common.hash.k kVar) throws IOException {
        return c(file).j(kVar);
    }

    public static com.google.common.base.x<File> p() {
        return FilePredicate.IS_DIRECTORY;
    }

    public static com.google.common.base.x<File> q() {
        return FilePredicate.IS_FILE;
    }

    public static MappedByteBuffer r(File file) throws IOException {
        com.google.common.base.w.E(file);
        return s(file, FileChannel.MapMode.READ_ONLY);
    }

    public static MappedByteBuffer s(File file, FileChannel.MapMode mapMode) throws IOException {
        return u(file, mapMode, -1L);
    }

    public static MappedByteBuffer t(File file, FileChannel.MapMode mapMode, long j10) throws IOException {
        com.google.common.base.w.p(j10 >= 0, "size (%s) may not be negative", j10);
        return u(file, mapMode, j10);
    }

    private static MappedByteBuffer u(File file, FileChannel.MapMode mapMode, long j10) throws Throwable {
        com.google.common.base.w.E(file);
        com.google.common.base.w.E(mapMode);
        m mVarA = m.a();
        try {
            FileChannel fileChannel = (FileChannel) mVarA.b(((RandomAccessFile) mVarA.b(new RandomAccessFile(file, mapMode == FileChannel.MapMode.READ_ONLY ? "r" : "rw"))).getChannel());
            if (j10 == -1) {
                j10 = fileChannel.size();
            }
            MappedByteBuffer map = fileChannel.map(mapMode, 0L, j10);
            mVarA.close();
            return map;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    public static void v(File file, File file2) throws Throwable {
        com.google.common.base.w.E(file);
        com.google.common.base.w.E(file2);
        com.google.common.base.w.y(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        f(file, file2);
        if (file.delete()) {
            return;
        }
        if (file2.delete()) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 17);
            sb2.append("Unable to delete ");
            sb2.append(strValueOf);
            throw new IOException(sb2.toString());
        }
        String strValueOf2 = String.valueOf(file2);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 17);
        sb3.append("Unable to delete ");
        sb3.append(strValueOf2);
        throw new IOException(sb3.toString());
    }

    public static BufferedReader w(File file, Charset charset) throws FileNotFoundException {
        com.google.common.base.w.E(file);
        com.google.common.base.w.E(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter x(File file, Charset charset) throws FileNotFoundException {
        com.google.common.base.w.E(file);
        com.google.common.base.w.E(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    @a0
    @s9.a
    @Deprecated
    @s9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).read(processor)")
    public static <T> T y(File file, com.google.common.io.d<T> dVar) throws IOException {
        return (T) c(file).n(dVar);
    }

    @CheckForNull
    @Deprecated
    @s9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readFirstLine()")
    public static String z(File file, Charset charset) throws IOException {
        return e(file, charset).o();
    }
}
