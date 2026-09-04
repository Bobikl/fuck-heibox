package org.apache.tools.ant.types;

import com.xiaomi.mipush.sdk.Constants;
import java.net.SocketPermission;
import java.security.Permission;
import java.security.Permissions;
import java.security.UnresolvedPermission;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PropertyPermission;
import java.util.Set;
import java.util.StringTokenizer;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.ExitException;

/* JADX INFO: compiled from: Permissions.java */
/* JADX INFO: loaded from: classes5.dex */
public class x0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class<?>[] f136665g = {String.class, String.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f136666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f136667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Permissions f136668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SecurityManager f136669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f136670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f136671f;

    /* JADX INFO: compiled from: Permissions.java */
    public class b extends SecurityManager {
        private b() {
        }

        private void a(Permission permission) {
            Iterator it = x0.this.f136667b.iterator();
            while (it.hasNext()) {
                if (((c) it.next()).d(permission)) {
                    throw new SecurityException("Permission " + permission + " was revoked.");
                }
            }
        }

        @Override // java.lang.SecurityManager
        public void checkExit(int i10) {
            try {
                checkPermission(new RuntimePermission("exitVM", null));
            } catch (SecurityException e10) {
                throw new ExitException(e10.getMessage(), i10);
            }
        }

        @Override // java.lang.SecurityManager
        public void checkPermission(Permission permission) {
            if (x0.this.f136670e) {
                if (x0.this.f136671f && !permission.getName().equals("exitVM")) {
                    boolean zImplies = x0.this.f136668c.implies(permission);
                    a(permission);
                    if (zImplies || x0.this.f136669d == null) {
                        return;
                    }
                    x0.this.f136669d.checkPermission(permission);
                    return;
                }
                if (x0.this.f136668c.implies(permission)) {
                    a(permission);
                    return;
                }
                throw new SecurityException("Permission " + permission + " was not granted.");
            }
        }
    }

    /* JADX INFO: compiled from: Permissions.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f136673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f136674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f136675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Set<String> f136676d;

        private Set<String> e(String str) {
            HashSet hashSet = new HashSet();
            StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if (!strTrim.isEmpty()) {
                    hashSet.add(strTrim);
                }
            }
            return hashSet;
        }

        public String a() {
            return this.f136675c;
        }

        public String b() {
            return this.f136673a;
        }

        public String c() {
            return this.f136674b;
        }

        boolean d(Permission permission) {
            if (!this.f136673a.equals(permission.getClass().getName())) {
                return false;
            }
            String str = this.f136674b;
            if (str != null) {
                if (str.endsWith(androidx.webkit.b.f28327e)) {
                    String name = permission.getName();
                    String str2 = this.f136674b;
                    if (!name.startsWith(str2.substring(0, str2.length() - 1))) {
                        return false;
                    }
                } else if (!this.f136674b.equals(permission.getName())) {
                    return false;
                }
            }
            if (this.f136676d == null) {
                return true;
            }
            Set<String> setE = e(permission.getActions());
            int size = setE.size();
            setE.removeAll(this.f136676d);
            return setE.size() != size;
        }

        public void f(String str) {
            this.f136675c = str;
            if (str.isEmpty()) {
                return;
            }
            this.f136676d = e(str);
        }

        public void g(String str) {
            this.f136673a = str.trim();
        }

        public void h(String str) {
            this.f136674b = str.trim();
        }

        public String toString() {
            return "Permission: " + this.f136673a + " (\"" + this.f136674b + "\", \"" + this.f136676d + "\")";
        }
    }

    public x0() {
        this(false);
    }

    public x0(boolean z10) {
        this.f136666a = new LinkedList();
        this.f136667b = new LinkedList();
        this.f136668c = null;
        this.f136669d = null;
        this.f136670e = false;
        this.f136671f = z10;
    }

    private Permission h(c cVar) {
        try {
            return (Permission) Class.forName(cVar.b()).asSubclass(Permission.class).getConstructor(f136665g).newInstance(cVar.c(), cVar.a());
        } catch (Exception unused) {
            return new UnresolvedPermission(cVar.b(), cVar.c(), cVar.a(), null);
        }
    }

    private void i() throws BuildException {
        this.f136668c = new Permissions();
        for (c cVar : this.f136667b) {
            if (cVar.b() == null) {
                throw new BuildException("Revoked permission " + cVar + " does not contain a class.");
            }
        }
        for (c cVar2 : this.f136666a) {
            if (cVar2.b() == null) {
                throw new BuildException("Granted permission " + cVar2 + " does not contain a class.");
            }
            this.f136668c.add(h(cVar2));
        }
        this.f136668c.add(new SocketPermission("localhost:1024-", "listen"));
        this.f136668c.add(new PropertyPermission("java.version", "read"));
        this.f136668c.add(new PropertyPermission("java.vendor", "read"));
        this.f136668c.add(new PropertyPermission("java.vendor.url", "read"));
        this.f136668c.add(new PropertyPermission("java.class.version", "read"));
        this.f136668c.add(new PropertyPermission("os.name", "read"));
        this.f136668c.add(new PropertyPermission("os.version", "read"));
        this.f136668c.add(new PropertyPermission("os.arch", "read"));
        this.f136668c.add(new PropertyPermission("file.encoding", "read"));
        this.f136668c.add(new PropertyPermission("file.separator", "read"));
        this.f136668c.add(new PropertyPermission("path.separator", "read"));
        this.f136668c.add(new PropertyPermission("line.separator", "read"));
        this.f136668c.add(new PropertyPermission("java.specification.version", "read"));
        this.f136668c.add(new PropertyPermission("java.specification.vendor", "read"));
        this.f136668c.add(new PropertyPermission("java.specification.name", "read"));
        this.f136668c.add(new PropertyPermission("java.vm.specification.version", "read"));
        this.f136668c.add(new PropertyPermission("java.vm.specification.vendor", "read"));
        this.f136668c.add(new PropertyPermission("java.vm.specification.name", "read"));
        this.f136668c.add(new PropertyPermission("java.vm.version", "read"));
        this.f136668c.add(new PropertyPermission("java.vm.vendor", "read"));
        this.f136668c.add(new PropertyPermission("java.vm.name", "read"));
    }

    public void f(c cVar) {
        this.f136666a.add(cVar);
    }

    public void g(c cVar) {
        this.f136667b.add(cVar);
    }

    public synchronized void j() {
        this.f136670e = false;
        System.setSecurityManager(this.f136669d);
    }

    public synchronized void k() throws BuildException {
        this.f136669d = System.getSecurityManager();
        i();
        System.setSecurityManager(new b());
        this.f136670e = true;
    }
}
