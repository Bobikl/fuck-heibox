package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.f
@kotlin.r0
public final class f<E> extends u<E, List<? extends E>, ArrayList<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d kotlinx.serialization.g<E> element) {
        super(element);
        kotlin.jvm.internal.f0.p(element, "element");
        this.f130691b = new e(element.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public List<E> q(@dl.d ArrayList<E> arrayList) {
        kotlin.jvm.internal.f0.p(arrayList, "<this>");
        return arrayList;
    }

    @Override // kotlinx.serialization.internal.t, kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return this.f130691b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> f() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(@dl.d ArrayList<E> arrayList) {
        kotlin.jvm.internal.f0.p(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(@dl.d ArrayList<E> arrayList, int i10) {
        kotlin.jvm.internal.f0.p(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.t
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(@dl.d ArrayList<E> arrayList, int i10, E e10) {
        kotlin.jvm.internal.f0.p(arrayList, "<this>");
        arrayList.add(i10, e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> p(@dl.d List<? extends E> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }
}
