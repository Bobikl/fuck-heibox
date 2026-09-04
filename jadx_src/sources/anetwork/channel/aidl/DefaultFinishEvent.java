package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ErrorConstant;
import anetwork.channel.statist.StatisticData;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class DefaultFinishEvent implements Parcelable, s3.e.a {
    public static final Parcelable.Creator<DefaultFinishEvent> CREATOR = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f30021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f30022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f30023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    StatisticData f30024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RequestStatistic f30025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Request f30026g;

    public DefaultFinishEvent(int i10) {
        this(i10, null, null, null);
    }

    public DefaultFinishEvent(int i10, String str, Request request) {
        this(i10, str, request, request != null ? request.f29773a : null);
    }

    private DefaultFinishEvent(int i10, String str, Request request, RequestStatistic requestStatistic) {
        this.f30024e = new StatisticData();
        this.f30022c = i10;
        this.f30023d = str == null ? ErrorConstant.getErrMsg(i10) : str;
        this.f30026g = request;
        this.f30025f = requestStatistic;
    }

    public DefaultFinishEvent(int i10, String str, RequestStatistic requestStatistic) {
        this(i10, str, null, requestStatistic);
    }

    static DefaultFinishEvent b(Parcel parcel) {
        DefaultFinishEvent defaultFinishEvent = new DefaultFinishEvent(0);
        try {
            defaultFinishEvent.f30022c = parcel.readInt();
            defaultFinishEvent.f30023d = parcel.readString();
            defaultFinishEvent.f30024e = (StatisticData) parcel.readSerializable();
        } catch (Throwable unused) {
        }
        return defaultFinishEvent;
    }

    @Override // s3.e.a
    public int a() {
        return this.f30022c;
    }

    public Object c() {
        return this.f30021b;
    }

    public void d(Object obj) {
        this.f30021b = obj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DefaultFinishEvent [code=" + this.f30022c + ", desc=" + this.f30023d + ", context=" + this.f30021b + ", statisticData=" + this.f30024e + "]";
    }

    @Override // s3.e.a
    public String w() {
        return this.f30023d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f30022c);
        parcel.writeString(this.f30023d);
        StatisticData statisticData = this.f30024e;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    @Override // s3.e.a
    public StatisticData z() {
        return this.f30024e;
    }
}
