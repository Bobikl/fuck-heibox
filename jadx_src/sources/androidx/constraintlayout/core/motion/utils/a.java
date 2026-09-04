package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: compiled from: ArcCurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17604g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f17605h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f17606i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f17607j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f17608k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f17609l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f17610m = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double[] f17611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    C0109a[] f17612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17613f = true;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ArcCurveFit.java */
    public static class C0109a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f17614s = "Arc";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static double[] f17615t = new double[91];

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final double f17616u = 0.001d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double[] f17617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f17618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f17619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        double f17620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        double f17621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        double f17622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double f17623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        double f17624h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        double f17625i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        double f17626j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        double f17627k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        double f17628l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        double f17629m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double f17630n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        double f17631o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        double f17632p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f17633q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f17634r;

        C0109a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            this.f17634r = false;
            this.f17633q = i10 == 1;
            this.f17619c = d10;
            this.f17620d = d11;
            this.f17625i = 1.0d / (d11 - d10);
            if (3 == i10) {
                this.f17634r = true;
            }
            double d16 = d14 - d12;
            double d17 = d15 - d13;
            if (!this.f17634r && Math.abs(d16) >= f17616u && Math.abs(d17) >= f17616u) {
                this.f17617a = new double[101];
                boolean z10 = this.f17633q;
                this.f17626j = d16 * ((double) (z10 ? -1 : 1));
                this.f17627k = d17 * ((double) (z10 ? 1 : -1));
                this.f17628l = z10 ? d14 : d12;
                this.f17629m = z10 ? d13 : d15;
                a(d12, d13, d14, d15);
                this.f17630n = this.f17618b * this.f17625i;
                return;
            }
            this.f17634r = true;
            this.f17621e = d12;
            this.f17622f = d14;
            this.f17623g = d13;
            this.f17624h = d15;
            double dHypot = Math.hypot(d17, d16);
            this.f17618b = dHypot;
            this.f17630n = dHypot * this.f17625i;
            double d18 = this.f17620d;
            double d19 = this.f17619c;
            this.f17628l = d16 / (d18 - d19);
            this.f17629m = d17 / (d18 - d19);
        }

        private void a(double d10, double d11, double d12, double d13) {
            double dHypot;
            double d14 = d12 - d10;
            double d15 = d11 - d13;
            int i10 = 0;
            double d16 = 0.0d;
            double d17 = 0.0d;
            double d18 = 0.0d;
            while (true) {
                double[] dArr = f17615t;
                if (i10 >= dArr.length) {
                    break;
                }
                double d19 = d16;
                double radians = Math.toRadians((((double) i10) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d14;
                double dCos = Math.cos(radians) * d15;
                if (i10 > 0) {
                    dHypot = Math.hypot(dSin - d17, dCos - d18) + d19;
                    f17615t[i10] = dHypot;
                } else {
                    dHypot = d19;
                }
                i10++;
                d18 = dCos;
                d16 = dHypot;
                d17 = dSin;
            }
            double d20 = d16;
            this.f17618b = d20;
            int i11 = 0;
            while (true) {
                double[] dArr2 = f17615t;
                if (i11 >= dArr2.length) {
                    break;
                }
                dArr2[i11] = dArr2[i11] / d20;
                i11++;
            }
            int i12 = 0;
            while (true) {
                double[] dArr3 = this.f17617a;
                if (i12 >= dArr3.length) {
                    return;
                }
                double length = ((double) i12) / ((double) (dArr3.length - 1));
                int iBinarySearch = Arrays.binarySearch(f17615t, length);
                if (iBinarySearch >= 0) {
                    this.f17617a[i12] = ((double) iBinarySearch) / ((double) (f17615t.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f17617a[i12] = 0.0d;
                } else {
                    int i13 = -iBinarySearch;
                    int i14 = i13 - 2;
                    double[] dArr4 = f17615t;
                    double d21 = dArr4[i14];
                    this.f17617a[i12] = (((double) i14) + ((length - d21) / (dArr4[i13 - 1] - d21))) / ((double) (dArr4.length - 1));
                }
                i12++;
            }
        }

        double b() {
            double d10 = this.f17626j * this.f17632p;
            double dHypot = this.f17630n / Math.hypot(d10, (-this.f17627k) * this.f17631o);
            if (this.f17633q) {
                d10 = -d10;
            }
            return d10 * dHypot;
        }

        double c() {
            double d10 = this.f17626j * this.f17632p;
            double d11 = (-this.f17627k) * this.f17631o;
            double dHypot = this.f17630n / Math.hypot(d10, d11);
            return this.f17633q ? (-d11) * dHypot : d11 * dHypot;
        }

        public double d(double d10) {
            return this.f17628l;
        }

        public double e(double d10) {
            return this.f17629m;
        }

        public double f(double d10) {
            double d11 = (d10 - this.f17619c) * this.f17625i;
            double d12 = this.f17621e;
            return d12 + (d11 * (this.f17622f - d12));
        }

        public double g(double d10) {
            double d11 = (d10 - this.f17619c) * this.f17625i;
            double d12 = this.f17623g;
            return d12 + (d11 * (this.f17624h - d12));
        }

        double h() {
            return this.f17628l + (this.f17626j * this.f17631o);
        }

        double i() {
            return this.f17629m + (this.f17627k * this.f17632p);
        }

        double j(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f17617a;
            double length = d10 * ((double) (dArr.length - 1));
            int i10 = (int) length;
            double d11 = length - ((double) i10);
            double d12 = dArr[i10];
            return d12 + (d11 * (dArr[i10 + 1] - d12));
        }

        void k(double d10) {
            double dJ = j((this.f17633q ? this.f17620d - d10 : d10 - this.f17619c) * this.f17625i) * 1.5707963267948966d;
            this.f17631o = Math.sin(dJ);
            this.f17632p = Math.cos(dJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f17611d = dArr;
        this.f17612e = new C0109a[dArr.length - 1];
        int i10 = 1;
        int i11 = 1;
        int i12 = 0;
        while (true) {
            C0109a[] c0109aArr = this.f17612e;
            if (i12 >= c0109aArr.length) {
                return;
            }
            int i13 = iArr[i12];
            if (i13 == 0) {
                i11 = 3;
            } else if (i13 == 1) {
                i10 = 1;
                i11 = i10;
            } else {
                if (i13 != 2) {
                    if (i13 == 3) {
                        if (i10 != 1) {
                            i10 = 1;
                        }
                        i11 = i10;
                    }
                }
                i10 = 2;
                i11 = i10;
            }
            double d10 = dArr[i12];
            int i14 = i12 + 1;
            double d11 = dArr[i14];
            double[] dArr3 = dArr2[i12];
            double d12 = dArr3[0];
            double d13 = dArr3[1];
            double[] dArr4 = dArr2[i14];
            c0109aArr[i12] = new C0109a(i11, d10, d11, d12, d13, dArr4[0], dArr4[1]);
            i12 = i14;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double c(double d10, int i10) {
        double dG;
        double dE;
        double dI;
        double dC;
        double dG2;
        double dE2;
        int i11 = 0;
        if (this.f17613f) {
            C0109a[] c0109aArr = this.f17612e;
            C0109a c0109a = c0109aArr[0];
            double d11 = c0109a.f17619c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0109a.f17634r) {
                    if (i10 == 0) {
                        dG2 = c0109a.f(d11);
                        dE2 = this.f17612e[0].d(d11);
                    } else {
                        dG2 = c0109a.g(d11);
                        dE2 = this.f17612e[0].e(d11);
                    }
                    return dG2 + (d12 * dE2);
                }
                c0109a.k(d11);
                if (i10 == 0) {
                    dI = this.f17612e[0].h();
                    dC = this.f17612e[0].b();
                } else {
                    dI = this.f17612e[0].i();
                    dC = this.f17612e[0].c();
                }
                return dI + (d12 * dC);
            }
            if (d10 > c0109aArr[c0109aArr.length - 1].f17620d) {
                double d13 = c0109aArr[c0109aArr.length - 1].f17620d;
                double d14 = d10 - d13;
                int length = c0109aArr.length - 1;
                if (i10 == 0) {
                    dG = c0109aArr[length].f(d13);
                    dE = this.f17612e[length].d(d13);
                } else {
                    dG = c0109aArr[length].g(d13);
                    dE = this.f17612e[length].e(d13);
                }
                return dG + (d14 * dE);
            }
        } else {
            C0109a[] c0109aArr2 = this.f17612e;
            double d15 = c0109aArr2[0].f17619c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > c0109aArr2[c0109aArr2.length - 1].f17620d) {
                d10 = c0109aArr2[c0109aArr2.length - 1].f17620d;
            }
        }
        while (true) {
            C0109a[] c0109aArr3 = this.f17612e;
            if (i11 >= c0109aArr3.length) {
                return Double.NaN;
            }
            C0109a c0109a2 = c0109aArr3[i11];
            if (d10 <= c0109a2.f17620d) {
                if (c0109a2.f17634r) {
                    return i10 == 0 ? c0109a2.f(d10) : c0109a2.g(d10);
                }
                c0109a2.k(d10);
                return i10 == 0 ? this.f17612e[i11].h() : this.f17612e[i11].i();
            }
            i11++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void d(double d10, double[] dArr) {
        if (this.f17613f) {
            C0109a[] c0109aArr = this.f17612e;
            C0109a c0109a = c0109aArr[0];
            double d11 = c0109a.f17619c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0109a.f17634r) {
                    dArr[0] = c0109a.f(d11) + (this.f17612e[0].d(d11) * d12);
                    dArr[1] = this.f17612e[0].g(d11) + (d12 * this.f17612e[0].e(d11));
                    return;
                } else {
                    c0109a.k(d11);
                    dArr[0] = this.f17612e[0].h() + (this.f17612e[0].b() * d12);
                    dArr[1] = this.f17612e[0].i() + (d12 * this.f17612e[0].c());
                    return;
                }
            }
            if (d10 > c0109aArr[c0109aArr.length - 1].f17620d) {
                double d13 = c0109aArr[c0109aArr.length - 1].f17620d;
                double d14 = d10 - d13;
                int length = c0109aArr.length - 1;
                C0109a c0109a2 = c0109aArr[length];
                if (c0109a2.f17634r) {
                    dArr[0] = c0109a2.f(d13) + (this.f17612e[length].d(d13) * d14);
                    dArr[1] = this.f17612e[length].g(d13) + (d14 * this.f17612e[length].e(d13));
                    return;
                } else {
                    c0109a2.k(d10);
                    dArr[0] = this.f17612e[length].h() + (this.f17612e[length].b() * d14);
                    dArr[1] = this.f17612e[length].i() + (d14 * this.f17612e[length].c());
                    return;
                }
            }
        } else {
            C0109a[] c0109aArr2 = this.f17612e;
            double d15 = c0109aArr2[0].f17619c;
            if (d10 < d15) {
                d10 = d15;
            }
            if (d10 > c0109aArr2[c0109aArr2.length - 1].f17620d) {
                d10 = c0109aArr2[c0109aArr2.length - 1].f17620d;
            }
        }
        int i10 = 0;
        while (true) {
            C0109a[] c0109aArr3 = this.f17612e;
            if (i10 >= c0109aArr3.length) {
                return;
            }
            C0109a c0109a3 = c0109aArr3[i10];
            if (d10 <= c0109a3.f17620d) {
                if (c0109a3.f17634r) {
                    dArr[0] = c0109a3.f(d10);
                    dArr[1] = this.f17612e[i10].g(d10);
                    return;
                } else {
                    c0109a3.k(d10);
                    dArr[0] = this.f17612e[i10].h();
                    dArr[1] = this.f17612e[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void e(double d10, float[] fArr) {
        if (this.f17613f) {
            C0109a[] c0109aArr = this.f17612e;
            C0109a c0109a = c0109aArr[0];
            double d11 = c0109a.f17619c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0109a.f17634r) {
                    fArr[0] = (float) (c0109a.f(d11) + (this.f17612e[0].d(d11) * d12));
                    fArr[1] = (float) (this.f17612e[0].g(d11) + (d12 * this.f17612e[0].e(d11)));
                    return;
                } else {
                    c0109a.k(d11);
                    fArr[0] = (float) (this.f17612e[0].h() + (this.f17612e[0].b() * d12));
                    fArr[1] = (float) (this.f17612e[0].i() + (d12 * this.f17612e[0].c()));
                    return;
                }
            }
            if (d10 > c0109aArr[c0109aArr.length - 1].f17620d) {
                double d13 = c0109aArr[c0109aArr.length - 1].f17620d;
                double d14 = d10 - d13;
                int length = c0109aArr.length - 1;
                C0109a c0109a2 = c0109aArr[length];
                if (c0109a2.f17634r) {
                    fArr[0] = (float) (c0109a2.f(d13) + (this.f17612e[length].d(d13) * d14));
                    fArr[1] = (float) (this.f17612e[length].g(d13) + (d14 * this.f17612e[length].e(d13)));
                    return;
                } else {
                    c0109a2.k(d10);
                    fArr[0] = (float) this.f17612e[length].h();
                    fArr[1] = (float) this.f17612e[length].i();
                    return;
                }
            }
        } else {
            C0109a[] c0109aArr2 = this.f17612e;
            double d15 = c0109aArr2[0].f17619c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > c0109aArr2[c0109aArr2.length - 1].f17620d) {
                d10 = c0109aArr2[c0109aArr2.length - 1].f17620d;
            }
        }
        int i10 = 0;
        while (true) {
            C0109a[] c0109aArr3 = this.f17612e;
            if (i10 >= c0109aArr3.length) {
                return;
            }
            C0109a c0109a3 = c0109aArr3[i10];
            if (d10 <= c0109a3.f17620d) {
                if (c0109a3.f17634r) {
                    fArr[0] = (float) c0109a3.f(d10);
                    fArr[1] = (float) this.f17612e[i10].g(d10);
                    return;
                } else {
                    c0109a3.k(d10);
                    fArr[0] = (float) this.f17612e[i10].h();
                    fArr[1] = (float) this.f17612e[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double f(double d10, int i10) {
        C0109a[] c0109aArr = this.f17612e;
        int i11 = 0;
        double d11 = c0109aArr[0].f17619c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > c0109aArr[c0109aArr.length - 1].f17620d) {
            d10 = c0109aArr[c0109aArr.length - 1].f17620d;
        }
        while (true) {
            C0109a[] c0109aArr2 = this.f17612e;
            if (i11 >= c0109aArr2.length) {
                return Double.NaN;
            }
            C0109a c0109a = c0109aArr2[i11];
            if (d10 <= c0109a.f17620d) {
                if (c0109a.f17634r) {
                    return i10 == 0 ? c0109a.d(d10) : c0109a.e(d10);
                }
                c0109a.k(d10);
                return i10 == 0 ? this.f17612e[i11].b() : this.f17612e[i11].c();
            }
            i11++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void g(double d10, double[] dArr) {
        C0109a[] c0109aArr = this.f17612e;
        double d11 = c0109aArr[0].f17619c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > c0109aArr[c0109aArr.length - 1].f17620d) {
            d10 = c0109aArr[c0109aArr.length - 1].f17620d;
        }
        int i10 = 0;
        while (true) {
            C0109a[] c0109aArr2 = this.f17612e;
            if (i10 >= c0109aArr2.length) {
                return;
            }
            C0109a c0109a = c0109aArr2[i10];
            if (d10 <= c0109a.f17620d) {
                if (c0109a.f17634r) {
                    dArr[0] = c0109a.d(d10);
                    dArr[1] = this.f17612e[i10].e(d10);
                    return;
                } else {
                    c0109a.k(d10);
                    dArr[0] = this.f17612e[i10].b();
                    dArr[1] = this.f17612e[i10].c();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double[] h() {
        return this.f17611d;
    }
}
