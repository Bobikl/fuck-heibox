package kotlin.text;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements yh.l<k, k> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Regex$findAll$2 f128533d = new Regex$findAll$2();

    Regex$findAll$2() {
        super(1, k.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // yh.l
    @dl.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final k invoke(@dl.d k p10) {
        f0.p(p10, "p0");
        return p10.next();
    }
}
