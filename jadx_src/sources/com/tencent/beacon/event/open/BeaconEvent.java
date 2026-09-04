package com.tencent.beacon.event.open;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.event.c.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class BeaconEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f99187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f99188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EventType f99189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f99190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f99191e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f99192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f99193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EventType f99194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f99195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f99196e;

        private Builder() {
            this.f99194c = EventType.NORMAL;
            this.f99195d = true;
            this.f99196e = new HashMap();
        }

        private Builder(BeaconEvent beaconEvent) {
            this.f99194c = EventType.NORMAL;
            this.f99195d = true;
            this.f99196e = new HashMap();
            this.f99192a = beaconEvent.f99187a;
            this.f99193b = beaconEvent.f99188b;
            this.f99194c = beaconEvent.f99189c;
            this.f99195d = beaconEvent.f99190d;
            this.f99196e.putAll(beaconEvent.f99191e);
        }

        /* synthetic */ Builder(BeaconEvent beaconEvent, a aVar) {
            this(beaconEvent);
        }

        /* synthetic */ Builder(a aVar) {
            this();
        }

        public BeaconEvent build() {
            String strB = d.b(this.f99193b);
            if (TextUtils.isEmpty(this.f99192a)) {
                this.f99192a = c.d().f();
            }
            return new BeaconEvent(this.f99192a, strB, this.f99194c, this.f99195d, this.f99196e, null);
        }

        public Builder withAppKey(String str) {
            this.f99192a = str;
            return this;
        }

        public Builder withCode(String str) {
            this.f99193b = str;
            return this;
        }

        public Builder withIsSucceed(boolean z10) {
            this.f99195d = z10;
            return this;
        }

        public Builder withParams(@n0 String str, String str2) {
            this.f99196e.put(str, str2);
            return this;
        }

        public Builder withParams(Map<String, String> map) {
            if (map != null) {
                this.f99196e.putAll(map);
            }
            return this;
        }

        public Builder withType(EventType eventType) {
            this.f99194c = eventType;
            return this;
        }
    }

    private BeaconEvent(String str, String str2, EventType eventType, boolean z10, Map<String, String> map) {
        this.f99187a = str;
        this.f99188b = str2;
        this.f99189c = eventType;
        this.f99190d = z10;
        this.f99191e = map;
    }

    /* synthetic */ BeaconEvent(String str, String str2, EventType eventType, boolean z10, Map map, a aVar) {
        this(str, str2, eventType, z10, map);
    }

    public static Builder builder() {
        return new Builder((a) null);
    }

    public static Builder newBuilder(BeaconEvent beaconEvent) {
        return new Builder(beaconEvent, null);
    }

    public String getAppKey() {
        return this.f99187a;
    }

    public String getCode() {
        return this.f99188b;
    }

    public String getLogidPrefix() {
        switch (a.f99202a[this.f99189c.ordinal()]) {
            case 1:
            case 2:
                return "N";
            case 3:
            case 4:
                return "I";
            case 5:
            case 6:
                return "Y";
            default:
                return "";
        }
    }

    public Map<String, String> getParams() {
        return this.f99191e;
    }

    public EventType getType() {
        return this.f99189c;
    }

    public boolean isSucceed() {
        return this.f99190d;
    }

    public void setAppKey(String str) {
        this.f99187a = str;
    }

    public void setCode(String str) {
        this.f99188b = str;
    }

    public void setParams(Map<String, String> map) {
        this.f99191e = map;
    }

    public void setSucceed(boolean z10) {
        this.f99190d = z10;
    }

    public void setType(EventType eventType) {
        this.f99189c = eventType;
    }

    public String toString() {
        return super.toString();
    }
}
