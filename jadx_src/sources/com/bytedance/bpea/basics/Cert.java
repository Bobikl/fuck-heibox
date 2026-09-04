package com.bytedance.bpea.basics;

import com.umeng.analytics.pro.d;
import dl.e;
import j5.c;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: compiled from: Cert.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/bytedance/bpea/basics/Cert;", "", "", "certToken", "", "certType", "Lorg/json/JSONObject;", "toJSON", "Lb7/d;", d.R, "Lkotlin/b2;", c.f124302j, "basics_release"}, k = 1, mv = {1, 4, 0})
public interface Cert {
    @e
    String certToken();

    int certType();

    @dl.d
    JSONObject toJSON();

    void validate(@dl.d b7.d dVar) throws BPEAException;
}
