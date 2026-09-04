package org.apache.tools.ant.taskdefs.optional.depend;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ClassFileIterator.java */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d {

    /* JADX INFO: compiled from: ClassFileIterator.java */
    public class a implements Iterator<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c f134797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f134798c;

        a(e eVar) {
            this.f134798c = eVar;
            this.f134797b = eVar.C1();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c next() {
            c cVar = this.f134797b;
            if (cVar == null) {
                throw new NoSuchElementException();
            }
            this.f134797b = this.f134798c.C1();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f134797b != null;
        }
    }

    public static Iterator a(e eVar) {
        return new a(eVar);
    }
}
