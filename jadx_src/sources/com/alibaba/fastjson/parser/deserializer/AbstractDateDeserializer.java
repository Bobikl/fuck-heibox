package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONScanner;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.TPReportParams;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.tools.ant.util.d0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractDateDeserializer extends ContextObjectDeserializer implements ObjectDeserializer {
    protected abstract <T> T cast(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2);

    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser, type, obj, null, 0);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, String str, int i10) throws Throwable {
        SimpleDateFormat simpleDateFormat;
        Object obj2;
        Object obj3;
        JSONScanner jSONScanner;
        Object time;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        Object objValueOf = null;
        objValueOf = null;
        objValueOf = null;
        objValueOf = null;
        objValueOf = null;
        if (jSONLexer.token() == 2) {
            objValueOf = Long.valueOf(jSONLexer.longValue());
            jSONLexer.nextToken(16);
        } else if (jSONLexer.token() == 4) {
            String strStringVal = jSONLexer.stringVal();
            if (str != null) {
                try {
                    simpleDateFormat = new SimpleDateFormat(str, JSON.defaultLocale);
                } catch (IllegalArgumentException unused) {
                    if (str.equals("yyyy-MM-ddTHH:mm:ss.SSS")) {
                        str = "yyyy-MM-dd'T'HH:mm:ss.SSS";
                        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
                    } else if (str.equals("yyyy-MM-ddTHH:mm:ss")) {
                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(d0.f136744e);
                        str = d0.f136744e;
                        simpleDateFormat = simpleDateFormat2;
                    } else {
                        simpleDateFormat = null;
                    }
                }
                try {
                    obj2 = simpleDateFormat.parse(strStringVal);
                } catch (ParseException unused2) {
                    if (str.equals("yyyy-MM-dd'T'HH:mm:ss.SSS") && strStringVal.length() == 19) {
                        try {
                            obj2 = new SimpleDateFormat(d0.f136744e).parse(strStringVal);
                        } catch (ParseException unused3) {
                        }
                    }
                    if (objValueOf == null) {
                        jSONLexer.nextToken(16);
                        if (jSONLexer.isEnabled(Feature.AllowISO8601DateFormat)) {
                            jSONScanner = new JSONScanner(strStringVal);
                            if (jSONScanner.scanISO8601DateIfMatch()) {
                                obj3 = strStringVal;
                                time = strStringVal;
                                time = jSONScanner.getCalendar().getTime();
                            }
                            obj3 = strStringVal;
                            time = strStringVal;
                            jSONScanner.close();
                            obj3 = time;
                        }
                        obj3 = strStringVal;
                        objValueOf = obj3;
                    }
                    return (T) cast(defaultJSONParser, type, obj, objValueOf);
                }
                objValueOf = obj2;
            }
            if (objValueOf == null) {
                jSONLexer.nextToken(16);
                if (jSONLexer.isEnabled(Feature.AllowISO8601DateFormat)) {
                    jSONScanner = new JSONScanner(strStringVal);
                    if (jSONScanner.scanISO8601DateIfMatch()) {
                        obj3 = strStringVal;
                        time = strStringVal;
                        time = jSONScanner.getCalendar().getTime();
                    }
                    obj3 = strStringVal;
                    time = strStringVal;
                    jSONScanner.close();
                    obj3 = time;
                }
                obj3 = strStringVal;
                objValueOf = obj3;
            }
        } else if (jSONLexer.token() == 8) {
            jSONLexer.nextToken();
        } else if (jSONLexer.token() == 12) {
            jSONLexer.nextToken();
            if (jSONLexer.token() != 4) {
                throw new JSONException("syntax error");
            }
            if (JSON.DEFAULT_TYPE_KEY.equals(jSONLexer.stringVal())) {
                jSONLexer.nextToken();
                defaultJSONParser.accept(17);
                Type typeCheckAutoType = defaultJSONParser.getConfig().checkAutoType(jSONLexer.stringVal(), null, jSONLexer.getFeatures());
                if (typeCheckAutoType != null) {
                    type = typeCheckAutoType;
                }
                defaultJSONParser.accept(4);
                defaultJSONParser.accept(16);
            }
            jSONLexer.nextTokenWithColon(2);
            if (jSONLexer.token() != 2) {
                throw new JSONException("syntax error : " + jSONLexer.tokenName());
            }
            long jLongValue = jSONLexer.longValue();
            jSONLexer.nextToken();
            objValueOf = Long.valueOf(jLongValue);
            defaultJSONParser.accept(13);
        } else if (defaultJSONParser.getResolveStatus() == 2) {
            defaultJSONParser.setResolveStatus(0);
            defaultJSONParser.accept(16);
            if (jSONLexer.token() != 4) {
                throw new JSONException("syntax error");
            }
            if (!TPReportParams.JSON_KEY_VAL.equals(jSONLexer.stringVal())) {
                throw new JSONException("syntax error");
            }
            jSONLexer.nextToken();
            defaultJSONParser.accept(17);
            objValueOf = defaultJSONParser.parse();
            defaultJSONParser.accept(13);
        } else {
            objValueOf = defaultJSONParser.parse();
        }
        return (T) cast(defaultJSONParser, type, obj, objValueOf);
    }
}
