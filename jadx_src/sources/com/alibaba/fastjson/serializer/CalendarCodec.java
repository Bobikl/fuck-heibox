package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.IOUtils;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import kotlin.text.y;

/* JADX INFO: loaded from: classes6.dex */
public class CalendarCodec implements ObjectSerializer, ObjectDeserializer {
    public static final CalendarCodec instance = new CalendarCodec();
    private DatatypeFactory dateFactory;

    public XMLGregorianCalendar createXMLGregorianCalendar(Calendar calendar) {
        if (this.dateFactory == null) {
            try {
                this.dateFactory = DatatypeFactory.newInstance();
            } catch (DatatypeConfigurationException e10) {
                throw new IllegalStateException("Could not obtain an instance of DatatypeFactory.", e10);
            }
        }
        return this.dateFactory.newXMLGregorianCalendar((GregorianCalendar) calendar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.util.Calendar] */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        T t10 = (T) DateCodec.instance.deserialze(defaultJSONParser, type, obj);
        if (t10 instanceof Calendar) {
            return t10;
        }
        Date date = (Date) t10;
        if (date == null) {
            return null;
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        ?? r10 = (T) Calendar.getInstance(jSONLexer.getTimeZone(), jSONLexer.getLocale());
        r10.setTime(date);
        return type == XMLGregorianCalendar.class ? (T) createXMLGregorianCalendar((GregorianCalendar) r10) : r10;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws IOException {
        char[] charArray;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
            return;
        }
        Calendar gregorianCalendar = obj instanceof XMLGregorianCalendar ? ((XMLGregorianCalendar) obj).toGregorianCalendar() : (Calendar) obj;
        if (!serializeWriter.isEnabled(SerializerFeature.UseISO8601DateFormat)) {
            jSONSerializer.write(gregorianCalendar.getTime());
            return;
        }
        char c10 = serializeWriter.isEnabled(SerializerFeature.UseSingleQuotes) ? '\'' : y.f128593b;
        serializeWriter.append(c10);
        int i11 = gregorianCalendar.get(1);
        int i12 = gregorianCalendar.get(2) + 1;
        int i13 = gregorianCalendar.get(5);
        int i14 = gregorianCalendar.get(11);
        int i15 = gregorianCalendar.get(12);
        int i16 = gregorianCalendar.get(13);
        int i17 = gregorianCalendar.get(14);
        if (i17 != 0) {
            charArray = "0000-00-00T00:00:00.000".toCharArray();
            IOUtils.getChars(i17, 23, charArray);
            IOUtils.getChars(i16, 19, charArray);
            IOUtils.getChars(i15, 16, charArray);
            IOUtils.getChars(i14, 13, charArray);
            IOUtils.getChars(i13, 10, charArray);
            IOUtils.getChars(i12, 7, charArray);
            IOUtils.getChars(i11, 4, charArray);
        } else if (i16 == 0 && i15 == 0 && i14 == 0) {
            charArray = "0000-00-00".toCharArray();
            IOUtils.getChars(i13, 10, charArray);
            IOUtils.getChars(i12, 7, charArray);
            IOUtils.getChars(i11, 4, charArray);
        } else {
            charArray = "0000-00-00T00:00:00".toCharArray();
            IOUtils.getChars(i16, 19, charArray);
            IOUtils.getChars(i15, 16, charArray);
            IOUtils.getChars(i14, 13, charArray);
            IOUtils.getChars(i13, 10, charArray);
            IOUtils.getChars(i12, 7, charArray);
            IOUtils.getChars(i11, 4, charArray);
        }
        serializeWriter.write(charArray);
        int rawOffset = gregorianCalendar.getTimeZone().getRawOffset() / 3600000;
        if (rawOffset == 0) {
            serializeWriter.append((CharSequence) "Z");
        } else if (rawOffset > 0) {
            serializeWriter.append((CharSequence) "+").append((CharSequence) String.format(TimeModel.f55753i, Integer.valueOf(rawOffset))).append((CharSequence) ":00");
        } else {
            serializeWriter.append((CharSequence) Constants.ACCEPT_TIME_SEPARATOR_SERVER).append((CharSequence) String.format(TimeModel.f55753i, Integer.valueOf(-rawOffset))).append((CharSequence) ":00");
        }
        serializeWriter.append(c10);
    }
}
