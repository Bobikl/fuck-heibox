package kotlin.reflect.jvm.internal.impl.load.java;

import org.apache.tools.ant.taskdefs.z0;

/* JADX INFO: compiled from: ReportLevel.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum ReportLevel {
    IGNORE(z0.b.f136024i),
    WARN("warn"),
    STRICT("strict");


    @dl.d
    public static final a Companion = new a(null);

    @dl.d
    private final String description;

    /* JADX INFO: compiled from: ReportLevel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    ReportLevel(String str) {
        this.description = str;
    }

    @dl.d
    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
