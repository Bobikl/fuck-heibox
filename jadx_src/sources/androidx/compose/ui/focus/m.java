package androidx.compose.ui.focus;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/m;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/p;", "Lkotlin/b2;", "focusProperties", "b", "Landroidx/compose/ui/focus/k;", "Landroidx/compose/ui/focus/k;", ak.av, "()Landroidx/compose/ui/focus/k;", "modifier", "<init>", "(Landroidx/compose/ui/focus/k;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class m implements yh.l<p, b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final k modifier;

    public m(@dl.d k modifier) {
        f0.p(modifier, "modifier");
        this.modifier = modifier;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final k getModifier() {
        return this.modifier;
    }

    public void b(@dl.d p focusProperties) {
        f0.p(focusProperties, "focusProperties");
        this.modifier.I0(new i(focusProperties));
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(p pVar) {
        b(pVar);
        return b2.f124493a;
    }
}
