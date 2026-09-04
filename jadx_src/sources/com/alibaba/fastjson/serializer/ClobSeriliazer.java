package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONException;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes6.dex */
public class ClobSeriliazer implements ObjectSerializer {
    public static final ClobSeriliazer instance = new ClobSeriliazer();

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws IOException {
        try {
            if (obj == null) {
                jSONSerializer.writeNull();
                return;
            }
            Reader characterStream = ((Clob) obj).getCharacterStream();
            StringBuilder sb2 = new StringBuilder();
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int i11 = characterStream.read(cArr, 0, 2048);
                    if (i11 < 0) {
                        String string = sb2.toString();
                        characterStream.close();
                        jSONSerializer.write(string);
                        return;
                    }
                    sb2.append(cArr, 0, i11);
                }
            } catch (Exception e10) {
                throw new JSONException("read string from reader error", e10);
            }
        } catch (SQLException e11) {
            throw new IOException("write clob error", e11);
        }
    }
}
