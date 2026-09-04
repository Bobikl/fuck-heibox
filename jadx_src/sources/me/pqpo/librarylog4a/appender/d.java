package me.pqpo.librarylog4a.appender;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.pqpo.librarylog4a.LogBuffer;

/* JADX INFO: compiled from: FileAppender.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends me.pqpo.librarylog4a.appender.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LogBuffer f131889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ij.b f131890f;

    /* JADX INFO: compiled from: FileAppender.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f131891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f131892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f131893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f131894d = 4096;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f131895e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<jj.a> f131896f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.b f131897g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f131898h;

        /* JADX INFO: renamed from: me.pqpo.librarylog4a.appender.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileAppender.java */
        public class C1203a implements ij.b {
            C1203a() {
            }

            @Override // ij.b
            public String a(int i10, String str, String str2) {
                return String.format("%s/%s: %s\n", hj.b.b(i10), str, str2);
            }
        }

        public a(Context context) {
            this.f131891a = context;
        }

        private String j(Context context) {
            File file = (!Environment.getExternalStorageState().equals("mounted") || context.getExternalFilesDir("log4a") == null) ? new File(context.getFilesDir(), "log4a") : context.getExternalFilesDir("log4a");
            if (file != null && !file.exists()) {
                file.mkdirs();
            }
            return new File(file, ".log4aCache").getAbsolutePath();
        }

        public a h(jj.a aVar) {
            if (this.f131896f == null) {
                this.f131896f = new ArrayList();
            }
            this.f131896f.add(aVar);
            return this;
        }

        public d i() {
            if (this.f131893c == null) {
                throw new IllegalArgumentException("logFilePath cannot be null");
            }
            if (this.f131892b == null) {
                this.f131892b = j(this.f131891a);
            }
            if (this.f131897g == null) {
                this.f131897g = new C1203a();
            }
            return new d(this);
        }

        public a k(String str) {
            this.f131892b = str;
            return this;
        }

        public a l(int i10) {
            this.f131894d = i10;
            return this;
        }

        public a m(boolean z10) {
            this.f131898h = z10;
            return this;
        }

        public a n(ij.b bVar) {
            this.f131897g = bVar;
            return this;
        }

        public a o(int i10) {
            this.f131895e = i10;
            return this;
        }

        public a p(String str) {
            this.f131893c = str;
            return this;
        }
    }

    protected d(a aVar) {
        this.f131889e = new LogBuffer(aVar.f131892b, aVar.f131894d, aVar.f131893c, aVar.f131898h);
        g(aVar.f131894d);
        f(aVar.f131895e);
        b(aVar.f131896f);
        l(aVar.f131897g);
    }

    @Override // me.pqpo.librarylog4a.appender.a
    protected void e(int i10, String str, String str2) {
        this.f131889e.h(this.f131890f.a(i10, str, str2));
    }

    @Override // me.pqpo.librarylog4a.appender.a, me.pqpo.librarylog4a.appender.c
    public void flush() {
        super.flush();
        this.f131889e.b();
    }

    public void h(String str) {
        this.f131889e.a(str);
    }

    public String i() {
        return this.f131889e.c();
    }

    public int j() {
        return this.f131889e.d();
    }

    public String k() {
        return this.f131889e.e();
    }

    public void l(ij.b bVar) {
        if (bVar != null) {
            this.f131890f = bVar;
        }
    }

    @Override // me.pqpo.librarylog4a.appender.a, me.pqpo.librarylog4a.appender.c
    public void release() {
        super.release();
        this.f131889e.g();
    }
}
