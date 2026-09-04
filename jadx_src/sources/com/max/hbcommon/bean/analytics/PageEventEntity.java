package com.max.hbcommon.bean.analytics;

import androidx.room.f;
import androidx.room.k2;
import androidx.room.n0;
import androidx.room.q;
import bb.c;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.max.hbcommon.analytics.ReportLinkViewTimeWorker;
import com.max.hbcommon.analytics.i;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PageEventEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@q(tableName = ReportLinkViewTimeWorker.f66524j)
@k2({i.class})
public final class PageEventEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    @f(name = "addition")
    private final JsonObject addition;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @n0(autoGenerate = true)
    @Expose(deserialize = false)
    private int f66947id;

    @d
    @f(name = FlutterActivityLaunchConfigs.EXTRA_PATH)
    private final String path;

    @e
    private final String src;

    @e
    @f(name = "stay_duration")
    private final String stay_duration;

    @e
    @f(name = "stay_duration_ms")
    private final String stay_duration_ms;

    @d
    @f(name = "time")
    private final String time;

    @d
    @f(name = "type")
    private final String type;

    public PageEventEntity(int i10, @d String path, @d String time, @d String type, @e String str, @e String str2, @e String str3, @e JsonObject jsonObject) {
        f0.p(path, "path");
        f0.p(time, "time");
        f0.p(type, "type");
        this.f66947id = i10;
        this.path = path;
        this.time = time;
        this.type = type;
        this.stay_duration = str;
        this.stay_duration_ms = str2;
        this.src = str3;
        this.addition = jsonObject;
    }

    public /* synthetic */ PageEventEntity(int i10, String str, String str2, String str3, String str4, String str5, String str6, JsonObject jsonObject, int i11, u uVar) {
        this((i11 & 1) != 0 ? 0 : i10, str, str2, str3, str4, str5, str6, jsonObject);
    }

    public static /* synthetic */ PageEventEntity copy$default(PageEventEntity pageEventEntity, int i10, String str, String str2, String str3, String str4, String str5, String str6, JsonObject jsonObject, int i11, Object obj) {
        int i12 = i10;
        Object[] objArr = {pageEventEntity, new Integer(i12), str, str2, str3, str4, str5, str6, jsonObject, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.d.Y4, new Class[]{PageEventEntity.class, cls, String.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class, cls, Object.class}, PageEventEntity.class);
        if (patchProxyResultProxy.isSupported) {
            return (PageEventEntity) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            i12 = pageEventEntity.f66947id;
        }
        return pageEventEntity.copy(i12, (i11 & 2) != 0 ? pageEventEntity.path : str, (i11 & 4) != 0 ? pageEventEntity.time : str2, (i11 & 8) != 0 ? pageEventEntity.type : str3, (i11 & 16) != 0 ? pageEventEntity.stay_duration : str4, (i11 & 32) != 0 ? pageEventEntity.stay_duration_ms : str5, (i11 & 64) != 0 ? pageEventEntity.src : str6, (i11 & 128) != 0 ? pageEventEntity.addition : jsonObject);
    }

    public final int component1() {
        return this.f66947id;
    }

    @d
    public final String component2() {
        return this.path;
    }

    @d
    public final String component3() {
        return this.time;
    }

    @d
    public final String component4() {
        return this.type;
    }

    @e
    public final String component5() {
        return this.stay_duration;
    }

    @e
    public final String component6() {
        return this.stay_duration_ms;
    }

    @e
    public final String component7() {
        return this.src;
    }

    @e
    public final JsonObject component8() {
        return this.addition;
    }

    @d
    public final PageEventEntity copy(int i10, @d String path, @d String time, @d String type, @e String str, @e String str2, @e String str3, @e JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), path, time, type, str, str2, str3, jsonObject}, this, changeQuickRedirect, false, c.d.X4, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class}, PageEventEntity.class);
        if (patchProxyResultProxy.isSupported) {
            return (PageEventEntity) patchProxyResultProxy.result;
        }
        f0.p(path, "path");
        f0.p(time, "time");
        f0.p(type, "type");
        return new PageEventEntity(i10, path, time, type, str, str2, str3, jsonObject);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.f31109a5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageEventEntity)) {
            return false;
        }
        PageEventEntity pageEventEntity = (PageEventEntity) obj;
        return this.f66947id == pageEventEntity.f66947id && f0.g(this.path, pageEventEntity.path) && f0.g(this.time, pageEventEntity.time) && f0.g(this.type, pageEventEntity.type) && f0.g(this.stay_duration, pageEventEntity.stay_duration) && f0.g(this.stay_duration_ms, pageEventEntity.stay_duration_ms) && f0.g(this.src, pageEventEntity.src) && f0.g(this.addition, pageEventEntity.addition);
    }

    @e
    public final JsonObject getAddition() {
        return this.addition;
    }

    public final int getId() {
        return this.f66947id;
    }

    @d
    public final String getPath() {
        return this.path;
    }

    @e
    public final String getSrc() {
        return this.src;
    }

    @e
    public final String getStay_duration() {
        return this.stay_duration;
    }

    @e
    public final String getStay_duration_ms() {
        return this.stay_duration_ms;
    }

    @d
    public final String getTime() {
        return this.time;
    }

    @d
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Z4, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((((((this.f66947id * 31) + this.path.hashCode()) * 31) + this.time.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str = this.stay_duration;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stay_duration_ms;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.src;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        JsonObject jsonObject = this.addition;
        return iHashCode4 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public final void setId(int i10) {
        this.f66947id = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.W4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PageEventEntity(path='" + this.path + "', time='" + this.time + "', type='" + this.type + "', stay_duration=" + this.stay_duration + ", stay_duration_ms=" + this.stay_duration_ms + ", src=" + this.src + ", addition=" + this.addition + ')';
    }
}
