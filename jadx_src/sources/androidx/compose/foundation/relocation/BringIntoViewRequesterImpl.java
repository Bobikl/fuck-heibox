package androidx.compose.foundation.relocation;

import androidx.compose.foundation.t;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@t
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/e;", "Lb1/i;", "rect", "Lkotlin/b2;", ak.av, "(Lb1/i;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterModifier;", "Landroidx/compose/runtime/collection/e;", "b", "()Landroidx/compose/runtime/collection/e;", "modifiers", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class BringIntoViewRequesterImpl implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<BringIntoViewRequesterModifier> modifiers = new androidx.compose.runtime.collection.e<>(new BringIntoViewRequesterModifier[16], 0);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r8 >= r2) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0069 -> B:20:0x006c). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.e
    @dl.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@dl.e b1.i r8, @dl.d kotlin.coroutines.c<? super kotlin.b2> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.f7463h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7463h = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f7461f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f7463h
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f7460e
            int r2 = r0.f7459d
            java.lang.Object r4 = r0.f7458c
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f7457b
            b1.i r5 = (b1.i) r5
            kotlin.t0.n(r9)
            r9 = r5
            goto L6c
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.t0.n(r9)
            androidx.compose.runtime.collection.e<androidx.compose.foundation.relocation.BringIntoViewRequesterModifier> r9 = r7.modifiers
            int r2 = r9.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()
            if (r2 <= 0) goto L6f
            r4 = 0
            java.lang.Object[] r9 = r9.G()
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            kotlin.jvm.internal.f0.n(r9, r5)
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L57:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.BringIntoViewRequesterModifier r5 = (androidx.compose.foundation.relocation.BringIntoViewRequesterModifier) r5
            r0.f7457b = r9
            r0.f7458c = r4
            r0.f7459d = r2
            r0.f7460e = r8
            r0.f7463h = r3
            java.lang.Object r5 = r5.e(r9, r0)
            if (r5 != r1) goto L6c
            return r1
        L6c:
            int r8 = r8 + r3
            if (r8 < r2) goto L57
        L6f:
            kotlin.b2 r8 = kotlin.b2.f124493a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.a(b1.i, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.d
    public final androidx.compose.runtime.collection.e<BringIntoViewRequesterModifier> b() {
        return this.modifiers;
    }
}
