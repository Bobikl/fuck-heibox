package org.apache.tools.ant.taskdefs.condition;

import java.io.File;
import java.util.Locale;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Os.java */
/* JADX INFO: loaded from: classes5.dex */
public class z implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f133964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f133965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f133966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f133967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f133968j = "windows";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f133969k = "win9x";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f133970l = "winnt";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f133971m = "os/2";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f133972n = "netware";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f133973o = "dos";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f133974p = "mac";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f133975q = "tandem";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f133976r = "unix";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f133977s = "openvms";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f133978t = "z/os";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f133979u = "os/400";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f133980v = "darwin";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f133981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f133982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f133983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133984e;

    static {
        String property = System.getProperty("os.name");
        Locale locale = Locale.ENGLISH;
        f133964f = property.toLowerCase(locale);
        f133965g = System.getProperty("os.arch").toLowerCase(locale);
        f133966h = System.getProperty("os.version").toLowerCase(locale);
        f133967i = File.pathSeparator;
    }

    public z() {
    }

    public z(String str) {
        h(str);
    }

    public static boolean a(String str) {
        return d(null, null, str, null);
    }

    public static boolean b(String str) {
        return d(str, null, null, null);
    }

    public static boolean c(String str) {
        return d(null, str, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:119:0x017c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b  */
    public static boolean d(String str, String str2, String str3, String str4) {
        boolean zContains;
        boolean z10;
        boolean z11;
        byte b10;
        byte b11;
        if (str != null || str2 != null || str3 != null || str4 != null) {
            if (str == null) {
                zContains = true;
            } else {
                String str5 = f133964f;
                zContains = str5.contains("windows");
                if (zContains) {
                    z10 = str5.contains("95") || str5.contains("98") || str5.contains("me") || str5.contains("ce");
                    z11 = !z10;
                } else {
                    z10 = false;
                    z11 = false;
                }
                switch (str.hashCode()) {
                    case -1263172078:
                        if (!str.equals(f133977s)) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case -1009474935:
                        if (!str.equals(f133979u)) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case -881027893:
                        if (!str.equals(f133975q)) {
                            b10 = -1;
                        } else {
                            b11 = 2;
                            b10 = b11;
                        }
                        break;
                    case 99656:
                        if (!str.equals(f133973o)) {
                            b10 = -1;
                        } else {
                            b11 = 3;
                            b10 = b11;
                        }
                        break;
                    case 107855:
                        if (!str.equals("mac")) {
                            b10 = -1;
                        } else {
                            b11 = 4;
                            b10 = b11;
                        }
                        break;
                    case 3418823:
                        if (!str.equals(f133971m)) {
                            b10 = -1;
                        } else {
                            b11 = 5;
                            b10 = b11;
                        }
                        break;
                    case 3594632:
                        if (!str.equals(f133976r)) {
                            b10 = -1;
                        } else {
                            b11 = 6;
                            b10 = b11;
                        }
                        break;
                    case 3683225:
                        if (!str.equals(f133978t)) {
                            b10 = -1;
                        } else {
                            b11 = 7;
                            b10 = b11;
                        }
                        break;
                    case 113134651:
                        if (!str.equals(f133969k)) {
                            b10 = -1;
                        } else {
                            b11 = 8;
                            b10 = b11;
                        }
                        break;
                    case 113136290:
                        if (!str.equals(f133970l)) {
                            b10 = -1;
                        } else {
                            b11 = 9;
                            b10 = b11;
                        }
                        break;
                    case 1349493379:
                        if (!str.equals("windows")) {
                            b10 = -1;
                        } else {
                            b11 = 10;
                            b10 = b11;
                        }
                        break;
                    case 1843471770:
                        if (!str.equals(f133972n)) {
                            b10 = -1;
                        } else {
                            b11 = 11;
                            b10 = b11;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        zContains = str5.contains(f133977s);
                        break;
                    case 1:
                        zContains = str5.contains(f133979u);
                        break;
                    case 2:
                        zContains = str5.contains("nonstop_kernel");
                        break;
                    case 3:
                        if (f133967i.equals(";") && !b(f133972n)) {
                            zContains = true;
                        } else {
                            zContains = false;
                        }
                        break;
                    case 4:
                        if (str5.contains("mac") || str5.contains(f133980v)) {
                            zContains = true;
                        } else {
                            zContains = false;
                        }
                        break;
                    case 5:
                        zContains = str5.contains(f133971m);
                        break;
                    case 6:
                        if (f133967i.equals(":") && !b(f133977s) && (!b("mac") || str5.endsWith("x") || str5.contains(f133980v))) {
                            zContains = true;
                        } else {
                            zContains = false;
                        }
                        break;
                    case 7:
                        if (str5.contains(f133978t) || str5.contains("os/390")) {
                            zContains = true;
                        } else {
                            zContains = false;
                        }
                        break;
                    case 8:
                        if (zContains && z10) {
                            zContains = true;
                        } else {
                            zContains = false;
                        }
                        break;
                    case 9:
                        if (zContains && z11) {
                            zContains = true;
                        } else {
                            zContains = false;
                        }
                        break;
                    case 10:
                        break;
                    case 11:
                        zContains = str5.contains(f133972n);
                        break;
                    default:
                        throw new BuildException("Don't know how to detect os family \"" + str + "\"");
                }
            }
            boolean zEquals = str2 != null ? str2.equals(f133964f) : true;
            boolean zEquals2 = str3 != null ? str3.equals(f133965g) : true;
            boolean zEquals3 = str4 != null ? str4.equals(f133966h) : true;
            if (zContains && zEquals && zEquals2 && zEquals3) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(String str) {
        return d(null, null, null, str);
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        return d(this.f133981b, this.f133982c, this.f133984e, this.f133983d);
    }

    public void g(String str) {
        this.f133984e = str.toLowerCase(Locale.ENGLISH);
    }

    public void h(String str) {
        this.f133981b = str.toLowerCase(Locale.ENGLISH);
    }

    public void i(String str) {
        this.f133982c = str.toLowerCase(Locale.ENGLISH);
    }

    public void j(String str) {
        this.f133983d = str.toLowerCase(Locale.ENGLISH);
    }
}
