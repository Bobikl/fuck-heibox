package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final StackTraceElement[] f40938h = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Throwable> f40939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.c f40940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DataSource f40941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Class<?> f40942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f40943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Exception f40944g;

    public static final class a implements Appendable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f40945d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f40946e = "  ";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Appendable f40947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f40948c = true;

        a(Appendable appendable) {
            this.f40947b = appendable;
        }

        @n0
        private CharSequence a(@p0 CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f40948c) {
                this.f40948c = false;
                this.f40947b.append(f40946e);
            }
            this.f40948c = c10 == '\n';
            this.f40947b.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@p0 CharSequence charSequence) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@p0 CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z10 = false;
            if (this.f40948c) {
                this.f40948c = false;
                this.f40947b.append(f40946e);
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f40948c = z10;
            this.f40947b.append(charSequenceA, i10, i11);
            return this;
        }
    }

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public GlideException(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    public GlideException(String str, List<Throwable> list) {
        this.f40943f = str;
        setStackTrace(f40938h);
        this.f40939b = list;
    }

    private void a(Throwable th2, List<Throwable> list) {
        if (!(th2 instanceof GlideException)) {
            list.add(th2);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th2).e().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i10);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).i(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void i(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f40939b;
    }

    @p0
    public Exception f() {
        return this.f40944g;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> g() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f40943f);
        sb2.append(this.f40942e != null ? ", " + this.f40942e : "");
        sb2.append(this.f40941d != null ? ", " + this.f40941d : "");
        sb2.append(this.f40940c != null ? ", " + this.f40940c : "");
        List<Throwable> listG = g();
        if (listG.isEmpty()) {
            return sb2.toString();
        }
        if (listG.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listG.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : listG) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public void h(String str) {
        List<Throwable> listG = g();
        int size = listG.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), listG.get(i10));
            i10 = i11;
        }
    }

    void j(com.bumptech.glide.load.c cVar, DataSource dataSource) {
        k(cVar, dataSource, null);
    }

    void k(com.bumptech.glide.load.c cVar, DataSource dataSource, Class<?> cls) {
        this.f40940c = cVar;
        this.f40941d = dataSource;
        this.f40942e = cls;
    }

    public void l(@p0 Exception exc) {
        this.f40944g = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        i(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        i(printWriter);
    }
}
