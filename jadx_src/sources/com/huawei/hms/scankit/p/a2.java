package com.huawei.hms.scankit.p;

import java.util.Formatter;

/* JADX INFO: compiled from: DetectionResultColumn.java */
/* JADX INFO: loaded from: classes7.dex */
public class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f61518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0[] f61519b;

    a2(a0 a0Var) {
        this.f61518a = new a0(a0Var);
        this.f61519b = new x0[(a0Var.d() - a0Var.f()) + 1];
    }

    final a0 a() {
        return this.f61518a;
    }

    final x0 a(int i10) {
        return this.f61519b[c(i10)];
    }

    final void a(int i10, x0 x0Var) {
        this.f61519b[c(i10)] = x0Var;
    }

    final x0 b(int i10) {
        x0 x0Var;
        x0 x0Var2;
        x0 x0VarA = a(i10);
        if (x0VarA != null) {
            return x0VarA;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int iC = c(i10) - i11;
            if (iC >= 0 && (x0Var2 = this.f61519b[iC]) != null) {
                return x0Var2;
            }
            int iC2 = c(i10) + i11;
            x0[] x0VarArr = this.f61519b;
            if (iC2 < x0VarArr.length && (x0Var = x0VarArr[iC2]) != null) {
                return x0Var;
            }
        }
        return null;
    }

    final x0[] b() {
        return this.f61519b;
    }

    final int c(int i10) {
        return i10 - this.f61518a.f();
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i10 = 0;
            for (x0 x0Var : this.f61519b) {
                if (x0Var == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i10));
                    i10++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i10), Integer.valueOf(x0Var.c()), Integer.valueOf(x0Var.e()));
                    i10++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th2) {
            try {
                formatter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
