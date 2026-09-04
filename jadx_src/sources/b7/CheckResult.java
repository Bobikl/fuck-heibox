package b7;

import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: b7.e, reason: from toString */
/* JADX INFO: compiled from: CheckResult.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u001c\u0010\t\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007J\b\u0010\n\u001a\u00020\u0002H\u0016R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lb7/e;", "", "", "key", "value", "Lkotlin/b2;", "d", "", "map", "e", "toString", "", "extraMap", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "", "code", "I", ak.av, "()I", "f", "(I)V", "msg", "Ljava/lang/String;", ak.aF, "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "<init>", "(ILjava/lang/String;)V", "basics_release"}, k = 1, mv = {1, 4, 0})
public final class CheckResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @dl.d
    private final Map<String, Object> extraMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    private int code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    @dl.d
    private String msg;

    public CheckResult(int i10, @dl.d String msg) {
        f0.q(msg, "msg");
        this.code = i10;
        this.msg = msg;
        this.extraMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @dl.d
    public final Map<String, Object> b() {
        return this.extraMap;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final void d(@dl.d String key, @dl.e Object obj) {
        f0.q(key, "key");
        this.extraMap.put(key, obj);
    }

    public final void e(@dl.d Map<String, ? extends Object> map) {
        f0.q(map, "map");
        this.extraMap.putAll(map);
    }

    public final void f(int i10) {
        this.code = i10;
    }

    public final void g(@dl.d String str) {
        f0.q(str, "<set-?>");
        this.msg = str;
    }

    @dl.d
    public String toString() {
        return "CheckResult(code=" + this.code + ", msg='" + this.msg + "', extraMap=" + this.extraMap + ')';
    }
}
