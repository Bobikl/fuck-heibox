package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.t0, reason: from toString */
/* JADX INFO: compiled from: UrlAnnotation.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/t0;", "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "()Ljava/lang/String;", "url", "<init>", "(Ljava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@g
public final class UrlAnnotation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16975b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final String url;

    public UrlAnnotation(@dl.d String url) {
        kotlin.jvm.internal.f0.p(url, "url");
        this.url = url;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UrlAnnotation) && kotlin.jvm.internal.f0.g(this.url, ((UrlAnnotation) other).url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @dl.d
    public String toString() {
        return "UrlAnnotation(url=" + this.url + ')';
    }
}
