package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.w;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.x0;
import androidx.compose.ui.modifier.m;
import androidx.compose.ui.modifier.p;
import androidx.compose.ui.n;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.o;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: KeyInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B6\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010!\u0012\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010!ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001b\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\bJ\u001b\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u001a\u001a\u0004\u0018\u00010\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R(\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010!8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010!8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u0013\u0010%R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/input/key/e;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/layout/x0;", "Landroidx/compose/ui/input/key/b;", "keyEvent", "", "g", "(Landroid/view/KeyEvent;)Z", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "n", "m", "Landroidx/compose/ui/layout/q;", "coordinates", "p", "Landroidx/compose/ui/focus/FocusModifier;", "d", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "<set-?>", "e", "Landroidx/compose/ui/input/key/e;", "()Landroidx/compose/ui/input/key/e;", "parent", "Landroidx/compose/ui/node/LayoutNode;", "f", "Landroidx/compose/ui/node/LayoutNode;", ak.av, "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lkotlin/Function1;", "onKeyEvent", "Lyh/l;", ak.aF, "()Lyh/l;", "onPreviewKeyEvent", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "value", "<init>", "(Lyh/l;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class e implements androidx.compose.ui.modifier.e, m<e>, x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final l<b, Boolean> f14618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final l<b, Boolean> f14619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private FocusModifier focusModifier;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private e parent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private LayoutNode layoutNode;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@dl.e l<? super b, Boolean> lVar, @dl.e l<? super b, Boolean> lVar2) {
        this.f14618b = lVar;
        this.f14619c = lVar2;
    }

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(l lVar) {
        return o.a(this, lVar);
    }

    @dl.e
    public final l<b, Boolean> c() {
        return this.f14618b;
    }

    @dl.e
    public final l<b, Boolean> d() {
        return this.f14619c;
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getParent() {
        return this.parent;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e getValue() {
        return this;
    }

    public final boolean g(@dl.d KeyEvent keyEvent) {
        FocusModifier focusModifierB;
        e eVarD;
        f0.p(keyEvent, "keyEvent");
        FocusModifier focusModifier = this.focusModifier;
        if (focusModifier == null || (focusModifierB = w.b(focusModifier)) == null || (eVarD = w.d(focusModifierB)) == null) {
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
        }
        if (eVarD.n(keyEvent)) {
            return true;
        }
        return eVarD.m(keyEvent);
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public p<e> getKey() {
        return KeyInputModifierKt.a();
    }

    public final boolean m(@dl.d KeyEvent keyEvent) {
        f0.p(keyEvent, "keyEvent");
        l<b, Boolean> lVar = this.f14618b;
        Boolean boolInvoke = lVar != null ? lVar.invoke(b.a(keyEvent)) : null;
        if (f0.g(boolInvoke, Boolean.TRUE)) {
            return boolInvoke.booleanValue();
        }
        e eVar = this.parent;
        if (eVar != null) {
            return eVar.m(keyEvent);
        }
        return false;
    }

    public final boolean n(@dl.d KeyEvent keyEvent) {
        f0.p(keyEvent, "keyEvent");
        e eVar = this.parent;
        Boolean boolValueOf = eVar != null ? Boolean.valueOf(eVar.n(keyEvent)) : null;
        if (f0.g(boolValueOf, Boolean.TRUE)) {
            return boolValueOf.booleanValue();
        }
        l<b, Boolean> lVar = this.f14619c;
        if (lVar != null) {
            return lVar.invoke(b.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.x0
    public void p(@dl.d q coordinates) {
        f0.p(coordinates, "coordinates");
        this.layoutNode = ((NodeCoordinator) coordinates).getLayoutNode();
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ n s0(n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(l lVar) {
        return o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.modifier.e
    public void w1(@dl.d androidx.compose.ui.modifier.n scope) {
        androidx.compose.runtime.collection.e<e> eVarA;
        androidx.compose.runtime.collection.e<e> eVarA2;
        f0.p(scope, "scope");
        FocusModifier focusModifier = this.focusModifier;
        if (focusModifier != null && (eVarA2 = focusModifier.A()) != null) {
            eVarA2.c0(this);
        }
        FocusModifier focusModifier2 = (FocusModifier) scope.a(FocusModifierKt.d());
        this.focusModifier = focusModifier2;
        if (focusModifier2 != null && (eVarA = focusModifier2.A()) != null) {
            eVarA.b(this);
        }
        this.parent = (e) scope.a(KeyInputModifierKt.a());
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return o.c(this, obj, pVar);
    }
}
