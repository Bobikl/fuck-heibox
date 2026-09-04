package androidx.window.sidecar;

import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import xh.e;

/* JADX INFO: compiled from: FoldingFeature.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0003\u0007\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/m;", "Landroidx/window/layout/h;", "", ak.av, "()Z", "isSeparating", "Landroidx/window/layout/m$a;", "b", "()Landroidx/window/layout/m$a;", "occlusionType", "Landroidx/window/layout/m$b;", ak.aF, "()Landroidx/window/layout/m$b;", "orientation", "Landroidx/window/layout/m$c;", "getState", "()Landroidx/window/layout/m$c;", "state", "window_release"}, k = 1, mv = {1, 6, 0})
public interface m extends h {

    /* JADX INFO: compiled from: FoldingFeature.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/window/layout/m$a;", "", "", "toString", ak.av, "Ljava/lang/String;", "description", "<init>", "(Ljava/lang/String;)V", "b", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        @e
        public static final a f28636c = new a("NONE");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @d
        @e
        public static final a f28637d = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d
        private final String description;

        private a(String str) {
            this.description = str;
        }

        @d
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    /* JADX INFO: compiled from: FoldingFeature.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/window/layout/m$b;", "", "", "toString", ak.av, "Ljava/lang/String;", "description", "<init>", "(Ljava/lang/String;)V", "b", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        @e
        public static final b f28640c = new b("VERTICAL");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @d
        @e
        public static final b f28641d = new b("HORIZONTAL");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d
        private final String description;

        private b(String str) {
            this.description = str;
        }

        @d
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    /* JADX INFO: compiled from: FoldingFeature.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/window/layout/m$c;", "", "", "toString", ak.av, "Ljava/lang/String;", "description", "<init>", "(Ljava/lang/String;)V", "b", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        @e
        public static final c f28644c = new c("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @d
        @e
        public static final c f28645d = new c("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d
        private final String description;

        private c(String str) {
            this.description = str;
        }

        @d
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    boolean a();

    @d
    a b();

    @d
    b c();

    @d
    c getState();
}
