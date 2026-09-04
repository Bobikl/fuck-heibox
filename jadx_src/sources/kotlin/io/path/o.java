package kotlin.io.path;

import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.c1;
import kotlin.collections.d1;
import kotlin.e2;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.r0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public class o extends PathsKt__PathRecursiveFunctionsKt {
    @dl.d
    @r0
    public static final Void A0(@dl.d Path path, @dl.d Class<?> attributeViewClass) {
        f0.p(path, "path");
        f0.p(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + lg.a.f131414g);
    }

    @u0(version = s0.f136932w)
    @e
    public static final void A1(@dl.d Path path, @dl.d FileVisitor<Path> visitor, int i10, boolean z10) throws IOException {
        f0.p(path, "<this>");
        f0.p(visitor, "visitor");
        Files.walkFileTree(path, z10 ? c1.f(FileVisitOption.FOLLOW_LINKS) : d1.k(), i10, visitor);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final /* synthetic */ <V extends FileAttributeView> V B0(Path path, LinkOption... options) {
        f0.p(path, "<this>");
        f0.p(options, "options");
        f0.y(4, androidx.exifinterface.media.a.X4);
        V v10 = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        if (v10 != null) {
            return v10;
        }
        f0.y(4, androidx.exifinterface.media.a.X4);
        A0(path, FileAttributeView.class);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void B1(Path path, int i10, boolean z10, yh.l lVar, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        z1(path, i10, z10, lVar);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final /* synthetic */ <V extends FileAttributeView> V C0(Path path, LinkOption... options) {
        f0.p(path, "<this>");
        f0.p(options, "options");
        f0.y(4, androidx.exifinterface.media.a.X4);
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    public static /* synthetic */ void C1(Path path, FileVisitor fileVisitor, int i10, boolean z10, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        A1(path, fileVisitor, i10, z10);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final long D0(Path path) throws IOException {
        f0.p(path, "<this>");
        return Files.size(path);
    }

    @u0(version = s0.f136932w)
    @dl.d
    @e
    public static final kotlin.sequences.m<Path> D1(@dl.d Path path, @dl.d PathWalkOption... options) {
        f0.p(path, "<this>");
        f0.p(options, "options");
        return new PathTreeWalk(path, options);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final FileStore E0(Path path) throws IOException {
        f0.p(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        f0.o(fileStore, "getFileStore(this)");
        return fileStore;
    }

    @u0(version = s0.f136932w)
    @dl.d
    @e
    public static final FileVisitor<Path> F0(@dl.d yh.l<? super f, b2> builderAction) {
        f0.p(builderAction, "builderAction");
        g gVar = new g();
        builderAction.invoke(gVar);
        return gVar.e();
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final void G0(Path path, String glob, yh.l<? super Path, b2> action) throws IOException {
        f0.p(path, "<this>");
        f0.p(glob, "glob");
        f0.p(action, "action");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            f0.o(it, "it");
            Iterator<Path> it2 = it.iterator();
            while (it2.hasNext()) {
                action.invoke(it2.next());
            }
            b2 b2Var = b2.f124493a;
            c0.d(1);
            kotlin.io.b.a(it, null);
            c0.c(1);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                kotlin.io.b.a(it, th2);
                c0.c(1);
                throw th3;
            }
        }
    }

    static /* synthetic */ void H0(Path path, String glob, yh.l action, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            glob = androidx.webkit.b.f28327e;
        }
        f0.p(path, "<this>");
        f0.p(glob, "glob");
        f0.p(action, "action");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            f0.o(it, "it");
            Iterator<Path> it2 = it.iterator();
            while (it2.hasNext()) {
                action.invoke(it2.next());
            }
            b2 b2Var = b2.f124493a;
            c0.d(1);
            kotlin.io.b.a(it, null);
            c0.c(1);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                kotlin.io.b.a(it, th2);
                c0.c(1);
                throw th3;
            }
        }
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Object I0(Path path, String attribute, LinkOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(attribute, "attribute");
        f0.p(options, "options");
        return Files.getAttribute(path, attribute, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @dl.d
    public static final String J0(@dl.d Path path) {
        String string;
        String strR5;
        f0.p(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strR5 = StringsKt__StringsKt.r5(string, lg.a.f131414g, "")) == null) ? "" : strR5;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    public static /* synthetic */ void K0(Path path) {
    }

    private static final String L0(Path path) {
        f0.p(path, "<this>");
        return N0(path);
    }

    @u0(version = "1.4")
    @e
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @kotlin.s0(expression = "invariantSeparatorsPathString", imports = {}))
    @sh.f
    public static /* synthetic */ void M0(Path path) {
    }

    @dl.d
    public static final String N0(@dl.d Path path) {
        f0.p(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (f0.g(separator, "/")) {
            return path.toString();
        }
        String string = path.toString();
        f0.o(separator, "separator");
        return u.l2(string, separator, "/", false, 4, null);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    public static /* synthetic */ void O0(Path path) {
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final FileTime P0(Path path, LinkOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(options, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        f0.o(lastModifiedTime, "getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    @dl.d
    public static final String Q0(@dl.d Path path) {
        f0.p(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    public static /* synthetic */ void R0(Path path) {
    }

    @dl.d
    public static final String S0(@dl.d Path path) {
        String string;
        String strC5;
        f0.p(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strC5 = StringsKt__StringsKt.C5(string, ".", null, 2, null)) == null) ? "" : strC5;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    public static /* synthetic */ void T0(Path path) {
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final UserPrincipal U0(Path path, LinkOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(options, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    private static final String V0(Path path) {
        f0.p(path, "<this>");
        return path.toString();
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    public static /* synthetic */ void W0(Path path) {
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Set<PosixFilePermission> X0(Path path, LinkOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(options, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        f0.o(posixFilePermissions, "getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean Y0(Path path, LinkOption... options) {
        f0.p(path, "<this>");
        f0.p(options, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean Z0(Path path) {
        f0.p(path, "<this>");
        return Files.isExecutable(path);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean a1(Path path) throws IOException {
        f0.p(path, "<this>");
        return Files.isHidden(path);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path b0(String path) {
        f0.p(path, "path");
        Path path2 = Paths.get(path, new String[0]);
        f0.o(path2, "get(path)");
        return path2;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean b1(Path path) {
        f0.p(path, "<this>");
        return Files.isReadable(path);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path c0(String base, String... subpaths) {
        f0.p(base, "base");
        f0.p(subpaths, "subpaths");
        Path path = Paths.get(base, (String[]) Arrays.copyOf(subpaths, subpaths.length));
        f0.o(path, "get(base, *subpaths)");
        return path;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean c1(Path path, LinkOption... options) {
        f0.p(path, "<this>");
        f0.p(options, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path d0(Path path) {
        f0.p(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        f0.o(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean d1(Path path, Path other) throws IOException {
        f0.p(path, "<this>");
        f0.p(other, "other");
        return Files.isSameFile(path, other);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final String e0(Path path) {
        f0.p(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean e1(Path path) {
        f0.p(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path f0(Path path, Path target, boolean z10) throws IOException {
        f0.p(path, "<this>");
        f0.p(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        f0.o(pathCopy, "copy(this, target, *options)");
        return pathCopy;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean f1(Path path) {
        f0.p(path, "<this>");
        return Files.isWritable(path);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path g0(Path path, Path target, CopyOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(target, "target");
        f0.p(options, "options");
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        f0.o(pathCopy, "copy(this, target, *options)");
        return pathCopy;
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {e.class})
    public static final List<Path> g1(@dl.d Path path, @dl.d String glob) throws IOException {
        f0.p(path, "<this>");
        f0.p(glob, "glob");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            f0.o(it, "it");
            List<Path> listQ5 = CollectionsKt___CollectionsKt.Q5(it);
            kotlin.io.b.a(it, null);
            return listQ5;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(it, th2);
                throw th3;
            }
        }
    }

    static /* synthetic */ Path h0(Path path, Path target, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        f0.p(path, "<this>");
        f0.p(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        f0.o(pathCopy, "copy(this, target, *options)");
        return pathCopy;
    }

    public static /* synthetic */ List h1(Path path, String str, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = androidx.webkit.b.f28327e;
        }
        return g1(path, str);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path i0(Path path, FileAttribute<?>... attributes) throws IOException {
        f0.p(path, "<this>");
        f0.p(attributes, "attributes");
        Path pathCreateDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        f0.o(pathCreateDirectories, "createDirectories(this, *attributes)");
        return pathCreateDirectories;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path i1(Path path, Path target, boolean z10) throws IOException {
        f0.p(path, "<this>");
        f0.p(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        f0.o(pathMove, "move(this, target, *options)");
        return pathMove;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path j0(Path path, FileAttribute<?>... attributes) throws IOException {
        f0.p(path, "<this>");
        f0.p(attributes, "attributes");
        Path pathCreateDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        f0.o(pathCreateDirectory, "createDirectory(this, *attributes)");
        return pathCreateDirectory;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path j1(Path path, Path target, CopyOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(target, "target");
        f0.p(options, "options");
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        f0.o(pathMove, "move(this, target, *options)");
        return pathMove;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path k0(Path path, FileAttribute<?>... attributes) throws IOException {
        f0.p(path, "<this>");
        f0.p(attributes, "attributes");
        Path pathCreateFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        f0.o(pathCreateFile, "createFile(this, *attributes)");
        return pathCreateFile;
    }

    static /* synthetic */ Path k1(Path path, Path target, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        f0.p(path, "<this>");
        f0.p(target, "target");
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        f0.o(pathMove, "move(this, target, *options)");
        return pathMove;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path l0(Path path, Path target) throws IOException {
        f0.p(path, "<this>");
        f0.p(target, "target");
        Path pathCreateLink = Files.createLink(path, target);
        f0.o(pathCreateLink, "createLink(this, target)");
        return pathCreateLink;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean l1(Path path, LinkOption... options) {
        f0.p(path, "<this>");
        f0.p(options, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path m0(Path path, Path target, FileAttribute<?>... attributes) throws IOException {
        f0.p(path, "<this>");
        f0.p(target, "target");
        f0.p(attributes, "attributes");
        Path pathCreateSymbolicLink = Files.createSymbolicLink(path, target, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        f0.o(pathCreateSymbolicLink, "createSymbolicLink(this, target, *attributes)");
        return pathCreateSymbolicLink;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final /* synthetic */ <A extends BasicFileAttributes> A m1(Path path, LinkOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(options, "options");
        f0.y(4, androidx.exifinterface.media.a.W4);
        A a10 = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        f0.o(a10, "readAttributes(this, A::class.java, *options)");
        return a10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path n0(String str, FileAttribute<?>... attributes) throws IOException {
        f0.p(attributes, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        f0.o(pathCreateTempDirectory, "createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Map<String, Object> n1(Path path, String attributes, LinkOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(attributes, "attributes");
        f0.p(options, "options");
        Map<String, Object> attributes2 = Files.readAttributes(path, attributes, (LinkOption[]) Arrays.copyOf(options, options.length));
        f0.o(attributes2, "readAttributes(this, attributes, *options)");
        return attributes2;
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {e.class})
    public static final Path o0(@dl.e Path path, @dl.e String str, @dl.d FileAttribute<?>... attributes) throws IOException {
        f0.p(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            f0.o(pathCreateTempDirectory, "createTempDirectory(dire…ory, prefix, *attributes)");
            return pathCreateTempDirectory;
        }
        Path pathCreateTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        f0.o(pathCreateTempDirectory2, "createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory2;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path o1(Path path) throws IOException {
        f0.p(path, "<this>");
        Path symbolicLink = Files.readSymbolicLink(path);
        f0.o(symbolicLink, "readSymbolicLink(this)");
        return symbolicLink;
    }

    static /* synthetic */ Path p0(String str, FileAttribute[] attributes, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = null;
        }
        f0.p(attributes, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        f0.o(pathCreateTempDirectory, "createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory;
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {e.class})
    public static final Path p1(@dl.d Path path, @dl.d Path base) {
        f0.p(path, "<this>");
        f0.p(base, "base");
        try {
            return k.f124856a.a(path, base);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(e10.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e10);
        }
    }

    public static /* synthetic */ Path q0(Path path, String str, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return o0(path, str, fileAttributeArr);
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {e.class})
    public static final Path q1(@dl.d Path path, @dl.d Path base) {
        f0.p(path, "<this>");
        f0.p(base, "base");
        try {
            return k.f124856a.a(path, base);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path r0(String str, String str2, FileAttribute<?>... attributes) throws IOException {
        f0.p(attributes, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        f0.o(pathCreateTempFile, "createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile;
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {e.class})
    public static final Path r1(@dl.d Path path, @dl.d Path base) {
        f0.p(path, "<this>");
        f0.p(base, "base");
        Path pathQ1 = q1(path, base);
        return pathQ1 == null ? path : pathQ1;
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {e.class})
    public static final Path s0(@dl.e Path path, @dl.e String str, @dl.e String str2, @dl.d FileAttribute<?>... attributes) throws IOException {
        f0.p(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            f0.o(pathCreateTempFile, "createTempFile(directory…fix, suffix, *attributes)");
            return pathCreateTempFile;
        }
        Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        f0.o(pathCreateTempFile2, "createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile2;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path s1(Path path, String attribute, Object obj, LinkOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(attribute, "attribute");
        f0.p(options, "options");
        Path attribute2 = Files.setAttribute(path, attribute, obj, (LinkOption[]) Arrays.copyOf(options, options.length));
        f0.o(attribute2, "setAttribute(this, attribute, value, *options)");
        return attribute2;
    }

    static /* synthetic */ Path t0(String str, String str2, FileAttribute[] attributes, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        f0.p(attributes, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        f0.o(pathCreateTempFile, "createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path t1(Path path, FileTime value) throws IOException {
        f0.p(path, "<this>");
        f0.p(value, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, value);
        f0.o(lastModifiedTime, "setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    public static /* synthetic */ Path u0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return s0(path, str, str2, fileAttributeArr);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path u1(Path path, UserPrincipal value) throws IOException {
        f0.p(path, "<this>");
        f0.p(value, "value");
        Path owner = Files.setOwner(path, value);
        f0.o(owner, "setOwner(this, value)");
        return owner;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final void v0(Path path) throws IOException {
        f0.p(path, "<this>");
        Files.delete(path);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path v1(Path path, Set<? extends PosixFilePermission> value) throws IOException {
        f0.p(path, "<this>");
        f0.p(value, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, value);
        f0.o(posixFilePermissions, "setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean w0(Path path) throws IOException {
        f0.p(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path w1(URI uri) {
        f0.p(uri, "<this>");
        Path path = Paths.get(uri);
        f0.o(path, "get(this)");
        return path;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path x0(Path path, String other) {
        f0.p(path, "<this>");
        f0.p(other, "other");
        Path pathResolve = path.resolve(other);
        f0.o(pathResolve, "this.resolve(other)");
        return pathResolve;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final <T> T x1(Path path, String glob, yh.l<? super kotlin.sequences.m<? extends Path>, ? extends T> block) throws IOException {
        f0.p(path, "<this>");
        f0.p(glob, "glob");
        f0.p(block, "block");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            f0.o(it, "it");
            T tInvoke = block.invoke(CollectionsKt___CollectionsKt.v1(it));
            c0.d(1);
            kotlin.io.b.a(it, null);
            c0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                kotlin.io.b.a(it, th2);
                c0.c(1);
                throw th3;
            }
        }
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path y0(Path path, Path other) {
        f0.p(path, "<this>");
        f0.p(other, "other");
        Path pathResolve = path.resolve(other);
        f0.o(pathResolve, "this.resolve(other)");
        return pathResolve;
    }

    static /* synthetic */ Object y1(Path path, String glob, yh.l block, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            glob = androidx.webkit.b.f28327e;
        }
        f0.p(path, "<this>");
        f0.p(glob, "glob");
        f0.p(block, "block");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            f0.o(it, "it");
            Object objInvoke = block.invoke(CollectionsKt___CollectionsKt.v1(it));
            c0.d(1);
            kotlin.io.b.a(it, null);
            c0.c(1);
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                kotlin.io.b.a(it, th2);
                c0.c(1);
                throw th3;
            }
        }
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final boolean z0(Path path, LinkOption... options) {
        f0.p(path, "<this>");
        f0.p(options, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @u0(version = s0.f136932w)
    @e
    public static final void z1(@dl.d Path path, int i10, boolean z10, @dl.d yh.l<? super f, b2> builderAction) throws IOException {
        f0.p(path, "<this>");
        f0.p(builderAction, "builderAction");
        A1(path, F0(builderAction), i10, z10);
    }
}
