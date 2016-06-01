package se.dennisvonbargen.aircraftregistry

import se.dennisvonbargen.aircraftregistry.integration.impl.DefaultDAO

/**
 * Created by Dennis on 2016-06-01.
 */
fun main(args:Array<String>) {
    val reg: AircraftRegistry = AircraftRegistry(DefaultDAO)
    reg.run()
}