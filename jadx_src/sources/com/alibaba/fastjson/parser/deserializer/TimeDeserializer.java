package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONScanner;
import java.lang.reflect.Type;
import java.sql.Time;

/* JADX INFO: loaded from: classes6.dex */
public class TimeDeserializer implements ObjectDeserializer {
    public static final TimeDeserializer instance = new TimeDeserializer();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        long timeInMillis;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 16) {
            jSONLexer.nextToken(4);
            if (jSONLexer.token() != 4) {
                throw new JSONException("syntax error");
            }
            jSONLexer.nextTokenWithColon(2);
            if (jSONLexer.token() != 2) {
                throw new JSONException("syntax error");
            }
            long jLongValue = jSONLexer.longValue();
            jSONLexer.nextToken(13);
            if (jSONLexer.token() != 13) {
                throw new JSONException("syntax error");
            }
            jSONLexer.nextToken(16);
            return (T) new Time(jLongValue);
        }
        T t10 = (T) defaultJSONParser.parse();
        if (t10 == 0) {
            return null;
        }
        if (t10 instanceof Time) {
            return t10;
        }
        if (t10 instanceof Number) {
            return (T) new Time(((Number) t10).longValue());
        }
        if (!(t10 instanceof String)) {
            throw new JSONException("parse error");
        }
        String str = (String) t10;
        if (str.length() == 0) {
            return null;
        }
        JSONScanner jSONScanner = new JSONScanner(str);
        if (jSONScanner.scanISO8601DateIfMatch()) {
            timeInMillis = jSONScanner.getCalendar().getTimeInMillis();
        } else {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= str.length()) {
                    z10 = true;
                    break;
                }
                char cCharAt = str.charAt(i10);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i10++;
            }
            if (!z10) {
                jSONScanner.close();
                return (T) Time.valueOf(str);
            }
            timeInMillis = Long.parseLong(str);
        }
        jSONScanner.close();
        return (T) new Time(timeInMillis);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }
}
