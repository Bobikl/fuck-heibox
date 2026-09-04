package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.meituan.robust.Constants;
import com.tencent.open.SocialConstants;
import com.vivo.push.PushClientConstants;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes5.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", Constants.LANG_BOOLEAN),
    CHAR(PrimitiveType.CHAR, Constants.CHAR, "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, Constants.BYTE, "B", Constants.LANG_BYTE),
    SHORT(PrimitiveType.SHORT, Constants.SHORT, androidx.exifinterface.media.a.R4, Constants.LANG_SHORT),
    INT(PrimitiveType.INT, Constants.INT, "I", Constants.LANG_INT),
    FLOAT(PrimitiveType.FLOAT, "float", "F", Constants.LANG_FLOAT),
    LONG(PrimitiveType.LONG, Constants.LONG, "J", Constants.LANG_LONG),
    DOUBLE(PrimitiveType.DOUBLE, Constants.DOUBLE, "D", Constants.LANG_DOUBLE);

    private final String desc;
    private final String name;
    private final PrimitiveType primitiveType;
    private final kotlin.reflect.jvm.internal.impl.name.c wrapperFqName;
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> WRAPPERS_CLASS_NAMES = new HashSet();
    private static final Map<String, JvmPrimitiveType> TYPE_BY_NAME = new HashMap();
    private static final Map<PrimitiveType, JvmPrimitiveType> TYPE_BY_PRIMITIVE_TYPE = new EnumMap(PrimitiveType.class);
    private static final Map<String, JvmPrimitiveType> TYPE_BY_DESC = new HashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void $$$reportNull$$$0(int i10) {
        String str;
        int i11;
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
                objArr[0] = "name";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 3:
                objArr[0] = "type";
                break;
            case 5:
            case 8:
                objArr[0] = SocialConstants.PARAM_APP_DESC;
                break;
            case 6:
                objArr[0] = "primitiveType";
                break;
            case 9:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = PushClientConstants.TAG_CLASS_NAME;
                break;
        }
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 11:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 12:
                    objArr[1] = "getDesc";
                    break;
                case 13:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i10) {
            case 1:
            case 3:
                objArr[2] = "get";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 5:
                objArr[2] = "getByDesc";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    static {
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            WRAPPERS_CLASS_NAMES.add(jvmPrimitiveType.getWrapperFqName());
            TYPE_BY_NAME.put(jvmPrimitiveType.getJavaKeywordName(), jvmPrimitiveType);
            TYPE_BY_PRIMITIVE_TYPE.put(jvmPrimitiveType.getPrimitiveType(), jvmPrimitiveType);
            TYPE_BY_DESC.put(jvmPrimitiveType.getDesc(), jvmPrimitiveType);
        }
    }

    JvmPrimitiveType(@dl.d PrimitiveType primitiveType, @dl.d String str, String str2, String str3) {
        if (primitiveType == null) {
            $$$reportNull$$$0(6);
        }
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        if (str2 == null) {
            $$$reportNull$$$0(8);
        }
        if (str3 == null) {
            $$$reportNull$$$0(9);
        }
        this.primitiveType = primitiveType;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new kotlin.reflect.jvm.internal.impl.name.c(str3);
    }

    @dl.d
    public static JvmPrimitiveType get(@dl.d String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        JvmPrimitiveType jvmPrimitiveType = TYPE_BY_NAME.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    @dl.d
    public static JvmPrimitiveType get(@dl.d PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(3);
        }
        JvmPrimitiveType jvmPrimitiveType = TYPE_BY_PRIMITIVE_TYPE.get(primitiveType);
        if (jvmPrimitiveType == null) {
            $$$reportNull$$$0(4);
        }
        return jvmPrimitiveType;
    }

    @dl.d
    public String getDesc() {
        String str = this.desc;
        if (str == null) {
            $$$reportNull$$$0(12);
        }
        return str;
    }

    @dl.d
    public String getJavaKeywordName() {
        String str = this.name;
        if (str == null) {
            $$$reportNull$$$0(11);
        }
        return str;
    }

    @dl.d
    public PrimitiveType getPrimitiveType() {
        PrimitiveType primitiveType = this.primitiveType;
        if (primitiveType == null) {
            $$$reportNull$$$0(10);
        }
        return primitiveType;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.c getWrapperFqName() {
        kotlin.reflect.jvm.internal.impl.name.c cVar = this.wrapperFqName;
        if (cVar == null) {
            $$$reportNull$$$0(13);
        }
        return cVar;
    }
}
