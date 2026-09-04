package com.alibaba.fastjson;

import androidx.webkit.b;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.FieldSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.TypeUtils;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import lg.a;

/* JADX INFO: loaded from: classes6.dex */
public class JSONPath implements JSONAware {
    static final long LENGTH = -1580386065683472715L;
    static final long SIZE = 5614464919154503228L;
    private static ConcurrentMap<String, JSONPath> pathCache = new ConcurrentHashMap(128, 0.75f, 1);
    private ParserConfig parserConfig;
    private final String path;
    private Segement[] segments;
    private SerializeConfig serializeConfig;

    public static class ArrayAccessSegement implements Segement {
        private final int index;

        public ArrayAccessSegement(int i10) {
            this.index = i10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            return jSONPath.getArrayItem(obj2, this.index);
        }

        public boolean remove(JSONPath jSONPath, Object obj) {
            return jSONPath.removeArrayItem(jSONPath, obj, this.index);
        }

        public boolean setValue(JSONPath jSONPath, Object obj, Object obj2) {
            return jSONPath.setArrayItem(jSONPath, obj, this.index, obj2);
        }
    }

    public static class CombineSegement implements Segement {
        public final Segement left;
        public final Operator operator;
        public final Segement right;

        public enum Operator {
            And,
            Or
        }

        public CombineSegement(Segement segement, Segement segement2, Operator operator) {
            this.left = segement;
            this.right = segement2;
            this.operator = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            return null;
        }
    }

    public static class DoubleOpSegement implements Filter {
        private final Operator op;
        private final String propertyName;
        private final long propertyNameHash;
        private final double value;

