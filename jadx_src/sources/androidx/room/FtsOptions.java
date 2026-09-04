package androidx.room;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FtsOptions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u0010"}, d2 = {"Landroidx/room/FtsOptions;", "", "", "b", "Ljava/lang/String;", "TOKENIZER_SIMPLE", ak.aF, "TOKENIZER_PORTER", "d", "TOKENIZER_ICU", "e", "TOKENIZER_UNICODE61", "<init>", "()V", "MatchInfo", "Order", "room-common"}, k = 1, mv = {1, 7, 1})
public final class FtsOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final FtsOptions f26945a = new FtsOptions();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String TOKENIZER_SIMPLE = "simple";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String TOKENIZER_PORTER = "porter";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String TOKENIZER_ICU = "icu";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @androidx.annotation.w0(21)
    public static final String TOKENIZER_UNICODE61 = "unicode61";

    /* JADX INFO: compiled from: FtsOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/FtsOptions$MatchInfo;", "", "(Ljava/lang/String;I)V", "FTS3", "FTS4", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum MatchInfo {
        FTS3,
        FTS4
    }

    /* JADX INFO: compiled from: FtsOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/FtsOptions$Order;", "", "(Ljava/lang/String;I)V", "ASC", "DESC", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Order {
        ASC,
        DESC
    }

    private FtsOptions() {
    }
}
