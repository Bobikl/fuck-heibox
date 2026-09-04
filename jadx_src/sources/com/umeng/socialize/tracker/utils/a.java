package com.umeng.socialize.tracker.utils;

/* JADX INFO: compiled from: Errors.java */
/* JADX INFO: loaded from: classes4.dex */
public enum a {
    UnKnownCode(5000),
    Timeout(5001),
    NetworkUnavailable(5002),
    SSLException(5003),
    IOException(5004),
    UnKnownHostException(bb.c.f.Na),
    HttpError(bb.c.f.Oa),
    EmptyResponse(bb.c.f.Pa),
    ErrorResponse(bb.c.f.Qa),
    ErrorMakeRequestBody(bb.c.f.Ra);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f106385k;

    a(int i10) {
        this.f106385k = i10;
    }

    private String b() {
        return "错误码：" + this.f106385k + " 错误信息：";
    }

    public String a() {
        if (this == UnKnownCode) {
            return b() + "--未知错误--";
        }
        if (this == Timeout) {
            return b() + "--连接超时--";
        }
        if (this == NetworkUnavailable) {
            return b() + "--网络不可用--";
        }
        if (this == SSLException) {
            return b() + "--SSL证书认证失败--";
        }
        if (this == IOException) {
            return b() + "--IO异常--";
        }
        if (this == HttpError) {
            return b() + "--服务端返回HTTP错误--";
        }
        if (this == EmptyResponse) {
            return b() + "--服务端返回数据为空--";
        }
        if (this == ErrorResponse) {
            return b() + "--服务端返回错误数据--";
        }
        if (this != ErrorMakeRequestBody) {
            return "unknown";
        }
        return b() + "--请求报文构建错误--";
    }
}
