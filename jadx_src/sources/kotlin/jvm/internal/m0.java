package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f124937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f124938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final T[] f124939c;

    public m0(int i10) {
        this.f124937a = i10;
        this.f124939c = (T[]) new Object[i10];
    }

    private static /* synthetic */ void d() {
    }

    public final void a(@dl.d T spreadArgument) {
        f0.p(spreadArgument, "spreadArgument");
        T[] tArr = this.f124939c;
        int i10 = this.f124938b;
        this.f124938b = i10 + 1;
        tArr[i10] = spreadArgument;
    }

    protected final int b() {
        return this.f124938b;
    }

    protected abstract int c(@dl.d T t10);

    protected final void e(int i10) {
        this.f124938b = i10;
    }

    protected final int f() {
        int iC = 0;
        kotlin.collections.k0 it = new fi.l(0, this.f124937a - 1).iterator();
        while (it.hasNext()) {
            T t10 = this.f124939c[it.nextInt()];
            iC += t10 != null ? c(t10) : 1;
        }
        return iC;
    }

    @dl.d
    protected final T g(@dl.d T values, @dl.d T result) {
        f0.p(values, "values");
        f0.p(result, "result");
        kotlin.collections.k0 it = new fi.l(0, this.f124937a - 1).iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t10 = this.f124939c[iNextInt];
            if (t10 != null) {
                if (i10 < iNextInt) {
                    int i12 = iNextInt - i10;
                    System.arraycopy(values, i10, result, i11, i12);
                    i11 += i12;
                }
                int iC = c(t10);
                System.arraycopy(t10, 0, result, i11, iC);
                i11 += iC;
                i10 = iNextInt + 1;
            }
        }
        int i13 = this.f124937a;
        if (i10 < i13) {
            System.arraycopy(values, i10, result, i11, i13 - i10);
        }
        return result;
    }
}
