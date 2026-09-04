package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: ReLinkerInstance.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f43007g = "lib";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Set<String> f43008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final d.b f43009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final d.a f43010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f43011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f43012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected d.InterfaceC0363d f43013f;

    /* JADX INFO: compiled from: ReLinkerInstance.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f43014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f43015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f43016d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d.c f43017e;

        a(Context context, String str, String str2, d.c cVar) {
            this.f43014b = context;
            this.f43015c = str;
            this.f43016d = str2;
            this.f43017e = cVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                e.this.j(this.f43014b, this.f43015c, this.f43016d);
                this.f43017e.success();
            } catch (MissingLibraryException e10) {
                this.f43017e.a(e10);
            } catch (UnsatisfiedLinkError e11) {
                this.f43017e.a(e11);
            }
        }
    }

    /* JADX INFO: compiled from: ReLinkerInstance.java */
    public class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43019a;

        b(String str) {
            this.f43019a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f43019a);
        }
    }

    protected e() {
        this(new f(), new com.getkeepsafe.relinker.a());
    }

    protected e(d.b bVar, d.a aVar) {
        this.f43008a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f43009b = bVar;
        this.f43010c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Context context, String str, String str2) throws Throwable {
        if (this.f43008a.contains(str) && !this.f43011d) {
            m("%s already loaded previously!", str);
            return;
        }
        try {
            this.f43009b.loadLibrary(str);
            this.f43008a.add(str);
            m("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e10) {
            m("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            m("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileE = e(context, str, str2);
            if (!fileE.exists() || this.f43011d) {
                if (this.f43011d) {
                    m("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.f43010c.a(context, this.f43009b.b(), this.f43009b.d(str), fileE, this);
            }
            try {
                if (this.f43012e) {
                    com.getkeepsafe.relinker.elf.f fVar = null;
                    try {
                        com.getkeepsafe.relinker.elf.f fVar2 = new com.getkeepsafe.relinker.elf.f(fileE);
                        try {
                            List<String> listC = fVar2.c();
                            fVar2.close();
                            Iterator<String> it = listC.iterator();
                            while (it.hasNext()) {
                                f(context, this.f43009b.a(it.next()));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fVar = fVar2;
                            if (fVar != null) {
                                fVar.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (IOException unused) {
            }
            this.f43009b.c(fileE.getAbsolutePath());
            this.f43008a.add(str);
            m("%s (%s) was re-linked!", str, str2);
        }
    }

    protected void b(Context context, String str, String str2) {
        File fileD = d(context);
        File fileE = e(context, str, str2);
        File[] fileArrListFiles = fileD.listFiles(new b(this.f43009b.d(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f43011d || !file.getAbsolutePath().equals(fileE.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public e c() {
        this.f43011d = true;
        return this;
    }

    protected File d(Context context) {
        return context.getDir(f43007g, 0);
    }

    protected File e(Context context, String str, String str2) {
        String strD = this.f43009b.d(str);
        if (g.a(str2)) {
            return new File(d(context), strD);
        }
        return new File(d(context), strD + "." + str2);
    }

    public void f(Context context, String str) {
        i(context, str, null, null);
    }

    public void g(Context context, String str, d.c cVar) {
        i(context, str, null, cVar);
    }

    public void h(Context context, String str, String str2) {
        i(context, str, str2, null);
    }

    public void i(Context context, String str, String str2, d.c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (g.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        m("Beginning load of %s...", str);
        if (cVar == null) {
            j(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, cVar)).start();
        }
    }

    public e k(d.InterfaceC0363d interfaceC0363d) {
        this.f43013f = interfaceC0363d;
        return this;
    }

    public void l(String str) {
        d.InterfaceC0363d interfaceC0363d = this.f43013f;
        if (interfaceC0363d != null) {
            interfaceC0363d.log(str);
        }
    }

    public void m(String str, Object... objArr) {
        l(String.format(Locale.US, str, objArr));
    }

    public e n() {
        this.f43012e = true;
        return this;
    }
}
