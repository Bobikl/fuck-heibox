package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class l111l1111lIl {
    private static final int l111l11111Il = 4;
    private static final String l11l1111I11l = "volley";
    private final AtomicInteger l1111l111111Il;
    private final PriorityBlockingQueue<l111l1111lI1l<?>> l111l11111I1l;
    private final Set<l111l1111lI1l<?>> l111l11111lIl;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il l111l1111l1Il;
    private final l111l1111l1Il[] l111l1111lI1l;
    private final List<l111l11111Il> l111l1111lIl;
    private final l11l1111I11l l111l1111llIl;
    private final List<l111l11111lIl> l11l1111lIIl;

    @Retention(RetentionPolicy.SOURCE)
    public @interface l1111l111111Il {
        public static final int l1111l111111Il = 0;
        public static final int l111l11111I1l = 2;
        public static final int l111l11111Il = 3;
        public static final int l111l11111lIl = 1;
        public static final int l111l1111l1Il = 4;
        public static final int l111l1111llIl = 5;
    }

    public interface l111l11111I1l {
        boolean l1111l111111Il(l111l1111lI1l<?> l111l1111li1l);
    }

    @Deprecated
    public interface l111l11111Il<T> {
        void l1111l111111Il();
    }

    public interface l111l11111lIl {
        void l1111l111111Il();
    }

    public l111l1111lIl() {
    }

    public l111l1111lIl(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il l111l11111il) {
        this(l111l11111il, 4);
    }

    private l111l1111lIl(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il l111l11111il, int i10) {
        this(l111l11111il, 4, new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111lIl());
    }

    private l111l1111lIl(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il l111l11111il, int i10, l11l1111I11l l11l1111i11l) {
        this.l1111l111111Il = new AtomicInteger();
        this.l111l11111lIl = new HashSet();
        this.l111l11111I1l = new PriorityBlockingQueue<>();
        this.l111l1111lIl = new ArrayList();
        this.l11l1111lIIl = new ArrayList();
        this.l111l1111l1Il = l111l11111il;
        this.l111l1111lI1l = new l111l1111l1Il[i10];
        this.l111l1111llIl = l11l1111i11l;
    }

    private static l111l1111lIl l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il l111l11111il) {
        return new l111l1111lIl(l111l11111il);
    }

    private void l1111l111111Il(l111l11111I1l l111l11111i1l) {
        synchronized (this.l111l11111lIl) {
            for (l111l1111lI1l<?> l111l1111li1l : this.l111l11111lIl) {
                if (l111l11111i1l.l1111l111111Il(l111l1111li1l)) {
                    l111l1111li1l.l11l1111lIIl();
                }
            }
        }
    }

    @Deprecated
    private <T> void l1111l111111Il(l111l11111Il<T> l111l11111il) {
        synchronized (this.l111l1111lIl) {
            this.l111l1111lIl.add(l111l11111il);
        }
    }

    private void l1111l111111Il(l111l11111lIl l111l11111lil) {
        synchronized (this.l11l1111lIIl) {
            this.l11l1111lIIl.add(l111l11111lil);
        }
    }

    private void l1111l111111Il(final Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        l1111l111111Il(new l111l11111I1l() { // from class: com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lIl.1
            @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lIl.l111l11111I1l
            public final boolean l1111l111111Il(l111l1111lI1l<?> l111l1111li1l) {
                return l111l1111li1l.l111l11111Il() == obj;
            }
        });
    }

    public static l111l1111lIl l111l11111I1l() {
        return new l111l1111lIl(new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl(new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l1111l1Il()));
    }

    private <T> void l111l11111I1l(l111l1111lI1l<T> l111l1111li1l) {
        l111l11111Il(l111l1111li1l);
    }

    private <T> void l111l11111Il(l111l1111lI1l<T> l111l1111li1l) {
        this.l111l11111I1l.add(l111l1111li1l);
    }

    private static boolean l111l11111Il() {
        return true;
    }

    @Deprecated
    private <T> void l111l11111lIl(l111l11111Il<T> l111l11111il) {
        synchronized (this.l111l1111lIl) {
            this.l111l1111lIl.remove(l111l11111il);
        }
    }

    private void l111l11111lIl(l111l11111lIl l111l11111lil) {
        synchronized (this.l11l1111lIIl) {
            this.l11l1111lIIl.remove(l111l11111lil);
        }
    }

    private int l111l1111l1Il() {
        return this.l1111l111111Il.incrementAndGet();
    }

    private l11l1111I11l l111l1111llIl() {
        return this.l111l1111llIl;
    }

    public final <T> l111l1111lI1l<T> l1111l111111Il(l111l1111lI1l<T> l111l1111li1l) {
        l111l1111li1l.l1111l111111Il(this);
        synchronized (this.l111l11111lIl) {
            this.l111l11111lIl.add(l111l1111li1l);
        }
        l111l1111li1l.l111l11111lIl(this.l1111l111111Il.incrementAndGet());
        l111l1111li1l.l1111l111111Il("add-to-queue");
        l1111l111111Il(l111l1111li1l, 0);
        this.l111l11111I1l.add(l111l1111li1l);
        return l111l1111li1l;
    }

    public final synchronized void l1111l111111Il() {
        l111l11111lIl();
        int i10 = 0;
        while (i10 < this.l111l1111lI1l.length) {
            l111l1111l1Il l111l1111l1il = new l111l1111l1Il(this.l111l11111I1l, this.l111l1111l1Il, this.l111l1111llIl);
            StringBuilder sb2 = new StringBuilder("sm-http-thread");
            int i11 = i10 + 1;
            sb2.append(i11);
            l111l1111l1il.setName(sb2.toString());
            this.l111l1111lI1l[i10] = l111l1111l1il;
            l111l1111l1il.start();
            i10 = i11;
        }
    }

    final void l1111l111111Il(l111l1111lI1l<?> l111l1111li1l, int i10) {
        synchronized (this.l11l1111lIIl) {
            Iterator<l111l11111lIl> it = this.l11l1111lIIl.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void l111l11111lIl() {
        for (l111l1111l1Il l111l1111l1il : this.l111l1111lI1l) {
            if (l111l1111l1il != null) {
                l111l1111l1il.l1111l111111Il();
            }
        }
    }

    final <T> void l111l11111lIl(l111l1111lI1l<T> l111l1111li1l) {
        synchronized (this.l111l11111lIl) {
            this.l111l11111lIl.remove(l111l1111li1l);
        }
        synchronized (this.l111l1111lIl) {
            Iterator<l111l11111Il> it = this.l111l1111lIl.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        l1111l111111Il(l111l1111li1l, 5);
    }
}
