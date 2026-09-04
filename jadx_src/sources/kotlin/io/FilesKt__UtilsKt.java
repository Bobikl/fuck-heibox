package kotlin.io;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;
import yh.p;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public class FilesKt__UtilsKt extends k {
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    public static final boolean N(@dl.d File file, @dl.d File target, boolean z10, @dl.d final p<? super File, ? super IOException, ? extends OnErrorAction> onError) {
        boolean z11;
        f0.p(file, "<this>");
        f0.p(target, "target");
        f0.p(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE;
        }
        try {
            for (File file2 : k.M(file).k(new p<File, IOException, b2>() { // from class: kotlin.io.FilesKt__UtilsKt$copyRecursively$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.d File f10, @dl.d IOException e10) throws TerminateException {
                    f0.p(f10, "f");
                    f0.p(e10, "e");
                    if (onError.invoke(f10, e10) == OnErrorAction.TERMINATE) {
                        throw new TerminateException(f10);
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(File file3, IOException iOException) throws TerminateException {
                    a(file3, iOException);
                    return b2.f124493a;
                }
            })) {
                if (file2.exists()) {
                    File file3 = new File(target, n0(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory())) {
                        if (!z10) {
                            z11 = true;
                        } else if (file3.isDirectory()) {
                            if (V(file3)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                        } else if (file3.delete()) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            if (onError.invoke(file3, new FileAlreadyExistsException(file2, file3, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                                return false;
                            }
                        }
                    }
                    if (file2.isDirectory()) {
                        file3.mkdirs();
                    } else if (Q(file2, file3, z10, 0, 4, null).length() != file2.length() && onError.invoke(file2, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else if (onError.invoke(file2, new NoSuchFileException(file2, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) {
                    return false;
                }
            }
            return true;
        } catch (TerminateException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean O(File file, File file2, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            pVar = new p() { // from class: kotlin.io.FilesKt__UtilsKt$copyRecursively$1
                @Override // yh.p
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Void invoke(@dl.d File file3, @dl.d IOException exception) throws IOException {
                    f0.p(file3, "<anonymous parameter 0>");
                    f0.p(exception, "exception");
                    throw exception;
                }
            };
        }
        return N(file, file2, z10, pVar);
    }

    @dl.d
    public static final File P(@dl.d File file, @dl.d File target, boolean z10, int i10) throws FileSystemException {
        f0.p(file, "<this>");
        f0.p(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    a.k(fileInputStream, fileOutputStream, i10);
                    b.a(fileOutputStream, null);
                    b.a(fileInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    b.a(fileInputStream, th4);
                    throw th5;
                }
            }
        } else if (!target.mkdirs()) {
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        return target;
    }

    public static /* synthetic */ File Q(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return P(file, file2, z10, i10);
    }

    @dl.d
    @kotlin.k(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File R(@dl.d String prefix, @dl.e String str, @dl.e File file) throws IOException {
        f0.p(prefix, "prefix");
        File dir = File.createTempFile(prefix, str, file);
        dir.delete();
        if (dir.mkdir()) {
            f0.o(dir, "dir");
            return dir;
        }
        throw new IOException("Unable to create temporary directory " + dir + lg.a.f131414g);
    }

    public static /* synthetic */ File S(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return R(str, str2, file);
    }

    @dl.d
    @kotlin.k(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File T(@dl.d String prefix, @dl.e String str, @dl.e File file) throws IOException {
        f0.p(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        f0.o(fileCreateTempFile, "createTempFile(prefix, suffix, directory)");
        return fileCreateTempFile;
    }

    public static /* synthetic */ File U(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return T(str, str2, file);
    }

    public static final boolean V(@dl.d File file) {
        f0.p(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : k.L(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    public static final boolean W(@dl.d File file, @dl.d File other) {
        f0.p(file, "<this>");
        f0.p(other, "other");
        g gVarF = j.f(file);
        g gVarF2 = j.f(other);
        if (gVarF2.i()) {
            return f0.g(file, other);
        }
        int iH = gVarF.h() - gVarF2.h();
        if (iH < 0) {
            return false;
        }
        return gVarF.g().subList(iH, gVarF.h()).equals(gVarF2.g());
    }

    public static final boolean X(@dl.d File file, @dl.d String other) {
        f0.p(file, "<this>");
        f0.p(other, "other");
        return W(file, new File(other));
    }

    @dl.d
    public static final String Y(@dl.d File file) {
        f0.p(file, "<this>");
        String name = file.getName();
        f0.o(name, "name");
        return StringsKt__StringsKt.r5(name, lg.a.f131414g, "");
    }

    @dl.d
    public static final String Z(@dl.d File file) {
        f0.p(file, "<this>");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            f0.o(path, "path");
            return u.k2(path, File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX, false, 4, null);
        }
        String path2 = file.getPath();
        f0.o(path2, "path");
        return path2;
    }

    @dl.d
    public static final String a0(@dl.d File file) {
        f0.p(file, "<this>");
        String name = file.getName();
        f0.o(name, "name");
        return StringsKt__StringsKt.C5(name, ".", null, 2, null);
    }

    @dl.d
    public static final File b0(@dl.d File file) {
        f0.p(file, "<this>");
        g gVarF = j.f(file);
        File fileE = gVarF.e();
        List<File> listC0 = c0(gVarF.g());
        String separator = File.separator;
        f0.o(separator, "separator");
        return i0(fileE, CollectionsKt___CollectionsKt.h3(listC0, separator, null, null, 0, null, null, 62, null));
    }

    private static final List<File> c0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!f0.g(name, ".")) {
                if (!f0.g(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || f0.g(((File) CollectionsKt___CollectionsKt.k3(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    private static final g d0(g gVar) {
        return new g(gVar.e(), c0(gVar.g()));
    }

    @dl.d
    public static final File e0(@dl.d File file, @dl.d File base) {
        f0.p(file, "<this>");
        f0.p(base, "base");
        return new File(n0(file, base));
    }

    @dl.e
    public static final File f0(@dl.d File file, @dl.d File base) throws IOException {
        f0.p(file, "<this>");
        f0.p(base, "base");
        String strO0 = o0(file, base);
        if (strO0 != null) {
            return new File(strO0);
        }
        return null;
    }

    @dl.d
    public static final File g0(@dl.d File file, @dl.d File base) throws IOException {
        f0.p(file, "<this>");
        f0.p(base, "base");
        String strO0 = o0(file, base);
        return strO0 != null ? new File(strO0) : file;
    }

    @dl.d
    public static final File h0(@dl.d File file, @dl.d File relative) {
        f0.p(file, "<this>");
        f0.p(relative, "relative");
        if (j.d(relative)) {
            return relative;
        }
        String string = file.toString();
        f0.o(string, "this.toString()");
        if ((string.length() == 0) || StringsKt__StringsKt.b3(string, File.separatorChar, false, 2, null)) {
            return new File(string + relative);
        }
        return new File(string + File.separatorChar + relative);
    }

    @dl.d
    public static final File i0(@dl.d File file, @dl.d String relative) {
        f0.p(file, "<this>");
        f0.p(relative, "relative");
        return h0(file, new File(relative));
    }

    @dl.d
    public static final File j0(@dl.d File file, @dl.d File relative) {
        f0.p(file, "<this>");
        f0.p(relative, "relative");
        g gVarF = j.f(file);
        return h0(h0(gVarF.e(), gVarF.h() == 0 ? new File("..") : gVarF.j(0, gVarF.h() - 1)), relative);
    }

    @dl.d
    public static final File k0(@dl.d File file, @dl.d String relative) {
        f0.p(file, "<this>");
        f0.p(relative, "relative");
        return j0(file, new File(relative));
    }

    public static final boolean l0(@dl.d File file, @dl.d File other) {
        f0.p(file, "<this>");
        f0.p(other, "other");
        g gVarF = j.f(file);
        g gVarF2 = j.f(other);
        if (f0.g(gVarF.e(), gVarF2.e()) && gVarF.h() >= gVarF2.h()) {
            return gVarF.g().subList(0, gVarF2.h()).equals(gVarF2.g());
        }
        return false;
    }

    public static final boolean m0(@dl.d File file, @dl.d String other) {
        f0.p(file, "<this>");
        f0.p(other, "other");
        return l0(file, new File(other));
    }

    @dl.d
    public static final String n0(@dl.d File file, @dl.d File base) throws IOException {
        f0.p(file, "<this>");
        f0.p(base, "base");
        String strO0 = o0(file, base);
        if (strO0 != null) {
            return strO0;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + lg.a.f131414g);
    }

    private static final String o0(File file, File file2) throws IOException {
        g gVarD0 = d0(j.f(file));
        g gVarD1 = d0(j.f(file2));
        if (!f0.g(gVarD0.e(), gVarD1.e())) {
            return null;
        }
        int iH = gVarD1.h();
        int iH2 = gVarD0.h();
        int i10 = 0;
        int iMin = Math.min(iH2, iH);
        while (i10 < iMin && f0.g(gVarD0.g().get(i10), gVarD1.g().get(i10))) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = iH - 1;
        if (i10 <= i11) {
            while (!f0.g(gVarD1.g().get(i11).getName(), "..")) {
                sb2.append("..");
                if (i11 != i10) {
                    sb2.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < iH2) {
            if (i10 < iH) {
                sb2.append(File.separatorChar);
            }
            List listX1 = CollectionsKt___CollectionsKt.X1(gVarD0.g(), i10);
            String separator = File.separator;
            f0.o(separator, "separator");
            CollectionsKt___CollectionsKt.e3(listX1, sb2, (112 & 2) != 0 ? ", " : separator, (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
        }
        return sb2.toString();
    }
}
