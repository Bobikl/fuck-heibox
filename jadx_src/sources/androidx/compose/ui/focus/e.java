package androidx.compose.ui.focus;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusEventModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010!¨\u0006%"}, d2 = {"Landroidx/compose/ui/focus/e;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/ui/focus/FocusModifier;", "modifiers", "Lkotlin/b2;", ak.aF, "n", "Landroidx/compose/ui/modifier/n;", "scope", "w1", "focusModifier", ak.av, "m", "g", "f", "Landroidx/compose/ui/focus/e;", "parent", "d", "Landroidx/compose/runtime/collection/e;", "children", "e", "focusModifiers", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/v;", "onFocusEvent", "Lyh/l;", "()Lyh/l;", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "()Landroidx/compose/ui/focus/e;", "value", "<init>", "(Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class e implements androidx.compose.ui.modifier.m<e>, androidx.compose.ui.modifier.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<v, b2> f13584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private e parent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<e> children;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<FocusModifier> focusModifiers;

    /* JADX INFO: compiled from: FocusEventModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13588a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f13588a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@dl.d yh.l<? super v, b2> onFocusEvent) {
        f0.p(onFocusEvent, "onFocusEvent");
        this.f13584b = onFocusEvent;
        this.children = new androidx.compose.runtime.collection.e<>(new e[16], 0);
        this.focusModifiers = new androidx.compose.runtime.collection.e<>(new FocusModifier[16], 0);
    }

    private final void c(androidx.compose.runtime.collection.e<FocusModifier> eVar) {
        androidx.compose.runtime.collection.e<FocusModifier> eVar2 = this.focusModifiers;
        eVar2.c(eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), eVar);
        e eVar3 = this.parent;
        if (eVar3 != null) {
            eVar3.c(eVar);
        }
    }

    private final void n(androidx.compose.runtime.collection.e<FocusModifier> eVar) {
        this.focusModifiers.d0(eVar);
        e eVar2 = this.parent;
        if (eVar2 != null) {
            eVar2.n(eVar);
        }
    }

    public final void a(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "focusModifier");
        this.focusModifiers.b(focusModifier);
        e eVar = this.parent;
        if (eVar != null) {
            eVar.a(focusModifier);
        }
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @dl.d
    public final yh.l<v, b2> d() {
        return this.f13584b;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e getValue() {
        return this;
    }

    public final void f() {
        if (this.focusModifiers.P()) {
            this.f13584b.invoke(FocusStateImpl.Inactive);
        }
    }

    public final void g() {
        FocusStateImpl focusState;
        Boolean bool;
        int i10 = this.focusModifiers.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 != 0) {
            int i11 = 0;
            if (i10 != 1) {
                androidx.compose.runtime.collection.e<FocusModifier> eVar = this.focusModifiers;
                int i12 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                FocusModifier focusModifier = null;
                Boolean bool2 = null;
                if (i12 > 0) {
                    FocusModifier[] focusModifierArrG = eVar.G();
                    f0.n(focusModifierArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    FocusModifier focusModifier2 = null;
                    do {
                        FocusModifier focusModifier3 = focusModifierArrG[i11];
                        switch (a.f13588a[focusModifier3.getFocusState().ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                bool2 = Boolean.FALSE;
                                focusModifier2 = focusModifier3;
                                break;
                            case 5:
                                if (bool2 == null) {
                                    bool2 = Boolean.TRUE;
                                }
                                break;
                            case 6:
                                bool2 = Boolean.FALSE;
                                break;
                        }
                        i11++;
                    } while (i11 < i12);
                    bool = bool2;
                    focusModifier = focusModifier2;
                } else {
                    bool = null;
                }
                if (focusModifier == null || (focusState = focusModifier.getFocusState()) == null) {
                    focusState = f0.g(bool, Boolean.TRUE) ? FocusStateImpl.Deactivated : FocusStateImpl.Inactive;
                }
            } else {
                focusState = this.focusModifiers.G()[0].getFocusState();
            }
        } else {
            focusState = FocusStateImpl.Inactive;
        }
        this.f13584b.invoke(focusState);
        e eVar2 = this.parent;
        if (eVar2 != null) {
            eVar2.g();
        }
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public androidx.compose.ui.modifier.p<e> getKey() {
        return FocusEventModifierKt.a();
    }

    public final void m(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "focusModifier");
        this.focusModifiers.c0(focusModifier);
        e eVar = this.parent;
        if (eVar != null) {
            eVar.m(focusModifier);
        }
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.modifier.e
    public void w1(@dl.d androidx.compose.ui.modifier.n scope) {
        f0.p(scope, "scope");
        e eVar = (e) scope.a(FocusEventModifierKt.a());
        if (!f0.g(eVar, this.parent)) {
            e eVar2 = this.parent;
            if (eVar2 != null) {
                eVar2.children.c0(this);
                eVar2.n(this.focusModifiers);
            }
            this.parent = eVar;
            if (eVar != null) {
                eVar.children.b(this);
                eVar.c(this.focusModifiers);
            }
        }
        this.parent = (e) scope.a(FocusEventModifierKt.a());
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
