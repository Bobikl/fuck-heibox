package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.offline.z;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SegmentDownloader.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d0<M extends z<M>> implements x {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f47198k = 131072;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f47199l = 20000000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.r f47200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0.a<M> f47201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<StreamKey> f47202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.cache.a.d f47203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Cache f47204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.cache.g f47205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final PriorityTaskManager f47206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f47207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayList<h0<?, ?>> f47208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f47209j;

    /* JADX INFO: compiled from: SegmentDownloader.java */
    public class a extends h0<M, IOException> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ com.google.android.exoplayer2.upstream.o f47210i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.google.android.exoplayer2.upstream.r f47211j;

        a(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.r rVar) {
            this.f47210i = oVar;
            this.f47211j = rVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.util.h0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public M d() throws IOException {
            return (M) i0.h(this.f47210i, d0.this.f47201b, this.f47211j, 4);
        }
    }

    /* JADX INFO: compiled from: SegmentDownloader.java */
    public static final class b implements com.google.android.exoplayer2.upstream.cache.i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x.a f47213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f47214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f47215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f47216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f47217e;

        public b(x.a aVar, long j10, int i10, long j11, int i11) {
            this.f47213a = aVar;
            this.f47214b = j10;
            this.f47215c = i10;
            this.f47216d = j11;
            this.f47217e = i11;
        }

        private float b() {
            long j10 = this.f47214b;
            if (j10 != -1 && j10 != 0) {
                return (this.f47216d * 100.0f) / j10;
            }
            int i10 = this.f47215c;
            if (i10 != 0) {
                return (this.f47217e * 100.0f) / i10;
            }
            return -1.0f;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.i.a
        public void a(long j10, long j11, long j12) {
            long j13 = this.f47216d + j12;
            this.f47216d = j13;
            this.f47213a.a(this.f47214b, j13, b());
        }

        public void c() {
            this.f47217e++;
            this.f47213a.a(this.f47214b, this.f47216d, b());
        }
    }

    /* JADX INFO: compiled from: SegmentDownloader.java */
    public static class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f47218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.r f47219c;

        public c(long j10, com.google.android.exoplayer2.upstream.r rVar) {
            this.f47218b = j10;
            this.f47219c = rVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return u0.q(this.f47218b, cVar.f47218b);
        }
    }

    /* JADX INFO: compiled from: SegmentDownloader.java */
    public static final class d extends h0<Void, IOException> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final c f47220i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.cache.a f47221j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        private final b f47222k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final byte[] f47223l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final com.google.android.exoplayer2.upstream.cache.i f47224m;

        public d(c cVar, com.google.android.exoplayer2.upstream.cache.a aVar, @p0 b bVar, byte[] bArr) {
            this.f47220i = cVar;
            this.f47221j = aVar;
            this.f47222k = bVar;
            this.f47223l = bArr;
            this.f47224m = new com.google.android.exoplayer2.upstream.cache.i(aVar, cVar.f47219c, bArr, bVar);
        }

        @Override // com.google.android.exoplayer2.util.h0
        protected void c() {
            this.f47224m.b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.util.h0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void d() throws IOException {
            this.f47224m.a();
            b bVar = this.f47222k;
            if (bVar == null) {
                return null;
            }
            bVar.c();
            return null;
        }
    }

    public d0(i2 i2Var, i0.a<M> aVar, com.google.android.exoplayer2.upstream.cache.a.d dVar, Executor executor) {
        com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
        this.f47200a = f(i2Var.f46269c.f46345a);
        this.f47201b = aVar;
        this.f47202c = new ArrayList<>(i2Var.f46269c.f46349e);
        this.f47203d = dVar;
        this.f47207h = executor;
        this.f47204e = (Cache) com.google.android.exoplayer2.util.a.g(dVar.g());
        this.f47205f = dVar.h();
        this.f47206g = dVar.i();
        this.f47208i = new ArrayList<>();
    }

    private <T> void c(h0<T, ?> h0Var) throws InterruptedException {
        synchronized (this.f47208i) {
            if (this.f47209j) {
                throw new InterruptedException();
            }
            this.f47208i.add(h0Var);
        }
    }

    private static boolean d(com.google.android.exoplayer2.upstream.r rVar, com.google.android.exoplayer2.upstream.r rVar2) {
        if (rVar.f51194a.equals(rVar2.f51194a)) {
            long j10 = rVar.f51201h;
            if (j10 != -1 && rVar.f51200g + j10 == rVar2.f51200g && u0.c(rVar.f51202i, rVar2.f51202i) && rVar.f51203j == rVar2.f51203j && rVar.f51196c == rVar2.f51196c && rVar.f51198e.equals(rVar2.f51198e)) {
                return true;
            }
        }
        return false;
    }

    protected static com.google.android.exoplayer2.upstream.r f(Uri uri) {
        return new com.google.android.exoplayer2.upstream.r.b().j(uri).c(1).a();
    }

    private static void i(List<c> list, com.google.android.exoplayer2.upstream.cache.g gVar) {
        HashMap map = new HashMap();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            String strA = gVar.a(cVar.f47219c);
            Integer num = (Integer) map.get(strA);
            c cVar2 = num == null ? null : list.get(num.intValue());
            if (cVar2 == null || cVar.f47218b > cVar2.f47218b + f47199l || !d(cVar2.f47219c, cVar.f47219c)) {
                map.put(strA, Integer.valueOf(i10));
                list.set(i10, cVar);
                i10++;
            } else {
                long j10 = cVar.f47219c.f51201h;
                list.set(((Integer) com.google.android.exoplayer2.util.a.g(num)).intValue(), new c(cVar2.f47218b, cVar2.f47219c.f(0L, j10 != -1 ? cVar2.f47219c.f51201h + j10 : -1L)));
            }
        }
        u0.h1(list, i10, list.size());
    }

    private void j(int i10) {
        synchronized (this.f47208i) {
            this.f47208i.remove(i10);
        }
    }

    private void k(h0<?, ?> h0Var) {
        synchronized (this.f47208i) {
            this.f47208i.remove(h0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01a6 A[LOOP:1: B:84:0x019e->B:86:0x01a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x01bf A[LOOP:2: B:88:0x01bd->B:89:0x01bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d4  */
    @Override // com.google.android.exoplayer2.offline.x
    public final void a(@p0 x.a aVar) throws Throwable {
        d0<M> d0Var;
        int i10;
        int size;
        PriorityTaskManager priorityTaskManager;
        com.google.android.exoplayer2.upstream.cache.a aVarD;
        byte[] bArr;
        d0<M> d0Var2 = this;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager2 = d0Var2.f47206g;
        if (priorityTaskManager2 != null) {
            priorityTaskManager2.a(-1000);
        }
        try {
            com.google.android.exoplayer2.upstream.cache.a aVarD2 = d0Var2.f47203d.d();
            z zVarG = d0Var2.g(aVarD2, d0Var2.f47200a, false);
            if (!d0Var2.f47202c.isEmpty()) {
                zVarG = (z) zVarG.a(d0Var2.f47202c);
            }
            List<c> listH = d0Var2.h(aVarD2, zVarG, false);
            Collections.sort(listH);
            i(listH, d0Var2.f47205f);
            int size2 = listH.size();
            int size3 = listH.size() - 1;
            int i11 = 0;
            long j10 = 0;
            long j11 = 0;
            while (size3 >= 0) {
                try {
                    com.google.android.exoplayer2.upstream.r rVar = listH.get(size3).f47219c;
                    String strA = d0Var2.f47205f.a(rVar);
                    long j12 = rVar.f51201h;
                    if (j12 == -1) {
                        long jA = com.google.android.exoplayer2.upstream.cache.l.a(d0Var2.f47204e.n(strA));
                        if (jA != -1) {
                            j12 = jA - rVar.f51200g;
                        }
                    }
                    ArrayDeque arrayDeque3 = arrayDeque;
                    long jW = d0Var2.f47204e.w(strA, rVar.f51200g, j12);
                    j11 += jW;
                    if (j12 != -1) {
                        if (j12 == jW) {
                            i11++;
                            listH.remove(size3);
                        }
                        if (j10 != -1) {
                            j10 += j12;
                        }
                    } else {
                        j10 = -1;
                    }
                    size3--;
                    d0Var2 = this;
                    arrayDeque = arrayDeque3;
                } catch (Throwable th2) {
                    th = th2;
                    d0Var = this;
                    for (i10 = 0; i10 < d0Var.f47208i.size(); i10++) {
                        d0Var.f47208i.get(i10).cancel(true);
                    }
                    for (size = d0Var.f47208i.size() - 1; size >= 0; size--) {
                        d0Var.f47208i.get(size).a();
                        d0Var.j(size);
                    }
                    priorityTaskManager = d0Var.f47206g;
                    if (priorityTaskManager != null) {
                        priorityTaskManager.e(-1000);
                    }
                    throw th;
                }
            }
            ArrayDeque arrayDeque4 = arrayDeque;
            b bVar = aVar != null ? new b(aVar, j10, size2, j11, i11) : null;
            arrayDeque4.addAll(listH);
            d0Var = this;
            while (!d0Var.f47209j && !arrayDeque4.isEmpty()) {
                try {
                    PriorityTaskManager priorityTaskManager3 = d0Var.f47206g;
                    if (priorityTaskManager3 != null) {
                        priorityTaskManager3.b(-1000);
                    }
                    if (arrayDeque2.isEmpty()) {
                        aVarD = d0Var.f47203d.d();
                        bArr = new byte[131072];
                    } else {
                        d dVar = (d) arrayDeque2.removeFirst();
                        aVarD = dVar.f47221j;
                        bArr = dVar.f47223l;
                    }
                    d dVar2 = new d((c) arrayDeque4.removeFirst(), aVarD, bVar, bArr);
                    d0Var.c(dVar2);
                    d0Var.f47207h.execute(dVar2);
                    for (int size4 = d0Var.f47208i.size() - 1; size4 >= 0; size4--) {
                        d dVar3 = (d) d0Var.f47208i.get(size4);
                        if (arrayDeque4.isEmpty() || dVar3.isDone()) {
                            try {
                                dVar3.get();
                                d0Var.j(size4);
                                arrayDeque2.addLast(dVar3);
                            } catch (ExecutionException e10) {
                                Throwable th3 = (Throwable) com.google.android.exoplayer2.util.a.g(e10.getCause());
                                if (th3 instanceof PriorityTaskManager.PriorityTooLowException) {
                                    arrayDeque4.addFirst(dVar3.f47220i);
                                    d0Var.j(size4);
                                    arrayDeque2.addLast(dVar3);
                                } else {
                                    if (th3 instanceof IOException) {
                                        throw ((IOException) th3);
                                    }
                                    u0.n1(th3);
                                }
                            }
                        }
                    }
                    dVar2.b();
                } catch (Throwable th4) {
                    th = th4;
                    while (i10 < d0Var.f47208i.size()) {
                        d0Var.f47208i.get(i10).cancel(true);
                    }
                    while (size >= 0) {
                        d0Var.f47208i.get(size).a();
                        d0Var.j(size);
                    }
                    priorityTaskManager = d0Var.f47206g;
                    if (priorityTaskManager != null) {
                        priorityTaskManager.e(-1000);
                    }
                    throw th;
                }
            }
            for (int i12 = 0; i12 < d0Var.f47208i.size(); i12++) {
                d0Var.f47208i.get(i12).cancel(true);
            }
            for (int size5 = d0Var.f47208i.size() - 1; size5 >= 0; size5--) {
                d0Var.f47208i.get(size5).a();
                d0Var.j(size5);
            }
            PriorityTaskManager priorityTaskManager4 = d0Var.f47206g;
            if (priorityTaskManager4 != null) {
                priorityTaskManager4.e(-1000);
            }
        } catch (Throwable th5) {
            th = th5;
            d0Var = d0Var2;
        }
    }

    @Override // com.google.android.exoplayer2.offline.x
    public void cancel() {
        synchronized (this.f47208i) {
            this.f47209j = true;
            for (int i10 = 0; i10 < this.f47208i.size(); i10++) {
                this.f47208i.get(i10).cancel(true);
            }
        }
    }

    protected final <T> T e(h0<T, ?> h0Var, boolean z10) throws Throwable {
        if (z10) {
            h0Var.run();
            try {
                return h0Var.get();
            } catch (ExecutionException e10) {
                Throwable th2 = (Throwable) com.google.android.exoplayer2.util.a.g(e10.getCause());
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                u0.n1(e10);
            }
        }
        while (!this.f47209j) {
            PriorityTaskManager priorityTaskManager = this.f47206g;
            if (priorityTaskManager != null) {
                priorityTaskManager.b(-1000);
            }
            c(h0Var);
            this.f47207h.execute(h0Var);
            try {
                T t10 = h0Var.get();
                h0Var.a();
                k(h0Var);
                return t10;
            } catch (ExecutionException e11) {
                try {
                    Throwable th3 = (Throwable) com.google.android.exoplayer2.util.a.g(e11.getCause());
                    if (!(th3 instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (th3 instanceof IOException) {
                            throw ((IOException) th3);
                        }
                        u0.n1(e11);
                    }
                    h0Var.a();
                    k(h0Var);
                } catch (Throwable th4) {
                    h0Var.a();
                    k(h0Var);
                    throw th4;
                }
            }
        }
        throw new InterruptedException();
    }

    protected final M g(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.r rVar, boolean z10) throws InterruptedException, IOException {
        return (M) e(new a(oVar, rVar), z10);
    }

    protected abstract List<c> h(com.google.android.exoplayer2.upstream.o oVar, M m10, boolean z10) throws InterruptedException, IOException;

    @Override // com.google.android.exoplayer2.offline.x
    public final void remove() {
        com.google.android.exoplayer2.upstream.cache.a aVarE = this.f47203d.e();
        try {
            List<c> listH = h(aVarE, g(aVarE, this.f47200a, true), true);
            for (int i10 = 0; i10 < listH.size(); i10++) {
                this.f47204e.r(this.f47205f.a(listH.get(i10).f47219c));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
        } finally {
            this.f47204e.r(this.f47205f.a(this.f47200a));
        }
    }
}
