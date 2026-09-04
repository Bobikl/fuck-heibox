package androidx.compose.foundation.text;

import androidx.compose.runtime.m0;
import androidx.compose.ui.text.Placeholder;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: InlineTextContent.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0003\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/a;", "", "Landroidx/compose/ui/text/w;", ak.av, "Landroidx/compose/ui/text/w;", "b", "()Landroidx/compose/ui/text/w;", "placeholder", "Lkotlin/Function1;", "", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "children", "Lyh/q;", "()Lyh/q;", "<init>", "(Landroidx/compose/ui/text/w;Lyh/q;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Placeholder placeholder;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.q<String, androidx.compose.runtime.p, Integer, b2> f8052b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@dl.d Placeholder placeholder, @dl.d yh.q<? super String, ? super androidx.compose.runtime.p, ? super Integer, b2> children) {
        f0.p(placeholder, "placeholder");
        f0.p(children, "children");
        this.placeholder = placeholder;
        this.f8052b = children;
    }

    @dl.d
    public final yh.q<String, androidx.compose.runtime.p, Integer, b2> a() {
        return this.f8052b;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
