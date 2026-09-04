package com.huawei.hms.push;

import com.huawei.hms.aaid.constant.ErrorEnum;

/* JADX INFO: loaded from: classes7.dex */
public class BaseException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ErrorEnum f61193b;

    public BaseException(int i10) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(i10);
        this.f61193b = errorEnumFromCode;
        this.f61192a = errorEnumFromCode.getExternalCode();
    }

    public int getErrorCode() {
        return this.f61192a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f61193b.getMessage();
    }
}
