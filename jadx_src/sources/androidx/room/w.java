package androidx.room;

import com.umeng.analytics.pro.ak;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: compiled from: ForeignKey.kt */
/* JADX INFO: loaded from: classes6.dex */
@Target({})
@mh.c(AnnotationRetention.BINARY)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\u0002\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013BF\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000eR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0011\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8\u0007¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/room/w;", "", "Lkotlin/reflect/d;", "entity", "()Ljava/lang/Class;", "", "", "parentColumns", "()[Ljava/lang/String;", "childColumns", "", "onDelete", "()I", "onUpdate", "", "deferred", "()Z", "x", ak.av, "b", "room-common"}, k = 1, mv = {1, 7, 1})
@Retention(RetentionPolicy.CLASS)
@mh.d(allowedTargets = {})
public @interface w {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f27335a;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f27333y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f27334z = 2;

    /* JADX INFO: compiled from: ForeignKey.kt */
    @mh.c(AnnotationRetention.BINARY)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/w$a;", "", "room-common"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* JADX INFO: renamed from: androidx.room.w$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ForeignKey.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u0010"}, d2 = {"Landroidx/room/w$b;", "", "", "b", "I", "NO_ACTION", ak.aF, "RESTRICT", "d", "SET_NULL", "e", "SET_DEFAULT", "f", "CASCADE", "<init>", "()V", "room-common"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f27335a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int NO_ACTION = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int RESTRICT = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int SET_NULL = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int SET_DEFAULT = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final int CASCADE = 5;

        private Companion() {
        }
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @a
    int onDelete() default 1;

    @a
    int onUpdate() default 1;

    String[] parentColumns();
}
