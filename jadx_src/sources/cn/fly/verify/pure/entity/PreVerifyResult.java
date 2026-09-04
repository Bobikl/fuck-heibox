package cn.fly.verify.pure.entity;

import cn.fly.verify.f;
import cn.fly.verify.gd;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class PreVerifyResult extends a {
    public String channel;
    private final long expireAt;
    private final String operator;
    private final String securityPhone;
    private final UiElement uiElement;

    public PreVerifyResult(String str, String str2) {
        this.operator = str2;
        this.securityPhone = str;
        this.uiElement = genUiElement(str2);
        this.expireAt = setExpireAt();
    }

    public PreVerifyResult(String str, String str2, long j10, String str3) {
        this.operator = str2;
        this.securityPhone = str;
        this.expireAt = j10;
        this.uiElement = genUiElement(str2);
        this.channel = str3;
    }

    private long setExpireAt() {
        return System.currentTimeMillis() + 3600000;
    }

    public String getChannel() {
        return this.channel;
    }

    public long getExpireAt() {
        return this.expireAt;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getSecurityPhone() {
        return this.securityPhone;
    }

    public UiElement getUiElement() {
        return this.uiElement;
    }

    @Override // cn.fly.verify.pure.entity.a
    public String toJson() {
        try {
            gd gdVar = new gd();
            HashMap map = new HashMap();
            map.put("operator", this.operator);
            map.put("securityPhone", this.securityPhone);
            map.put("uiElement", gdVar.a(this.uiElement.toJson()));
            return gdVar.a(map);
        } catch (Throwable th2) {
            f.a().a(th2, "[FlyVerify][%s][%s] ==>%s", this.tag, "toJson", "Error parse entity to json");
            return "";
        }
    }
}
