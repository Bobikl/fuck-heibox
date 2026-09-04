package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.random.Random;
import kotlin.u0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public class SequencesKt__SequencesKt extends r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.a<Iterator<T>> f128339a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(yh.a<? extends Iterator<? extends T>> aVar) {
            this.f128339a = aVar;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<T> iterator() {
            return this.f128339a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class b<T> implements m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f128340a;

        public b(Iterator it) {
            this.f128340a = it;
        }

        @Override // kotlin.sequences.m
        @dl.d
        public Iterator<T> iterator() {
            return this.f128340a;
        }
    }

    @sh.f
    private static final <T> m<T> d(yh.a<? extends Iterator<? extends T>> iterator) {
        f0.p(iterator, "iterator");
        return new a(iterator);
    }

    @dl.d
    public static final <T> m<T> e(@dl.d Iterator<? extends T> it) {
        f0.p(it, "<this>");
        return f(new b(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> m<T> f(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return mVar instanceof kotlin.sequences.a ? mVar : new kotlin.sequences.a(mVar);
    }

    @dl.d
    public static final <T> m<T> g() {
        return g.f128447a;
    }

    @dl.d
    public static final <T, C, R> m<R> h(@dl.d m<? extends T> source, @dl.d yh.p<? super Integer, ? super T, ? extends C> transform, @dl.d yh.l<? super C, ? extends Iterator<? extends R>> iterator) {
        f0.p(source, "source");
        f0.p(transform, "transform");
        f0.p(iterator, "iterator");
        return q.b(new SequencesKt__SequencesKt$flatMapIndexed$1(source, transform, iterator, null));
    }

    @dl.d
    public static final <T> m<T> i(@dl.d m<? extends m<? extends T>> mVar) {
        f0.p(mVar, "<this>");
        return j(mVar, new yh.l<m<? extends T>, Iterator<? extends T>>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<T> invoke(@dl.d m<? extends T> it) {
                f0.p(it, "it");
                return it.iterator();
            }
        });
    }

    private static final <T, R> m<R> j(m<? extends T> mVar, yh.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return mVar instanceof w ? ((w) mVar).e(lVar) : new i(mVar, new yh.l<T, T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$3
            @Override // yh.l
            public final T invoke(T t10) {
                return t10;
            }
        }, lVar);
    }

    @dl.d
    @xh.h(name = "flattenSequenceOfIterable")
    public static final <T> m<T> k(@dl.d m<? extends Iterable<? extends T>> mVar) {
        f0.p(mVar, "<this>");
        return j(mVar, new yh.l<Iterable<? extends T>, Iterator<? extends T>>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$2
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterator<T> invoke(@dl.d Iterable<? extends T> it) {
                f0.p(it, "it");
                return it.iterator();
            }
        });
    }

    @dl.d
    @sh.h
    public static final <T> m<T> l(@dl.e final T t10, @dl.d yh.l<? super T, ? extends T> nextFunction) {
        f0.p(nextFunction, "nextFunction");
        return t10 == null ? g.f128447a : new j(new yh.a<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            public final T invoke() {
                return t10;
            }
        }, nextFunction);
    }

    @dl.d
    public static final <T> m<T> m(@dl.d final yh.a<? extends T> nextFunction) {
        f0.p(nextFunction, "nextFunction");
        return f(new j(nextFunction, new yh.l<T, T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            public final T invoke(@dl.d T it) {
                f0.p(it, "it");
                return nextFunction.invoke();
            }
        }));
    }

    @dl.d
    public static final <T> m<T> n(@dl.d yh.a<? extends T> seedFunction, @dl.d yh.l<? super T, ? extends T> nextFunction) {
        f0.p(seedFunction, "seedFunction");
        f0.p(nextFunction, "nextFunction");
        return new j(seedFunction, nextFunction);
    }

    @u0(version = "1.3")
    @dl.d
    public static final <T> m<T> o(@dl.d m<? extends T> mVar, @dl.d yh.a<? extends m<? extends T>> defaultValue) {
        f0.p(mVar, "<this>");
        f0.p(defaultValue, "defaultValue");
        return q.b(new SequencesKt__SequencesKt$ifEmpty$1(mVar, defaultValue, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @sh.f
    private static final <T> m<T> p(m<? extends T> mVar) {
        return mVar == 0 ? g() : mVar;
    }

    @dl.d
    public static final <T> m<T> q(@dl.d T... elements) {
        f0.p(elements, "elements");
        return elements.length == 0 ? g() : ArraysKt___ArraysKt.l6(elements);
    }

    @u0(version = "1.4")
    @dl.d
    public static final <T> m<T> r(@dl.d m<? extends T> mVar) {
        f0.p(mVar, "<this>");
        return s(mVar, Random.f125033b);
    }

    @u0(version = "1.4")
    @dl.d
    public static final <T> m<T> s(@dl.d m<? extends T> mVar, @dl.d Random random) {
        f0.p(mVar, "<this>");
        f0.p(random, "random");
        return q.b(new SequencesKt__SequencesKt$shuffled$1(mVar, random, null));
    }

    @dl.d
    public static final <T, R> Pair<List<T>, List<R>> t(@dl.d m<? extends Pair<? extends T, ? extends R>> mVar) {
        f0.p(mVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<? extends T, ? extends R> pair : mVar) {
            arrayList.add(pair.e());
            arrayList2.add(pair.f());
        }
        return c1.a(arrayList, arrayList2);
    }
}
