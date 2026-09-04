package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class EnumDeserializer implements ObjectDeserializer {
    protected final Class<?> enumClass;
    protected long[] enumNameHashCodes;
    protected final Enum[] enums;
    protected final Enum[] ordinalEnums;

    public EnumDeserializer(Class<?> cls) {
        JSONField jSONField;
        this.enumClass = cls;
        this.ordinalEnums = (Enum[]) cls.getEnumConstants();
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            Enum[] enumArr = this.ordinalEnums;
            if (i10 >= enumArr.length) {
                break;
            }
            Enum r10 = enumArr[i10];
            String strName = r10.name();
            JSONField jSONField2 = null;
            try {
                jSONField = (JSONField) cls.getField(strName).getAnnotation(JSONField.class);
                if (jSONField != null) {
                    try {
                        String strName2 = jSONField.name();
                        if (strName2 != null && strName2.length() > 0) {
                            strName = strName2;
                        }
                    } catch (Exception unused) {
                        jSONField2 = jSONField;
                        jSONField = jSONField2;
                    }
                }
            } catch (Exception unused2) {
            }
            int i11 = 0;
            long j10 = -3750763034362895579L;
            long j11 = -3750763034362895579L;
            while (i11 < strName.length()) {
                int iCharAt = strName.charAt(i11);
                long j12 = ((long) iCharAt) ^ j10;
                if (iCharAt >= 65 && iCharAt <= 90) {
                    iCharAt += 32;
                }
                j11 = (((long) iCharAt) ^ j11) * 1099511628211L;
                i11++;
                j10 = j12 * 1099511628211L;
            }
            map.put(Long.valueOf(j10), r10);
            if (j10 != j11) {
                map.put(Long.valueOf(j11), r10);
            }
            if (jSONField != null) {
                String[] strArrAlternateNames = jSONField.alternateNames();
                int length = strArrAlternateNames.length;
                int i12 = 0;
                while (i12 < length) {
                    String str = strArrAlternateNames[i12];
                    int i13 = 0;
                    long jCharAt = -3750763034362895579L;
                    while (i13 < str.length()) {
                        jCharAt = (jCharAt ^ ((long) str.charAt(i13))) * 1099511628211L;
                        i13++;
                        i10 = i10;
                    }
                    int i14 = i10;
                    if (jCharAt != j10 && jCharAt != j11) {
                        map.put(Long.valueOf(jCharAt), r10);
                    }
                    i12++;
                    i10 = i14;
                }
            }
            i10++;
        }
        this.enumNameHashCodes = new long[map.size()];
        Iterator it = map.keySet().iterator();
        int i15 = 0;
        while (it.hasNext()) {
            this.enumNameHashCodes[i15] = ((Long) it.next()).longValue();
            i15++;
        }
        Arrays.sort(this.enumNameHashCodes);
        this.enums = new Enum[this.enumNameHashCodes.length];
        int i16 = 0;
        while (true) {
            long[] jArr = this.enumNameHashCodes;
            if (i16 >= jArr.length) {
                return;
            }
            this.enums[i16] = (Enum) map.get(Long.valueOf(jArr[i16]));
            i16++;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        try {
            JSONLexer jSONLexer = defaultJSONParser.lexer;
            int i10 = jSONLexer.token();
            if (i10 == 2) {
                int iIntValue = jSONLexer.intValue();
                jSONLexer.nextToken(16);
                if (iIntValue >= 0) {
                    Object[] objArr = this.ordinalEnums;
                    if (iIntValue <= objArr.length) {
                        return (T) objArr[iIntValue];
                    }
                }
                throw new JSONException("parse enum " + this.enumClass.getName() + " error, value : " + iIntValue);
            }
            if (i10 == 4) {
                String strStringVal = jSONLexer.stringVal();
                jSONLexer.nextToken(16);
                if (strStringVal.length() == 0) {
                    return null;
                }
                long jCharAt = -3750763034362895579L;
                for (int i11 = 0; i11 < strStringVal.length(); i11++) {
                    jCharAt = (jCharAt ^ ((long) strStringVal.charAt(i11))) * 1099511628211L;
                }
                return (T) getEnumByHashCode(jCharAt);
            }
            if (i10 == 8) {
                jSONLexer.nextToken(16);
                return null;
            }
            throw new JSONException("parse enum " + this.enumClass.getName() + " error, value : " + defaultJSONParser.parse());
        } catch (JSONException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new JSONException(e11.getMessage(), e11);
        }
    }

    public Enum getEnumByHashCode(long j10) {
        int iBinarySearch;
        if (this.enums != null && (iBinarySearch = Arrays.binarySearch(this.enumNameHashCodes, j10)) >= 0) {
            return this.enums[iBinarySearch];
        }
        return null;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }

    public Enum<?> valueOf(int i10) {
        return this.ordinalEnums[i10];
    }
}
