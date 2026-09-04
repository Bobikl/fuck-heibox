package androidx.lifecycle;

import androidx.lifecycle.w0;

/* JADX INFO: compiled from: ViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewModelLazy<VM extends w0> implements kotlin.z<VM> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.d<VM> f24140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.a<b1> f24141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.a<y0.b> f24142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.a<u2.a> f24143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private VM f24144f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public ViewModelLazy(@dl.d kotlin.reflect.d<VM> viewModelClass, @dl.d yh.a<? extends b1> storeProducer, @dl.d yh.a<? extends y0.b> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        kotlin.jvm.internal.f0.p(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.f0.p(storeProducer, "storeProducer");
        kotlin.jvm.internal.f0.p(factoryProducer, "factoryProducer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @xh.i
    public ViewModelLazy(@dl.d kotlin.reflect.d<VM> viewModelClass, @dl.d yh.a<? extends b1> storeProducer, @dl.d yh.a<? extends y0.b> factoryProducer, @dl.d yh.a<? extends u2.a> extrasProducer) {
        kotlin.jvm.internal.f0.p(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.f0.p(storeProducer, "storeProducer");
        kotlin.jvm.internal.f0.p(factoryProducer, "factoryProducer");
        kotlin.jvm.internal.f0.p(extrasProducer, "extrasProducer");
        this.f24140b = viewModelClass;
        this.f24141c = storeProducer;
        this.f24142d = factoryProducer;
        this.f24143e = extrasProducer;
    }

    public /* synthetic */ ViewModelLazy(kotlin.reflect.d dVar, yh.a aVar, yh.a aVar2, yh.a aVar3, int i10, kotlin.jvm.internal.u uVar) {
        this(dVar, aVar, aVar2, (i10 & 8) != 0 ? new yh.a<u2.a.C1270a>() { // from class: androidx.lifecycle.ViewModelLazy.1
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final u2.a.C1270a invoke() {
                return u2.a.C1270a.f140743b;
            }
        } : aVar3);
    }

    @Override // kotlin.z
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm = this.f24144f;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new y0(this.f24141c.invoke(), this.f24142d.invoke(), this.f24143e.invoke()).a(xh.a.e(this.f24140b));
        this.f24144f = vm2;
        return vm2;
    }

    @Override // kotlin.z
    public boolean l() {
        return this.f24144f != null;
    }
}
