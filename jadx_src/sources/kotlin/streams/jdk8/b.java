package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.jvm.internal.f0;
import kotlin.sequences.m;
import kotlin.u0;
import xh.h;

/* JADX INFO: compiled from: Streams.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "StreamsKt")
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Stream f128512a;

        public a(Stream stream) {
            this.f128512a = stream;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<T> iterator() {
            Iterator<T> it = this.f128512a.iterator();
            f0.o(it, "iterator()");
            return it;
        }
    }

    /* JADX INFO: renamed from: kotlin.streams.jdk8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class C1186b implements m<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntStream f128513a;

        public C1186b(IntStream intStream) {
            this.f128513a = intStream;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f128513a.iterator();
            f0.o(it, "iterator()");
            return it;
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class c implements m<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LongStream f128514a;

        public c(LongStream longStream) {
            this.f128514a = longStream;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f128514a.iterator();
            f0.o(it, "iterator()");
            return it;
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class d implements m<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DoubleStream f128515a;

        public d(DoubleStream doubleStream) {
            this.f128515a = doubleStream;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f128515a.iterator();
            f0.o(it, "iterator()");
            return it;
        }
    }

    @u0(version = "1.2")
    @dl.d
    public static final m<Double> b(@dl.d DoubleStream doubleStream) {
        f0.p(doubleStream, "<this>");
        return new d(doubleStream);
    }

    @u0(version = "1.2")
    @dl.d
    public static final m<Integer> c(@dl.d IntStream intStream) {
        f0.p(intStream, "<this>");
        return new C1186b(intStream);
    }

    @u0(version = "1.2")
    @dl.d
    public static final m<Long> d(@dl.d LongStream longStream) {
        f0.p(longStream, "<this>");
        return new c(longStream);
    }

    @u0(version = "1.2")
    @dl.d
    public static final <T> m<T> e(@dl.d Stream<T> stream) {
        f0.p(stream, "<this>");
        return new a(stream);
    }

    @u0(version = "1.2")
    @dl.d
    public static final <T> Stream<T> f(@dl.d final m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: kotlin.streams.jdk8.a
            @Override // java.util.function.Supplier
            public final Object get() {
                return b.g(mVar);
            }
        }, 16, false);
        f0.o(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator g(m this_asStream) {
        f0.p(this_asStream, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(this_asStream.iterator(), 16);
    }

    @u0(version = "1.2")
    @dl.d
    public static final List<Double> h(@dl.d DoubleStream doubleStream) {
        f0.p(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        f0.o(array, "toArray()");
        return kotlin.collections.m.p(array);
    }

    @u0(version = "1.2")
    @dl.d
    public static final List<Integer> i(@dl.d IntStream intStream) {
        f0.p(intStream, "<this>");
        int[] array = intStream.toArray();
        f0.o(array, "toArray()");
        return kotlin.collections.m.r(array);
    }

    @u0(version = "1.2")
    @dl.d
    public static final List<Long> j(@dl.d LongStream longStream) {
        f0.p(longStream, "<this>");
        long[] array = longStream.toArray();
        f0.o(array, "toArray()");
        return kotlin.collections.m.s(array);
    }

    @u0(version = "1.2")
    @dl.d
    public static final <T> List<T> k(@dl.d Stream<T> stream) {
        f0.p(stream, "<this>");
        Object objCollect = stream.collect(Collectors.toList());
        f0.o(objCollect, "collect(Collectors.toList<T>())");
        return (List) objCollect;
    }
}
