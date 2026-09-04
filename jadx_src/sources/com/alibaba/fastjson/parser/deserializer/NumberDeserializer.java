package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public class NumberDeserializer implements ObjectDeserializer {
    public static final NumberDeserializer instance = new NumberDeserializer();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Number, java.lang.Object, java.math.BigDecimal] */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 2) {
            if (type == Double.TYPE || type == Double.class) {
                String strNumberString = jSONLexer.numberString();
                jSONLexer.nextToken(16);
                return (T) Double.valueOf(Double.parseDouble(strNumberString));
            }
            long jLongValue = jSONLexer.longValue();
            jSONLexer.nextToken(16);
            if (type == Short.TYPE || type == Short.class) {
                if (jLongValue <= 32767 && jLongValue >= -32768) {
                    return (T) Short.valueOf((short) jLongValue);
                }
                throw new JSONException("short overflow : " + jLongValue);
            }
            if (type != Byte.TYPE && type != Byte.class) {
                return (jLongValue < -2147483648L || jLongValue > 2147483647L) ? (T) Long.valueOf(jLongValue) : (T) Integer.valueOf((int) jLongValue);
            }
            if (jLongValue <= 127 && jLongValue >= -128) {
                return (T) Byte.valueOf((byte) jLongValue);
            }
            throw new JSONException("short overflow : " + jLongValue);
        }
        if (jSONLexer.token() == 3) {
            if (type == Double.TYPE || type == Double.class) {
                String strNumberString2 = jSONLexer.numberString();
                jSONLexer.nextToken(16);
                return (T) Double.valueOf(Double.parseDouble(strNumberString2));
            }
            ?? r10 = (T) jSONLexer.decimalValue();
            jSONLexer.nextToken(16);
            if (type != Short.TYPE && type != Short.class) {
                return (type == Byte.TYPE || type == Byte.class) ? (T) Byte.valueOf(r10.byteValue()) : r10;
            }
            if (r10.compareTo(BigDecimal.valueOf(32767L)) <= 0 && r10.compareTo(BigDecimal.valueOf(-32768L)) >= 0) {
                return (T) Short.valueOf(r10.shortValue());
            }
            throw new JSONException("short overflow : " + ((Object) r10));
        }
        if (jSONLexer.token() == 18 && "NaN".equals(jSONLexer.stringVal())) {
            jSONLexer.nextToken();
            if (type == Double.class) {
                return (T) Double.valueOf(Double.NaN);
            }
            if (type == Float.class) {
                return (T) Float.valueOf(Float.NaN);
            }
            return null;
        }
        Object obj2 = defaultJSONParser.parse();
        if (obj2 == null) {
            return null;
        }
        if (type == Double.TYPE || type == Double.class) {
            try {
                return (T) TypeUtils.castToDouble(obj2);
            } catch (Exception e10) {
                throw new JSONException("parseDouble error, field : " + obj, e10);
            }
        }
        if (type == Short.TYPE || type == Short.class) {
            try {
                return (T) TypeUtils.castToShort(obj2);
            } catch (Exception e11) {
                throw new JSONException("parseShort error, field : " + obj, e11);
            }
        }
        if (type != Byte.TYPE && type != Byte.class) {
            return (T) TypeUtils.castToBigDecimal(obj2);
        }
        try {
            return (T) TypeUtils.castToByte(obj2);
        } catch (Exception e12) {
            throw new JSONException("parseByte error, field : " + obj, e12);
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }
}
