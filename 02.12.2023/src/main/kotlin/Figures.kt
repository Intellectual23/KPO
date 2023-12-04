import kotlin.math.PI

abstract class Figure(height: Double, baseSide: Double) {
    protected var _baseSide: Double = 0.0
    protected var _height: Double = 0.0
    abstract fun Volume(): Double
    abstract fun BaseArea(): Double
    abstract fun SideArea(): Double

    init {
        _baseSide = baseSide;
        _height = height;
    }
}

class Cube(height: Double, baseSide: Double) : Figure(height, baseSide) {
    override fun Volume(): Double {
        return _baseSide * _baseSide * _baseSide;
    }

    override fun BaseArea(): Double {
        return _baseSide * _baseSide;
    }

    override fun SideArea(): Double {
        return _baseSide * _baseSide;
    }
}

class Cone(height: Double, baseSide: Double) : Figure(height, baseSide) {
    override fun Volume(): Double {
        return BaseArea() * _height / 3;
    }

    override fun BaseArea(): Double {
        return PI * _baseSide * _baseSide / 4;
    }

    override fun SideArea(): Double {
        return _height * _baseSide / 2
    }
}

class Pyramid(height: Double, baseSide: Double) : Figure(height, baseSide) {
    override fun Volume(): Double {
        return BaseArea() * _height / 3;
    }

    override fun BaseArea(): Double {
        return _baseSide * _baseSide;
    }

    override fun SideArea(): Double {
        return _height * _baseSide * 1 / 2;
    }
}

fun main(args: Array<String>) {
    val figs: Array<Figure> = arrayOf(Cube(5.0, 5.0), Cone(5.0, 5.0), Pyramid(5.0, 5.0));
    for (figure in figs) {
        println("${figure.Volume()} ${figure.BaseArea()} ${figure.SideArea()} ");
    }
}