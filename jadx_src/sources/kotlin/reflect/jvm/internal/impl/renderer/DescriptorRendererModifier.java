package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    @dl.d
    @xh.e
    public static final Set<DescriptorRendererModifier> ALL;

    @dl.d
    @xh.e
    public static final Set<DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS;

    @dl.d
    public static final a Companion = new a(null);
    private final boolean includeByDefault;

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    static {
        DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier.includeByDefault) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = CollectionsKt___CollectionsKt.V5(arrayList);
        ALL = ArraysKt___ArraysKt.Mz(values());
    }

    DescriptorRendererModifier(boolean z10) {
        this.includeByDefault = z10;
    }
}
