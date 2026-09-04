package org.apache.tools.ant.taskdefs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: compiled from: ProcessDestroyer.java */
/* JADX INFO: loaded from: classes5.dex */
public class u4 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f135824h = 20000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Method f135826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Method f135827d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Process> f135825b = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f135828e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f135829f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f135830g = false;

    /* JADX INFO: compiled from: ProcessDestroyer.java */
    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f135831b;

        public a() {
            super("ProcessDestroyer Shutdown Hook");
            this.f135831b = true;
        }

        public void a(boolean z10) {
            this.f135831b = z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (this.f135831b) {
                u4.this.run();
            }
        }
    }

    u4() {
        try {
            this.f135826c = Runtime.class.getMethod("addShutdownHook", Thread.class);
            this.f135827d = Runtime.class.getMethod("removeShutdownHook", Thread.class);
        } catch (NoSuchMethodException unused) {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void b() {
        if (this.f135826c == null || this.f135830g) {
            return;
        }
        this.f135828e = new a();
        try {
            this.f135826c.invoke(Runtime.getRuntime(), this.f135828e);
            this.f135829f = true;
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InvocationTargetException e11) {
            Throwable targetException = e11.getTargetException();
            if (targetException == null || targetException.getClass() != IllegalStateException.class) {
                e11.printStackTrace();
            } else {
                this.f135830g = true;
            }
        }
    }

    private void e() {
        Method method = this.f135827d;
        if (method == null || !this.f135829f || this.f135830g) {
            return;
        }
        try {
            if (!Boolean.TRUE.equals(method.invoke(Runtime.getRuntime(), this.f135828e))) {
                System.err.println("Could not remove shutdown hook");
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InvocationTargetException e11) {
            Throwable targetException = e11.getTargetException();
            if (targetException == null || targetException.getClass() != IllegalStateException.class) {
                e11.printStackTrace();
            } else {
                this.f135830g = true;
            }
        }
        this.f135828e.a(false);
        if (!this.f135828e.getThreadGroup().isDestroyed()) {
            this.f135828e.start();
        }
        try {
            this.f135828e.join(com.google.android.exoplayer2.audio.q0.f44202v);
        } catch (InterruptedException unused) {
        }
        this.f135828e = null;
        this.f135829f = false;
    }

    public boolean a(Process process) {
        boolean zAdd;
        synchronized (this.f135825b) {
            if (this.f135825b.isEmpty()) {
                b();
            }
            zAdd = this.f135825b.add(process);
        }
        return zAdd;
    }

    public boolean c() {
        return this.f135829f;
    }

    public boolean d(Process process) {
        boolean zRemove;
        synchronized (this.f135825b) {
            zRemove = this.f135825b.remove(process);
            if (zRemove && this.f135825b.isEmpty()) {
                e();
            }
        }
        return zRemove;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f135825b) {
            this.f135830g = true;
            this.f135825b.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.t4
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((Process) obj).destroy();
                }
            });
        }
    }
}
