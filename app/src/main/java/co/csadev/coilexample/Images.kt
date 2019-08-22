package com.pandora.samples.imaging

private const val baseImageUrl = "https://homepages.cae.wisc.edu/~ece533/images/"

@Suppress("unused")
enum class Images(private val fileName: String) {
    Airplane("airplane.png"),
    Architecture("arctichare.png"),
    Baboon("baboon.png"),
    BarbaraBmp("barbara.bmp"),
    BarbaraPng("barbara.png"),
    Boat("boat.png"),
    BoyBmp("boy.bmp"),
    BoyPpm("boy.ppm"),
    Cameraman("cameraman.tif"),
    Cat("cat.png"),
    FPrint3("fprint3.pgm"),
    Fruits("fruits.png"),
    Frymire("frymire.png"),
    Girl("girl.png"),
    GoldhillBmp("goldhill.bmp"),
    GoldhillPng("goldhill.png"),
    LenaBmp("lena.bmp"),
    Lenacolor("lenacolor.png"),
    LenaPpm("lena.ppm"),
    Lenaclor("Lenaclor.ppm"),
    Monarch("monarch.png"),
    MountainPng("mountain.png"),
    MountainBmp("mountain.bmp"),
    Peppers("peppers.png"),
    Pool("pool.png"),
    SailsBmp("sails.bmp"),
    SailsPng("sails.png"),
    Serrano("serrano.png"),
    Tulips("tulips.png"),
    Us021("us021.pgm"),
    Us092("us092.pgm"),
    Watch("watch.png"),
    Zelda("zelda.png");

    val url: String
        get() = baseImageUrl + fileName
}
