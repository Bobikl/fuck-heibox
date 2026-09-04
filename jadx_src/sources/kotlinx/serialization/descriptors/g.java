package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    public static final class a implements Iterator<f>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f130583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f130584c;

        a(f fVar) {
            this.f130584c = fVar;
            this.f130583b = fVar.f();
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f130584c;
            int iF = fVar.f();
            int i10 = this.f130583b;
            this.f130583b = i10 - 1;
            return fVar.e(iF - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f130583b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    public static final class b implements Iterator<String>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f130585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f130586c;

        b(f fVar) {
            this.f130586c = fVar;
            this.f130585b = fVar.f();
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f130586c;
            int iF = fVar.f();
            int i10 = this.f130585b;
            this.f130585b = i10 - 1;
            return fVar.h(iF - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f130585b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    @t0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,70:1\n293#2:71\n*E\n"})
    public static final class c implements Iterable<f>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f130587b;

        public c(f fVar) {
            this.f130587b = fVar;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<f> iterator() {
            return new a(this.f130587b);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    @t0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,70:1\n309#2:71\n*E\n"})
    public static final class d implements Iterable<String>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f130588b;

        public d(f fVar) {
            this.f130588b = fVar;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<String> iterator() {
            return new b(this.f130588b);
        }
    }

    @dl.d
    public static final Iterable<f> a(@dl.d f fVar) {
        f0.p(fVar, "<this>");
        return new c(fVar);
    }

    @kotlinx.serialization.d
    public static /* synthetic */ void b(f fVar) {
    }

    @dl.d
    public static final Iterable<String> c(@dl.d f fVar) {
        f0.p(fVar, "<this>");
        return new d(fVar);
    }

    @kotlinx.serialization.d
    public static /* synthetic */ void d(f fVar) {
    }
}
