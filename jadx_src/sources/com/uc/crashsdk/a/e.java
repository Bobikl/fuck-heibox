package com.uc.crashsdk.a;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f104170a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f104171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f104172c;

    public e(int i10) {
        this.f104171b = i10;
        this.f104172c = null;
    }

    public e(int i10, Object[] objArr) {
        this.f104171b = i10;
        this.f104172c = objArr;
    }

    public final boolean a() {
        int i10 = this.f104171b;
        if (i10 == 451 || i10 == 452) {
            return com.uc.crashsdk.e.b(i10, this.f104172c);
        }
        switch (i10) {
            case bb.c.b.N3 /* 351 */:
            case bb.c.b.O3 /* 352 */:
            case bb.c.b.P3 /* 353 */:
            case bb.c.b.Q3 /* 354 */:
                return h.b(i10, this.f104172c);
            default:
                switch (i10) {
                    case bb.c.b.f31039xb /* 751 */:
                    case bb.c.b.f31061yb /* 752 */:
                    case bb.c.b.f31083zb /* 753 */:
                    case bb.c.b.Ab /* 754 */:
                    case bb.c.b.Bb /* 755 */:
                    case bb.c.b.Cb /* 756 */:
                        return com.uc.crashsdk.f.a(i10, this.f104172c);
                    default:
                        a.d("crashsdk", "Unknown sync runnable: " + toString());
                        if (f104170a) {
                            return false;
                        }
                        throw new AssertionError();
                }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = this.f104171b;
        if (i10 == 10) {
            f.a(i10, this.f104172c);
            return;
        }
        if (i10 == 500) {
            d.a(i10);
            return;
        }
        if (i10 == 700) {
            com.uc.crashsdk.f.b(i10);
            return;
        }
        if (i10 == 800) {
            g.a(i10);
            return;
        }
        if (i10 == 201 || i10 == 202) {
            com.uc.crashsdk.a.a(i10);
            return;
        }
        switch (i10) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
                com.uc.crashsdk.b.a(i10);
                return;
            default:
                switch (i10) {
                    case 301:
                    case 302:
                    case 303:
                        h.a(i10, this.f104172c);
                        return;
                    default:
                        switch (i10) {
                            case 401:
                            case 402:
                            case 403:
                                break;
                            default:
                                switch (i10) {
                                    case 405:
                                    case 406:
                                    case 407:
                                    case bb.c.b.S4 /* 408 */:
                                    case 409:
                                    case bb.c.b.U4 /* 410 */:
                                    case 411:
                                    case 412:
                                    case 413:
                                    case 414:
                                    case bb.c.b.Z4 /* 415 */:
                                    case 416:
                                        break;
                                    default:
                                        a.d("crashsdk", "Unknown async runnable: " + toString());
                                        if (!f104170a) {
                                            throw new AssertionError();
                                        }
                                        return;
                                }
                                break;
                        }
                        com.uc.crashsdk.e.a(i10, this.f104172c);
                        return;
                }
        }
    }

    public String toString() {
        return super.toString() + "@action_" + this.f104171b;
    }
}
