package androidx.compose.ui.focus;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.b1;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a\u0014\u0010\t\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0000\u001a\f\u0010\n\u001a\u00020\u0003*\u00020\u0002H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0003*\u00020\u0007H\u0000\"\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/p;", "Lkotlin/b2;", "Lkotlin/t;", "scope", "b", "Landroidx/compose/ui/focus/FocusModifier;", "properties", "e", ak.av, "d", "Landroidx/compose/ui/modifier/p;", "Landroidx/compose/ui/focus/q;", "Landroidx/compose/ui/modifier/p;", ak.aF, "()Landroidx/compose/ui/modifier/p;", "ModifierLocalFocusProperties", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class FocusPropertiesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.modifier.p<q> f13537a = androidx.compose.ui.modifier.g.a(new yh.a<q>() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$ModifierLocalFocusProperties$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return null;
        }
    });

    public static final void a(@dl.d p pVar) {
        f0.p(pVar, "<this>");
        pVar.L(true);
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        pVar.X(companion.d());
        pVar.Q(companion.d());
        pVar.J(companion.d());
        pVar.M(companion.d());
        pVar.U(companion.d());
        pVar.V(companion.d());
        pVar.O(companion.d());
        pVar.T(companion.d());
        pVar.N(new yh.l<b, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$clear$1
            @dl.d
            public final FocusRequester a(int i10) {
                return FocusRequester.INSTANCE.d();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ FocusRequester invoke(b bVar) {
                return a(bVar.getValue());
            }
        });
        pVar.R(new yh.l<b, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$clear$2
            @dl.d
            public final FocusRequester a(int i10) {
                return FocusRequester.INSTANCE.d();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ FocusRequester invoke(b bVar) {
                return a(bVar.getValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super p, b2> scope) {
        f0.p(nVar, "<this>");
        f0.p(scope, "scope");
        return nVar.s0(new q(scope, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$focusProperties$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("focusProperties");
                x0Var.getProperties().c("scope", scope);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @dl.d
    public static final androidx.compose.ui.modifier.p<q> c() {
        return f13537a;
    }

    public static final void d(@dl.d final FocusModifier focusModifier) {
        OwnerSnapshotObserver snapshotObserver;
        f0.p(focusModifier, "<this>");
        NodeCoordinator coordinator = focusModifier.getCoordinator();
        if (coordinator == null) {
            return;
        }
        a(focusModifier.getFocusProperties());
        b1 owner = coordinator.getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.i(focusModifier, FocusModifier.INSTANCE.a(), new yh.a<b2>() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$refreshFocusProperties$1
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    q focusPropertiesModifier = focusModifier.getFocusPropertiesModifier();
                    if (focusPropertiesModifier != null) {
                        focusPropertiesModifier.f(focusModifier.getFocusProperties());
                    }
                }
            });
        }
        e(focusModifier, focusModifier.getFocusProperties());
    }

    public static final void e(@dl.d FocusModifier focusModifier, @dl.d p properties) {
        f0.p(focusModifier, "<this>");
        f0.p(properties, "properties");
        if (properties.getCanFocus()) {
            FocusTransactionsKt.a(focusModifier);
        } else {
            FocusTransactionsKt.f(focusModifier);
        }
    }
}
