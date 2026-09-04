package cn.fly.verify.common.exception;

import cn.fly.verify.gi;

/* JADX INFO: loaded from: classes6.dex */
public class VerifyException extends Exception {
    protected int code;
    private String extraDesc;
    private String message;
    private String operatorCode;
    private String serialId;

    public VerifyException(int i10, String str) {
        super(str);
        this.message = str;
        this.code = i10;
    }

    @Deprecated
    public VerifyException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.message = str;
        this.code = i10;
    }

    public VerifyException(VerifyErr verifyErr) {
        super(verifyErr.getMessage());
        this.message = verifyErr.getMessage();
        this.code = verifyErr.getCode();
    }

    @Deprecated
    public VerifyException(VerifyErr verifyErr, Throwable th2) {
        super(verifyErr.getMessage(), th2);
        this.message = verifyErr.getMessage();
        this.code = verifyErr.getCode();
    }

    @Deprecated
    public VerifyException(Throwable th2) {
        super(th2);
    }

    public int getCode() {
        return this.code;
    }

    public String getExtraDesc() {
        return this.extraDesc;
    }

    public String getOperatorCode() {
        return this.operatorCode;
    }

    public String getSerialId() {
        return this.serialId;
    }

    public void setCode(int i10) {
        this.code = i10;
    }

    public void setExtraDesc(String str) {
        this.extraDesc = str;
        setMessage(this.message + ": " + str);
    }

    public void setMessage(String str) {
        this.message = str;
        try {
            gi.b(this, "detailMessage", str);
        } catch (Throwable unused) {
        }
    }

    public void setOperatorCode(String str) {
        this.operatorCode = str;
    }

    public void setSerialId(String str) {
        this.serialId = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "{\"code\": " + this.code + ", \"message\": \"" + getMessage() + ", \"operatorCode\": \"" + this.operatorCode + "\", \"serialId\":\"" + this.serialId + "\"}";
    }
}
