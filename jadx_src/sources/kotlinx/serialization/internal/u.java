package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public abstract class u<E, C extends Collection<? extends E>, B> extends t<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@dl.d kotlinx.serialization.g<E> element) {
        super(element, null);
        kotlin.jvm.internal.f0.p(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator<E> i(@dl.d C c10) {
        kotlin.jvm.internal.f0.p(c10, "<this>");
        return c10.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int j(@dl.d C c10) {
        kotlin.jvm.internal.f0.p(c10, "<this>");
        return c10.size();
    }
}
