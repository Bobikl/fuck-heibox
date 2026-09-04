package androidx.activity.compose;

import androidx.activity.m;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ReportDrawnComposition implements yh.a<b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final m f1442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.a<Boolean> f1443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final SnapshotStateObserver f1444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final l<yh.a<Boolean>, b2> f1445e;

    public ReportDrawnComposition(@dl.d m fullyDrawnReporter, @dl.d yh.a<Boolean> predicate) {
        f0.p(fullyDrawnReporter, "fullyDrawnReporter");
        f0.p(predicate, "predicate");
        this.f1442b = fullyDrawnReporter;
        this.f1443c = predicate;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new l<yh.a<? extends b2>, b2>() { // from class: androidx.activity.compose.ReportDrawnComposition$snapshotStateObserver$1
            public final void a(@dl.d yh.a<b2> command) {
                f0.p(command, "command");
                command.invoke();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(yh.a<? extends b2> aVar) {
                a(aVar);
                return b2.f124493a;
            }
        });
        snapshotStateObserver.m();
        this.f1444d = snapshotStateObserver;
        this.f1445e = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.b(this);
        if (fullyDrawnReporter.e()) {
            return;
        }
        fullyDrawnReporter.c();
        c(predicate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(final yh.a<Boolean> aVar) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.f1444d.l(aVar, this.f1445e, new yh.a<b2>() { // from class: androidx.activity.compose.ReportDrawnComposition$observeReporter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                booleanRef.f124884b = aVar.invoke().booleanValue();
            }
        });
        if (booleanRef.f124884b) {
            d();
        }
    }

    public void b() {
        this.f1444d.f();
        this.f1444d.n();
    }

    public final void d() {
        this.f1444d.g(this.f1443c);
        if (!this.f1442b.e()) {
            this.f1442b.h();
        }
        b();
    }

    @Override // yh.a
    public /* bridge */ /* synthetic */ b2 invoke() {
        b();
        return b2.f124493a;
    }
}
