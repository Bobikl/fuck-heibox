package kotlin.collections;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements kotlin.sequences.m<List<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.sequences.m f124542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f124543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f124544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f124545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f124546e;

        public a(kotlin.sequences.m mVar, int i10, int i11, boolean z10, boolean z11) {
            this.f124542a = mVar;
            this.f124543b = i10;
            this.f124544c = i11;
            this.f124545d = z10;
            this.f124546e = z11;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<List<? extends T>> iterator() {
            return SlidingWindowKt.b(this.f124542a.iterator(), this.f124543b, this.f124544c, this.f124545d, this.f124546e);
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
        } else {
            str = "size " + i10 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @dl.d
    public static final <T> Iterator<List<T>> b(@dl.d Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.f0.p(iterator, "iterator");
        return !iterator.hasNext() ? b0.f124573b : kotlin.sequences.q.a(new SlidingWindowKt$windowedIterator$1(i10, i11, iterator, z11, z10, null));
    }

    @dl.d
    public static final <T> kotlin.sequences.m<List<T>> c(@dl.d kotlin.sequences.m<? extends T> mVar, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.f0.p(mVar, "<this>");
        a(i10, i11);
        return new a(mVar, i10, i11, z10, z11);
    }
}
