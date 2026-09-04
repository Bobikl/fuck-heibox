package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class CharArrayCodec implements ObjectDeserializer {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T deserialze(DefaultJSONParser defaultJSONParser) {
        boolean z10;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 4) {
            String strStringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(16);
            return (T) strStringVal.toCharArray();
        }
        if (jSONLexer.token() == 2) {
            Number numberIntegerValue = jSONLexer.integerValue();
            jSONLexer.nextToken(16);
            return (T) numberIntegerValue.toString().toCharArray();
        }
        Object obj = defaultJSONParser.parse();
        if (obj instanceof String) {
            return (T) ((String) obj).toCharArray();
        }
        if (!(obj instanceof Collection)) {
            if (obj == null) {
                return null;
            }
            return (T) JSON.toJSONString(obj).toCharArray();
        }
        Collection collection = (Collection) obj;
        Iterator it = collection.iterator();
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if ((next instanceof String) && ((String) next).length() != 1) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            throw new JSONException("can not cast to char[]");
        }
        char[] cArr = new char[collection.size()];
        Iterator it2 = collection.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            cArr[i10] = ((String) it2.next()).charAt(0);
            i10++;
        }
        return cArr;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 4;
    }
}
