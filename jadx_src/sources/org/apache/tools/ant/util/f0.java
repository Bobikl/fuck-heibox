package org.apache.tools.ant.util;

import java.util.StringTokenizer;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: DeweyDecimal.java */
/* JADX INFO: loaded from: classes5.dex */
public class f0 implements Comparable<f0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f136775b;

    public f0(String str) throws NumberFormatException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".", true);
        this.f136775b = new int[(stringTokenizer.countTokens() + 1) / 2];
        for (int i10 = 0; i10 < this.f136775b.length; i10++) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.isEmpty()) {
                throw new NumberFormatException("Empty component in string");
            }
            this.f136775b[i10] = Integer.parseInt(strNextToken);
            if (stringTokenizer.hasMoreTokens()) {
                stringTokenizer.nextToken();
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new NumberFormatException("DeweyDecimal ended in a '.'");
                }
            }
        }
    }

    public f0(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        this.f136775b = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f0 f0Var) {
        int iMax = Math.max(f0Var.f136775b.length, this.f136775b.length);
        int i10 = 0;
        while (i10 < iMax) {
            int[] iArr = this.f136775b;
            int i11 = i10 < iArr.length ? iArr[i10] : 0;
            int[] iArr2 = f0Var.f136775b;
            int i12 = i10 < iArr2.length ? iArr2[i10] : 0;
            if (i11 != i12) {
                return i11 - i12;
            }
            i10++;
        }
        return 0;
    }

    public int b(int i10) {
        return this.f136775b[i10];
    }

    public int c() {
        return this.f136775b.length;
    }

    public boolean d(f0 f0Var) {
        int iMax = Math.max(f0Var.f136775b.length, this.f136775b.length);
        int i10 = 0;
        while (i10 < iMax) {
            int[] iArr = this.f136775b;
            int i11 = i10 < iArr.length ? iArr[i10] : 0;
            int[] iArr2 = f0Var.f136775b;
            if ((i10 < iArr2.length ? iArr2[i10] : 0) != i11) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public boolean e(f0 f0Var) {
        int iMax = Math.max(f0Var.f136775b.length, this.f136775b.length);
        int i10 = 0;
        while (i10 < iMax) {
            int[] iArr = this.f136775b;
            int i11 = i10 < iArr.length ? iArr[i10] : 0;
            int[] iArr2 = f0Var.f136775b;
            int i12 = i10 < iArr2.length ? iArr2[i10] : 0;
            if (i12 > i11) {
                return false;
            }
            if (i12 < i11) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f0) && d((f0) obj);
    }

    public boolean f(f0 f0Var) {
        int iMax = Math.max(f0Var.f136775b.length, this.f136775b.length);
        int i10 = 0;
        while (i10 < iMax) {
            int[] iArr = this.f136775b;
            int i11 = i10 < iArr.length ? iArr[i10] : 0;
            int[] iArr2 = f0Var.f136775b;
            int i12 = i10 < iArr2.length ? iArr2[i10] : 0;
            if (i12 > i11) {
                return false;
            }
            if (i12 < i11) {
                return true;
            }
            i10++;
        }
        return true;
    }

    public boolean g(f0 f0Var) {
        return !f(f0Var);
    }

    public boolean h(f0 f0Var) {
        return !e(f0Var);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return (String) IntStream.of(this.f136775b).mapToObj(new IntFunction() { // from class: org.apache.tools.ant.util.e0
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return Integer.toString(i10);
            }
        }).collect(Collectors.joining("."));
    }
}
