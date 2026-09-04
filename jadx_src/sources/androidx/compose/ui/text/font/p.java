package androidx.compose.ui.text.font;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DeviceFontFamilyNameFont.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/p;", "", "", "g", "(Ljava/lang/String;)Ljava/lang/String;", "", "f", "(Ljava/lang/String;)I", "other", "", ak.aF, "(Ljava/lang/String;Ljava/lang/Object;)Z", ak.av, "Ljava/lang/String;", "e", "()Ljava/lang/String;", "name", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.g
@xh.f
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    private /* synthetic */ p(String str) {
        this.name = str;
    }

    public static final /* synthetic */ p a(String str) {
        return new p(str);
    }

    @dl.d
    public static String b(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        if (name.length() > 0) {
            return name;
        }
        throw new IllegalArgumentException("name may not be empty".toString());
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof p) && kotlin.jvm.internal.f0.g(str, ((p) obj).h());
    }

    public static final boolean d(String str, String str2) {
        return kotlin.jvm.internal.f0.g(str, str2);
    }

    public static int f(String str) {
        return str.hashCode();
    }

    public static String g(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        return c(this.name, obj);
    }

    public final /* synthetic */ String h() {
        return this.name;
    }

    public int hashCode() {
        return f(this.name);
    }

    public String toString() {
        return g(this.name);
    }
}
