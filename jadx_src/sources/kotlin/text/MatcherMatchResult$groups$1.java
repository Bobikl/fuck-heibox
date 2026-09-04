package kotlin.text;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection<h> implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MatcherMatchResult f128522b;

    MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f128522b = matcherMatchResult;
    }

    public /* bridge */ boolean a(h hVar) {
        return super.contains(hVar);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof h) {
            return a((h) obj);
        }
        return false;
    }

    @Override // kotlin.text.i
    @dl.e
    public h get(int i10) {
        fi.l lVarJ = RegexKt.j(this.f128522b.f(), i10);
        if (lVarJ.D().intValue() < 0) {
            return null;
        }
        String strGroup = this.f128522b.f().group(i10);
        f0.o(strGroup, "matchResult.group(index)");
        return new h(strGroup, lVarJ);
    }

    @Override // kotlin.text.j
    @dl.e
    public h get(@dl.d String name) {
        f0.p(name, "name");
        return sh.m.f139400a.c(this.f128522b.f(), name);
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
        return this.f128522b.f().groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<h> iterator() {
        return SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(CollectionsKt__CollectionsKt.F(this)), new yh.l<Integer, h>() { // from class: kotlin.text.MatcherMatchResult$groups$1$iterator$1
            {
                super(1);
            }

            @dl.e
            public final h a(int i10) {
                return this.f128523b.get(i10);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ h invoke(Integer num) {
                return a(num.intValue());
            }
        }).iterator();
    }
}
