package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f21158a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f21159b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f21160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f21161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f21162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f21163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f21164g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f21165h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f21166i = 2;

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f21167b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f21168a;

        private a(boolean z10) {
            this.f21168a = z10;
        }

        @Override // androidx.core.text.r.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = r.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f21168a) {
                        return 1;
                    }
                    i10++;
                    z10 = z10;
                } else if (this.f21168a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f21168a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f21169a = new b();

        private b() {
        }

        @Override // androidx.core.text.r.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = r.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static abstract class d implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f21170a;

        d(c cVar) {
            this.f21170a = cVar;
        }

        private boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f21170a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // androidx.core.text.q
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f21170a == null ? a() : b(charSequence, i10, i11);
        }

        @Override // androidx.core.text.q
        public boolean isRtl(char[] cArr, int i10, int i11) {
            return isRtl(CharBuffer.wrap(cArr), i10, i11);
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f21171b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f21171b = z10;
        }

        @Override // androidx.core.text.r.d
        protected boolean a() {
            return this.f21171b;
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f21172b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.r.d
        protected boolean a() {
            return s.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f21169a;
        f21160c = new e(bVar, false);
        f21161d = new e(bVar, true);
        f21162e = new e(a.f21167b, false);
        f21163f = f.f21172b;
    }

    private r() {
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
