package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nViewGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewGroup.kt\nandroidx/core/view/ViewGroupKt$descendants$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,175:1\n55#2,4:176\n*S KotlinDebug\n*F\n+ 1 ViewGroup.kt\nandroidx/core/view/ViewGroupKt$descendants$1\n*L\n118#1:176,4\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {119, 121}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
public final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super View>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f21306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f21307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f21308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f21309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f21310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f21311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ ViewGroup f21312i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewGroupKt$descendants$1(ViewGroup viewGroup, kotlin.coroutines.c<? super ViewGroupKt$descendants$1> cVar) {
        super(2, cVar);
        this.f21312i = viewGroup;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super View> oVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ViewGroupKt$descendants$1) create(oVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.f21312i, cVar);
        viewGroupKt$descendants$1.f21311h = obj;
        return viewGroupKt$descendants$1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008e -> B:22:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0097 -> B:24:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r11.f21310g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L28
            if (r1 != r2) goto L20
            int r1 = r11.f21309f
            int r4 = r11.f21308e
            java.lang.Object r5 = r11.f21306c
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r11.f21311h
            kotlin.sequences.o r6 = (kotlin.sequences.o) r6
            kotlin.t0.n(r12)
            r12 = r11
            goto L90
        L20:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L28:
            int r1 = r11.f21309f
            int r4 = r11.f21308e
            java.lang.Object r5 = r11.f21307d
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r6 = r11.f21306c
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r7 = r11.f21311h
            kotlin.sequences.o r7 = (kotlin.sequences.o) r7
            kotlin.t0.n(r12)
            r12 = r11
            goto L70
        L3d:
            kotlin.t0.n(r12)
            java.lang.Object r12 = r11.f21311h
            kotlin.sequences.o r12 = (kotlin.sequences.o) r12
            android.view.ViewGroup r1 = r11.f21312i
            r4 = 0
            int r5 = r1.getChildCount()
            r6 = r11
        L4c:
            if (r4 >= r5) goto L9d
            android.view.View r7 = r1.getChildAt(r4)
            java.lang.String r8 = "getChildAt(index)"
            kotlin.jvm.internal.f0.o(r7, r8)
            r6.f21311h = r12
            r6.f21306c = r1
            r6.f21307d = r7
            r6.f21308e = r4
            r6.f21309f = r5
            r6.f21310g = r3
            java.lang.Object r8 = r12.a(r7, r6)
            if (r8 != r0) goto L6a
            return r0
        L6a:
            r9 = r7
            r7 = r12
            r12 = r6
            r6 = r1
            r1 = r5
            r5 = r9
        L70:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L97
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            kotlin.sequences.m r5 = androidx.core.view.ViewGroupKt.f(r5)
            r12.f21311h = r7
            r12.f21306c = r6
            r8 = 0
            r12.f21307d = r8
            r12.f21308e = r4
            r12.f21309f = r1
            r12.f21310g = r2
            java.lang.Object r5 = r7.e(r5, r12)
            if (r5 != r0) goto L8e
            return r0
        L8e:
            r5 = r6
            r6 = r7
        L90:
            r9 = r6
            r6 = r12
            r12 = r9
            r10 = r5
            r5 = r1
            r1 = r10
            goto L9b
        L97:
            r5 = r1
            r1 = r6
            r6 = r12
            r12 = r7
        L9b:
            int r4 = r4 + r3
            goto L4c
        L9d:
            kotlin.b2 r12 = kotlin.b2.f124493a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt$descendants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
