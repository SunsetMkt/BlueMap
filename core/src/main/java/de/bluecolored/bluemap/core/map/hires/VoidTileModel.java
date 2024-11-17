package de.bluecolored.bluemap.core.map.hires;

import de.bluecolored.bluemap.core.util.math.MatrixM3f;
import de.bluecolored.bluemap.core.util.math.MatrixM4f;

/**
 * An empty tile-model discarding any actions
 */
public class VoidTileModel implements TileModel {

    public static final TileModel INSTANCE = new VoidTileModel();

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int add(int count) {
        return 0;
    }

    @Override
    public TileModel setPositions(
            int face,
            float x1, float y1, float z1,
            float x2, float y2, float z2,
            float x3, float y3, float z3
    ) {
        return this;
    }

    @Override
    public TileModel setUvs(
            int face,
            float u1, float v1,
            float u2, float v2,
            float u3, float v3
    ) {
        return this;
    }

    @Override
    public TileModel setAOs(
            int face,
            float ao1, float ao2, float ao3
    ) {
        return this;
    }

    @Override
    public TileModel setColor(
            int face,
            float r, float g, float b
    ) {
        return this;
    }

    @Override
    public TileModel setSunlight(int face, int sl) {
        return this;
    }

    @Override
    public TileModel setBlocklight(int face, int bl) {
        return this;
    }

    @Override
    public TileModel setMaterialIndex(int face, int m) {
        return this;
    }

    @Override
    public TileModel rotate(
            int start, int count,
            float angle,
            float axisX, float axisY, float axisZ
    ) {
        return this;
    }

    @Override
    public TileModel rotate(
            int start, int count,
            float pitch, float yaw, float roll
    ) {
        return this;
    }

    @Override
    public TileModel rotateByQuaternion(
            int start, int count,
            double qx, double qy, double qz, double qw
    ) {
        return this;
    }

    @Override
    public TileModel scale(
            int start, int count,
            float sx, float sy, float sz
    ) {
        return this;
    }

    @Override
    public TileModel translate(
            int start, int count,
            float dx, float dy, float dz
    ) {
        return this;
    }

    @Override
    public TileModel transform(int start, int count, MatrixM3f t) {
        return this;
    }

    @Override
    public TileModel transform(
            int start, int count,
            float m00, float m01, float m02,
            float m10, float m11, float m12,
            float m20, float m21, float m22
    ) {
        return this;
    }

    @Override
    public TileModel transform(int start, int count, MatrixM4f t) {
        return this;
    }

    @Override
    public TileModel transform(
            int start, int count,
            float m00, float m01, float m02, float m03,
            float m10, float m11, float m12, float m13,
            float m20, float m21, float m22, float m23,
            float m30, float m31, float m32, float m33
    ) {
        return this;
    }

    @Override
    public TileModel reset(int size) {
        return this;
    }

    @Override
    public TileModel clear() {
        return this;
    }

    @Override
    public void sort() { }

}
