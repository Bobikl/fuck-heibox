package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b0;
import kotlin.collections.r0;

/* JADX INFO: compiled from: CharDirectionality.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);

    private final int value;

    @dl.d
    public static final a Companion = new a(null);

    @dl.d
    private static final kotlin.z<Map<Integer, CharDirectionality>> directionalityMap$delegate = b0.c(new yh.a<Map<Integer, ? extends CharDirectionality>>() { // from class: kotlin.text.CharDirectionality$Companion$directionalityMap$2
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<Integer, CharDirectionality> invoke() {
            CharDirectionality[] charDirectionalityArrValues = CharDirectionality.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(charDirectionalityArrValues.length), 16));
            for (CharDirectionality charDirectionality : charDirectionalityArrValues) {
                linkedHashMap.put(Integer.valueOf(charDirectionality.getValue()), charDirectionality);
            }
            return linkedHashMap;
        }
    });

    /* JADX INFO: compiled from: CharDirectionality.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final Map<Integer, CharDirectionality> a() {
            return (Map) CharDirectionality.directionalityMap$delegate.getValue();
        }

        @dl.d
        public final CharDirectionality b(int i10) {
            CharDirectionality charDirectionality = a().get(Integer.valueOf(i10));
            if (charDirectionality != null) {
                return charDirectionality;
            }
            throw new IllegalArgumentException("Directionality #" + i10 + " is not defined.");
        }
    }

    CharDirectionality(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
