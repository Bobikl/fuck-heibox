package androidx.room;

import com.huawei.hms.hmsscankit.DetailRect;
import com.umeng.analytics.pro.ak;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: compiled from: OnConflictStrategy.kt */
/* JADX INFO: loaded from: classes6.dex */
@mh.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003B\u0000¨\u0006\u0004"}, d2 = {"Landroidx/room/m0;", "", "D", ak.av, "room-common"}, k = 1, mv = {1, 7, 1})
public @interface m0 {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f27236a;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 3;
    public static final int I = 4;
    public static final int J = 5;

    /* JADX INFO: renamed from: androidx.room.m0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: OnConflictStrategy.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\b\u0010\u0004\u0012\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u000f\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Landroidx/room/m0$a;", "", "", "b", "I", "NONE", ak.aF, "REPLACE", "d", "getROLLBACK$annotations", "()V", DetailRect.SUPPORT_ROLLBACK, "e", "ABORT", "f", "getFAIL$annotations", "FAIL", "g", "IGNORE", "<init>", "room-common"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f27236a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int NONE = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int REPLACE = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int ROLLBACK = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int ABORT = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final int FAIL = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final int IGNORE = 5;

        private Companion() {
        }

        @kotlin.k(message = "Use ABORT instead.")
        public static /* synthetic */ void a() {
        }

        @kotlin.k(message = "Use ABORT instead.")
        public static /* synthetic */ void b() {
        }
    }
}
