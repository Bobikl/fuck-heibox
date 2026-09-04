package com.jd.jdcache.entity;

import android.text.TextUtils;
import androidx.annotation.Keep;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.random.Random;

/* JADX INFO: compiled from: JDCacheModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class JDCacheModule {

    @d
    public static final a Companion = new a(null);
    public static final short URL_TYPE_NORMAL = 1;
    public static final short URL_TYPE_REGEXP = 2;

    @d
    private String configId;
    private long createTime;

    @e
    private String url;
    private short urlType;

    /* JADX INFO: compiled from: JDCacheModule.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            sb2.append('-');
            sb2.append(Random.f125033b.n(100, 1000));
            return sb2.toString();
        }
    }

    public JDCacheModule() {
        this(null, null, (short) 0, 0L, 15, null);
    }

    public JDCacheModule(@d String configId, @e String str, short s10, long j10) {
        f0.p(configId, "configId");
        this.configId = configId;
        this.url = str;
        this.urlType = s10;
        this.createTime = j10;
    }

    public /* synthetic */ JDCacheModule(String str, String str2, short s10, long j10, int i10, u uVar) {
        this((i10 & 1) != 0 ? Companion.b() : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? (short) 1 : s10, (i10 & 8) != 0 ? System.currentTimeMillis() : j10);
    }

    public static /* synthetic */ JDCacheModule copy$default(JDCacheModule jDCacheModule, String str, String str2, short s10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jDCacheModule.configId;
        }
        if ((i10 & 2) != 0) {
            str2 = jDCacheModule.url;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            s10 = jDCacheModule.urlType;
        }
        short s11 = s10;
        if ((i10 & 8) != 0) {
            j10 = jDCacheModule.createTime;
        }
        return jDCacheModule.copy(str, str3, s11, j10);
    }

    @d
    public final String component1() {
        return this.configId;
    }

    @e
    public final String component2() {
        return this.url;
    }

    public final short component3() {
        return this.urlType;
    }

    public final long component4() {
        return this.createTime;
    }

    @d
    public final JDCacheModule copy(@d String configId, @e String str, short s10, long j10) {
        f0.p(configId, "configId");
        return new JDCacheModule(configId, str, s10, j10);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof JDCacheModule)) {
            return false;
        }
        return f0.g(this.configId, ((JDCacheModule) obj).configId);
    }

    @d
    public final String getConfigId() {
        return this.configId;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public final short getUrlType() {
        return this.urlType;
    }

    public int hashCode() {
        return this.configId.hashCode();
    }

    public final boolean isRegexpUrl() {
        return 2 == this.urlType && !TextUtils.isEmpty(this.url);
    }

    public final void setConfigId(@d String str) {
        f0.p(str, "<set-?>");
        this.configId = str;
    }

    public final void setCreateTime(long j10) {
        this.createTime = j10;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    public final void setUrlType(short s10) {
        this.urlType = s10;
    }

    @d
    public String toString() {
        return "JDCacheModule(configId=" + this.configId + ", url=" + this.url + ", urlType=" + ((int) this.urlType) + ", createTime=" + this.createTime + ')';
    }
}
