package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.k0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KeyboardActionRunner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0006R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/g;", "Landroidx/compose/foundation/text/h;", "Landroidx/compose/ui/text/input/o;", "imeAction", "Lkotlin/b2;", "e", "(I)V", ak.av, "Landroidx/compose/foundation/text/i;", "Landroidx/compose/foundation/text/i;", "d", "()Landroidx/compose/foundation/text/i;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/text/i;)V", "keyboardActions", "Landroidx/compose/ui/focus/g;", "b", "Landroidx/compose/ui/focus/g;", "()Landroidx/compose/ui/focus/g;", "f", "(Landroidx/compose/ui/focus/g;)V", "focusManager", "Landroidx/compose/ui/text/input/k0;", ak.aF, "Landroidx/compose/ui/text/input/k0;", "()Landroidx/compose/ui/text/input/k0;", "g", "(Landroidx/compose/ui/text/input/k0;)V", "inputSession", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public i keyboardActions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.focus.g focusManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private k0 inputSession;

    @Override // androidx.compose.foundation.text.h
    public void a(int imeAction) {
        androidx.compose.ui.text.input.o.Companion companion = androidx.compose.ui.text.input.o.INSTANCE;
        if (androidx.compose.ui.text.input.o.l(imeAction, companion.d())) {
            b().a(androidx.compose.ui.focus.b.INSTANCE.i());
            return;
        }
        if (androidx.compose.ui.text.input.o.l(imeAction, companion.f())) {
            b().a(androidx.compose.ui.focus.b.INSTANCE.l());
            return;
        }
        if (!androidx.compose.ui.text.input.o.l(imeAction, companion.b())) {
            if (androidx.compose.ui.text.input.o.l(imeAction, companion.c()) ? true : androidx.compose.ui.text.input.o.l(imeAction, companion.g()) ? true : androidx.compose.ui.text.input.o.l(imeAction, companion.h()) ? true : androidx.compose.ui.text.input.o.l(imeAction, companion.a())) {
                return;
            }
            androidx.compose.ui.text.input.o.l(imeAction, companion.e());
        } else {
            k0 k0Var = this.inputSession;
            if (k0Var != null) {
                k0Var.c();
            }
        }
    }

    @dl.d
    public final androidx.compose.ui.focus.g b() {
        androidx.compose.ui.focus.g gVar = this.focusManager;
        if (gVar != null) {
            return gVar;
        }
        f0.S("focusManager");
        return null;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final k0 getInputSession() {
        return this.inputSession;
    }

    @dl.d
    public final i d() {
        i iVar = this.keyboardActions;
        if (iVar != null) {
            return iVar;
        }
        f0.S("keyboardActions");
        return null;
    }

    public final void e(int imeAction) {
        yh.l<h, b2> lVarG;
        androidx.compose.ui.text.input.o.Companion companion = androidx.compose.ui.text.input.o.INSTANCE;
        b2 b2Var = null;
        if (androidx.compose.ui.text.input.o.l(imeAction, companion.b())) {
            lVarG = d().b();
        } else if (androidx.compose.ui.text.input.o.l(imeAction, companion.c())) {
            lVarG = d().c();
        } else if (androidx.compose.ui.text.input.o.l(imeAction, companion.d())) {
            lVarG = d().d();
        } else if (androidx.compose.ui.text.input.o.l(imeAction, companion.f())) {
            lVarG = d().e();
        } else if (androidx.compose.ui.text.input.o.l(imeAction, companion.g())) {
            lVarG = d().f();
        } else if (androidx.compose.ui.text.input.o.l(imeAction, companion.h())) {
            lVarG = d().g();
        } else {
            if (!(androidx.compose.ui.text.input.o.l(imeAction, companion.a()) ? true : androidx.compose.ui.text.input.o.l(imeAction, companion.e()))) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            lVarG = null;
        }
        if (lVarG != null) {
            lVarG.invoke(this);
            b2Var = b2.f124493a;
        }
        if (b2Var == null) {
            a(imeAction);
        }
    }

    public final void f(@dl.d androidx.compose.ui.focus.g gVar) {
        f0.p(gVar, "<set-?>");
        this.focusManager = gVar;
    }

    public final void g(@dl.e k0 k0Var) {
        this.inputSession = k0Var;
    }

    public final void h(@dl.d i iVar) {
        f0.p(iVar, "<set-?>");
        this.keyboardActions = iVar;
    }
}
