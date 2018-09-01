package io.github.shadowcreative.chadow.util

import java.util.logging.Logger

class RuskitLogger : Logger("Ruskit", "RuskitBundle")
{
    companion object
    {
        var DefaultLogger : RuskitLogger? = null
    }

    enum class Level
    {
        INFO,
        WARNING,
        DANGER,
        SYSTEM,
        MESSAGE
    }
}