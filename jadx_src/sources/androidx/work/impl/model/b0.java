package androidx.work.impl.model;

import android.net.Uri;
import android.os.Build;
import androidx.room.j2;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WorkTypeConverters.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\n\u001a\u000b\u000fB\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0016\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u0017H\u0007¨\u0006\u001d"}, d2 = {"Landroidx/work/impl/model/b0;", "", "Landroidx/work/WorkInfo$State;", "state", "", "j", "value", "f", "Landroidx/work/BackoffPolicy;", "backoffPolicy", ak.av, ak.aF, "Landroidx/work/NetworkType;", "networkType", "g", "d", "Landroidx/work/OutOfQuotaPolicy;", ak.bo, RXScreenCaptureService.KEY_HEIGHT, "e", "", "Landroidx/work/c$c;", "triggers", "", "i", "bytes", "b", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b0 f29060a = new b0();

    /* JADX INFO: compiled from: WorkTypeConverters.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/work/impl/model/b0$a;", "", "", "b", "I", "EXPONENTIAL", ak.aF, "LINEAR", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f29061a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int EXPONENTIAL = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int LINEAR = 1;

        private a() {
        }
    }

    /* JADX INFO: compiled from: WorkTypeConverters.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0012"}, d2 = {"Landroidx/work/impl/model/b0$b;", "", "", "b", "I", "NOT_REQUIRED", ak.aF, "CONNECTED", "d", "UNMETERED", "e", "NOT_ROAMING", "f", "METERED", "g", "TEMPORARILY_UNMETERED", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final b f29064a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int NOT_REQUIRED = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int CONNECTED = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int UNMETERED = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int NOT_ROAMING = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final int METERED = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final int TEMPORARILY_UNMETERED = 5;

        private b() {
        }
    }

    /* JADX INFO: compiled from: WorkTypeConverters.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/work/impl/model/b0$c;", "", "", "b", "I", "RUN_AS_NON_EXPEDITED_WORK_REQUEST", ak.aF, "DROP_WORK_REQUEST", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final c f29071a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int DROP_WORK_REQUEST = 1;

        private c() {
        }
    }

    /* JADX INFO: compiled from: WorkTypeConverters.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/model/b0$d;", "", "", "b", "I", "ENQUEUED", ak.aF, kotlinx.coroutines.debug.internal.d.f129170b, "d", "SUCCEEDED", "e", BBSLinkObj.REVIEW_STATE_FAILED, "f", "BLOCKED", "g", "CANCELLED", "", RXScreenCaptureService.KEY_HEIGHT, "Ljava/lang/String;", "COMPLETED_STATES", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final d f29074a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int ENQUEUED = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int RUNNING = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int SUCCEEDED = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int FAILED = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final int BLOCKED = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final int CANCELLED = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final String COMPLETED_STATES = "(2, 3, 5)";

        private d() {
        }
    }

    /* JADX INFO: compiled from: WorkTypeConverters.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f29084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f29085d;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f29082a = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f29083b = iArr2;
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f29084c = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f29085d = iArr4;
        }
    }

    private b0() {
    }

    @j2
    @xh.m
    public static final int a(@dl.d BackoffPolicy backoffPolicy) {
        f0.p(backoffPolicy, "backoffPolicy");
        int i10 = e.f29083b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @j2
    @dl.d
    @xh.m
    public static final Set<androidx.work.c.C0229c> b(@dl.d byte[] bytes) {
        f0.p(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z10 = objectInputStream.readBoolean();
                        f0.o(uri, "uri");
                        linkedHashSet.add(new androidx.work.c.C0229c(uri, z10));
                    }
                    b2 b2Var = b2.f124493a;
                    kotlin.io.b.a(objectInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.b.a(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            b2 b2Var2 = b2.f124493a;
            kotlin.io.b.a(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                kotlin.io.b.a(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    @j2
    @dl.d
    @xh.m
    public static final BackoffPolicy c(int value) {
        if (value == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (value == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    @j2
    @dl.d
    @xh.m
    public static final NetworkType d(int value) {
        if (value == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (value == 1) {
            return NetworkType.CONNECTED;
        }
        if (value == 2) {
            return NetworkType.UNMETERED;
        }
        if (value == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (value == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    @j2
    @dl.d
    @xh.m
    public static final OutOfQuotaPolicy e(int value) {
        if (value == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    @j2
    @dl.d
    @xh.m
    public static final WorkInfo.State f(int value) {
        if (value == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (value == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (value == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (value == 3) {
            return WorkInfo.State.FAILED;
        }
        if (value == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (value == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    @j2
    @xh.m
    public static final int g(@dl.d NetworkType networkType) {
        f0.p(networkType, "networkType");
        int i10 = e.f29084c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @j2
    @xh.m
    public static final int h(@dl.d OutOfQuotaPolicy policy) {
        f0.p(policy, "policy");
        int i10 = e.f29085d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @j2
    @dl.d
    @xh.m
    public static final byte[] i(@dl.d Set<androidx.work.c.C0229c> triggers) {
        f0.p(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (androidx.work.c.C0229c c0229c : triggers) {
                    objectOutputStream.writeUTF(c0229c.getUri().toString());
                    objectOutputStream.writeBoolean(c0229c.getIsTriggeredForDescendants());
                }
                b2 b2Var = b2.f124493a;
                kotlin.io.b.a(objectOutputStream, null);
                kotlin.io.b.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                f0.o(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                kotlin.io.b.a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    @j2
    @xh.m
    public static final int j(@dl.d WorkInfo.State state) {
        f0.p(state, "state");
        switch (e.f29082a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
