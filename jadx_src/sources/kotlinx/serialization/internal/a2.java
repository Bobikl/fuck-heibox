package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class a2<ElementKlass, Element extends ElementKlass> extends t<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.d<ElementKlass> f130667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130668c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(@dl.d kotlin.reflect.d<ElementKlass> kClass, @dl.d kotlinx.serialization.g<Element> eSerializer) {
        super(eSerializer, null);
        kotlin.jvm.internal.f0.p(kClass, "kClass");
        kotlin.jvm.internal.f0.p(eSerializer, "eSerializer");
        this.f130667b = kClass;
        this.f130668c = new d(eSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Element[] q(@dl.d ArrayList<Element> arrayList) {
        kotlin.jvm.internal.f0.p(arrayList, "<this>");
        return (Element[]) p1.s(arrayList, this.f130667b);
    }

    @Override // kotlinx.serialization.internal.t, kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return this.f130668c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> f() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int g(@dl.d ArrayList<Element> arrayList) {
        kotlin.jvm.internal.f0.p(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(@dl.d ArrayList<Element> arrayList, int i10) {
        kotlin.jvm.internal.f0.p(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> i(@dl.d Element[] elementArr) {
        kotlin.jvm.internal.f0.p(elementArr, "<this>");
        return kotlin.jvm.internal.h.a(elementArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int j(@dl.d Element[] elementArr) {
        kotlin.jvm.internal.f0.p(elementArr, "<this>");
        return elementArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.t
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(@dl.d ArrayList<Element> arrayList, int i10, Element element) {
        kotlin.jvm.internal.f0.p(arrayList, "<this>");
        arrayList.add(i10, element);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> p(@dl.d Element[] elementArr) {
        kotlin.jvm.internal.f0.p(elementArr, "<this>");
        return new ArrayList<>(kotlin.collections.m.t(elementArr));
    }
}
