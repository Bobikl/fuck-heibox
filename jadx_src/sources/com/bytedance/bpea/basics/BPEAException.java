package com.bytedance.bpea.basics;

import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BPEAException.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/bpea/basics/BPEAException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "b", "I", ak.av, "()I", Constants.KEY_ERROR_CODE, "", ak.aF, "Ljava/lang/String;", "()Ljava/lang/String;", "errorMsg", "<init>", "(ILjava/lang/String;)V", "basics_release"}, k = 1, mv = {1, 4, 0})
public final class BPEAException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final String errorMsg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BPEAException(int i10, @d String errorMsg) {
        super(errorMsg);
        f0.q(errorMsg, "errorMsg");
        this.errorCode = i10;
        this.errorMsg = errorMsg;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }
}
