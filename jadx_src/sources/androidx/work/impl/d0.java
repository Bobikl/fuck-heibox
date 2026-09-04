package androidx.work.impl;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b$\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004¨\u0006&"}, d2 = {"Landroidx/work/impl/d0;", "", "", "b", "I", "VERSION_1", ak.aF, "VERSION_2", "d", "VERSION_3", "e", "VERSION_4", "f", "VERSION_5", "g", "VERSION_6", RXScreenCaptureService.KEY_HEIGHT, "VERSION_7", "i", "VERSION_8", "j", "VERSION_9", "k", "VERSION_10", "l", "VERSION_11", "m", "VERSION_12", "n", "VERSION_13", "o", "VERSION_14", "p", "VERSION_15", "q", "VERSION_16", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d0 f28949a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_1 = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_2 = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_3 = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_4 = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_5 = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_6 = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_7 = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_8 = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_9 = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_10 = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_11 = 11;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_12 = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_13 = 13;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_14 = 14;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_15 = 15;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final int VERSION_16 = 16;

    private d0() {
    }
}
