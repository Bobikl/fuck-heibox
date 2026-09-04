package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public class JSONSerializer extends SerializeFilterable {
    protected final SerializeConfig config;
    protected SerialContext context;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    private String indent;
    private int indentCount;
    protected Locale locale;
    public final SerializeWriter out;
    protected IdentityHashMap<Object, SerialContext> references;
    protected TimeZone timeZone;

    public JSONSerializer() {
        this(new SerializeWriter(), SerializeConfig.getGlobalInstance());
    }

    public JSONSerializer(SerializeConfig serializeConfig) {
        this(new SerializeWriter(), serializeConfig);
    }

    public JSONSerializer(SerializeWriter serializeWriter) {
        this(serializeWriter, SerializeConfig.getGlobalInstance());
    }

    public JSONSerializer(SerializeWriter serializeWriter, SerializeConfig serializeConfig) {
        this.indentCount = 0;
        this.indent = "\t";
        this.references = null;
        this.timeZone = JSON.defaultTimeZone;
        this.locale = JSON.defaultLocale;
        this.out = serializeWriter;
        this.config = serializeConfig;
    }

    public static void write(SerializeWriter serializeWriter, Object obj) {
        new JSONSerializer(serializeWriter).write(obj);
    }

    public static void write(Writer writer, Object obj) {
        SerializeWriter serializeWriter = new SerializeWriter();
        try {
            try {
                new JSONSerializer(serializeWriter).write(obj);
                serializeWriter.writeTo(writer);
                serializeWriter.close();
            } catch (IOException e10) {
                throw new JSONException(e10.getMessage(), e10);
            }
        } catch (Throwable th2) {
            serializeWriter.close();
            throw th2;
        }
    }

    public boolean checkValue(SerializeFilterable serializeFilterable) {
        List<ContextValueFilter> list;
        List<ValueFilter> list2;
        List<ContextValueFilter> list3;
        List<ValueFilter> list4 = this.valueFilters;
        return (list4 != null && list4.size() > 0) || ((list = this.contextValueFilters) != null && list.size() > 0) || (((list2 = serializeFilterable.valueFilters) != null && list2.size() > 0) || (((list3 = serializeFilterable.contextValueFilters) != null && list3.size() > 0) || this.out.writeNonStringValueAsString));
    }

    public void close() {
        this.out.close();
    }

    public void config(SerializerFeature serializerFeature, boolean z10) {
        this.out.config(serializerFeature, z10);
    }

    public boolean containsReference(Object obj) {
        SerialContext serialContext;
        IdentityHashMap<Object, SerialContext> identityHashMap = this.references;
        if (identityHashMap == null || (serialContext = identityHashMap.get(obj)) == null) {
            return false;
        }
        Object obj2 = serialContext.fieldName;
        return obj2 == null || (obj2 instanceof Integer) || (obj2 instanceof String);
    }

    public void decrementIdent() {
        this.indentCount--;
    }

    public SerialContext getContext() {
        return this.context;
    }

    public DateFormat getDateFormat() {
        if (this.dateFormat == null && this.dateFormatPattern != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.dateFormatPattern, this.locale);
            this.dateFormat = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.timeZone);
        }
        return this.dateFormat;
    }

    public String getDateFormatPattern() {
        DateFormat dateFormat = this.dateFormat;
        return dateFormat instanceof SimpleDateFormat ? ((SimpleDateFormat) dateFormat).toPattern() : this.dateFormatPattern;
    }

    public int getIndentCount() {
        return this.indentCount;
    }

    public SerializeConfig getMapping() {
        return this.config;
    }

    public ObjectSerializer getObjectWriter(Class<?> cls) {
        return this.config.getObjectWriter(cls);
    }

    public SerializeWriter getWriter() {
        return this.out;
    }

    public boolean hasNameFilters(SerializeFilterable serializeFilterable) {
        List<NameFilter> list;
        List<NameFilter> list2 = this.nameFilters;
        return (list2 != null && list2.size() > 0) || ((list = serializeFilterable.nameFilters) != null && list.size() > 0);
    }

    public boolean hasPropertyFilters(SerializeFilterable serializeFilterable) {
        List<PropertyFilter> list;
        List<PropertyFilter> list2 = this.propertyFilters;
        return (list2 != null && list2.size() > 0) || ((list = serializeFilterable.propertyFilters) != null && list.size() > 0);
    }

    public void incrementIndent() {
        this.indentCount++;
    }

    public boolean isEnabled(SerializerFeature serializerFeature) {
        return this.out.isEnabled(serializerFeature);
    }

    public final boolean isWriteClassName(Type type, Object obj) {
        SerialContext serialContext;
        return this.out.isEnabled(SerializerFeature.WriteClassName) && !(type == null && this.out.isEnabled(SerializerFeature.NotWriteRootClassName) && ((serialContext = this.context) == null || serialContext.parent == null));
    }

    public void popContext() {
        SerialContext serialContext = this.context;
        if (serialContext != null) {
            this.context = serialContext.parent;
        }
    }

    public void println() {
        this.out.write(10);
        for (int i10 = 0; i10 < this.indentCount; i10++) {
            this.out.write(this.indent);
        }
    }

    public void setContext(SerialContext serialContext) {
        this.context = serialContext;
    }

    public void setContext(SerialContext serialContext, Object obj, Object obj2, int i10) {
        setContext(serialContext, obj, obj2, i10, 0);
    }

    public void setContext(SerialContext serialContext, Object obj, Object obj2, int i10, int i11) {
        if (this.out.disableCircularReferenceDetect) {
            return;
        }
        this.context = new SerialContext(serialContext, obj, obj2, i10, i11);
        if (this.references == null) {
            this.references = new IdentityHashMap<>();
        }
        this.references.put(obj, this.context);
    }

    public void setContext(Object obj, Object obj2) {
        setContext(this.context, obj, obj2, 0);
    }

    public void setDateFormat(String str) {
        this.dateFormatPattern = str;
        if (this.dateFormat != null) {
            this.dateFormat = null;
        }
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
        if (this.dateFormatPattern != null) {
            this.dateFormatPattern = null;
        }
    }

    public String toString() {
        return this.out.toString();
    }

    public final void write(Object obj) {
        if (obj == null) {
            this.out.writeNull();
            return;
        }
        try {
            getObjectWriter(obj.getClass()).write(this, obj, null, null, 0);
        } catch (IOException e10) {
            throw new JSONException(e10.getMessage(), e10);
        }
    }

    public final void write(String str) {
        StringCodec.instance.write(this, str);
    }

    protected final void writeKeyValue(char c10, String str, Object obj) {
        if (c10 != 0) {
            this.out.write(c10);
        }
        this.out.writeFieldName(str);
        write(obj);
    }

    public void writeNull() {
        this.out.writeNull();
    }

    public void writeReference(Object obj) {
        SerialContext serialContext = this.context;
        if (obj == serialContext.object) {
            this.out.write("{\"$ref\":\"@\"}");
            return;
        }
        SerialContext serialContext2 = serialContext.parent;
        if (serialContext2 != null && obj == serialContext2.object) {
            this.out.write("{\"$ref\":\"..\"}");
            return;
        }
        while (true) {
            SerialContext serialContext3 = serialContext.parent;
            if (serialContext3 == null) {
                break;
            } else {
                serialContext = serialContext3;
            }
        }
        if (obj == serialContext.object) {
            this.out.write("{\"$ref\":\"$\"}");
            return;
        }
        this.out.write("{\"$ref\":\"");
        this.out.write(this.references.get(obj).toString());
        this.out.write("\"}");
    }

    public final void writeWithFieldName(Object obj, Object obj2) {
        writeWithFieldName(obj, obj2, null, 0);
    }

    public final void writeWithFieldName(Object obj, Object obj2, Type type, int i10) {
        try {
            if (obj == null) {
                this.out.writeNull();
            } else {
                getObjectWriter(obj.getClass()).write(this, obj, obj2, type, i10);
            }
        } catch (IOException e10) {
            throw new JSONException(e10.getMessage(), e10);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0078 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeWithFormat(java.lang.Object r6, java.lang.String r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.util.Date
            if (r0 == 0) goto L22
            java.text.DateFormat r0 = r5.getDateFormat()
            if (r0 != 0) goto L16
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = r5.locale
            r0.<init>(r7, r1)
            java.util.TimeZone r7 = r5.timeZone
            r0.setTimeZone(r7)
        L16:
            java.util.Date r6 = (java.util.Date) r6
            java.lang.String r6 = r0.format(r6)
            com.alibaba.fastjson.serializer.SerializeWriter r7 = r5.out
            r7.writeString(r6)
            return
        L22:
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L87
            byte[] r6 = (byte[]) r6
            java.lang.String r0 = "gzip"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "gzip,base64"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L39
            goto L4d
        L39:
            java.lang.String r0 = "hex"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L47
            com.alibaba.fastjson.serializer.SerializeWriter r7 = r5.out
            r7.writeHex(r6)
            goto L77
        L47:
            com.alibaba.fastjson.serializer.SerializeWriter r7 = r5.out
            r7.writeByteArray(r6)
            goto L77
        L4d:
            r7 = 0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            int r1 = r6.length     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            r2 = 512(0x200, float:7.175E-43)
            if (r1 >= r2) goto L5f
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            int r2 = r6.length     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            goto L64
        L5f:
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
        L64:
            r7 = r1
            r7.write(r6)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            r7.finish()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            com.alibaba.fastjson.serializer.SerializeWriter r6 = r5.out     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            r6.writeByteArray(r0)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7a
            com.alibaba.fastjson.util.IOUtils.close(r7)
        L77:
            return
        L78:
            r6 = move-exception
            goto L83
        L7a:
            r6 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = "write gzipBytes error"
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L83:
            com.alibaba.fastjson.util.IOUtils.close(r7)
            throw r6
        L87:
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto Lba
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r0 = r6.iterator()
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r5.out
            r2 = 91
            r1.write(r2)
            r1 = 0
        L99:
            int r2 = r6.size()
            if (r1 >= r2) goto Lb2
            java.lang.Object r2 = r0.next()
            if (r1 == 0) goto Lac
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r5.out
            r4 = 44
            r3.write(r4)
        Lac:
            r5.writeWithFormat(r2, r7)
            int r1 = r1 + 1
            goto L99
        Lb2:
            com.alibaba.fastjson.serializer.SerializeWriter r6 = r5.out
            r7 = 93
            r6.write(r7)
            return
        Lba:
            r5.write(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JSONSerializer.writeWithFormat(java.lang.Object, java.lang.String):void");
    }
}
