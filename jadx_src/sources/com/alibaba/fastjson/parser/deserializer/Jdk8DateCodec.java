package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.ContextObjectSerializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class Jdk8DateCodec extends ContextObjectDeserializer implements ObjectSerializer, ContextObjectSerializer, ObjectDeserializer {
    private static final String defaultPatttern = "yyyy-MM-dd HH:mm:ss";
    private static final String formatter_iso8601_pattern = "yyyy-MM-dd'T'HH:mm:ss";
    public static final Jdk8DateCodec instance = new Jdk8DateCodec();
    private static final DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_tw = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_cn = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_cn_1 = DateTimeFormatter.ofPattern("yyyy年M月d日 H时m分s秒");
    private static final DateTimeFormatter formatter_dt19_kr = DateTimeFormatter.ofPattern("yyyy년M월d일 HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_us = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_eur = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_de = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_in = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_d8 = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter formatter_d10_tw = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private static final DateTimeFormatter formatter_d10_cn = DateTimeFormatter.ofPattern("yyyy年M月d日");
    private static final DateTimeFormatter formatter_d10_kr = DateTimeFormatter.ofPattern("yyyy년M월d일");
    private static final DateTimeFormatter formatter_d10_us = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private static final DateTimeFormatter formatter_d10_eur = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter formatter_d10_de = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter formatter_d10_in = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static final DateTimeFormatter ISO_FIXED_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());
    private static final DateTimeFormatter formatter_iso8601 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    private void write(SerializeWriter serializeWriter, TemporalAccessor temporalAccessor, String str) {
        serializeWriter.writeString((str == "yyyy-MM-dd'T'HH:mm:ss" ? formatter_iso8601 : DateTimeFormatter.ofPattern(str)).format(temporalAccessor));
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, String str, int i10) {
        DateTimeFormatter dateTimeFormatterOfPattern;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken();
            return null;
        }
        if (jSONLexer.token() != 4) {
            if (jSONLexer.token() != 2) {
                throw new UnsupportedOperationException();
            }
            long jLongValue = jSONLexer.longValue();
            jSONLexer.nextToken();
            if (type == LocalDateTime.class) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId());
            }
            if (type == LocalDate.class) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId()).toLocalDate();
            }
            if (type == LocalTime.class) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId()).toLocalTime();
            }
            throw new UnsupportedOperationException();
        }
        String strStringVal = jSONLexer.stringVal();
        jSONLexer.nextToken();
        if (str != null) {
            dateTimeFormatterOfPattern = "yyyy-MM-dd HH:mm:ss".equals(str) ? defaultFormatter : DateTimeFormatter.ofPattern(str);
        } else {
            dateTimeFormatterOfPattern = null;
        }
        if ("".equals(strStringVal)) {
            return null;
        }
        if (type == LocalDateTime.class) {
            return (strStringVal.length() == 10 || strStringVal.length() == 8) ? (T) LocalDateTime.of(parseLocalDate(strStringVal, str, dateTimeFormatterOfPattern), LocalTime.MIN) : (T) parseDateTime(strStringVal, dateTimeFormatterOfPattern);
        }
        if (type == LocalDate.class) {
            if (strStringVal.length() != 23) {
                return (T) parseLocalDate(strStringVal, str, dateTimeFormatterOfPattern);
            }
            LocalDateTime localDateTime = LocalDateTime.parse(strStringVal);
            return (T) LocalDate.of(localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
        }
        if (type == LocalTime.class) {
            if (strStringVal.length() != 23) {
                return (T) LocalTime.parse(strStringVal);
            }
            LocalDateTime localDateTime2 = LocalDateTime.parse(strStringVal);
            return (T) LocalTime.of(localDateTime2.getHour(), localDateTime2.getMinute(), localDateTime2.getSecond(), localDateTime2.getNano());
        }
        if (type == ZonedDateTime.class) {
            if (dateTimeFormatterOfPattern == defaultFormatter) {
                dateTimeFormatterOfPattern = ISO_FIXED_FORMAT;
            }
            return (T) parseZonedDateTime(strStringVal, dateTimeFormatterOfPattern);
        }
        if (type == OffsetDateTime.class) {
            return (T) OffsetDateTime.parse(strStringVal);
        }
        if (type == OffsetTime.class) {
            return (T) OffsetTime.parse(strStringVal);
        }
        if (type == ZoneId.class) {
            return (T) ZoneId.of(strStringVal);
        }
        if (type == Period.class) {
            return (T) Period.parse(strStringVal);
        }
        if (type == Duration.class) {
            return (T) Duration.parse(strStringVal);
        }
        if (type == Instant.class) {
            return (T) Instant.parse(strStringVal);
        }
        return null;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 4;
    }

    protected LocalDateTime parseDateTime(String str, DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter == null) {
            if (str.length() == 19) {
                char cCharAt = str.charAt(4);
                char cCharAt2 = str.charAt(7);
                char cCharAt3 = str.charAt(10);
                char cCharAt4 = str.charAt(13);
                char cCharAt5 = str.charAt(16);
                if (cCharAt4 == ':' && cCharAt5 == ':') {
                    if (cCharAt == '-' && cCharAt2 == '-') {
                        if (cCharAt3 == 'T') {
                            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                        } else if (cCharAt3 == ' ') {
                            dateTimeFormatter = defaultFormatter;
                        }
                    } else if (cCharAt == '-' && cCharAt2 == '-') {
                        dateTimeFormatter = defaultFormatter;
                    } else if (cCharAt == '/' && cCharAt2 == '/') {
                        dateTimeFormatter = formatter_dt19_tw;
                    } else {
                        char cCharAt6 = str.charAt(0);
                        char cCharAt7 = str.charAt(1);
                        char cCharAt8 = str.charAt(2);
                        char cCharAt9 = str.charAt(3);
                        char cCharAt10 = str.charAt(5);
                        if (cCharAt8 == '/' && cCharAt10 == '/') {
                            int i10 = ((cCharAt9 - '0') * 10) + (cCharAt - '0');
                            if (((cCharAt6 - '0') * 10) + (cCharAt7 - '0') > 12) {
                                dateTimeFormatter = formatter_dt19_eur;
                            } else if (i10 > 12) {
                                dateTimeFormatter = formatter_dt19_us;
                            } else {
                                String country = Locale.getDefault().getCountry();
                                if (country.equals("US")) {
                                    dateTimeFormatter = formatter_dt19_us;
                                } else if (country.equals("BR") || country.equals("AU")) {
                                    dateTimeFormatter = formatter_dt19_eur;
                                }
                            }
                        } else if (cCharAt8 == '.' && cCharAt10 == '.') {
                            dateTimeFormatter = formatter_dt19_de;
                        } else if (cCharAt8 == '-' && cCharAt10 == '-') {
                            dateTimeFormatter = formatter_dt19_in;
                        }
                    }
                }
            }
            if (str.length() >= 17) {
                char cCharAt11 = str.charAt(4);
                if (cCharAt11 == 24180) {
                    dateTimeFormatter = str.charAt(str.length() - 1) == 31186 ? formatter_dt19_cn_1 : formatter_dt19_cn;
                } else if (cCharAt11 == 45380) {
                    dateTimeFormatter = formatter_dt19_kr;
                }
            }
        }
        return dateTimeFormatter == null ? LocalDateTime.parse(str) : LocalDateTime.parse(str, dateTimeFormatter);
    }

    protected LocalDate parseLocalDate(String str, String str2, DateTimeFormatter dateTimeFormatter) {
        DateTimeFormatter dateTimeFormatter2;
        if (dateTimeFormatter == null) {
            if (str.length() == 8) {
                dateTimeFormatter = formatter_d8;
            }
            if (str.length() == 10) {
                char cCharAt = str.charAt(4);
                char cCharAt2 = str.charAt(7);
                if (cCharAt == '/' && cCharAt2 == '/') {
                    dateTimeFormatter = formatter_d10_tw;
                }
                char cCharAt3 = str.charAt(0);
                char cCharAt4 = str.charAt(1);
                char cCharAt5 = str.charAt(2);
                char cCharAt6 = str.charAt(3);
                char cCharAt7 = str.charAt(5);
                if (cCharAt5 == '/' && cCharAt7 == '/') {
                    int i10 = ((cCharAt6 - '0') * 10) + (cCharAt - '0');
                    if (((cCharAt3 - '0') * 10) + (cCharAt4 - '0') > 12) {
                        dateTimeFormatter = formatter_d10_eur;
                    } else if (i10 > 12) {
                        dateTimeFormatter = formatter_d10_us;
                    } else {
                        String country = Locale.getDefault().getCountry();
                        if (country.equals("US")) {
                            dateTimeFormatter = formatter_d10_us;
                        } else if (country.equals("BR") || country.equals("AU")) {
                            dateTimeFormatter = formatter_d10_eur;
                        }
                    }
                } else {
                    if (cCharAt5 == '.' && cCharAt7 == '.') {
                        dateTimeFormatter2 = formatter_d10_de;
                    } else if (cCharAt5 == '-' && cCharAt7 == '-') {
                        dateTimeFormatter2 = formatter_d10_in;
                    }
                    dateTimeFormatter = dateTimeFormatter2;
                }
            }
            if (str.length() >= 9) {
                char cCharAt8 = str.charAt(4);
                if (cCharAt8 == 24180) {
                    dateTimeFormatter = formatter_d10_cn;
                } else if (cCharAt8 == 45380) {
                    dateTimeFormatter = formatter_d10_kr;
                }
            }
        }
        return dateTimeFormatter == null ? LocalDate.parse(str) : LocalDate.parse(str, dateTimeFormatter);
    }

    protected ZonedDateTime parseZonedDateTime(String str, DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter == null) {
            if (str.length() == 19) {
                char cCharAt = str.charAt(4);
                char cCharAt2 = str.charAt(7);
                char cCharAt3 = str.charAt(10);
                char cCharAt4 = str.charAt(13);
                char cCharAt5 = str.charAt(16);
                if (cCharAt4 == ':' && cCharAt5 == ':') {
                    if (cCharAt == '-' && cCharAt2 == '-') {
                        if (cCharAt3 == 'T') {
                            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                        } else if (cCharAt3 == ' ') {
                            dateTimeFormatter = defaultFormatter;
                        }
                    } else if (cCharAt == '-' && cCharAt2 == '-') {
                        dateTimeFormatter = defaultFormatter;
                    } else if (cCharAt == '/' && cCharAt2 == '/') {
                        dateTimeFormatter = formatter_dt19_tw;
                    } else {
                        char cCharAt6 = str.charAt(0);
                        char cCharAt7 = str.charAt(1);
                        char cCharAt8 = str.charAt(2);
                        char cCharAt9 = str.charAt(3);
                        char cCharAt10 = str.charAt(5);
                        if (cCharAt8 == '/' && cCharAt10 == '/') {
                            int i10 = ((cCharAt9 - '0') * 10) + (cCharAt - '0');
                            if (((cCharAt6 - '0') * 10) + (cCharAt7 - '0') > 12) {
                                dateTimeFormatter = formatter_dt19_eur;
                            } else if (i10 > 12) {
                                dateTimeFormatter = formatter_dt19_us;
                            } else {
                                String country = Locale.getDefault().getCountry();
                                if (country.equals("US")) {
                                    dateTimeFormatter = formatter_dt19_us;
                                } else if (country.equals("BR") || country.equals("AU")) {
                                    dateTimeFormatter = formatter_dt19_eur;
                                }
                            }
                        } else if (cCharAt8 == '.' && cCharAt10 == '.') {
                            dateTimeFormatter = formatter_dt19_de;
                        } else if (cCharAt8 == '-' && cCharAt10 == '-') {
                            dateTimeFormatter = formatter_dt19_in;
                        }
                    }
                }
            }
            if (str.length() >= 17) {
                char cCharAt11 = str.charAt(4);
                if (cCharAt11 == 24180) {
                    dateTimeFormatter = str.charAt(str.length() - 1) == 31186 ? formatter_dt19_cn_1 : formatter_dt19_cn;
                } else if (cCharAt11 == 45380) {
                    dateTimeFormatter = formatter_dt19_kr;
                }
            }
        }
        return dateTimeFormatter == null ? ZonedDateTime.parse(str) : ZonedDateTime.parse(str, dateTimeFormatter);
    }

    @Override // com.alibaba.fastjson.serializer.ContextObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, BeanContext beanContext) throws IOException {
        write(jSONSerializer.out, (TemporalAccessor) obj, beanContext.getFormat());
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.time.ZonedDateTime] */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
            return;
        }
        if (type == null) {
            type = obj.getClass();
        }
        if (type != LocalDateTime.class) {
            serializeWriter.writeString(obj.toString());
            return;
        }
        SerializerFeature serializerFeature = SerializerFeature.UseISO8601DateFormat;
        int mask = serializerFeature.getMask();
        LocalDateTime localDateTime = (LocalDateTime) obj;
        String dateFormatPattern = jSONSerializer.getDateFormatPattern();
        if ((dateFormatPattern == null && (i10 & mask) != 0) || jSONSerializer.isEnabled(serializerFeature)) {
            dateFormatPattern = "yyyy-MM-dd'T'HH:mm:ss";
        }
        if (localDateTime.getNano() == 0 || dateFormatPattern != null) {
            if (dateFormatPattern == null) {
                dateFormatPattern = JSON.DEFFAULT_DATE_FORMAT;
            }
            write(serializeWriter, localDateTime, dateFormatPattern);
        } else if (serializeWriter.isEnabled(SerializerFeature.WriteDateUseDateFormat)) {
            write(serializeWriter, localDateTime, JSON.DEFFAULT_DATE_FORMAT);
        } else {
            serializeWriter.writeLong(localDateTime.atZone(JSON.defaultTimeZone.toZoneId()).toInstant().toEpochMilli());
        }
    }
}
