package f1;

import androidx.compose.ui.modifier.e;
import androidx.compose.ui.modifier.m;
import androidx.compose.ui.modifier.p;
import androidx.compose.ui.n;
import androidx.compose.ui.o;
import androidx.core.app.o0;
import com.umeng.analytics.pro.ak;
import dl.d;
import f1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: FocusAwareInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u0004BI\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f\u0012\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\bR%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R(\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lf1/a;", "Lf1/b;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/m;", o0.I0, "", "g", "(Lf1/b;)Z", "e", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "f", "Lkotlin/Function1;", "onEvent", "Lyh/l;", ak.av, "()Lyh/l;", "onPreEvent", ak.aF, "Landroidx/compose/ui/modifier/p;", "key", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "d", "()Lf1/a;", "value", "<init>", "(Lyh/l;Lyh/l;Landroidx/compose/ui/modifier/p;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public class a<T extends b> implements e, m<a<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final l<b, Boolean> f118734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final l<b, Boolean> f118735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final p<a<T>> f118736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private a<T> f118737e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@dl.e l<? super b, Boolean> lVar, @dl.e l<? super b, Boolean> lVar2, @d p<a<T>> key) {
        f0.p(key, "key");
        this.f118734b = lVar;
        this.f118735c = lVar2;
        this.f118736d = key;
    }

    private final boolean e(T event) {
        l<b, Boolean> lVar = this.f118734b;
        if (lVar != null && lVar.invoke(event).booleanValue()) {
            return true;
        }
        a<T> aVar = this.f118737e;
        if (aVar != null) {
            return aVar.e(event);
        }
        return false;
    }

    private final boolean g(T event) {
        a<T> aVar = this.f118737e;
        if (aVar != null && aVar.g(event)) {
            return true;
        }
        l<b, Boolean> lVar = this.f118735c;
        if (lVar != null) {
            return lVar.invoke(event).booleanValue();
        }
        return false;
    }

    @dl.e
    public final l<b, Boolean> a() {
        return this.f118734b;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(l lVar) {
        return o.a(this, lVar);
    }

    @dl.e
    public final l<b, Boolean> c() {
        return this.f118735c;
    }

    @Override // androidx.compose.ui.modifier.m
    @d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a<T> getValue() {
        return this;
    }

    public final boolean f(@d T event) {
        f0.p(event, "event");
        return g(event) || e(event);
    }

    @Override // androidx.compose.ui.modifier.m
    @d
    public p<a<T>> getKey() {
        return this.f118736d;
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
    public void w1(@d androidx.compose.ui.modifier.n scope) {
        f0.p(scope, "scope");
        this.f118737e = (a) scope.a(getKey());
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return o.c(this, obj, pVar);
    }
}
