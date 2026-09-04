package androidx.profileinstaller;

/* JADX INFO: loaded from: classes6.dex */
public enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j10) {
        this.mValue = j10;
    }

    static FileSectionType fromValue(long j10) {
        FileSectionType[] fileSectionTypeArrValues = values();
        for (int i10 = 0; i10 < fileSectionTypeArrValues.length; i10++) {
            if (fileSectionTypeArrValues[i10].getValue() == j10) {
                return fileSectionTypeArrValues[i10];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j10);
    }

    public long getValue() {
        return this.mValue;
    }
}
