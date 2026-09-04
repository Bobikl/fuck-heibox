package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements kotlin.sequences.m<fi.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final CharSequence f128575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f128576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f128577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.p<CharSequence, Integer, Pair<Integer, Integer>> f128578d;

    /* JADX INFO: compiled from: Strings.kt */
    public static final class a implements Iterator<fi.l>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f128579b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f128581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private fi.l f128582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f128583f;

        a() {
            int I = fi.u.I(f.this.f128576b, 0, f.this.f128575a.length());
            this.f128580c = I;
            this.f128581d = I;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:17:0x0098  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        private final void a() {
            Pair pair;
            if (this.f128581d < 0) {
                this.f128579b = 0;
                this.f128582e = null;
                return;
            }
            if (f.this.f128577c > 0) {
                int i10 = this.f128583f + 1;
                this.f128583f = i10;
                if (i10 >= f.this.f128577c) {
                    this.f128582e = new fi.l(this.f128580c, StringsKt__StringsKt.j3(f.this.f128575a));
                    this.f128581d = -1;
                } else if (this.f128581d > f.this.f128575a.length() && (pair = (Pair) f.this.f128578d.invoke(f.this.f128575a, Integer.valueOf(this.f128581d))) != null) {
                    int iIntValue = ((Number) pair.a()).intValue();
                    int iIntValue2 = ((Number) pair.b()).intValue();
                    this.f128582e = fi.u.W1(this.f128580c, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.f128580c = i11;
                    this.f128581d = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f128582e = new fi.l(this.f128580c, StringsKt__StringsKt.j3(f.this.f128575a));
                    this.f128581d = -1;
                }
            } else if (this.f128581d > f.this.f128575a.length()) {
                this.f128582e = new fi.l(this.f128580c, StringsKt__StringsKt.j3(f.this.f128575a));
                this.f128581d = -1;
            } else {
                int iIntValue3 = ((Number) pair.a()).intValue();
                int iIntValue4 = ((Number) pair.b()).intValue();
                this.f128582e = fi.u.W1(this.f128580c, iIntValue3);
                int i12 = iIntValue3 + iIntValue4;
                this.f128580c = i12;
                this.f128581d = i12 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f128579b = 1;
        }

        public final int b() {
            return this.f128583f;
        }

        public final int c() {
            return this.f128580c;
        }

        @dl.e
        public final fi.l d() {
            return this.f128582e;
        }

        public final int e() {
            return this.f128581d;
        }

        public final int g() {
            return this.f128579b;
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public fi.l next() {
            if (this.f128579b == -1) {
                a();
            }
            if (this.f128579b == 0) {
                throw new NoSuchElementException();
            }
            fi.l lVar = this.f128582e;
            f0.n(lVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f128582e = null;
            this.f128579b = -1;
            return lVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f128579b == -1) {
                a();
            }
            return this.f128579b == 1;
        }

        public final void i(int i10) {
            this.f128583f = i10;
        }

        public final void j(int i10) {
            this.f128580c = i10;
        }

        public final void n(@dl.e fi.l lVar) {
            this.f128582e = lVar;
        }

        public final void o(int i10) {
            this.f128581d = i10;
        }

        public final void p(int i10) {
            this.f128579b = i10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@dl.d CharSequence input, int i10, int i11, @dl.d yh.p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        f0.p(input, "input");
        f0.p(getNextMatch, "getNextMatch");
        this.f128575a = input;
        this.f128576b = i10;
        this.f128577c = i11;
        this.f128578d = getNextMatch;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<fi.l> iterator() {
        return new a();
    }
}
