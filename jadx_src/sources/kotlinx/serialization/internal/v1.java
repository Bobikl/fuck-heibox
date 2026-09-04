package kotlinx.serialization.internal;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v1 extends z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f130773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(@dl.d kotlinx.serialization.descriptors.f primitive) {
        super(primitive, null);
        kotlin.jvm.internal.f0.p(primitive, "primitive");
        this.f130773c = primitive.j() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public String j() {
        return this.f130773c;
    }
}
