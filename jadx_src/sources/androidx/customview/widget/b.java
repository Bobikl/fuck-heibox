package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: FocusStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: compiled from: FocusStrategy.java */
    public interface a<T> {
        void a(T t10, Rect rect);
    }

    /* JADX INFO: renamed from: androidx.customview.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FocusStrategy.java */
    public interface InterfaceC0155b<T, V> {
        V a(T t10, int i10);

        int b(T t10);
    }

    /* JADX INFO: compiled from: FocusStrategy.java */
    public static class c<T> implements Comparator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f22005b = new Rect();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f22006c = new Rect();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f22007d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a<T> f22008e;

        c(boolean z10, a<T> aVar) {
            this.f22007d = z10;
            this.f22008e = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t10, T t11) {
            Rect rect = this.f22005b;
            Rect rect2 = this.f22006c;
            this.f22008e.a(t10, rect);
            this.f22008e.a(t11, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                return this.f22007d ? 1 : -1;
            }
            if (i12 > i13) {
                return this.f22007d ? -1 : 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                return this.f22007d ? 1 : -1;
            }
            if (i16 > i17) {
                return this.f22007d ? -1 : 1;
            }
            return 0;
        }
    }

    private b() {
    }

    private static boolean a(int i10, @n0 Rect rect, @n0 Rect rect2, @n0 Rect rect3) {
        boolean zB = b(i10, rect, rect2);
        if (b(i10, rect, rect3) || !zB) {
            return false;
        }
        return !j(i10, rect, rect3) || i10 == 17 || i10 == 66 || k(i10, rect, rect2) < m(i10, rect, rect3);
    }

    private static boolean b(int i10, @n0 Rect rect, @n0 Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T c(@n0 L l10, @n0 InterfaceC0155b<L, T> interfaceC0155b, @n0 a<T> aVar, @p0 T t10, @n0 Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        if (i10 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i10 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i10 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        T t11 = null;
        int iB = interfaceC0155b.b(l10);
        Rect rect3 = new Rect();
        for (int i11 = 0; i11 < iB; i11++) {
            T tA = interfaceC0155b.a(l10, i11);
            if (tA != t10) {
                aVar.a(tA, rect3);
                if (h(i10, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t11 = tA;
                }
            }
        }
        return t11;
    }

    public static <L, T> T d(@n0 L l10, @n0 InterfaceC0155b<L, T> interfaceC0155b, @n0 a<T> aVar, @p0 T t10, int i10, boolean z10, boolean z11) {
        int iB = interfaceC0155b.b(l10);
        ArrayList arrayList = new ArrayList(iB);
        for (int i11 = 0; i11 < iB; i11++) {
            arrayList.add(interfaceC0155b.a(l10, i11));
        }
        Collections.sort(arrayList, new c(z10, aVar));
        if (i10 == 1) {
            return (T) f(t10, arrayList, z11);
        }
        if (i10 == 2) {
            return (T) e(t10, arrayList, z11);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T e(T t10, ArrayList<T> arrayList, boolean z10) {
        int size = arrayList.size();
        int iLastIndexOf = (t10 == null ? -1 : arrayList.lastIndexOf(t10)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T f(T t10, ArrayList<T> arrayList, boolean z10) {
        int size = arrayList.size();
        int iIndexOf = (t10 == null ? size : arrayList.indexOf(t10)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i10, int i11) {
        return (i10 * 13 * i10) + (i11 * i11);
    }

    private static boolean h(int i10, @n0 Rect rect, @n0 Rect rect2, @n0 Rect rect3) {
        if (!i(rect, rect2, i10)) {
            return false;
        }
        if (i(rect, rect3, i10) && !a(i10, rect, rect2, rect3)) {
            return !a(i10, rect, rect3, rect2) && g(k(i10, rect, rect2), o(i10, rect, rect2)) < g(k(i10, rect, rect3), o(i10, rect, rect3));
        }
        return true;
    }

    private static boolean i(@n0 Rect rect, @n0 Rect rect2, int i10) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i10, @n0 Rect rect, @n0 Rect rect2) {
        if (i10 == 17) {
            return rect.left >= rect2.right;
        }
        if (i10 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i10 == 66) {
            return rect.right <= rect2.left;
        }
        if (i10 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i10, @n0 Rect rect, @n0 Rect rect2) {
        return Math.max(0, l(i10, rect, rect2));
    }

    private static int l(int i10, @n0 Rect rect, @n0 Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    private static int m(int i10, @n0 Rect rect, @n0 Rect rect2) {
        return Math.max(1, n(i10, rect, rect2));
    }

    private static int n(int i10, @n0 Rect rect, @n0 Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.left;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.top;
        } else if (i10 == 66) {
            i11 = rect2.right;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.bottom;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    private static int o(int i10, @n0 Rect rect, @n0 Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
