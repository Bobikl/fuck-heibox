package kotlin.io.path;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class PathsKt__PathRecursiveFunctionsKt extends n {

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f124807b;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f124806a = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f124807b = iArr2;
        }
    }

    private static final void J(d dVar, yh.a<b2> aVar) {
        try {
            aVar.invoke();
        } catch (Exception e10) {
            dVar.a(e10);
        }
    }

    @u0(version = s0.f136934y)
    @dl.d
    @e
    public static final Path K(@dl.d final Path path, @dl.d final Path target, @dl.d final q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean z10, @dl.d final q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends CopyActionResult> copyAction) throws IOException {
        f0.p(path, "<this>");
        f0.p(target, "target");
        f0.p(onError, "onError");
        f0.p(copyAction, "copyAction");
        LinkOption[] linkOptionArrA = i.f124847a.a(z10);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrA, linkOptionArrA.length);
        if (!Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            throw new NoSuchFileException(path.toString(), target.toString(), "The source file doesn't exist.");
        }
        boolean zStartsWith = false;
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z10 || !Files.isSymbolicLink(path))) {
            boolean z11 = Files.exists(target, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(target);
            if (!z11 || !Files.isSameFile(path, target)) {
                Path realPath = path.toRealPath(new LinkOption[0]);
                if (z11) {
                    zStartsWith = target.toRealPath(new LinkOption[0]).startsWith(realPath);
                } else {
                    Path parent = target.getParent();
                    if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(realPath)) {
                        zStartsWith = true;
                    }
                }
                if (zStartsWith) {
                    throw new FileSystemException(path.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                }
            }
        }
        o.B1(path, 0, z10, new yh.l<f, b2>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5

            /* JADX INFO: renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$1, reason: invalid class name */
            /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements p<Path, BasicFileAttributes, FileVisitResult> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ q<a, Path, Path, CopyActionResult> f124816d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Path f124817e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ Path f124818f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ q<Path, Path, Exception, OnErrorResult> f124819g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(q<? super a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2) {
                    super(2, f0.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                    this.f124816d = qVar;
                    this.f124817e = path;
                    this.f124818f = path2;
                    this.f124819g = qVar2;
                }

                @Override // yh.p
                @dl.d
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public final FileVisitResult invoke(@dl.d Path p10, @dl.d BasicFileAttributes p11) {
                    f0.p(p10, "p0");
                    f0.p(p11, "p1");
                    return PathsKt__PathRecursiveFunctionsKt.M(this.f124816d, this.f124817e, this.f124818f, this.f124819g, p10, p11);
                }
            }

            /* JADX INFO: renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2, reason: invalid class name */
            /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
            public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements p<Path, BasicFileAttributes, FileVisitResult> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ q<a, Path, Path, CopyActionResult> f124820d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Path f124821e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ Path f124822f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ q<Path, Path, Exception, OnErrorResult> f124823g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(q<? super a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2) {
                    super(2, f0.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                    this.f124820d = qVar;
                    this.f124821e = path;
                    this.f124822f = path2;
                    this.f124823g = qVar2;
                }

                @Override // yh.p
                @dl.d
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public final FileVisitResult invoke(@dl.d Path p10, @dl.d BasicFileAttributes p11) {
                    f0.p(p10, "p0");
                    f0.p(p11, "p1");
                    return PathsKt__PathRecursiveFunctionsKt.M(this.f124820d, this.f124821e, this.f124822f, this.f124823g, p10, p11);
                }
            }

            /* JADX INFO: renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3, reason: invalid class name */
            /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
            public final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements p<Path, Exception, FileVisitResult> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ q<Path, Path, Exception, OnErrorResult> f124824d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Path f124825e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ Path f124826f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2) {
                    super(2, f0.a.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                    this.f124824d = qVar;
                    this.f124825e = path;
                    this.f124826f = path2;
                }

                @Override // yh.p
                @dl.d
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public final FileVisitResult invoke(@dl.d Path p10, @dl.d Exception p11) {
                    f0.p(p10, "p0");
                    f0.p(p11, "p1");
                    return PathsKt__PathRecursiveFunctionsKt.Q(this.f124824d, this.f124825e, this.f124826f, p10, p11);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d f visitFileTree) {
                f0.p(visitFileTree, "$this$visitFileTree");
                visitFileTree.c(new AnonymousClass1(copyAction, path, target, onError));
                visitFileTree.b(new AnonymousClass2(copyAction, path, target, onError));
                visitFileTree.d(new AnonymousClass3(onError, path, target));
                final q<Path, Path, Exception, OnErrorResult> qVar = onError;
                final Path path2 = path;
                final Path path3 = target;
                visitFileTree.a(new p<Path, IOException, FileVisitResult>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // yh.p
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final FileVisitResult invoke(@dl.d Path directory, @dl.e IOException iOException) {
                        f0.p(directory, "directory");
                        return iOException == null ? FileVisitResult.CONTINUE : PathsKt__PathRecursiveFunctionsKt.Q(qVar, path2, path3, directory, iOException);
                    }
                });
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(f fVar) {
                a(fVar);
                return b2.f124493a;
            }
        }, 1, null);
        return target;
    }

    @u0(version = s0.f136934y)
    @dl.d
    @e
    public static final Path L(@dl.d Path path, @dl.d Path target, @dl.d q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, final boolean z10, boolean z11) {
        f0.p(path, "<this>");
        f0.p(target, "target");
        f0.p(onError, "onError");
        return z11 ? K(path, target, onError, z10, new q<kotlin.io.path.a, Path, Path, CopyActionResult>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // yh.q
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CopyActionResult invoke(@dl.d a copyToRecursively, @dl.d Path src, @dl.d Path dst) throws IllegalAccessException, FileSystemException, InvocationTargetException {
                f0.p(copyToRecursively, "$this$copyToRecursively");
                f0.p(src, "src");
                f0.p(dst, "dst");
                LinkOption[] linkOptionArrA = i.f124847a.a(z10);
                boolean zIsDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
                LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrA, linkOptionArrA.length);
                if (!Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !zIsDirectory) {
                    if (zIsDirectory) {
                        PathsKt__PathRecursiveFunctionsKt.R(dst);
                    }
                    kotlin.jvm.internal.u0 u0Var = new kotlin.jvm.internal.u0(2);
                    u0Var.b(linkOptionArrA);
                    u0Var.a(StandardCopyOption.REPLACE_EXISTING);
                    CopyOption[] copyOptionArr = (CopyOption[]) u0Var.d(new CopyOption[u0Var.c()]);
                    f0.o(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
                }
                return CopyActionResult.CONTINUE;
            }
        }) : N(path, target, onError, z10, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult M(q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return Y(qVar.invoke(b.f124830a, path3, P(path, path2, path3)));
        } catch (Exception e10) {
            return Q(qVar2, path, path2, path3, e10);
        }
    }

    public static /* synthetic */ Path N(Path path, Path path2, q qVar, final boolean z10, q qVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qVar = new q() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3
                @Override // yh.q
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Void invoke(@dl.d Path path3, @dl.d Path path4, @dl.d Exception exception) throws Exception {
                    f0.p(path3, "<anonymous parameter 0>");
                    f0.p(path4, "<anonymous parameter 1>");
                    f0.p(exception, "exception");
                    throw exception;
                }
            };
        }
        if ((i10 & 8) != 0) {
            qVar2 = new q<kotlin.io.path.a, Path, Path, CopyActionResult>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // yh.q
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CopyActionResult invoke(@dl.d a aVar, @dl.d Path src, @dl.d Path dst) {
                    f0.p(aVar, "$this$null");
                    f0.p(src, "src");
                    f0.p(dst, "dst");
                    return aVar.a(src, dst, z10);
                }
            };
        }
        return K(path, path2, qVar, z10, qVar2);
    }

    public static /* synthetic */ Path O(Path path, Path path2, q qVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qVar = new q() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1
                @Override // yh.q
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Void invoke(@dl.d Path path3, @dl.d Path path4, @dl.d Exception exception) throws Exception {
                    f0.p(path3, "<anonymous parameter 0>");
                    f0.p(path4, "<anonymous parameter 1>");
                    f0.p(exception, "exception");
                    throw exception;
                }
            };
        }
        return L(path, path2, qVar, z10, z11);
    }

    private static final Path P(Path path, Path path2, Path path3) {
        Path pathResolve = path2.resolve(o.p1(path3, path));
        f0.o(pathResolve, "target.resolve(relativePath)");
        return pathResolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult Q(q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2, Path path3, Exception exc) {
        return Z(qVar.invoke(path3, P(path, path2, path3), exc));
    }

    @u0(version = s0.f136934y)
    @e
    public static final void R(@dl.d Path path) throws IllegalAccessException, FileSystemException, InvocationTargetException {
        f0.p(path, "<this>");
        List<Exception> listS = S(path);
        if (!listS.isEmpty()) {
            FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            Iterator<T> it = listS.iterator();
            while (it.hasNext()) {
                kotlin.o.a(fileSystemException, (Exception) it.next());
            }
            throw fileSystemException;
        }
    }

    private static final List<Exception> S(Path path) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        boolean z10 = false;
        boolean z11 = true;
        d dVar = new d(0, 1, null);
        Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    if (directoryStreamNewDirectoryStream instanceof SecureDirectoryStream) {
                        dVar.g(parent);
                        Path fileName = path.getFileName();
                        f0.o(fileName, "this.fileName");
                        U((SecureDirectoryStream) directoryStreamNewDirectoryStream, fileName, dVar);
                    } else {
                        z10 = true;
                    }
                    b2 b2Var = b2.f124493a;
                    kotlin.io.b.a(directoryStreamNewDirectoryStream, null);
                    z11 = z10;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.b.a(directoryStreamNewDirectoryStream, th2);
                        throw th3;
                    }
                }
            }
        }
        if (z11) {
            W(path, dVar);
        }
        return dVar.d();
    }

    private static final void T(SecureDirectoryStream<Path> secureDirectoryStream, Path path, d dVar) {
        SecureDirectoryStream<Path> secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e10) {
                dVar.a(e10);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStreamNewDirectoryStream = null;
        }
        if (secureDirectoryStreamNewDirectoryStream != null) {
            try {
                Iterator<Path> it = secureDirectoryStreamNewDirectoryStream.iterator();
                while (it.hasNext()) {
                    Path fileName = it.next().getFileName();
                    f0.o(fileName, "entry.fileName");
                    U(secureDirectoryStreamNewDirectoryStream, fileName, dVar);
                }
                b2 b2Var = b2.f124493a;
                kotlin.io.b.a(secureDirectoryStreamNewDirectoryStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(secureDirectoryStreamNewDirectoryStream, th2);
                    throw th3;
                }
            }
        }
    }

    private static final void U(SecureDirectoryStream<Path> secureDirectoryStream, Path path, d dVar) {
        dVar.b(path);
        try {
            try {
                if (X(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
                    int iF = dVar.f();
                    T(secureDirectoryStream, path, dVar);
                    if (iF == dVar.f()) {
                        secureDirectoryStream.deleteDirectory(path);
                        b2 b2Var = b2.f124493a;
                    }
                    dVar.c(path);
                }
                secureDirectoryStream.deleteFile(path);
                b2 b2Var2 = b2.f124493a;
            } catch (NoSuchFileException unused) {
            }
        } catch (Exception e10) {
            dVar.a(e10);
        }
        dVar.c(path);
    }

    private static final void V(Path path, d dVar) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (Exception e10) {
                dVar.a(e10);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStreamNewDirectoryStream = null;
        }
        if (directoryStreamNewDirectoryStream != null) {
            try {
                for (Path entry : directoryStreamNewDirectoryStream) {
                    f0.o(entry, "entry");
                    W(entry, dVar);
                }
                b2 b2Var = b2.f124493a;
                kotlin.io.b.a(directoryStreamNewDirectoryStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(directoryStreamNewDirectoryStream, th2);
                    throw th3;
                }
            }
        }
    }

    private static final void W(Path path, d dVar) {
        try {
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                int iF = dVar.f();
                V(path, dVar);
                if (iF == dVar.f()) {
                    Files.deleteIfExists(path);
                }
            } else {
                Files.deleteIfExists(path);
            }
        } catch (Exception e10) {
            dVar.a(e10);
        }
    }

    private static final boolean X(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @e
    private static final FileVisitResult Y(CopyActionResult copyActionResult) {
        int i10 = a.f124806a[copyActionResult.ordinal()];
        if (i10 == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i10 == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i10 == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @e
    private static final FileVisitResult Z(OnErrorResult onErrorResult) {
        int i10 = a.f124807b[onErrorResult.ordinal()];
        if (i10 == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i10 == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final <R> R a0(yh.a<? extends R> aVar) {
        try {
            return aVar.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
