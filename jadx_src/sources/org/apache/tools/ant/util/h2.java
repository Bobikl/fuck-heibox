package org.apache.tools.ant.util;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: compiled from: StreamUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class h2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: StreamUtils.java */
    public class a<T> extends Spliterators.AbstractSpliterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Enumeration f136802a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, int i10, Enumeration enumeration) {
            super(j10, i10);
            this.f136802a = enumeration;
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(Consumer<? super T> consumer) {
            while (this.f136802a.hasMoreElements()) {
                consumer.accept((Object) this.f136802a.nextElement());
            }
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super T> consumer) {
            if (!this.f136802a.hasMoreElements()) {
                return false;
            }
            consumer.accept((Object) this.f136802a.nextElement());
            return true;
        }
    }

    public static <T> Stream<T> a(Enumeration<T> enumeration) {
        return StreamSupport.stream(new a(Long.MAX_VALUE, 16, enumeration), false);
    }

    public static <T> Stream<T> b(Iterator<T> it) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 16), false);
    }
}
