package org.apache.tools.ant.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes5.dex */
public class PermissionUtils {

    public enum FileType {
        REGULAR_FILE,
        DIR,
        SYMLINK,
        OTHER;

        public static FileType of(Path path) throws IOException {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, new LinkOption[0]);
            if (attributes.isRegularFile()) {
                return REGULAR_FILE;
            }
            if (attributes.isDirectory()) {
                return DIR;
            }
            return attributes.isSymbolicLink() ? SYMLINK : OTHER;
        }

        public static FileType of(org.apache.tools.ant.types.s1 s1Var) {
            return s1Var.o2() ? DIR : REGULAR_FILE;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f136717a;

        static {
            int[] iArr = new int[FileType.values().length];
            f136717a = iArr;
            try {
                iArr[FileType.SYMLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f136717a[FileType.REGULAR_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f136717a[FileType.DIR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private PermissionUtils() {
    }

    private static void a(Set<PosixFilePermission> set, String str, long j10) {
        if ((j10 & 1) == 1) {
            set.add(PosixFilePermission.valueOf(str + "_EXECUTE"));
        }
        if ((j10 & 2) == 2) {
            set.add(PosixFilePermission.valueOf(str + "_WRITE"));
        }
        if ((j10 & 4) == 4) {
            set.add(PosixFilePermission.valueOf(str + "_READ"));
        }
    }

    public static Set<PosixFilePermission> b(org.apache.tools.ant.types.s1 s1Var, Function<Path, Set<PosixFilePermission>> function) throws IOException {
        org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
        if (yVar != null) {
            Path path = yVar.l0().toPath();
            PosixFileAttributeView posixFileAttributeView = (PosixFileAttributeView) Files.getFileAttributeView(path, PosixFileAttributeView.class, new LinkOption[0]);
            if (posixFileAttributeView != null) {
                return posixFileAttributeView.readAttributes().permissions();
            }
            if (function != null) {
                return function.apply(path);
            }
        } else if (s1Var instanceof org.apache.tools.ant.types.resources.g) {
            return e(((org.apache.tools.ant.types.resources.g) s1Var).A2());
        }
        return EnumSet.noneOf(PosixFilePermission.class);
    }

    public static int c(Set<PosixFilePermission> set, FileType fileType) {
        int i10;
        int i11 = a.f136717a[fileType.ordinal()];
        if (i11 == 1) {
            i10 = 10;
        } else if (i11 != 2) {
            i10 = i11 != 3 ? 0 : 4;
        } else {
            i10 = 8;
        }
        return (int) (d(set, "OTHERS") | ((long) (((int) (((long) (((int) (((long) ((i10 << 3) << 3)) | d(set, "OWNER"))) << 3)) | d(set, "GROUP"))) << 3)));
    }

    private static long d(Set<PosixFilePermission> set, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_READ");
        long j10 = set.contains(PosixFilePermission.valueOf(sb2.toString())) ? 4L : 0L;
        if (set.contains(PosixFilePermission.valueOf(str + "_WRITE"))) {
            j10 |= 2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("_EXECUTE");
        return set.contains(PosixFilePermission.valueOf(sb3.toString())) ? j10 | 1 : j10;
    }

    public static Set<PosixFilePermission> e(int i10) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(PosixFilePermission.class);
        a(enumSetNoneOf, "OTHERS", i10);
        a(enumSetNoneOf, "GROUP", i10 >> 3);
        a(enumSetNoneOf, "OWNER", i10 >> 6);
        return enumSetNoneOf;
    }

    public static void f(org.apache.tools.ant.types.s1 s1Var, Set<PosixFilePermission> set, Consumer<Path> consumer) throws IOException {
        org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
        if (yVar == null) {
            if (s1Var instanceof org.apache.tools.ant.types.resources.g) {
                ((org.apache.tools.ant.types.resources.g) s1Var).D2(c(set, FileType.of(s1Var)));
                return;
            }
            return;
        }
        Path path = yVar.l0().toPath();
        PosixFileAttributeView posixFileAttributeView = (PosixFileAttributeView) Files.getFileAttributeView(path, PosixFileAttributeView.class, new LinkOption[0]);
        if (posixFileAttributeView != null) {
            posixFileAttributeView.setPermissions(set);
        } else if (consumer != null) {
            consumer.accept(path);
        }
    }
}
