package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import androidx.annotation.p0;
import com.google.android.exoplayer2.source.n1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TrackSelectionOverrides.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r implements com.google.android.exoplayer2.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50129d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableMap<n1, c> f50131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f50128c = new r(ImmutableMap.v());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.exoplayer2.i.a<r> f50130e = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.trackselection.q
        @Override // com.google.android.exoplayer2.i.a
        public final com.google.android.exoplayer2.i a(Bundle bundle) {
            return r.g(bundle);
        }
    };

    /* JADX INFO: compiled from: TrackSelectionOverrides.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<n1, c> f50132a;

        public b() {
            this.f50132a = new HashMap<>();
        }

        private b(Map<n1, c> map) {
            this.f50132a = new HashMap<>(map);
        }

        public b a(c cVar) {
            this.f50132a.put(cVar.f50136b, cVar);
            return this;
        }

        public r b() {
            return new r(this.f50132a);
        }

        public b c(n1 n1Var) {
            this.f50132a.remove(n1Var);
            return this;
        }

        public b d(int i10) {
            Iterator<c> it = this.f50132a.values().iterator();
            while (it.hasNext()) {
                if (it.next().d() == i10) {
                    it.remove();
                }
            }
            return this;
        }

        public b e(c cVar) {
            d(cVar.d());
            this.f50132a.put(cVar.f50136b, cVar);
            return this;
        }
    }

    /* JADX INFO: compiled from: TrackSelectionOverrides.java */
    public static final class c implements com.google.android.exoplayer2.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f50133d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f50134e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final com.google.android.exoplayer2.i.a<c> f50135f = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.trackselection.s
            @Override // com.google.android.exoplayer2.i.a
            public final com.google.android.exoplayer2.i a(Bundle bundle) {
                return r.c.f(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n1 f50136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImmutableList<Integer> f50137c;

        public c(n1 n1Var) {
            this.f50136b = n1Var;
            ImmutableList.a aVar = new ImmutableList.a();
            for (int i10 = 0; i10 < n1Var.f48599b; i10++) {
                aVar.a(Integer.valueOf(i10));
            }
            this.f50137c = aVar.e();
        }

        public c(n1 n1Var, List<Integer> list) {
            if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= n1Var.f48599b)) {
                throw new IndexOutOfBoundsException();
            }
            this.f50136b = n1Var;
            this.f50137c = ImmutableList.v(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int d() {
            return com.google.android.exoplayer2.util.y.l(this.f50136b.c(0).f43593m);
        }

        private static String e(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ c f(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(e(0));
            com.google.android.exoplayer2.util.a.g(bundle2);
            n1 n1Var = (n1) n1.f48598g.a(bundle2);
            int[] intArray = bundle.getIntArray(e(1));
            return intArray == null ? new c(n1Var) : new c(n1Var, Ints.c(intArray));
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putBundle(e(0), this.f50136b.a());
            bundle.putIntArray(e(1), Ints.B(this.f50137c));
            return bundle;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f50136b.equals(cVar.f50136b) && this.f50137c.equals(cVar.f50137c);
        }

        public int hashCode() {
            return this.f50136b.hashCode() + (this.f50137c.hashCode() * 31);
        }
    }

    private r(Map<n1, c> map) {
        this.f50131b = ImmutableMap.g(map);
    }

    private static String f(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r g(Bundle bundle) {
        List listC = com.google.android.exoplayer2.util.d.c(c.f50135f, bundle.getParcelableArrayList(f(0)), ImmutableList.B());
        ImmutableMap.b bVar = new ImmutableMap.b();
        for (int i10 = 0; i10 < listC.size(); i10++) {
            c cVar = (c) listC.get(i10);
            bVar.i(cVar.f50136b, cVar);
        }
        return new r(bVar.a());
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f(0), com.google.android.exoplayer2.util.d.g(this.f50131b.values()));
        return bundle;
    }

    public ImmutableList<c> c() {
        return ImmutableList.v(this.f50131b.values());
    }

    public b d() {
        return new b(this.f50131b);
    }

    @p0
    public c e(n1 n1Var) {
        return this.f50131b.get(n1Var);
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return this.f50131b.equals(((r) obj).f50131b);
    }

    public int hashCode() {
        return this.f50131b.hashCode();
    }
}
