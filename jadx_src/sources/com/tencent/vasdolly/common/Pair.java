package com.tencent.vasdolly.common;

/* JADX INFO: loaded from: classes4.dex */
public final class Pair<A, B> {
    private final A mFirst;
    private final B mSecond;

    private Pair(A a10, B b10) {
        this.mFirst = a10;
        this.mSecond = b10;
    }

    public static <A, B> Pair<A, B> create(A a10, B b10) {
        return new Pair<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Pair.class != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        A a10 = this.mFirst;
        if (a10 == null) {
            if (pair.mFirst != null) {
                return false;
            }
        } else if (!a10.equals(pair.mFirst)) {
            return false;
        }
        B b10 = this.mSecond;
        if (b10 == null) {
            if (pair.mSecond != null) {
                return false;
            }
        } else if (!b10.equals(pair.mSecond)) {
            return false;
        }
        return true;
    }

    public A getFirst() {
        return this.mFirst;
    }

    public B getSecond() {
        return this.mSecond;
    }

    public int hashCode() {
        A a10 = this.mFirst;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.mSecond;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return "first = " + this.mFirst + " , second = " + this.mSecond;
    }
}
