package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface b {

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class a {
        public static boolean a(@dl.d b bVar) {
            return bVar.e().getIncludeAnnotationArguments();
        }

        public static boolean b(@dl.d b bVar) {
            return bVar.e().getIncludeEmptyAnnotationArguments();
        }
    }

    void a(@dl.d ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    boolean b();

    @dl.d
    Set<kotlin.reflect.jvm.internal.impl.name.c> c();

    boolean d();

    @dl.d
    AnnotationArgumentsRenderingPolicy e();

    void f(@dl.d Set<kotlin.reflect.jvm.internal.impl.name.c> set);

    void g(@dl.d Set<? extends DescriptorRendererModifier> set);

    void h(boolean z10);

    void i(boolean z10);

    void j(boolean z10);

    void k(boolean z10);

    void l(boolean z10);

    void m(boolean z10);

    void n(boolean z10);

    void o(@dl.d RenderingFormat renderingFormat);

    void p(@dl.d AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    void q(@dl.d kotlin.reflect.jvm.internal.impl.renderer.a aVar);

    void r(boolean z10);
}
