package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlinx.coroutines.t1;
import yh.l;

/* JADX INFO: compiled from: WhileSelect.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00020\u00032\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u0004H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lkotlinx/coroutines/selects/a;", "", "Lkotlin/b2;", "Lkotlin/t;", "builder", ak.av, "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class WhileSelectKt {
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0058
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    @kotlinx.coroutines.t1
    public static final java.lang.Object a(@dl.d yh.l<? super kotlinx.coroutines.selects.a<? super java.lang.Boolean>, kotlin.b2> r4, @dl.d kotlin.coroutines.c<? super kotlin.b2> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 r0 = (kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1) r0
            int r1 = r0.f130418d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130418d = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 r0 = new kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f130417c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f130418d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f130416b
            yh.l r4 = (yh.l) r4
            kotlin.t0.n(r5)
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.t0.n(r5)
        L38:
            r0.f130416b = r4
            r0.f130418d = r3
            kotlinx.coroutines.selects.b r5 = new kotlinx.coroutines.selects.b
            r5.<init>(r0)
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r2 = move-exception
            r5.x0(r2)
        L49:
            java.lang.Object r5 = r5.w0()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.h()
            if (r5 != r2) goto L56
            kotlin.coroutines.jvm.internal.f.c(r0)
        L56:
            if (r5 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            kotlin.b2 r4 = kotlin.b2.f124493a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.WhileSelectKt.a(yh.l, kotlin.coroutines.c):java.lang.Object");
    }

    @t1
    private static final Object b(l<? super a<? super Boolean>, b2> lVar, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        Object objW0;
        do {
            c0.e(0);
            SelectInstance selectInstance = new SelectInstance(cVar);
            try {
                lVar.invoke(selectInstance);
            } catch (Throwable th2) {
                selectInstance.x0(th2);
            }
            objW0 = selectInstance.w0();
            if (objW0 == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            c0.e(1);
        } while (((Boolean) objW0).booleanValue());
        return b2.f124493a;
    }
}
