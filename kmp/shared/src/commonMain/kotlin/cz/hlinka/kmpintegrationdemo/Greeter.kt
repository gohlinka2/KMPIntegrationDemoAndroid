package cz.hlinka.kmpintegrationdemo

class Greeter {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello KMP from Android and iOS!"
    }
}