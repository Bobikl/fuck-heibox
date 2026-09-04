package com.google.common.base;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOWER_UNDERSCORE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public abstract class CaseFormat {
    private static final /* synthetic */ CaseFormat[] $VALUES;
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN = new CaseFormat("LOWER_HYPHEN", 0, b.q('-'), Constants.ACCEPT_TIME_SEPARATOR_SERVER) { // from class: com.google.common.base.CaseFormat.1
        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            return caseFormat == CaseFormat.UPPER_UNDERSCORE ? a.j(str.replace('-', '_')) : super.convert(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return a.g(str);
        }
    };
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final b wordBoundary;
    private final String wordSeparator;

    public static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CaseFormat f56585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final CaseFormat f56586e;

        StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.f56585d = (CaseFormat) w.E(caseFormat);
            this.f56586e = (CaseFormat) w.E(caseFormat2);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof StringConverter)) {
                return false;
            }
            StringConverter stringConverter = (StringConverter) obj;
            return this.f56585d.equals(stringConverter.f56585d) && this.f56586e.equals(stringConverter.f56586e);
        }

        public int hashCode() {
            return this.f56585d.hashCode() ^ this.f56586e.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(String str) {
            return this.f56586e.to(this.f56585d, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public String i(String str) {
            return this.f56585d.to(this.f56586e, str);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f56585d);
            String strValueOf2 = String.valueOf(this.f56586e);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(".converterTo(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static /* synthetic */ CaseFormat[] $values() {
        return new CaseFormat[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    static {
        b bVarQ = b.q('_');
        String str = lg.a.f131412e;
        LOWER_UNDERSCORE = new CaseFormat("LOWER_UNDERSCORE", 1, bVarQ, str) { // from class: com.google.common.base.CaseFormat.2
            @Override // com.google.common.base.CaseFormat
            String convert(CaseFormat caseFormat, String str2) {
                if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                    return str2.replace('_', '-');
                }
                return caseFormat == CaseFormat.UPPER_UNDERSCORE ? a.j(str2) : super.convert(caseFormat, str2);
            }

            @Override // com.google.common.base.CaseFormat
            String normalizeWord(String str2) {
                return a.g(str2);
            }
        };
        String str2 = "";
        LOWER_CAMEL = new CaseFormat("LOWER_CAMEL", 2, b.m('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.3
            @Override // com.google.common.base.CaseFormat
            String normalizeFirstWord(String str3) {
                return a.g(str3);
            }

            @Override // com.google.common.base.CaseFormat
            String normalizeWord(String str3) {
                return CaseFormat.firstCharOnlyToUpper(str3);
            }
        };
        UPPER_CAMEL = new CaseFormat("UPPER_CAMEL", 3, b.m('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.4
            @Override // com.google.common.base.CaseFormat
            String normalizeWord(String str3) {
                return CaseFormat.firstCharOnlyToUpper(str3);
            }
        };
        UPPER_UNDERSCORE = new CaseFormat("UPPER_UNDERSCORE", 4, b.q('_'), str) { // from class: com.google.common.base.CaseFormat.5
            @Override // com.google.common.base.CaseFormat
            String convert(CaseFormat caseFormat, String str3) {
                if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                    return a.g(str3.replace('_', '-'));
                }
                return caseFormat == CaseFormat.LOWER_UNDERSCORE ? a.g(str3) : super.convert(caseFormat, str3);
            }

            @Override // com.google.common.base.CaseFormat
            String normalizeWord(String str3) {
                return a.j(str3);
            }
        };
        $VALUES = $values();
    }

    private CaseFormat(String str, int i10, b bVar, String str2) {
        super(str, i10);
        this.wordBoundary = bVar;
        this.wordSeparator = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char cH = a.h(str.charAt(0));
        String strG = a.g(str.substring(1));
        StringBuilder sb2 = new StringBuilder(String.valueOf(strG).length() + 1);
        sb2.append(cH);
        sb2.append(strG);
        return sb2.toString();
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }

    String convert(CaseFormat caseFormat, String str) {
        StringBuilder sb2 = null;
        int length = 0;
        int iO = -1;
        while (true) {
            iO = this.wordBoundary.o(str, iO + 1);
            if (iO == -1) {
                break;
            }
            if (length == 0) {
                sb2 = new StringBuilder(str.length() + (caseFormat.wordSeparator.length() * 4));
                sb2.append(caseFormat.normalizeFirstWord(str.substring(length, iO)));
            } else {
                Objects.requireNonNull(sb2);
                sb2.append(caseFormat.normalizeWord(str.substring(length, iO)));
            }
            sb2.append(caseFormat.wordSeparator);
            length = this.wordSeparator.length() + iO;
        }
        if (length == 0) {
            return caseFormat.normalizeFirstWord(str);
        }
        Objects.requireNonNull(sb2);
        sb2.append(caseFormat.normalizeWord(str.substring(length)));
        return sb2.toString();
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
        return new StringConverter(this, caseFormat);
    }

    String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    abstract String normalizeWord(String str);

    public final String to(CaseFormat caseFormat, String str) {
        w.E(caseFormat);
        w.E(str);
        return caseFormat == this ? str : convert(caseFormat, str);
    }
}
