package kotlin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m implements kotlin.sequences.m<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final BufferedReader f124784a;

    /* JADX INFO: compiled from: ReadWrite.kt */
    public static final class a implements Iterator<String>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private String f124785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f124786c;

        a() {
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f124785b;
            this.f124785b = null;
            f0.m(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f124785b == null && !this.f124786c) {
                String line = m.this.f124784a.readLine();
                this.f124785b = line;
                if (line == null) {
                    this.f124786c = true;
                }
            }
            return this.f124785b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m(@dl.d BufferedReader reader) {
        f0.p(reader, "reader");
        this.f124784a = reader;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<String> iterator() {
        return new a();
    }
}
