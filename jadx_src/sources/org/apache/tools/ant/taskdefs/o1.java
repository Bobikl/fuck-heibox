package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.CommandlineJava;

/* JADX INFO: compiled from: ExecuteJava.java */
/* JADX INFO: loaded from: classes5.dex */
public class o1 implements Runnable, org.apache.tools.ant.util.o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.apache.tools.ant.types.o f134625b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f134626c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CommandlineJava.b f134627d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.apache.tools.ant.types.x0 f134628e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Method f134629f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f134630g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Throwable f134631h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f134632i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f134633j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Thread f134634k = null;

    public static void k(n1 n1Var, String[] strArr) {
        n1Var.D(true);
        try {
            String[] strArr2 = new String[strArr.length - 1];
            System.arraycopy(strArr, 1, strArr2, 0, strArr.length - 1);
            File fileC = org.apache.tools.ant.util.s0.c(strArr2);
            fileC.deleteOnExit();
            n1Var.x(new String[]{strArr[0], org.apache.tools.ant.taskdefs.optional.vss.g.T2, fileC.getPath()});
        } catch (IOException unused) {
            throw new BuildException("Failed to create a temporary file for \"-V\" switch");
        }
    }

    @Override // org.apache.tools.ant.util.o2
    public synchronized void a(org.apache.tools.ant.util.u2 u2Var) {
        if (this.f134634k != null) {
            this.f134632i = true;
            this.f134634k.interrupt();
        }
        this.f134633j = true;
        notifyAll();
    }

    public void b(Project project) throws Throwable {
        org.apache.tools.ant.g gVar;
        Class<?> cls;
        String strT = this.f134625b.t();
        org.apache.tools.ant.g gVar2 = null;
        try {
            try {
                CommandlineJava.b bVar = this.f134627d;
                if (bVar != null) {
                    bVar.k();
                }
                try {
                    org.apache.tools.ant.types.o0 o0Var = this.f134626c;
                    if (o0Var == null) {
                        cls = Class.forName(strT);
                        gVar = null;
                    } else {
                        org.apache.tools.ant.g gVarZ = project.z(o0Var);
                        try {
                            gVarZ.q0(project.f0());
                            gVarZ.t0(false);
                            gVarZ.c();
                            gVarZ.p0(true);
                            gVarZ.v0();
                            gVarZ.x(strT);
                            gVar = gVarZ;
                            cls = Class.forName(strT, true, gVarZ);
                        } catch (ClassNotFoundException unused) {
                            throw new BuildException("Could not find %s. Make sure you have it in your classpath", strT);
                        } catch (SecurityException e10) {
                            e = e10;
                            throw e;
                        } catch (ThreadDeath e11) {
                            e = e11;
                            throw e;
                        } catch (BuildException e12) {
                            e = e12;
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            throw new BuildException(th);
                        }
                    }
                    try {
                        Method method = cls.getMethod("main", String[].class);
                        this.f134629f = method;
                        if (method == null) {
                            throw new BuildException("Could not find main() method in %s", strT);
                        }
                        if ((method.getModifiers() & 8) == 0) {
                            throw new BuildException("main() method in %s is not declared static", strT);
                        }
                        if (this.f134630g == null) {
                            run();
                        } else {
                            this.f134634k = new Thread(this, "ExecuteJava");
                            project.T0(this.f134634k, project.A0(Thread.currentThread()));
                            this.f134634k.setDaemon(true);
                            org.apache.tools.ant.util.u2 u2Var = new org.apache.tools.ant.util.u2(this.f134630g.longValue());
                            u2Var.b(this);
                            synchronized (this) {
                                this.f134634k.start();
                                u2Var.f();
                                while (!this.f134633j) {
                                    try {
                                        wait();
                                    } catch (InterruptedException unused2) {
                                    }
                                }
                                if (this.f134632i) {
                                    project.M0("Timeout: sub-process interrupted", 1);
                                } else {
                                    this.f134634k = null;
                                    u2Var.g();
                                }
                            }
                        }
                        if (this.f134631h != null) {
                            throw this.f134631h;
                        }
                        if (gVar != null) {
                            gVar.m0();
                            gVar.n();
                        }
                        CommandlineJava.b bVar2 = this.f134627d;
                        if (bVar2 != null) {
                            bVar2.j();
                        }
                    } catch (SecurityException e13) {
                        e = e13;
                    } catch (ThreadDeath e14) {
                        e = e14;
                    } catch (BuildException e15) {
                        e = e15;
                    } catch (Throwable th3) {
                        th = th3;
                        throw new BuildException(th);
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } catch (Throwable th4) {
                if (0 != 0) {
                    gVar2.m0();
                    gVar2.n();
                }
                CommandlineJava.b bVar3 = this.f134627d;
                if (bVar3 != null) {
                    bVar3.j();
                }
                throw th4;
            }
        } catch (SecurityException e16) {
        } catch (ThreadDeath e17) {
        } catch (BuildException e18) {
            throw e18;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public int c(org.apache.tools.ant.b2 b2Var) throws BuildException {
        CommandlineJava commandlineJava = new CommandlineJava();
        commandlineJava.R(this.f134625b.t());
        for (String str : this.f134625b.r()) {
            commandlineJava.g().O1(str);
        }
        if (this.f134626c != null) {
            commandlineJava.i(b2Var.b()).n2(this.f134626c);
        }
        CommandlineJava.b bVar = this.f134627d;
        if (bVar != null) {
            commandlineJava.b(bVar);
        }
        i5 i5Var = new i5(b2Var);
        q1 q1VarF = i5Var.f();
        Long l10 = this.f134630g;
        n1 n1Var = new n1(q1VarF, l10 == null ? null : new r1(l10.longValue()));
        n1Var.w(b2Var.b());
        if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133977s)) {
            k(n1Var, commandlineJava.u());
        } else {
            n1Var.x(commandlineJava.u());
        }
        try {
            try {
                int iE = n1Var.e();
                i5Var.e();
                this.f134632i = n1Var.p();
                return iE;
            } catch (IOException e10) {
                throw new BuildException(e10);
            }
        } catch (Throwable th2) {
            this.f134632i = n1Var.p();
            throw th2;
        }
    }

    public synchronized boolean d() {
        return this.f134632i;
    }

    public void e(org.apache.tools.ant.types.o0 o0Var) {
        this.f134626c = o0Var;
    }

    public void f(org.apache.tools.ant.types.o oVar) {
        this.f134625b = oVar;
    }

    @Deprecated
    public void g(PrintStream printStream) {
    }

    public void h(org.apache.tools.ant.types.x0 x0Var) {
        this.f134628e = x0Var;
    }

    public void i(CommandlineJava.b bVar) {
        this.f134627d = bVar;
    }

    public void j(Long l10) {
        this.f134630g = l10;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = {this.f134625b.r()};
        try {
            try {
                org.apache.tools.ant.types.x0 x0Var = this.f134628e;
                if (x0Var != null) {
                    x0Var.k();
                }
                this.f134629f.invoke(null, objArr);
                org.apache.tools.ant.types.x0 x0Var2 = this.f134628e;
                if (x0Var2 != null) {
                    x0Var2.j();
                }
                synchronized (this) {
                    this.f134633j = true;
                    notifyAll();
                }
            } catch (Throwable th2) {
                org.apache.tools.ant.types.x0 x0Var3 = this.f134628e;
                if (x0Var3 != null) {
                    x0Var3.j();
                }
                synchronized (this) {
                    this.f134633j = true;
                    notifyAll();
                    throw th2;
                }
            }
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (!(targetException instanceof InterruptedException)) {
                this.f134631h = targetException;
            }
            org.apache.tools.ant.types.x0 x0Var4 = this.f134628e;
            if (x0Var4 != null) {
                x0Var4.j();
            }
            synchronized (this) {
                this.f134633j = true;
                notifyAll();
            }
        } catch (Throwable th3) {
            this.f134631h = th3;
            org.apache.tools.ant.types.x0 x0Var5 = this.f134628e;
            if (x0Var5 != null) {
                x0Var5.j();
            }
            synchronized (this) {
                this.f134633j = true;
                notifyAll();
            }
        }
    }
}
