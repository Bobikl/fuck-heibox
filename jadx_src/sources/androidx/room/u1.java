package androidx.room;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RoomMasterTable.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, d2 = {"Landroidx/room/u1;", "", "", "hash", ak.av, "b", "Ljava/lang/String;", "TABLE_NAME", ak.aF, "NAME", "d", "COLUMN_ID", "e", "COLUMN_IDENTITY_HASH", "f", "DEFAULT_ID", "g", "CREATE_QUERY", RXScreenCaptureService.KEY_HEIGHT, "READ_QUERY", "<init>", "()V", "room-common"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final u1 f27271a = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String TABLE_NAME = "room_master_table";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String NAME = "room_master_table";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final String COLUMN_ID = "id";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final String COLUMN_IDENTITY_HASH = "identity_hash";

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String DEFAULT_ID = "42";

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    private u1() {
    }

    @dl.d
    @xh.m
    public static final String a(@dl.d String hash) {
        kotlin.jvm.internal.f0.p(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
