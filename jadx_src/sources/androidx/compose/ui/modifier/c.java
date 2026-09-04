package androidx.compose.ui.modifier;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/modifier/c;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/Function0;", "defaultFactory", "Lyh/a;", ak.av, "()Lyh/a;", "<init>", "(Lyh/a;)V", "Landroidx/compose/ui/modifier/p;", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.a<T> f15064a;

    /* JADX WARN: Multi-variable type inference failed */
    private c(yh.a<? extends T> aVar) {
        this.f15064a = aVar;
    }

    public /* synthetic */ c(yh.a aVar, u uVar) {
        this(aVar);
    }

    @dl.d
    public final yh.a<T> a() {
        return this.f15064a;
    }
}
