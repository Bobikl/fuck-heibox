package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jh.e;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Throwable> f119533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f119534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f119535d;

    public static final class CompositeExceptionCausalChain extends RuntimeException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final String f119536b = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        CompositeExceptionCausalChain() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return f119536b;
        }
    }

    public static abstract class a {
        a() {
        }

        abstract void a(Object obj);
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintStream f119537a;

        b(PrintStream printStream) {
            this.f119537a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.a
        void a(Object obj) {
            this.f119537a.println(obj);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintWriter f119538a;

        c(PrintWriter printWriter) {
            this.f119538a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.a
        void a(Object obj) {
            this.f119538a.println(obj);
        }
    }

    public CompositeException(@e Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th2 : iterable) {
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).b());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f119533b = listUnmodifiableList;
        this.f119534c = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    public CompositeException(@e Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private void a(StringBuilder sb2, Throwable th2, String str) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th2.getCause(), "");
        }
    }

    private List<Throwable> c(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th2.getCause();
        if (cause != null && cause != th2) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    private void e(a aVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th2 : this.f119533b) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th2, "\t");
            i10++;
        }
        aVar.a(sb2.toString());
    }

    @e
    public List<Throwable> b() {
        return this.f119533b;
    }

    Throwable d(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause == null || th2 == cause) {
            return th2;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    public int f() {
        return this.f119533b.size();
    }

    @Override // java.lang.Throwable
    @e
    public synchronized Throwable getCause() {
        if (this.f119535d == null) {
            CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f119533b.iterator();
            Throwable thD = compositeExceptionCausalChain;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th2 : c(next)) {
                        if (hashSet.contains(th2)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th2);
                        }
                    }
                    try {
                        thD.initCause(next);
                    } catch (Throwable unused) {
                    }
                    thD = d(thD);
                }
            }
            this.f119535d = compositeExceptionCausalChain;
        }
        return this.f119535d;
    }

    @Override // java.lang.Throwable
    @e
    public String getMessage() {
        return this.f119534c;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        e(new b(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        e(new c(printWriter));
    }
}
