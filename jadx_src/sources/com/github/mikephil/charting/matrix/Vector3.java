package com.github.mikephil.charting.matrix;

/* JADX INFO: loaded from: classes6.dex */
public final class Vector3 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f43138x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f43139y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f43140z;
    public static final Vector3 ZERO = new Vector3(0.0f, 0.0f, 0.0f);
    public static final Vector3 UNIT_X = new Vector3(1.0f, 0.0f, 0.0f);
    public static final Vector3 UNIT_Y = new Vector3(0.0f, 1.0f, 0.0f);
    public static final Vector3 UNIT_Z = new Vector3(0.0f, 0.0f, 1.0f);

    public Vector3() {
    }

    public Vector3(float f10, float f11, float f12) {
        set(f10, f11, f12);
    }

    public Vector3(Vector3 vector3) {
        set(vector3);
    }

    public Vector3(float[] fArr) {
        set(fArr[0], fArr[1], fArr[2]);
    }

    public final void add(float f10, float f11, float f12) {
        this.f43138x += f10;
        this.f43139y += f11;
        this.f43140z += f12;
    }

    public final void add(Vector3 vector3) {
        this.f43138x += vector3.f43138x;
        this.f43139y += vector3.f43139y;
        this.f43140z += vector3.f43140z;
    }

    public final Vector3 cross(Vector3 vector3) {
        float f10 = this.f43139y;
        float f11 = vector3.f43140z;
        float f12 = this.f43140z;
        float f13 = vector3.f43139y;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = vector3.f43138x;
        float f16 = this.f43138x;
        return new Vector3(f14, (f12 * f15) - (f11 * f16), (f16 * f13) - (f10 * f15));
    }

    public final float distance2(Vector3 vector3) {
        float f10 = this.f43138x - vector3.f43138x;
        float f11 = this.f43139y - vector3.f43139y;
        float f12 = this.f43140z - vector3.f43140z;
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    public final void divide(float f10) {
        if (f10 != 0.0f) {
            this.f43138x /= f10;
            this.f43139y /= f10;
            this.f43140z /= f10;
        }
    }

    public final float dot(Vector3 vector3) {
        return (this.f43138x * vector3.f43138x) + (this.f43139y * vector3.f43139y) + (this.f43140z * vector3.f43140z);
    }

    public final float length() {
        return (float) Math.sqrt(length2());
    }

    public final float length2() {
        float f10 = this.f43138x;
        float f11 = this.f43139y;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = this.f43140z;
        return f12 + (f13 * f13);
    }

    public final void multiply(float f10) {
        this.f43138x *= f10;
        this.f43139y *= f10;
        this.f43140z *= f10;
    }

    public final void multiply(Vector3 vector3) {
        this.f43138x *= vector3.f43138x;
        this.f43139y *= vector3.f43139y;
        this.f43140z *= vector3.f43140z;
    }

    public final float normalize() {
        float length = length();
        if (length != 0.0f) {
            this.f43138x /= length;
            this.f43139y /= length;
            this.f43140z /= length;
        }
        return length;
    }

    public final boolean pointsInSameDirection(Vector3 vector3) {
        return dot(vector3) > 0.0f;
    }

    public final void set(float f10, float f11, float f12) {
        this.f43138x = f10;
        this.f43139y = f11;
        this.f43140z = f12;
    }

    public final void set(Vector3 vector3) {
        this.f43138x = vector3.f43138x;
        this.f43139y = vector3.f43139y;
        this.f43140z = vector3.f43140z;
    }

    public final void subtract(Vector3 vector3) {
        this.f43138x -= vector3.f43138x;
        this.f43139y -= vector3.f43139y;
        this.f43140z -= vector3.f43140z;
    }

    public final void subtractMultiple(Vector3 vector3, float f10) {
        this.f43138x -= vector3.f43138x * f10;
        this.f43139y -= vector3.f43139y * f10;
        this.f43140z -= vector3.f43140z * f10;
    }

    public final void zero() {
        set(0.0f, 0.0f, 0.0f);
    }
}
