package androidx.compose.ui.focus;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B \u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R(\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/p;", "Lkotlin/b2;", "focusProperties", "b", "Landroidx/compose/ui/focus/i;", "Lkotlin/t;", "focusOrderReceiver", "Lyh/l;", ak.av, "()Lyh/l;", "<init>", "(Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class n implements yh.l<p, b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<i, b2> f13594b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@dl.d yh.l<? super i, b2> focusOrderReceiver) {
        f0.p(focusOrderReceiver, "focusOrderReceiver");
        this.f13594b = focusOrderReceiver;
    }

    @dl.d
    public final yh.l<i, b2> a() {
        return this.f13594b;
    }

    public void b(@dl.d p focusProperties) {
        f0.p(focusProperties, "focusProperties");
        this.f13594b.invoke(new i(focusProperties));
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(p pVar) {
        b(pVar);
        return b2.f124493a;
    }
}
