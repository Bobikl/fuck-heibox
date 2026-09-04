package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Serialization.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public final class g2 {

    /* JADX INFO: compiled from: Serialization.java */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f58079a;

        private b(Field field) {
            this.f58079a = field;
            field.setAccessible(true);
        }

        void a(T t10, int i10) {
            try {
                this.f58079a.set(t10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        void b(T t10, Object obj) {
            try {
                this.f58079a.set(t10, obj);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    private g2() {
    }

    static <T> b<T> a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    static <K, V> void b(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        c(map, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void c(Map<K, V> map, ObjectInputStream objectInputStream, int i10) throws IOException, ClassNotFoundException {
        for (int i11 = 0; i11 < i10; i11++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    static <K, V> void d(r1<K, V> r1Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        e(r1Var, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void e(r1<K, V> r1Var, ObjectInputStream objectInputStream, int i10) throws IOException, ClassNotFoundException {
        for (int i11 = 0; i11 < i10; i11++) {
            Collection collectionV = r1Var.v(objectInputStream.readObject());
            int i12 = objectInputStream.readInt();
            for (int i13 = 0; i13 < i12; i13++) {
                collectionV.add(objectInputStream.readObject());
            }
        }
    }

    static <E> void f(s1<E> s1Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        g(s1Var, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> void g(s1<E> s1Var, ObjectInputStream objectInputStream, int i10) throws IOException, ClassNotFoundException {
        for (int i11 = 0; i11 < i10; i11++) {
            s1Var.c0(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static int h(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    static <K, V> void i(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static <K, V> void j(r1<K, V> r1Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(r1Var.e().size());
        for (Map.Entry<K, Collection<V>> entry : r1Var.e().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    static <E> void k(s1<E> s1Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(s1Var.entrySet().size());
        for (s1.a<E> aVar : s1Var.entrySet()) {
            objectOutputStream.writeObject(aVar.a());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }
}
