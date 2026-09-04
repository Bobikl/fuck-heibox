package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import zj.w;
import zj.x;

/* JADX INFO: compiled from: PointcutBasedPerClauseImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends l implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f137651b;

    /* JADX INFO: compiled from: PointcutBasedPerClauseImpl.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137652a;

        static {
            int[] iArr = new int[PerClauseKind.values().length];
            f137652a = iArr;
            try {
                iArr[PerClauseKind.PERCFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137652a[PerClauseKind.PERCFLOWBELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137652a[PerClauseKind.PERTARGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137652a[PerClauseKind.PERTHIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public m(PerClauseKind perClauseKind, String str) {
        super(perClauseKind);
        this.f137651b = new n(str);
    }

    @Override // zj.w
    public x d() {
        return this.f137651b;
    }

    @Override // org.aspectj.internal.lang.reflect.l
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = a.f137652a[b().ordinal()];
        if (i10 == 1) {
            stringBuffer.append("percflow(");
        } else if (i10 == 2) {
            stringBuffer.append("percflowbelow(");
        } else if (i10 == 3) {
            stringBuffer.append("pertarget(");
        } else if (i10 == 4) {
            stringBuffer.append("perthis(");
        }
        stringBuffer.append(this.f137651b.a());
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
