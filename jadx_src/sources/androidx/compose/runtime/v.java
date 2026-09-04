package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H!¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0011\u001a\u00028\u00008Ç\u0002¢\u0006\f\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\b\u0010\u000f\u0082\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/v;", androidx.exifinterface.media.a.f23244d5, "", "value", "Landroidx/compose/runtime/m2;", "e", "(Ljava/lang/Object;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/u0;", ak.av, "Landroidx/compose/runtime/u0;", ak.aF, "()Landroidx/compose/runtime/u0;", "getDefaultValueHolder$runtime_release$annotations", "()V", "defaultValueHolder", "(Landroidx/compose/runtime/p;I)Ljava/lang/Object;", "getCurrent$annotations", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lyh/a;)V", "Landroidx/compose/runtime/j1;", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final u0<T> defaultValueHolder;

    private v(yh.a<? extends T> aVar) {
        this.defaultValueHolder = new u0<>(aVar);
    }

    public /* synthetic */ v(yh.a aVar, kotlin.jvm.internal.u uVar) {
        this(aVar);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    @m1
    @xh.h(name = "getCurrent")
    @h
    public final T a(@dl.e p pVar, int i10) {
        return (T) pVar.K(this);
    }

    @dl.d
    public final u0<T> c() {
        return this.defaultValueHolder;
    }

    @dl.d
    @h
    public abstract m2<T> e(T t10, @dl.e p pVar, int i10);
}
