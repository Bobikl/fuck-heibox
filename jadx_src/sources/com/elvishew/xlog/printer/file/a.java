package com.elvishew.xlog.printer.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: FilePrinter.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements com.elvishew.xlog.printer.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f42918h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.elvishew.xlog.printer.file.naming.c f42920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b8.b f42921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c8.a f42922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.elvishew.xlog.flattener.c f42923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f42924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile d f42925g;

    /* JADX INFO: compiled from: FilePrinter.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f42926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.elvishew.xlog.printer.file.naming.c f42927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        b8.b f42928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c8.a f42929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.elvishew.xlog.flattener.c f42930e;

        /* JADX INFO: renamed from: com.elvishew.xlog.printer.file.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FilePrinter.java */
        public class C0361a implements com.elvishew.xlog.flattener.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.elvishew.xlog.flattener.d f42931a;

            C0361a(com.elvishew.xlog.flattener.d dVar) {
                this.f42931a = dVar;
            }

            @Override // com.elvishew.xlog.flattener.c
            public CharSequence a(long j10, int i10, String str, String str2) {
                return this.f42931a.b(i10, str, str2);
            }
        }

        public b(String str) {
            this.f42926a = str;
        }

        private void e() {
            if (this.f42927b == null) {
                this.f42927b = com.elvishew.xlog.internal.a.e();
            }
            if (this.f42928c == null) {
                this.f42928c = com.elvishew.xlog.internal.a.b();
            }
            if (this.f42929d == null) {
                this.f42929d = com.elvishew.xlog.internal.a.d();
            }
            if (this.f42930e == null) {
                this.f42930e = com.elvishew.xlog.internal.a.g();
            }
        }

        public b a(b8.c cVar) {
            if (!(cVar instanceof b8.b)) {
                cVar = new z7.a(cVar);
            }
            b8.b bVar = (b8.b) cVar;
            this.f42928c = bVar;
            z7.b.b(bVar);
            return this;
        }

        public a b() {
            e();
            return new a(this);
        }

        public b c(c8.a aVar) {
            this.f42929d = aVar;
            return this;
        }

        public b d(com.elvishew.xlog.printer.file.naming.c cVar) {
            this.f42927b = cVar;
            return this;
        }

        public b f(com.elvishew.xlog.flattener.c cVar) {
            this.f42930e = cVar;
            return this;
        }

        @Deprecated
        public b g(com.elvishew.xlog.flattener.d dVar) {
            return f(new C0361a(dVar));
        }
    }

    /* JADX INFO: compiled from: FilePrinter.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f42933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f42934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f42935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f42936d;

        c(long j10, int i10, String str, String str2) {
            this.f42933a = j10;
            this.f42934b = i10;
            this.f42935c = str;
            this.f42936d = str2;
        }
    }

    /* JADX INFO: compiled from: FilePrinter.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BlockingQueue<c> f42937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f42938c;

        private d() {
            this.f42937b = new LinkedBlockingQueue();
        }

        void a(c cVar) {
            try {
                this.f42937b.put(cVar);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }

        boolean b() {
            boolean z10;
            synchronized (this) {
                z10 = this.f42938c;
            }
            return z10;
        }

        void c() {
            synchronized (this) {
                if (this.f42938c) {
                    return;
                }
                new Thread(this).start();
                this.f42938c = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    c cVarTake = this.f42937b.take();
                    if (cVarTake == null) {
                        return;
                    } else {
                        a.this.f(cVarTake.f42933a, cVarTake.f42934b, cVarTake.f42935c, cVarTake.f42936d);
                    }
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                    synchronized (this) {
                        this.f42938c = false;
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: FilePrinter.java */
    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f42940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f42941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BufferedWriter f42942c;

        private e() {
        }

        void a(String str) {
            try {
                this.f42942c.write(str);
                this.f42942c.newLine();
                this.f42942c.flush();
            } catch (IOException unused) {
            }
        }

        boolean b() {
            BufferedWriter bufferedWriter = this.f42942c;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            this.f42942c = null;
            this.f42940a = null;
            this.f42941b = null;
            return true;
        }

        File c() {
            return this.f42941b;
        }

        String d() {
            return this.f42940a;
        }

        boolean e() {
            return this.f42942c != null && this.f42941b.exists();
        }

        boolean f(String str) {
            this.f42940a = str;
            File file = new File(a.this.f42919a, str);
            this.f42941b = file;
            if (!file.exists()) {
                try {
                    File parentFile = this.f42941b.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    this.f42941b.createNewFile();
                } catch (IOException e10) {
                    e10.printStackTrace();
                    b();
                    return false;
                }
            }
            try {
                this.f42942c = new BufferedWriter(new FileWriter(this.f42941b, true));
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                b();
                return false;
            }
        }
    }

    a(b bVar) {
        this.f42919a = bVar.f42926a;
        this.f42920b = bVar.f42927b;
        this.f42921c = bVar.f42928c;
        this.f42922d = bVar.f42929d;
        this.f42923e = bVar.f42930e;
        this.f42924f = new e();
        this.f42925g = new d();
        d();
    }

    private void d() {
        File file = new File(this.f42919a);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    private void e() {
        File[] fileArrListFiles = new File(this.f42919a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f42922d.a(file)) {
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(long j10, int i10, String str, String str2) {
        String strD = this.f42924f.d();
        boolean z10 = !this.f42924f.e();
        if (strD == null || z10 || this.f42920b.a()) {
            String strB = this.f42920b.b(i10, System.currentTimeMillis());
            if (strB == null || strB.trim().length() == 0) {
                com.elvishew.xlog.internal.b.e().c("File name should not be empty, ignore log: " + str2);
                return;
            }
            if (!strB.equals(strD) || z10) {
                this.f42924f.b();
                e();
                if (!this.f42924f.f(strB)) {
                    return;
                } else {
                    strD = strB;
                }
            }
        }
        File fileC = this.f42924f.c();
        if (this.f42921c.c(fileC)) {
            this.f42924f.b();
            z7.b.a(fileC, this.f42921c);
            if (!this.f42924f.f(strD)) {
                return;
            }
        }
        this.f42924f.a(this.f42923e.a(j10, i10, str, str2).toString());
    }

    @Override // com.elvishew.xlog.printer.c
    public void a(int i10, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.f42925g.b()) {
            this.f42925g.c();
        }
        this.f42925g.a(new c(jCurrentTimeMillis, i10, str, str2));
    }
}
