package com.igexin.push.d.a;

import com.igexin.a.a.b.d;
import com.igexin.a.a.d.a.e;
import com.igexin.push.d.c.c;
import com.igexin.push.d.c.f;
import com.igexin.push.d.c.h;
import com.igexin.push.d.c.k;
import com.igexin.push.d.c.l;
import com.igexin.push.d.c.m;
import com.igexin.push.d.c.o;
import com.igexin.push.d.c.p;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.igexin.a.a.b.b {
    public a(String str, com.igexin.a.a.b.b bVar) {
        super(str, true);
        a(bVar);
    }

    private boolean a(com.igexin.push.d.c.a aVar, c cVar) {
        String string;
        if (aVar.f63813b != 26) {
            return false;
        }
        m mVar = (m) cVar;
        if (mVar.b() && mVar.f63879e != null) {
            try {
                JSONObject jSONObject = new JSONObject((String) mVar.f63879e);
                if (jSONObject.has("action") && (string = jSONObject.getString("action")) != null && string.equals("redirect_server")) {
                    return true;
                }
            } catch (Exception e10) {
                com.igexin.a.a.c.b.a("CommandFilter|" + e10.toString(), new Object[0]);
            }
        }
        return false;
    }

    @Override // com.igexin.a.a.b.b
    public Object a(d dVar, Object obj) throws Exception {
        if (obj instanceof c) {
            c cVar = (c) obj;
            com.igexin.push.d.c.a aVar = new com.igexin.push.d.c.a();
            aVar.f63813b = (byte) cVar.f63827i;
            aVar.a(cVar.c());
            aVar.f63814c = cVar.f63828j;
            aVar.f63815d = cVar.f63829k;
            return aVar;
        }
        if (!(obj instanceof c[])) {
            return null;
        }
        c[] cVarArr = (c[]) obj;
        com.igexin.push.d.c.a[] aVarArr = new com.igexin.push.d.c.a[cVarArr.length];
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            com.igexin.push.d.c.a aVar2 = new com.igexin.push.d.c.a();
            aVarArr[i10] = aVar2;
            c cVar2 = cVarArr[i10];
            aVar2.f63813b = (byte) cVar2.f63827i;
            aVar2.a(cVar2.c());
        }
        return aVarArr;
    }

    @Override // com.igexin.a.a.b.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e c(d dVar, Object obj) throws Exception {
        c kVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof f) {
            return (e) obj;
        }
        com.igexin.push.d.c.a aVar = (com.igexin.push.d.c.a) obj;
        byte b10 = aVar.f63813b;
        if (b10 == 5) {
            kVar = new k();
        } else if (b10 == 9) {
            kVar = new o();
        } else if (b10 == 20) {
            kVar = new p();
        } else if (b10 == 26) {
            kVar = new m();
        } else if (b10 != 37) {
            kVar = b10 != 97 ? null : new h();
        } else {
            kVar = new l();
        }
        int i10 = aVar.f63817f;
        if ((i10 != 1 && i10 != 7) || kVar == null) {
            return null;
        }
        kVar.a(aVar.f63816e);
        if (aVar.f63817f != 7) {
            if (a(aVar, kVar)) {
                return kVar;
            }
            return null;
        }
        if (aVar.f63818g != 32 || a(aVar, kVar)) {
            return kVar;
        }
        return null;
    }
}
