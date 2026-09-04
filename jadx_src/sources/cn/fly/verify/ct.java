package cn.fly.verify;

import kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes6.dex */
public class ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f36082a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Number f36083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Number f36084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Number f36085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Number f36086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f36087e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Number] */
        /* JADX WARN: Type inference failed for: r13v29 */
        /* JADX WARN: Type inference failed for: r13v30 */
        /* JADX WARN: Type inference failed for: r13v31 */
        /* JADX WARN: Type inference failed for: r13v32 */
        /* JADX WARN: Type inference failed for: r13v33 */
        /* JADX WARN: Type inference failed for: r13v34 */
        /* JADX WARN: Type inference failed for: r13v35 */
        /* JADX WARN: Type inference failed for: r13v36 */
        public a(Number number, Number number2, Number number3) {
            Number number4;
            Number[] numberArr = {number, number2, number3};
            int[] iArr = {0, 0, 0};
            for (int i10 = 0; i10 < 3; i10++) {
                Number number5 = numberArr[i10];
                if (number5 != null) {
                    if (number5 instanceof Byte) {
                        iArr[i10] = 1;
                    } else if (number5 instanceof Short) {
                        iArr[i10] = 2;
                    } else if (number5 instanceof Integer) {
                        iArr[i10] = 3;
                    } else if (number5 instanceof Long) {
                        iArr[i10] = 4;
                    } else if (number5 instanceof Float) {
                        iArr[i10] = 5;
                    } else if (number5 instanceof Double) {
                        iArr[i10] = 6;
                    }
                }
            }
            int i11 = 0;
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 < i13) {
                    i11 = i13;
                }
            }
            ?? ValueOf = number;
            if (number != null) {
                switch (i11) {
                    case 1:
                        ValueOf = Byte.valueOf(Double.valueOf(String.valueOf(number)).byteValue());
                        break;
                    case 2:
                        ValueOf = Short.valueOf(Double.valueOf(String.valueOf(number)).shortValue());
                        break;
                    case 3:
                        ValueOf = Integer.valueOf(Double.valueOf(String.valueOf(number)).intValue());
                        break;
                    case 4:
                        ValueOf = Long.valueOf(Double.valueOf(String.valueOf(number)).longValue());
                        break;
                    case 5:
                        ValueOf = Float.valueOf(Double.valueOf(String.valueOf(number)).floatValue());
                        break;
                    case 6:
                        ValueOf = Double.valueOf(String.valueOf(number));
                        break;
                }
            } else {
                number4 = new Number[]{Integer.MIN_VALUE, (byte) -128, Short.valueOf(r0.f124963b), Integer.MIN_VALUE, Long.MIN_VALUE, Float.valueOf(Float.MIN_VALUE), Double.valueOf(Double.MIN_VALUE)}[i11];
            }
            if (number2 != null) {
                switch (i11) {
                    case 1:
                        number2 = Byte.valueOf(Double.valueOf(String.valueOf(number2)).byteValue());
                        break;
                    case 2:
                        number2 = Short.valueOf(Double.valueOf(String.valueOf(number2)).shortValue());
                        break;
                    case 3:
                        number2 = Integer.valueOf(Double.valueOf(String.valueOf(number2)).intValue());
                        break;
                    case 4:
                        number2 = Long.valueOf(Double.valueOf(String.valueOf(number2)).longValue());
                        break;
                    case 5:
                        number2 = Float.valueOf(Double.valueOf(String.valueOf(number2)).floatValue());
                        break;
                    case 6:
                        number2 = Double.valueOf(String.valueOf(number2));
                        break;
                }
            } else {
                ValueOf = number4;
                number2 = new Number[]{Integer.MAX_VALUE, (byte) 127, Short.valueOf(r0.f124964c), Integer.MAX_VALUE, Long.MAX_VALUE, Float.valueOf(Float.MAX_VALUE), Double.valueOf(Double.MAX_VALUE)}[i11];
            }
            this.f36083a = ValueOf;
            this.f36084b = number2;
            this.f36085c = number3;
            boolean z10 = ((Comparable) ValueOf).compareTo(number2) > 0;
            this.f36087e = z10;
            if (this.f36085c == null) {
                this.f36085c = Integer.valueOf(z10 ? -1 : 1);
            }
        }

        public boolean a() {
            Object obj = this.f36086d;
            if (obj == null) {
                obj = this.f36083a;
            }
            Comparable comparable = (Comparable) obj;
            if (this.f36087e) {
                return comparable.compareTo(this.f36084b) >= 0;
            }
            return comparable.compareTo(this.f36084b) <= 0;
        }

        public Number b() {
            int iByteValue;
            int iByteValue2;
            Number numberValueOf;
            if (this.f36086d == null) {
                this.f36086d = this.f36083a;
            }
            Number number = this.f36086d;
            Number number2 = this.f36085c;
            if (number2 instanceof Double) {
                numberValueOf = Double.valueOf(number.doubleValue() + this.f36085c.doubleValue());
            } else if (number2 instanceof Float) {
                numberValueOf = Float.valueOf(number.floatValue() + this.f36085c.floatValue());
            } else if (number2 instanceof Long) {
                numberValueOf = Long.valueOf(number.longValue() + this.f36085c.longValue());
            } else {
                if (number2 instanceof Integer) {
                    iByteValue = number.intValue();
                    iByteValue2 = this.f36085c.intValue();
                } else if (number2 instanceof Short) {
                    iByteValue = number.shortValue();
                    iByteValue2 = this.f36085c.shortValue();
                } else {
                    iByteValue = number.byteValue();
                    iByteValue2 = this.f36085c.byteValue();
                }
                numberValueOf = Integer.valueOf(iByteValue + iByteValue2);
            }
            this.f36086d = numberValueOf;
            return number;
        }
    }

    public ct(Number number, Number number2, Number number3) {
        this.f36082a = new a(number, number2, number3);
    }

    public a a() {
        return this.f36082a;
    }

    public boolean a(Number number) {
        return ((Comparable) this.f36082a.f36083a).compareTo(number) <= 0 && ((Comparable) this.f36082a.f36084b).compareTo(number) >= 0;
    }

    public boolean b(Number number) {
        return a(number);
    }

    public Number[] b() {
        return new Number[]{this.f36082a.f36083a, this.f36082a.f36084b};
    }
}
