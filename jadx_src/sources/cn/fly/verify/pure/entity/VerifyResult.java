package cn.fly.verify.pure.entity;

import cn.fly.verify.f;
import cn.fly.verify.gd;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class VerifyResult extends a {
    private String opToken;
    private String operator;
    private String securityPhone;
    private String token;
    private UiElement uiElement;

    public VerifyResult(String str, String str2, String str3) {
        this(str, str2, null, str3);
    }

    public VerifyResult(String str, String str2, String str3, String str4) {
        this.securityPhone = str;
        this.opToken = str2;
        this.token = str3;
        this.operator = str4;
        this.uiElement = genUiElement(str4);
    }

    public String getOpToken() {
        return this.opToken;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getSecurityPhone() {
        return this.securityPhone;
    }

    public String getToken() {
        return this.token;
    }

    public UiElement getUiElement() {
        return this.uiElement;
    }

    public void setSecurityPhone(String str) {
        this.securityPhone = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    @Override // cn.fly.verify.pure.entity.a
    public String toJson() {
        try {
            gd gdVar = new gd();
            HashMap map = new HashMap();
            map.put("securityPhone", this.securityPhone);
            map.put("opToken", this.opToken);
            map.put("token", this.token);
            map.put("operator", this.operator);
            map.put("uiElement", gdVar.a(this.uiElement.toJson()));
            return gdVar.a(map);
        } catch (Throwable th2) {
            f.a().a(th2, "[FlyVerify][%s][%s] ==>%s", this.tag, "toJson", "Error parse entity to json");
            return "";
        }
    }
}
