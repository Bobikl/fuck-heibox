package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessable;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.MapDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.PropertyProcessable;
import com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.serializer.LongCodec;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.Closeable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.text.y;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultJSONParser implements Closeable {
    public static final int NONE = 0;
    public static final int NeedToResolve = 1;
    public static final int TypeNameRedirect = 2;
    private static final Set<Class<?>> primitiveClasses = new HashSet();
    private String[] autoTypeAccept;
    private boolean autoTypeEnable;
    protected ParserConfig config;
    protected ParseContext context;
    private ParseContext[] contextArray;
    private int contextArrayIndex;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    private List<ExtraProcessor> extraProcessors;
    private List<ExtraTypeProvider> extraTypeProviders;
    protected FieldTypeResolver fieldTypeResolver;
    public final Object input;
    protected transient BeanContext lastBeanContext;
    public final JSONLexer lexer;
    public int resolveStatus;
    private List<ResolveTask> resolveTaskList;
    public final SymbolTable symbolTable;

    public static class ResolveTask {
        public final ParseContext context;
        public FieldDeserializer fieldDeserializer;
        public ParseContext ownerContext;
        public final String referenceValue;

        public ResolveTask(ParseContext parseContext, String str) {
            this.context = parseContext;
            this.referenceValue = str;
        }
    }

    static {
        Class<?>[] clsArr = {Boolean.TYPE, Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, BigInteger.class, BigDecimal.class, String.class};
        for (int i10 = 0; i10 < 17; i10++) {
            primitiveClasses.add(clsArr[i10]);
        }
    }

    public DefaultJSONParser(JSONLexer jSONLexer) {
        this(jSONLexer, ParserConfig.getGlobalInstance());
    }

    public DefaultJSONParser(JSONLexer jSONLexer, ParserConfig parserConfig) {
        this((Object) null, jSONLexer, parserConfig);
    }

    public DefaultJSONParser(Object obj, JSONLexer jSONLexer, ParserConfig parserConfig) {
        this.dateFormatPattern = JSON.DEFFAULT_DATE_FORMAT;
        this.contextArrayIndex = 0;
        this.resolveStatus = 0;
        this.extraTypeProviders = null;
        this.extraProcessors = null;
        this.fieldTypeResolver = null;
        this.autoTypeAccept = null;
        this.lexer = jSONLexer;
        this.input = obj;
        this.config = parserConfig;
        this.symbolTable = parserConfig.symbolTable;
        char current = jSONLexer.getCurrent();
        if (current == '{') {
            jSONLexer.next();
            ((JSONLexerBase) jSONLexer).token = 12;
        } else if (current != '[') {
            jSONLexer.nextToken();
        } else {
            jSONLexer.next();
            ((JSONLexerBase) jSONLexer).token = 14;
        }
    }

    public DefaultJSONParser(String str) {
        this(str, ParserConfig.getGlobalInstance(), JSON.DEFAULT_PARSER_FEATURE);
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig) {
        this(str, new JSONScanner(str, JSON.DEFAULT_PARSER_FEATURE), parserConfig);
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig, int i10) {
        this(str, new JSONScanner(str, i10), parserConfig);
    }

    public DefaultJSONParser(char[] cArr, int i10, ParserConfig parserConfig, int i11) {
        this(cArr, new JSONScanner(cArr, i10, i11), parserConfig);
    }

    private void addContext(ParseContext parseContext) {
        int i10 = this.contextArrayIndex;
        this.contextArrayIndex = i10 + 1;
        ParseContext[] parseContextArr = this.contextArray;
        if (parseContextArr == null) {
            this.contextArray = new ParseContext[8];
        } else if (i10 >= parseContextArr.length) {
            ParseContext[] parseContextArr2 = new ParseContext[(parseContextArr.length * 3) / 2];
            System.arraycopy(parseContextArr, 0, parseContextArr2, 0, parseContextArr.length);
            this.contextArray = parseContextArr2;
        }
        this.contextArray[i10] = parseContext;
    }

    public final void accept(int i10) {
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token() == i10) {
            jSONLexer.nextToken();
            return;
        }
        throw new JSONException("syntax error, expect " + JSONToken.name(i10) + ", actual " + JSONToken.name(jSONLexer.token()));
    }

    public final void accept(int i10, int i11) {
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token() == i10) {
            jSONLexer.nextToken(i11);
        } else {
            throwException(i10);
        }
    }

    public void acceptType(String str) {
        JSONLexer jSONLexer = this.lexer;
        jSONLexer.nextTokenWithColon();
        if (jSONLexer.token() != 4) {
            throw new JSONException("type not match error");
        }
        if (!str.equals(jSONLexer.stringVal())) {
            throw new JSONException("type not match error");
        }
        jSONLexer.nextToken();
        if (jSONLexer.token() == 16) {
            jSONLexer.nextToken();
        }
    }

    public void addResolveTask(ResolveTask resolveTask) {
        if (this.resolveTaskList == null) {
            this.resolveTaskList = new ArrayList(2);
        }
        this.resolveTaskList.add(resolveTask);
    }

    public void checkListResolve(Collection collection) {
        if (this.resolveStatus == 1) {
            if (!(collection instanceof List)) {
                ResolveTask lastResolveTask = getLastResolveTask();
                lastResolveTask.fieldDeserializer = new ResolveFieldDeserializer(collection);
                lastResolveTask.ownerContext = this.context;
                setResolveStatus(0);
                return;
            }
            int size = collection.size() - 1;
            ResolveTask lastResolveTask2 = getLastResolveTask();
            lastResolveTask2.fieldDeserializer = new ResolveFieldDeserializer(this, (List) collection, size);
            lastResolveTask2.ownerContext = this.context;
            setResolveStatus(0);
        }
    }

    public void checkMapResolve(Map map, Object obj) {
        if (this.resolveStatus == 1) {
            ResolveFieldDeserializer resolveFieldDeserializer = new ResolveFieldDeserializer(map, obj);
            ResolveTask lastResolveTask = getLastResolveTask();
            lastResolveTask.fieldDeserializer = resolveFieldDeserializer;
            lastResolveTask.ownerContext = this.context;
            setResolveStatus(0);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JSONLexer jSONLexer = this.lexer;
        try {
            if (jSONLexer.isEnabled(Feature.AutoCloseSource) && jSONLexer.token() != 20) {
                throw new JSONException("not close json text, token : " + JSONToken.name(jSONLexer.token()));
            }
            jSONLexer.close();
        } catch (Throwable th2) {
            jSONLexer.close();
            throw th2;
        }
    }

    public void config(Feature feature, boolean z10) {
        this.lexer.config(feature, z10);
    }

    public ParserConfig getConfig() {
        return this.config;
    }

    public ParseContext getContext() {
        return this.context;
    }

    public String getDateFomartPattern() {
        return this.dateFormatPattern;
    }

    public DateFormat getDateFormat() {
        if (this.dateFormat == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.dateFormatPattern, this.lexer.getLocale());
            this.dateFormat = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.lexer.getTimeZone());
        }
        return this.dateFormat;
    }

    public List<ExtraProcessor> getExtraProcessors() {
        if (this.extraProcessors == null) {
            this.extraProcessors = new ArrayList(2);
        }
        return this.extraProcessors;
    }

    public List<ExtraTypeProvider> getExtraTypeProviders() {
        if (this.extraTypeProviders == null) {
            this.extraTypeProviders = new ArrayList(2);
        }
        return this.extraTypeProviders;
    }

    public FieldTypeResolver getFieldTypeResolver() {
        return this.fieldTypeResolver;
    }

    public String getInput() {
        Object obj = this.input;
        return obj instanceof char[] ? new String((char[]) obj) : obj.toString();
    }

    public ResolveTask getLastResolveTask() {
        List<ResolveTask> list = this.resolveTaskList;
        return list.get(list.size() - 1);
    }

    public JSONLexer getLexer() {
        return this.lexer;
    }

    public Object getObject(String str) {
        for (int i10 = 0; i10 < this.contextArrayIndex; i10++) {
            if (str.equals(this.contextArray[i10].toString())) {
                return this.contextArray[i10].object;
            }
        }
        return null;
    }

    public int getResolveStatus() {
        return this.resolveStatus;
    }

    public List<ResolveTask> getResolveTaskList() {
        if (this.resolveTaskList == null) {
            this.resolveTaskList = new ArrayList(2);
        }
        return this.resolveTaskList;
    }

    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }

    public void handleResovleTask(Object obj) {
        Object objEval;
        FieldInfo fieldInfo;
        List<ResolveTask> list = this.resolveTaskList;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ResolveTask resolveTask = this.resolveTaskList.get(i10);
            String str = resolveTask.referenceValue;
            ParseContext parseContext = resolveTask.ownerContext;
            Object obj2 = parseContext != null ? parseContext.object : null;
            if (str.startsWith("$")) {
                objEval = getObject(str);
                if (objEval == null) {
                    try {
                        objEval = JSONPath.eval(obj, str);
                    } catch (JSONPathException unused) {
                    }
                }
            } else {
                objEval = resolveTask.context.object;
            }
            FieldDeserializer fieldDeserializer = resolveTask.fieldDeserializer;
            if (fieldDeserializer != null) {
                if (objEval != null && objEval.getClass() == JSONObject.class && (fieldInfo = fieldDeserializer.fieldInfo) != null && !Map.class.isAssignableFrom(fieldInfo.fieldClass)) {
                    objEval = JSONPath.eval(this.contextArray[0].object, str);
                }
                fieldDeserializer.setValue(obj2, objEval);
            }
        }
    }

    public boolean isEnabled(Feature feature) {
        return this.lexer.isEnabled(feature);
    }

    public Object parse() {
        return parse(null);
    }

    public Object parse(PropertyProcessable propertyProcessable, Object obj) {
        String strScanSymbolUnQuoted;
        int i10 = 0;
        if (this.lexer.token() != 12) {
            String str = "syntax error, expect {, actual " + this.lexer.tokenName();
            if (obj instanceof String) {
                str = (str + ", fieldName ") + obj;
            }
            String str2 = (str + ", ") + this.lexer.info();
            JSONArray jSONArray = new JSONArray();
            parseArray(jSONArray, obj);
            if (jSONArray.size() == 1) {
                Object obj2 = jSONArray.get(0);
                if (obj2 instanceof JSONObject) {
                    return (JSONObject) obj2;
                }
            }
            throw new JSONException(str2);
        }
        ParseContext parseContext = this.context;
        while (true) {
            try {
                this.lexer.skipWhitespace();
                char current = this.lexer.getCurrent();
                if (this.lexer.isEnabled(Feature.AllowArbitraryCommas)) {
                    while (current == ',') {
                        this.lexer.next();
                        this.lexer.skipWhitespace();
                        current = this.lexer.getCurrent();
                    }
                }
                if (current == '\"') {
                    strScanSymbolUnQuoted = this.lexer.scanSymbol(this.symbolTable, y.f128593b);
                    this.lexer.skipWhitespace();
                    if (this.lexer.getCurrent() != ':') {
                        throw new JSONException("expect ':' at " + this.lexer.pos());
                    }
                } else {
                    if (current == '}') {
                        this.lexer.next();
                        this.lexer.resetStringPosition();
                        this.lexer.nextToken(16);
                        setContext(parseContext);
                        return propertyProcessable;
                    }
                    if (current == '\'') {
                        if (!this.lexer.isEnabled(Feature.AllowSingleQuotes)) {
                            throw new JSONException("syntax error");
                        }
                        strScanSymbolUnQuoted = this.lexer.scanSymbol(this.symbolTable, '\'');
                        this.lexer.skipWhitespace();
                        if (this.lexer.getCurrent() != ':') {
                            throw new JSONException("expect ':' at " + this.lexer.pos());
                        }
                    } else {
                        if (!this.lexer.isEnabled(Feature.AllowUnQuotedFieldNames)) {
                            throw new JSONException("syntax error");
                        }
                        strScanSymbolUnQuoted = this.lexer.scanSymbolUnQuoted(this.symbolTable);
                        this.lexer.skipWhitespace();
                        char current2 = this.lexer.getCurrent();
                        if (current2 != ':') {
                            throw new JSONException("expect ':' at " + this.lexer.pos() + ", actual " + current2);
                        }
                    }
                }
                this.lexer.next();
                this.lexer.skipWhitespace();
                this.lexer.getCurrent();
                this.lexer.resetStringPosition();
                Object object = null;
                if (strScanSymbolUnQuoted != JSON.DEFAULT_TYPE_KEY || this.lexer.isEnabled(Feature.DisableSpecialKeyDetect)) {
                    this.lexer.nextToken();
                    if (i10 != 0) {
                        setContext(parseContext);
                    }
                    Type type = propertyProcessable.getType(strScanSymbolUnQuoted);
                    if (this.lexer.token() == 8) {
                        this.lexer.nextToken();
                    } else {
                        object = parseObject(type, strScanSymbolUnQuoted);
                    }
                    propertyProcessable.apply(strScanSymbolUnQuoted, object);
                    setContext(parseContext, object, strScanSymbolUnQuoted);
                    setContext(parseContext);
                    int i11 = this.lexer.token();
                    if (i11 == 20 || i11 == 15) {
                        break;
                        break;
                    }
                    if (i11 == 13) {
                        this.lexer.nextToken();
                        setContext(parseContext);
                        return propertyProcessable;
                    }
                } else {
                    Class<?> clsCheckAutoType = this.config.checkAutoType(this.lexer.scanSymbol(this.symbolTable, y.f128593b), null, this.lexer.getFeatures());
                    if (!Map.class.isAssignableFrom(clsCheckAutoType)) {
                        ObjectDeserializer deserializer = this.config.getDeserializer(clsCheckAutoType);
                        this.lexer.nextToken(16);
                        setResolveStatus(2);
                        if (parseContext != null && !(obj instanceof Integer)) {
                            popContext();
                        }
                        Map map = (Map) deserializer.deserialze(this, clsCheckAutoType, obj);
                        setContext(parseContext);
                        return map;
                    }
                    this.lexer.nextToken(16);
                    if (this.lexer.token() == 13) {
                        this.lexer.nextToken(16);
                        setContext(parseContext);
                        return propertyProcessable;
                    }
                }
                i10++;
            } catch (Throwable th2) {
                setContext(parseContext);
                throw th2;
            }
        }
        setContext(parseContext);
        return propertyProcessable;
    }

    public Object parse(Object obj) {
        JSONLexer jSONLexer = this.lexer;
        int i10 = jSONLexer.token();
        if (i10 == 2) {
            Number numberIntegerValue = jSONLexer.integerValue();
            jSONLexer.nextToken();
            return numberIntegerValue;
        }
        if (i10 == 3) {
            Number numberDecimalValue = jSONLexer.decimalValue(jSONLexer.isEnabled(Feature.UseBigDecimal));
            jSONLexer.nextToken();
            return numberDecimalValue;
        }
        if (i10 == 4) {
            String strStringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(16);
            if (jSONLexer.isEnabled(Feature.AllowISO8601DateFormat)) {
                JSONScanner jSONScanner = new JSONScanner(strStringVal);
                try {
                    if (jSONScanner.scanISO8601DateIfMatch()) {
                        return jSONScanner.getCalendar().getTime();
                    }
                } finally {
                    jSONScanner.close();
                }
            }
            return strStringVal;
        }
        if (i10 == 12) {
            return parseObject(new JSONObject(jSONLexer.isEnabled(Feature.OrderedField)), obj);
        }
        if (i10 == 14) {
            JSONArray jSONArray = new JSONArray();
            parseArray(jSONArray, obj);
            return jSONLexer.isEnabled(Feature.UseObjectArray) ? jSONArray.toArray() : jSONArray;
        }
        if (i10 == 18) {
            if ("NaN".equals(jSONLexer.stringVal())) {
                jSONLexer.nextToken();
                return null;
            }
            throw new JSONException("syntax error, " + jSONLexer.info());
        }
        if (i10 == 26) {
            byte[] bArrBytesValue = jSONLexer.bytesValue();
            jSONLexer.nextToken();
            return bArrBytesValue;
        }
        switch (i10) {
            case 6:
                jSONLexer.nextToken();
                return Boolean.TRUE;
            case 7:
                jSONLexer.nextToken();
                return Boolean.FALSE;
            case 8:
                jSONLexer.nextToken();
                return null;
            case 9:
                jSONLexer.nextToken(18);
                if (jSONLexer.token() != 18) {
                    throw new JSONException("syntax error");
                }
                jSONLexer.nextToken(10);
                accept(10);
                long jLongValue = jSONLexer.integerValue().longValue();
                accept(2);
                accept(11);
                return new Date(jLongValue);
            default:
                switch (i10) {
                    case 20:
                        if (jSONLexer.isBlankInput()) {
                            return null;
                        }
                        throw new JSONException("unterminated json string, " + jSONLexer.info());
                    case 21:
                        jSONLexer.nextToken();
                        HashSet hashSet = new HashSet();
                        parseArray(hashSet, obj);
                        return hashSet;
                    case 22:
                        jSONLexer.nextToken();
                        TreeSet treeSet = new TreeSet();
                        parseArray(treeSet, obj);
                        return treeSet;
                    case 23:
                        jSONLexer.nextToken();
                        return null;
                    default:
                        throw new JSONException("syntax error, " + jSONLexer.info());
                }
        }
    }

    public <T> List<T> parseArray(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        parseArray((Class<?>) cls, (Collection) arrayList);
        return arrayList;
    }

    public void parseArray(Class<?> cls, Collection collection) {
        parseArray((Type) cls, collection);
    }

    public void parseArray(Type type, Collection collection) {
        parseArray(type, collection, null);
    }

    public void parseArray(Type type, Collection collection, Object obj) {
        ObjectDeserializer deserializer;
        int i10 = this.lexer.token();
        if (i10 == 21 || i10 == 22) {
            this.lexer.nextToken();
            i10 = this.lexer.token();
        }
        if (i10 != 14) {
            throw new JSONException("exepct '[', but " + JSONToken.name(i10) + ", " + this.lexer.info());
        }
        if (Integer.TYPE == type) {
            deserializer = IntegerCodec.instance;
            this.lexer.nextToken(2);
        } else if (String.class == type) {
            deserializer = StringCodec.instance;
            this.lexer.nextToken(4);
        } else {
            deserializer = this.config.getDeserializer(type);
            this.lexer.nextToken(deserializer.getFastMatchToken());
        }
        ParseContext parseContext = this.context;
        setContext(collection, obj);
        int i11 = 0;
        while (true) {
            try {
                if (this.lexer.isEnabled(Feature.AllowArbitraryCommas)) {
                    while (this.lexer.token() == 16) {
                        this.lexer.nextToken();
                    }
                }
                if (this.lexer.token() == 15) {
                    setContext(parseContext);
                    this.lexer.nextToken(16);
                    return;
                }
                Object objDeserialze = null;
                if (Integer.TYPE == type) {
                    collection.add(IntegerCodec.instance.deserialze(this, null, null));
                } else if (String.class == type) {
                    if (this.lexer.token() == 4) {
                        objDeserialze = this.lexer.stringVal();
                        this.lexer.nextToken(16);
                    } else {
                        Object obj2 = parse();
                        if (obj2 != null) {
                            objDeserialze = obj2.toString();
                        }
                    }
                    collection.add(objDeserialze);
                } else {
                    if (this.lexer.token() == 8) {
                        this.lexer.nextToken();
                    } else {
                        objDeserialze = deserializer.deserialze(this, type, Integer.valueOf(i11));
                    }
                    collection.add(objDeserialze);
                    checkListResolve(collection);
                }
                if (this.lexer.token() == 16) {
                    this.lexer.nextToken(deserializer.getFastMatchToken());
                }
                i11++;
            } catch (Throwable th2) {
                setContext(parseContext);
                throw th2;
            }
        }
    }

    public final void parseArray(Collection collection) {
        parseArray(collection, (Object) null);
    }

    public final void parseArray(Collection collection, Object obj) {
        String strStringVal;
        Object time;
        JSONArray jSONArray;
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token() == 21 || jSONLexer.token() == 22) {
            jSONLexer.nextToken();
        }
        if (jSONLexer.token() != 14) {
            throw new JSONException("syntax error, expect [, actual " + JSONToken.name(jSONLexer.token()) + ", pos " + jSONLexer.pos() + ", fieldName " + obj);
        }
        jSONLexer.nextToken(4);
        ParseContext parseContext = this.context;
        setContext(collection, obj);
        int i10 = 0;
        while (true) {
            try {
                if (jSONLexer.isEnabled(Feature.AllowArbitraryCommas)) {
                    while (jSONLexer.token() == 16) {
                        jSONLexer.nextToken();
                    }
                }
                int i11 = jSONLexer.token();
                Object objDecimalValue = null;
                objDecimalValue = null;
                if (i11 == 2) {
                    Number numberIntegerValue = jSONLexer.integerValue();
                    jSONLexer.nextToken(16);
                    objDecimalValue = numberIntegerValue;
                } else if (i11 == 3) {
                    objDecimalValue = jSONLexer.isEnabled(Feature.UseBigDecimal) ? jSONLexer.decimalValue(true) : jSONLexer.decimalValue(false);
                    jSONLexer.nextToken(16);
                } else if (i11 == 4) {
                    strStringVal = jSONLexer.stringVal();
                    jSONLexer.nextToken(16);
                    if (jSONLexer.isEnabled(Feature.AllowISO8601DateFormat)) {
                        JSONScanner jSONScanner = new JSONScanner(strStringVal);
                        if (jSONScanner.scanISO8601DateIfMatch()) {
                            objDecimalValue = strStringVal;
                            time = strStringVal;
                            time = jSONScanner.getCalendar().getTime();
                        }
                        objDecimalValue = strStringVal;
                        time = strStringVal;
                        jSONScanner.close();
                        objDecimalValue = time;
                    }
                } else if (i11 == 6) {
                    Boolean bool = Boolean.TRUE;
                    jSONLexer.nextToken(16);
                    objDecimalValue = bool;
                } else if (i11 == 7) {
                    Boolean bool2 = Boolean.FALSE;
                    jSONLexer.nextToken(16);
                    objDecimalValue = bool2;
                } else if (i11 == 8) {
                    jSONLexer.nextToken(4);
                } else if (i11 == 12) {
                    objDecimalValue = parseObject(new JSONObject(jSONLexer.isEnabled(Feature.OrderedField)), Integer.valueOf(i10));
                } else {
                    if (i11 == 20) {
                        throw new JSONException("unclosed jsonArray");
                    }
                    if (i11 == 23) {
                        jSONLexer.nextToken(4);
                    } else if (i11 == 14) {
                        jSONArray = new JSONArray();
                        parseArray(jSONArray, Integer.valueOf(i10));
                        if (jSONLexer.isEnabled(Feature.UseObjectArray)) {
                            objDecimalValue = jSONArray;
                            objDecimalValue = jSONArray.toArray();
                        }
                    } else {
                        if (i11 == 15) {
                            jSONLexer.nextToken(16);
                            setContext(parseContext);
                            return;
                        }
                        objDecimalValue = parse();
                    }
                }
                objDecimalValue = strStringVal;
                objDecimalValue = jSONArray;
                collection.add(objDecimalValue);
                checkListResolve(collection);
                if (jSONLexer.token() == 16) {
                    jSONLexer.nextToken(4);
                }
                i10++;
            } catch (Throwable th2) {
                setContext(parseContext);
                throw th2;
            }
        }
    }

    public Object[] parseArray(Type[] typeArr) {
        Object objCast;
        Class<?> componentType;
        boolean zIsArray;
        int i10 = 8;
        if (this.lexer.token() == 8) {
            this.lexer.nextToken(16);
            return null;
        }
        int i11 = 14;
        if (this.lexer.token() != 14) {
            throw new JSONException("syntax error : " + this.lexer.tokenName());
        }
        Object[] objArr = new Object[typeArr.length];
        if (typeArr.length == 0) {
            this.lexer.nextToken(15);
            if (this.lexer.token() != 15) {
                throw new JSONException("syntax error");
            }
            this.lexer.nextToken(16);
            return new Object[0];
        }
        this.lexer.nextToken(2);
        int i12 = 0;
        while (i12 < typeArr.length) {
            if (this.lexer.token() == i10) {
                this.lexer.nextToken(16);
                objCast = null;
            } else {
                Type type = typeArr[i12];
                if (type == Integer.TYPE || type == Integer.class) {
                    if (this.lexer.token() == 2) {
                        objCast = Integer.valueOf(this.lexer.intValue());
                        this.lexer.nextToken(16);
                    } else {
                        objCast = TypeUtils.cast(parse(), type, this.config);
                    }
                } else if (type != String.class) {
                    if (i12 == typeArr.length - 1 && (type instanceof Class)) {
                        Class cls = (Class) type;
                        zIsArray = cls.isArray();
                        componentType = cls.getComponentType();
                    } else {
                        componentType = null;
                        zIsArray = false;
                    }
                    if (!zIsArray || this.lexer.token() == i11) {
                        objCast = this.config.getDeserializer(type).deserialze(this, type, Integer.valueOf(i12));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        ObjectDeserializer deserializer = this.config.getDeserializer(componentType);
                        int fastMatchToken = deserializer.getFastMatchToken();
                        if (this.lexer.token() != 15) {
                            while (true) {
                                arrayList.add(deserializer.deserialze(this, type, null));
                                if (this.lexer.token() != 16) {
                                    break;
                                }
                                this.lexer.nextToken(fastMatchToken);
                            }
                            if (this.lexer.token() != 15) {
                                throw new JSONException("syntax error :" + JSONToken.name(this.lexer.token()));
                            }
                        }
                        objCast = TypeUtils.cast(arrayList, type, this.config);
                    }
                } else if (this.lexer.token() == 4) {
                    objCast = this.lexer.stringVal();
                    this.lexer.nextToken(16);
                } else {
                    objCast = TypeUtils.cast(parse(), type, this.config);
                }
            }
            objArr[i12] = objCast;
            if (this.lexer.token() == 15) {
                break;
            }
            if (this.lexer.token() != 16) {
                throw new JSONException("syntax error :" + JSONToken.name(this.lexer.token()));
            }
            if (i12 == typeArr.length - 1) {
                this.lexer.nextToken(15);
            } else {
                this.lexer.nextToken(2);
            }
            i12++;
            i10 = 8;
            i11 = 14;
        }
        if (this.lexer.token() != 15) {
            throw new JSONException("syntax error");
        }
        this.lexer.nextToken(16);
        return objArr;
    }

    public Object parseArrayWithType(Type type) {
        if (this.lexer.token() == 8) {
            this.lexer.nextToken();
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length != 1) {
            throw new JSONException("not support type " + type);
        }
        Type type2 = actualTypeArguments[0];
        if (type2 instanceof Class) {
            ArrayList arrayList = new ArrayList();
            parseArray((Class<?>) type2, (Collection) arrayList);
            return arrayList;
        }
        if (type2 instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type2;
            Type type3 = wildcardType.getUpperBounds()[0];
            if (!Object.class.equals(type3)) {
                ArrayList arrayList2 = new ArrayList();
                parseArray((Class<?>) type3, (Collection) arrayList2);
                return arrayList2;
            }
            if (wildcardType.getLowerBounds().length == 0) {
                return parse();
            }
            throw new JSONException("not support type : " + type);
        }
        if (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length != 1) {
                throw new JSONException("not support : " + typeVariable);
            }
            Type type4 = bounds[0];
            if (type4 instanceof Class) {
                ArrayList arrayList3 = new ArrayList();
                parseArray((Class<?>) type4, (Collection) arrayList3);
                return arrayList3;
            }
        }
        if (type2 instanceof ParameterizedType) {
            ArrayList arrayList4 = new ArrayList();
            parseArray((ParameterizedType) type2, arrayList4);
            return arrayList4;
        }
        throw new JSONException("TODO : " + type);
    }

    public void parseExtra(Object obj, String str) {
        this.lexer.nextTokenWithColon();
        List<ExtraTypeProvider> list = this.extraTypeProviders;
        Type extraType = null;
        if (list != null) {
            Iterator<ExtraTypeProvider> it = list.iterator();
            while (it.hasNext()) {
                extraType = it.next().getExtraType(obj, str);
            }
        }
        Object object = extraType == null ? parse() : parseObject(extraType);
        if (obj instanceof ExtraProcessable) {
            ((ExtraProcessable) obj).processExtra(str, object);
            return;
        }
        List<ExtraProcessor> list2 = this.extraProcessors;
        if (list2 != null) {
            Iterator<ExtraProcessor> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().processExtra(obj, str, object);
            }
        }
        if (this.resolveStatus == 1) {
            this.resolveStatus = 0;
        }
    }

    public Object parseKey() {
        if (this.lexer.token() != 18) {
            return parse(null);
        }
        String strStringVal = this.lexer.stringVal();
        this.lexer.nextToken(16);
        return strStringVal;
    }

    public JSONObject parseObject() {
        return (JSONObject) parseObject((Map) new JSONObject(this.lexer.isEnabled(Feature.OrderedField)));
    }

    public <T> T parseObject(Class<T> cls) {
        return (T) parseObject(cls, (Object) null);
    }

    public <T> T parseObject(Type type) {
        return (T) parseObject(type, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T parseObject(Type type, Object obj) {
        int i10 = this.lexer.token();
        if (i10 == 8) {
            this.lexer.nextToken();
            return null;
        }
        if (i10 == 4) {
            if (type == byte[].class) {
                T t10 = (T) this.lexer.bytesValue();
                this.lexer.nextToken();
                return t10;
            }
            if (type == char[].class) {
                String strStringVal = this.lexer.stringVal();
                this.lexer.nextToken();
                return (T) strStringVal.toCharArray();
            }
        }
        try {
            return (T) this.config.getDeserializer(type).deserialze(this, type, obj);
        } catch (JSONException e10) {
            throw e10;
        } catch (Throwable th2) {
            throw new JSONException(th2.getMessage(), th2);
        }
    }

    public Object parseObject(Map map) {
        return parseObject(map, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0205 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0373 A[PHI: r2
  0x0373: PHI (r2v32 java.lang.Object) = (r2v30 java.lang.Object), (r2v34 java.lang.Object), (r2v34 java.lang.Object) binds: [B:199:0x0371, B:189:0x0359, B:192:0x035f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:213:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e7 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x03f5 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:242:0x040d A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x041c A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:246:0x0427 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0436  */
    /* JADX WARN: Code duplicated, block: B:262:0x0469 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:266:0x0476 A[Catch: all -> 0x0602, TRY_LEAVE, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x0486 A[Catch: all -> 0x0602, TRY_ENTER, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x04ab A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x04b5 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:277:0x04bb A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x04c9 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x04df A[Catch: all -> 0x0602, TRY_ENTER, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:291:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04f6 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:295:0x04fb A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:298:0x0503  */
    /* JADX WARN: Code duplicated, block: B:301:0x050c A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x051d A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:304:0x052a A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x052f  */
    /* JADX WARN: Code duplicated, block: B:308:0x0534 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:309:0x0536 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:310:0x053b  */
    /* JADX WARN: Code duplicated, block: B:313:0x0544 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x054f  */
    /* JADX WARN: Code duplicated, block: B:316:0x0553 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x0559 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:321:0x055f A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x056b A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x0580 A[Catch: all -> 0x0602, TRY_ENTER, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x0588 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x058a A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:334:0x058f A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:337:0x05af A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:342:0x05c8 A[Catch: all -> 0x0602, TRY_ENTER, TryCatch #1 {all -> 0x0602, blocks: (B:24:0x0074, B:26:0x0078, B:29:0x0082, B:32:0x0095, B:36:0x00ad, B:110:0x0205, B:111:0x020b, B:113:0x0216, B:115:0x021e, B:119:0x0232, B:121:0x0240, B:124:0x0253, B:126:0x0260, B:128:0x026d, B:129:0x0270, B:131:0x027a, B:132:0x0288, B:134:0x028e, B:136:0x029c, B:138:0x02a4, B:143:0x02b3, B:144:0x02b9, B:146:0x02c1, B:147:0x02c6, B:151:0x02cf, B:152:0x02d6, B:153:0x02d7, B:156:0x02e1, B:158:0x02e5, B:160:0x02eb, B:161:0x02ee, B:163:0x02f4, B:166:0x0301, B:172:0x031b, B:173:0x031f, B:122:0x0246, B:180:0x032e, B:182:0x0336, B:184:0x0340, B:186:0x0351, B:188:0x0355, B:190:0x035b, B:193:0x0360, B:195:0x0364, B:214:0x03ae, B:216:0x03b6, B:219:0x03bf, B:220:0x03c4, B:196:0x0367, B:198:0x036f, B:201:0x0375, B:202:0x0381, B:205:0x038a, B:208:0x0390, B:211:0x0396, B:212:0x03a2, B:221:0x03c5, B:222:0x03e3, B:225:0x03e7, B:227:0x03eb, B:229:0x03ef, B:232:0x03f5, B:236:0x03fd, B:242:0x040d, B:244:0x041c, B:246:0x0427, B:247:0x042f, B:248:0x0432, B:260:0x045e, B:262:0x0469, B:266:0x0476, B:269:0x0486, B:270:0x04a6, B:255:0x0442, B:257:0x044c, B:259:0x045b, B:258:0x0451, B:273:0x04ab, B:275:0x04b5, B:277:0x04bb, B:278:0x04be, B:280:0x04c9, B:281:0x04cd, B:283:0x04d8, B:286:0x04df, B:289:0x04ec, B:290:0x04f1, B:293:0x04f6, B:295:0x04fb, B:299:0x0504, B:301:0x050c, B:304:0x052a, B:306:0x0530, B:309:0x0536, B:311:0x053c, B:313:0x0544, B:316:0x0553, B:319:0x055b, B:321:0x055f, B:322:0x0566, B:324:0x056b, B:325:0x056e, B:327:0x0576, B:330:0x0580, B:333:0x058a, B:334:0x058f, B:335:0x0594, B:336:0x05ae, B:302:0x051d, B:337:0x05af, B:339:0x05c1, B:342:0x05c8, B:345:0x05d5, B:346:0x05f5, B:39:0x00bf, B:40:0x00dd, B:43:0x00e2, B:45:0x00ed, B:47:0x00f1, B:49:0x00f5, B:52:0x00fb, B:59:0x010a, B:61:0x0112, B:64:0x0122, B:65:0x013a, B:66:0x013b, B:67:0x0140, B:78:0x0155, B:79:0x015b, B:81:0x0162, B:83:0x016b, B:85:0x0173, B:87:0x0178, B:90:0x0180, B:91:0x0198, B:82:0x0167, B:92:0x0199, B:93:0x01b1, B:99:0x01bb, B:101:0x01c3, B:104:0x01d4, B:105:0x01f4, B:106:0x01f5, B:107:0x01fa, B:108:0x01fb, B:347:0x05f6, B:348:0x05fb, B:349:0x05fc, B:350:0x0601), top: B:355:0x0074, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:370:0x0472 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x0576 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0594 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x05c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x05d5 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:269:0x0486, please report this as an issue */
    public final Object parseObject(Map map, Object obj) {
        Object objScanSymbolUnQuoted;
        boolean z10;
        char current;
        char c10;
        boolean z11;
        Map jSONObject;
        ParseContext context;
        Object object;
        String string;
        Type typeResolve;
        JSONArray jSONArray;
        JSONArray array;
        Object obj2;
        char current2;
        String strStringVal;
        Object obj3;
        JSONScanner jSONScanner;
        Object time;
        ParseContext parseContext;
        ParseContext context2;
        Object obj4;
        Object obj5;
        Object obj6;
        Class<?> clsCheckAutoType;
        Object map2;
        FieldDeserializer fieldDeserializer;
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken();
            return null;
        }
        if (jSONLexer.token() == 13) {
            jSONLexer.nextToken();
            return map;
        }
        if (jSONLexer.token() == 4 && jSONLexer.stringVal().length() == 0) {
            jSONLexer.nextToken();
            return map;
        }
        if (jSONLexer.token() != 12 && jSONLexer.token() != 16) {
            throw new JSONException("syntax error, expect {, actual " + jSONLexer.tokenName() + ", " + jSONLexer.info());
        }
        ParseContext parseContext2 = this.context;
        try {
            Map innerMap = map instanceof JSONObject ? ((JSONObject) map).getInnerMap() : map;
            boolean z12 = false;
            while (true) {
                jSONLexer.skipWhitespace();
                char current3 = jSONLexer.getCurrent();
                if (jSONLexer.isEnabled(Feature.AllowArbitraryCommas)) {
                    while (current3 == ',') {
                        jSONLexer.next();
                        jSONLexer.skipWhitespace();
                        current3 = jSONLexer.getCurrent();
                    }
                }
                boolean z13 = true;
                if (current3 == '\"') {
                    objScanSymbolUnQuoted = jSONLexer.scanSymbol(this.symbolTable, y.f128593b);
                    jSONLexer.skipWhitespace();
                    if (jSONLexer.getCurrent() != ':') {
                        throw new JSONException("expect ':' at " + jSONLexer.pos() + ", name " + objScanSymbolUnQuoted);
                    }
                } else {
                    if (current3 == '}') {
                        jSONLexer.next();
                        jSONLexer.resetStringPosition();
                        jSONLexer.nextToken();
                        if (!z12) {
                            ParseContext parseContext3 = this.context;
                            if (parseContext3 != null && obj == parseContext3.fieldName && map == parseContext3.object) {
                                parseContext2 = parseContext3;
                            } else {
                                ParseContext context3 = setContext(map, obj);
                                if (parseContext2 == null) {
                                    parseContext2 = context3;
                                }
                            }
                        }
                        setContext(parseContext2);
                        return map;
                    }
                    if (current3 == '\'') {
                        if (!jSONLexer.isEnabled(Feature.AllowSingleQuotes)) {
                            throw new JSONException("syntax error");
                        }
                        objScanSymbolUnQuoted = jSONLexer.scanSymbol(this.symbolTable, '\'');
                        jSONLexer.skipWhitespace();
                        if (jSONLexer.getCurrent() != ':') {
                            throw new JSONException("expect ':' at " + jSONLexer.pos());
                        }
                    } else {
                        if (current3 == 26) {
                            throw new JSONException("syntax error");
                        }
                        if (current3 == ',') {
                            throw new JSONException("syntax error");
                        }
                        if ((current3 < '0' || current3 > '9') && current3 != '-') {
                            if (current3 == '{' || current3 == '[') {
                                jSONLexer.nextToken();
                                objScanSymbolUnQuoted = parse();
                                z10 = true;
                            } else {
                                if (!jSONLexer.isEnabled(Feature.AllowUnQuotedFieldNames)) {
                                    throw new JSONException("syntax error");
                                }
                                objScanSymbolUnQuoted = jSONLexer.scanSymbolUnQuoted(this.symbolTable);
                                jSONLexer.skipWhitespace();
                                char current4 = jSONLexer.getCurrent();
                                if (current4 != ':') {
                                    throw new JSONException("expect ':' at " + jSONLexer.pos() + ", actual " + current4);
                                }
                            }
                            if (!z10) {
                                jSONLexer.next();
                                jSONLexer.skipWhitespace();
                            }
                            current = jSONLexer.getCurrent();
                            jSONLexer.resetStringPosition();
                            if (objScanSymbolUnQuoted == JSON.DEFAULT_TYPE_KEY || jSONLexer.isEnabled(Feature.DisableSpecialKeyDetect)) {
                                if (objScanSymbolUnQuoted != "$ref" && parseContext2 != null && !jSONLexer.isEnabled(Feature.DisableSpecialKeyDetect)) {
                                    jSONLexer.nextToken(4);
                                    if (jSONLexer.token() != 4) {
                                        throw new JSONException("illegal ref, " + JSONToken.name(jSONLexer.token()));
                                    }
                                    String strStringVal2 = jSONLexer.stringVal();
                                    jSONLexer.nextToken(13);
                                    if ("@".equals(strStringVal2)) {
                                        ParseContext parseContext4 = this.context;
                                        if (parseContext4 != null) {
                                            obj5 = parseContext4.object;
                                            if ((obj5 instanceof Object[]) || (obj5 instanceof Collection)) {
                                                obj4 = obj5;
                                            } else {
                                                ParseContext parseContext5 = parseContext4.parent;
                                                if (parseContext5 != null) {
                                                    obj4 = parseContext5.object;
                                                } else {
                                                    obj4 = null;
                                                }
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                    } else {
                                        if ("..".equals(strStringVal2)) {
                                            obj5 = parseContext2.object;
                                            if (obj5 != null) {
                                                obj4 = obj5;
                                            } else {
                                                addResolveTask(new ResolveTask(parseContext2, strStringVal2));
                                                setResolveStatus(1);
                                            }
                                        } else if ("$".equals(strStringVal2)) {
                                            ParseContext parseContext6 = parseContext2;
                                            while (true) {
                                                ParseContext parseContext7 = parseContext6.parent;
                                                if (parseContext7 == null) {
                                                    break;
                                                }
                                                parseContext6 = parseContext7;
                                            }
                                            Object obj7 = parseContext6.object;
                                            if (obj7 != null) {
                                                obj4 = obj7;
                                            } else {
                                                addResolveTask(new ResolveTask(parseContext6, strStringVal2));
                                                setResolveStatus(1);
                                            }
                                        } else {
                                            addResolveTask(new ResolveTask(parseContext2, strStringVal2));
                                            setResolveStatus(1);
                                        }
                                        obj4 = null;
                                    }
                                    if (jSONLexer.token() != 13) {
                                        throw new JSONException("syntax error");
                                    }
                                    jSONLexer.nextToken(16);
                                    setContext(parseContext2);
                                    return obj4;
                                }
                                if (!z12) {
                                    parseContext = this.context;
                                    if (parseContext == null && obj == parseContext.fieldName && map == parseContext.object) {
                                        parseContext2 = parseContext;
                                    } else {
                                        context2 = setContext(map, obj);
                                        if (parseContext2 == null) {
                                            parseContext2 = context2;
                                        }
                                        z12 = true;
                                    }
                                }
                                if (map.getClass() == JSONObject.class && objScanSymbolUnQuoted == null) {
                                    objScanSymbolUnQuoted = "null";
                                }
                                if (current == '\"') {
                                    jSONLexer.scanString();
                                    strStringVal = jSONLexer.stringVal();
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
                                    innerMap.put(objScanSymbolUnQuoted, obj3);
                                    obj2 = obj3;
                                } else if ((current < '0' && current <= '9') || current == '-') {
                                    jSONLexer.scanNumber();
                                    Number numberIntegerValue = jSONLexer.token() == 2 ? jSONLexer.integerValue() : jSONLexer.decimalValue(jSONLexer.isEnabled(Feature.UseBigDecimal));
                                    innerMap.put(objScanSymbolUnQuoted, numberIntegerValue);
                                    obj2 = numberIntegerValue;
                                } else if (current == '[') {
                                    jSONLexer.nextToken();
                                    jSONArray = new JSONArray();
                                    if (obj != null) {
                                        obj.getClass();
                                    }
                                    if (obj == null) {
                                        setContext(parseContext2);
                                    }
                                    parseArray(jSONArray, objScanSymbolUnQuoted);
                                    array = jSONArray;
                                    if (jSONLexer.isEnabled(Feature.UseObjectArray)) {
                                        array = jSONArray.toArray();
                                    }
                                    innerMap.put(objScanSymbolUnQuoted, array);
                                    if (jSONLexer.token() == 13) {
                                        jSONLexer.nextToken();
                                        setContext(parseContext2);
                                        return map;
                                    }
                                    if (jSONLexer.token() != 16) {
                                        throw new JSONException("syntax error");
                                    }
                                    c10 = 16;
                                } else if (current == '{') {
                                    jSONLexer.nextToken();
                                    if (obj == null && obj.getClass() == Integer.class) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (jSONLexer.isEnabled(Feature.CustomMapDeserializer)) {
                                        jSONObject = ((MapDeserializer) this.config.getDeserializer(Map.class)).createMap(Map.class);
                                    } else {
                                        jSONObject = new JSONObject(jSONLexer.isEnabled(Feature.OrderedField));
                                    }
                                    if (z11) {
                                        context = null;
                                    } else {
                                        context = setContext(parseContext2, jSONObject, objScanSymbolUnQuoted);
                                    }
                                    if (this.fieldTypeResolver == null) {
                                        object = null;
                                        z13 = false;
                                    } else {
                                        if (objScanSymbolUnQuoted != null) {
                                            string = objScanSymbolUnQuoted.toString();
                                        } else {
                                            string = null;
                                        }
                                        typeResolve = this.fieldTypeResolver.resolve(map, string);
                                        if (typeResolve != null) {
                                            object = this.config.getDeserializer(typeResolve).deserialze(this, typeResolve, objScanSymbolUnQuoted);
                                        } else {
                                            object = null;
                                            z13 = false;
                                        }
                                    }
                                    if (!z13) {
                                        object = parseObject(jSONObject, objScanSymbolUnQuoted);
                                    }
                                    if (context != null && jSONObject != object) {
                                        context.object = map;
                                    }
                                    if (objScanSymbolUnQuoted != null) {
                                        checkMapResolve(map, objScanSymbolUnQuoted.toString());
                                    }
                                    innerMap.put(objScanSymbolUnQuoted, object);
                                    if (z11) {
                                        setContext(object, objScanSymbolUnQuoted);
                                    }
                                    if (jSONLexer.token() == 13) {
                                        jSONLexer.nextToken();
                                        setContext(parseContext2);
                                        setContext(parseContext2);
                                        return map;
                                    }
                                    if (jSONLexer.token() != 16) {
                                        throw new JSONException("syntax error, " + jSONLexer.tokenName());
                                    }
                                    if (z11) {
                                        popContext();
                                    } else {
                                        setContext(parseContext2);
                                    }
                                    c10 = 16;
                                } else {
                                    jSONLexer.nextToken();
                                    innerMap.put(objScanSymbolUnQuoted, parse());
                                    if (jSONLexer.token() == 13) {
                                        jSONLexer.nextToken();
                                        setContext(parseContext2);
                                        return map;
                                    }
                                    c10 = 16;
                                    if (jSONLexer.token() != 16) {
                                        throw new JSONException("syntax error, position at " + jSONLexer.pos() + ", name " + objScanSymbolUnQuoted);
                                    }
                                }
                                jSONLexer.skipWhitespace();
                                current2 = jSONLexer.getCurrent();
                                if (current2 == ',') {
                                    if (current2 == '}') {
                                        jSONLexer.next();
                                        jSONLexer.resetStringPosition();
                                        jSONLexer.nextToken();
                                        setContext(obj2, objScanSymbolUnQuoted);
                                        setContext(parseContext2);
                                        return map;
                                    }
                                    throw new JSONException("syntax error, position at " + jSONLexer.pos() + ", name " + objScanSymbolUnQuoted);
                                }
                                jSONLexer.next();
                                c10 = 16;
                            } else {
                                String strScanSymbol = jSONLexer.scanSymbol(this.symbolTable, y.f128593b);
                                if (jSONLexer.isEnabled(Feature.IgnoreAutoType)) {
                                    obj6 = null;
                                } else {
                                    if (map == null || !map.getClass().getName().equals(strScanSymbol)) {
                                        obj6 = null;
                                        clsCheckAutoType = this.config.checkAutoType(strScanSymbol, null, jSONLexer.getFeatures());
                                    } else {
                                        clsCheckAutoType = map.getClass();
                                        obj6 = null;
                                    }
                                    if (clsCheckAutoType != null) {
                                        jSONLexer.nextToken(16);
                                        if (jSONLexer.token() == 13) {
                                            jSONLexer.nextToken(16);
                                            try {
                                                ObjectDeserializer deserializer = this.config.getDeserializer(clsCheckAutoType);
                                                if (deserializer instanceof JavaBeanDeserializer) {
                                                    JavaBeanDeserializer javaBeanDeserializer = (JavaBeanDeserializer) deserializer;
                                                    map2 = javaBeanDeserializer.createInstance(this, clsCheckAutoType);
                                                    for (Map.Entry entry : innerMap.entrySet()) {
                                                        Object key = entry.getKey();
                                                        if ((key instanceof String) && (fieldDeserializer = javaBeanDeserializer.getFieldDeserializer((String) key)) != null) {
                                                            fieldDeserializer.setValue(map2, entry.getValue());
                                                        }
                                                    }
                                                } else {
                                                    map2 = obj6;
                                                }
                                                if (map2 == null) {
                                                    map2 = clsCheckAutoType == Cloneable.class ? new HashMap() : "java.util.Collections$EmptyMap".equals(strScanSymbol) ? Collections.emptyMap() : clsCheckAutoType.newInstance();
                                                }
                                                setContext(parseContext2);
                                                return map2;
                                            } catch (Exception e10) {
                                                throw new JSONException("create instance error", e10);
                                            }
                                        }
                                        setResolveStatus(2);
                                        ParseContext parseContext8 = this.context;
                                        if (parseContext8 != null && obj != null && !(obj instanceof Integer) && !(parseContext8.fieldName instanceof Integer)) {
                                            popContext();
                                        }
                                        if (map.size() > 0) {
                                            Object objCast = TypeUtils.cast((Object) map, (Class<Object>) clsCheckAutoType, this.config);
                                            parseObject(objCast);
                                            setContext(parseContext2);
                                            return objCast;
                                        }
                                        ObjectDeserializer deserializer2 = this.config.getDeserializer(clsCheckAutoType);
                                        Class<?> cls = deserializer2.getClass();
                                        if (JavaBeanDeserializer.class.isAssignableFrom(cls) && cls != JavaBeanDeserializer.class && cls != ThrowableDeserializer.class) {
                                            setResolveStatus(0);
                                        }
                                        Object objDeserialze = deserializer2.deserialze(this, clsCheckAutoType, obj);
                                        setContext(parseContext2);
                                        return objDeserialze;
                                    }
                                    innerMap.put(JSON.DEFAULT_TYPE_KEY, strScanSymbol);
                                }
                            }
                        } else {
                            jSONLexer.resetStringPosition();
                            jSONLexer.scanNumber();
                            try {
                                Object objIntegerValue = jSONLexer.token() == 2 ? jSONLexer.integerValue() : jSONLexer.decimalValue(true);
                                Object string2 = objIntegerValue;
                                if (jSONLexer.isEnabled(Feature.NonStringKeyAsString)) {
                                    string2 = objIntegerValue.toString();
                                }
                                objScanSymbolUnQuoted = string2;
                                if (jSONLexer.getCurrent() != ':') {
                                    throw new JSONException("parse number key error" + jSONLexer.info());
                                }
                            } catch (NumberFormatException unused) {
                                throw new JSONException("parse number key error" + jSONLexer.info());
                            }
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                    jSONLexer.next();
                    jSONLexer.skipWhitespace();
                }
                current = jSONLexer.getCurrent();
                jSONLexer.resetStringPosition();
                if (objScanSymbolUnQuoted == JSON.DEFAULT_TYPE_KEY) {
                }
                if (objScanSymbolUnQuoted != "$ref") {
                }
                if (!z12) {
                    parseContext = this.context;
                    if (parseContext == null) {
                        context2 = setContext(map, obj);
                        if (parseContext2 == null) {
                            parseContext2 = context2;
                        }
                        z12 = true;
                    } else {
                        context2 = setContext(map, obj);
                        if (parseContext2 == null) {
                            parseContext2 = context2;
                        }
                        z12 = true;
                    }
                }
                if (map.getClass() == JSONObject.class) {
                    objScanSymbolUnQuoted = "null";
                }
                if (current == '\"') {
                    jSONLexer.scanString();
                    strStringVal = jSONLexer.stringVal();
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
                    innerMap.put(objScanSymbolUnQuoted, obj3);
                    obj2 = obj3;
                } else if (current < '0') {
                    if (current == '[') {
                        jSONLexer.nextToken();
                        jSONArray = new JSONArray();
                        if (obj != null) {
                            obj.getClass();
                        }
                        if (obj == null) {
                            setContext(parseContext2);
                        }
                        parseArray(jSONArray, objScanSymbolUnQuoted);
                        array = jSONArray;
                        if (jSONLexer.isEnabled(Feature.UseObjectArray)) {
                            array = jSONArray.toArray();
                        }
                        innerMap.put(objScanSymbolUnQuoted, array);
                        if (jSONLexer.token() == 13) {
                            jSONLexer.nextToken();
                            setContext(parseContext2);
                            return map;
                        }
                        if (jSONLexer.token() != 16) {
                            throw new JSONException("syntax error");
                        }
                        c10 = 16;
                    } else if (current == '{') {
                        jSONLexer.nextToken();
                        if (obj == null) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (jSONLexer.isEnabled(Feature.CustomMapDeserializer)) {
                            jSONObject = ((MapDeserializer) this.config.getDeserializer(Map.class)).createMap(Map.class);
                        } else {
                            jSONObject = new JSONObject(jSONLexer.isEnabled(Feature.OrderedField));
                        }
                        if (z11) {
                            context = setContext(parseContext2, jSONObject, objScanSymbolUnQuoted);
                        } else {
                            context = null;
                        }
                        if (this.fieldTypeResolver == null) {
                            object = null;
                            z13 = false;
                        } else {
                            if (objScanSymbolUnQuoted != null) {
                                string = objScanSymbolUnQuoted.toString();
                            } else {
                                string = null;
                            }
                            typeResolve = this.fieldTypeResolver.resolve(map, string);
                            if (typeResolve != null) {
                                object = this.config.getDeserializer(typeResolve).deserialze(this, typeResolve, objScanSymbolUnQuoted);
                            } else {
                                object = null;
                                z13 = false;
                            }
                        }
                        if (!z13) {
                            object = parseObject(jSONObject, objScanSymbolUnQuoted);
                        }
                        if (context != null) {
                            context.object = map;
                        }
                        if (objScanSymbolUnQuoted != null) {
                            checkMapResolve(map, objScanSymbolUnQuoted.toString());
                        }
                        innerMap.put(objScanSymbolUnQuoted, object);
                        if (z11) {
                            setContext(object, objScanSymbolUnQuoted);
                        }
                        if (jSONLexer.token() == 13) {
                            jSONLexer.nextToken();
                            setContext(parseContext2);
                            setContext(parseContext2);
                            return map;
                        }
                        if (jSONLexer.token() != 16) {
                            throw new JSONException("syntax error, " + jSONLexer.tokenName());
                        }
                        if (z11) {
                            popContext();
                        } else {
                            setContext(parseContext2);
                        }
                        c10 = 16;
                    } else {
                        jSONLexer.nextToken();
                        innerMap.put(objScanSymbolUnQuoted, parse());
                        if (jSONLexer.token() == 13) {
                            jSONLexer.nextToken();
                            setContext(parseContext2);
                            return map;
                        }
                        c10 = 16;
                        if (jSONLexer.token() != 16) {
                            throw new JSONException("syntax error, position at " + jSONLexer.pos() + ", name " + objScanSymbolUnQuoted);
                        }
                    }
                } else if (current == '[') {
                    jSONLexer.nextToken();
                    jSONArray = new JSONArray();
                    if (obj != null) {
                        obj.getClass();
                    }
                    if (obj == null) {
                        setContext(parseContext2);
                    }
                    parseArray(jSONArray, objScanSymbolUnQuoted);
                    array = jSONArray;
                    if (jSONLexer.isEnabled(Feature.UseObjectArray)) {
                        array = jSONArray.toArray();
                    }
                    innerMap.put(objScanSymbolUnQuoted, array);
                    if (jSONLexer.token() == 13) {
                        jSONLexer.nextToken();
                        setContext(parseContext2);
                        return map;
                    }
                    if (jSONLexer.token() != 16) {
                        throw new JSONException("syntax error");
                    }
                    c10 = 16;
                } else if (current == '{') {
                    jSONLexer.nextToken();
                    if (obj == null) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (jSONLexer.isEnabled(Feature.CustomMapDeserializer)) {
                        jSONObject = ((MapDeserializer) this.config.getDeserializer(Map.class)).createMap(Map.class);
                    } else {
                        jSONObject = new JSONObject(jSONLexer.isEnabled(Feature.OrderedField));
                    }
                    if (z11) {
                        context = setContext(parseContext2, jSONObject, objScanSymbolUnQuoted);
                    } else {
                        context = null;
                    }
                    if (this.fieldTypeResolver == null) {
                        object = null;
                        z13 = false;
                    } else {
                        if (objScanSymbolUnQuoted != null) {
                            string = objScanSymbolUnQuoted.toString();
                        } else {
                            string = null;
                        }
                        typeResolve = this.fieldTypeResolver.resolve(map, string);
                        if (typeResolve != null) {
                            object = this.config.getDeserializer(typeResolve).deserialze(this, typeResolve, objScanSymbolUnQuoted);
                        } else {
                            object = null;
                            z13 = false;
                        }
                    }
                    if (!z13) {
                        object = parseObject(jSONObject, objScanSymbolUnQuoted);
                    }
                    if (context != null) {
                        context.object = map;
                    }
                    if (objScanSymbolUnQuoted != null) {
                        checkMapResolve(map, objScanSymbolUnQuoted.toString());
                    }
                    innerMap.put(objScanSymbolUnQuoted, object);
                    if (z11) {
                        setContext(object, objScanSymbolUnQuoted);
                    }
                    if (jSONLexer.token() == 13) {
                        jSONLexer.nextToken();
                        setContext(parseContext2);
                        setContext(parseContext2);
                        return map;
                    }
                    if (jSONLexer.token() != 16) {
                        throw new JSONException("syntax error, " + jSONLexer.tokenName());
                    }
                    if (z11) {
                        popContext();
                    } else {
                        setContext(parseContext2);
                    }
                    c10 = 16;
                } else {
                    jSONLexer.nextToken();
                    innerMap.put(objScanSymbolUnQuoted, parse());
                    if (jSONLexer.token() == 13) {
                        jSONLexer.nextToken();
                        setContext(parseContext2);
                        return map;
                    }
                    c10 = 16;
                    if (jSONLexer.token() != 16) {
                        throw new JSONException("syntax error, position at " + jSONLexer.pos() + ", name " + objScanSymbolUnQuoted);
                    }
                }
                jSONLexer.skipWhitespace();
                current2 = jSONLexer.getCurrent();
                if (current2 == ',') {
                    if (current2 == '}') {
                        jSONLexer.next();
                        jSONLexer.resetStringPosition();
                        jSONLexer.nextToken();
                        setContext(obj2, objScanSymbolUnQuoted);
                        setContext(parseContext2);
                        return map;
                    }
                    throw new JSONException("syntax error, position at " + jSONLexer.pos() + ", name " + objScanSymbolUnQuoted);
                }
                jSONLexer.next();
                c10 = 16;
            }
        } catch (Throwable th2) {
            setContext(parseContext2);
            throw th2;
        }
    }

    public void parseObject(Object obj) {
        Object objDeserialze;
        Class<?> cls = obj.getClass();
        ObjectDeserializer deserializer = this.config.getDeserializer(cls);
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        if (this.lexer.token() != 12 && this.lexer.token() != 16) {
            throw new JSONException("syntax error, expect {, actual " + this.lexer.tokenName());
        }
        while (true) {
            String strScanSymbol = this.lexer.scanSymbol(this.symbolTable);
            if (strScanSymbol == null) {
                if (this.lexer.token() == 13) {
                    this.lexer.nextToken(16);
                    return;
                } else if (this.lexer.token() != 16 || !this.lexer.isEnabled(Feature.AllowArbitraryCommas)) {
                }
            }
            FieldDeserializer fieldDeserializer = javaBeanDeserializer != null ? javaBeanDeserializer.getFieldDeserializer(strScanSymbol) : null;
            if (fieldDeserializer != null) {
                FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
                Class<?> cls2 = fieldInfo.fieldClass;
                Type type = fieldInfo.fieldType;
                if (cls2 == Integer.TYPE) {
                    this.lexer.nextTokenWithColon(2);
                    objDeserialze = IntegerCodec.instance.deserialze(this, type, null);
                } else if (cls2 == String.class) {
                    this.lexer.nextTokenWithColon(4);
                    objDeserialze = StringCodec.deserialze(this);
                } else if (cls2 == Long.TYPE) {
                    this.lexer.nextTokenWithColon(2);
                    objDeserialze = LongCodec.instance.deserialze(this, type, null);
                } else {
                    ObjectDeserializer deserializer2 = this.config.getDeserializer(cls2, type);
                    this.lexer.nextTokenWithColon(deserializer2.getFastMatchToken());
                    objDeserialze = deserializer2.deserialze(this, type, null);
                }
                fieldDeserializer.setValue(obj, objDeserialze);
                if (this.lexer.token() != 16 && this.lexer.token() == 13) {
                    this.lexer.nextToken(16);
                    return;
                }
            } else {
                if (!this.lexer.isEnabled(Feature.IgnoreNotMatch)) {
                    throw new JSONException("setter not found, class " + cls.getName() + ", property " + strScanSymbol);
                }
                this.lexer.nextTokenWithColon();
                parse();
                if (this.lexer.token() == 13) {
                    this.lexer.nextToken();
                    return;
                }
            }
        }
    }

    public void popContext() {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return;
        }
        this.context = this.context.parent;
        int i10 = this.contextArrayIndex;
        if (i10 <= 0) {
            return;
        }
        int i11 = i10 - 1;
        this.contextArrayIndex = i11;
        this.contextArray[i11] = null;
    }

    public Object resolveReference(String str) {
        if (this.contextArray == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            ParseContext[] parseContextArr = this.contextArray;
            if (i10 >= parseContextArr.length || i10 >= this.contextArrayIndex) {
                break;
            }
            ParseContext parseContext = parseContextArr[i10];
            if (parseContext.toString().equals(str)) {
                return parseContext.object;
            }
            i10++;
        }
        return null;
    }

    public void setConfig(ParserConfig parserConfig) {
        this.config = parserConfig;
    }

    public ParseContext setContext(ParseContext parseContext, Object obj, Object obj2) {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return null;
        }
        ParseContext parseContext2 = new ParseContext(parseContext, obj, obj2);
        this.context = parseContext2;
        addContext(parseContext2);
        return this.context;
    }

    public ParseContext setContext(Object obj, Object obj2) {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return null;
        }
        return setContext(this.context, obj, obj2);
    }

    public void setContext(ParseContext parseContext) {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return;
        }
        this.context = parseContext;
    }

    public void setDateFomrat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public void setDateFormat(String str) {
        this.dateFormatPattern = str;
        this.dateFormat = null;
    }

    public void setFieldTypeResolver(FieldTypeResolver fieldTypeResolver) {
        this.fieldTypeResolver = fieldTypeResolver;
    }

    public void setResolveStatus(int i10) {
        this.resolveStatus = i10;
    }

    public void throwException(int i10) {
        throw new JSONException("syntax error, expect " + JSONToken.name(i10) + ", actual " + JSONToken.name(this.lexer.token()));
    }
}
