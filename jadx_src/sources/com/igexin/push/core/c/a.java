package com.igexin.push.core.c;

import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.config.n;
import com.igexin.push.core.a.r;
import com.igexin.push.core.b.i;
import com.igexin.push.util.h;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.igexin.push.f.a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONArray f63650b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63651a;

    public a(String str, JSONArray jSONArray) {
        super(str);
        this.f63651a = getClass().getName();
        a(jSONArray);
    }

    @Override // com.igexin.push.f.a.b
    public void a(Exception exc) {
        i.a().b(System.currentTimeMillis());
        com.igexin.a.a.c.b.a("-> get idc config " + exc.toString(), new Object[0]);
    }

    public void a(JSONArray jSONArray) {
        f63650b = jSONArray;
    }

    @Override // com.igexin.push.f.a.b
    public void a(byte[] bArr) throws Exception {
        if (bArr != null) {
            try {
                String str = new String(com.igexin.a.b.a.c(h.a(bArr, 0)));
                com.igexin.a.a.c.b.a("->get idc config server resp data : " + str, new Object[0]);
                com.igexin.push.config.a.a().b(str);
                n.a(str, true);
                i.a().b(0L);
                com.igexin.push.config.a.a().a(f63650b.toString());
                SDKUrlConfig.setIdcConfigUrl(r.a(f63650b));
            } catch (Exception e10) {
                i.a().b(System.currentTimeMillis());
                throw e10;
            }
        }
    }

    @Override // com.igexin.a.a.d.a.e
    public int b_() {
        return 0;
    }
}
