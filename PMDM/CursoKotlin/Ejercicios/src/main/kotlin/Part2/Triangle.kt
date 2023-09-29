import Part2.Figure

class Triangle(val base: Float, val height: Float): Figure {
    override fun getArea(): Float {
        return (base * height) / 2;
    }

    override fun getPerimeter(): Float {
        return base * 3;
    }

}