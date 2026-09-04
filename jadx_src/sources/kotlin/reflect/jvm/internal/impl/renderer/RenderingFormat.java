package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.f0;
import kotlin.text.u;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum RenderingFormat {
    PLAIN { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @dl.d
        public String escape(@dl.d String string) {
            f0.p(string, "string");
            return string;
        }
    },
    HTML { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @dl.d
        public String escape(@dl.d String string) {
            f0.p(string, "string");
            return u.l2(u.l2(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    /* synthetic */ RenderingFormat(kotlin.jvm.internal.u uVar) {
        this();
    }

    @dl.d
    public abstract String escape(@dl.d String str);
}
