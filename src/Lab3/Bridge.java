package Lab3;

public class Bridge {
    private final Double height;
    private final String material;
    private final Double width;

    public Bridge(Double height, Double width, BridgeMaterials material) {
        this.material = material.getMaterial();
        this.height = height;
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass())
            return false;
        Bridge otherObj = (Bridge) obj;
        return (height.equals(otherObj.height))
                && ((material.equals(otherObj.material))
                && (width.equals(otherObj.width)));
    }

    public int hashCode() {
        return 31 * this.height.hashCode()
                + 31 * this.material.hashCode()
                + 31 * this.width.hashCode();
    }

    public String toString() {
        return getClass().getName()
                + "[height=" + height
                + ";width=" + width
                + ";material=" + material
                + "]";
    }
}
