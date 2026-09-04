package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", i = {0}, l = {bb.c.b.N2}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
public final class AndroidPopup_androidKt$Popup$5 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f17138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f17139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PopupLayout f17140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$5(PopupLayout popupLayout, kotlin.coroutines.c<? super AndroidPopup_androidKt$Popup$5> cVar) {
        super(2, cVar);
        this.f17140d = popupLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.f17140d, cVar);
        androidPopup_androidKt$Popup$5.f17139c = obj;
        return androidPopup_androidKt$Popup$5;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((AndroidPopup_androidKt$Popup$5) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r4.f17138b
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r4.f17139c
            kotlinx.coroutines.q0 r1 = (kotlinx.coroutines.q0) r1
            kotlin.t0.n(r5)
            r5 = r4
            goto L38
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1c:
            kotlin.t0.n(r5)
            java.lang.Object r5 = r4.f17139c
            kotlinx.coroutines.q0 r5 = (kotlinx.coroutines.q0) r5
            r1 = r5
            r5 = r4
        L25:
            boolean r3 = kotlinx.coroutines.r0.k(r1)
            if (r3 == 0) goto L3e
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r3 = new yh.l<java.lang.Long, kotlin.b2>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.1
                static {
                    /*
                        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1) androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.1.b androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.<init>():void");
                }

                public final void a(long r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.a(long):void");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(java.lang.Long r3) {
                    /*
                        r2 = this;
                        java.lang.Number r3 = (java.lang.Number) r3
                        long r0 = r3.longValue()
                        r2.a(r0)
                        kotlin.b2 r3 = kotlin.b2.f124493a
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r5.f17139c = r1
            r5.f17138b = r2
            java.lang.Object r3 = androidx.compose.ui.platform.InfiniteAnimationPolicyKt.a(r3, r5)
            if (r3 != r0) goto L38
            return r0
        L38:
            androidx.compose.ui.window.PopupLayout r3 = r5.f17140d
            r3.o()
            goto L25
        L3e:
            kotlin.b2 r5 = kotlin.b2.f124493a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
