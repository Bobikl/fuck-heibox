package com.jd.jdcache.entity;

import androidx.annotation.Keep;
import androidx.compose.foundation.b0;
import com.jd.jdcache.util.b;
import dl.d;
import dl.e;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.r0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JDCacheLocalResp.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nJDCacheLocalResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheLocalResp.kt\ncom/jd/jdcache/entity/JDCacheLocalResp\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,219:1\n457#2:220\n403#2:221\n1238#3,2:222\n1241#3:225\n1#4:224\n215#5,2:226\n*S KotlinDebug\n*F\n+ 1 JDCacheLocalResp.kt\ncom/jd/jdcache/entity/JDCacheLocalResp\n*L\n46#1:220\n46#1:221\n46#1:222,2\n46#1:225\n92#1:226,2\n*E\n"})
@Keep
public final class JDCacheLocalResp implements b {

    @e
    private transient InputStream fileStream;

    @e
    private String filename;

    @e
    @xh.e
    public Map<String, String> header;
    private final transient boolean needSafeChangeHeader;

    @d
    private final String type;

    @d
    private final String url;

    public JDCacheLocalResp(@d String url, @d String type, @e Map<String, String> map, @e String str, @e InputStream inputStream, boolean z10) {
        f0.p(url, "url");
        f0.p(type, "type");
        this.url = url;
        this.type = type;
        this.header = map;
        this.filename = str;
        this.fileStream = inputStream;
        this.needSafeChangeHeader = z10;
        if (z10) {
            safeChangeHeader();
        }
    }

    public /* synthetic */ JDCacheLocalResp(String str, String str2, Map map, String str3, InputStream inputStream, boolean z10, int i10, u uVar) {
        this(str, str2, (i10 & 4) != 0 ? null : map, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : inputStream, (i10 & 32) != 0 ? true : z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JDCacheLocalResp copy$default(JDCacheLocalResp jDCacheLocalResp, String str, String str2, Map map, String str3, InputStream inputStream, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jDCacheLocalResp.url;
        }
        if ((i10 & 2) != 0) {
            str2 = jDCacheLocalResp.type;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            map = jDCacheLocalResp.header;
        }
        Map map2 = map;
        if ((i10 & 8) != 0) {
            str3 = jDCacheLocalResp.filename;
        }
        String str5 = str3;
        if ((i10 & 16) != 0) {
            inputStream = jDCacheLocalResp.fileStream;
        }
        InputStream inputStream2 = inputStream;
        if ((i10 & 32) != 0) {
            z10 = jDCacheLocalResp.needSafeChangeHeader;
        }
        return jDCacheLocalResp.copy(str, str4, map2, str5, inputStream2, z10);
    }

    private final void safeChangeHeader() {
        Map<String, String> map = this.header;
        LinkedHashMap linkedHashMap = null;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(r0.j(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                linkedHashMap2.put(str != null ? toUpperCamelCase(str, '-') : null, entry.getValue());
            }
            linkedHashMap = linkedHashMap2;
        }
        this.header = w0.k(linkedHashMap);
    }

    private final String toUpperCamelCase(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        boolean z10 = true;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == c10) {
                sb2.append(cCharAt);
                z10 = true;
            } else if (z10) {
                sb2.append(Character.toUpperCase(cCharAt));
                z10 = false;
            } else {
                sb2.append(Character.toLowerCase(cCharAt));
            }
        }
        String string = sb2.toString();
        f0.o(string, "toString(...)");
        return string;
    }

    @d
    public final String component1() {
        return this.url;
    }

    @d
    public final String component2() {
        return this.type;
    }

    @e
    public final Map<String, String> component3() {
        return this.header;
    }

    @e
    public final String component4() {
        return this.filename;
    }

    @e
    public final InputStream component5() {
        return this.fileStream;
    }

    public final boolean component6() {
        return this.needSafeChangeHeader;
    }

    @d
    public final JDCacheLocalResp copy(@d String url, @d String type, @e Map<String, String> map, @e String str, @e InputStream inputStream, boolean z10) {
        f0.p(url, "url");
        f0.p(type, "type");
        return new JDCacheLocalResp(url, type, map, str, inputStream, z10);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JDCacheLocalResp)) {
            return false;
        }
        JDCacheLocalResp jDCacheLocalResp = (JDCacheLocalResp) obj;
        return f0.g(this.url, jDCacheLocalResp.url) && f0.g(this.type, jDCacheLocalResp.type) && f0.g(this.header, jDCacheLocalResp.header) && f0.g(this.filename, jDCacheLocalResp.filename) && f0.g(this.fileStream, jDCacheLocalResp.fileStream) && this.needSafeChangeHeader == jDCacheLocalResp.needSafeChangeHeader;
    }

    @e
    public final InputStream getFileStream() {
        return this.fileStream;
    }

    @e
    public final String getFilename() {
        return this.filename;
    }

    @e
    public final Map<String, String> getHeader() {
        return this.header;
    }

    public final boolean getNeedSafeChangeHeader() {
        return this.needSafeChangeHeader;
    }

    @d
    public final String getType() {
        return this.type;
    }

    @d
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.type.hashCode()) * 31;
        Map<String, String> map = this.header;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.filename;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InputStream inputStream = this.fileStream;
        return ((iHashCode3 + (inputStream != null ? inputStream.hashCode() : 0)) * 31) + b0.a(this.needSafeChangeHeader);
    }

    public final void setFileStream(@e InputStream inputStream) {
        this.fileStream = inputStream;
    }

    public final void setFilename(@e String str) {
        this.filename = str;
    }

    public final void setHeader(@e Map<String, String> map) {
        this.header = map;
        if (this.needSafeChangeHeader) {
            safeChangeHeader();
        }
    }

    @d
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", this.url);
        jSONObject.put("type", this.type);
        String str = this.filename;
        if (str != null) {
            jSONObject.put("filename", str);
        }
        InputStream inputStream = this.fileStream;
        if (inputStream != null) {
            jSONObject.put("fileStream", inputStream);
        }
        Map<String, String> map = this.header;
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    key = "null";
                }
                jSONObject2.put(key, entry.getValue());
            }
            jSONObject.put("header", jSONObject2);
        }
        return jSONObject;
    }

    @d
    public String toString() {
        String string = toJson().toString();
        f0.o(string, "toString(...)");
        return string;
    }

    @Override // com.jd.jdcache.util.b
    public boolean useful() {
        String str = this.filename;
        return ((str == null || str.length() == 0) && this.fileStream == null) ? false : true;
    }
}
