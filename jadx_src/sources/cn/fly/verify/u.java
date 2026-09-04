package cn.fly.verify;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, List<String>> f37013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37014c;

    public u(int i10, Map<String, List<String>> map, String str) {
        this.f37012a = i10;
        this.f37013b = map;
        this.f37014c = str;
    }

    public Map<String, List<String>> a() {
        Map<String, List<String>> map = this.f37013b;
        return map == null ? new HashMap() : map;
    }

    public String b() {
        String str = this.f37014c;
        return str == null ? "" : str;
    }

    public String toString() {
        return "HttpSuccessResponse{responseCode=" + this.f37012a + ", header=" + this.f37013b + ", f208c='" + this.f37014c + "'}";
    }
}