        public DoubleOpSegement(String str, double d10, Operator operator) {
            this.propertyName = str;
            this.value = d10;
            this.op = operator;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null || !(propertyValue instanceof Number)) {
                return false;
            }
            double dDoubleValue = ((Number) propertyValue).doubleValue();
            Operator operator = this.op;
            if (operator == Operator.EQ) {
                return dDoubleValue == this.value;
            }
            if (operator == Operator.NE) {
                return dDoubleValue != this.value;
            }
            if (operator == Operator.GE) {
                return dDoubleValue >= this.value;
            }
            if (operator == Operator.GT) {
                return dDoubleValue > this.value;
            }
            if (operator == Operator.LE) {
                return dDoubleValue <= this.value;
            }
            return operator == Operator.LT && dDoubleValue < this.value;
        }
    }

    public interface Filter {
        boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3);
    }

    public static class FilterGroup implements Filter {
        private boolean and;
        private List<Filter> fitlers;

        public FilterGroup(Filter filter, Filter filter2, boolean z10) {
            ArrayList arrayList = new ArrayList(2);
            this.fitlers = arrayList;
            arrayList.add(filter);
            this.fitlers.add(filter2);
            this.and = z10;
        }

        public FilterGroup(List<Filter> list, boolean z10) {
            this.and = z10;
            this.fitlers = list;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            if (this.and) {
                Iterator<Filter> it = this.fitlers.iterator();
                while (it.hasNext()) {
                    if (!it.next().apply(jSONPath, obj, obj2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<Filter> it2 = this.fitlers.iterator();
            while (it2.hasNext()) {
                if (it2.next().apply(jSONPath, obj, obj2, obj3)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class FilterSegement implements Segement {
        private final Filter filter;

        public FilterSegement(Filter filter) {
            this.filter = filter;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (obj2 == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            if (!(obj2 instanceof Iterable)) {
                if (this.filter.apply(jSONPath, obj, obj2, obj2)) {
                    return obj2;
                }
                return null;
            }
            for (Object obj3 : (Iterable) obj2) {
                if (this.filter.apply(jSONPath, obj, obj2, obj3)) {
                    jSONArray.add(obj3);
                }
            }
            return jSONArray;
        }
    }

    public static class IntBetweenSegement implements Filter {
        private final long endValue;
        private final boolean not;
        private final String propertyName;
        private final long propertyNameHash;
        private final long startValue;

        public IntBetweenSegement(String str, long j10, long j11, boolean z10) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.startValue = j10;
            this.endValue = j11;
            this.not = z10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null) {
                return false;
            }
            if (propertyValue instanceof Number) {
                long jLongValue = ((Number) propertyValue).longValue();
                if (jLongValue >= this.startValue && jLongValue <= this.endValue) {
                    return !this.not;
                }
            }
            return this.not;
        }
    }

    public static class IntInSegement implements Filter {
        private final boolean not;
        private final String propertyName;
        private final long propertyNameHash;
        private final long[] values;

        public IntInSegement(String str, long[] jArr, boolean z10) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.values = jArr;
            this.not = z10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null) {
                return false;
            }
            if (propertyValue instanceof Number) {
                long jLongValue = ((Number) propertyValue).longValue();
                for (long j10 : this.values) {
                    if (j10 == jLongValue) {
                        return !this.not;
                    }
                }
            }
            return this.not;
        }
    }

    public static class IntObjInSegement implements Filter {
        private final boolean not;
        private final String propertyName;
        private final long propertyNameHash;
        private final Long[] values;

        public IntObjInSegement(String str, Long[] lArr, boolean z10) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.values = lArr;
            this.not = z10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            int i10 = 0;
            if (propertyValue == null) {
                Long[] lArr = this.values;
                int length = lArr.length;
                while (i10 < length) {
                    if (lArr[i10] == null) {
                        return !this.not;
                    }
                    i10++;
                }
                return this.not;
            }
            if (propertyValue instanceof Number) {
                long jLongValue = ((Number) propertyValue).longValue();
                Long[] lArr2 = this.values;
                int length2 = lArr2.length;
                while (i10 < length2) {
                    Long l10 = lArr2[i10];
                    if (l10 != null && l10.longValue() == jLongValue) {
                        return !this.not;
                    }
                    i10++;
                }
            }
            return this.not;
        }
    }

    public static class IntOpSegement implements Filter {
        private final Operator op;
        private final String propertyName;
        private final long propertyNameHash;
        private final long value;

        public IntOpSegement(String str, long j10, Operator operator) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.value = j10;
            this.op = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null || !(propertyValue instanceof Number)) {
                return false;
            }
            long jLongValue = ((Number) propertyValue).longValue();
            Operator operator = this.op;
            if (operator == Operator.EQ) {
                return jLongValue == this.value;
            }
            if (operator == Operator.NE) {
                return jLongValue != this.value;
            }
            if (operator == Operator.GE) {
                return jLongValue >= this.value;
            }
            if (operator == Operator.GT) {
                return jLongValue > this.value;
            }
            if (operator == Operator.LE) {
                return jLongValue <= this.value;
            }
            return operator == Operator.LT && jLongValue < this.value;
        }
    }

    public static class JSONPathParser {

        /* JADX INFO: renamed from: ch, reason: collision with root package name */
        private char f37886ch;
        private int level;
        private final String path;
        private int pos;

        public JSONPathParser(String str) {
            this.path = str;
            next();
        }

        static boolean isDigitFirst(char c10) {
            return c10 == '-' || c10 == '+' || (c10 >= '0' && c10 <= '9');
        }

        void accept(char c10) {
            if (this.f37886ch == c10) {
                if (isEOF()) {
                    return;
                }
                next();
            } else {
                throw new JSONPathException("expect '" + c10 + ", but '" + this.f37886ch + "'");
            }
        }

        Segement buildArraySegement(String str) {
            int length = str.length();
            int i10 = 0;
            char cCharAt = str.charAt(0);
            int i11 = length - 1;
            char cCharAt2 = str.charAt(i11);
            int iIndexOf = str.indexOf(44);
            if (str.length() > 2 && cCharAt == '\'' && cCharAt2 == '\'') {
                if (iIndexOf == -1) {
                    return new PropertySegement(str.substring(1, i11), false);
                }
                String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                String[] strArr = new String[strArrSplit.length];
                while (i10 < strArrSplit.length) {
                    String str2 = strArrSplit[i10];
                    strArr[i10] = str2.substring(1, str2.length() - 1);
                    i10++;
                }
                return new MultiPropertySegement(strArr);
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf == -1 && iIndexOf2 == -1) {
                if (!TypeUtils.isNumber(str)) {
                    return new PropertySegement(str, false);
                }
                try {
                    return new ArrayAccessSegement(Integer.parseInt(str));
                } catch (NumberFormatException unused) {
                    return new PropertySegement(str, false);
                }
            }
            if (iIndexOf != -1) {
                String[] strArrSplit2 = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                int[] iArr = new int[strArrSplit2.length];
                while (i10 < strArrSplit2.length) {
                    iArr[i10] = Integer.parseInt(strArrSplit2[i10]);
                    i10++;
                }
                return new MultiIndexSegement(iArr);
            }
            if (iIndexOf2 == -1) {
                throw new UnsupportedOperationException();
            }
            String[] strArrSplit3 = str.split(":");
            int length2 = strArrSplit3.length;
            int[] iArr2 = new int[length2];
            for (int i12 = 0; i12 < strArrSplit3.length; i12++) {
                String str3 = strArrSplit3[i12];
                if (str3.length() != 0) {
                    iArr2[i12] = Integer.parseInt(str3);
                } else {
                    if (i12 != 0) {
                        throw new UnsupportedOperationException();
                    }
                    iArr2[i12] = 0;
                }
            }
            int i13 = iArr2[0];
            int i14 = length2 > 1 ? iArr2[1] : -1;
            int i15 = length2 == 3 ? iArr2[2] : 1;
            if (i14 < 0 || i14 >= i13) {
                if (i15 > 0) {
                    return new RangeSegement(i13, i14, i15);
                }
                throw new UnsupportedOperationException("step must greater than zero : " + i15);
            }
            throw new UnsupportedOperationException("end must greater than or equals start. start " + i13 + ",  end " + i14);
        }

        public Segement[] explain() {
            String str = this.path;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException();
            }
            Segement[] segementArr = new Segement[8];
            while (true) {
                Segement segement = readSegement();
                if (segement == null) {
                    break;
                }
                int i10 = this.level;
                if (i10 == segementArr.length) {
                    Segement[] segementArr2 = new Segement[(i10 * 3) / 2];
                    System.arraycopy(segementArr, 0, segementArr2, 0, i10);
                    segementArr = segementArr2;
                }
                int i11 = this.level;
                this.level = i11 + 1;
                segementArr[i11] = segement;
            }
            int i12 = this.level;
            if (i12 == segementArr.length) {
                return segementArr;
            }
            Segement[] segementArr3 = new Segement[i12];
            System.arraycopy(segementArr, 0, segementArr3, 0, i12);
            return segementArr3;
        }

        Filter filterRest(Filter filter) {
            char c10 = this.f37886ch;
            boolean z10 = c10 == '&';
            if ((c10 != '&' || getNextChar() != '&') && (this.f37886ch != '|' || getNextChar() != '|')) {
                return filter;
            }
            next();
            next();
            while (this.f37886ch == ' ') {
                next();
            }
            return new FilterGroup(filter, (Filter) parseArrayAccessFilter(false), z10);
        }

        char getNextChar() {
            return this.path.charAt(this.pos);
        }

        boolean isEOF() {
            return this.pos >= this.path.length();
        }

        void next() {
            String str = this.path;
            int i10 = this.pos;
            this.pos = i10 + 1;
            this.f37886ch = str.charAt(i10);
        }

        Segement parseArrayAccess(boolean z10) {
            Object arrayAccessFilter = parseArrayAccessFilter(z10);
            return arrayAccessFilter instanceof Segement ? (Segement) arrayAccessFilter : new FilterSegement((Filter) arrayAccessFilter);
        }

        /* JADX WARN: Code duplicated, block: B:250:0x032b A[LOOP:7: B:248:0x0327->B:250:0x032b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:253:0x0333  */
        /* JADX WARN: Code duplicated, block: B:255:0x0339  */
        /* JADX WARN: Code duplicated, block: B:257:0x033e  */
        /* JADX WARN: Code duplicated, block: B:434:0x032f A[EDGE_INSN: B:434:0x032f->B:251:0x032f BREAK  A[LOOP:7: B:248:0x0327->B:250:0x032b], SYNTHETIC] */
        Object parseArrayAccessFilter(boolean z10) {
            boolean z11;
            char c10;
            char c11;
            char c12;
            char c13;
            char c14;
            char c15;
            String[] strArr;
            String str;
            String str2;
            Filter matchSegement;
            char c16;
            char c17;
            char c18;
            char c19;
            char c20;
            char c21;
            char c22;
            char c23;
            char c24;
            int i10;
            char c25;
            if (z10) {
                accept('[');
            }
            int i11 = 0;
            if (this.f37886ch == '?') {
                next();
                accept('(');
                if (this.f37886ch == '@') {
                    next();
                    accept(a.f131414g);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            char c26 = ']';
            char c27 = ')';
            if (!z11 && !IOUtils.firstIdentifier(this.f37886ch)) {
                int i12 = this.pos - 1;
                while (true) {
                    char c28 = this.f37886ch;
                    if (c28 == ']' || c28 == '/' || isEOF() || !((c25 = this.f37886ch) != '.' || z11 || z11)) {
                        break;
                    }
                    if (c25 == '\\') {
                        next();
                    }
                    next();
                }
                if (z10 || (c24 = this.f37886ch) == '/' || c24 == '.') {
                    int i13 = this.pos;
                    i10 = i13 - 1;
                } else {
                    i10 = this.pos;
                }
                String strSubstring = this.path.substring(i12, i10);
                if (strSubstring.indexOf("\\.") == -1) {
                    Segement segementBuildArraySegement = buildArraySegement(strSubstring);
                    if (z10 && !isEOF()) {
                        accept(']');
                    }
                    return segementBuildArraySegement;
                }
                String strReplaceAll = strSubstring.replaceAll("\\\\\\.", "\\.");
                if (strReplaceAll.indexOf("\\-") != -1) {
                    strReplaceAll = strReplaceAll.replaceAll("\\\\-", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                }
                if (z11) {
                    accept(')');
                }
                return new PropertySegement(strReplaceAll, false);
            }
            String name = readName();
            skipWhitespace();
            if (z11 && this.f37886ch == ')') {
                next();
                Filter notNullSegement = new NotNullSegement(name);
                while (true) {
                    c23 = this.f37886ch;
                    if (c23 != ' ') {
                        break;
                    }
                    next();
                }
                if (c23 == '&' || c23 == '|') {
                    notNullSegement = filterRest(notNullSegement);
                }
                if (z10) {
                    accept(']');
                }
                return notNullSegement;
            }
            if (z10 && this.f37886ch == ']') {
                next();
                Filter notNullSegement2 = new NotNullSegement(name);
                while (true) {
                    c22 = this.f37886ch;
                    if (c22 != ' ') {
                        break;
                    }
                    next();
                }
                if (c22 == '&' || c22 == '|') {
                    notNullSegement2 = filterRest(notNullSegement2);
                }
                accept(')');
                if (z11) {
                    accept(')');
                }
                if (z10) {
                    accept(']');
                }
                return notNullSegement2;
            }
            Operator op = readOp();
            skipWhitespace();
            if (op == Operator.BETWEEN || op == Operator.NOT_BETWEEN) {
                boolean z12 = op == Operator.NOT_BETWEEN;
                Object value = readValue();
                if (!"and".equalsIgnoreCase(readName())) {
                    throw new JSONPathException(this.path);
                }
                Object value2 = readValue();
                if (value == null || value2 == null) {
                    throw new JSONPathException(this.path);
                }
                if (JSONPath.isInt(value.getClass()) && JSONPath.isInt(value2.getClass())) {
                    return new IntBetweenSegement(name, ((Number) value).longValue(), ((Number) value2).longValue(), z12);
                }
                throw new JSONPathException(this.path);
            }
            if (op == Operator.IN || op == Operator.NOT_IN) {
                boolean z13 = op == Operator.NOT_IN;
                accept('(');
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(readValue());
                while (true) {
                    skipWhitespace();
                    if (this.f37886ch != ',') {
                        break;
                    }
                    next();
                    jSONArray.add(readValue());
                    c27 = c27;
                    c26 = c26;
                }
                boolean z14 = true;
                boolean z15 = true;
                boolean z16 = true;
                for (Object obj : jSONArray) {
                    if (obj != null) {
                        Class<?> cls = obj.getClass();
                        if (z14 && cls != Byte.class && cls != Short.class && cls != Integer.class && cls != Long.class) {
                            z14 = false;
                            z16 = false;
                        }
                        if (z15 && cls != String.class) {
                            z15 = false;
                        }
                    } else if (z14) {
                        z14 = false;
                    }
                }
                if (jSONArray.size() == 1 && jSONArray.get(0) == null) {
                    Filter notNullSegement3 = z13 ? new NotNullSegement(name) : new NullSegement(name);
                    while (true) {
                        c15 = this.f37886ch;
                        if (c15 != ' ') {
                            break;
                        }
                        next();
                    }
                    if (c15 == '&' || c15 == '|') {
                        notNullSegement3 = filterRest(notNullSegement3);
                    }
                    accept(')');
                    if (z11) {
                        accept(')');
                    }
                    if (z10) {
                        accept(']');
                    }
                    return notNullSegement3;
                }
                if (z14) {
                    if (jSONArray.size() == 1) {
                        Filter intOpSegement = new IntOpSegement(name, ((Number) jSONArray.get(0)).longValue(), z13 ? Operator.NE : Operator.EQ);
                        while (true) {
                            c14 = this.f37886ch;
                            if (c14 != ' ') {
                                break;
                            }
                            next();
                        }
                        if (c14 == '&' || c14 == '|') {
                            intOpSegement = filterRest(intOpSegement);
                        }
                        accept(')');
                        if (z11) {
                            accept(')');
                        }
                        if (z10) {
                            accept(']');
                        }
                        return intOpSegement;
                    }
                    int size = jSONArray.size();
                    long[] jArr = new long[size];
                    while (i11 < size) {
                        jArr[i11] = ((Number) jSONArray.get(i11)).longValue();
                        i11++;
                    }
                    Filter intInSegement = new IntInSegement(name, jArr, z13);
                    while (true) {
                        c13 = this.f37886ch;
                        if (c13 != ' ') {
                            break;
                        }
                        next();
                    }
                    if (c13 == '&' || c13 == '|') {
                        intInSegement = filterRest(intInSegement);
                    }
                    accept(')');
                    if (z11) {
                        accept(')');
                    }
                    if (z10) {
                        accept(']');
                    }
                    return intInSegement;
                }
                if (!z15) {
                    if (!z16) {
                        throw new UnsupportedOperationException();
                    }
                    int size2 = jSONArray.size();
                    Long[] lArr = new Long[size2];
                    while (i11 < size2) {
                        Number number = (Number) jSONArray.get(i11);
                        if (number != null) {
                            lArr[i11] = Long.valueOf(number.longValue());
                        }
                        i11++;
                    }
                    Filter intObjInSegement = new IntObjInSegement(name, lArr, z13);
                    while (true) {
                        c10 = this.f37886ch;
                        if (c10 != ' ') {
                            break;
                        }
                        next();
                    }
                    if (c10 == '&' || c10 == '|') {
                        intObjInSegement = filterRest(intObjInSegement);
                    }
                    accept(')');
                    if (z11) {
                        accept(')');
                    }
                    if (z10) {
                        accept(']');
                    }
                    return intObjInSegement;
                }
                if (jSONArray.size() == 1) {
                    Filter stringOpSegement = new StringOpSegement(name, (String) jSONArray.get(0), z13 ? Operator.NE : Operator.EQ);
                    while (true) {
                        c12 = this.f37886ch;
                        if (c12 != ' ') {
                            break;
                        }
                        next();
                    }
                    if (c12 == '&' || c12 == '|') {
                        stringOpSegement = filterRest(stringOpSegement);
                    }
                    accept(')');
                    if (z11) {
                        accept(')');
                    }
                    if (z10) {
                        accept(']');
                    }
                    return stringOpSegement;
                }
                String[] strArr2 = new String[jSONArray.size()];
                jSONArray.toArray(strArr2);
                Filter stringInSegement = new StringInSegement(name, strArr2, z13);
                while (true) {
                    c11 = this.f37886ch;
                    if (c11 != ' ') {
                        break;
                    }
                    next();
                }
                if (c11 == '&' || c11 == '|') {
                    stringInSegement = filterRest(stringInSegement);
                }
                accept(')');
                if (z11) {
                    accept(')');
                }
                if (z10) {
                    accept(']');
                }
                return stringInSegement;
            }
            char c29 = this.f37886ch;
            if (c29 != '\'' && c29 != '\"') {
                if (isDigitFirst(c29)) {
                    long longValue = readLongValue();
                    double doubleValue = this.f37886ch == '.' ? readDoubleValue(longValue) : 0.0d;
                    Filter intOpSegement2 = doubleValue == 0.0d ? new IntOpSegement(name, longValue, op) : new DoubleOpSegement(name, doubleValue, op);
                    while (true) {
                        c21 = this.f37886ch;
                        if (c21 != ' ') {
                            break;
                        }
                        next();
                    }
                    if (c21 == '&' || c21 == '|') {
                        intOpSegement2 = filterRest(intOpSegement2);
                    }
                    if (z11) {
                        accept(')');
                    }
                    if (z10) {
                        accept(']');
                    }
                    return intOpSegement2;
                }
                char c30 = this.f37886ch;
                if (c30 == 'n') {
                    if ("null".equals(readName())) {
                        Filter nullSegement = op == Operator.EQ ? new NullSegement(name) : op == Operator.NE ? new NotNullSegement(name) : null;
                        if (nullSegement != null) {
                            while (true) {
                                c20 = this.f37886ch;
                                if (c20 != ' ') {
                                    break;
                                }
                                next();
                            }
                            if (c20 == '&' || c20 == '|') {
                                nullSegement = filterRest(nullSegement);
                            }
                        }
                        if (z11) {
                            accept(')');
                        }
                        accept(']');
                        if (nullSegement != null) {
                            return nullSegement;
                        }
                        throw new UnsupportedOperationException();
                    }
                } else if (c30 == 't') {
                    if ("true".equals(readName())) {
                        Filter valueSegment = op == Operator.EQ ? new ValueSegment(name, Boolean.TRUE, true) : op == Operator.NE ? new ValueSegment(name, Boolean.TRUE, false) : null;
                        if (valueSegment != null) {
                            while (true) {
                                c19 = this.f37886ch;
                                if (c19 != ' ') {
                                    break;
                                }
                                next();
                            }
                            if (c19 == '&' || c19 == '|') {
                                valueSegment = filterRest(valueSegment);
                            }
                        }
                        if (z11) {
                            accept(')');
                        }
                        accept(']');
                        if (valueSegment != null) {
                            return valueSegment;
                        }
                        throw new UnsupportedOperationException();
                    }
                } else if (c30 == 'f' && "false".equals(readName())) {
                    Filter valueSegment2 = op == Operator.EQ ? new ValueSegment(name, Boolean.FALSE, true) : op == Operator.NE ? new ValueSegment(name, Boolean.FALSE, false) : null;
                    if (valueSegment2 != null) {
                        while (true) {
                            c18 = this.f37886ch;
                            if (c18 != ' ') {
                                break;
                            }
                            next();
                        }
                        if (c18 == '&' || c18 == '|') {
                            valueSegment2 = filterRest(valueSegment2);
                        }
                    }
                    if (z11) {
                        accept(')');
                    }
                    accept(']');
                    if (valueSegment2 != null) {
                        return valueSegment2;
                    }
                    throw new UnsupportedOperationException();
                }
                throw new UnsupportedOperationException();
            }
            String string = readString();
            if (op == Operator.RLIKE) {
                matchSegement = new RlikeSegement(name, string, false);
            } else {
                if (op != Operator.NOT_RLIKE) {
                    if (op == Operator.LIKE || op == Operator.NOT_LIKE) {
                        while (string.indexOf("%%") != -1) {
                            string = string.replaceAll("%%", "%");
                        }
                        boolean z17 = op == Operator.NOT_LIKE;
                        int iIndexOf = string.indexOf(37);
                        if (iIndexOf == -1) {
                            matchSegement = new StringOpSegement(name, string, op == Operator.LIKE ? Operator.EQ : Operator.NE);
                            c16 = ' ';
                        } else {
                            String[] strArrSplit = string.split("%");
                            if (iIndexOf == 0) {
                                if (string.charAt(string.length() - 1) == '%') {
                                    int length = strArrSplit.length - 1;
                                    String[] strArr3 = new String[length];
                                    System.arraycopy(strArrSplit, 1, strArr3, 0, length);
                                    strArr = strArr3;
                                    str2 = null;
                                    str = null;
                                } else {
                                    String str3 = strArrSplit[strArrSplit.length - 1];
                                    if (strArrSplit.length > 2) {
                                        int length2 = strArrSplit.length - 2;
                                        String[] strArr4 = new String[length2];
                                        System.arraycopy(strArrSplit, 1, strArr4, 0, length2);
                                        str = str3;
                                        strArr = strArr4;
                                        str2 = null;
                                    } else {
                                        str = str3;
                                        str2 = null;
                                        strArr = null;
                                    }
                                }
                            } else if (string.charAt(string.length() - 1) == '%') {
                                strArr = strArrSplit;
                                str2 = null;
                                str = null;
                            } else {
                                if (strArrSplit.length == 1) {
                                    str2 = strArrSplit[0];
                                    str = null;
                                } else if (strArrSplit.length == 2) {
                                    String str4 = strArrSplit[0];
                                    str = strArrSplit[1];
                                    str2 = str4;
                                } else {
                                    String str5 = strArrSplit[0];
                                    String str6 = strArrSplit[strArrSplit.length - 1];
                                    int length3 = strArrSplit.length - 2;
                                    String[] strArr5 = new String[length3];
                                    System.arraycopy(strArrSplit, 1, strArr5, 0, length3);
                                    strArr = strArr5;
                                    str = str6;
                                    str2 = str5;
                                }
                                strArr = null;
                            }
                            c16 = ' ';
                            matchSegement = new MatchSegement(name, str2, str, strArr, z17);
                        }
                    } else {
                        matchSegement = new StringOpSegement(name, string, op);
                    }
                    while (true) {
                        c17 = this.f37886ch;
                        if (c17 == c16) {
                            break;
                        }
                        next();
                    }
                    if (c17 != '&' || c17 == '|') {
                        matchSegement = filterRest(matchSegement);
                    }
                    if (z11) {
                        accept(')');
                    }
                    if (z10) {
                        accept(']');
                    }
                    return matchSegement;
                }
                matchSegement = new RlikeSegement(name, string, true);
            }
            c16 = ' ';
            while (true) {
                c17 = this.f37886ch;
                if (c17 == c16) {
                    break;
                    break;
                }
                next();
            }
            if (c17 != '&') {
                matchSegement = filterRest(matchSegement);
            } else {
                matchSegement = filterRest(matchSegement);
            }
            if (z11) {
                accept(')');
            }
            if (z10) {
                accept(']');
            }
            return matchSegement;
        }

        protected double readDoubleValue(long j10) {
            int i10 = this.pos - 1;
            next();
            while (true) {
                char c10 = this.f37886ch;
                if (c10 < '0' || c10 > '9') {
                    break;
                }
                next();
            }
            return Double.parseDouble(this.path.substring(i10, this.pos - 1)) + j10;
        }

        protected long readLongValue() {
            int i10 = this.pos - 1;
            char c10 = this.f37886ch;
            if (c10 == '+' || c10 == '-') {
                next();
            }
            while (true) {
                char c11 = this.f37886ch;
                if (c11 < '0' || c11 > '9') {
                    break;
                }
                next();
            }
            return Long.parseLong(this.path.substring(i10, this.pos - 1));
        }

        String readName() {
            skipWhitespace();
            char c10 = this.f37886ch;
            if (c10 != '\\' && !IOUtils.firstIdentifier(c10)) {
                throw new JSONPathException("illeal jsonpath syntax. " + this.path);
            }
            StringBuilder sb2 = new StringBuilder();
            while (!isEOF()) {
                char c11 = this.f37886ch;
                if (c11 == '\\') {
                    next();
                    sb2.append(this.f37886ch);
                    if (isEOF()) {
                        break;
                    }
                    next();
                } else {
                    if (!IOUtils.isIdent(c11)) {
                        break;
                    }
                    sb2.append(this.f37886ch);
                    next();
                }
            }
            if (isEOF() && IOUtils.isIdent(this.f37886ch)) {
                sb2.append(this.f37886ch);
            }
            return sb2.toString();
        }

        protected Operator readOp() {
            Operator operator;
            char c10 = this.f37886ch;
            if (c10 == '=') {
                next();
                operator = Operator.EQ;
            } else if (c10 == '!') {
                next();
                accept(n5.a.f132013h);
                operator = Operator.NE;
            } else if (c10 == '<') {
                next();
                if (this.f37886ch == '=') {
                    next();
                    operator = Operator.LE;
                } else {
                    operator = Operator.LT;
                }
            } else if (c10 == '>') {
                next();
                if (this.f37886ch == '=') {
                    next();
                    operator = Operator.GE;
                } else {
                    operator = Operator.GT;
                }
            } else {
                operator = null;
            }
            if (operator != null) {
                return operator;
            }
            String name = readName();
            if (!"not".equalsIgnoreCase(name)) {
                if ("like".equalsIgnoreCase(name)) {
                    return Operator.LIKE;
                }
                if ("rlike".equalsIgnoreCase(name)) {
                    return Operator.RLIKE;
                }
                if ("in".equalsIgnoreCase(name)) {
                    return Operator.IN;
                }
                if ("between".equalsIgnoreCase(name)) {
                    return Operator.BETWEEN;
                }
                throw new UnsupportedOperationException();
            }
            skipWhitespace();
            String name2 = readName();
            if ("like".equalsIgnoreCase(name2)) {
                return Operator.NOT_LIKE;
            }
            if ("rlike".equalsIgnoreCase(name2)) {
                return Operator.NOT_RLIKE;
            }
            if ("in".equalsIgnoreCase(name2)) {
                return Operator.NOT_IN;
            }
            if ("between".equalsIgnoreCase(name2)) {
                return Operator.NOT_BETWEEN;
            }
            throw new UnsupportedOperationException();
        }

        Segement readSegement() {
            boolean z10 = true;
            if (this.level == 0 && this.path.length() == 1) {
                if (isDigitFirst(this.f37886ch)) {
                    return new ArrayAccessSegement(this.f37886ch - '0');
                }
                char c10 = this.f37886ch;
                if ((c10 >= 'a' && c10 <= 'z') || (c10 >= 'A' && c10 <= 'Z')) {
                    return new PropertySegement(Character.toString(c10), false);
                }
            }
            while (!isEOF()) {
                skipWhitespace();
                char c11 = this.f37886ch;
                if (c11 != '$') {
                    if (c11 != '.' && c11 != '/') {
                        if (c11 == '[') {
                            return parseArrayAccess(true);
                        }
                        if (this.level == 0) {
                            return new PropertySegement(readName(), false);
                        }
                        throw new JSONPathException("not support jsonpath : " + this.path);
                    }
                    next();
                    if (c11 == '.' && this.f37886ch == '.') {
                        next();
                        int length = this.path.length();
                        int i10 = this.pos;
                        if (length > i10 + 3 && this.f37886ch == '[' && this.path.charAt(i10) == '*' && this.path.charAt(this.pos + 1) == ']' && this.path.charAt(this.pos + 2) == '.') {
                            next();
                            next();
                            next();
                            next();
                        }
                    } else {
                        z10 = false;
                    }
                    char c12 = this.f37886ch;
                    if (c12 == '*') {
                        if (!isEOF()) {
                            next();
                        }
                        return WildCardSegement.instance;
                    }
                    if (isDigitFirst(c12)) {
                        return parseArrayAccess(false);
                    }
                    String name = readName();
                    if (this.f37886ch != '(') {
                        return new PropertySegement(name, z10);
                    }
                    next();
                    if (this.f37886ch != ')') {
                        throw new JSONPathException("not support jsonpath : " + this.path);
                    }
                    if (!isEOF()) {
                        next();
                    }
                    if (UiKitSpanObj.TYPE_SIZE.equals(name) || k0.f48801p.equals(name)) {
                        return SizeSegement.instance;
                    }
                    throw new JSONPathException("not support jsonpath : " + this.path);
                }
                next();
            }
            return null;
        }

        String readString() {
            char c10 = this.f37886ch;
            next();
            int i10 = this.pos - 1;
            while (this.f37886ch != c10 && !isEOF()) {
                next();
            }
            String strSubstring = this.path.substring(i10, isEOF() ? this.pos : this.pos - 1);
            accept(c10);
            return strSubstring;
        }

        protected Object readValue() {
            skipWhitespace();
            if (isDigitFirst(this.f37886ch)) {
                return Long.valueOf(readLongValue());
            }
            char c10 = this.f37886ch;
            if (c10 == '\"' || c10 == '\'') {
                return readString();
            }
            if (c10 != 'n') {
                throw new UnsupportedOperationException();
            }
            if ("null".equals(readName())) {
                return null;
            }
            throw new JSONPathException(this.path);
        }

        public final void skipWhitespace() {
            while (true) {
                char c10 = this.f37886ch;
                if (c10 > ' ') {
                    return;
                }
                if (c10 != ' ' && c10 != '\r' && c10 != '\n' && c10 != '\t' && c10 != '\f' && c10 != '\b') {
                    return;
                } else {
                    next();
                }
            }
        }
    }

    public static class MatchSegement implements Filter {
        private final String[] containsValues;
        private final String endsWithValue;
        private final int minLength;
        private final boolean not;
        private final String propertyName;
        private final long propertyNameHash;
        private final String startsWithValue;

        public MatchSegement(String str, String str2, String str3, String[] strArr, boolean z10) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.startsWithValue = str2;
            this.endsWithValue = str3;
            this.containsValues = strArr;
            this.not = z10;
            int length = str2 != null ? str2.length() + 0 : 0;
            length = str3 != null ? length + str3.length() : length;
            if (strArr != null) {
                for (String str4 : strArr) {
                    length += str4.length();
                }
            }
            this.minLength = length;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            int length;
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null) {
                return false;
            }
            String string = propertyValue.toString();
            if (string.length() < this.minLength) {
                return this.not;
            }
            String str = this.startsWithValue;
            if (str == null) {
                length = 0;
            } else {
                if (!string.startsWith(str)) {
                    return this.not;
                }
                length = this.startsWithValue.length() + 0;
            }
            String[] strArr = this.containsValues;
            if (strArr != null) {
                for (String str2 : strArr) {
                    int iIndexOf = string.indexOf(str2, length);
                    if (iIndexOf == -1) {
                        return this.not;
                    }
                    length = iIndexOf + str2.length();
                }
            }
            String str3 = this.endsWithValue;
            return (str3 == null || string.endsWith(str3)) ? !this.not : this.not;
        }
    }

    public static class MultiIndexSegement implements Segement {
        private final int[] indexes;

        public MultiIndexSegement(int[] iArr) {
            this.indexes = iArr;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            ArrayList arrayList = new ArrayList(this.indexes.length);
            int i10 = 0;
            while (true) {
                int[] iArr = this.indexes;
                if (i10 >= iArr.length) {
                    return arrayList;
                }
                arrayList.add(jSONPath.getArrayItem(obj2, iArr[i10]));
                i10++;
            }
        }
    }

    public static class MultiPropertySegement implements Segement {
        private final String[] propertyNames;
        private final long[] propertyNamesHash;

        public MultiPropertySegement(String[] strArr) {
            this.propertyNames = strArr;
            this.propertyNamesHash = new long[strArr.length];
            int i10 = 0;
            while (true) {
                long[] jArr = this.propertyNamesHash;
                if (i10 >= jArr.length) {
                    return;
                }
                jArr[i10] = TypeUtils.fnv1a_64(strArr[i10]);
                i10++;
            }
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            ArrayList arrayList = new ArrayList(this.propertyNames.length);
            int i10 = 0;
            while (true) {
                String[] strArr = this.propertyNames;
                if (i10 >= strArr.length) {
                    return arrayList;
                }
                arrayList.add(jSONPath.getPropertyValue(obj2, strArr[i10], this.propertyNamesHash[i10]));
                i10++;
            }
        }
    }

    public static class NotNullSegement implements Filter {
        private final String propertyName;
        private final long propertyNameHash;

        public NotNullSegement(String str) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            return jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash) != null;
        }
    }

    public static class NullSegement implements Filter {
        private final String propertyName;
        private final long propertyNameHash;

        public NullSegement(String str) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            return jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash) == null;
        }
    }

    public enum Operator {
        EQ,
        NE,
        GT,
        GE,
        LT,
        LE,
        LIKE,
        NOT_LIKE,
        RLIKE,
        NOT_RLIKE,
        IN,
        NOT_IN,
        BETWEEN,
        NOT_BETWEEN,
        And,
        Or
    }

    public static class PropertySegement implements Segement {
        private final boolean deep;
        private final String propertyName;
        private final long propertyNameHash;

        public PropertySegement(String str, boolean z10) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.deep = z10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (!this.deep) {
                return jSONPath.getPropertyValue(obj2, this.propertyName, this.propertyNameHash);
            }
            ArrayList arrayList = new ArrayList();
            jSONPath.deepScan(obj2, this.propertyName, arrayList);
            return arrayList;
        }

        public boolean remove(JSONPath jSONPath, Object obj) {
            return jSONPath.removePropertyValue(obj, this.propertyName);
        }

        public void setValue(JSONPath jSONPath, Object obj, Object obj2) {
            if (this.deep) {
                jSONPath.deepSet(obj, this.propertyName, this.propertyNameHash, obj2);
            } else {
                jSONPath.setPropertyValue(obj, this.propertyName, this.propertyNameHash, obj2);
            }
        }
    }

    public static class RangeSegement implements Segement {
        private final int end;
        private final int start;
        private final int step;

        public RangeSegement(int i10, int i11, int i12) {
            this.start = i10;
            this.end = i11;
            this.step = i12;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            int iIntValue = SizeSegement.instance.eval(jSONPath, obj, obj2).intValue();
            int i10 = this.start;
            if (i10 < 0) {
                i10 += iIntValue;
            }
            int i11 = this.end;
            if (i11 < 0) {
                i11 += iIntValue;
            }
            int i12 = ((i11 - i10) / this.step) + 1;
            if (i12 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i12);
            while (i10 <= i11 && i10 < iIntValue) {
                arrayList.add(jSONPath.getArrayItem(obj2, i10));
                i10 += this.step;
            }
            return arrayList;
        }
    }

    public static class RlikeSegement implements Filter {
        private final boolean not;
        private final Pattern pattern;
        private final String propertyName;
        private final long propertyNameHash;

        public RlikeSegement(String str, String str2, boolean z10) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.pattern = Pattern.compile(str2);
            this.not = z10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null) {
                return false;
            }
            boolean zMatches = this.pattern.matcher(propertyValue.toString()).matches();
            return this.not ? !zMatches : zMatches;
        }
    }

    public interface Segement {
        Object eval(JSONPath jSONPath, Object obj, Object obj2);
    }

    public static class SizeSegement implements Segement {
        public static final SizeSegement instance = new SizeSegement();

        SizeSegement() {
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public Integer eval(JSONPath jSONPath, Object obj, Object obj2) {
            return Integer.valueOf(jSONPath.evalSize(obj2));
        }
    }

    public static class StringInSegement implements Filter {
        private final boolean not;
        private final String propertyName;
        private final long propertyNameHash;
        private final String[] values;

        public StringInSegement(String str, String[] strArr, boolean z10) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.values = strArr;
            this.not = z10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            for (String str : this.values) {
                if (str == propertyValue) {
                    return !this.not;
                }
                if (str != null && str.equals(propertyValue)) {
                    return !this.not;
                }
            }
            return this.not;
        }
    }

    public static class StringOpSegement implements Filter {
        private final Operator op;
        private final String propertyName;
        private final long propertyNameHash;
        private final String value;

        public StringOpSegement(String str, String str2, Operator operator) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.value = str2;
            this.op = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            Operator operator = this.op;
            if (operator == Operator.EQ) {
                return this.value.equals(propertyValue);
            }
            if (operator == Operator.NE) {
                return !this.value.equals(propertyValue);
            }
            if (propertyValue == null) {
                return false;
            }
            int iCompareTo = this.value.compareTo(propertyValue.toString());
            Operator operator2 = this.op;
            if (operator2 == Operator.GE) {
                return iCompareTo <= 0;
            }
            if (operator2 == Operator.GT) {
                return iCompareTo < 0;
            }
            if (operator2 == Operator.LE) {
                return iCompareTo >= 0;
            }
            return operator2 == Operator.LT && iCompareTo > 0;
        }
    }

    public static class ValueSegment implements Filter {
        private boolean eq;
        private final String propertyName;
        private final long propertyNameHash;
        private final Object value;

        public ValueSegment(String str, Object obj, boolean z10) {
            this.eq = true;
            if (obj == null) {
                throw new IllegalArgumentException("value is null");
            }
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.value = obj;
            this.eq = z10;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            boolean zEquals = this.value.equals(jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash));
            return !this.eq ? !zEquals : zEquals;
        }
    }

    public static class WildCardSegement implements Segement {
        public static WildCardSegement instance = new WildCardSegement();

        WildCardSegement() {
        }

        @Override // com.alibaba.fastjson.JSONPath.Segement
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            return jSONPath.getPropertyValues(obj2);
        }
    }

    public JSONPath(String str) {
        this(str, SerializeConfig.getGlobalInstance(), ParserConfig.getGlobalInstance());
    }

    public JSONPath(String str, SerializeConfig serializeConfig, ParserConfig parserConfig) {
        if (str == null || str.length() == 0) {
            throw new JSONPathException("json-path can not be null or empty");
        }
        this.path = str;
        this.serializeConfig = serializeConfig;
        this.parserConfig = parserConfig;
    }

    public static void arrayAdd(Object obj, String str, Object... objArr) {
        compile(str).arrayAdd(obj, objArr);
    }

    public static JSONPath compile(String str) {
        if (str == null) {
            throw new JSONPathException("jsonpath can not be null");
        }
        JSONPath jSONPath = pathCache.get(str);
        if (jSONPath != null) {
            return jSONPath;
        }
        JSONPath jSONPath2 = new JSONPath(str);
        if (pathCache.size() >= 1024) {
            return jSONPath2;
        }
        pathCache.putIfAbsent(str, jSONPath2);
        return pathCache.get(str);
    }

    public static boolean contains(Object obj, String str) {
        if (obj == null) {
            return false;
        }
        return compile(str).contains(obj);
    }

    public static boolean containsValue(Object obj, String str, Object obj2) {
        return compile(str).containsValue(obj, obj2);
    }

    static boolean eq(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (obj.getClass() != obj2.getClass() && (obj instanceof Number)) {
            if (obj2 instanceof Number) {
                return eqNotNull((Number) obj, (Number) obj2);
            }
            return false;
        }
        return obj.equals(obj2);
    }

    static boolean eqNotNull(Number number, Number number2) {
        Class<?> cls = number.getClass();
        boolean zIsInt = isInt(cls);
        Class<?> cls2 = number2.getClass();
        boolean zIsInt2 = isInt(cls2);
        if (number instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) number;
            if (zIsInt2) {
                return bigDecimal.equals(BigDecimal.valueOf(number2.longValue()));
            }
        }
        if (zIsInt) {
            if (zIsInt2) {
                return number.longValue() == number2.longValue();
            }
            if (number2 instanceof BigInteger) {
                return BigInteger.valueOf(number.longValue()).equals((BigInteger) number);
            }
        }
        if (zIsInt2 && (number instanceof BigInteger)) {
            return ((BigInteger) number).equals(BigInteger.valueOf(number2.longValue()));
        }
        boolean zIsDouble = isDouble(cls);
        boolean zIsDouble2 = isDouble(cls2);
        return ((zIsDouble && zIsDouble2) || ((zIsDouble && zIsInt2) || (zIsDouble2 && zIsInt))) && number.doubleValue() == number2.doubleValue();
    }

    public static Object eval(Object obj, String str) {
        return compile(str).eval(obj);
    }

    protected static boolean isDouble(Class<?> cls) {
        return cls == Float.class || cls == Double.class;
    }

    protected static boolean isInt(Class<?> cls) {
        return cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class;
    }

    public static Map<String, Object> paths(Object obj) {
        return paths(obj, SerializeConfig.globalInstance);
    }

    public static Map<String, Object> paths(Object obj, SerializeConfig serializeConfig) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        HashMap map = new HashMap();
        paths(identityHashMap, map, "/", obj, serializeConfig);
        return map;
    }

    private static void paths(Map<Object, String> map, String str, Object obj, SerializeConfig serializeConfig) {
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        if (obj == null || map.containsKey(obj)) {
            return;
        }
        map.put(obj, str);
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    if (str.equals("/")) {
                        sb5 = new StringBuilder();
                    } else {
                        sb5 = new StringBuilder();
                        sb5.append(str);
                    }
                    sb5.append("/");
                    sb5.append(key);
                    paths(map, sb5.toString(), entry.getValue(), serializeConfig);
                }
            }
            return;
        }
        int i10 = 0;
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                if (str.equals("/")) {
                    sb4 = new StringBuilder();
                } else {
                    sb4 = new StringBuilder();
                    sb4.append(str);
                }
                sb4.append("/");
                sb4.append(i10);
                paths(map, sb4.toString(), obj2, serializeConfig);
                i10++;
            }
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            while (i10 < length) {
                Object obj3 = Array.get(obj, i10);
                if (str.equals("/")) {
                    sb3 = new StringBuilder();
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(str);
                }
                sb3.append("/");
                sb3.append(i10);
                paths(map, sb3.toString(), obj3, serializeConfig);
                i10++;
            }
            return;
        }
        if (ParserConfig.isPrimitive2(cls) || cls.isEnum()) {
            return;
        }
        ObjectSerializer objectWriter = serializeConfig.getObjectWriter(cls);
        if (objectWriter instanceof JavaBeanSerializer) {
            try {
                for (Map.Entry<String, Object> entry2 : ((JavaBeanSerializer) objectWriter).getFieldValuesMap(obj).entrySet()) {
                    String key2 = entry2.getKey();
                    if (key2 instanceof String) {
                        if (str.equals("/")) {
                            sb2 = new StringBuilder();
                            sb2.append("/");
                            sb2.append(key2);
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append("/");
                            sb2.append(key2);
                        }
                        paths(map, sb2.toString(), entry2.getValue(), serializeConfig);
                    }
                }
            } catch (Exception e10) {
                throw new JSONException("toJSON error", e10);
            }
        }
    }

    private static void paths(Map<Object, String> map, Map<String, Object> map2, String str, Object obj, SerializeConfig serializeConfig) {
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        if (obj == null) {
            return;
        }
        int i10 = 0;
        if (map.put(obj, str) != null) {
            if (!((obj instanceof String) || (obj instanceof Number) || (obj instanceof Date) || (obj instanceof UUID))) {
                return;
            }
        }
        map2.put(str, obj);
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    if (str.equals("/")) {
                        sb5 = new StringBuilder();
                    } else {
                        sb5 = new StringBuilder();
                        sb5.append(str);
                    }
                    sb5.append("/");
                    sb5.append(key);
                    paths(map, map2, sb5.toString(), entry.getValue(), serializeConfig);
                }
            }
            return;
        }
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                if (str.equals("/")) {
                    sb4 = new StringBuilder();
                } else {
                    sb4 = new StringBuilder();
                    sb4.append(str);
                }
                sb4.append("/");
                sb4.append(i10);
                paths(map, map2, sb4.toString(), obj2, serializeConfig);
                i10++;
            }
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            while (i10 < length) {
                Object obj3 = Array.get(obj, i10);
                if (str.equals("/")) {
                    sb3 = new StringBuilder();
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(str);
                }
                sb3.append("/");
                sb3.append(i10);
                paths(map, map2, sb3.toString(), obj3, serializeConfig);
                i10++;
            }
            return;
        }
        if (ParserConfig.isPrimitive2(cls) || cls.isEnum()) {
            return;
        }
        ObjectSerializer objectWriter = serializeConfig.getObjectWriter(cls);
        if (objectWriter instanceof JavaBeanSerializer) {
            try {
                for (Map.Entry<String, Object> entry2 : ((JavaBeanSerializer) objectWriter).getFieldValuesMap(obj).entrySet()) {
                    String key2 = entry2.getKey();
                    if (key2 instanceof String) {
                        if (str.equals("/")) {
                            sb2 = new StringBuilder();
                            sb2.append("/");
                            sb2.append(key2);
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append("/");
                            sb2.append(key2);
                        }
                        paths(map, map2, sb2.toString(), entry2.getValue(), serializeConfig);
                    }
                }
            } catch (Exception e10) {
                throw new JSONException("toJSON error", e10);
            }
        }
    }

    public static Object read(String str, String str2) {
        return compile(str2).eval(JSON.parse(str));
    }

    public static boolean remove(Object obj, String str) {
        return compile(str).remove(obj);
    }

    public static boolean set(Object obj, String str, Object obj2) {
        return compile(str).set(obj, obj2);
    }

    public static int size(Object obj, String str) {
        JSONPath jSONPathCompile = compile(str);
        return jSONPathCompile.evalSize(jSONPathCompile.eval(obj));
    }

    public void arrayAdd(Object obj, Object... objArr) {
        if (objArr == null || objArr.length == 0 || obj == null) {
            return;
        }
        init();
        Object obj2 = null;
        int i10 = 0;
        Object objEval = obj;
        int i11 = 0;
        while (true) {
            Segement[] segementArr = this.segments;
            if (i11 >= segementArr.length) {
                break;
            }
            if (i11 == segementArr.length - 1) {
                obj2 = objEval;
            }
            objEval = segementArr[i11].eval(this, obj, objEval);
            i11++;
        }
        if (objEval == null) {
            throw new JSONPathException("value not found in path " + this.path);
        }
        if (objEval instanceof Collection) {
            Collection collection = (Collection) objEval;
            int length = objArr.length;
            while (i10 < length) {
                collection.add(objArr[i10]);
                i10++;
            }
            return;
        }
        Class<?> cls = objEval.getClass();
        if (!cls.isArray()) {
            throw new JSONException("unsupported array put operation. " + cls);
        }
        int length2 = Array.getLength(objEval);
        Object objNewInstance = Array.newInstance(cls.getComponentType(), objArr.length + length2);
        System.arraycopy(objEval, 0, objNewInstance, 0, length2);
        while (i10 < objArr.length) {
            Array.set(objNewInstance, length2 + i10, objArr[i10]);
            i10++;
        }
        Segement[] segementArr2 = this.segments;
        Segement segement = segementArr2[segementArr2.length - 1];
        if (segement instanceof PropertySegement) {
            ((PropertySegement) segement).setValue(this, obj2, objNewInstance);
        } else {
            if (!(segement instanceof ArrayAccessSegement)) {
                throw new UnsupportedOperationException();
            }
            ((ArrayAccessSegement) segement).setValue(this, obj2, objNewInstance);
        }
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        init();
        Object objEval = obj;
        int i10 = 0;
        while (true) {
            Segement[] segementArr = this.segments;
            if (i10 >= segementArr.length) {
                return true;
            }
            objEval = segementArr[i10].eval(this, obj, objEval);
            if (objEval == null) {
                return false;
            }
            i10++;
        }
    }

    public boolean containsValue(Object obj, Object obj2) {
        Object objEval = eval(obj);
        if (objEval == obj2) {
            return true;
        }
        if (objEval == null) {
            return false;
        }
        if (!(objEval instanceof Iterable)) {
            return eq(objEval, obj2);
        }
        Iterator it = ((Iterable) objEval).iterator();
        while (it.hasNext()) {
            if (eq(it.next(), obj2)) {
                return true;
            }
        }
        return false;
    }

    protected void deepScan(Object obj, String str, List<Object> list) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(str)) {
                list.add(map.get(str));
                return;
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                deepScan(it.next(), str, list);
            }
            return;
        }
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj.getClass());
        if (javaBeanSerializer == null) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    deepScan(list2.get(i10), str, list);
                }
                return;
            }
            return;
        }
        try {
            FieldSerializer fieldSerializer = javaBeanSerializer.getFieldSerializer(str);
            if (fieldSerializer == null) {
                Iterator<Object> it2 = javaBeanSerializer.getFieldValues(obj).iterator();
                while (it2.hasNext()) {
                    deepScan(it2.next(), str, list);
                }
                return;
            }
            try {
                try {
                    list.add(fieldSerializer.getPropertyValueDirect(obj));
                } catch (InvocationTargetException e10) {
                    throw new JSONException("getFieldValue error." + str, e10);
                }
            } catch (IllegalAccessException e11) {
                throw new JSONException("getFieldValue error." + str, e11);
            }
        } catch (Exception e12) {
            throw new JSONPathException("jsonpath error, path " + this.path + ", segement " + str, e12);
        }
    }

    protected void deepSet(Object obj, String str, long j10, Object obj2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(str)) {
                map.get(str);
                map.put(str, obj2);
                return;
            } else {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    deepSet(it.next(), str, j10, obj2);
                }
                return;
            }
        }
        Class<?> cls = obj.getClass();
        JavaBeanDeserializer javaBeanDeserializer = getJavaBeanDeserializer(cls);
        if (javaBeanDeserializer == null) {
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    deepSet(list.get(i10), str, j10, obj2);
                }
                return;
            }
            return;
        }
        try {
            FieldDeserializer fieldDeserializer = javaBeanDeserializer.getFieldDeserializer(str);
            if (fieldDeserializer != null) {
                fieldDeserializer.setValue(obj, obj2);
                return;
            }
            Iterator<Object> it2 = getJavaBeanSerializer(cls).getObjectFieldValues(obj).iterator();
            while (it2.hasNext()) {
                deepSet(it2.next(), str, j10, obj2);
            }
        } catch (Exception e10) {
            throw new JSONPathException("jsonpath error, path " + this.path + ", segement " + str, e10);
        }
    }

    public Object eval(Object obj) {
        if (obj == null) {
            return null;
        }
        init();
        int i10 = 0;
        Object objEval = obj;
        while (true) {
            Segement[] segementArr = this.segments;
            if (i10 >= segementArr.length) {
                return objEval;
            }
            objEval = segementArr[i10].eval(this, obj, objEval);
            i10++;
        }
    }

    int evalSize(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length;
        }
        if (obj.getClass().isArray()) {
            return Array.getLength(obj);
        }
        if (obj instanceof Map) {
            int i10 = 0;
            Iterator it = ((Map) obj).values().iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    i10++;
                }
            }
            return i10;
        }
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj.getClass());
        if (javaBeanSerializer == null) {
            return -1;
        }
        try {
            return javaBeanSerializer.getSize(obj);
        } catch (Exception e10) {
            throw new JSONPathException("evalSize error : " + this.path, e10);
        }
    }

    protected Object getArrayItem(Object obj, int i10) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (i10 >= 0) {
                if (i10 < list.size()) {
                    return list.get(i10);
                }
                return null;
            }
            if (Math.abs(i10) <= list.size()) {
                return list.get(list.size() + i10);
            }
            return null;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            if (i10 >= 0) {
                if (i10 < length) {
                    return Array.get(obj, i10);
                }
                return null;
            }
            if (Math.abs(i10) <= length) {
                return Array.get(obj, length + i10);
            }
            return null;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(Integer.valueOf(i10));
            return obj2 == null ? map.get(Integer.toString(i10)) : obj2;
        }
        if (!(obj instanceof Collection)) {
            throw new UnsupportedOperationException();
        }
        int i11 = 0;
        for (Object obj3 : (Collection) obj) {
            if (i11 == i10) {
                return obj3;
            }
            i11++;
        }
        return null;
    }

    protected JavaBeanDeserializer getJavaBeanDeserializer(Class<?> cls) {
        ObjectDeserializer deserializer = this.parserConfig.getDeserializer(cls);
        if (deserializer instanceof JavaBeanDeserializer) {
            return (JavaBeanDeserializer) deserializer;
        }
        return null;
    }

    protected JavaBeanSerializer getJavaBeanSerializer(Class<?> cls) {
        ObjectSerializer objectWriter = this.serializeConfig.getObjectWriter(cls);
        if (objectWriter instanceof JavaBeanSerializer) {
            return (JavaBeanSerializer) objectWriter;
        }
        return null;
    }

    public String getPath() {
        return this.path;
    }

    protected Object getPropertyValue(Object obj, String str, long j10) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(str);
            if (obj2 == null) {
                return (SIZE == j10 || LENGTH == j10) ? Integer.valueOf(map.size()) : obj2;
            }
            return obj2;
        }
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj.getClass());
        if (javaBeanSerializer != null) {
            try {
                return javaBeanSerializer.getFieldValue(obj, str, j10, false);
            } catch (Exception e10) {
                throw new JSONPathException("jsonpath error, path " + this.path + ", segement " + str, e10);
            }
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (SIZE == j10 || LENGTH == j10) {
                return Integer.valueOf(list.size());
            }
            JSONArray jSONArray = new JSONArray(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj3 = list.get(i10);
                if (obj3 == list) {
                    jSONArray.add(obj3);
                } else {
                    Object propertyValue = getPropertyValue(obj3, str, j10);
                    if (propertyValue instanceof Collection) {
                        jSONArray.addAll((Collection) propertyValue);
                    } else if (propertyValue != null) {
                        jSONArray.add(propertyValue);
                    }
                }
            }
            return jSONArray;
        }
        if (obj instanceof Enum) {
            Enum r10 = (Enum) obj;
            if (-4270347329889690746L == j10) {
                return r10.name();
            }
            if (-1014497654951707614L == j10) {
                return Integer.valueOf(r10.ordinal());
            }
        }
        if (obj instanceof Calendar) {
            Calendar calendar = (Calendar) obj;
            if (8963398325558730460L == j10) {
                return Integer.valueOf(calendar.get(1));
            }
            if (-811277319855450459L == j10) {
                return Integer.valueOf(calendar.get(2));
            }
            if (-3851359326990528739L == j10) {
                return Integer.valueOf(calendar.get(5));
            }
            if (4647432019745535567L == j10) {
                return Integer.valueOf(calendar.get(11));
            }
            if (6607618197526598121L == j10) {
                return Integer.valueOf(calendar.get(12));
            }
            if (-6586085717218287427L == j10) {
                return Integer.valueOf(calendar.get(13));
            }
        }
        return null;
    }

    protected Collection<Object> getPropertyValues(Object obj) {
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj.getClass());
        if (javaBeanSerializer == null) {
            if (obj instanceof Map) {
                return ((Map) obj).values();
            }
            throw new UnsupportedOperationException();
        }
        try {
            return javaBeanSerializer.getFieldValues(obj);
        } catch (Exception e10) {
            throw new JSONPathException("jsonpath error, path " + this.path, e10);
        }
    }

    protected void init() {
        if (this.segments != null) {
            return;
        }
        if (b.f28327e.equals(this.path)) {
            this.segments = new Segement[]{WildCardSegement.instance};
        } else {
            this.segments = new JSONPathParser(this.path).explain();
        }
    }

    public boolean remove(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        init();
        Object obj2 = null;
        Object objEval = obj;
        int i10 = 0;
        while (true) {
            Segement[] segementArr = this.segments;
            if (i10 >= segementArr.length) {
                break;
            }
            if (i10 == segementArr.length - 1) {
                obj2 = objEval;
                break;
            }
            objEval = segementArr[i10].eval(this, obj, objEval);
            if (objEval == null) {
                break;
            }
            i10++;
        }
        if (obj2 == null) {
            return false;
        }
        Segement[] segementArr2 = this.segments;
        Segement segement = segementArr2[segementArr2.length - 1];
        if (!(segement instanceof PropertySegement)) {
            if (segement instanceof ArrayAccessSegement) {
                return ((ArrayAccessSegement) segement).remove(this, obj2);
            }
            throw new UnsupportedOperationException();
        }
        PropertySegement propertySegement = (PropertySegement) segement;
        if ((obj2 instanceof Collection) && segementArr2.length > 1) {
            Segement segement2 = segementArr2[segementArr2.length - 2];
            if ((segement2 instanceof RangeSegement) || (segement2 instanceof MultiIndexSegement)) {
                Iterator it = ((Collection) obj2).iterator();
                while (it.hasNext()) {
                    if (propertySegement.remove(this, it.next())) {
                        z10 = true;
                    }
                }
                return z10;
            }
        }
        return propertySegement.remove(this, obj2);
    }

    public boolean removeArrayItem(JSONPath jSONPath, Object obj, int i10) {
        if (!(obj instanceof List)) {
            throw new JSONPathException("unsupported set operation." + obj.getClass());
        }
        List list = (List) obj;
        if (i10 >= 0) {
            if (i10 >= list.size()) {
                return false;
            }
            list.remove(i10);
            return true;
        }
        int size = list.size() + i10;
        if (size < 0) {
            return false;
        }
        list.remove(size);
        return true;
    }

    protected boolean removePropertyValue(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).remove(str) != null;
        }
        ObjectDeserializer deserializer = this.parserConfig.getDeserializer(obj.getClass());
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        if (javaBeanDeserializer == null) {
            throw new UnsupportedOperationException();
        }
        FieldDeserializer fieldDeserializer = javaBeanDeserializer.getFieldDeserializer(str);
        if (fieldDeserializer == null) {
            return false;
        }
        fieldDeserializer.setValue(obj, (String) null);
        return true;
    }

    public boolean set(Object obj, Object obj2) {
        return set(obj, obj2, true);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    public boolean set(Object obj, Object obj2, boolean z10) {
        Class<?> cls;
        JavaBeanDeserializer javaBeanDeserializer;
        if (obj == null) {
            return false;
        }
        init();
        Object obj3 = obj;
        int i10 = 0;
        Object obj4 = null;
        while (true) {
            Segement[] segementArr = this.segments;
            if (i10 >= segementArr.length) {
                obj3 = obj4;
                break;
            }
            Segement segement = segementArr[i10];
            Object objEval = segement.eval(this, obj, obj3);
            if (objEval == null) {
                Segement[] segementArr2 = this.segments;
                Segement segement2 = i10 < segementArr2.length - 1 ? segementArr2[i10 + 1] : null;
                if (segement2 instanceof PropertySegement) {
                    if (segement instanceof PropertySegement) {
                        String str = ((PropertySegement) segement).propertyName;
                        JavaBeanDeserializer javaBeanDeserializer2 = getJavaBeanDeserializer(obj3.getClass());
                        if (javaBeanDeserializer2 != null) {
                            cls = javaBeanDeserializer2.getFieldDeserializer(str).fieldInfo.fieldClass;
                            javaBeanDeserializer = getJavaBeanDeserializer(cls);
                        } else {
                            cls = null;
                            javaBeanDeserializer = null;
                        }
                    } else {
                        cls = null;
                        javaBeanDeserializer = null;
                    }
                    if (javaBeanDeserializer == null) {
                        objEval = new JSONObject();
                    } else {
                        if (javaBeanDeserializer.beanInfo.defaultConstructor == null) {
                            return false;
                        }
                        objEval = javaBeanDeserializer.createInstance((DefaultJSONParser) null, cls);
                    }
                } else {
                    objEval = segement2 instanceof ArrayAccessSegement ? new JSONArray() : null;
                }
                if (objEval != null) {
                    if (!(segement instanceof PropertySegement)) {
                        if (!(segement instanceof ArrayAccessSegement)) {
                            break;
                        }
                        ((ArrayAccessSegement) segement).setValue(this, obj3, objEval);
                    } else {
                        ((PropertySegement) segement).setValue(this, obj3, objEval);
                    }
                } else {
                    break;
                }
            }
            i10++;
            obj4 = obj3;
            obj3 = objEval;
        }
        if (obj3 == null) {
            return false;
        }
        Segement[] segementArr3 = this.segments;
        Segement segement3 = segementArr3[segementArr3.length - 1];
        if (segement3 instanceof PropertySegement) {
            ((PropertySegement) segement3).setValue(this, obj3, obj2);
            return true;
        }
        if (segement3 instanceof ArrayAccessSegement) {
            return ((ArrayAccessSegement) segement3).setValue(this, obj3, obj2);
        }
        throw new UnsupportedOperationException();
    }

    public boolean setArrayItem(JSONPath jSONPath, Object obj, int i10, Object obj2) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (i10 >= 0) {
                list.set(i10, obj2);
            } else {
                list.set(list.size() + i10, obj2);
            }
            return true;
        }
        Class<?> cls = obj.getClass();
        if (!cls.isArray()) {
            throw new JSONPathException("unsupported set operation." + cls);
        }
        int length = Array.getLength(obj);
        if (i10 >= 0) {
            if (i10 < length) {
                Array.set(obj, i10, obj2);
            }
        } else if (Math.abs(i10) <= length) {
            Array.set(obj, length + i10, obj2);
        }
        return true;
    }

    protected boolean setPropertyValue(Object obj, String str, long j10, Object obj2) {
        if (obj instanceof Map) {
            ((Map) obj).put(str, obj2);
            return true;
        }
        if (obj instanceof List) {
            for (Object obj3 : (List) obj) {
                if (obj3 != null) {
                    setPropertyValue(obj3, str, j10, obj2);
                }
            }
            return true;
        }
        ObjectDeserializer deserializer = this.parserConfig.getDeserializer(obj.getClass());
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        if (javaBeanDeserializer == null) {
            throw new UnsupportedOperationException();
        }
        FieldDeserializer fieldDeserializer = javaBeanDeserializer.getFieldDeserializer(j10);
        if (fieldDeserializer == null) {
            return false;
        }
        fieldDeserializer.setValue(obj, obj2);
        return true;
    }

    public int size(Object obj) {
        if (obj == null) {
            return -1;
        }
        init();
        int i10 = 0;
        Object objEval = obj;
        while (true) {
            Segement[] segementArr = this.segments;
            if (i10 >= segementArr.length) {
                return evalSize(objEval);
            }
            objEval = segementArr[i10].eval(this, obj, objEval);
            i10++;
        }
    }

    @Override // com.alibaba.fastjson.JSONAware
    public String toJSONString() {
        return JSON.toJSONString(this.path);
    }
}
