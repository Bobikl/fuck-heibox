package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONObject;
import com.lzy.okgo.model.Progress;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;
import org.apache.tools.ant.taskdefs.p7;

/* JADX INFO: loaded from: classes6.dex */
public class JSONLibDataFormatSerializer implements ObjectSerializer {
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws IOException {
        if (obj == null) {
            jSONSerializer.out.writeNull();
            return;
        }
        Date date = (Date) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Progress.L, (Object) Integer.valueOf(date.getDate()));
        jSONObject.put(p7.a.f135570h, (Object) Integer.valueOf(date.getDay()));
        jSONObject.put("hours", (Object) Integer.valueOf(date.getHours()));
        jSONObject.put("minutes", (Object) Integer.valueOf(date.getMinutes()));
        jSONObject.put("month", (Object) Integer.valueOf(date.getMonth()));
        jSONObject.put("seconds", (Object) Integer.valueOf(date.getSeconds()));
        jSONObject.put("time", (Object) Long.valueOf(date.getTime()));
        jSONObject.put("timezoneOffset", (Object) Integer.valueOf(date.getTimezoneOffset()));
        jSONObject.put("year", (Object) Integer.valueOf(date.getYear()));
        jSONSerializer.write(jSONObject);
    }
}
