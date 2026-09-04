package androidx.compose.ui.focus;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J%\u0010\b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "Lkotlin/b2;", "g", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusModifier;", "", "onFound", "f", "(Lyh/l;)Ljava/lang/Boolean;", ak.aF, "d", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/ui/focus/u;", ak.av, "Landroidx/compose/runtime/collection/e;", "e", "()Landroidx/compose/runtime/collection/e;", "focusRequesterModifierLocals", "<init>", "()V", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class FocusRequester {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13544c = androidx.compose.runtime.collection.e.f12643e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final FocusRequester f13545d = new FocusRequester();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final FocusRequester f13546e = new FocusRequester();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<u> focusRequesterModifierLocals = new androidx.compose.runtime.collection.e<>(new u[16], 0);

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusRequester$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FocusRequester.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\r\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0006\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$a;", "", "Landroidx/compose/ui/focus/FocusRequester$a$a;", ak.av, "Landroidx/compose/ui/focus/FocusRequester;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "Landroidx/compose/ui/focus/FocusRequester;", "d", "()Landroidx/compose/ui/focus/FocusRequester;", "Cancel", "b", "getCancel$annotations", "()V", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusRequester$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FocusRequester.kt */
        @androidx.compose.ui.g
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0004\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\t\u0010\b\u001a\u00020\u0002H\u0086\u0002J\t\u0010\t\u001a\u00020\u0002H\u0086\u0002J\t\u0010\n\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0002H\u0086\u0002J\t\u0010\f\u001a\u00020\u0002H\u0086\u0002J\t\u0010\r\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0002H\u0086\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$a$a;", "", "Landroidx/compose/ui/focus/FocusRequester;", ak.av, "i", "j", "k", "l", "m", "n", "o", "p", "b", ak.aF, "d", "e", "f", "g", RXScreenCaptureService.KEY_HEIGHT, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
        @androidx.compose.runtime.internal.o(parameters = 0)
        public static final class C0080a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            public static final C0080a f13548a = new C0080a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f13549b = 0;

            private C0080a() {
            }

            @dl.d
            public final FocusRequester a() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester b() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester c() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester d() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester e() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester f() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester g() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester h() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester i() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester j() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester k() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester l() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester m() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester n() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester o() {
                return new FocusRequester();
            }

            @dl.d
            public final FocusRequester p() {
                return new FocusRequester();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @androidx.compose.ui.g
        public static /* synthetic */ void c() {
        }

        @androidx.compose.ui.g
        @dl.d
        public final C0080a a() {
            return C0080a.f13548a;
        }

        @androidx.compose.ui.g
        @dl.d
        public final FocusRequester b() {
            return FocusRequester.f13546e;
        }

        @dl.d
        public final FocusRequester d() {
            return FocusRequester.f13545d;
        }
    }

    public final boolean c() {
        if (!this.focusRequesterModifierLocals.Q()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        androidx.compose.runtime.collection.e<u> eVar = this.focusRequesterModifierLocals;
        int iK = eVar.getSize();
        int i10 = 0;
        if (iK <= 0) {
            return false;
        }
        u[] uVarArrG = eVar.G();
        f0.n(uVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        boolean z10 = false;
        do {
            FocusModifier focusModifierD = uVarArrG[i10].d();
            if (focusModifierD != null && FocusTransactionsKt.b(focusModifierD)) {
                z10 = true;
            }
            i10++;
        } while (i10 < iK);
        return z10;
    }

    public final boolean d() {
        if (!this.focusRequesterModifierLocals.Q()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        androidx.compose.runtime.collection.e<u> eVar = this.focusRequesterModifierLocals;
        int iK = eVar.getSize();
        int i10 = 0;
        if (iK <= 0) {
            return false;
        }
        u[] uVarArrG = eVar.G();
        f0.n(uVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        boolean z10 = false;
        do {
            FocusModifier focusModifierD = uVarArrG[i10].d();
            if (focusModifierD != null && FocusTransactionsKt.g(focusModifierD)) {
                z10 = true;
            }
            i10++;
        } while (i10 < iK);
        return z10;
    }

    @dl.d
    public final androidx.compose.runtime.collection.e<u> e() {
        return this.focusRequesterModifierLocals;
    }

    @dl.e
    public final Boolean f(@dl.d yh.l<? super FocusModifier, Boolean> onFound) {
        f0.p(onFound, "onFound");
        if (f0.g(this, f13546e)) {
            return Boolean.FALSE;
        }
        if (f0.g(this, f13545d)) {
            return null;
        }
        androidx.compose.runtime.collection.e<u> eVar = this.focusRequesterModifierLocals;
        int iK = eVar.getSize();
        boolean z10 = false;
        if (iK > 0) {
            u[] uVarArrG = eVar.G();
            f0.n(uVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i10 = 0;
            boolean z11 = false;
            do {
                FocusModifier focusModifierD = uVarArrG[i10].d();
                if (focusModifierD != null) {
                    z11 = onFound.invoke(focusModifierD).booleanValue() || z11;
                }
                i10++;
            } while (i10 < iK);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }

    public final void g() {
        if (!this.focusRequesterModifierLocals.Q()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        f(new yh.l<FocusModifier, Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester$requestFocus$2
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d FocusModifier it) {
                f0.p(it, "it");
                FocusTransactionsKt.j(it);
                return Boolean.TRUE;
            }
        });
    }
}
