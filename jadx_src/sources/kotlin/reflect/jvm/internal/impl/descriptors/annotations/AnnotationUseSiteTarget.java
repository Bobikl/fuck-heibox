package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AnnotationUseSiteTarget.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum AnnotationUseSiteTarget {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER(RemoteMessageConst.MessageBody.PARAM),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    @dl.d
    private final String renderName;

    AnnotationUseSiteTarget(String str) {
        this.renderName = str == null ? ti.a.f(name()) : str;
    }

    /* synthetic */ AnnotationUseSiteTarget(String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    @dl.d
    public final String getRenderName() {
        return this.renderName;
    }
}
