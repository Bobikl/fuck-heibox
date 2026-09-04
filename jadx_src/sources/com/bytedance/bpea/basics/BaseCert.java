package com.bytedance.bpea.basics;

import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import dl.e;
import j5.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseCert.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bytedance/bpea/basics/BaseCert;", "Lcom/bytedance/bpea/basics/Cert;", "Ljava/io/Serializable;", "", "certToken", "", "certType", "Lorg/json/JSONObject;", "toJSON", "Lb7/d;", d.R, "Lkotlin/b2;", c.f124302j, "toString", "b", "Ljava/lang/String;", ak.aF, "I", "<init>", "(Ljava/lang/String;I)V", "basics_release"}, k = 1, mv = {1, 4, 0})
public abstract class BaseCert implements Cert, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String certToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int certType;

    public BaseCert(@e String str, int i10) {
        this.certToken = str;
        this.certType = i10;
    }

    @Override // com.bytedance.bpea.basics.Cert
    @e
    /* JADX INFO: renamed from: certToken, reason: from getter */
    public String getCertToken() {
        return this.certToken;
    }

    @Override // com.bytedance.bpea.basics.Cert
    /* JADX INFO: renamed from: certType, reason: from getter */
    public int getCertType() {
        return this.certType;
    }

    @Override // com.bytedance.bpea.basics.Cert
    @dl.d
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("certToken", this.certToken);
            jSONObject.put("certType", this.certType);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return jSONObject;
    }

    @dl.d
    public String toString() {
        String string = toJSON().toString();
        f0.h(string, "toJSON().toString()");
        return string;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public void validate(@dl.d b7.d context) throws BPEAException {
        f0.q(context, "context");
        String str = this.certToken;
        if (str == null || str.length() == 0) {
            throw new BPEAException(-1, "certToken is empty");
        }
    }
}
