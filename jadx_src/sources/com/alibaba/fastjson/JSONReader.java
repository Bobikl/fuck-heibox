package com.alibaba.fastjson;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.Closeable;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public class JSONReader implements Closeable {
    private JSONStreamContext context;
    private final DefaultJSONParser parser;

    public JSONReader(DefaultJSONParser defaultJSONParser) {
        this.parser = defaultJSONParser;
    }

    public JSONReader(JSONLexer jSONLexer) {
        this(new DefaultJSONParser(jSONLexer));
    }

    public JSONReader(Reader reader) {
        this(reader, new Feature[0]);
    }

    public JSONReader(Reader reader, Feature... featureArr) {
        this(new JSONReaderScanner(reader));
        for (Feature feature : featureArr) {
            config(feature, true);
        }
    }

    private void endStructure() {
        int i10;
        JSONStreamContext jSONStreamContext = this.context.parent;
        this.context = jSONStreamContext;
        if (jSONStreamContext == null) {
            return;
        }
        switch (jSONStreamContext.state) {
            case 1001:
            case 1003:
                i10 = 1002;
                break;
            case 1002:
                i10 = 1003;
                break;
            case 1004:
                i10 = 1005;
                break;
            default:
                i10 = -1;
                break;
        }
        if (i10 != -1) {
            jSONStreamContext.state = i10;
        }
    }

    private void readAfter() {
        JSONStreamContext jSONStreamContext = this.context;
        int i10 = jSONStreamContext.state;
        int i11 = 1002;
        switch (i10) {
            case 1001:
            case 1003:
                break;
            case 1002:
                i11 = 1003;
                break;
            case 1004:
                i11 = 1005;
                break;
            case 1005:
                i11 = -1;
                break;
            default:
                throw new JSONException("illegal state : " + i10);
        }
        if (i11 != -1) {
            jSONStreamContext.state = i11;
        }
    }

    private void readBefore() {
        int i10 = this.context.state;
        switch (i10) {
            case 1001:
            case 1004:
                return;
            case 1002:
                this.parser.accept(17);
                return;
            case 1003:
                this.parser.accept(16, 18);
                return;
            case 1005:
                this.parser.accept(16);
                return;
            default:
                throw new JSONException("illegal state : " + i10);
        }
    }

    private void startStructure() {
        switch (this.context.state) {
            case 1001:
            case 1004:
                return;
            case 1002:
                this.parser.accept(17);
                return;
            case 1003:
            case 1005:
                this.parser.accept(16);
                return;
            default:
                throw new JSONException("illegal state : " + this.context.state);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.parser.close();
    }

    public void config(Feature feature, boolean z10) {
        this.parser.config(feature, z10);
    }

    public void endArray() {
        this.parser.accept(15);
        endStructure();
    }

    public void endObject() {
        this.parser.accept(13);
        endStructure();
    }

    public Locale getLocal() {
        return this.parser.lexer.getLocale();
    }

    public TimeZone getTimzeZone() {
        return this.parser.lexer.getTimeZone();
    }

    public boolean hasNext() {
        if (this.context == null) {
            throw new JSONException("context is null");
        }
        int i10 = this.parser.lexer.token();
        int i11 = this.context.state;
        switch (i11) {
            case 1001:
            case 1003:
                return i10 != 13;
            case 1002:
            default:
                throw new JSONException("illegal state : " + i11);
            case 1004:
            case 1005:
                return i10 != 15;
        }
    }

    public int peek() {
        return this.parser.lexer.token();
    }

    public Integer readInteger() {
        Object obj;
        if (this.context == null) {
            obj = this.parser.parse();
        } else {
            readBefore();
            obj = this.parser.parse();
            readAfter();
        }
        return TypeUtils.castToInt(obj);
    }

    public Long readLong() {
        Object obj;
        if (this.context == null) {
            obj = this.parser.parse();
        } else {
            readBefore();
            obj = this.parser.parse();
            readAfter();
        }
        return TypeUtils.castToLong(obj);
    }

    public Object readObject() {
        if (this.context == null) {
            return this.parser.parse();
        }
        readBefore();
        int i10 = this.context.state;
        Object key = (i10 == 1001 || i10 == 1003) ? this.parser.parseKey() : this.parser.parse();
        readAfter();
        return key;
    }

    public <T> T readObject(TypeReference<T> typeReference) {
        return (T) readObject(typeReference.getType());
    }

    public <T> T readObject(Class<T> cls) {
        if (this.context == null) {
            return (T) this.parser.parseObject((Class) cls);
        }
        readBefore();
        T t10 = (T) this.parser.parseObject((Class) cls);
        readAfter();
        return t10;
    }

    public <T> T readObject(Type type) {
        if (this.context == null) {
            return (T) this.parser.parseObject(type);
        }
        readBefore();
        T t10 = (T) this.parser.parseObject(type);
        readAfter();
        return t10;
    }

    public Object readObject(Map map) {
        if (this.context == null) {
            return this.parser.parseObject(map);
        }
        readBefore();
        Object object = this.parser.parseObject(map);
        readAfter();
        return object;
    }

    public void readObject(Object obj) {
        if (this.context == null) {
            this.parser.parseObject(obj);
            return;
        }
        readBefore();
        this.parser.parseObject(obj);
        readAfter();
    }

    public String readString() {
        Object obj;
        if (this.context == null) {
            obj = this.parser.parse();
        } else {
            readBefore();
            JSONLexer jSONLexer = this.parser.lexer;
            if (this.context.state == 1001 && jSONLexer.token() == 18) {
                String strStringVal = jSONLexer.stringVal();
                jSONLexer.nextToken();
                obj = strStringVal;
            } else {
                obj = this.parser.parse();
            }
            readAfter();
        }
        return TypeUtils.castToString(obj);
    }

    public void setLocale(Locale locale) {
        this.parser.lexer.setLocale(locale);
    }

    public void setTimzeZone(TimeZone timeZone) {
        this.parser.lexer.setTimeZone(timeZone);
    }

    public void startArray() {
        if (this.context == null) {
            this.context = new JSONStreamContext(null, 1004);
        } else {
            startStructure();
            this.context = new JSONStreamContext(this.context, 1004);
        }
        this.parser.accept(14);
    }

    public void startObject() {
        if (this.context == null) {
            this.context = new JSONStreamContext(null, 1001);
        } else {
            startStructure();
            this.context = new JSONStreamContext(this.context, 1001);
        }
        this.parser.accept(12, 18);
    }
}
