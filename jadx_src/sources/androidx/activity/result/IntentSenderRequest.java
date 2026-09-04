package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: IntentSenderRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final IntentSender f1535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final Intent f1536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final c f1534f = new c(null);

    @dl.d
    @xh.e
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b();

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final IntentSender f1539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private Intent f1540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f1542d;

        /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IntentSenderRequest.kt */
        @mh.c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0011a {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(@dl.d PendingIntent pendingIntent) {
            f0.p(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            f0.o(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }

        public a(@dl.d IntentSender intentSender) {
            f0.p(intentSender, "intentSender");
            this.f1539a = intentSender;
        }

        @dl.d
        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f1539a, this.f1540b, this.f1541c, this.f1542d);
        }

        @dl.d
        public final a b(@dl.e Intent intent) {
            this.f1540b = intent;
            return this;
        }

        @dl.d
        public final a c(int i10, int i11) {
            this.f1542d = i10;
            this.f1541c = i11;
            return this;
        }
    }

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    public static final class b implements Parcelable.Creator<IntentSenderRequest> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(@dl.d Parcel inParcel) {
            f0.p(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(u uVar) {
            this();
        }

        public static /* synthetic */ void a() {
        }
    }

    public IntentSenderRequest(@dl.d IntentSender intentSender, @dl.e Intent intent, int i10, int i11) {
        f0.p(intentSender, "intentSender");
        this.f1535b = intentSender;
        this.f1536c = intent;
        this.f1537d = i10;
        this.f1538e = i11;
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11, int i12, u uVar) {
        this(intentSender, (i12 & 2) != 0 ? null : intent, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(@dl.d Parcel parcel) {
        f0.p(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        f0.m(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @dl.e
    public final Intent a() {
        return this.f1536c;
    }

    public final int b() {
        return this.f1537d;
    }

    public final int c() {
        return this.f1538e;
    }

    @dl.d
    public final IntentSender d() {
        return this.f1535b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@dl.d Parcel dest, int i10) {
        f0.p(dest, "dest");
        dest.writeParcelable(this.f1535b, i10);
        dest.writeParcelable(this.f1536c, i10);
        dest.writeInt(this.f1537d);
        dest.writeInt(this.f1538e);
    }
}
