package org.apache.tools.ant.taskdefs;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.PermissionUtils;

/* JADX INFO: loaded from: classes5.dex */
public class SetPermissions extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set<PosixFilePermission> f133632k = EnumSet.noneOf(PosixFilePermission.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.f1 f133633l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f133634m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private NonPosixMode f133635n = NonPosixMode.fail;

    public enum NonPosixMode {
        fail,
        pass,
        tryDosOrFail,
        tryDosOrPass
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133636a;

        static {
            int[] iArr = new int[NonPosixMode.values().length];
            f133636a = iArr;
            try {
                iArr[NonPosixMode.fail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133636a[NonPosixMode.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133636a[NonPosixMode.tryDosOrFail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f133636a[NonPosixMode.tryDosOrPass.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private boolean m2() {
        return this.f133632k.contains(PosixFilePermission.OWNER_WRITE) || this.f133632k.contains(PosixFilePermission.GROUP_WRITE) || this.f133632k.contains(PosixFilePermission.OTHERS_WRITE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean n2(String str) {
        return !str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ PosixFilePermission o2(String str) {
        return (PosixFilePermission) Enum.valueOf(PosixFilePermission.class, str);
    }

    private void p2(Exception exc, String str, Object... objArr) {
        String str2 = String.format(str, objArr);
        if (this.f133634m) {
            if (!(exc instanceof BuildException)) {
                throw new BuildException(str2, exc);
            }
            throw ((BuildException) exc);
        }
        x1("Warning: " + str2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q2(Path path) {
        String str = String.format("the associated path '%s' does not support the PosixFileAttributeView", path);
        int i10 = a.f133636a[this.f133635n.ordinal()];
        if (i10 == 1) {
            throw new BuildException(str);
        }
        if (i10 == 2) {
            x1("Warning: " + str, 0);
            return;
        }
        if (i10 == 3) {
            v2(path, true);
        } else {
            if (i10 != 4) {
                return;
            }
            v2(path, false);
        }
    }

    private void v2(Path path, boolean z10) {
        log("Falling back to DosFileAttributeView");
        boolean z11 = !m2();
        DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(path, DosFileAttributeView.class, new LinkOption[0]);
        if (dosFileAttributeView != null) {
            try {
                dosFileAttributeView.setReadOnly(z11);
                return;
            } catch (IOException e10) {
                p2(e10, "Failed to set permissions on '%s' due to %s", path, e10.getMessage());
                return;
            } catch (SecurityException unused) {
                p2(null, "the SecurityManager denies role accessUserInformation or write access for SecurityManager.checkWrite for resource '%s'", path);
                return;
            }
        }
        String str = String.format("the associated path '%s' does not support the DosFileAttributeView", path);
        if (z10) {
            throw new BuildException(str);
        }
        x1("Warning: " + str, 0);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        Object obj;
        org.apache.tools.ant.types.resources.f1 f1Var = this.f133633l;
        if (f1Var == null) {
            throw new BuildException("At least one resource-collection is required");
        }
        try {
            try {
                obj = null;
                for (org.apache.tools.ant.types.s1 s1Var : f1Var) {
                    try {
                        try {
                            try {
                                PermissionUtils.f(s1Var, this.f133632k, new Consumer() { // from class: org.apache.tools.ant.taskdefs.e6
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj2) {
                                        this.f134096b.q2((Path) obj2);
                                    }
                                });
                            } catch (SecurityException unused) {
                                obj = s1Var;
                                p2(null, "the SecurityManager denies role accessUserInformation or write access for SecurityManager.checkWrite for resource '%s'", obj);
                                return;
                            }
                        } catch (IOException e10) {
                            p2(e10, "Failed to set permissions on '%s' due to %s", s1Var, e10.getMessage());
                        }
                        obj = s1Var;
                    } catch (SecurityException unused2) {
                    }
                }
            } catch (SecurityException unused3) {
                obj = null;
            }
        } catch (ClassCastException unused4) {
            p2(null, "some specified permissions are not of type PosixFilePermission: %s", org.apache.tools.ant.util.j2.c(this.f133632k, ", "));
        } catch (BuildException e11) {
            p2(e11, e11.getMessage(), new Object[0]);
        }
    }

    public void l2(org.apache.tools.ant.types.u1 u1Var) {
        if (this.f133633l == null) {
            this.f133633l = new org.apache.tools.ant.types.resources.f1();
        }
        this.f133633l.g2(u1Var);
    }

    public void r2(boolean z10) {
        this.f133634m = z10;
    }

    public void s2(String str) {
        this.f133632k.addAll(PermissionUtils.e(Integer.parseInt(str, 8)));
    }

    public void t2(NonPosixMode nonPosixMode) {
        this.f133635n = nonPosixMode;
    }

    public void u2(String str) {
        if (str != null) {
            Stream map = Arrays.stream(str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)).map(new v()).filter(new Predicate() { // from class: org.apache.tools.ant.taskdefs.f6
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return SetPermissions.n2((String) obj);
                }
            }).map(new Function() { // from class: org.apache.tools.ant.taskdefs.g6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return SetPermissions.o2((String) obj);
                }
            });
            final Set<PosixFilePermission> set = this.f133632k;
            Objects.requireNonNull(set);
            map.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.h6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    set.add((PosixFilePermission) obj);
                }
            });
        }
    }
}
