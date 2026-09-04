package com.alibaba.fastjson.parser;

/* JADX INFO: loaded from: classes6.dex */
public enum Feature {
    AutoCloseSource,
    AllowComment,
    AllowUnQuotedFieldNames,
    AllowSingleQuotes,
    InternFieldNames,
    AllowISO8601DateFormat,
    AllowArbitraryCommas,
    UseBigDecimal,
    IgnoreNotMatch,
    SortFeidFastMatch,
    DisableASM,
    DisableCircularReferenceDetect,
    InitStringFieldAsEmpty,
    SupportArrayToBean,
    OrderedField,
    DisableSpecialKeyDetect,
    UseObjectArray,
    SupportNonPublicField,
    IgnoreAutoType,
    DisableFieldSmartMatch,
    SupportAutoType,
    NonStringKeyAsString,
    CustomMapDeserializer;

    public final int mask = 1 << ordinal();

    Feature() {
    }

    public static int config(int i10, Feature feature, boolean z10) {
        return z10 ? i10 | feature.mask : i10 & (~feature.mask);
    }

    public static boolean isEnabled(int i10, Feature feature) {
        return (i10 & feature.mask) != 0;
    }

    public static int of(Feature[] featureArr) {
        if (featureArr == null) {
            return 0;
        }
        int i10 = 0;
        for (Feature feature : featureArr) {
            i10 |= feature.mask;
        }
        return i10;
    }

    public final int getMask() {
        return this.mask;
    }
}
