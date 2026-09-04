package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* JADX INFO: compiled from: CLObject.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends b implements Iterable<d> {

    /* JADX INFO: compiled from: CLObject.java */
    public class a implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f18075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18076c = 0;

        public a(f fVar) {
            this.f18075b = fVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18076c < this.f18075b.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            d dVar = (d) this.f18075b.f18065i.get(this.f18076c);
            this.f18076c++;
            return dVar;
        }
    }

    public f(char[] cArr) {
        super(cArr);
    }

    public static f k0(char[] cArr) {
        return new f(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public String A() {
        StringBuilder sb2 = new StringBuilder(g() + "{ ");
        boolean z10 = true;
        for (c cVar : this.f18065i) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(cVar.A());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // java.lang.Iterable
    public Iterator<d> iterator() {
        return new a(this);
    }

    public String l0() {
        return y(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(g());
        sb2.append("{\n");
        boolean z10 = true;
        for (c cVar : this.f18065i) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",\n");
            }
            sb2.append(cVar.y(c.f18067h + i10, i11 - 1));
        }
        sb2.append("\n");
        a(sb2, i10);
        sb2.append(z5.g.f141884d);
        return sb2.toString();
    }
}
