package com.google.common.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: compiled from: BigDecimalMath.java */
/* JADX INFO: loaded from: classes7.dex */
@e
@o9.c
public class a {

    /* JADX INFO: renamed from: com.google.common.math.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BigDecimalMath.java */
    public static class C0480a extends m<BigDecimal> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0480a f58747a = new C0480a();

        private C0480a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.subtract(bigDecimal2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public double c(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.m
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.m
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(double d10, RoundingMode roundingMode) {
            return new BigDecimal(d10);
        }
    }

    private a() {
    }

    public static double a(BigDecimal bigDecimal, RoundingMode roundingMode) {
        return C0480a.f58747a.b(bigDecimal, roundingMode);
    }
}
