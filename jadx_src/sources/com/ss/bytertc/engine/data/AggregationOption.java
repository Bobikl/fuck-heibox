package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public enum AggregationOption {
    MIN(0),
    MAX(1),
    MAJORITY(2);

    private int value;

    AggregationOption(int i10) {
        this.value = i10;
    }

    @Override // java.lang.Enum
    public String toString() {
        if (this == MIN) {
            return "AggregationOptionMin";
        }
        if (this == MAX) {
            return "AggregationOptionMax";
        }
        return this == MAJORITY ? "AggregationOptionMajority" : "AggregationOptionMin";
    }

    public int value() {
        return this.value;
    }
}
