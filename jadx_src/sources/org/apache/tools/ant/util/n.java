package org.apache.tools.ant.util;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: CollectionUtils.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final List f136869a = Collections.EMPTY_LIST;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: CollectionUtils.java */
    public class a<E> implements Enumeration<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f136870a;

        a(Iterator it) {
            this.f136870a = it;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f136870a.hasNext();
        }

        @Override // java.util.Enumeration
        public E nextElement() {
            return (E) this.f136870a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: CollectionUtils.java */
    public class b<E> implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Enumeration f136871b;

        b(Enumeration enumeration) {
            this.f136871b = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f136871b.hasMoreElements();
        }

        @Override // java.util.Iterator
        public E next() {
            return (E) this.f136871b.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: CollectionUtils.java */
    public static final class c<E> implements Enumeration<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Enumeration<E> f136872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Enumeration<E> f136873b;

        public c(Enumeration<E> enumeration, Enumeration<E> enumeration2) {
            this.f136872a = enumeration;
            this.f136873b = enumeration2;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f136872a.hasMoreElements() || this.f136873b.hasMoreElements();
        }

        @Override // java.util.Enumeration
        public E nextElement() throws NoSuchElementException {
            return this.f136872a.hasMoreElements() ? this.f136872a.nextElement() : this.f136873b.nextElement();
        }
    }

    /* JADX INFO: compiled from: CollectionUtils.java */
    @Deprecated
    public static final class d<E> implements Enumeration<E> {
        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public E nextElement() throws NoSuchElementException {
            throw new NoSuchElementException();
        }
    }

    private n() {
    }

    @Deprecated
    public static <E> Enumeration<E> c(Enumeration<E> enumeration, Enumeration<E> enumeration2) {
        return new c(enumeration, enumeration2);
    }

    @Deprecated
    public static <T> Collection<T> d(Iterator<? extends T> it) {
        final ArrayList arrayList = new ArrayList();
        it.forEachRemaining(new Consumer() { // from class: org.apache.tools.ant.util.k
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add(obj);
            }
        });
        return arrayList;
    }

    @Deprecated
    public static <E> Enumeration<E> e(Iterator<E> it) {
        return new a(it);
    }

    @Deprecated
    public static <E> Iterator<E> f(Enumeration<E> enumeration) {
        return new b(enumeration);
    }

    @Deprecated
    public static boolean g(final Dictionary<?, ?> dictionary, final Dictionary<?, ?> dictionary2) {
        if (dictionary == dictionary2) {
            return true;
        }
        if (dictionary == null || dictionary2 == null || dictionary.size() != dictionary2.size()) {
            return false;
        }
        return h2.a(dictionary.keys()).allMatch(new Predicate() { // from class: org.apache.tools.ant.util.j
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return n.k(dictionary, dictionary2, obj);
            }
        });
    }

    @Deprecated
    public static boolean h(Vector<?> vector, Vector<?> vector2) {
        return Objects.equals(vector, vector2);
    }

    @Deprecated
    public static String i(Collection<?> collection) {
        return (String) collection.stream().map(new l()).collect(Collectors.joining(Constants.ACCEPT_TIME_SEPARATOR_SP));
    }

    @Deprecated
    public static int j(Collection<?> collection, Object obj) {
        if (collection == null) {
            return 0;
        }
        return Collections.frequency(collection, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean k(Dictionary dictionary, Dictionary dictionary2, Object obj) {
        return dictionary.get(obj).equals(dictionary2.get(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Dictionary dictionary, Dictionary dictionary2, Object obj) {
        dictionary.put(obj, dictionary2.get(obj));
    }

    @Deprecated
    public static <K, V> void m(final Dictionary<? super K, ? super V> dictionary, final Dictionary<? extends K, ? extends V> dictionary2) {
        h2.a(dictionary2.keys()).forEach(new Consumer() { // from class: org.apache.tools.ant.util.m
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                n.l(dictionary, dictionary2, obj);
            }
        });
    }
}
